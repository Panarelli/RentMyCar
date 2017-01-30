package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panar on 26/01/2017.
 */

public class SearchActivity extends Activity{
    Button cercaButton;
    Spinner spinnercitta;
    SearchActivity activity=this;
    ArrayList<String> citta;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        spinnercitta = (Spinner) findViewById(R.id.spinner);
        /*
        citta=new ArrayList<>();
        citta=offer.cities;
        for(int i=0;i<citta.size();i++){
            System.out.println(citta.get(i));
        }
       // ArrayAdapter snprAdapter = new ArrayAdapter(activity,R.layout.activity_search , citta);
       // spinnercitta.setAdapter(snprAdapter);
*/
        cercaButton = (Button) findViewById(R.id.bt_primaricerca);
        cercaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(activity,ShowCars.class);
                startActivity(intent);
            }
        });

    }

            }
