package sg.edu.rp.c346.healthylifestylelearningguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class StressManagement extends AppCompatActivity {
    TextView tvAboutStress;
    TextView tvStressSentences;
    TextView tvStressTipsSentences;
    TextView tvStressTips1;
    TextView tvStressTips2;
    TextView tvStressTips3;
    TextView tvStressTips4;
    TextView tvStressTips5;
    TextView tvDetailsStress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_management);


        tvAboutStress = (TextView)findViewById(R.id.textViewAboutStress);
        tvStressSentences = (TextView)findViewById(R.id.textViewStressSentence);
        tvStressTipsSentences = (TextView)findViewById(R.id.textViewStressTipsSentence);
        tvStressTips1 = (TextView)findViewById(R.id.textViewStressTips1);
        tvStressTips2 = (TextView)findViewById(R.id.textViewStressTips2);
        tvStressTips3 = (TextView)findViewById(R.id.textViewStressTips3);
        tvStressTips4 = (TextView)findViewById(R.id.textViewStressTips4);
        tvStressTips5 = (TextView)findViewById(R.id.textViewStressTips5);
        tvDetailsStress = (TextView)findViewById(R.id.textViewDetailsStress);

        tvAboutStress.setText(Html.fromHtml("<h2><u>About Stress Management</u></h2>"));
        tvStressSentences.setText(Html.fromHtml("<p>In modern world, everyone in different parts of the world will encounter stress." +
                "Regardless of studies, work or other important tasks. Most would not be able to learn how to remain calm or cool when" +
                "facing issues that could affect them badly. High level of stress may affect the brain or heart deeply especially for" +
                "adults. It is important to manage stress to reduce such crisis.</p>"));
        tvStressTipsSentences.setText(Html.fromHtml("<p>Here are some basic <b>tips</b> to teach you in managing stress:</p>"));
        tvStressTips1.setText(Html.fromHtml("<p><b>1. Think positive.</b> For each negative thought you have, try to counter it with something " +
                "positive. Always look for that silver lining.</p>"));
        tvStressTips2.setText(Html.fromHtml("<p><b>2. Go outdoors whenever possible.</b> A little sunshine and activity can do you a world of " +
                "good and enhance your entire life outlook.</p>"));
        tvStressTips3.setText(Html.fromHtml("<p><b>3. Adopt good sleep habits.</b> Make sure you go to bed and wake up at about " +
                "the same time every day. Avoid very stimulating games and take a warm shower before bedtime to help you relax</p>"));
        tvStressTips4.setText(Html.fromHtml("<p><b>4. Laughter is the best medicine.</b> Listen to some humorous podcasts, watch some comedies " +
                "or even short YouTube clips at the end of the day on your commute home.</p>"));
        tvStressTips5.setText(Html.fromHtml("<p><b>5. Exercise</b> is one of the best ways to reduce stress and improve your overall quality " +
                "of life. </p>"));
        tvDetailsStress.setText(Html.fromHtml("<p>For <b>more tips and details</b>, <a href = " +
                "'https://www.healthxchange.sg/wellness/mental-health/tips-cope-stress'>Click Here</a></p>"));
        tvDetailsStress.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
