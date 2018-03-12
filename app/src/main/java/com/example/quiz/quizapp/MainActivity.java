package com.example.quiz.quizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(String answerEvaluated) {
        Toast toast;
        toast = Toast.makeText(this, answerEvaluated, Toast.LENGTH_LONG);
        toast.show();
    }

    public void CheckQ1(View view) {
        EditText answer_Q1 = findViewById(R.id.answerQ1);
        if (answer_Q1.getText().toString().equals("3")) {
            makeToast("Correct!");
        } else {
            makeToast("Invalid!");
        }
    }

    public void CheckQ2(View view) {
        RadioButton option1Q2 = findViewById(R.id.yesOptionQ2);
        if (option1Q2.isChecked()) {
            makeToast("Good job!");
        } else {
            makeToast("Invalid!");
        }

    }

    public void CheckQ3(View view) {
        CheckBox option1Q3 = findViewById(R.id.Q3Option1);
        CheckBox option2Q3 = findViewById(R.id.Q3Option2);
        CheckBox option3Q3 = findViewById(R.id.Q3Option3);
        CheckBox option4Q3 = findViewById(R.id.Q3Option4);
        CheckBox option5Q3 = findViewById(R.id.Q3Option5);

        if (option2Q3.isChecked() && option3Q3.isChecked() && option5Q3.isChecked() && !option1Q3.isChecked() && !option4Q3.isChecked()) {
            makeToast("Amazing, all answers are correct!");
        } else {
            makeToast("One or more answers is invalid!");
        }
    }

    public void CheckQ4(View view) {
        RadioButton option1Q4 = findViewById(R.id.yesOptionQ4);
        if (option1Q4.isChecked()) {
            makeToast("Correct!");
        } else {
            makeToast("Invalid!, try again.");
        }
    }

    public void CheckQ5(View view) {
        CheckBox option1Q5 = findViewById(R.id.option1Q5);
        CheckBox option2Q5 = findViewById(R.id.option2Q5);
        CheckBox option3Q5 = findViewById(R.id.option3Q5);
        CheckBox option4Q5 = findViewById(R.id.option4Q5);
        CheckBox option5Q5 = findViewById(R.id.option5Q5);
        if (option1Q5.isChecked() && option3Q5.isChecked() && option5Q5.isChecked() && !option2Q5.isChecked() && !option4Q5.isChecked()) {
            makeToast("Amazing, all answers are correct!");
        } else {
            makeToast("One or more answers is invalid!");
        }
    }

    public void CheckQ6(View view) {
        RadioButton option2Q6 = findViewById(R.id.question6Option2);
        if (option2Q6.isChecked()) {
            makeToast("Correct!");
        } else {
            makeToast("Invalid!");
        }

    }

    public void calculateScore(View view) {
        // Question 1 evaluation
        EditText answer_Q1 = findViewById(R.id.answerQ1);
        if (answer_Q1.getText().toString().equals("3")) {
            Score = Score + 5;
        }
        //Question 2 evaluation
        RadioButton option1Q2 = findViewById(R.id.yesOptionQ2);
        if (option1Q2.isChecked()) {
            Score = Score + 5;
        }
        //Question 3 evaluation
        CheckBox option1Q3 = findViewById(R.id.Q3Option1);
        CheckBox option2Q3 = findViewById(R.id.Q3Option2);
        CheckBox option3Q3 = findViewById(R.id.Q3Option3);
        CheckBox option4Q3 = findViewById(R.id.Q3Option4);
        CheckBox option5Q3 = findViewById(R.id.Q3Option5);
        //add 1 to score for each correct answer
        if (option2Q3.isChecked()) {
            Score = Score + 1;
        }
        if (option3Q3.isChecked()) {
            Score = Score + 1;
        }
        if (option5Q3.isChecked()) {
            Score = Score + 1;
        }
        //deduce 1 from score for each incorrect answer
        if (option1Q3.isChecked()) {
            Score = Score - 1;
        }
        if (option4Q3.isChecked()) {
            Score = Score - 1;
        }
        //if all answers of question 3 are correct, add a bonus of 2 to score
        if (option2Q3.isChecked() && option3Q3.isChecked() && option5Q3.isChecked() && !option1Q3.isChecked() && !option4Q3.isChecked()) {
            Score = Score + 2;
        }
        //Question 4 evaluation
        RadioButton option1Q4 = findViewById(R.id.yesOptionQ4);
        if (option1Q4.isChecked()) {
            Score = Score + 5;
        }
        //Question 5 evaluation
        CheckBox option1Q5 = findViewById(R.id.option1Q5);
        CheckBox option2Q5 = findViewById(R.id.option2Q5);
        CheckBox option3Q5 = findViewById(R.id.option3Q5);
        CheckBox option4Q5 = findViewById(R.id.option4Q5);
        CheckBox option5Q5 = findViewById(R.id.option5Q5);

        //add 1 to score for each correct answer
        if (option1Q5.isChecked()) {
            Score = Score + 1;
        }
        if (option3Q5.isChecked()) {
            Score = Score + 1;
        }
        if (option5Q5.isChecked()) {
            Score = Score + 1;
        }
        //deduce 1 from score for each incorrect answer
        if (option2Q5.isChecked()) {
            Score = Score - 1;
        }
        if (option4Q5.isChecked()) {
            Score = Score - 1;
        }
        //if all answers of question 5 are correct, add a bonus of 2 to score
        if (option1Q5.isChecked() && option3Q5.isChecked() && option5Q5.isChecked() && !option2Q5.isChecked() && !option4Q5.isChecked()) {
            Score = Score + 2;
        }
        //Question6 Evaluation
        RadioButton option2Q6 = findViewById(R.id.question6Option2);
        if (option2Q6.isChecked()) {
            Score = Score + 5;
        }
        //show score
        Toast toast = Toast.makeText(this, "Your Score: " + Score + "/30 ", Toast.LENGTH_LONG);
        toast.show();
        Score = 0;
    }
}
