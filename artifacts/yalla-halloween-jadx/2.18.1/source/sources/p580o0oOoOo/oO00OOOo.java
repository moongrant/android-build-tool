package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f46543Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46544Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(oO000O0O oo000o0o, int i) {
        super(2);
        this.f46543Oooo0o = oo000o0o;
        this.f46544Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO000O0O.OooO0oO(this.f46543Oooo0o, ooo00o, this.f46544Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
