package p027Oooo0o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1770Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f1771Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000O00O o000o00o2, o0OO00O o0oo00o2) {
        super(0);
        this.f1770Oooo0o = o000o00o2;
        this.f1771Oooo0oO = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        o000O00O o000o00o2 = this.f1770Oooo0o;
        return Float.valueOf(o000o00o2.f1883OooOOo0 ? this.f1771Oooo0oO.OooO0oo() + 1.0f : o000o00o2.OooO0o0() + (this.f1770Oooo0o.OooO0o() / 100000.0f));
    }
}
