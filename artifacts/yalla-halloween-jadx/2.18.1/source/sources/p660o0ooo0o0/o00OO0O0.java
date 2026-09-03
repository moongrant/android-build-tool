package p660o0ooo0o0;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f51402OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f51403OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f51404OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f51405OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f51401OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Pattern f51400OooO0o0 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f51399OooO0o = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class OooO00o {
        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final o00OO0O0 OooO00o(@NotNull String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = o00OO0O0.f51400OooO0o0.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + Typography.quote).toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(strGroup, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strGroup.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(strGroup2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = o00OO0O0.f51399OooO0o.matcher(toMediaType);
            int iEnd = matcher.end();
            while (iEnd < toMediaType.length()) {
                matcher2.region(iEnd, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Parameter is not formatted correctly: \"");
                    String strSubstring = toMediaType.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sbOooO0o0.append(strSubstring);
                    sbOooO0o0.append("\" for: \"");
                    sbOooO0o0.append(toMediaType);
                    sbOooO0o0.append(Typography.quote);
                    throw new IllegalArgumentException(sbOooO0o0.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.OooOoOO(strGroup4, "'") && StringsKt__StringsJVMKt.endsWith$default(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new o00OO0O0(toMediaType, lowerCase, lowerCase2, (String[]) array);
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public final o00OO0O0 OooO0O0(@NotNull String toMediaTypeOrNull) {
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return OooO00o(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public o00OO0O0(String str, String str2, String str3, String[] strArr) {
        this.f51402OooO00o = str;
        this.f51403OooO0O0 = str2;
        this.f51404OooO0OO = str3;
        this.f51405OooO0Oo = strArr;
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public static final o00OO0O0 OooO0O0(@NotNull String str) {
        return f51401OooO0oO.OooO00o(str);
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final o00OO0O0 OooO0OO(@NotNull String str) {
        return f51401OooO0oO.OooO0O0(str);
    }

    @JvmOverloads
    @Nullable
    public final Charset OooO00o(@Nullable Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        IntProgression intProgressionStep = RangesKt.step(ArraysKt.getIndices(this.f51405OooO0Oo), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                if (!StringsKt.OooO(this.f51405OooO0Oo[first], "charset")) {
                    if (first == last) {
                        str = null;
                        break;
                    }
                    first += step;
                } else {
                    str = this.f51405OooO0Oo[first + 1];
                    break;
                }
            }
        } else {
            str = null;
            break;
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
        return (obj instanceof o00OO0O0) && Intrinsics.areEqual(((o00OO0O0) obj).f51402OooO00o, this.f51402OooO00o);
    }

    public final int hashCode() {
        return this.f51402OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f51402OooO00o;
    }
}
