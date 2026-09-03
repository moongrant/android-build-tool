package p321o0O0ooO;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import p111o000oooO.o00O00;
import p111o000oooO.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo extends o00 {
    @Override // p321o0O0ooO.o00
    public final boolean OooO00o(@NotNull o00O00 o00o01) {
        o0O0ooO o0o0ooo = o00o01.f35924OooO00o;
        if ((o0o0ooo instanceof o0O0ooO.OooO00o ? ((o0O0ooO.OooO00o) o0o0ooo).f35937OooO00o : Integer.MAX_VALUE) > 100) {
            o0O0ooO o0o0ooo2 = o00o01.f35925OooO0O0;
            if ((o0o0ooo2 instanceof o0O0ooO.OooO00o ? ((o0O0ooO.OooO00o) o0o0ooo2).f35937OooO00o : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // p321o0O0ooO.o00
    public final boolean OooO0O0() {
        boolean z;
        synchronized (o000OOo0.f42850OooO00o) {
            int i = o000OOo0.f42852OooO0OO;
            o000OOo0.f42852OooO0OO = i + 1;
            boolean z2 = true;
            if (i >= 30 || SystemClock.uptimeMillis() > o000OOo0.f42853OooO0Oo + ((long) 30000)) {
                o000OOo0.f42852OooO0OO = 0;
                o000OOo0.f42853OooO0Oo = SystemClock.uptimeMillis();
                String[] list = o000OOo0.f42851OooO0O0.list();
                if (list == null) {
                    list = new String[0];
                }
                if (list.length >= 800) {
                    z2 = false;
                }
                o000OOo0.f42854OooO0o0 = z2;
            }
            z = o000OOo0.f42854OooO0o0;
        }
        return z;
    }
}
