package p133o00OO00o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.CategoryModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import java.util.List;
import p544o0o0OoOO.d7;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<CategoryModel> f31272OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f31273OooO0O0 = null;

    public class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CategoryModel f31274Oooo;

        public OooO00o(CategoryModel categoryModel) {
            this.f31274Oooo = categoryModel;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = o000oOoO.this.f31273OooO0O0;
            if (oooO0O0 != null) {
                CategoryModel categoryModel = this.f31274Oooo;
                d7 d7Var = (d7) oooO0O0;
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString(ViewHierarchyConstants.TAG_KEY, categoryModel.labelname);
                bundle.putString("tagid", categoryModel.id);
                intent.putExtras(bundle);
                d7Var.f44226OooO00o.setResult(-1, intent);
                d7Var.f44226OooO00o.finish();
            }
        }
    }

    public interface OooO0O0 {
    }

    public class OooO0OO extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f31276OooO00o;

        public OooO0OO(View view) {
            super(view);
            this.f31276OooO00o = (TextView) view.findViewById(R.id.TopBarName);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CategoryModel> list = this.f31272OooO00o;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        oo0o0oo.itemView.getLayoutParams().height = -2;
        OooO0OO oooO0OO = (OooO0OO) oo0o0oo;
        CategoryModel categoryModel = this.f31272OooO00o.get(i);
        oooO0OO.itemView.setOnClickListener(new OooO00o(categoryModel));
        oooO0OO.f31276OooO00o.setText(categoryModel.labelname);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO0OO(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tag_selector, viewGroup, false));
    }
}
