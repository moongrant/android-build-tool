package p546o0o0Ooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;
import p545o0o0OoOo.b8;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo00OO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ b8 f44590Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44591Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(b8 b8Var, int i) {
        super(2);
        this.f44590Oooo0o = b8Var;
        this.f44591Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO000Oo0.OooOOO0(this.f44590Oooo0o, ooo00o, this.f44591Oooo0oO | 1);
        return Unit.INSTANCE;
    }
}
