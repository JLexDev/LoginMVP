package jlexdev.com.loginmvp.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import jlexdev.com.loginmvp.Home.HomeActivity;
import jlexdev.com.loginmvp.R;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener{

    private ProgressBar progressBar;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogIn;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        etUsername = (EditText)findViewById(R.id.et_username);
        etPassword = (EditText)findViewById(R.id.et_password);
        btnLogIn = (Button)findViewById(R.id.btn_login);

        btnLogIn.setOnClickListener(this);

        presenter = new LoginPresenterImpl(this, new LoginInteractorImpl());
    }

    @Override
    public void onClick(View v) {
        presenter.validateDredentials(etUsername.getText().toString(), etPassword.getText().toString());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        etUsername.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        etPassword.setError(getString(R.string.password_error));
    }

    @Override
    public void navigateToMain() {
        Intent toMain = new Intent(this, HomeActivity.class);
        startActivity(toMain);

        finish();
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }
}
