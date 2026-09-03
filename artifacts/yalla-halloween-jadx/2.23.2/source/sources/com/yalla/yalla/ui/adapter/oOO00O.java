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
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO00O extends com.chad.library.adapter.base.OooO00o<o00O00OO, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f27230OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Context f27231OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(@NotNull UserDefaultHeadActivity context, @Nullable ArrayList arrayList) {
        super(arrayList);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27231OooOoO0 = context;
        this.f27230OooOoO = -1;
        int i = o00O00OO.f27127OooO0o0;
        if (this.f13199OooOo == null) {
            this.f13199OooOo = new SparseIntArray();
        }
        this.f13199OooOo.put(1, i);
        int i2 = o00O00OO.f27126OooO0o;
        if (this.f13199OooOo == null) {
            this.f13199OooOo = new SparseIntArray();
        }
        this.f13199OooOo.put(2, i2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder helper, Object obj) {
        UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel;
        o00O00OO model = (o00O00OO) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == 1) {
            String str = model.f27130OooO0OO;
            if (str != null) {
                ((TextView) helper.getView(p562o0oOo000.o0OO00O.title)).setText(str);
                return;
            }
            return;
        }
        if (itemViewType == 2 && (userDefaultHeadItemModel = model.f27129OooO0O0) != null) {
            TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.inUse);
            ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.selected);
            NetImageView netImageView = (NetImageView) helper.getView(p562o0oOo000.o0OO00O.head);
            Intrinsics.checkNotNull(imageView);
            com.code.android.util.o000O.OooO0OO(imageView);
            if (helper.getLayoutPosition() == this.f27230OooOoO) {
                com.code.android.util.o000O.OooOOOO(imageView);
            }
            Intrinsics.checkNotNull(textView);
            com.code.android.util.o000O.OooO0OO(textView);
            if (userDefaultHeadItemModel.getIsCurrent()) {
                com.code.android.util.o000O.OooOOOO(textView);
            }
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27231OooOoO0);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = userDefaultHeadItemModel.getUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(netImageView);
        }
    }
}
