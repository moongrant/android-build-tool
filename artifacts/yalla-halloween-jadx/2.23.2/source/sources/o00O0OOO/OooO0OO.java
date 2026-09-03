package o00O0OOO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import oo00o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OooO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f36278OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f36279OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f36280OooO0oO;

    public OooO0OO(o00000O0 o00000o1, String str, boolean z) {
        this.f36279OooO0o0 = o00000o1;
        this.f36278OooO0o = str;
        this.f36280OooO0oO = z;
    }

    @Override // o00O0OOO.OooO0o
    @WorkerThread
    public final void OooO0O0() {
        o00000O0 o00000o1 = this.f36279OooO0o0;
        WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
        workDatabase.OooO0OO();
        try {
            Iterator it = workDatabase.OooOo0().OooO0o(this.f36278OooO0o).iterator();
            while (it.hasNext()) {
                OooO0o.OooO00o(o00000o1, (String) it.next());
            }
            workDatabase.OooOOO();
            workDatabase.OooOO0();
            if (this.f36280OooO0oO) {
                oo00o.o00oO0o.OooO00o(o00000o1.f60220OooO0O0, o00000o1.f60221OooO0OO, o00000o1.f60224OooO0o0);
            }
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
