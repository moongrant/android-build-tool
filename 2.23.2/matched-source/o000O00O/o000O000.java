package o000O00O;

import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.Player;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.CommonAdapter;
import io.opentelemetry.proto.trace.v1.Span;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements o000OoO.o00000O0.OooO00o, o00oo0o0.o000OO00.OooO00o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34028OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34029OooO0o0;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f34028OooO0Oo = i;
        this.f34029OooO0o0 = obj;
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Span.Link.Builder) this.f34029OooO0o0).OooO0O0(CommonAdapter.OooO00o((AttributeKey) obj, obj2));
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        p248o00oo0o0.o000OO00 o000oo01 = (p248o00oo0o0.o000OO00) this.f34029OooO0o0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        o0OoOoOo o0oooooo = p248o00oo0o0.o000OO00.f40194OooO;
        o000oo01.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + o000oo01.f40197OooO0o0.getTime()).execute();
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34028OooO0Oo;
        Object obj2 = this.f34029OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onPlayerError(((o00O0OO) obj2).f34109OooO0o);
                return;
            default:
                ((androidx.media3.session.o000OO0O.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}
