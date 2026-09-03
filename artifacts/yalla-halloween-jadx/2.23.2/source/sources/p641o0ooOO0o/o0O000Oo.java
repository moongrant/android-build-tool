package p641o0ooOO0o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f57808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f57810OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String[] f57811OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Pattern f57807OooO0o0 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f57806OooO0o = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class OooO00o {
        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static o0O000Oo OooO00o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = o0O000Oo.f57807OooO0o0.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + Typography.quote).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = o0O000Oo.f57806OooO0o.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(Typography.quote);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt__StringsJVMKt.startsWith$default(strGroup4, "'", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new o0O000Oo(str, lowerCase, lowerCase2, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public static o0O000Oo OooO0O0(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return OooO00o(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public o0O000Oo(String str, String str2, String str3, String[] strArr) {
        this.f57808OooO00o = str;
        this.f57809OooO0O0 = str2;
        this.f57810OooO0OO = str3;
        this.f57811OooO0Oo = strArr;
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final o0O000Oo OooO0O0(@NotNull String str) {
        return OooO00o.OooO0O0(str);
    }

    @JvmOverloads
    @Nullable
    public final Charset OooO00o(@Nullable Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        String[] strArr = this.f57811OooO0Oo;
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement < 0) {
            str = null;
            break;
        }
        while (true) {
            int i2 = i + 2;
            if (StringsKt__StringsJVMKt.equals(strArr[i], "charset", true)) {
                str = strArr[i + 1];
                break;
            }
            if (i == progressionLastElement) {
                str = null;
                break;
            }
            i = i2;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o0O000Oo) && Intrinsics.areEqual(((o0O000Oo) obj).f57808OooO00o, this.f57808OooO00o);
    }

    public final int hashCode() {
        return this.f57808OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f57808OooO00o;
    }
}
