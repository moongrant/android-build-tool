package okhttp3;

import androidx.compose.animation.OooO0O0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p648o0ooOoo.oO000o00;
import p648o0ooOoo.oO0OOo0o;
import p654o0ooo00o.o000O0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u0000 *2\u00020\u0001:\u0001+BQ\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001d\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001d\u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010\u0012¨\u0006,"}, d2 = {"Lokhttp3/Cookie;", "", "Lo0ooOO0o/o0O000O;", "url", "", "matches", "other", "equals", "", "hashCode", "", "toString", "-deprecated_name", "()Ljava/lang/String;", "name", "-deprecated_value", AppMeasurementSdk.ConditionalUserProperty.VALUE, "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", "path", "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "J", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", "OooO00o", "okhttp"}, k = 1, mv = {1, 6, 0})
public final class Cookie {

    @NotNull
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @NotNull
    private final String name;

    @NotNull
    private final String path;
    private final boolean persistent;
    private final boolean secure;

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: okhttp3.Cookie$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:32:0x0041  */
        public static int OooO00o(String str, int i, int i2, boolean z) {
            boolean z2;
            while (i < i2) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z2 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z2 == (!z)) {
                    return i;
                }
                i = i3;
            }
            return i2;
        }

        public static boolean OooO0O0(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            if (StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.') {
                byte[] bArr = oO000o00.f58124OooO00o;
                Intrinsics.checkNotNullParameter(str, "<this>");
                if (!oO000o00.f58128OooO0o.matches(str)) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        @Nullable
        public static Cookie OooO0OO(@NotNull o0O000O url, @NotNull String setCookie) {
            long j;
            String str;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            char c = ';';
            int iOooO0oO = oO000o00.OooO0oO(setCookie, ';', 0, 0, 6);
            char c2 = '=';
            int iOooO0oO2 = oO000o00.OooO0oO(setCookie, '=', 0, iOooO0oO, 2);
            if (iOooO0oO2 != iOooO0oO) {
                String strOooOoO = oO000o00.OooOoO(0, iOooO0oO2, setCookie);
                if (!(strOooOoO.length() == 0) && oO000o00.OooOOO0(strOooOoO) == -1) {
                    String strOooOoO2 = oO000o00.OooOoO(iOooO0oO2 + 1, iOooO0oO, setCookie);
                    if (oO000o00.OooOOO0(strOooOoO2) == -1) {
                        int i = iOooO0oO + 1;
                        int length = setCookie.length();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = true;
                        long j2 = -1;
                        String str2 = null;
                        String str3 = null;
                        long jOooO0o0 = 253402300799999L;
                        while (true) {
                            long j3 = LongCompanionObject.MAX_VALUE;
                            if (i >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    if (j2 <= 9223372036854775L) {
                                        j3 = j2 * ((long) 1000);
                                    }
                                    long j4 = jCurrentTimeMillis + j3;
                                    j = (j4 < jCurrentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                } else {
                                    j = jOooO0o0;
                                }
                                String str4 = url.f57792OooO0Oo;
                                if (str3 != null) {
                                    if (!OooO0O0(str4, str3)) {
                                        break;
                                    }
                                } else {
                                    str3 = str4;
                                }
                                if (str4.length() != str3.length() && PublicSuffixDatabase.f60184OooO0oO.OooO00o(str3) == null) {
                                    break;
                                }
                                String strSubstring = "/";
                                if (str2 == null || !StringsKt__StringsJVMKt.startsWith$default(str2, "/", false, 2, null)) {
                                    String strOooO0O0 = url.OooO0O0();
                                    int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strOooO0O0, '/', 0, false, 6, (Object) null);
                                    if (iLastIndexOf$default != 0) {
                                        strSubstring = strOooO0O0.substring(0, iLastIndexOf$default);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    str = strSubstring;
                                } else {
                                    str = str2;
                                }
                                return new Cookie(strOooOoO, strOooOoO2, j, str3, str, z, z2, z3, z4, null);
                            }
                            int iOooO0o = oO000o00.OooO0o(setCookie, c, i, length);
                            int iOooO0o2 = oO000o00.OooO0o(setCookie, c2, i, iOooO0o);
                            String strOooOoO3 = oO000o00.OooOoO(i, iOooO0o2, setCookie);
                            String strOooOoO4 = iOooO0o2 < iOooO0o ? oO000o00.OooOoO(iOooO0o2 + 1, iOooO0o, setCookie) : "";
                            if (StringsKt__StringsJVMKt.equals(strOooOoO3, "expires", true)) {
                                try {
                                    jOooO0o0 = OooO0o0(strOooOoO4.length(), strOooOoO4);
                                    z3 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (StringsKt__StringsJVMKt.equals(strOooOoO3, "max-age", true)) {
                                try {
                                    long j5 = Long.parseLong(strOooOoO4);
                                    j2 = j5 > 0 ? j5 : Long.MIN_VALUE;
                                } catch (NumberFormatException e) {
                                    if (!new Regex("-?\\d+").matches(strOooOoO4)) {
                                        throw e;
                                    }
                                    if (StringsKt__StringsJVMKt.startsWith$default(strOooOoO4, "-", false, 2, null)) {
                                        j3 = Long.MIN_VALUE;
                                    }
                                    j2 = j3;
                                }
                                z3 = true;
                            } else if (StringsKt__StringsJVMKt.equals(strOooOoO3, "domain", true)) {
                                if (!(!StringsKt__StringsJVMKt.endsWith$default(strOooOoO4, ".", false, 2, null))) {
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                                String strOooO0O1 = oO0OOo0o.OooO0O0(StringsKt.removePrefix(strOooOoO4, (CharSequence) "."));
                                if (strOooO0O1 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str3 = strOooO0O1;
                                z4 = false;
                            } else if (StringsKt__StringsJVMKt.equals(strOooOoO3, "path", true)) {
                                str2 = strOooOoO4;
                            } else if (StringsKt__StringsJVMKt.equals(strOooOoO3, "secure", true)) {
                                z = true;
                            } else if (StringsKt__StringsJVMKt.equals(strOooOoO3, "httponly", true)) {
                                z2 = true;
                            }
                            i = iOooO0o + 1;
                            c = ';';
                            c2 = '=';
                        }
                    }
                }
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public static List OooO0Oo(@NotNull o0O000O url, @NotNull o0O000 headers) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            headers.getClass();
            Intrinsics.checkNotNullParameter("Set-Cookie", "name");
            int length = headers.f57773OooO0Oo.length / 2;
            int i = 0;
            ArrayList arrayList = null;
            int i2 = 0;
            ArrayList arrayList2 = null;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (StringsKt__StringsJVMKt.equals("Set-Cookie", headers.OooO0OO(i2), true)) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                    }
                    arrayList2.add(headers.OooO0o0(i2));
                }
                i2 = i3;
            }
            if (arrayList2 != null) {
                listEmptyList = Collections.unmodifiableList(arrayList2);
                Intrinsics.checkNotNullExpressionValue(listEmptyList, "{\n      Collections.unmodifiableList(result)\n    }");
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            int size = listEmptyList.size();
            while (i < size) {
                int i4 = i + 1;
                Cookie cookieOooO0OO = OooO0OO(url, (String) listEmptyList.get(i));
                if (cookieOooO0OO != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieOooO0OO);
                }
                i = i4;
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public static long OooO0o0(int i, String str) {
            int iOooO00o = OooO00o(str, 0, i, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iIndexOf$default = -1;
            int i5 = -1;
            int i6 = -1;
            while (iOooO00o < i) {
                int iOooO00o2 = OooO00o(str, iOooO00o + 1, i, true);
                matcher.region(iOooO00o, iOooO00o2);
                if (i3 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i2 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i2 = Integer.parseInt(strGroup6);
                }
                iOooO00o = OooO00o(str, iOooO00o2 + 1, i, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (!(i2 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i4 && i4 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i3 >= 0 && i3 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && i5 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && i6 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(oO000o00.f58129OooO0o0);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    @JvmStatic
    @Nullable
    public static final Cookie parse(@NotNull o0O000O o0o000o, @NotNull String str) {
        INSTANCE.getClass();
        return Companion.OooO0OO(o0o000o, str);
    }

    @JvmStatic
    @NotNull
    public static final List<Cookie> parseAll(@NotNull o0O000O o0o000o, @NotNull o0O000 o0o001) {
        INSTANCE.getClass();
        return Companion.OooO0Oo(o0o000o, o0o001);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "domain", imports = {}))
    @JvmName(name = "-deprecated_domain")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}))
    @JvmName(name = "-deprecated_expiresAt")
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}))
    @JvmName(name = "-deprecated_hostOnly")
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}))
    @JvmName(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}))
    @JvmName(name = "-deprecated_name")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}))
    @JvmName(name = "-deprecated_path")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}))
    @JvmName(name = "-deprecated_persistent")
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}))
    @JvmName(name = "-deprecated_secure")
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = AppMeasurementSdk.ConditionalUserProperty.VALUE, imports = {}))
    @JvmName(name = "-deprecated_value")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    @JvmName(name = "domain")
    @NotNull
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.value, OooO0O0.OooO00o(this.name, 527, 31), 31);
        long j = this.expiresAt;
        return ((((((OooO0O0.OooO00o(this.path, OooO0O0.OooO00o(this.domain, (iOooO00o + ((int) (j ^ (j >>> 32)))) * 31, 31), 31) + (this.secure ? 1231 : 1237)) * 31) + (this.httpOnly ? 1231 : 1237)) * 31) + (this.persistent ? 1231 : 1237)) * 31) + (this.hostOnly ? 1231 : 1237);
    }

    @JvmName(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @JvmName(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull o0O000O url) {
        boolean zOooO0O0;
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.hostOnly) {
            zOooO0O0 = Intrinsics.areEqual(url.f57792OooO0Oo, this.domain);
        } else {
            Companion companion = INSTANCE;
            String str = url.f57792OooO0Oo;
            String str2 = this.domain;
            companion.getClass();
            zOooO0O0 = Companion.OooO0O0(str, str2);
        }
        if (!zOooO0O0) {
            return false;
        }
        Companion companion2 = INSTANCE;
        String str3 = this.path;
        companion2.getClass();
        String strOooO0O0 = url.OooO0O0();
        if (Intrinsics.areEqual(strOooO0O0, str3) || (StringsKt__StringsJVMKt.startsWith$default(strOooO0O0, str3, false, 2, null) && (StringsKt__StringsJVMKt.endsWith$default(str3, "/", false, 2, null) || strOooO0O0.charAt(str3.length()) == '/'))) {
            return !this.secure || url.f57797OooOO0;
        }
        return false;
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return this.name;
    }

    @JvmName(name = "path")
    @NotNull
    public final String path() {
        return this.path;
    }

    @JvmName(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @JvmName(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('=');
        sb.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(expiresAt());
                o000O0.OooO00o oooO00o = o000O0.f59404OooO00o;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String str = o000O0.f59404OooO00o.get().format(date);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!hostOnly()) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(domain());
        }
        sb.append("; path=");
        sb.append(path());
        if (secure()) {
            sb.append("; secure");
        }
        if (httpOnly()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @JvmName(name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }
}
