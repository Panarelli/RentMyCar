package android.vm.rentmycar;

import android.content.Context;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;
import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by panar on 02/02/2017.
 */

public class AutomobileController {

    Context context;
    private DatabaseReference mDatabase;

    public AutomobileController(Context context) {
        this.context = context;
        mDatabase = FirebaseDatabase.getInstance().getReference().child("automobili");
    }

    public Query getStudents() {
        return mDatabase;
    }

    public void addAutomobile(final String  marca,final String modello,final String datainizio,final String datafine,final String citta, final ValueEventListener callback) {

        mDatabase.addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value
                        Automobile automobile = new Automobile(marca,modello,datainizio,datafine,citta);
                        Random generator = new Random();
                        int i = generator.nextInt(1000) + 1;
                        mDatabase.child("student" + i).setValue(automobile.toMap());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w(TAG, "getUser:onCancelled", databaseError.toException());
                    }
                });
    }
}
