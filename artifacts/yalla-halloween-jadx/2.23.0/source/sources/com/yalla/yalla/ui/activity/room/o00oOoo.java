package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.yalla.yalla.model.RedPaperList;
import java.util.ArrayList;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends com.yalla.yalla.ui.adapter.OooO0O0<RedPaperList.Data> {
    public o00oOoo(Context context, ArrayList arrayList, int i) {
        super(i, context, arrayList);
    }

    @Override // com.yalla.yalla.ui.adapter.OooO0O0
    public final void OooO0O0(com.yalla.yalla.ui.adapter.o00O00OO o00o00oo2, Object obj) {
        RedPaperList.Data data = (RedPaperList.Data) obj;
        o00o00oo2.OooO0O0(oO00O0oO.txt_title, data.nickname);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f27411OooO0Oo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = data.headurl;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) o00o00oo2.OooO00o(oO00O0oO.img_head));
        o00o00oo2.OooO0O0(oO00O0oO.txt_time, p601o0oo0O0.o0000oo.OooO0Oo(data.stimetamp, System.currentTimeMillis()));
        o00o00oo2.OooO0O0(oO00O0oO.txt_coin, data.amount);
        if ("1".equals(data.bestluck)) {
            o00o00oo2.OooO00o(oO00O0oO.txt_luckiest).setVisibility(0);
        } else {
            o00o00oo2.OooO00o(oO00O0oO.txt_luckiest).setVisibility(4);
        }
    }
}
