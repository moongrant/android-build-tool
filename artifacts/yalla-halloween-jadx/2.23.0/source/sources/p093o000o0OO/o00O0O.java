package p093o000o0OO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p085o000OooO.Oooo0;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends o00Ooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UUID f35337OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f35338OooO0o0;

    public o00O0O(o0OOO0o o0ooo0o2, UUID uuid) {
        this.f35338OooO0o0 = o0ooo0o2;
        this.f35337OooO0o = uuid;
    }

    @Override // p093o000o0OO.o00Ooo
    @WorkerThread
    public final void OooO0O0() {
        o0OOO0o o0ooo0o2 = this.f35338OooO0o0;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        workDatabase.OooO0OO();
        try {
            o00Ooo.OooO00o(o0ooo0o2, this.f35337OooO0o.toString());
            workDatabase.OooOOO0();
            workDatabase.OooOO0();
            Oooo0.OooO00o(o0ooo0o2.f35159OooO0O0, o0ooo0o2.f35160OooO0OO, o0ooo0o2.f35163OooO0o0);
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
