package p093o000o0OO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOo;
import p085o000OooO.o0OOO0o;
import p091o000o0O.o0OO00O;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000OOo implements Runnable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f35333OooO0oO = o000oOoO.OooO0o0("StopWorkRunnable");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f35334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f35335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f35336OooO0o0;

    public o000OOo(@NonNull o0OOO0o o0ooo0o2, @NonNull String str, boolean z) {
        this.f35334OooO0Oo = o0ooo0o2;
        this.f35336OooO0o0 = str;
        this.f35335OooO0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zOooOO0O;
        o0OOO0o o0ooo0o2 = this.f35334OooO0Oo;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        OooOo oooOo = o0ooo0o2.f35162OooO0o;
        o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
        workDatabase.OooO0OO();
        try {
            String str = this.f35336OooO0o0;
            synchronized (oooOo.f35132OooOOO) {
                zContainsKey = oooOo.f35123OooO.containsKey(str);
            }
            if (this.f35335OooO0o) {
                zOooOO0O = this.f35334OooO0Oo.f35162OooO0o.OooOO0(this.f35336OooO0o0);
            } else {
                if (!zContainsKey) {
                    oo0o0Oo oo0o0oo = (oo0o0Oo) o0oo00oOooOo00;
                    if (oo0o0oo.OooO0o(this.f35336OooO0o0) == WorkInfo$State.RUNNING) {
                        oo0o0oo.OooOOO0(WorkInfo$State.ENQUEUED, this.f35336OooO0o0);
                    }
                }
                zOooOO0O = this.f35334OooO0Oo.f35162OooO0o.OooOO0O(this.f35336OooO0o0);
            }
            o000oOoO.OooO0OO().OooO00o(f35333OooO0oO, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f35336OooO0o0, Boolean.valueOf(zOooOO0O)), new Throwable[0]);
            workDatabase.OooOOO0();
            workDatabase.OooOO0();
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
