package p506o0o00oOo;

import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p562o0oOo000.o0OOO0o;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50521OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50521OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        UserInfoActivity userInfoActivity = this.f50521OooO0Oo;
        String str3 = userInfoActivity.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str3)) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(userInfoActivity);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(str2);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.white));
            oooO00o.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
