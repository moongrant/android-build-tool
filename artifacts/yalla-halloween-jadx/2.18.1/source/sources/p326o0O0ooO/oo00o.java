package p326o0O0ooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOo;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final String f37019Oooo = o0OoOo0.OooO0o0("StopWorkRunnable");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00oO0o f37020Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f37021Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f37022Oooo0oo;

    public oo00o(@NonNull o00oO0o o00oo0o2, @NonNull String str, boolean z) {
        this.f37020Oooo0o = o00oo0o2;
        this.f37021Oooo0oO = str;
        this.f37022Oooo0oo = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zOooOO0;
        o00oO0o o00oo0o2 = this.f37020Oooo0o;
        WorkDatabase workDatabase = o00oo0o2.f29976OooO0OO;
        OooOo oooOo = o00oo0o2.f29978OooO0o;
        o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
        workDatabase.OooO0OO();
        try {
            String str = this.f37021Oooo0oO;
            synchronized (oooOo.f29950OoooOOO) {
                zContainsKey = oooOo.f29946OoooO0.containsKey(str);
            }
            if (this.f37022Oooo0oo) {
                zOooOO0 = this.f37020Oooo0o.f29978OooO0o.OooO(this.f37021Oooo0oO);
            } else {
                if (!zContainsKey) {
                    o00Oo0 o00oo1 = (o00Oo0) o00o0oOooOo0O;
                    if (o00oo1.OooO0o(this.f37021Oooo0oO) == WorkInfo$State.RUNNING) {
                        o00oo1.OooOOOO(WorkInfo$State.ENQUEUED, this.f37021Oooo0oO);
                    }
                }
                zOooOO0 = this.f37020Oooo0o.f29978OooO0o.OooOO0(this.f37021Oooo0oO);
            }
            o0OoOo0.OooO0OO().OooO00o(f37019Oooo, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f37021Oooo0oO, Boolean.valueOf(zOooOO0)), new Throwable[0]);
            workDatabase.OooOOOO();
            workDatabase.OooOO0O();
        } catch (Throwable th) {
            workDatabase.OooOO0O();
            throw th;
        }
    }
}
