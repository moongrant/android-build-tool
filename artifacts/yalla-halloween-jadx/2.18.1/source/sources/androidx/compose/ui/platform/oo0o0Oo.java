package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static Function1<? super p054o00000oo.o00O0O0O, ? extends p054o00000oo.o00OO000> f6644OooO00o = OooO00o.f6645Oooo0o;

    public static final class OooO00o extends Lambda implements Function1<p054o00000oo.o00O0O0O, p054o00000oo.o00OO000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6645Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p054o00000oo.o00OO000 invoke(p054o00000oo.o00O0O0O o00o0o0o2) {
            p054o00000oo.o00O0O0O it = o00o0o0o2;
            Intrinsics.checkNotNullParameter(it, "it");
            return new p054o00000oo.o00OO000(it);
        }
    }

    public static final void OooO00o(float[] fArr, float[] fArr2) {
        float fOooO0O0 = OooO0O0(fArr2, 0, fArr, 0);
        float fOooO0O1 = OooO0O0(fArr2, 0, fArr, 1);
        float fOooO0O2 = OooO0O0(fArr2, 0, fArr, 2);
        float fOooO0O3 = OooO0O0(fArr2, 0, fArr, 3);
        float fOooO0O4 = OooO0O0(fArr2, 1, fArr, 0);
        float fOooO0O5 = OooO0O0(fArr2, 1, fArr, 1);
        float fOooO0O6 = OooO0O0(fArr2, 1, fArr, 2);
        float fOooO0O7 = OooO0O0(fArr2, 1, fArr, 3);
        float fOooO0O8 = OooO0O0(fArr2, 2, fArr, 0);
        float fOooO0O9 = OooO0O0(fArr2, 2, fArr, 1);
        float fOooO0O10 = OooO0O0(fArr2, 2, fArr, 2);
        float fOooO0O11 = OooO0O0(fArr2, 2, fArr, 3);
        float fOooO0O12 = OooO0O0(fArr2, 3, fArr, 0);
        float fOooO0O13 = OooO0O0(fArr2, 3, fArr, 1);
        float fOooO0O14 = OooO0O0(fArr2, 3, fArr, 2);
        float fOooO0O15 = OooO0O0(fArr2, 3, fArr, 3);
        fArr[0] = fOooO0O0;
        fArr[1] = fOooO0O1;
        fArr[2] = fOooO0O2;
        fArr[3] = fOooO0O3;
        fArr[4] = fOooO0O4;
        fArr[5] = fOooO0O5;
        fArr[6] = fOooO0O6;
        fArr[7] = fOooO0O7;
        fArr[8] = fOooO0O8;
        fArr[9] = fOooO0O9;
        fArr[10] = fOooO0O10;
        fArr[11] = fOooO0O11;
        fArr[12] = fOooO0O12;
        fArr[13] = fOooO0O13;
        fArr[14] = fOooO0O14;
        fArr[15] = fOooO0O15;
    }

    public static final float OooO0O0(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 0] * fArr2[0 + i2]);
    }
}
