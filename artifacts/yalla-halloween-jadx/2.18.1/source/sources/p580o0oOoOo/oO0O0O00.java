package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0O00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f46621Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O00o0 f46622Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f46623Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46624Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(oO0O00o0 oo0o00o0, o00OOOO0 o00oooo1, int i, int i2) {
        super(2);
        this.f46622Oooo0o = oo0o00o0;
        this.f46623Oooo0oO = o00oooo1;
        this.f46624Oooo0oo = i;
        this.f46621Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0O00o0.OooO0oo(this.f46622Oooo0o, this.f46623Oooo0oO, ooo00o, this.f46624Oooo0oo | 1, this.f46621Oooo);
        return Unit.INSTANCE;
    }
}
