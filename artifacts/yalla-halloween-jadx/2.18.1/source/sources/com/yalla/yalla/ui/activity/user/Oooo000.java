package com.yalla.yalla.ui.activity.user;

import android.view.View;
import com.app.base.model.VisitorModel;
import java.util.Map;
import java.util.Objects;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p566o0oOo00O.oO000o00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ VisitorModel.Visitor f23357Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oO000o00 f23358OoooO00;

    public class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o() {
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            Oooo000 oooo000 = Oooo000.this;
            oooo000.f23357Oooo.isnew = "1";
            oooo000.f23358OoooO00.f45370OooO00o.f23634Ooooo0o.notifyDataSetChanged();
        }
    }

    public Oooo000(oO000o00 oo000o00, VisitorModel.Visitor visitor) {
        this.f23358OoooO00 = oo000o00;
        this.f23357Oooo = visitor;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        String str = this.f23357Oooo.vid;
        OooO00o oooO00o = new OooO00o();
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("vid", str);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32263OoooOO0, mapOooO0O0, oooO00o);
        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f23452o0ooOO0;
        VisitorActivity visitorActivity = this.f23358OoooO00.f45370OooO00o;
        Objects.requireNonNull(visitorActivity);
        oooO00o2.OooO00o(visitorActivity, this.f23357Oooo.getUserId() + "");
    }
}
