package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p410o0Oo0oO.OooOo00;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo extends o000oOoO {
    public oo0o0Oo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        wc.OooO0O0 oooO0O0 = new wc.OooO0O0();
        if (oooO0O0 == wc.f60336OooO0OO) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = wc.f60334OooO00o;
        synchronized (arrayList) {
            arrayList.add(oooO0O0);
            wc.f60335OooO0O0 = (wc.OooO0OO[]) arrayList.toArray(new wc.OooO0OO[arrayList.size()]);
        }
        OooOo00 oooOo00 = OooOo00.f45226OooO00o;
        boolean z = !o00Ooo.OooO0o0();
        if (z) {
            OooOo00.f45229OooO0Oo = z;
            OooOo00.f45231OooO0o0 = false;
            OooOo00.f45230OooO0o = null;
            OooOo00.f45227OooO0O0 = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(oooOo00);
        }
    }
}
