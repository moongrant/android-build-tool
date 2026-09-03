package p440o0OoOo0o;

import androidx.lifecycle.Lifecycle;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function1<Lifecycle.Event, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f46132OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(LinkedAccountsVM linkedAccountsVM, o0O0OOO0 o0o0ooo0) {
        super(1);
        this.f46131OooO0Oo = linkedAccountsVM;
        this.f46132OooO0o0 = o0o0ooo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Lifecycle.Event event) {
        Lifecycle.Event it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == Lifecycle.Event.ON_START) {
            v0.OooO0O0(this.f46131OooO0Oo.syncLinkedAccount(), this.f46132OooO0o0, false, 6);
        }
        return Unit.INSTANCE;
    }
}
