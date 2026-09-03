package p326o0O0ooO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p107o000ooO0.Oooo0;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 extends o00oOoo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f36982Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ UUID f36983Oooo0oo;

    public o00O0000(o00oO0o o00oo0o2, UUID uuid) {
        this.f36982Oooo0oO = o00oo0o2;
        this.f36983Oooo0oo = uuid;
    }

    @Override // p326o0O0ooO.o00oOoo
    @WorkerThread
    public final void OooO0O0() {
        WorkDatabase workDatabase = this.f36982Oooo0oO.f29976OooO0OO;
        workDatabase.OooO0OO();
        try {
            OooO00o(this.f36982Oooo0oO, this.f36983Oooo0oo.toString());
            workDatabase.OooOOOO();
            workDatabase.OooOO0O();
            o00oO0o o00oo0o2 = this.f36982Oooo0oO;
            Oooo0.OooO00o(o00oo0o2.f29975OooO0O0, o00oo0o2.f29976OooO0OO, o00oo0o2.f29979OooO0o0);
        } catch (Throwable th) {
            workDatabase.OooOO0O();
            throw th;
        }
    }
}
