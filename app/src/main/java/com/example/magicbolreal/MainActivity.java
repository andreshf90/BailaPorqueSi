package com.example.magicbolreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

private ImageView ballI;
private TextView respuesta;

private String[]respuestaArray={"Onda Disco", "Muevete como una culebra", "Esta noche la salsa es tu pasión", "Por que no pruebas con chacha", "Baila lo que quieras", "Una romántica",
        "La bachata hoy te domina", "Danza contemporanea", "Algo clásico", "Menea las caderas con un reggeton", "Baila porque si,lo que suene",
        "Baila como un esqueleto", "Libera todo tu cuerpo y muevete", "Esto es el baile del robot", "Y por que no probar con la danza del canguro",
        "Hit del momento", "Imita bailando a alguien", "Solo mueve las piernas", "muevete como si tuvieras frio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballI= findViewById(R.id.boton);
        respuesta= findViewById(R.id.respuesta);

        ballI.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, " Baila Porque Si ", Toast.LENGTH_SHORT).show();

    }

    private void show() {
    }


    public void onClick(View v){
    switch (v.getId()){
        case R.id.boton:
            int random= new Random().nextInt(respuestaArray.length);
            respuesta.setText(respuestaArray[random]);

            break;
    }

    }
}
