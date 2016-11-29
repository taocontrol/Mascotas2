package com.eisusquiza.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mRefresh: //AQUI ESCRIBIR LA ACCION
                Intent intent  = new Intent(this, Main2Activity.class );
                startActivity(intent);
            }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init();

        Button btnHueso = (Button) findViewById(R.id.btnHueso);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        //btnHueso.setOnClickListener(new OnClickListener() {

            //VISUALIZAR TEXTO
          //  TextView tv = (TextView)findViewById(R.id.texto);

            //DECLARAR CONTADOR
//            int contador = 0;

  //          @Override
    //        public void onClick(View v) {
    //            // TODO Auto-generated method stub
    //            contador++;

                // MODIFICAR TEXTO DEL TEXTVIEW
      //          tv.setText("Contador: " +contador);


        //    }
       // });


    //}

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
        }


    public ContactoAdaptador adaptador;

    public void inicializarAdaptador() {
        adaptador = new ContactoAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos() {

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.chase_png, "Chase",5));
        mascotas.add(new Mascota(R.drawable.everest_png, "Everest",3));
        mascotas.add(new Mascota(R.drawable.rocky_png, "Rocky",3));
        mascotas.add(new Mascota(R.drawable.rubble_png, "Rubble",4));
        mascotas.add(new Mascota(R.drawable.marshall_png, "Marshall",7));
        mascotas.add(new Mascota(R.drawable.skye_png, "Skye",8));
        mascotas.add(new Mascota(R.drawable.zuma_png, "Zuma",5));

    }




}
