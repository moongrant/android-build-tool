package p474o0o00;

import com.facebook.login.LoginManager;
import com.twitter.sdk.android.core.o0OOO0o;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f47334OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(UntieAccountBindActivity untieAccountBindActivity) {
        super(1);
        this.f47334OooO0Oo = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            UntieAccountBindActivity untieAccountBindActivity = this.f47334OooO0Oo;
            int i = untieAccountBindActivity.f25346OooOo0O;
            if (i == 4) {
                LoginManager.INSTANCE.getInstance().logOut();
            } else if (i == 9) {
                o0OOO0o.OooO0OO().f22220OooO00o.OooO00o();
            }
            untieAccountBindActivity.setResult(-1);
            untieAccountBindActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
