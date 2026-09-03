package p474o0o00;

import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47243OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(LoginActivity loginActivity) {
        super(1);
        this.f47243OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        int i = LoginActivity.f25186OooOo0O;
        LoginActivity loginActivity = this.f47243OooO0Oo;
        ImageView imageView = loginActivity.OooOoO().f59226OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivLoginWechat");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooOOO0(imageView, it.booleanValue() && loginActivity.OooOoO0().OooO0o());
        LoginActivity.OooOo(loginActivity, Intrinsics.areEqual(o00O0000.f44478OooO0OO.getValue(), Boolean.TRUE), it.booleanValue());
        return Unit.INSTANCE;
    }
}
