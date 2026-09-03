package p464o0Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OO00O f46817OooO0Oo = new o00OO00O();

    public o00OO00O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String value = str;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(value, "it");
        o00oooOooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        o00oooOooO00o.OooO("medal", value);
        return Unit.INSTANCE;
    }
}
