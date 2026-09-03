package com.yallatech.support.basecore.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.basecore.dialog.SheetAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p603o0oo0O0o.o000O0;
import p603o0oo0O0o.o000O00O;
import p611o0oo0o.Oooo0;
import p611o0oo0o.o00O0O;
import p611o0oo0o.o0OoOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class SheetAdapter extends RecyclerView.Adapter<SheetViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00O0O> f32924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function2<Integer, o00O0O, Unit> f32925OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f32926OooO0OO;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yallatech/support/basecore/dialog/SheetAdapter$SheetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "lib-basecore_release"}, k = 1, mv = {1, 5, 1})
    public static final class SheetViewHolder extends RecyclerView.o0O0O00 {

        @NotNull
        private final TextView tvTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SheetViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(o000O00O.tvItemTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tvItemTitle)");
            this.tvTitle = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getTvTitle() {
            return this.tvTitle;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [o0oo0o.o0OoOo0] */
    public SheetAdapter(@NotNull ArrayList data, @Nullable Oooo0 oooo0) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f32924OooO00o = data;
        this.f32925OooO0O0 = oooo0;
        this.f32926OooO0OO = new View.OnClickListener() { // from class: o0oo0o.o0OoOo0
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function2<Integer, o00O0O, Unit> function2;
                SheetAdapter this$0 = this.f57007OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object tag = view.getTag();
                if (!(tag instanceof Integer) || (function2 = this$0.f32925OooO0O0) == 0) {
                    return;
                }
                function2.invoke((Integer) tag, this$0.f32924OooO00o.get(((Number) tag).intValue()));
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f32924OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        SheetViewHolder holder = (SheetViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTvTitle().setText(this.f32924OooO00o.get(i).f57005OooO00o);
        holder.itemView.setTag(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(o000O0.base_core_item_sheet, parent, false);
        itemView.setOnClickListener(this.f32926OooO0OO);
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new SheetViewHolder(itemView);
    }
}
