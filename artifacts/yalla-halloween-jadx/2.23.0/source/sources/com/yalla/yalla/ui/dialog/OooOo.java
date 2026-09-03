package com.yalla.yalla.ui.dialog;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomLuckyNumberHistoryModel;
import com.yalla.yalla.ui.view.NumberViews;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends o000O<RoomLuckyNumberHistoryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27858OooOoo0;

    public OooOo(Context context, int i) {
        super(context, i);
        this.f27858OooOoo0 = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomLuckyNumberHistoryModel item = (RoomLuckyNumberHistoryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(oO00O0oO.time);
        String strOooO0OO = o0000oo.OooO0OO(item.getCTime(), "dd-MM-yyyy");
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "this");
        o000OO00.OooO0O0(appCompatTextView);
        LinkedHashMap linkedHashMap = this.f27858OooOoo0;
        if (!linkedHashMap.containsKey(strOooO0OO)) {
            linkedHashMap.put(strOooO0OO, Long.valueOf(item.getId()));
        }
        if (linkedHashMap.containsValue(Long.valueOf(item.getId()))) {
            o000OO00.OooOOOO(appCompatTextView);
        }
        appCompatTextView.setText(strOooO0OO);
        NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.head);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(netImageView.getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.f43926OooOOoo = 3;
        oooO00o.f43911OooO0OO = item.getHeadUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        ((UserNameView) helper.getView(oO00O0oO.name)).setText(item.getNickName());
        ((NumberViews) helper.getView(oO00O0oO.number)).setData((int) item.getLuckNum());
    }
}
