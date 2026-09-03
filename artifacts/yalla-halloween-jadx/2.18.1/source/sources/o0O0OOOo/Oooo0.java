package o0O0OOOo;

import android.database.sqlite.SQLiteDatabase;
import com.yalla.yalla.ui.view.MomentDetailForwardView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p174o00OooOO.o0O00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo0 implements oo0o0Oo.OooO00o, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f35647OooO0Oo;

    public /* synthetic */ Oooo0(Object obj) {
        this.f35647OooO0Oo = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailForwardView this$0 = (MomentDetailForwardView) this.f35647OooO0Oo;
        int i = MomentDetailForwardView.f24880Oooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.requireNonNull(this$0);
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        oo0o0Oo oo0o0oo = (oo0o0Oo) this.f35647OooO0Oo;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(oo0o0oo);
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oo0o0oo.f35698Oooo0oO.getTime()).execute();
        return null;
    }
}
