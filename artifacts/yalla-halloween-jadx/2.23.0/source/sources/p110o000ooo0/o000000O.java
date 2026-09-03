package p110o000ooo0;

import android.graphics.Bitmap;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p321o0O0ooO.o000O0O0;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p659o0oooO00.o00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f35912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f35913OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35914OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oo0O f35916OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f35917OooO0o0;

    public o000000O(@NotNull o00O0000 o00o0001) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f35912OooO00o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OOo(this));
        this.f35913OooO0O0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000000(this));
        this.f35914OooO0OO = Long.parseLong(o00o0001.OoooO0());
        this.f35915OooO0Oo = Long.parseLong(o00o0001.OoooO0());
        this.f35917OooO0o0 = Integer.parseInt(o00o0001.OoooO0()) > 0;
        int i = Integer.parseInt(o00o0001.OoooO0());
        oo0O.OooO00o oooO00o = new oo0O.OooO00o();
        for (int i2 = 0; i2 < i; i2++) {
            String strOoooO0 = o00o0001.OoooO0();
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOoooO0, ':', 0, false, 6, (Object) null);
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strOoooO0).toString());
            }
            String strSubstring = strOoooO0.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String name = StringsKt.trim((CharSequence) strSubstring).toString();
            String value = strOoooO0.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(value, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            oo0O.OooO0O0.OooO00o(name);
            oooO00o.OooO0O0(name, value);
        }
        this.f35916OooO0o = oooO00o.OooO0OO();
    }

    public final void OooO00o(@NotNull o00 o00Var) throws IOException {
        o00Var.Ooooo00(this.f35914OooO0OO).o00oO0o(10);
        o00Var.Ooooo00(this.f35915OooO0Oo).o00oO0o(10);
        o00Var.Ooooo00(this.f35917OooO0o0 ? 1L : 0L).o00oO0o(10);
        oo0O oo0o = this.f35916OooO0o;
        o00Var.Ooooo00(oo0o.f57369OooO0Oo.length / 2).o00oO0o(10);
        int length = oo0o.f57369OooO0Oo.length / 2;
        for (int i = 0; i < length; i++) {
            o00Var.OooOooo(oo0o.OooO0OO(i));
            o00Var.OooOooo(": ");
            o00Var.OooOooo(oo0o.OooO0o0(i));
            o00Var.o00oO0o(10);
        }
    }

    public o000000O(@NotNull o0oOOo o0oooo) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f35912OooO00o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OOo(this));
        this.f35913OooO0O0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000000(this));
        this.f35914OooO0OO = o0oooo.f57350OooOOO;
        this.f35915OooO0Oo = o0oooo.f57352OooOOOO;
        this.f35917OooO0o0 = o0oooo.f57346OooO0oo != null;
        this.f35916OooO0o = o0oooo.f57341OooO;
    }
}
