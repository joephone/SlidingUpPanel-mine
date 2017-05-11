package com.sothree.slidinguppanel.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sothree.slidinguppanel.PinnedHeaderListView;

public class PinnedAct extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinned_head);
        PinnedHeaderListView listView = (PinnedHeaderListView) findViewById(R.id.pinnedListView);
//        LinearLayout header1 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
//        ((TextView) header1.findViewById(R.id.textItem)).setText("HEADER 1");
//        LinearLayout header2 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
//        ((TextView) header2.findViewById(R.id.textItem)).setText("HEADER 2");
//        LinearLayout footer = (LinearLayout) inflator.inflate(R.layout.list_item, null);
//        ((TextView) footer.findViewById(R.id.textItem)).setText("FOOTER");
//        listView.addHeaderView(header1);
//        listView.addHeaderView(header2);
//        listView.addFooterView(footer);
        TestSectionedAdapter sectionedAdapter = new TestSectionedAdapter();
        listView.setAdapter(sectionedAdapter);
    }


}
