package com.example.examendam01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText  nota2, nota3, par1, par2,par3;
    TextView res, promedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        par1 = (EditText)findViewById(R.id.txt_parci_nota1);
        par2 = (EditText)findViewById(R.id.txt_parci_nota2);
        par3 = (EditText)findViewById(R.id.txt_parci_nota3);



        nota2 = (EditText)findViewById(R.id.txt_nota2);
        nota3 = (EditText)findViewById(R.id.txt_nota3);
        res = (TextView) findViewById(R.id.txt_resultado);
        promedio = (TextView) findViewById(R.id.txt_prome_parcial);
    }

    public void Param(View v){
        DecimalFormat dc = new DecimalFormat("##,##");

        double not2, not3, result;
        double parcial1, parcial2, parcial3, totParcial;

        parcial1 = Double.valueOf(par1.getText().toString());
        parcial2 = Double.valueOf(par2.getText().toString());
        parcial3 = Double.valueOf(par3.getText().toString());

        totParcial = (parcial1 + parcial2 + parcial3) / 3;

        not2 = Double.valueOf(nota2.getText().toString());
        not3 = Double.valueOf(nota3.getText().toString());

        result = (double)(totParcial*0.40) + (not2*0.35) + (not3*0.25);

        res.setText(" "+ dc.format(result));
        promedio.setText(" "+totParcial);
    }


}