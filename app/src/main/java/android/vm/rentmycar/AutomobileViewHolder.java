package android.vm.rentmycar;

import android.widget.CalendarView;
import android.widget.EditText;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by albof on 02/02/2017.
 */

public class AutomobileViewHolder extends RecyclerView.ViewHolder {

    public EditText autoMarcaEt, autoModelloEt, autoCittaEt;
    public CalendarView autoDataInizioCv, getAutoDataFineCv;
    public AutomobileViewHolder(final View v){
        super(v);
        autoMarcaEt = (EditText) v.findViewById(R.id.et_marcaAuto);
        autoModelloEt = (EditText) v.findViewById(R.id.et_modelloAuto);
        autoCittaEt = (EditText) v.findViewById(R.id.et_aggiungicitta);
        autoDataInizioCv = (CalendarView) v.findViewById(R.id.cv_datainizionoleggio);
        getAutoDataFineCv = (CalendarView) v.findViewById(R.id.cv_datafinenoleggio);
    }


}
