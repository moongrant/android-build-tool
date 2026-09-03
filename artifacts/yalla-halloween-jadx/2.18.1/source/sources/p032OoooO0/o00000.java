package p032OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.OooO00o;
import p042Ooooo0o.o000O0O0;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends Lambda implements Function1<OooO00o, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3001Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o0O0000O o0o0000o2) {
        super(1);
        this.f3001Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(OooO00o oooO00o) {
        OooO00o it = oooO00o;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<oo0oOO0, Unit> function1 = this.f3001Oooo0o.f3332OooOOOO;
        String str = it.f26756Oooo0o;
        int length = str.length();
        function1.invoke(new oo0oOO0(str, o000O0O0.OooO00o(length, length), 4));
        return Boolean.TRUE;
    }
}
