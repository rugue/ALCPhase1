package com.ruguethedeveloper.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Initialize the ButtonViews
    Button AboutALC, MyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting reference to the button
        AboutALC = findViewById(R.id.about_alc);
        MyProfile = findViewById(R.id.my_profile);
    }

    //Switch statements which selects either button pressed
    public void nextActivity(View view) {

        switch (view.getId()){
            case R.id.about_alc:
                openAbout();
                break;
            case R.id.my_profile:
                openMyProfile();
        }
    }

    //Opens MyProfile Activity
    private void openMyProfile() {
        Intent intent = new Intent(this, ScrollingProfile.class);
        startActivity(intent);
    }

    //Opens AboutALC Activity
    private void openAbout() {
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }
}
