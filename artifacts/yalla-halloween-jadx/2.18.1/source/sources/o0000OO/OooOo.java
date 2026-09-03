package o0000OO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f27375Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f27376Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o0O00OO<Boolean> o0o00oo2, o00Oo0 o00oo1) {
        super(0);
        this.f27375Oooo0o = o0o00oo2;
        this.f27376Oooo0oO = o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00OO<Boolean> o0o00oo2 = this.f27375Oooo0o;
        o0o00oo2.setValue(Boolean.valueOf(!o0o00oo2.getValue().booleanValue()));
        this.f27376Oooo0oO.f27406Oooo = true;
        return Unit.INSTANCE;
    }
}
