package com.yallatech.support.basecore.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.login.OooOOO0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p603o0oo0O.OooOOOO;
import p603o0oo0O.OooOo00;
import p608o0oo0OO0.o000O000;
import p608o0oo0OO0.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class SheetAdapter extends RecyclerView.Adapter<SheetViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o000Oo0> f32389OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function2<Integer, o000Oo0, Unit> f32390OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f32391OooO0OO;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yallatech/support/basecore/dialog/SheetAdapter$SheetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "lib-basecore_release"}, k = 1, mv = {1, 5, 1})
    public static final class SheetViewHolder extends RecyclerView.o0O0O00 {

        @NotNull
        private final TextView tvTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SheetViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(OooOOOO.tvItemTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tvItemTitle)");
            this.tvTitle = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getTvTitle() {
            return this.tvTitle;
        }
    }

    public SheetAdapter(@NotNull ArrayList data, @Nullable o000O000 o000o001) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f32389OooO00o = data;
        this.f32390OooO0O0 = o000o001;
        this.f32391OooO0OO = new OooOOO0(this, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f32389OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        SheetViewHolder holder = (SheetViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTvTitle().setText(this.f32389OooO00o.get(i).f57413OooO00o);
        holder.itemView.setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(OooOo00.base_core_item_sheet, parent, false);
        itemView.setOnClickListener(this.f32391OooO0OO);
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new SheetViewHolder(itemView);
    }
}
