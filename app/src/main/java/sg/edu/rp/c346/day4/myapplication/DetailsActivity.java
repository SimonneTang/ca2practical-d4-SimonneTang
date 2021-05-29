package sg.edu.rp.c346.day4.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    TextView tvdetails;
    Button finishtbtn;
    Boolean textup;
    Boolean textdown;
    String wordclicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvdetails = findViewById(R.id.textViewdetails);
        registerForContextMenu(tvdetails);
        Intent i = getIntent();
        String university = i.getStringExtra("university");
        String ranking = i.getStringExtra("ranking");
        String description = i.getStringExtra("description");
        tvdetails.setText("University name: " + university + "\nWorld Ranking: " + ranking + "\n Description: " + description);

        finishtbtn = findViewById(R.id.buttondfinish);
        finishtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0, 0, 0, "Increase Text size");
        menu.add(1, 1, 1, "Decrease Text size");

        if (v == tvdetails) {
            wordclicked = "description";
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (wordclicked.equals("description")) {
            if (item.getItemId() == 0) {
                textup = true;
                tvdetails.setTextSize(20);
            } else if (item.getItemId() == 1) {
                textdown = true;
                tvdetails.setTextSize(10);
            }
        }
        return super.onContextItemSelected(item);
    }
}