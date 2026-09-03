package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.CategoryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RecAdapterTag extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<CategoryModel> f26984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Context f26985OooO0O0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/adapter/RecAdapterTag$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "", "onFormatView", "Lcom/yalla/yalla/model/CategoryModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "position", "size", "setData", "Landroid/widget/TextView;", "tvTag", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ViewHolder extends RecyclerView.o0O0O00 {
        public static final int $stable = 8;

        @NotNull
        private final TextView tvTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(p562o0oOo000.o0OO00O.item_tag_tv_tag);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.tvTag = (TextView) viewFindViewById;
        }

        public final void onFormatView() {
            this.tvTag.setText("");
        }

        public final void setData(@NotNull CategoryModel model, int position, int size) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.tvTag.setText("#" + model.labelname);
            int i = position % 3;
            if (i == 0) {
                this.tvTag.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_tag_bg_ced5de);
            } else if (i == 1) {
                this.tvTag.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_tag_bg_f1d8b6);
            } else {
                if (i != 2) {
                    return;
                }
                this.tvTag.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_tag_bg_c6c1bd);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecAdapterTag(@Nullable List<? extends CategoryModel> list) {
        this.f26984OooO00o = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CategoryModel> list = this.f26984OooO00o;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        ViewHolder holder = (ViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f26985OooO0O0 == null) {
            return;
        }
        holder.onFormatView();
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == 0) {
            marginLayoutParams.setMarginStart(com.code.android.util.o0000O0.OooO00o(15));
            marginLayoutParams.setMarginEnd(com.code.android.util.o0000O0.OooO00o(0));
        } else if (i == getItemCount() - 1) {
            marginLayoutParams.setMarginStart(com.code.android.util.o0000O0.OooO00o(0));
            marginLayoutParams.setMarginEnd(com.code.android.util.o0000O0.OooO00o(9));
        } else {
            float f = 0;
            marginLayoutParams.setMarginStart(com.code.android.util.o0000O0.OooO00o(f));
            marginLayoutParams.setMarginEnd(com.code.android.util.o0000O0.OooO00o(f));
        }
        holder.itemView.setLayoutParams(marginLayoutParams);
        List<CategoryModel> list = this.f26984OooO00o;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        holder.setData(list.get(i), i, list.size());
        holder.itemView.setOnClickListener(new o0000(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.f26985OooO0O0 = context;
        View viewInflate = LayoutInflater.from(context).inflate(p562o0oOo000.oo0o0Oo.item_tag, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate);
    }
}
