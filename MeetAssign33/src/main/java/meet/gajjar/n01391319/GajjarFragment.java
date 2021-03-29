//  Section C Meet Gajjar N01391319
package meet.gajjar.n01391319;
import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class GajjarFragment extends Fragment {
    Button btn, start_btn,stop_btn;
    ImageView image;
    RadioGroup rg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(meet.gajjar.n01391319.R.layout.fragment_gajjar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn = view.findViewById(R.id.meettv);

        start_btn = view.findViewById(R.id.startBtn);
        stop_btn = view.findViewById(R.id.stopBtn);
        image = view.findViewById(R.id.img1);
        rg = view.findViewById(R.id.meet_radiobtn);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rg.getCheckedRadioButtonId();
                BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.p1);
                BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.p2);
                BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.p3);
                BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.p4);
                BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.p5);
                BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.p6);
                BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.p7);
                BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.p8);
                BitmapDrawable frame9 = (BitmapDrawable)getResources().getDrawable(R.drawable.p9);
                BitmapDrawable frame10 = (BitmapDrawable)getResources().getDrawable(R.drawable.p10);
                final AnimationDrawable ad = new AnimationDrawable();
                switch (id) {
                    case R.id.speed1:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 600);
                        ad.addFrame(frame2, 600);
                        ad.addFrame(frame3, 600);
                        ad.addFrame(frame4, 600);
                        ad.addFrame(frame5, 600);
                        ad.addFrame(frame6, 600);
                        ad.addFrame(frame7, 600);
                        ad.addFrame(frame8, 600);
                        ad.addFrame(frame9, 600);
                        ad.addFrame(frame10, 600);

                        image.setImageDrawable(ad);
                        start_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();

                            }
                        });
                        break;

                    case R.id.speed2:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 350);
                        ad.addFrame(frame2, 350);
                        ad.addFrame(frame3, 350);
                        ad.addFrame(frame4, 350);
                        ad.addFrame(frame5, 350);
                        ad.addFrame(frame6, 350);
                        ad.addFrame(frame7, 350);
                        ad.addFrame(frame8, 350);
                        ad.addFrame(frame9, 350);
                        ad.addFrame(frame10, 350);

                        image.setImageDrawable(ad);
                        start_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();
                            }
                        });
                        break;

                    case R.id.speed3:
                        ;
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 150);
                        ad.addFrame(frame2, 150);
                        ad.addFrame(frame3, 150);
                        ad.addFrame(frame4, 150);
                        ad.addFrame(frame5, 150);
                        ad.addFrame(frame6, 150);
                        ad.addFrame(frame7, 150);
                        ad.addFrame(frame8, 150);
                        ad.addFrame(frame9, 150);
                        ad.addFrame(frame10, 150);

                        image.setImageDrawable(ad);
                        start_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();
                            }
                        });
                        break;

                    case R.id.speed4:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 50);
                        ad.addFrame(frame2, 50);
                        ad.addFrame(frame3, 50);
                        ad.addFrame(frame4, 50);
                        ad.addFrame(frame5, 50);
                        ad.addFrame(frame6, 50);
                        ad.addFrame(frame7, 50);
                        ad.addFrame(frame8, 50);
                        ad.addFrame(frame9, 50);
                        ad.addFrame(frame10, 50);

                        image.setImageDrawable(ad);
                        start_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();

                            }
                        });
                        break;
                    default:
                        break;
                }

                stop_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ad.stop();
                    }
                });

            }
        });
    }



    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(" Permissions");
        builder.setMessage("This app needs permission ");
        builder.setPositiveButton("GO TO THE SETTINGS", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }

            private String getPackageName() {
                return null;
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        builder.show();
    }



}
