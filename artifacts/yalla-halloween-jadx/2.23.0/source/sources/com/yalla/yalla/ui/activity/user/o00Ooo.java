package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.yalla.yalla.model.VisitorModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p466o0Oooo0o.oo00o;
import p496o0o00o.oO0oO000;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VisitorModel.Visitor f27398OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO0oO000 f27399OooO0oo;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f27398OooO0oO.isnew = "1";
            o00ooo2.f27399OooO0oo.f49177OooOoo0.f27391OooOo0.notifyDataSetChanged();
        }
    }

    public o00Ooo(oO0oO000 oo0oo000, VisitorModel.Visitor visitor) {
        this.f27399OooO0oo = oo0oo000;
        this.f27398OooO0oO = visitor;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        VisitorModel.Visitor visitor = this.f27398OooO0oO;
        String vid = visitor.vid;
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(vid, "vid");
        LinkedHashMap params = oO00o000.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("vid", vid);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44119OoooOO0, params, oooO00o);
        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
        VisitorActivity visitorActivity = this.f27399OooO0oo.f49177OooOoo0;
        visitorActivity.getClass();
        oooO00o2.OooO00o(visitorActivity, visitor.getUserId() + "");
    }
}
