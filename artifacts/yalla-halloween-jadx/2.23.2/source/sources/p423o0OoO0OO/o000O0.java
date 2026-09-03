package p423o0OoO0OO;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f46647OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Dialog f46648OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(Dialog dialog) {
        super(0);
        this.f46648OooO0o0 = dialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f46647OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        Dialog dialog = this.f46648OooO0o0;
        if (dialog != null) {
            o000O0Oo.OooO0OO(dialog);
        }
        return Unit.INSTANCE;
    }
}
