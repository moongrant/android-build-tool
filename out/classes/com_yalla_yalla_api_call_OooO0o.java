package com.yalla.yalla.api.call;

import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.domain.OooOo00;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class OooO0o {
    @NotNull
    public static final String OooO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Search);
    }

    public static final String OooO00o(String str, DomainType domainType) {
        StringBuilder sb;
        if (StringsKt__StringsJVMKt.startsWith$default(str, "http://", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, "https://", false, 2, null)) {
            sb = new StringBuilder(str);
        } else if (StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, null)) {
            sb = new StringBuilder(OooOo00.OooO0Oo(domainType));
            if (StringsKt__StringsKt.endsWith$default(sb, (CharSequence) "/", false, 2, (Object) null)) {
                String strSubstring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb.append(strSubstring);
            } else {
                String strSubstring2 = str.substring(0);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                sb.append(strSubstring2);
            }
            Intrinsics.checkNotNull(sb);
        } else {
            sb = new StringBuilder(OooOo00.OooO0Oo(domainType));
            if (StringsKt__StringsKt.endsWith$default(sb, (CharSequence) "/", false, 2, (Object) null)) {
                sb.append(str);
            } else {
                sb.append("/");
                sb.append(str);
            }
            Intrinsics.checkNotNull(sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Event);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Log);
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Login);
    }

    @NotNull
    public static final String OooO0o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Moment);
    }

    @NotNull
    public static final String OooO0o0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Main);
    }

    @NotNull
    public static final String OooO0oO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Pay);
    }

    @NotNull
    public static final String OooO0oo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO00o(str, DomainType.Room);
    }
}
