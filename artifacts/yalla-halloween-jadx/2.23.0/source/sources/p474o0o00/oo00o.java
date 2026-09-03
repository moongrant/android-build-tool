package p474o0o00;

import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f47350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47351OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(PasswordActivity passwordActivity, String str, String str2) {
        super(1);
        this.f47349OooO0Oo = passwordActivity;
        this.f47351OooO0o0 = str;
        this.f47350OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        int i = PasswordActivity.f25224OooOoOO;
        this.f47349OooO0Oo.OooOoO(this.f47351OooO0o0, this.f47350OooO0o);
        return Unit.INSTANCE;
    }
}
