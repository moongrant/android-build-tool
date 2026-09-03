package p032OoooO0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OO00O;
import p034OoooO0O.o0000Ooo;
import p054o00000oo.o000O;
import p054o00000oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O extends Lambda implements Function1<o0000Ooo, o000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00O f3113Oooo0o = new o00O();

    public o00O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o000O invoke(o0000Ooo o0000ooo) {
        o0000Ooo deleteIfSelectedOr = o0000ooo;
        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        int iOooO0OO = deleteIfSelectedOr.OooO0OO();
        if (iOooO0OO != -1) {
            return new o000OO0O(0, iOooO0OO - o0OO00O.OooO0Oo(deleteIfSelectedOr.f3564OooO0o));
        }
        return null;
    }
}
