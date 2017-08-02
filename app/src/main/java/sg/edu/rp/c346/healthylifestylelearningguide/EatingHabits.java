package sg.edu.rp.c346.healthylifestylelearningguide;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EatingHabits extends AppCompatActivity {
    TextView tvEatingDescription;
    TextView tvEatingSentences;
    TextView tvTipsEating;
    TextView tvEatingTips1;
    TextView tvEatingTips2;
    TextView tvEatingTips3;
    TextView tvEatingTips4;
    TextView tvAdvice;
    TextView tvAdvice1;
    TextView tvAdvice2;
    TextView tvAdvice3;
    TextView tvEatLinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating_habits);

        tvEatingDescription = (TextView)findViewById(R.id.textViewEatingDescription);
        tvEatingSentences = (TextView)findViewById(R.id.textViewEatingSentences);
        tvTipsEating = (TextView)findViewById(R.id.textViewTipsEating);
        tvEatingTips1 = (TextView)findViewById(R.id.textViewEatingTip1);
        tvEatingTips2 = (TextView)findViewById(R.id.textViewEatingTip2);
        tvEatingTips3 = (TextView)findViewById(R.id.textViewEatingTips3);
        tvEatingTips4 = (TextView)findViewById(R.id.textViewEatingTips4);
        tvAdvice = (TextView)findViewById(R.id.textViewAdvice);
        tvAdvice1 = (TextView)findViewById(R.id.textViewAdvice1);
        tvAdvice2 = (TextView)findViewById(R.id.textViewAdvice2);
        tvAdvice3 = (TextView)findViewById(R.id.textViewAdvice3);
        tvEatLinks = (TextView)findViewById(R.id.textViewEatingLinks);

        tvEatingDescription.setText(Html.fromHtml("<h2><u>About Good Eating Habit</u></h2>"));
        tvEatingSentences.setText(Html.fromHtml("<p>Normally, everyone loves eating delicious food such as Western Food, Seafood," +
                "Japanese Food, BBQ and more. However, it also will increase risk of health such as chances of developing heart disease." +
                " Thus, we need to exercise Good Eating Habit everyday. Developing healthy eating habits will give feeling full and " +
                "with plenty of energy to do everything you want to do.</p>"));
        tvTipsEating.setText(Html.fromHtml("<p>Here are some foods <b>recommended</b>:<p>"));
        tvEatingTips1.setText(Html.fromHtml("<p>1. Fruits & Vegetables</p>"));
        tvEatingTips2.setText(Html.fromHtml("<p>2. Whole grains food such as whole wheat, brown rice, oatmeal.</p>"));
        tvEatingTips3.setText(Html.fromHtml("<p>3. Protein food such as meat, eggs, seafood, dry bean.</p>"));
        tvEatingTips4.setText(Html.fromHtml("<p>4. Drink more water.</p>"));
        tvAdvice.setText(Html.fromHtml("<p>Here are some <b>tips</b>:</p>"));
        tvAdvice1.setText(Html.fromHtml("<p>- Emphasis on Fruits & Veggies</p>"));
        tvAdvice2.setText(Html.fromHtml("<p>- Reduce Fat, Salt, and Sugar</p>"));
        tvAdvice3.setText(Html.fromHtml("<p>- Healthy Snacks</p>"));
        tvEatLinks.setText(Html.fromHtml("<p>For <b>more details on tips</b> and other information, <a href = " +
                "'https://www.fitness.gov/eat-healthy/how-to-eat-healthy/'>Click Here</a></p>"));
        tvEatLinks.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
