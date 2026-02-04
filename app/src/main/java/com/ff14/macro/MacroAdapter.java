package com.ff14.macro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * 宏列表适配器
 */
public class MacroAdapter extends RecyclerView.Adapter<MacroAdapter.ViewHolder> {

    private List<Macro> macros;
    private String selectedId;
    private OnMacroClickListener listener;

    public interface OnMacroClickListener {
        void onMacroClick(Macro macro);
        void onEditClick(Macro macro);
        void onDeleteClick(Macro macro);
    }

    public MacroAdapter(List<Macro> macros, String selectedId) {
        this.macros = macros;
        this.selectedId = selectedId;
    }

    public void setOnMacroClickListener(OnMacroClickListener listener) {
        this.listener = listener;
    }

    public void setMacros(List<Macro> macros) {
        this.macros = macros;
        notifyDataSetChanged();
    }

    public void setSelectedId(String selectedId) {
        this.selectedId = selectedId;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_macro, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Macro macro = macros.get(position);
        holder.tvMacroName.setText(macro.getName());

        // 高亮选中项
        boolean isSelected = macro.getId().equals(selectedId);
        holder.itemView.setAlpha(isSelected ? 1.0f : 0.7f);
        holder.tvMacroName.setTextColor(
            holder.itemView.getContext().getResources().getColor(
                isSelected ? R.color.ff14_gold : R.color.white
            )
        );

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) listener.onMacroClick(macro);
        });

        holder.btnEdit.setOnClickListener(v -> {
            if (listener != null) listener.onEditClick(macro);
        });

        holder.btnDelete.setOnClickListener(v -> {
            if (listener != null) listener.onDeleteClick(macro);
        });
    }

    @Override
    public int getItemCount() {
        return macros != null ? macros.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMacroName;
        ImageButton btnEdit;
        ImageButton btnDelete;

        ViewHolder(View itemView) {
            super(itemView);
            tvMacroName = itemView.findViewById(R.id.tvMacroName);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}
