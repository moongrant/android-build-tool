package p539o0o0OoOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y0 f55654OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(y0 y0Var) {
        super(2);
        this.f55654OooO0Oo = y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Function2<? super String, ? super Integer, Unit> function2 = this.f55654OooO0Oo.f55751OooO0Oo;
        if (function2 != null) {
            function2.invoke(gifUrl, Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
