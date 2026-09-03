package p506o0o00oOo;

import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OOO0o;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50402OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50402OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        UserInfoEditActivity userInfoEditActivity = this.f50402OooO0Oo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(userInfoEditActivity);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(str);
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.white));
        int i = UserInfoEditActivity.f26818Oooo0oO;
        oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f45663OooO0oo);
        return Unit.INSTANCE;
    }
}
