package Oooo000;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function1<o0000O0O.o000oOoO, o0000O0O.o000oOoO> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Integer> f879Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO(Function1<? super Integer, Integer> function1) {
        super(1);
        this.f879Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0000O0O.o000oOoO invoke(o0000O0O.o000oOoO o000oooo2) {
        long j = o000oooo2.f27322OooO00o;
        return new o0000O0O.o000oOoO(o0000O0O.o0OoOo0.OooO00o((int) (j >> 32), this.f879Oooo0o.invoke(Integer.valueOf(o0000O0O.o000oOoO.OooO0O0(j))).intValue()));
    }
}
