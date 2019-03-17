package com.example.testci.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RadioButtonsAdapter extends RecyclerView.Adapter<RadioButtonsAdapter.RadioViewHolder> {

    // Field when we store position of last clicked item
    private int lastClickedItemPosition;

    @NonNull
    @Override
    public RadioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RadioButton button = new RadioButton(parent.getContext());
        return new RadioViewHolder(button);
    }

    @Override
    public void onBindViewHolder(@NonNull RadioViewHolder holder, int position) {
        holder.radioButton.setText("It is button #" + position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    // Use this method to get lastClickedItemPosition
    public int getLastClickedItemPosition() {
        return lastClickedItemPosition;
    }

    // This is inner class. From this class you can change 'lastClickedItemPosition' field of adapter
    class RadioViewHolder extends RecyclerView.ViewHolder {
        private RadioButton radioButton;

        public RadioViewHolder(@NonNull View itemView) {
            super(itemView);
            radioButton = (RadioButton) itemView;
            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lastClickedItemPosition = getAdapterPosition();
                }
            });
        }
    }
}
