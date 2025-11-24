package com.example.imgcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText etTaille;
    private EditText etPoids;
    private EditText etAge;
    private RadioGroup rgSexe;
    private RadioButton rbHomme;
    private RadioButton rbFemme;
    private Button btnCalculer;
    private TextView tvResultat;
    private TextView tvInterpretation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTaille = (EditText) findViewById(R.id.etTaille);
        etPoids = (EditText) findViewById(R.id.etPoids);
        etAge = (EditText) findViewById(R.id.etAge);
        rgSexe = (RadioGroup) findViewById(R.id.rgSexe);
        rbHomme = (RadioButton) findViewById(R.id.rbHomme);
        rbFemme = (RadioButton) findViewById(R.id.rbFemme);
        btnCalculer = (Button) findViewById(R.id.btnCalculer);
        tvResultat = (TextView) findViewById(R.id.tvResultat);
        tvInterpretation = (TextView) findViewById(R.id.tvInterpretation);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculerIMG();
            }
        });
    }

    private void calculerIMG() {
        if (etTaille.getText().toString().isEmpty() ||
                etPoids.getText().toString().isEmpty() ||
                etAge.getText().toString().isEmpty()) {
            Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            return;
        }

        if (rgSexe.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Veuillez sélectionner le sexe", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double tailleCm = Double.parseDouble(etTaille.getText().toString());
            double poids = Double.parseDouble(etPoids.getText().toString());
            int age = Integer.parseInt(etAge.getText().toString());

            double tailleM = tailleCm / 100.0;

            int sexe = rbHomme.isChecked() ? 1 : 0;

            double img = (1.2 * poids / (tailleM * tailleM)) +
                    (0.23 * age) -
                    (10.83 * sexe) -
                    5.4;

            tvResultat.setText(String.format("Votre IMG est : %.2f%%", img));

            String interpretation = getInterpretation(img, sexe);
            tvInterpretation.setText("Interprétation : " + interpretation);

            tvResultat.setVisibility(View.VISIBLE);
            tvInterpretation.setVisibility(View.VISIBLE);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Veuillez entrer des valeurs valides", Toast.LENGTH_SHORT).show();
        }
    }

    private String getInterpretation(double img, int sexe) {
        if (sexe == 1) {
            if (img < 15) {
                return "Personne trop maigre";
            } else if (img >= 15 && img <= 20) {
                return "Personne normale";
            } else {
                return "Personne ayant trop de graisse";
            }
        } else { // Femme
            if (img < 25) {
                return "Personne trop maigre";
            } else if (img >= 25 && img <= 30) {
                return "Personne normale";
            } else {
                return "Personne ayant trop de graisse";
            }
        }
    }
}