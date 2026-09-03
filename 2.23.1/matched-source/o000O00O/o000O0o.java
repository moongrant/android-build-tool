package o000O00O;

import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.Player;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;
import p233o00oOoOO.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0o implements o000OoO.o00000.OooO00o, o00oo0o0.o000O.OooO00o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34028OooO0o0;

    public /* synthetic */ o000O0o(Object obj, int i) {
        this.f34027OooO0Oo = i;
        this.f34028OooO0o0 = obj;
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Link.Builder) this.f34028OooO0o0).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o00oo0o0.o000O.OooO00o
    public final Object apply(Object obj) {
        p248o00oo0o0.o000O o000o = (p248o00oo0o0.o000O) this.f34028OooO0o0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        o0O000Oo o0o000oo2 = p248o00oo0o0.o000O.f40174OooO;
        o000o.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + o000o.f40177OooO0o0.getTime()).execute();
        return null;
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34027OooO0Oo;
        Object obj2 = this.f34028OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onPlayerError(((o00O0OOO) obj2).f34101OooO0o);
                return;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}
