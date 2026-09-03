package p326o0O0ooO;

import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import o00O0000.o00Oo0;
import p107o000ooO0.Oooo0;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO extends o00oOoo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f37015Oooo = false;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f37016Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f37017Oooo0oo;

    public o0O0ooO(o00oO0o o00oo0o2, String str) {
        this.f37016Oooo0oO = o00oo0o2;
        this.f37017Oooo0oo = str;
    }

    @Override // p326o0O0ooO.o00oOoo
    @WorkerThread
    public final void OooO0O0() {
        WorkDatabase workDatabase = this.f37016Oooo0oO.f29976OooO0OO;
        workDatabase.OooO0OO();
        try {
            Iterator it = ((ArrayList) ((o00Oo0) workDatabase.OooOo0O()).OooO0oO(this.f37017Oooo0oo)).iterator();
            while (it.hasNext()) {
                OooO00o(this.f37016Oooo0oO, (String) it.next());
            }
            workDatabase.OooOOOO();
            workDatabase.OooOO0O();
            if (this.f37015Oooo) {
                o00oO0o o00oo0o2 = this.f37016Oooo0oO;
                Oooo0.OooO00o(o00oo0o2.f29975OooO0O0, o00oo0o2.f29976OooO0OO, o00oo0o2.f29979OooO0o0);
            }
        } catch (Throwable th) {
            workDatabase.OooOO0O();
            throw th;
        }
    }
}
