package sg.edu.rp.c346.healthylifestylelearningguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TimeManagement extends AppCompatActivity {
    TextView tvTimeDescription;
    TextView tvTimeSentences;
    TextView tvTimeTips;
    TextView tvTimeMethod1;
    TextView tvTimeMethod2;
    TextView tvTimeMethod3;
    TextView tvTimeMethod4;
    TextView tvTimeMethod5;
    TextView tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_management);

        tvTimeDescription = (TextView)findViewById(R.id.textViewDescriptionTime);
        tvTimeSentences = (TextView)findViewById(R.id.textViewTimeSentences);
        tvTimeTips = (TextView)findViewById(R.id.textViewTimeTips);
        tvTimeMethod1 = (TextView)findViewById(R.id.textViewTimeMethod1);
        tvTimeMethod2 = (TextView)findViewById(R.id.textViewTimeMethod2);
        tvTimeMethod3 = (TextView)findViewById(R.id.textViewTimeMethod3);
        tvTimeMethod4 = (TextView)findViewById(R.id.textViewTimeMethod4);
        tvTimeMethod5 = (TextView)findViewById(R.id.textViewTimeMethod5);
        tvLink = (TextView)findViewById(R.id.textViewLink);

        tvTimeDescription.setText(Html.fromHtml("<h2><u>About Time Management</u></h2>"));
        tvTimeSentences.setText(Html.fromHtml("<p>Obtaining knowledge about Time Management and learn how to apply it will help" +
                " you to plan out efficiently. Having a proper Time Management will help to maximise the time you have and make the " +
                "most out of it</p>"));
        tvTimeTips.setText(Html.fromHtml("<p>Here are some <b>tips</b> on applying Time Management Skills:</p>"));
        tvTimeMethod1.setText(Html.fromHtml("<p><b>1. Access your time.</b> Look closely at how you spend your time. Experts say " +
                "that most people spend up to an hour a day on tasks that could be put on hold or completely eliminated from their " +
                "schedule.</p>"));
        tvTimeMethod2.setText(Html.fromHtml("<p><b>2. Prioritize.</b> The key to organization is knowing what's a priority and " +
                "what can wait. Any important task to complete should be focused on and estimate the time needed to complete</p>"));
        tvTimeMethod3.setText(Html.fromHtml("<p><b>3. Know your deadlines.</b> When do you need to finish your tasks? Mark the deadlines out " +
                "clearly in your calendar and organizer so you know when you need to finish them.</p>"));
        tvTimeMethod4.setText(Html.fromHtml("<p><b>4. Set reminders 15 minutes before.</b> Most calendars have a reminder function. " +
                "If you’ve an important meeting to attend, set that alarm 15 minutes before.</p>"));
        tvTimeMethod5.setText(Html.fromHtml("<p><b>5. Create a daily plan.</b> Plan your day before it unfolds. Do it in the morning or even " +
                "better, the night before you sleep. The plan gives you a good overview of how the day will pan out. That way, " +
                "you don’t get caught off guard. Your job for the day is to stick to the plan as best as possible.</p>"));
        tvLink.setText(Html.fromHtml("<p>For more details, <a href= " +
                "'http://www.lifehack.org/articles/featured/20-quick-tips-for-better-time-management.html'>Click Here</a> to learn " +
                "more tips on Time Management.</p>"));
        tvLink.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
