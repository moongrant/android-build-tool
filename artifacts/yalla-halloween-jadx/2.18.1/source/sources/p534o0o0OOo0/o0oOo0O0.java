package p534o0o0OOo0;

import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOo0O0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f43600Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f43601Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f43602Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(PasswordActivity passwordActivity, String str, String str2) {
        super(1);
        this.f43600Oooo0o = passwordActivity;
        this.f43601Oooo0oO = str;
        this.f43602Oooo0oo = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        PasswordActivity passwordActivity = this.f43600Oooo0o;
        String str = this.f43601Oooo0oO;
        String str2 = this.f43602Oooo0oo;
        PasswordActivity.OooO00o oooO00o = PasswordActivity.f21781OoooooO;
        passwordActivity.Oooo000(str, str2);
        return Unit.INSTANCE;
    }
}
