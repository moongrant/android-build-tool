package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Long> f31716Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f31717Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f31718Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(o0O00OO<Long> o0o00oo2, long j, o0O00OO<Boolean> o0o00oo3) {
        super(0);
        this.f31716Oooo0o = o0o00oo2;
        this.f31717Oooo0oO = j;
        this.f31718Oooo0oo = o0o00oo3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00OO<Long> o0o00oo2 = this.f31716Oooo0o;
        o0o00oo2.setValue(Long.valueOf(o0o00oo2.getValue().longValue() + ((long) 100)));
        this.f31718Oooo0oo.setValue(Boolean.valueOf(this.f31716Oooo0o.getValue().longValue() > this.f31717Oooo0oO));
        return Unit.INSTANCE;
    }
}
