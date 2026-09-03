package p387o0OOooo;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.Executors;
import p145o00Oo0O.o000oOoO;
import p379o0OOoo.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO extends o000oOoO {
    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        if (OooOOOO.f44240OooO00o == null) {
            OooOOOO.f44240OooO00o = Executors.newScheduledThreadPool(5);
        }
        if (OooOOOO.f44241OooO0O0 == null) {
            OooOOOO.f44241OooO0O0 = Executors.newSingleThreadExecutor();
        }
        if (OooOOOO.f44242OooO0OO == null) {
            OooOOOO.f44242OooO0OO = Executors.newSingleThreadExecutor();
        }
        if (OooOOOO.f44243OooO0Oo == null) {
            OooOOOO.f44243OooO0Oo = Executors.newSingleThreadExecutor();
        }
        if (OooOOOO.f44245OooO0o0 == null) {
            OooOOOO.f44245OooO0o0 = Executors.newSingleThreadExecutor();
        }
        if (OooOOOO.f44244OooO0o == null) {
            OooOOOO.f44244OooO0o = Executors.newFixedThreadPool(5);
        }
    }
}
