package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by panar on 28/01/2017.
 */

public class OfferActivity extends Activity {
    Button inserisciAuto;
    Activity activity=this;
    ArrayList<String> cities;
    EditText aggiungicitta;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);

      /*  Date currentdate= new Date();
        int giorno=currentdate.getDay();
        int mese= currentdate.getMonth();
        int anno= currentdate.getYear();
        String d=""+giorno+mese+anno;
        long datacorrente= Long.parseLong(d);
        CalendarView simpleCalendarView = (CalendarView) findViewById(R.id.cv_datainizionoleggio);
        simpleCalendarView.setMinDate(datacorrente);*/
        inserisciAuto = (Button) findViewById(R.id.bt_inserisciauto);
        inserisciAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cities= new ArrayList<String>();
                aggiungicitta = (EditText) findViewById(R.id.etaggiungicitta);



            }
        });
        aggiungicitta= (EditText)findViewById(R.id.etaggiungicitta);
        aggiungicitta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,AutocompleteActivity.class);
                startActivityForResult(intent,200);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == 200){
            Place place = PlaceAutocomplete.getPlace(this,data);
            aggiungicitta.setText(place.getName());
        }
    }
}