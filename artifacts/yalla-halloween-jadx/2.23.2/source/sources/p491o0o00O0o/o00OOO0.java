package p491o0o00O0o;

import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f48988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f48989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48990OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(PasswordActivity passwordActivity, String str, String str2) {
        super(1);
        this.f48988OooO0Oo = passwordActivity;
        this.f48990OooO0o0 = str;
        this.f48989OooO0o = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        int i = PasswordActivity.f24770OooOoOO;
        this.f48988OooO0Oo.OooOoO(this.f48990OooO0o0, this.f48989OooO0o);
        return Unit.INSTANCE;
    }
}
