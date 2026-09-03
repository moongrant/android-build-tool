package o00O0OOO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import oo00o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UUID f36276OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f36277OooO0o0;

    public OooO0O0(o00000O0 o00000o1, UUID uuid) {
        this.f36277OooO0o0 = o00000o1;
        this.f36276OooO0o = uuid;
    }

    @Override // o00O0OOO.OooO0o
    @WorkerThread
    public final void OooO0O0() {
        o00000O0 o00000o1 = this.f36277OooO0o0;
        WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
        workDatabase.OooO0OO();
        try {
            OooO0o.OooO00o(o00000o1, this.f36276OooO0o.toString());
            workDatabase.OooOOO();
            workDatabase.OooOO0();
            oo00o.o00oO0o.OooO00o(o00000o1.f60220OooO0O0, o00000o1.f60221OooO0OO, o00000o1.f60224OooO0o0);
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
