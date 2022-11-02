package com.LeJammes454.proyectofinalagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


    }

    //Activando el toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
    //
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemView =item.itemId
        when(itemView){
            R.id.idayuda->Toast.makeText(applicationContext,"Click en ayuda",Toast.LENGTH_SHORT).show()
            R.id.idacercade->Toast.makeText(applicationContext,"Click en acerca de",Toast.LENGTH_SHORT).show()
            R.id.app_bar_search->Toast.makeText(applicationContext,"Click buscar",Toast.LENGTH_SHORT).show()
        }
        return false
    }
}