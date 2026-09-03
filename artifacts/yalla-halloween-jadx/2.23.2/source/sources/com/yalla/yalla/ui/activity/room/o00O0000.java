package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.widget.ImageView;
import com.yalla.yalla.model.RedPaperList;
import java.util.ArrayList;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends com.yalla.yalla.ui.adapter.OooO0O0<RedPaperList.Data> {
    public o00O0000(Context context, ArrayList arrayList, int i) {
        super(i, context, arrayList);
    }

    @Override // com.yalla.yalla.ui.adapter.OooO0O0
    public final void OooO0O0(com.yalla.yalla.ui.adapter.o00O00o0 o00o00o1, Object obj) {
        RedPaperList.Data data = (RedPaperList.Data) obj;
        o00o00o1.OooO0O0(p562o0oOo000.o0OO00O.txt_title, data.nickname);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f26946OooO0Oo);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = data.headurl;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) o00o00o1.OooO00o(p562o0oOo000.o0OO00O.img_head));
        o00o00o1.OooO0O0(p562o0oOo000.o0OO00O.txt_time, p606o0oo0O0o.o0O0O0o0.OooO0Oo(data.stimetamp, System.currentTimeMillis()));
        o00o00o1.OooO0O0(p562o0oOo000.o0OO00O.txt_coin, data.amount);
        if ("1".equals(data.bestluck)) {
            o00o00o1.OooO00o(p562o0oOo000.o0OO00O.txt_luckiest).setVisibility(0);
        } else {
            o00o00o1.OooO00o(p562o0oOo000.o0OO00O.txt_luckiest).setVisibility(4);
        }
    }
}
