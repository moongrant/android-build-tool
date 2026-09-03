package p502o0o00oOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function2<String, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49699OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(o0oo0000 o0oo0000Var) {
        super(2);
        this.f49699OooO0Oo = o0oo0000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String notice = str;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(notice, "notice");
        Function2<? super String, ? super Boolean, Unit> function2 = this.f49699OooO0Oo.f49498OooOOOO;
        if (function2 != null) {
            function2.invoke(notice, Boolean.valueOf(zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
