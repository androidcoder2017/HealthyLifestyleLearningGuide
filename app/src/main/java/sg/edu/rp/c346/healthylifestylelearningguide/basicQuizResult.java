package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class basicQuizResult extends AppCompatActivity {

    TextView tvTotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_quiz_result);
        tvTotalScore = (TextView)findViewById(R.id.totalScore);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        int result = sharedPreferences.getInt("result",0);

        tvTotalScore.setText(result);


    }
}
