package o00OO00O;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends o000oOoO {
    @Override // o00OO00O.o000oOoO
    public final boolean OooO00o(@NotNull o000O0Oo o000o0oo2) {
        o000Oo0 o000oo1 = o000o0oo2.f36771OooO00o;
        if ((o000oo1 instanceof o000Oo0.OooO00o ? ((o000Oo0.OooO00o) o000oo1).f36777OooO00o : Integer.MAX_VALUE) > 100) {
            o000Oo0 o000oo2 = o000o0oo2.f36772OooO0O0;
            if ((o000oo2 instanceof o000Oo0.OooO00o ? ((o000Oo0.OooO00o) o000oo2).f36777OooO00o : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OO00O.o000oOoO
    public final boolean OooO0O0() {
        boolean z;
        synchronized (Oooo0.f37084OooO00o) {
            int i = Oooo0.f37086OooO0OO;
            Oooo0.f37086OooO0OO = i + 1;
            boolean z2 = true;
            if (i >= 30 || SystemClock.uptimeMillis() > Oooo0.f37087OooO0Oo + ((long) 30000)) {
                Oooo0.f37086OooO0OO = 0;
                Oooo0.f37087OooO0Oo = SystemClock.uptimeMillis();
                String[] list = Oooo0.f37085OooO0O0.list();
                if (list == null) {
                    list = new String[0];
                }
                if (list.length >= 800) {
                    z2 = false;
                }
                Oooo0.f37088OooO0o0 = z2;
            }
            z = Oooo0.f37088OooO0o0;
        }
        return z;
    }
}
