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

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.FrameLayout;

public class TeamFragment extends DialogFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final ViewGroup nullParent = null;
        View view = null;
        if (inflater != null) {
            view = inflater.inflate(R.layout.teamdialog, nullParent);
        }
        alertDialogBuilder.setView(view);
        alertDialogBuilder.setCancelable(false);
        final AlertDialog dialog = alertDialogBuilder.create();
        dialog.show();

        FrameLayout myron = null;
        if (view != null) {
            myron = view.findViewById(R.id.myron);
        }
        if (myron != null) {
            myron.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_myron, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout myron_img = null;
                    if (view1 != null) {
                          myron_img = view1.findViewById(R.id.myron_img);
                         setTeamMember("xxjoker03xx", myron_img);
                    }
                }
           });
        }

        FrameLayout oveno = null;
        if (view != null) {
            oveno = view.findViewById(R.id.oveno);
        }
        if (oveno != null) {
            oveno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_oveno, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout oveno_img = null;
                    if (view1 != null) {
                        oveno_img = view1.findViewById(R.id.oveno_img);
                        setTeamMember("ovenoboyo", oveno_img);
                    }
                }
           });
        }

        FrameLayout amulya = null;
        if (view != null) {
            amulya = view.findViewById(R.id.amulya);
        }
        if (amulya != null) {
            amulya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_amulya, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout amulya_img = null;
                    if (view1 != null) {
                        amulya_img = view1.findViewById(R.id.amulya_img);
                        setTeamMember("AmulyaX", amulya_img);
                    }
                }
           });
        }

        FrameLayout batman = null;
        if (view != null) {
            batman = view.findViewById(R.id.batman);
        }
        if (batman != null) {
            batman.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_batman, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout batman_img = null;
                    if (view1 != null) {
                        batman_img = view1.findViewById(R.id.batman_img);
                        setTeamMember("Void_Aspect", batman_img);
                    }
                }
           });
        }

        FrameLayout dark = null;
        if (view != null) {
            dark = view.findViewById(R.id.dark);
        }
        if (dark != null) {
            dark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_dark, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout dark_img = null;
                    if (view1 != null) {
                        dark_img = view1.findViewById(R.id.dark_img);
                        setTeamMember("f_rost", dark_img);
                    }
                }
           });
        }

        FrameLayout nikhil = null;
        if (view != null) {
            nikhil = view.findViewById(R.id.nikhil);
        }
        if (nikhil != null) {
            nikhil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_nikhil, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout nikhil_img = null;
                    if (view1 != null) {
                        nikhil_img = view1.findViewById(R.id.nikhil_img);
                        setTeamMember("im_nikhil", nikhil_img);
                    }
                }
           });
        }
		
        FrameLayout rasheed = null;
        if (view != null) {
            rasheed = view.findViewById(R.id.rasheed);
        }
        if (rasheed != null) {
            rasheed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_rasheed, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout rasheed_img = null;
                    if (view1 != null) {
                        rasheed_img = view1.findViewById(R.id.rasheed_img);
                        setTeamMember("RasheedSahaji", rasheed_img);
                    }
                }
           });
        }
		
        FrameLayout sushant = null;
        if (view != null) {
            sushant = view.findViewById(R.id.sushant);
        }
        if (sushant != null) {
            sushant.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_sushant, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout rasheed_img = null;
                    if (view1 != null) {
                        rasheed_img = view1.findViewById(R.id.sushant_img);
                        setTeamMember("Erlichbachman_Eh", sushant_img);
                    }
                }
           });
        }
		
        FrameLayout pranavaryans = null;
        if (view != null) {
            pranavaryans = view.findViewById(R.id.pranavaryans);
        }
        if (pranavaryans != null) {
            pranavaryans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                    View view1 = null;
                    LayoutInflater inflater1 = (LayoutInflater) getContext()
                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    if (inflater != null) {
                        view1 = inflater1.inflate(R.layout.teaminfo_pranavaryans, nullParent);
                    }

                    alert.setView(view1);
                    alert.setCancelable(true);
                    AlertDialog alertdialog = alert.create();
                    alertdialog.show();

                    LinearLayout pranavaryans_img = null;
                    if (view1 != null) {
                        pranavaryans_img = view1.findViewById(R.id.sushant_img);
                        setTeamMember("Erlichbachman_Eh", pranavaryans_img);
                    }
                }
           });
        }
        dialog.show();

        return dialog;
    }

    private void setTeamMember(final String tg, final LinearLayout name) {
        if (name != null) {
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://t.me/" + tg));
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public void onDestroyView() {
        if(getDialog()!=null && getRetainInstance()) {
            getDialog().setDismissMessage(null);

        }
        super.onDestroyView();
    }
}
