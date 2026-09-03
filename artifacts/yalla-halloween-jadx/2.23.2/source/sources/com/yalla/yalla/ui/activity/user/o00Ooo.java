package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.yalla.yalla.model.VisitorModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p473o0OoooOo.o0OOOO0o;
import p506o0o00oOo.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ VisitorModel.Visitor f26933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ h1 f26934OooO0oo;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f26933OooO0oO.isnew = "1";
            o00ooo2.f26934OooO0oo.f50413OooOoo0.f26926OooOo0.notifyDataSetChanged();
        }
    }

    public o00Ooo(h1 h1Var, VisitorModel.Visitor visitor) {
        this.f26934OooO0oo = h1Var;
        this.f26933OooO0oO = visitor;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        VisitorModel.Visitor visitor = this.f26933OooO0oO;
        String vid = visitor.vid;
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(vid, "vid");
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        Intrinsics.checkNotNull(linkedHashMapOooO00o);
        linkedHashMapOooO00o.put("vid", vid);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43378OoooOO0, linkedHashMapOooO00o, oooO00o);
        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
        VisitorActivity visitorActivity = this.f26934OooO0oo.f50413OooOoo0;
        visitorActivity.getClass();
        oooO00o2.OooO00o(visitorActivity, visitor.getUserId() + "");
    }
}
