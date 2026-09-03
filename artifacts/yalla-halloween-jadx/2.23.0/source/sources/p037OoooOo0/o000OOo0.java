package p037OoooOo0;

import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.OooO00o;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;
import p245o00oo0o.o00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements o00O000.OooO0OO, o00O.OooO00o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1576OooO0Oo;

    public /* synthetic */ o000OOo0(Object obj) {
        this.f1576OooO0Oo = obj;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o00O0000.OooO00o oooO00o2 = (o00O0000.OooO00o) this.f1576OooO0Oo;
        oooO00o2.f1605OooOOO = oooO00o;
        return "SettableFuture hashCode: " + oooO00o2.hashCode();
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Builder) this.f1576OooO0Oo).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        OooO00o oooO00o = (OooO00o) this.f1576OooO0Oo;
        int i = OooOOO.f11076o0OoOo0;
        ((Player.OooO0OO) obj).onAudioAttributesChanged(oooO00o);
    }
}
