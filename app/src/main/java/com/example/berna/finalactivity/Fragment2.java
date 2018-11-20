package com.example.berna.finalactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Fragment2 extends Fragment {

    private static final String TAG = "Fragment2";
    private static RecyclerView recyclerView;
    private Context mContext;
    protected View mView;

    //vars
    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container,false);
        initImageBitmaps();
        initRecyclerView2();
        this.mView = view;
        return view;
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls2.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames2.add("Havasu Falls");

        mImageUrls2.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames2.add("Trondheim");

        mImageUrls2.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames2.add("Portugal");

        mImageUrls2.add("https://kalumatravel.com/data/img/countries/BRA/BRA.jpg");
        mNames2.add("Brasil RJ");

        mImageUrls2.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames2.add("Rocky Mountain National Park");

        mImageUrls2.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames2.add("Mahahual");

        mImageUrls2.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames2.add("Frozen Lake");

        mImageUrls2.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames2.add("White Sands Desert");

        mImageUrls2.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames2.add("Austrailia");

        mImageUrls2.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames2.add("Washington");
    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        recyclerView = mView.findViewById(R.id.recycler_view2);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity().getApplicationContext(), mNames2, mImageUrls2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
    }
}
