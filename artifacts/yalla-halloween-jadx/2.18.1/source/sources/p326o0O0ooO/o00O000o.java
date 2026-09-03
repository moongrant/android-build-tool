package p326o0O0ooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import o00O0000.OooO0o;
import o00O0000.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WorkDatabase f36984OooO00o;

    public o00O000o(@NonNull WorkDatabase workDatabase) {
        this.f36984OooO00o = workDatabase;
    }

    public final int OooO00o(String str) {
        this.f36984OooO00o.OooO0OO();
        try {
            Long lOooO00o = ((OooOO0) this.f36984OooO00o.OooOOo()).OooO00o(str);
            int i = 0;
            int iIntValue = lOooO00o != null ? lOooO00o.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            ((OooOO0) this.f36984OooO00o.OooOOo()).OooO0O0(new OooO0o(str, i));
            this.f36984OooO00o.OooOOOO();
            return iIntValue;
        } finally {
            this.f36984OooO00o.OooOO0O();
        }
    }

    public final int OooO0O0(int i) {
        int iOooO00o;
        synchronized (o00O000o.class) {
            iOooO00o = OooO00o("next_job_scheduler_id");
            if (iOooO00o < 0 || iOooO00o > i) {
                ((OooOO0) this.f36984OooO00o.OooOOo()).OooO0O0(new OooO0o("next_job_scheduler_id", 1));
                iOooO00o = 0;
            }
        }
        return iOooO00o;
    }
}
