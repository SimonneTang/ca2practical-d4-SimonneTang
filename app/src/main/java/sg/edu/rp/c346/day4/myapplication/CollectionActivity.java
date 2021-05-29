package sg.edu.rp.c346.day4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.TextView;

public class CollectionActivity extends AppCompatActivity {
    TextView nustv, ntutv, smutv, sutdtv, sittv, susstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        nustv = findViewById(R.id.textViewnus);
        ntutv = findViewById(R.id.textViewntu);
        smutv = findViewById(R.id.textViewsmu);
        sutdtv = findViewById(R.id.textViewsutd);
        sittv = findViewById(R.id.textViewsit);
        susstv = findViewById(R.id.textViewsuss);

        ntutv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni.putExtra("university", "NUS");
                uni.putExtra("ranking", "11");
                uni.putExtra("description", "The National University of Singapore (NUS) is the first autonomous and research university in Singapore. It is a public university established in 1905 as former King Edward VII College of Medicine, and was established with the merger of the University of Singapore and Nanyang University in 1980.\n");
                startActivity(uni);
            }
        });

        ntutv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni1 = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni1.putExtra("university", "NTU");
                uni1.putExtra("ranking", "13");
                uni1.putExtra("description", "Nanyang Technological University is the second-largest university in Singapore. It is established in 1955 as former Nanyang University, and formed as NTU after the merge with National Institution of Education.\n");
                startActivity(uni1);
            }
        });

        smutv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni2 = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni2.putExtra("university", "SMU");
                uni2.putExtra("ranking", "511-520");
                uni2.putExtra("description", "Singapore Management University is established in 2000, It is Singapore’s third autonomous university. SMU was launched in collaboration with the Wharton School of the University of Pennsylvania which one of the world top business school. SMU is aiming to establish new frontiers in the business education for Singapore and Asia.\n");
                startActivity(uni2);
            }
        });

        sutdtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni3 = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni3.putExtra("university", "SUTD");
                uni3.putExtra("ranking", "NIL");
                uni3.putExtra("description", "Singapore University of Technology and Design founded in 2009, it is the fourth autonomous and public university in Singapore after NUS, NTU and SMU.Different from other public universities in Singapore, students can complete degree programmes in 3.5 years. Coupled with the academic terms starts in May, ahead of other universities which starts in September. SUTD students can graduate eight months earlier than the same batch of students.\n");
                startActivity(uni3);
            }
        });

        sittv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni4 = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni4.putExtra("university", "SIT");
                uni4.putExtra("ranking", "NIL");
                uni4.putExtra("description", "Singapore Institution of Technology established in 2009. It is the fifth autonomous university in Singapore, also the first applied learning university in Singapore. SIT is primarily intended for students who have graduated with an appropriate diploma from one of the Polytechnics in Singapore. Now, SIT also accepting students from Junior colleges in Singapore and students with other international qualifications.\n");
                startActivity(uni4);
            }
        });

        susstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uni5 = new Intent(CollectionActivity.this, DetailsActivity.class);
                uni5.putExtra("university", "SUSS");
                uni5.putExtra("ranking", "NIL");
                uni5.putExtra("description", "Singapore University of Social Sciences sixth autonomous and youngest university in Singapore. It is established in 2005 as former SIM (Singapore Institution of Management) University (UniSIM), and was renamed as Singapore University of Social Sciences in 2017.\n");
                startActivity(uni5);
            }
        });
    }

}