package com.pari.studentattendance.Helper_Classes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pari.studentattendance.R;

import java.util.List;

public class StudentRecyclerViewAdapter extends RecyclerView.Adapter<StudentRecyclerViewAdapter.DataHolder>{

    private List<StudentsPOJO> studentsPOJOList;

    public StudentRecyclerViewAdapter(List<StudentsPOJO> studentsPOJOList) {
        updateList(studentsPOJOList);
    }

    public void updateList(List<StudentsPOJO> studentsPOJOList) {
        this.studentsPOJOList = studentsPOJOList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_student_recycler, viewGroup, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder dataHolder, int i) {

        StudentsPOJO studentsPOJO = studentsPOJOList.get(i);

        dataHolder.tvName.setText(studentsPOJO.getName());
        dataHolder.tvStandard.setText(studentsPOJO.getStandard());
        dataHolder.tvPhone.setText(studentsPOJO.getPhone());
    }

    @Override
    public int getItemCount() {
        return studentsPOJOList.size();
    }

    class DataHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvStandard, tvPhone;

        public DataHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvStandard = itemView.findViewById(R.id.tv_standard);
            tvPhone = itemView.findViewById(R.id.tv_phone);
        }
    }

}
