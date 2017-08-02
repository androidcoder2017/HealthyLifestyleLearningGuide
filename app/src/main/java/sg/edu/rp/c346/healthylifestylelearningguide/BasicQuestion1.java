package sg.edu.rp.c346.healthylifestylelearningguide;

import java.lang.ref.SoftReference;

public class BasicQuestion1 {
    private String Questions [] = {
            "1) What is Stress Management?",
            "2) What is Good Eating Habit?",
            "3) What is Time Management?",
            "4) Which is the correct type of exercising?",
            "5) Which food is not healthy?",
            "6) Which is the correct method on adopting Stress Management?",
            "7) Which method is useful in planning a healthy diet?",
            "8) Which is the correct tips on adopting good eating habit?",
            "9) Which is not the correct tips on adopting Time Management?",
            "10) Which is not the correct manner of staying healthy?"

    };

    private String Choices  [][] = {
            {"To rush in completing the task on schedule.", "Control level of stress during tough situation", "Experience stress"},
            {"Eating junk foods everyday", "Drink a litres of soft drink 5 times per week", "Eat fruits once per day"},
            {"Organizing and planning your time properly between important tasks", "Organizing place and schedule", "Organizing your time to play games"},
            {"Sleeping for 8 hours", "Running for 30 minutes", "Playing games for 10 hours"},
            {"Apple", "Egg", "French Fries"},
            {"Stay indoor whenever possible", "Think positive", "Raising your voice loudly"},
            {"Eat fruits and vegetables 3 times per week", "Eat western foods per day", "Drink a can of coke every week"},
            {"Reduce Fat, Salt and Sugar foods", "Emphasis on crispy food", "Unhealthy snacks"},
            {"Proritize important tasks", "Create a daily plan", "Set reminder 2 minutes before important meetings"},
            {"Spending 2 hours per day exercising", "Drink 8 cups of water everyday", "Eat fries once per day"}
    };

    private String CorrectAnswers [] =
            {"Control level of stress during tough situation", "Eat fruits once per day", "Organizing and planning your time properly between important tasks",
                    "Running for 30 minutes", "French Fries", "Think positive", "Eat fruits and vegetables 3 times per week",
                    "Reduce Fat, Salt and Sugar foods", "Set reminder 2 minutes before important meetings","Eat fries once per day"};

    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice1 = Choices[a][0];
        return choice1;
    }

    public String getChoice2(int a) {
        String choice2 = Choices[a][1];
        return choice2;
    }

    public String getChoice3(int a) {
        String choice3 = Choices[a][2];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }
}
