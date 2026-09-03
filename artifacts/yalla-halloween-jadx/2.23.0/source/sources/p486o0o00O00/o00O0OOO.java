package p486o0o00O00;

import com.yalla.yalla.ui.vm.account.LoginTouristVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginTouristVM f48312OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(LoginTouristVM loginTouristVM) {
        super(0);
        this.f48312OooO0Oo = loginTouristVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f48312OooO0Oo.loginByTourists();
        return Unit.INSTANCE;
    }
}
