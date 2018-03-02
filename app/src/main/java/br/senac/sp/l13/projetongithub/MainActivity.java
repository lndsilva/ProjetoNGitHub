package br.senac.sp.l13.projetongithub;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView =
                (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Toast toast = Toast.makeText(MainActivity.this,
                                "Clique para recentes", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast.show();

                        break;
                    case R.id.action_favorite:
                        Toast toast1 = Toast.makeText(MainActivity.this, "Clique para favoritos", Toast.LENGTH_LONG);
                        toast1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast1.show();

                        break;
                    case R.id.action_location:
                        Toast toast2 = Toast.makeText(MainActivity.this, "Clique para localizar", Toast.LENGTH_LONG);
                        toast2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                        toast2.show();

                        break;
                }

                return true;
            }
        });
    }
}
