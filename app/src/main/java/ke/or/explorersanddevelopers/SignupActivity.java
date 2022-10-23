package ke.or.explorersanddevelopers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    private Button submit, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        submit = findViewById(R.id.btn_signupSubmit);
        login = findViewById(R.id.btn_signupLogin);

        login.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            SignupActivity.this.startActivity(intent);
        });
    }
}