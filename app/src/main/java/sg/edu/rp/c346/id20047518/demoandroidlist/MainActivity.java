package sg.edu.rp.c346.id20047518.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    //ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        lv = findViewById( R.id.lv );
        al = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion( "Pie","9.0"  );
        AndroidVersion item2 = new AndroidVersion( "Oreo","8.0 - 8.1"  );
        AndroidVersion item3 = new AndroidVersion( "Nougat","7.0 - 7.1.2"  );

        al.add( item1 );
        al.add( item2 );
        al.add( item3 );

        /*
        al.add(new AndroidVersion( "Oreo - 8.0 - 8.1" ) );
        al.add(new AndroidVersion( "Nougat - 7.0 - 7.1.2" ));
        al.add(new AndroidVersion( "Marshmallow - 6.0 - 6.0.1 ));
        al.add(new AndroidVersion( "Lollipop - 5.0 - 5.1.1" ));
        al.add(new AndroidVersion( "Kitkat - 4.4 - 4.4.4" ));
        al.add(new AndroidVersion( "Jelly Bean - 4.1 - 4.3.1" ) );
        */
        //aa = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,al );
        //lv.setAdapter( aa );
        adapter = new CustomAdapter( MainActivity.this,R.layout.row, al );
        lv.setAdapter( adapter );
    }
}