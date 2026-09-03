package com.yalla.yalla.ui.adapter.room;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO extends OooO00o {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public View f27699Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f27700Oooo00o;

    public OooO0OO(@Nullable Context context) {
        super(context);
        this.f27700Oooo00o = -1;
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0 */
    public final void OooO0oO(@NotNull ViewHolder helper, @Nullable RoomIndexModel roomIndexModel) {
        View view;
        Intrinsics.checkNotNullParameter(helper, "helper");
        super.OooO0oO(helper, roomIndexModel);
        FrameLayout container = (FrameLayout) helper.getView(oO00O0oO.bannerContainer);
        if (helper.getLayoutPosition() != this.f27700Oooo00o) {
            if (container.getChildCount() > 0 || container.getVisibility() == 0) {
                container.removeAllViews();
                Intrinsics.checkNotNullExpressionValue(container, "container");
                o000OO00.OooO0O0(container);
                return;
            }
            return;
        }
        Intrinsics.checkNotNullExpressionValue(container, "container");
        o000OO00.OooOOOO(container);
        if (container.getChildCount() != 0 || (view = this.f27699Oooo0) == null) {
            if (container.getChildCount() > 0 || container.getVisibility() == 0) {
                container.removeAllViews();
                o000OO00.OooO0O0(container);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(view);
        if (view.getParent() != null) {
            View view2 = this.f27699Oooo0;
            Intrinsics.checkNotNull(view2);
            ViewParent parent = view2.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        container.addView(this.f27699Oooo0);
    }

    public final void OoooO00() {
        int size;
        if (this.f10111OooOOoo.isEmpty()) {
            size = -1;
        } else {
            size = this.f10111OooOOoo.size() >= 3 ? 2 : this.f10111OooOOoo.size() - 1;
        }
        this.f27700Oooo00o = size;
        if (size >= 0) {
            notifyItemChanged(size);
        }
    }
}
