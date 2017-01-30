package android.vm.rentmycar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by panar on 26/01/2017.
 */

public class HomeActivity extends Activity{
    Button searchButton, offerButton;
    HomeActivity activity=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        searchButton = (Button) findViewById(R.id.search_home_button);

        offerButton = (Button) findViewById(R.id.offer_home_button);


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity,SearchActivity.class);
                //intent.putExtra("username",username);
                startActivity(intent);
            }
        });

        offerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // welcomeTv.setText(ch
                // angeTextEdit.getText();
                Intent intent = new Intent(activity,OfferActivity.class);
                //intent.putExtra("username",username);
                startActivity(intent);
            }
        });

    }
}
