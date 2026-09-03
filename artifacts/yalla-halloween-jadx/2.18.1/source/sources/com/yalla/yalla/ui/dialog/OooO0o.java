package com.yalla.yalla.ui.dialog;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.model.RoomLuckyNumberHistoryModel;
import com.yalla.yalla.ui.view.NumberViews;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends p188o00o00o0.OooO0OO<RoomLuckyNumberHistoryModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<String, Long> f23744OooO00o;

    public OooO0o(Context context) {
        super(context, R.layout.room_lucky_number_history_item);
        this.f23744OooO00o = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.Long>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        RoomLuckyNumberHistoryModel item = (RoomLuckyNumberHistoryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.OooO0Oo(R.id.time);
        String strOooO0OO = o00O0.f48624OooO00o.OooO0OO(item.getCTime(), "dd-MM-yyyy");
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "this");
        oOO00O.OooO00o(appCompatTextView);
        if (!this.f23744OooO00o.containsKey(strOooO0OO)) {
            this.f23744OooO00o.put(strOooO0OO, Long.valueOf(item.getId()));
        }
        if (this.f23744OooO00o.containsValue(Long.valueOf(item.getId()))) {
            oOO00O.OooO(appCompatTextView);
        }
        appCompatTextView.setText(strOooO0OO);
        NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.head);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(netImageView.getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48454OooOoo0 = 2;
        oooO00o2.f48444OooOOoo = 3;
        oooO00o2.f48429OooO0OO = item.getHeadUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(netImageView);
        ((UserNameView) helper.OooO0Oo(R.id.name)).setText(item.getNickName());
        ((NumberViews) helper.OooO0Oo(R.id.number)).setData((int) item.getLuckNum());
    }
}
