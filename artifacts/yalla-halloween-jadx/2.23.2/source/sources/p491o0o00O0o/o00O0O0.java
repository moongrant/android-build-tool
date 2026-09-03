package p491o0o00O0o;

import android.widget.ImageView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f48977OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(LoginActivity loginActivity) {
        super(1);
        this.f48977OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        int i = LoginActivity.f24727OooOo0O;
        LoginActivity loginActivity = this.f48977OooO0Oo;
        ImageView ivLoginWechat = loginActivity.OooOoO().f44273OooO0oo;
        Intrinsics.checkNotNullExpressionValue(ivLoginWechat, "ivLoginWechat");
        Intrinsics.checkNotNull(bool2);
        o000O.OooOOO0(ivLoginWechat, bool2.booleanValue() && loginActivity.OooOoO0().OooO0o());
        LoginActivity.OooOo(loginActivity, Intrinsics.areEqual(o000000O.f56638OooO0OO.getValue(), Boolean.TRUE), bool2.booleanValue());
        return Unit.INSTANCE;
    }
}
