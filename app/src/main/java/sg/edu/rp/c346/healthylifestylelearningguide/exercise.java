package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exercise extends AppCompatActivity {
    TextView tvJogging;
    TextView tvStrength;
    TextView tvJoggingStep1;
    TextView tvJoggingStep2;
    TextView tvStrengthDescription;
    TextView tvExample;
    TextView tvReadMore;
    TextView tvBalance;
    TextView tvBalanceExample;
    TextView tvBalanceDescription;
    TextView tvReadMoreBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        tvJogging = (TextView)findViewById(R.id.textViewJogging);
        tvStrength = (TextView)findViewById(R.id.textViewStrength);
        tvJoggingStep1 = (TextView)findViewById(R.id.textViewJoggingStep1);
        tvJoggingStep2 = (TextView)findViewById(R.id.textViewJoggingStep2);
        tvStrengthDescription = (TextView)findViewById(R.id.textViewStrengthDescription);
        tvExample = (TextView)findViewById(R.id.textViewExample);
        tvReadMore = (TextView)findViewById(R.id.textViewReadMore);
        tvBalance = (TextView)findViewById(R.id.textViewBalance);
        tvBalanceDescription = (TextView)findViewById(R.id.textViewBalanceDescription);
        tvBalanceExample = (TextView)findViewById(R.id.textViewBalanceExample);
        tvReadMoreBalance = (TextView)findViewById(R.id.textViewReadMoreBalance);

        tvJogging.setText(Html.fromHtml("<u><h2>Jogging</h2></u>"));
        tvStrength.setText(Html.fromHtml("<u><h2>Strength Exercise</h2></u>"));
        tvJoggingStep1.setText(Html.fromHtml("<p>Step 1: Start by walking for 15-20 minutes a day 3-4 times a week</p>"));
        tvJoggingStep2.setText(Html.fromHtml("<p>Step 2: Gradually increase the pace of your walking until jogging becomes the next logical step.</p>"));
        tvStrengthDescription.setText(Html.fromHtml("<p>Description: Strength Exercise make your muscles stronger. It will allow you to act independent and carry heavy stuff without much issue.</p>"));
        tvExample.setText(Html.fromHtml("<p>Example: <br/> - Lifting Weights <br/> - Using a resistance band <br/> - Using your own body weight </p>"));
        tvBalance.setText(Html.fromHtml("<h2><u>Balance Exercise</u></h2>"));
        tvBalanceDescription.setText(Html.fromHtml("<p>Description: Each year, more than 2 million older " +
                "Americans go to the emergency room because of fall-related injuries." +
                " Balance exercises can help prevent falls and avoid the disability that may result from falling.</p>"));
        tvBalanceExample.setText(Html.fromHtml("<p>Example: <br/> - Standing on one foot <br/> - Heel-to-toe walk <br/> - Tai Chi </p>"));

        tvReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), strengthWebPage.class);
                intent.putExtra("website","https://go4life.nia.nih.gov/exercises/strength");
                startActivity(intent);
            }
        });

        tvReadMoreBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), BalanceWebPage.class);
                intent.putExtra("website2", "https://go4life.nia.nih.gov/exercises/balance");
                startActivity(intent);
            }
        });


    }
}
