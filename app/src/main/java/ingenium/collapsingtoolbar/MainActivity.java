package ingenium.collapsingtoolbar;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        show the title for the ToolBar and it looks like
        collapsingToolbarLayout.setTitle("Collapsing");
//        adding transparency
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
//        Adding parallax color
        collapsingToolbarLayout.setContentScrimColor(Color.parseColor("#3f1f09"));
        collapsingToolbarLayout.setStatusBarScrimColor(Color.parseColor("#D50000"));

        TextView tst=(TextView)findViewById(R.id.first);

        tst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Kaj kore",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
