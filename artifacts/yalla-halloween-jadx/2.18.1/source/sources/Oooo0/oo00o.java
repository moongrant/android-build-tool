package Oooo0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o extends Lambda implements Function0<o00O0O.OooO> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO f772Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o0000O0O.OooO, o00O0O.OooO>> f773Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o00O0O.OooO> f774Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo00o(o0000O0O.OooO oooO, oO0Oo<? extends Function1<? super o0000O0O.OooO, o00O0O.OooO>> oo0oo, o0O00OO<o00O0O.OooO> o0o00oo2) {
        super(0);
        this.f772Oooo0o = oooO;
        this.f773Oooo0oO = oo0oo;
        this.f774Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o00O0O.OooO invoke() {
        long jOooO0oO;
        long j = this.f773Oooo0oO.getValue().invoke(this.f772Oooo0o).f30395OooO00o;
        if (o00O0O.OooOO0.OooO0OO(o00O0.OooO00o(this.f774Oooo0oo)) && o00O0O.OooOO0.OooO0OO(j)) {
            jOooO0oO = o00O0O.OooO.OooO0oO(o00O0.OooO00o(this.f774Oooo0oo), j);
        } else {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            jOooO0oO = o00O0O.OooO.f30394OooO0o0;
        }
        return new o00O0O.OooO(jOooO0oO);
    }
}
