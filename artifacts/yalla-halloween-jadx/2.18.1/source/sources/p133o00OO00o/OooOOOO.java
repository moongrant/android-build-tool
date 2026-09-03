package p133o00OO00o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.CategoryModel;
import com.weieyu.yalla.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p254o00ooO0O.o000OO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO extends RecyclerView.Adapter<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<CategoryModel> f31223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Context f31224OooO0O0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final TextView f31225OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.item_tag_tv_tag);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f31225OooO00o = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(@Nullable List<? extends CategoryModel> list) {
        this.f31223OooO00o = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CategoryModel> list = this.f31223OooO00o;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO00o holder = (OooO00o) oo0o0oo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f31224OooO0O0 == null) {
            return;
        }
        holder.f31225OooO00o.setText("");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == 0) {
            marginLayoutParams.setMarginStart(o000OO00.OooO00o(15));
            marginLayoutParams.setMarginEnd(o000OO00.OooO00o(0));
        } else if (i == getItemCount() - 1) {
            marginLayoutParams.setMarginStart(o000OO00.OooO00o(0));
            marginLayoutParams.setMarginEnd(o000OO00.OooO00o(9));
        } else {
            float f = 0;
            marginLayoutParams.setMarginStart(o000OO00.OooO00o(f));
            marginLayoutParams.setMarginEnd(o000OO00.OooO00o(f));
        }
        holder.itemView.setLayoutParams(marginLayoutParams);
        List<CategoryModel> list = this.f31223OooO00o;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        CategoryModel model = this.f31223OooO00o.get(i);
        this.f31223OooO00o.size();
        Intrinsics.checkNotNullParameter(model, "model");
        TextView textView = holder.f31225OooO00o;
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('#');
        sbOooO00o.append(model.labelname);
        textView.setText(sbOooO00o.toString());
        int i2 = i % 3;
        if (i2 == 0) {
            holder.f31225OooO00o.setBackgroundResource(R.drawable.bg_round_tag_bg_ced5de);
        } else if (i2 == 1) {
            holder.f31225OooO00o.setBackgroundResource(R.drawable.bg_round_tag_bg_f1d8b6);
        } else if (i2 == 2) {
            holder.f31225OooO00o.setBackgroundResource(R.drawable.bg_round_tag_bg_c6c1bd);
        }
        holder.itemView.setOnClickListener(new OooOo00(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.f31224OooO0O0 = context;
        View view = LayoutInflater.from(context).inflate(R.layout.item_tag, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OooO00o(view);
    }
}
