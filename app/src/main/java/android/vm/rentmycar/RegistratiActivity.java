package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegistratiActivity extends Activity {

    Button confermaRegistratiButton;
    RegistratiActivity activity=this;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);
        confermaRegistratiButton = (Button) findViewById(R.id.btn_registrati_reg);

        confermaRegistratiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent intent = new Intent(activity, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
