package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class advancedQuiz extends AppCompatActivity {

    private AdvancedQuestion nAdvancedQuestion = new AdvancedQuestion();

    private TextView nScoresView;
    private TextView nQuestionsView;
    private TextView tvTime;
    private Button nButtonChoices1;
    private Button nButtonChoices2;
    private Button nButtonChoices3;
    private Button nButtonChoices4;

    int count = 0;

    private String nAnswers;
    private int nScores = 0;
    private int nQuestionNumbers = 0;

    Button btnNextz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_quiz);

        final MediaPlayer wrongSound = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer nextSound = MediaPlayer.create(this, R.raw.click2);
        final MediaPlayer correctSound = MediaPlayer.create(this, R.raw.correct);
        final MediaPlayer timeupSound = MediaPlayer.create(this, R.raw.timeup);

        nQuestionsView = (TextView) findViewById(R.id.questions);
        nButtonChoices1 = (Button) findViewById(R.id.choices1);
        nButtonChoices2 = (Button) findViewById(R.id.choices2);
        nButtonChoices3 = (Button) findViewById(R.id.choices3);
        nButtonChoices4 = (Button) findViewById(R.id.choices4);

        tvTime = (TextView) findViewById(R.id.times);
        btnNextz = (Button) findViewById(R.id.nextz);


        updateQuestions();


        final CountDownTimer runTimer = new CountDownTimer(90000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String text = String.format(Locale.getDefault(), "Time remaining %02d min: %02d sec",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % 60, TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60);
                tvTime.setText(text);
            }

            @Override
            public void onFinish() {
                timeupSound.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(advancedQuiz.this);

                builder.setTitle("Time's up");
                builder.setMessage("1min and 30sec have past. Click next to check your score.");
                builder.setCancelable(false);
                builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(advancedQuiz.this);
                        builder2.setTitle("Result");
                        if (nScores <= 5) {
                            builder2.setMessage("Your final score is " + nScores +
                                    ". Do not worry! Just read up some guide to understand how to stay healthy and attempt the quiz again!");
                        } else if (nScores <= 7) {
                            builder2.setMessage("Your final score is " + nScores + ". You can still improve!");
                        } else if (nScores <= 10) {
                            builder2.setMessage("Your final score is " + nScores + ". Not bad! You have show some good understand!" +
                                    " You can try again to improve your score!");
                        } else if (nScores <= 13) {
                            builder2.setMessage("Your final score is " + nScores + ". Amazing! You are close to getting" +
                                    " close to score perfect marks!");
                        } else {
                            builder2.setMessage("Your final score is " + nScores + ". Excellent! You have show how knowledgeable " +
                                    "you are in maintain your health!");
                        }
                        builder2.setCancelable(false);
                        builder2.setPositiveButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), quiz.class);
                                startActivity(intent);
                                advancedQuiz.super.onBackPressed();
                            }
                        });
                        builder2.show();
                    }
                });
                builder.show();
            }
        }.start();

        nButtonChoices1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoices1.getText() == nAnswers) {
                    count++;
                    btnNextz.setEnabled(true);
                    correctSound.start();
                    nScores = nScores + 1;
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices1.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(advancedQuiz.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    count++;
                    btnNextz.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(advancedQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);

                }
            }
        });

        nButtonChoices2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoices2.getText() == nAnswers) {
                    count++;
                    btnNextz.setEnabled(true);
                    correctSound.start();
                    nScores = nScores + 1;
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices2.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(advancedQuiz.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    count++;
                    btnNextz.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(advancedQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        nButtonChoices3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoices3.getText() == nAnswers) {
                    count++;
                    btnNextz.setEnabled(true);
                    correctSound.start();
                    nScores = nScores + 1;
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices3.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(advancedQuiz.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    count++;
                    btnNextz.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(advancedQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices3.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        nButtonChoices4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nButtonChoices4.getText() == nAnswers) {
                    count++;
                    btnNextz.setEnabled(true);
                    correctSound.start();
                    nScores = nScores + 1;
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices4.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                    Toast.makeText(advancedQuiz.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    count++;
                    btnNextz.setEnabled(true);
                    wrongSound.start();
                    Toast.makeText(advancedQuiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    nButtonChoices1.setEnabled(false);
                    nButtonChoices2.setEnabled(false);
                    nButtonChoices3.setEnabled(false);
                    nButtonChoices4.setEnabled(false);
                    nButtonChoices4.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        if (count == 0) {
            btnNextz.setEnabled(false);
        }
            btnNextz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    nextSound.start();
                    updateQuestions();
                    nButtonChoices1.setEnabled(true);
                    nButtonChoices2.setEnabled(true);
                    nButtonChoices3.setEnabled(true);
                    nButtonChoices4.setEnabled(true);
                    nButtonChoices1.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
                    nButtonChoices2.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
                    nButtonChoices3.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);
                    nButtonChoices4.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.MULTIPLY);


                    if (nQuestionNumbers == 15) {
                        btnNextz.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(advancedQuiz.this);

                                builder.setTitle("End");
                                builder.setMessage("The quiz has ended. Click next to check your score.");
                                builder.setCancelable(false);
                                builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(advancedQuiz.this);
                                        builder2.setTitle("Result");
                                        if (nScores <= 5) {
                                            builder2.setMessage("Your final score is " + nScores +
                                                    ". Do not worry! Just read up some guide to understand how to stay healthy and attempt the quiz again!");
                                        } else if (nScores <= 7) {
                                            builder2.setMessage("Your final score is " + nScores + ". You can still improve!");
                                        } else if (nScores <= 10) {
                                            builder2.setMessage("Your final score is " + nScores + ". Not bad! You have show some good understand!" +
                                                    " You can try again to improve your score!");
                                        } else if (nScores <= 13) {
                                            builder2.setMessage("Your final score is " + nScores + ". Amazing! You are close to getting" +
                                                    " close to score perfect marks!");
                                        } else {
                                            builder2.setMessage("Your final score is " + nScores + ". Excellent! You have show how knowledgeable " +
                                                    "you are in maintain your health!");
                                        }
                                        builder2.setCancelable(false);
                                        builder2.setPositiveButton("Back", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent(getApplicationContext(), quiz.class);
                                                startActivity(intent);
                                                advancedQuiz.super.onBackPressed();
                                            }
                                        });
                                        builder2.show();

                                    }
                                });
                                builder.show();
                                runTimer.cancel();
                            }
                        });

                    }

                }
            });
        }

    private void updateQuestions() {
        count = 0;
        btnNextz.setEnabled(false);
        nQuestionsView.setText(nAdvancedQuestion.getQuestions(nQuestionNumbers));
        nButtonChoices1.setText(nAdvancedQuestion.getChoices1(nQuestionNumbers));
        nButtonChoices2.setText(nAdvancedQuestion.getChoices2(nQuestionNumbers));
        nButtonChoices3.setText(nAdvancedQuestion.getChoices3(nQuestionNumbers));
        nButtonChoices4.setText(nAdvancedQuestion.getChoices4(nQuestionNumbers));

        nAnswers = nAdvancedQuestion.getCorrectAnswers(nQuestionNumbers);
        nQuestionNumbers++;
    }

    private void updateScore(int points) {
        nScoresView.setText("" + nScores);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Quit");
        builder.setMessage("You are not allowed to quit the quiz. Please continue.");
        builder.setCancelable(false);
        builder.setPositiveButton("Continue", null);
        builder.show();
    }

}
