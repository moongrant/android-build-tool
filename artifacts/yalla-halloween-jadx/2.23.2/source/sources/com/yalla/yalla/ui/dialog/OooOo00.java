package com.yalla.yalla.ui.dialog;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.room.RoomLuckyNumberHistoryModel;
import com.yalla.yalla.ui.view.NumberViews;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends o0000oo<RoomLuckyNumberHistoryModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27397OooOoo0;

    public OooOo00(Context context, int i) {
        super(context, i);
        this.f27397OooOoo0 = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomLuckyNumberHistoryModel item = (RoomLuckyNumberHistoryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(o0OO00O.time);
        String strOooO0OO = o0O0O0o0.OooO0OO(item.getCTime(), "dd-MM-yyyy");
        Intrinsics.checkNotNull(appCompatTextView);
        o000O.OooO0O0(appCompatTextView);
        LinkedHashMap linkedHashMap = this.f27397OooOoo0;
        if (!linkedHashMap.containsKey(strOooO0OO)) {
            linkedHashMap.put(strOooO0OO, Long.valueOf(item.getId()));
        }
        if (linkedHashMap.containsValue(Long.valueOf(item.getId()))) {
            o000O.OooOOOO(appCompatTextView);
        }
        appCompatTextView.setText(strOooO0OO);
        NetImageView netImageView = (NetImageView) helper.getView(o0OO00O.head);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(netImageView.getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43151OooOoo0 = 2;
        oooO00o.f43141OooOOoo = 3;
        oooO00o.f43126OooO0OO = item.getHeadUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        ((UserNameView) helper.getView(o0OO00O.name)).setText(item.getNickName());
        ((NumberViews) helper.getView(o0OO00O.number)).setData((int) item.getLuckNum());
    }
}
