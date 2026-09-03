package p509o0o00ooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends Lambda implements Function2<String, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50879OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(w1 w1Var) {
        super(2);
        this.f50879OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String notice = str;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(notice, "notice");
        Function2<? super String, ? super Boolean, Unit> function2 = this.f50879OooO0Oo.f50862OooOOOO;
        if (function2 != null) {
            function2.invoke(notice, Boolean.valueOf(zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
