package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;

/**
 * Created by Naveen on 12/18/2015.
 */
public class IconTabFragment extends Fragment {


    TextView tv_init, tv_init_java, tv_red, tv_note;
    ImageView img_tab;

    public IconTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tabs, container, false);
        intit(v);
        tv_red.setText("key lines");
        tv_note.setText("Open Tab.java and modify the getPageTitle() method as below and run the project.");
        String tinit = "Setting only icon to tab is same as setting text and icon except the method getPageTitle() in ViewPagerAdapter class returns null instead of tab label.";

        tv_init.setText(tinit);

        String fixed_init =
                "@Override\n" +
                        "public CharSequence getPageTitle(int position) {\n" +
                        " \n" +
                        "    // return null to display only the icon\n" +
                        "    return null;\n" +
                        "}";
        tv_init_java.setText(fixed_init);


        return v;
    }

    public void intit(View v) {
        tv_init = (TextView) v.findViewById(R.id.txt_tab_init);
        tv_init_java = (TextView) v.findViewById(R.id.txt_tab_init_classs);
        tv_note = (TextView) v.findViewById(R.id.txt_tab_note);
        tv_red = (TextView) v.findViewById(R.id.txt_tab_red_xml);
        img_tab = (ImageView) v.findViewById(R.id.img_tab_eg);
        img_tab.setImageResource(R.drawable.icon_tab);

    }

}
