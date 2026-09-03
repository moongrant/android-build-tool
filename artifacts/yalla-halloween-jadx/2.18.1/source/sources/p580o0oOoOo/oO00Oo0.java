package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOOoOOO0 f46547Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f46548Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46549Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo0(oOOoOOO0 ooooooo0, o00O00o0 o00o00o1, int i) {
        super(2);
        this.f46547Oooo0o = ooooooo0;
        this.f46548Oooo0oO = o00o00o1;
        this.f46549Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOOoOOO0.OooO0o0(this.f46547Oooo0o, this.f46548Oooo0oO, ooo00o, this.f46549Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
