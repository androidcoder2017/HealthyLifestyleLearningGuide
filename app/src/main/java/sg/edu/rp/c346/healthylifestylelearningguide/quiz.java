package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
    Button btnBasic;
    Button btnAdvanced;
    TextView tvNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final MediaPlayer clickSound = MediaPlayer.create(this, R.raw.click2);
        btnBasic = (Button)findViewById(R.id.buttonBasic);
        btnAdvanced = (Button)findViewById(R.id.buttonAdvanced);
        tvNote = (TextView)findViewById(R.id.textViewNote);
        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(quiz.this);
                alertDialog.setTitle("Proceeding");
                alertDialog.setMessage("There are 10 MCQ questions. Good Luck!");
                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), basicQuiz.class);
                        startActivity(intent);
                    }
                });
                alertDialog.setNeutralButton("Cancel",null);
                alertDialog.show();
            }
        });

        btnAdvanced.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickSound.start();
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(quiz.this);
                    alertDialog.setTitle("Proceeding");
                    alertDialog.setMessage("There are 15 MCQ questions. You have 1 min and 30 sec to do the quiz. Good Luck!");
                    alertDialog.setCancelable(false);
                    alertDialog.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), advancedQuiz.class);
                            startActivity(intent);
                        }
                    });
                    alertDialog.setNeutralButton("Cancel",null);
                    alertDialog.show();
                }
        });

        tvNote.setText(Html.fromHtml("Note: <br/><p> You can always attempt the quiz to deepen your understanding on leading a healthy" +
                "lifestyle. All this is to serve as part of your knowledge to stay healthy and happy.</p>"));

    }

}
