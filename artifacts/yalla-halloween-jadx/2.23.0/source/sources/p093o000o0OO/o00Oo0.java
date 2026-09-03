package p093o000o0OO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p085o000OooO.Oooo0;
import p085o000OooO.o0OOO0o;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f35339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f35340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f35341OooO0oO = false;

    public o00Oo0(o0OOO0o o0ooo0o2, String str) {
        this.f35340OooO0o0 = o0ooo0o2;
        this.f35339OooO0o = str;
    }

    @Override // p093o000o0OO.o00Ooo
    @WorkerThread
    public final void OooO0O0() {
        o0OOO0o o0ooo0o2 = this.f35340OooO0o0;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        workDatabase.OooO0OO();
        try {
            Iterator it = ((oo0o0Oo) workDatabase.OooOo00()).OooO0oO(this.f35339OooO0o).iterator();
            while (it.hasNext()) {
                o00Ooo.OooO00o(o0ooo0o2, (String) it.next());
            }
            workDatabase.OooOOO0();
            workDatabase.OooOO0();
            if (this.f35341OooO0oO) {
                Oooo0.OooO00o(o0ooo0o2.f35159OooO0O0, o0ooo0o2.f35160OooO0OO, o0ooo0o2.f35163OooO0o0);
            }
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
