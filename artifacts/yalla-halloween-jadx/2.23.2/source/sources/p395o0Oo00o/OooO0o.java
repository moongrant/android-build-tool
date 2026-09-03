package p395o0Oo00o;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.Executors;
import p191o00o0O0.o00Oo0;
import p388o0OOooOO.o00O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o extends o00Oo0 {
    @Override // p191o00o0O0.o00O0O
    public final void run() {
        if (o00O00o0.f43546OooO00o == null) {
            o00O00o0.f43546OooO00o = Executors.newScheduledThreadPool(5);
        }
        if (o00O00o0.f43547OooO0O0 == null) {
            o00O00o0.f43547OooO0O0 = Executors.newSingleThreadExecutor();
        }
        if (o00O00o0.f43548OooO0OO == null) {
            o00O00o0.f43548OooO0OO = Executors.newSingleThreadExecutor();
        }
        if (o00O00o0.f43549OooO0Oo == null) {
            o00O00o0.f43549OooO0Oo = Executors.newSingleThreadExecutor();
        }
        if (o00O00o0.f43551OooO0o0 == null) {
            o00O00o0.f43551OooO0o0 = Executors.newSingleThreadExecutor();
        }
        if (o00O00o0.f43550OooO0o == null) {
            o00O00o0.f43550OooO0o = Executors.newFixedThreadPool(5);
        }
    }
}
