package p417o0OoO0;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f45524OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Dialog f45525OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(Dialog dialog) {
        super(0);
        this.f45525OooO0o0 = dialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f45524OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        Dialog dialog = this.f45525OooO0o0;
        if (dialog != null) {
            oo0o0Oo.OooO0Oo(dialog);
        }
        return Unit.INSTANCE;
    }
}
