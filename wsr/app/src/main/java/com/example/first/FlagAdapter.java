package com.example.first;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FlagAdapter extends BaseAdapter {

    private List<FlagModel> list;
    private LayoutInflater layoutinflater;

    public FlagAdapter(Context context,List<FlagModel> list) {
        this.list = list;
        layoutinflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null)
        {
            view = layoutinflater.inflate(R.layout.list_item, parent, false);

        }
        FlagModel fm = getFlagModel(position);
        TextView tv =(TextView) view.findViewById(R.id.name);
        TextView Date= (TextView) view.findViewById(R.id.Date);
        ImageView iv = (ImageView) view.findViewById(R.id.lv);
        TextView Rang = (TextView) view.findViewById(R.id.Rang);
        TextView Review = (TextView) view.findViewById(R.id.textReview);

        iv.setImageDrawable(fm.getImg());
        Date.setText(fm.getDate().toString());
        tv.setText(fm.getName());
        Rang.setText(fm.getScore());
        Review.setText(fm.getShortReport());

        return view;
    }
    private FlagModel getFlagModel(int pos)
    {
     return (FlagModel) getItem(pos);
    }
}
