package p027Oooo0o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1939Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o000O00O o000o00o2) {
        super(0);
        this.f1939Oooo0o = o000o00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf((this.f1939Oooo0o.OooO0o() / 100000.0f) + this.f1939Oooo0o.OooO0o0());
    }
}
