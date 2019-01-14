/*
 * Copyright (C) 2017 The Dirty Unicorns Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.serein.extras;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.android.internal.logging.nano.MetricsProto;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

import com.serein.extras.navigation.BottomNavigationViewCustom;
import com.serein.extras.tabs.Lockscreen;
import com.serein.extras.tabs.Multitasking;
import com.serein.extras.tabs.Actions;
import com.serein.extras.tabs.Statusbar;
import com.serein.extras.tabs.System;

import com.serein.extras.viewpager.*

public class SereinExtras extends SettingsPreferenceFragment {

    public SereinExtras() {
    }

    int baseElevation = 1;
    int raisingElevation = 1;
    float smallerScale = 1;

    int viewPagerPadding = 1;

    Point screen = new Point();

    float startOffset = (float)(viewPagerPadding)/(float)(screen.x - 2*viewPagerPadding);
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private ArrayList<ViewPagerContainer> mContents;
	
    MenuItem menuitem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sereinextras, container, false);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mContents = new ArrayList<>();

        int bg[] = {R.drawable.one, R.drawable.two, R.drawable.three};
        String cat[] = {"Statusbar", "Recents", "System"};

        for (int i = 0; i < bg.length; i++) {
            ViewPagerContainer viewpagercontainer = new ViewPagerContainer();

            viewpagercontainer.bg = bg[i];
            viewpagercontainer.cat = cat[i];

            mContents.add(viewpagercontainer);
        }

        mViewPagerAdapter = new ViewPagerAdapter(mContents, this);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setPageTransformer(true, new CardsPagerTransformerShift(baseElevation, raisingElevation, smallerScale, startOffset));
        mViewPager.setAdapter(mViewPagerAdapter);
		

        setHasOptionsMenu(true);

        return view;
    }

    class PagerAdapter extends FragmentPagerAdapter {

        private List<ViewPagerContainer> contents;
        private Context mContext;

        public ViewPagerAdapter(List<ViewPagerContainer> contents, Context mContext) {
            this.contents = contents;
            this.mContext = mContext;
        }
		
        public PagerAdapter(FragmentManager fm) {
            super(fm);
            frags[0] = new System();
            frags[1] = new Lockscreen();
            frags[2] = new Statusbar();
            frags[3] = new Actions();
            //frags[4] = new Multitasking();
        }
		
        @Override
        public Fragment getItem(int position) {
            return frags[position];
        }

        @Override
        public int getCount() {
            return contents.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == (CardView)o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = inflater.inflate(R.layout.pager_contents, container, false);

            container.addView(view);

            ImageView imageview = (ImageView)view.findViewById(R.id.bg);
            imageview.setImageResource((contents.get(position).getBg()));

            TextView cat = (TextView) view.findViewById(R.id.category);
            cat.setText(contents.get(position).getCat());

            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            super.destroyItem(container, position, object);

            container.removeView((View)object);
        }
    }
	
    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.SEREINEXTRAS;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.add(0, 0, 0, R.string.dialog_team_title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                final TeamFragment dialog = new TeamFragment();
                showDialog(this, dialog);
                return true;
            default:
                return false;
        }
    }

    public static void showDialog(Fragment context, DialogFragment dialog) {
        FragmentTransaction ft = context.getChildFragmentManager().beginTransaction();
        Fragment prev = context.getChildFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        dialog.show(ft, "dialog");
    }
}
