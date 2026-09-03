package o00000O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    public static final void OooO00o(@NotNull p145o00Oo0.o0O0O00 canvas, @NotNull o0OOO0o textLayoutResult) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        boolean z = false;
        if (((((float) ((int) (textLayoutResult.f26879OooO0OO >> 32))) > textLayoutResult.f26878OooO0O0.f26776OooO0Oo ? 1 : (((float) ((int) (textLayoutResult.f26879OooO0OO >> 32))) == textLayoutResult.f26878OooO0O0.f26776OooO0Oo ? 0 : -1)) < 0) || textLayoutResult.OooO0Oo()) {
            if (textLayoutResult.f26877OooO00o.f26889OooO0o == 1) {
                z = true;
            }
        }
        if (z) {
            long j = textLayoutResult.f26879OooO0OO;
            float f = (int) (j >> 32);
            float fOooO0O0 = o0000O0O.o000oOoO.OooO0O0(j);
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            o00O0O.OooOO0O oooOO0OOooO00o = o00O0O.OooOOO0.OooO00o(o00O0O.OooO.f30392OooO0OO, o00O0O.OooOo.OooO00o(f, fOooO0O0));
            canvas.OooO0oo();
            canvas.OooO0oO(oooOO0OOooO00o, 1);
        }
        try {
            p145o00Oo0.o0Oo0oo o0oo0ooOooO0O0 = textLayoutResult.f26877OooO00o.f26886OooO0O0.OooO0O0();
            if (o0oo0ooOooO0O0 != null) {
                OooO0o oooO0o = textLayoutResult.f26878OooO0O0;
                o00Oo0 o00oo1 = textLayoutResult.f26877OooO00o.f26886OooO0O0.f26901OooO00o;
                oooO0o.OooO0O0(canvas, o0oo0ooOooO0O0, o00oo1.f26870OooOOO, o00oo1.f26871OooOOO0);
            } else {
                OooO0o oooO0o2 = textLayoutResult.f26878OooO0O0;
                long jOooO0OO = textLayoutResult.f26877OooO00o.f26886OooO0O0.OooO0OO();
                o00Oo0 o00oo2 = textLayoutResult.f26877OooO00o.f26886OooO0O0.f26901OooO00o;
                oooO0o2.OooO0OO(canvas, jOooO0OO, o00oo2.f26870OooOOO, o00oo2.f26871OooOOO0);
            }
        } finally {
            if (z) {
                canvas.OooOOo0();
            }
        }
    }
}
