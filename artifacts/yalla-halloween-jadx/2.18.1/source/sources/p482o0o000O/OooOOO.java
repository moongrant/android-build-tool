package p482o0o000O;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.Executors;
import p137o00OO0oo.OooOO0O;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends o000000O {
    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        if (OooOO0O.f31654OooO00o == null) {
            OooOO0O.f31654OooO00o = Executors.newScheduledThreadPool(5);
        }
        if (OooOO0O.f31655OooO0O0 == null) {
            OooOO0O.f31655OooO0O0 = Executors.newSingleThreadExecutor();
        }
        if (OooOO0O.f31656OooO0OO == null) {
            OooOO0O.f31656OooO0OO = Executors.newSingleThreadExecutor();
        }
        if (OooOO0O.f31657OooO0Oo == null) {
            OooOO0O.f31657OooO0Oo = Executors.newSingleThreadExecutor();
        }
        if (OooOO0O.f31659OooO0o0 == null) {
            OooOO0O.f31659OooO0o0 = Executors.newSingleThreadExecutor();
        }
        if (OooOO0O.f31658OooO0o == null) {
            OooOO0O.f31658OooO0o = Executors.newFixedThreadPool(5);
        }
    }
}
