package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00o0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOOoOOO0 f46730Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46731Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(oOOoOOO0 ooooooo0, int i) {
        super(2);
        this.f46730Oooo0o = ooooooo0;
        this.f46731Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOOoOOO0.OooO0o(this.f46730Oooo0o, ooo00o, this.f46731Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
