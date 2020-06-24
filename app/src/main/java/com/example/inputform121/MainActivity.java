package com.example.inputform121;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOk = (Button) findViewById(R.id.button_ok);
        Button buttonClean = (Button) findViewById(R.id.button_clean);
        final EditText inputUserName = (EditText) findViewById(R.id.input_user_name);
        final EditText inputUserMail = (EditText) findViewById(R.id.input_user_email);
        final TextView successText = (TextView) findViewById(R.id.success_text);

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputUserName.setText("");
                inputUserMail.setText("");
            }
        });

        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userName = inputUserName.getText().toString().trim();
                String userEmail = inputUserMail.getText().toString().trim();
                if (!userName.equals("") || !userEmail.equals("")) {
                    //successText.setText("");
                    successText.setText("Подписка на рассылку успешно оформлена для пользователя " + userName + " на электронный адрес " + userEmail);
                    successText.setVisibility(View.VISIBLE);
                }
                else {
                    //successText.setText("");
                    successText.setText("Одно из полей пустое, заполите имя/email");
                    successText.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}