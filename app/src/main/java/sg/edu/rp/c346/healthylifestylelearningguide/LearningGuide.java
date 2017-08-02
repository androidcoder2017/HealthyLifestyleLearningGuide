package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearningGuide extends AppCompatActivity {

    Button btnExercise;
    Button btnTime;
    Button btnEating;
    Button btnStress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_guide);

        final MediaPlayer eatingSound = MediaPlayer.create(this, R.raw.eating);
        final MediaPlayer exerciseSound = MediaPlayer.create(this, R.raw.click2);
        final MediaPlayer clockSound = MediaPlayer.create(this, R.raw.clock);
        final MediaPlayer panicSound = MediaPlayer.create(this, R.raw.panic);

        btnExercise = (Button)findViewById(R.id.buttonExercise);
        btnTime = (Button)findViewById(R.id.buttonTime);
        btnEating = (Button)findViewById(R.id.buttonEating);
        btnStress = (Button)findViewById(R.id.buttonStress);

        btnExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exerciseSound.start();
                Intent intent = new Intent(getApplicationContext(), exercise.class);
                startActivity(intent);
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clockSound.start();
                Intent intent = new Intent(getApplicationContext(), TimeManagement.class);
                startActivity(intent);
            }
        });

        btnEating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eatingSound.start();
                Intent intent = new Intent(getApplicationContext(), EatingHabits.class);
                startActivity(intent);
            }
        });

        btnStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panicSound.start();
                Intent intent = new Intent(getApplicationContext(), StressManagement.class);
                startActivity(intent);
            }
        });
    }
}
