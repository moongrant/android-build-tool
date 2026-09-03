package p608o0oo0OO0;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function2<Integer, o000Oo0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Dialog f57409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<Integer, o000Oo0, Unit> f57410OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O000(Dialog dialog, Function2<? super Integer, ? super o000Oo0, Unit> function2) {
        super(2);
        this.f57409OooO0Oo = dialog;
        this.f57410OooO0o0 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o000Oo0 o000oo1) {
        int iIntValue = num.intValue();
        o000Oo0 a = o000oo1;
        Intrinsics.checkNotNullParameter(a, "a");
        this.f57409OooO0Oo.dismiss();
        Function2<Integer, o000Oo0, Unit> function2 = this.f57410OooO0o0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), a);
        }
        return Unit.INSTANCE;
    }
}
