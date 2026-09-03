package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O00O extends com.chad.library.adapter.base.OooO00o<oOO00O, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f27613OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Context f27614OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(@NotNull UserDefaultHeadActivity context, @Nullable ArrayList arrayList) {
        super(arrayList);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27614OooOoO0 = context;
        this.f27613OooOoO = -1;
        int i = oOO00O.f27687OooO0o0;
        if (this.f10121OooOo == null) {
            this.f10121OooOo = new SparseIntArray();
        }
        this.f10121OooOo.put(1, i);
        int i2 = oOO00O.f27686OooO0o;
        if (this.f10121OooOo == null) {
            this.f10121OooOo = new SparseIntArray();
        }
        this.f10121OooOo.put(2, i2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder helper, Object obj) {
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel;
        oOO00O model = (oOO00O) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == 1) {
            String str = model.f27690OooO0OO;
            if (str != null) {
                ((TextView) helper.getView(oO00O0oO.title)).setText(str);
                return;
            }
            return;
        }
        if (itemViewType == 2 && (userDefaultHeadItemModel = model.f27689OooO0O0) != null) {
            TextView inUse = (TextView) helper.getView(oO00O0oO.inUse);
            ImageView selected = (ImageView) helper.getView(oO00O0oO.selected);
            NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.head);
            Intrinsics.checkNotNullExpressionValue(selected, "selected");
            com.code.android.util.o000OO00.OooO0OO(selected);
            if (helper.getLayoutPosition() == this.f27613OooOoO) {
                com.code.android.util.o000OO00.OooOOOO(selected);
            }
            Intrinsics.checkNotNullExpressionValue(inUse, "inUse");
            com.code.android.util.o000OO00.OooO0OO(inUse);
            if (userDefaultHeadItemModel.getIsCurrent()) {
                com.code.android.util.o000OO00.OooOOOO(inUse);
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f27614OooOoO0);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = userDefaultHeadItemModel.getUrl();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(netImageView);
        }
    }
}
