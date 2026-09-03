package p053o00000oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p301o0O0Oooo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 extends Lambda implements Function1<o000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f27140Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f27141Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000O00O o000o00o2, o000Oo0 o000oo1) {
        super(1);
        this.f27140Oooo0o = o000o00o2;
        this.f27141Oooo0oO = o000oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O0 o000o0) {
        Unit unit;
        o000O0 finalResult = o000o0;
        Intrinsics.checkNotNullParameter(finalResult, "finalResult");
        o000O00O o000o00o2 = this.f27140Oooo0o;
        o00oOoo o00oooo2 = o000o00o2.f27142OooO00o;
        o000Oo0 o000oo1 = this.f27141Oooo0oO;
        synchronized (o00oooo2) {
            if (finalResult.OooO0O0()) {
                o000o00o2.f27143OooO0O0.OooO0O0(o000oo1, finalResult);
            } else {
                o000o00o2.f27143OooO0O0.OooO0OO(o000oo1);
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
