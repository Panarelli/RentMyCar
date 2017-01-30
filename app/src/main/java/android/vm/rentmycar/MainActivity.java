package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by albof on 25/01/2017.
 */

public class MainActivity extends Activity {
    //public static final String USERNAME_KEY="username"; usato per passare le chiavi senza scrivere il nome tra apici ma riportando la variabile statica.
    TextView usernTv,passTv ;
    Button registratiButton, loginButton;
    EditText changeTextEdit;
    MainActivity activity=this;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registratiButton = (Button) findViewById(R.id.btn_registrati);
        loginButton = (Button) findViewById(R.id.btn_login);

//COLLEGARE BOTTONE LOGIN A HOMEACTIVITY! <------------
        registratiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(activity,RegistratiActivity.class);
                startActivity(intent);
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,HomeActivity.class);
                startActivity(intent);
            }
        });
    }


}
