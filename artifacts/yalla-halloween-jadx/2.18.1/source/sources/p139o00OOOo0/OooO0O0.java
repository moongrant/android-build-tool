package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f31684Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Long> f31685Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f31686Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f31687Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f31688OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o0O00OO<Long> o0o00oo2, long j, long j2, o0O00OO<Boolean> o0o00oo3, o0O00OO<Boolean> o0o00oo4) {
        super(0);
        this.f31685Oooo0o = o0o00oo2;
        this.f31686Oooo0oO = j;
        this.f31687Oooo0oo = j2;
        this.f31684Oooo = o0o00oo3;
        this.f31688OoooO00 = o0o00oo4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00OO<Long> o0o00oo2 = this.f31685Oooo0o;
        long j = this.f31686Oooo0oO;
        long j2 = this.f31687Oooo0oo;
        o0O00OO<Boolean> o0o00oo3 = this.f31684Oooo;
        o0O00OO<Boolean> o0o00oo4 = this.f31688OoooO00;
        o0o00oo2.setValue(Long.valueOf(o0o00oo2.getValue().longValue() + 1));
        OooOO0.OooO00o(o0o00oo2, j, j2, o0o00oo3, o0o00oo4);
        return Unit.INSTANCE;
    }
}
