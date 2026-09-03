package p624o0oo0oOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p563o0oOo0.o0000OO0;
import p622o0oo0oO.o000O0;
import p622o0oo0oO.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0 extends RecyclerView.Adapter<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<oO0O0O00> f48656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function2<Integer, oO0O0O00, Unit> f48657OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f48658OooO0OO;

    public static final class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final TextView f48659OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(o000O00O.tvItemTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tvItemTitle)");
            this.f48659OooO00o = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO0O0(@NotNull List<oO0O0O00> data, @Nullable Function2<? super Integer, ? super oO0O0O00, Unit> function2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f48656OooO00o = data;
        this.f48657OooO0O0 = function2;
        this.f48658OooO0OO = new o0000OO0(this, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f48656OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO00o holder = (OooO00o) oo0o0oo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.f48659OooO00o.setText(this.f48656OooO00o.get(i).f48666OooO00o);
        holder.itemView.setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(o000O0.base_core_item_sheet, parent, false);
        itemView.setOnClickListener(this.f48658OooO0OO);
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new OooO00o(itemView);
    }
}
