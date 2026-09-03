package p611o0oo0o;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo0 extends Lambda implements Function2<Integer, o00O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Dialog f57002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<Integer, o00O0O, Unit> f57003OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(Dialog dialog, Function2<? super Integer, ? super o00O0O, Unit> function2) {
        super(2);
        this.f57002OooO0Oo = dialog;
        this.f57003OooO0o0 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o00O0O o00o0o2) {
        int iIntValue = num.intValue();
        o00O0O a = o00o0o2;
        Intrinsics.checkNotNullParameter(a, "a");
        this.f57002OooO0Oo.dismiss();
        Function2<Integer, o00O0O, Unit> function2 = this.f57003OooO0o0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), a);
        }
        return Unit.INSTANCE;
    }
}
