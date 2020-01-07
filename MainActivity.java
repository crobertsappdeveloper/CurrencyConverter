package apps.developer.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String usdst, eurst, usdfield, eurfield, sekfield, cadfield, sekst, cadst;
    double usdvalue, usdcalc, eurvalue, eurcalc, sekcalc, cadcalc, sekvalue, cadvalue;
    EditText usd, eur, sek, cad;
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     usd = (EditText) findViewById(R.id.USDinput);
     eur = (EditText) findViewById(R.id.EURinput);
     sek = (EditText) findViewById(R.id.SEKinput);
     cad = (EditText) findViewById(R.id.CADinput);

        thread = new Thread() {

            @Override
            public void run() {
                try {
                    while (!thread.isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    usdst = usd.getText().toString();
                                    usdvalue = Double.parseDouble(usdst);
                                    eurcalc = usdvalue * 0.89;
                                    eurfield = String.valueOf(eurcalc);
                                    EditText eurdisplay = (EditText) findViewById(R.id.EURinput);
                                    eurdisplay.setText(eurfield);

                                    sekcalc = usdvalue * 0.11;
                                    sekfield = String.valueOf(sekcalc);
                                    EditText sekdisplay = (EditText) findViewById(R.id.SEKinput);
                                    sekdisplay.setText(sekfield);

                                    cadcalc = usdvalue * 0.77;
                                    cadfield = String.valueOf(cadcalc);
                                    EditText caddisplay = (EditText) findViewById(R.id.CADinput);
                                    caddisplay.setText(cadfield);

                                    eurst = eur.getText().toString();
                                    eurvalue = Double.parseDouble(eurst);

                                    usdcalc = eurvalue * 1.12;
                                    usdfield = String.valueOf(usdcalc);
                                    EditText usddisplay = (EditText) findViewById(R.id.USDinput);
                                    usddisplay.setText(usdfield);

                                    sekcalc = eurvalue * 0.095;
                                    sekfield = String.valueOf(sekcalc);
                                    EditText sekdisplay2 = (EditText) findViewById(R.id.SEKinput);
                                    sekdisplay2.setText(sekfield);

                                    cadcalc = eurvalue * 0.69;
                                    cadfield = String.valueOf(cadcalc);
                                    EditText caddisplay2 = (EditText) findViewById(R.id.CADinput);
                                    caddisplay2.setText(cadfield);
                                    sekst = sek.getText().toString();
                                    sekvalue = Double.parseDouble(eurst);

                                    usdcalc = sekvalue * 9.4;
                                    usdfield = String.valueOf(usdcalc);
                                    EditText usddisplay2 = (EditText) findViewById(R.id.USDinput);
                                    usddisplay2.setText(usdfield);

                                    eurcalc = sekvalue * 10.49;
                                    eurfield = String.valueOf(eurcalc);
                                    EditText eurdisplay2 = (EditText) findViewById(R.id.EURinput);
                                    eurdisplay2.setText(eurfield);

                                    cadcalc = sekvalue * 7.24;
                                    cadfield = String.valueOf(cadcalc);
                                    EditText caddisplay3 = (EditText) findViewById(R.id.CADinput);
                                    caddisplay3.setText(cadfield);
                                    cadst = cad.getText().toString();
                                    cadvalue = Double.parseDouble(cadst);

                                    usdcalc = cadvalue * 1.3;
                                    usdfield = String.valueOf(usdcalc);
                                    EditText usddisplay3 = (EditText) findViewById(R.id.USDinput);
                                    usddisplay3.setText(usdfield);

                                    eurcalc = cadvalue * 1.45;
                                    eurfield = String.valueOf(eurcalc);
                                    EditText eurdisplay3 = (EditText) findViewById(R.id.EURinput);
                                    eurdisplay3.setText(eurfield);

                                    sekcalc = cadvalue * 0.014;
                                    sekfield = String.valueOf(sekcalc);
                                    EditText sekdisplay3 = (EditText) findViewById(R.id.SEKinput);
                                    sekdisplay3.setText(sekfield);


                                } catch (NumberFormatException ex) {

                                }
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
                        }
        };
        thread.start();
    }
}
