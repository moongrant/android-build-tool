package o00000O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000O00.OooO f26873OooO00o = new o0000O00.OooO();

    @NotNull
    public static final String OooO00o(@NotNull String string, @NotNull o0000.OooO0o locale) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        o0000.OooOO0 locale2 = locale.f26568OooO00o;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale2, "locale");
        String upperCase = string.toUpperCase(((o0000.OooO00o) locale2).f26566OooO00o);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
