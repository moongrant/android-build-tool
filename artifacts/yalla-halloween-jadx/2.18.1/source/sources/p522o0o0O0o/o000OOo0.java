package p522o0o0O0o;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42991Oooo0o = null;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Dialog f42992Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(Dialog dialog) {
        super(0);
        this.f42992Oooo0oO = dialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.f42991Oooo0o;
        if (function0 != null) {
            function0.invoke();
        }
        Dialog dialog = this.f42992Oooo0oO;
        if (dialog != null) {
            dialog.show();
        }
        return Unit.INSTANCE;
    }
}
