package p445o0OoOoO0;

import androidx.lifecycle.Lifecycle;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<Lifecycle.Event, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47318OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(LinkedAccountsVM linkedAccountsVM, o0oOo0O0 o0ooo0o1) {
        super(1);
        this.f47317OooO0Oo = linkedAccountsVM;
        this.f47318OooO0o0 = o0ooo0o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Lifecycle.Event event) {
        Lifecycle.Event it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == Lifecycle.Event.ON_START) {
            o0oOO.OooO0O0(this.f47317OooO0Oo.syncLinkedAccount(), this.f47318OooO0o0, false, 6);
        }
        return Unit.INSTANCE;
    }
}
