package p129o00O0oOo;

import android.graphics.Bitmap;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00o00;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f36738OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f36739OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f36740OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f36741OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0O000 f36742OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36743OooO0o0;

    public o00(@NotNull o0o0000 o0o0000Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f36738OooO00o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OO00(this));
        this.f36739OooO0O0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OOo0(this));
        this.f36740OooO0OO = Long.parseLong(o0o0000Var.OoooO0O());
        this.f36741OooO0Oo = Long.parseLong(o0o0000Var.OoooO0O());
        this.f36743OooO0o0 = Integer.parseInt(o0o0000Var.OoooO0O()) > 0;
        int i = Integer.parseInt(o0o0000Var.OoooO0O());
        o0O000.OooO00o oooO00o = new o0O000.OooO00o();
        for (int i2 = 0; i2 < i; i2++) {
            String strOoooO0O = o0o0000Var.OoooO0O();
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOoooO0O, ':', 0, false, 6, (Object) null);
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strOoooO0O).toString());
            }
            String strSubstring = strOoooO0O.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String name = StringsKt.trim((CharSequence) strSubstring).toString();
            String value = strOoooO0O.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(value, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            o0O000.OooO0O0.OooO00o(name);
            oooO00o.OooO0O0(name, value);
        }
        this.f36742OooO0o = oooO00o.OooO0OO();
    }

    public final void OooO00o(@NotNull o0OOo000 o0ooo001) throws IOException {
        o0ooo001.Ooooo00(this.f36740OooO0OO).o0ooOO0(10);
        o0ooo001.Ooooo00(this.f36741OooO0Oo).o0ooOO0(10);
        o0ooo001.Ooooo00(this.f36743OooO0o0 ? 1L : 0L).o0ooOO0(10);
        o0O000 o0o001 = this.f36742OooO0o;
        o0ooo001.Ooooo00(o0o001.f57773OooO0Oo.length / 2).o0ooOO0(10);
        int length = o0o001.f57773OooO0Oo.length / 2;
        for (int i = 0; i < length; i++) {
            o0ooo001.Oooo000(o0o001.OooO0OO(i));
            o0ooo001.Oooo000(": ");
            o0ooo001.Oooo000(o0o001.OooO0o0(i));
            o0ooo001.o0ooOO0(10);
        }
    }

    public o00(@NotNull o0O00o00 o0o00o01) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f36738OooO00o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OO00(this));
        this.f36739OooO0O0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new o000OOo0(this));
        this.f36740OooO0OO = o0o00o01.f57855OooOOO;
        this.f36741OooO0Oo = o0o00o01.f57857OooOOOO;
        this.f36743OooO0o0 = o0o00o01.f57851OooO0oo != null;
        this.f36742OooO0o = o0o00o01.f57846OooO;
    }
}
