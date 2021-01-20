package twu.rdillman1_hjung1.twu_bucket_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BucketListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucket_list_activity);
        getSupportActionBar().hide();
    }
}