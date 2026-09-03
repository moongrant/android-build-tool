package p029Oooo0oO;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2418Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O00 f2419Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(o00OOOOo o00ooooo2, o00O00 o00o01) {
        super(0);
        this.f2418Oooo0o = o00ooooo2;
        this.f2419Oooo0oO = o00o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        o00OOOOo o00ooooo2 = this.f2418Oooo0o;
        return Float.valueOf(o00ooooo2.f2397OooOOoo ? this.f2419Oooo0oO.OooO0oo() + 1.0f : o00ooooo2.OooO0Oo() + (this.f2418Oooo0o.OooO0o0() / 100000.0f));
    }
}
