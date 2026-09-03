package p093o000o0OO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import p091o000o0O.OooOo;
import p091o000o0O.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase f35343OooO00o;

    public o00oO0o(@NonNull WorkDatabase workDatabase) {
        this.f35343OooO00o = workDatabase;
    }

    public final int OooO00o(int i) {
        int i2;
        synchronized (o00oO0o.class) {
            WorkDatabase workDatabase = this.f35343OooO00o;
            workDatabase.OooO0OO();
            try {
                Long lOooO00o = ((Oooo0) workDatabase.OooOOOo()).OooO00o("next_job_scheduler_id");
                i2 = 0;
                int iIntValue = lOooO00o != null ? lOooO00o.intValue() : 0;
                ((Oooo0) workDatabase.OooOOOo()).OooO0O0(new OooOo("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.OooOOO0();
                workDatabase.OooOO0();
                if (iIntValue < 0 || iIntValue > i) {
                    ((Oooo0) this.f35343OooO00o.OooOOOo()).OooO0O0(new OooOo("next_job_scheduler_id", 1));
                } else {
                    i2 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        }
        return i2;
    }
}
