package p665o0oooO0O;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00O;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f51864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0oOOo f51865OooO0O0;

    public oO00Oo00(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f51865OooO0O0 = source;
        this.f51864OooO00o = 262144;
    }

    @NotNull
    public final o00O OooO00o() throws IOException {
        o00O.OooO00o oooO00o = new o00O.OooO00o();
        while (true) {
            String strOoooO = this.f51865OooO0O0.OoooO(this.f51864OooO00o);
            this.f51864OooO00o -= (long) strOoooO.length();
            if (strOoooO.length() == 0) {
                return oooO00o.OooO0Oo();
            }
            oooO00o.OooO0O0(strOoooO);
        }
    }
}
