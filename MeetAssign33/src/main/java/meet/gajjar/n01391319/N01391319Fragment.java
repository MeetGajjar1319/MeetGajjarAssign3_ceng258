//  Section C Meet Gajjar N01391319
package meet.gajjar.n01391319;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class N01391319Fragment extends Fragment {

    TextView txtanimation,txtanimation2;
    Button start_animation,stop_animation;
    Animation rotate_animation;
    ImageView image1,image2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_n01391319, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtanimation = view.findViewById(R.id.meettv);
        txtanimation2 = view.findViewById(R.id.lastname);
        start_animation = view.findViewById(R.id.startBtn);
        stop_animation = view.findViewById(R.id.stopBtn);
        image1 = view.findViewById(R.id.earth);
        image2 = view.findViewById(R.id.moon);




        start_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateAnimation();
                startAnimation();

            }
        });

        stop_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAnimation();

            }
        });
    }
    public void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_1);
        image2.startAnimation(animation);
    }


    public void stopAnimation(){
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_1);
        image2.clearAnimation();
        image1.clearAnimation();
    }

    private void rotateAnimation(){
        rotate_animation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate_11);
        image1.startAnimation(rotate_animation);
    }
}