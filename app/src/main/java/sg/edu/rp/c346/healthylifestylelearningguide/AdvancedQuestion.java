package sg.edu.rp.c346.healthylifestylelearningguide;

public class AdvancedQuestion {
    private String qn [] = {
            "1) What must you do if face multi-task during tight schedule?",
            "2) Which is not the right way to proritize in terms of ensuring healthier life?",
            "3) Which of the following food category should you consume from least to more with 1 being the least in the Healthy Diet Pyramid?",
            "4) Which is the correct way to do warm-up before jogging?",
            "5) If you skip breakfast, which would be not be the correct effect?",
            "6) Which meal is an unhealthy choice?",
            "7) How many hours should you spend to sleep?",
            "8) Choose the most suitable answer that explain the needs of spending more time on outdoor.",
            "9) Why must you practise Strength Exercise?",
            "10) Which should not be an example of Balance Exercise?",
            "11) If you are having a cold-like symptoms, which food should never be consumed?",
            "12) What must you never do if doing any form of physical activities such as sports and exercise?",
            "13) Which is consider the best choice for healthy breakfast meal set?",
            "14) Which is not the correct way of managing yourself?",
            "15) Which is the best way of relaxing?"
    };

    private String ansChoices [][] = {
            {"Focus on getting the job done as fast as possible", "Focus on finishing smaller and easier task first", "Focus on major content", "Plan on how to perfect all the task given"},
            {"Proritize sleeping hours", "Proritize fun activities", "Proritize time", "Proritize work task or school work"},
            {"1) Fats,oil,sugar, salt 2) Meat, eggs 3) Fruits, vegetables 4) Rice, cereals", "3) Fats,oil,sugar, salt 4) Meat, eggs 1) Fruits, vegetables 2) Rice, cereals",
            "2) Fats,oil,sugar, salt 1) Meat, eggs 3) Fruits, vegetables 4) Rice, cereals", "4) Fats,oil,sugar, salt 3) Meat, eggs 2) Fruits, vegetables 1) Rice, cereals"},
            {"do some slow running", "drink more water", "Slowly stretch your body", "have a light breakfast"},
            {"Lack of metabolism", "Lack of energy and concentration", "Makes you forgetful", "Nothing will happen"},
            {"Salad sets plus vegetable juice", "Pizza plus Coke", "Pork Chop plus Milo", "Spaghetti plus mushroom soup"},
            {"7 hours", "8 hours", "9 hours", "10 hours"},
            {"Explore your interest in life", "Spend more time with family", "Explore nature which brings you tears and joy of life", "Spending time to have fun"},
            {"Protect yourself from the bullies", "To act independent and carry heavy stuff", "To keep fit", "To show the world your strength"},
            {"Tai Chi", "Balance Walk", "Heel-to-Toe Walk", "Stand on Two Foot"},
            {"Porridge", "Meat", "Broth-Based soup", "Spicy food"},
            {"Take a break for 5 minutes", "Overstretch your body", "Drink plenty of water", "Stop doing activity if you suddenly feel unwell"},
            {"Egg with toast and milk", "Cakes and milk", "Sausage, bacon and coffee", "Apple and soft drinks"},
            {"Spend a few hours to play games", "Focus on learning some new things", "Planning some meaningful events", "Spend a few hours over-thinking"},
            {"Being alone", "Playing games for 2 hours", "Rest for 20 minutes", "Running for 10 minutes"}
    };

    private String answers[] = {
        "Focus on finishing smaller and easier task first",  "Proritize work task or school work", "1) Fats,oil,sugar, salt 2) Meat, eggs 3) Fruits, vegetables 4) Rice, cereals",
            "Slowly stretch your body", "Nothing will happen", "Pizza plus Coke", "8 hours","Explore nature which brings you tears and joy of life",
            "To act independent and carry heavy stuff", "Stand on Two Foot", "Meat", "Overstretch your body", "Egg with toast and milk",
            "Spend a few hours over-thinking", "Rest for 20 minutes"};

    public String getQuestions(int a) {
        String question = qn[a];
        return question;
    }

    public String getChoices1(int a) {
        String choice1 = ansChoices[a][0];
        return choice1;
    }

    public String getChoices2(int a) {
        String choice2 = ansChoices[a][1];
        return choice2;
    }

    public String getChoices3(int a) {
        String choice3 = ansChoices[a][2];
        return choice3;
    }

    public String getChoices4(int a) {
        String choice4 = ansChoices[a][3];
        return  choice4;
    }

    public String getCorrectAnswers(int a) {
        String answer = answers[a];
        return answer;
    }
}
