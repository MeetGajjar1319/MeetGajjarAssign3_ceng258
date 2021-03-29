package meet.gajjar.n01391319;
//  Section C Meet Gajjar N01391319

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MeetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.meettv);
        MeetFragment meetFragment = new MeetFragment();
        GajjarFragment gajjarFragment = new GajjarFragment();
        N01391319Fragment N01391319Fragment = new N01391319Fragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.meet_tab1){
                    setFragment(meetFragment);
                    getSupportActionBar().setTitle("Tab1  Meet Gajjar N01391319");
                    return true;
                } else if (id == R.id.meet_tab2){
                    setFragment(gajjarFragment);
                    getSupportActionBar().setTitle("Tab2  Meet Gajjar N01391319");
                    return true;
                } else if(id == R.id.meet_tab3){
                    setFragment(N01391319Fragment);
                    getSupportActionBar().setTitle("Tab3  Meet Gajjar N01391319");
                    return true;
                }
                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.meet_tab1);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.builder_exit)
                .setCancelable(false)
                .setPositiveButton(R.string.yes1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MeetActivity.super.onBackPressed();
                    }
                })

                .setNegativeButton(R.string.no1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.meet_frame, fragment);
        fragmentTransaction.commit();

    }
}
