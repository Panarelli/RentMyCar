package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;


import java.util.Date;
import java.util.Map;

public class RegistratiActivity extends Activity {

    Button confermaRegistratiButton;
    RegistratiActivity activity=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);
        confermaRegistratiButton = (Button) findViewById(R.id.btn_registrati_reg);
        /*Date currentDate = new Date();
        int giorno = currentDate.getDay();
        int mese = currentDate.getMonth();
        int anno = currentDate.getYear();
        String d = " "+ giorno+mese+anno;
        long dataCorrente = Long.parseLong(d);
        CalendarView calendario = (CalendarView) findViewById(R.id.cv_datanascita);
        calendario.setMinDate(dataCorrente);*/
        confermaRegistratiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent intent = new Intent(activity, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
