package home2.fiap.com.br.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgUsuario;
    private ImageView imgPc;

    private int[] dados = {R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUsuario = (ImageView)findViewById(R.id.img1);
        imgPc = (ImageView)findViewById(R.id.img2);

    }

    public void jogar (View v){

        Random r = new Random();

        int jogarUsuario = r.nextInt(6);
        int jogarPc = r.nextInt(6);

        imgUsuario.setImageResource(dados[jogarUsuario]);
        imgPc.setImageResource(dados[jogarPc]);

        if(jogarUsuario > jogarPc){
            Toast.makeText(this, "Usuario ganhou do Pc!", Toast.LENGTH_SHORT).show();
        }else if(jogarPc > jogarUsuario){
            Toast.makeText(this, "Pc ganhou do usuario!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Empatou!", Toast.LENGTH_SHORT).show();

        }


    }
}
