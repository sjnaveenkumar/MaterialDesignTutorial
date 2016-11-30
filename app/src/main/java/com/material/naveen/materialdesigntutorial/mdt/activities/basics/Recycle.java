package com.material.naveen.materialdesigntutorial.mdt.activities.basics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/4/2015.
 */
public class Recycle extends BaseActivity {

    TextView tv, tv1, tv2;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv = (TextView) findViewById(R.id.txt_recycle_xml);
        tv1 = (TextView) findViewById(R.id.txt_recycle_activity);
        tv2 = (TextView) findViewById(R.id.txt_recycle_ada);
        String xml = "<android.support.v7.widget.RecyclerView\n" +
                "    android:id=\"@+id/my_recycler_view\"\n" +
                "    android:scrollbars=\"vertical\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"/>";
        String activityjava = "public class MyActivity extends Activity {\n" +
                "    private RecyclerView mRecyclerView;\n" +
                "    private RecyclerView.Adapter mAdapter;\n" +
                "    private RecyclerView.LayoutManager mLayoutManager;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.my_activity);\n" +
                "        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);\n" +
                "\n" +
                "        // use this setting to improve performance if you know that changes\n" +
                "        // in content do not change the layout size of the RecyclerView\n" +
                "        mRecyclerView.setHasFixedSize(true);\n" +
                "\n" +
                "        // use a linear layout manager\n" +
                "        mLayoutManager = new LinearLayoutManager(this);\n" +
                "        mRecyclerView.setLayoutManager(mLayoutManager);\n" +
                "\n" +
                "        // specify an adapter (see also next example)\n" +
                "        mAdapter = new MyAdapter(myDataset);\n" +
                "        mRecyclerView.setAdapter(mAdapter);\n" +
                "    }\n" +
                "    ...\n" +
                "}";
        String adap = "public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {\n" +
                "    private String[] mDataset;\n" +
                "\n" +
                "    // Provide a reference to the views for each data item\n" +
                "    // Complex data items may need more than one view per item, and\n" +
                "    // you provide access to all the views for a data item in a view holder\n" +
                "    public static class ViewHolder extends RecyclerView.ViewHolder {\n" +
                "        // each data item is just a string in this case\n" +
                "        public TextView mTextView;\n" +
                "        public ViewHolder(TextView v) {\n" +
                "            super(v);\n" +
                "            mTextView = v;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    // Provide a suitable constructor (depends on the kind of dataset)\n" +
                "    public MyAdapter(String[] myDataset) {\n" +
                "        mDataset = myDataset;\n" +
                "    }\n" +
                "\n" +
                "    // Create new views (invoked by the layout manager)\n" +
                "    @Override\n" +
                "    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,\n" +
                "                                                   int viewType) {\n" +
                "        // create a new view\n" +
                "        View v = LayoutInflater.from(parent.getContext())\n" +
                "                               .inflate(R.layout.my_text_view, parent, false);\n" +
                "        // set the view's size, margins, paddings and layout parameters\n" +
                "        ...\n" +
                "        ViewHolder vh = new ViewHolder(v);\n" +
                "        return vh;\n" +
                "    }\n" +
                "\n" +
                "    // Replace the contents of a view (invoked by the layout manager)\n" +
                "    @Override\n" +
                "    public void onBindViewHolder(ViewHolder holder, int position) {\n" +
                "        // - get element from your dataset at this position\n" +
                "        // - replace the contents of the view with that element\n" +
                "        holder.mTextView.setText(mDataset[position]);\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    // Return the size of your dataset (invoked by the layout manager)\n" +
                "    @Override\n" +
                "    public int getItemCount() {\n" +
                "        return mDataset.length;\n" +
                "    }\n" +
                "}";
        tv.setText(xml);
        tv1.setText(activityjava);
        tv2.setText(adap);


    }
}
