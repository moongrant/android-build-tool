package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p386o0OOooO.oo0o0Oo;
import p418o0Oo0ooO.b4;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends o00Oo0 {
    public OooOo00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        oO000O0O.OooO0O0 oooO0O0 = new oO000O0O.OooO0O0();
        if (oooO0O0 == oO000O0O.f59917OooO0OO) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = oO000O0O.f59915OooO00o;
        synchronized (arrayList) {
            arrayList.add(oooO0O0);
            oO000O0O.f59916OooO0O0 = (oO000O0O.OooO0OO[]) arrayList.toArray(new oO000O0O.OooO0OO[arrayList.size()]);
        }
        b4 b4Var = b4.f46576OooO00o;
        boolean z = !oo0o0Oo.OooO0o0();
        if (z) {
            b4.f46579OooO0Oo = z;
            b4.f46581OooO0o0 = false;
            b4.f46580OooO0o = null;
            b4.f46577OooO0O0 = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(b4Var);
        }
    }
}
