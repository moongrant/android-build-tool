package com.yalla.yalla.ui.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.ui.activity.room.SelectRoomTagActivity;
import com.yalla.yalla.ui.activity.room.o0O0O0O;
import java.util.List;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectorTagAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<CategoryModel> f26990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f26991OooO0O0 = null;

    public class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CategoryModel f26992OooO0oO;

        public OooO00o(CategoryModel categoryModel) {
            this.f26992OooO0oO = categoryModel;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = SelectorTagAdapter.this.f26991OooO0O0;
            if (oooO0O0 != null) {
                o0O0O0O o0o0o0o = (o0O0O0O) oooO0O0;
                o0o0o0o.getClass();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                CategoryModel categoryModel = this.f26992OooO0oO;
                bundle.putString(ViewHierarchyConstants.TAG_KEY, categoryModel.labelname);
                bundle.putString("tagid", categoryModel.id);
                intent.putExtras(bundle);
                SelectRoomTagActivity selectRoomTagActivity = o0o0o0o.f26453OooO00o;
                selectRoomTagActivity.setResult(-1, intent);
                selectRoomTagActivity.finish();
            }
        }
    }

    public interface OooO0O0 {
    }

    public class ViewHolder extends RecyclerView.o0O0O00 {
        TextView tvName;

        public ViewHolder(View view) {
            super(view);
            this.tvName = (TextView) view.findViewById(p562o0oOo000.o0OO00O.TopBarName);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CategoryModel> list = this.f26990OooO00o;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        o0o0o00.itemView.getLayoutParams().height = -2;
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        CategoryModel categoryModel = this.f26990OooO00o.get(i);
        viewHolder.itemView.setOnClickListener(new OooO00o(categoryModel));
        viewHolder.tvName.setText(categoryModel.labelname);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(p562o0oOo000.oo0o0Oo.item_tag_selector, viewGroup, false));
    }
}
