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
    Button changeTextButton;
    EditText changeTextEdit;
    MainActivity activity=this;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernTv=(TextView) findViewById(R.id.usern_tv);//prendo il controllo della textview(presente in xml) dalla classe java
        passTv=(TextView) findViewById(R.id.pass_tv);
        changeTextButton = (Button) findViewById(R.id.change_text_button);

        changeTextEdit= (EditText)findViewById(R.id.change_text_edit);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // welcomeTv.setText(changeTextEdit.getText());
                username=changeTextEdit.getText().toString();
                Intent intent = new Intent(activity,RegistratiActivity.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });

    }


}
