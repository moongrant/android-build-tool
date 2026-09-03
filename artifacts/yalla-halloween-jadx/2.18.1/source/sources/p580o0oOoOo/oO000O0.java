package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;
import p607o0oo0O0.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f46484Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f46485Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46486Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(oO000O0O oo000o0o, o00oO0o o00oo0o2, int i) {
        super(2);
        this.f46484Oooo0o = oo000o0o;
        this.f46485Oooo0oO = o00oo0o2;
        this.f46486Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO000O0O.OooO0Oo(this.f46484Oooo0o, this.f46485Oooo0oO, ooo00o, this.f46486Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
