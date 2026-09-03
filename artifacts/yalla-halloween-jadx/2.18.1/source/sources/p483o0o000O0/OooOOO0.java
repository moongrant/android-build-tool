package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p487o0o000oO.o0OOO0o;
import p539o0o0Oo00.OooOO0;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO0 extends o000000O {
    public OooOOO0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        o00Ooo.OooO0O0 oooO0O0 = new o00Ooo.OooO0O0();
        List<o00Ooo.OooO0OO> list = o00Ooo.f52942OooO00o;
        if (oooO0O0 == o00Ooo.f52944OooO0OO) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<o00Ooo.OooO0OO> list2 = o00Ooo.f52942OooO00o;
        synchronized (list2) {
            list2.add(oooO0O0);
            o00Ooo.f52943OooO0O0 = (o00Ooo.OooO0OO[]) list2.toArray(new o00Ooo.OooO0OO[list2.size()]);
        }
        OooOO0 oooOO1 = OooOO0.f44125OooO00o;
        boolean z = !o0OOO0o.OooO0OO();
        if (z) {
            OooOO0.f44128OooO0Oo = z;
            OooOO0.f44130OooO0o0 = false;
            OooOO0.f44129OooO0o = null;
            OooOO0.f44126OooO0O0 = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(oooOO1);
        }
    }
}
