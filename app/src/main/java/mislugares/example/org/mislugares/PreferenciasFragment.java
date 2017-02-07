package mislugares.example.org.mislugares;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Quintero on 07/02/2017.
 */

public class PreferenciasFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedIstanceState){
        super.onCreate(savedIstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }

}
