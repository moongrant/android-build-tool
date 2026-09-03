package p032OoooO0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import p034OoooO0O.o0000Ooo;
import p054o00000oo.o000O;
import p054o00000oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O extends Lambda implements Function1<o0000Ooo, o000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00OO00O f3188Oooo0o = new o00OO00O();

    public o00OO00O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o000O invoke(o0000Ooo o0000ooo) {
        o0000Ooo deleteIfSelectedOr = o0000ooo;
        Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        o0OOO0o o0ooo0o2 = deleteIfSelectedOr.f3562OooO0OO;
        Integer numValueOf = o0ooo0o2 != null ? Integer.valueOf(deleteIfSelectedOr.OooO0Oo(o0ooo0o2, deleteIfSelectedOr.OooOoo())) : null;
        if (numValueOf != null) {
            return new o000OO0O(0, numValueOf.intValue() - o0OO00O.OooO0Oo(deleteIfSelectedOr.f3564OooO0o));
        }
        return null;
    }
}
