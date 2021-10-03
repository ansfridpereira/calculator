package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField number1,number2,answer;


    @FXML
    protected void onAddButtonClick()
    {
        double first =Double.parseDouble(number1.getText());
        double second =Double.parseDouble(number2.getText());
        double result= first+second;
        answer.setText(String.valueOf(result));

    }

    @FXML
    protected void onSubButtonClick() {
        double first =Double.parseDouble(number1.getText());
        double second =Double.parseDouble(number2.getText());
        double result = first-second;
        answer.setText(String.valueOf(result));
    }
}