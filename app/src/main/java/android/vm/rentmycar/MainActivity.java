package android.vm.rentmycar;

import android.app.Activity;
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

    TextView welcomeTv;
    Button changeTextButton;
    EditText changeTextEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeTv=(TextView) findViewById(R.id.welcome_tv);//prendo il controllo della textview(presente in xml) dalla classe java
        changeTextButton = (Button) findViewById(R.id.change_text_button);

        changeTextEdit= (EditText)findViewById(R.id.change_text_edit);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                welcomeTv.setText(changeTextEdit.getText());
            }
        });

    }


}
