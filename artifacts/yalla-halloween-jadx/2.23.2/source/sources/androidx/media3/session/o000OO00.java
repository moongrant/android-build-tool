package androidx.media3.session;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import io.opentelemetry.compat.Supplier;
import io.opentelemetry.sdk.trace.SpanLimits;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OO00 implements o000OOo0.OooO00o, Supplier, o000OoO.o00000O0.OooO00o {
    public /* synthetic */ o000OO00(AnalyticsListener.OooO00o oooO00o, String str) {
    }

    @Override // androidx.media3.session.o000OOo0.OooO00o
    public void OooO0O0(o0000OO0 o0000oo1) {
        o000oOoO o000ooooOooO0o0 = o0000oo1.OooO0o0();
        o000oOoO o000ooooOooO0o1 = o0000oo1.OooO0o0();
        Objects.requireNonNull(o000ooooOooO0o1);
        o000ooooOooO0o0.OoooOoo(new o00000O.OooO00o(o000ooooOooO0o1, 2));
    }

    @Override // io.opentelemetry.compat.Supplier
    public Object get() {
        return SpanLimits.f32993OooO00o;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).oo0o0Oo();
    }
}
