package com.example.recycleview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdpater extends RecyclerView.Adapter<CountryAdpater.TusarViewHolder> {

    private Context context;


    private List<String> countryList;

    public CountryAdpater(Context context, List<String> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    class TusarViewHolder extends RecyclerView.ViewHolder {

        TextView tvCountry;
        TextView tvIndex;

        public TusarViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountry = itemView.findViewById(R.id.lr_tv_country);
            tvIndex = itemView.findViewById(R.id.lr_tv_index);
        }
    }

    @NonNull
    @Override
    public TusarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_row_country, parent, false);

        return new TusarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TusarViewHolder holder, int position) {
        holder.tvCountry.setText(countryList.get(position));
        holder.tvIndex.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return countryList == null ? 0 : countryList.size();
    }

    /* private Context context;


    private  int counter=0;
    private List<String> countryList;

    // private View view;
    private ViewHolder viewHolder;


    public CountryAdpater(Context context, List<String> countryList) {
        this.context = context;
        this.countryList = countryList;


    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public String getItem(int position) {
        return countryList.get(position).toUpperCase();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_row_country, parent, false);

      //     this.viewHolder = ViewHolder.getmInstance(convertView);
            this.viewHolder = new ViewHolder(convertView);
            Log.e("List", "getView Called " + (position + 1));
        }


        String countryName = getItem(counter);

        viewHolder.tvCountry.setText(countryName);
        viewHolder.tvIndex.setText(String.valueOf(counter + 1));
        ++counter;

        return convertView;
    }*/


}

/*
class ViewHolder {
    TextView tvCountry;
    TextView tvIndex;

    private static ViewHolder mInstance;

    private ViewHolder() {
    }

    public static ViewHolder getmInstance(View view) {
        if (mInstance == null) {
            mInstance = new ViewHolder(view);


        }

        return mInstance;
    }

    public ViewHolder(View v) {
        tvCountry = v.findViewById(R.id.lr_tv_country);
        tvIndex = v.findViewById(R.id.lr_tv_index);
        Log.e("List", "view Holder create");
    }
}*/
