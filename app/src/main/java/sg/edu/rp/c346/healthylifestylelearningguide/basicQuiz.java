package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class basicQuiz extends AppCompatActivity {

    private BasicQuestion1 nBasicQuestion = new BasicQuestion1();

    private TextView nScoreView;
    private TextView nQuestionView;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;
    private TextView nScoreText;

    private String nAnswer;
    private int nScore = 0;
    private int nQuestionNumber = 0;

    int goQuestion = 0;
    int count = 0;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_quiz);
        final MediaPlayer wrongSound = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer clickSound = MediaPlayer.create(this, R.raw.click2);
        final MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);


        nQuestionView = (TextView)findViewById(R.id.question1);
        nButtonChoice1 = (Button)findViewById(R.id.choice1);
        nButtonChoice2 = (Button)findViewById(R.id.choice2);
        nButtonChoice3 = (Button)findViewById(R.id.choice3);
        btnNext = (Button)findViewById(R.id.next);

        upDateQuestion();



        nButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoice1.getText() == nAnswer) {
                    correctSound.start();
                    nScore = nScore + 1;
                    count++;
                    btnNext.setEnabled(true);
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice1.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(basicQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    count++;
                    btnNext.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(basicQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        nButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoice2.getText() == nAnswer) {
                    correctSound.start();
                    nScore = nScore + 1;
                    count++;
                    btnNext.setEnabled(true);
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice2.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(basicQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    count++;
                    btnNext.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(basicQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);

                }
            }
        });

        nButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoice3.getText() == nAnswer) {
                    correctSound.start();
                    nScore = nScore + 1;
                    count++;
                    btnNext.setEnabled(true);
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice3.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(basicQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    nQuestionNumber++;
                    count++;
                    btnNext.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(basicQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoice1.setEnabled(false);
                    nButtonChoice2.setEnabled(false);
                    nButtonChoice3.setEnabled(false);
                    nButtonChoice3.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        if (count == 0) {
            btnNext.setEnabled(false);
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                upDateQuestion();
                nButtonChoice1.setEnabled(true);
                nButtonChoice2.setEnabled(true);
                nButtonChoice3.setEnabled(true);
                nButtonChoice1.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
                nButtonChoice2.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
                nButtonChoice3.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);



                if (nQuestionNumber == 10) {
                    btnNext.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(basicQuiz.this);

                            builder.setTitle("End");
                            builder.setMessage("The quiz has ended. Click next to check your score.");
                            builder.setCancelable(false);
                            builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(basicQuiz.this);
                                    builder2.setTitle("Result");
                                    if (nScore < 5) {
                                        builder2.setMessage("Your final score is " + nScore +
                                                ". You can still improve by reading the guides and re-attempt the quiz again!");
                                    } else if (nScore <= 7) {
                                        builder2.setMessage("Your final score is " + nScore + ". You have good understand! " +
                                                "Maybe you can try again and aim for full points!");
                                    } else if (nScore <= 9) {
                                        builder2.setMessage("Your final score is " + nScore + ". Amazing! You are close to getting perfect points!");
                                    } else {
                                        builder2.setMessage("Your final score is " + nScore + ". Excellent! You have show very " +
                                                "strong basic understanding. Try the Advanced level to test your skills!");
                                    }
                                    builder2.setCancelable(false);
                                    builder2.setPositiveButton("Back", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            Intent intent = new Intent(getApplicationContext(), quiz.class);
                                            startActivity(intent);
                                            basicQuiz.super.onBackPressed();
                                        }
                                    });
                                    builder2.show();
                                }
                            });
                            builder.show();
                        }
                    });

                }
            }
        });

    }

    private void upDateQuestion(){
        count = 0;
        btnNext.setEnabled(false);
        nQuestionView.setText(nBasicQuestion.getQuestion(nQuestionNumber));
        nButtonChoice1.setText(nBasicQuestion.getChoice1(nQuestionNumber));
        nButtonChoice2.setText(nBasicQuestion.getChoice2(nQuestionNumber));
        nButtonChoice3.setText(nBasicQuestion.getChoice3(nQuestionNumber));

        nAnswer = nBasicQuestion.getCorrectAnswer(nQuestionNumber);
        nQuestionNumber++;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Quit");
        builder.setMessage("You are not allowed to quit the quiz. Please continue.");
        builder.setCancelable(false);
        builder.setPositiveButton("Continue",null);
        builder.show();

    }

}
