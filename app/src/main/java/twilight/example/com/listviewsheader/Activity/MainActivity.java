package twilight.example.com.listviewsheader.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import twilight.example.com.listviewsheader.Adapter.ListHeaderAdapter;
import twilight.example.com.listviewsheader.R;

public class MainActivity extends Activity {

    private ListView listView;
    private ListHeaderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView) findViewById(R.id.sampleListView);

        mAdapter = new ListHeaderAdapter(this);
        for (int i = 1; i < 30; i++) {
            mAdapter.addItem("Row Item #" + i);
            if (i % 4 == 0) {
                mAdapter.addSectionHeaderItem("Section #" + i);
            }
        }
        listView.setAdapter(mAdapter);
    }
}
