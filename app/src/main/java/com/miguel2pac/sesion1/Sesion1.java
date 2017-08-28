package com.miguel2pac.sesion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Sesion1 extends AppCompatActivity {

    private String nombre, apellido, mail, telefono, sexo, hobbies = "";
    private EditText eNombre, eApellido, eMail, eTelefono;
    private RadioButton rMasculino, rFemenino;
    private CheckBox cCine, cComer, cDormir, cBailar;
    private Spinner sCiudades;

    private TextView tInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion1);

        eNombre = (EditText) findViewById(R.id.eNombre);
        eApellido = (EditText) findViewById(R.id.eApellido);

        tInfo = (TextView) findViewById(R.id.tInfo);
        eMail = (EditText) findViewById(R.id.eMail);
        eTelefono = (EditText) findViewById(R.id.eTelefono);

        rMasculino = (RadioButton) findViewById(R.id.rMasculino);
        rFemenino = (RadioButton) findViewById(R.id.rFemenino);

        cCine = (CheckBox) findViewById(R.id.cCine);
        cComer = (CheckBox) findViewById(R.id.cComer);
        cBailar = (CheckBox) findViewById(R.id.cBailar);
        cDormir = (CheckBox) findViewById(R.id.cDormir);

        sCiudades=(Spinner)findViewById(R.id.sCiudades);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.ciudades,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sCiudades.setAdapter(adapter);
    }

    public void Registrar(View view) {
        nombre = eNombre.getText().toString();
        apellido = eApellido.getText().toString();
        mail = eMail.getText().toString();
        telefono = eTelefono.getText().toString();

        if (rMasculino.isChecked()) {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }
        if (cCine.isChecked()) {
            hobbies += "Cine ";
        }
        if (cComer.isChecked()) {
            hobbies += "Comer ";
        }
        if (cBailar.isChecked()) {
            hobbies += "Bailar ";
        }
        if (cDormir.isChecked()) {
            hobbies += "Dormir ";
        }

        tInfo.setText("Nombre: " + nombre + "\nApellido: "
                + apellido + "\nCorreo: " + mail + "\nTelefono: "
                + telefono + "\nSexo: " + sexo + "\nHobbis: " + hobbies);

    }
}
