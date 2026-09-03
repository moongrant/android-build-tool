package p660o0ooo0o0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;
import p659o0ooo0o.o00OOO00;
import p666o0oooO0o.oO00o00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f51295OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f51296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f51297OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f51298OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f51299OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f51300OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f51301OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f51302OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f51303OooO0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f51293OooOOO = new OooO00o();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Pattern f51290OooOO0 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Pattern f51291OooOO0O = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Pattern f51292OooOO0o = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f51294OooOOO0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class OooO00o {
        public final int OooO00o(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
        public final long OooO0O0(String str, int i) {
            int iOooO00o = OooO00o(str, 0, i, false);
            Matcher matcher = o00O00o0.f51294OooOOO0.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iIndexOf$default = -1;
            int i5 = -1;
            int i6 = -1;
            while (iOooO00o < i) {
                int iOooO00o2 = OooO00o(str, iOooO00o + 1, i, true);
                matcher.region(iOooO00o, iOooO00o2);
                if (i3 == -1 && matcher.usePattern(o00O00o0.f51294OooOOO0).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(o00O00o0.f51292OooOO0o).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1) {
                    Pattern pattern = o00O00o0.f51291OooOO0O;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                        Objects.requireNonNull(strGroup5, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = strGroup5.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                    } else if (i2 != -1 && matcher.usePattern(o00O00o0.f51290OooOO0).matches()) {
                        String strGroup6 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                        i2 = Integer.parseInt(strGroup6);
                    }
                } else if (i2 != -1) {
                }
                iOooO00o = OooO00o(str, iOooO00o2 + 1, i, false);
            }
            if (70 <= i2 && 99 >= i2) {
                i2 += 1900;
            }
            if (i2 >= 0 && 69 >= i2) {
                i2 += RecyclerView.MAX_SCROLL_DURATION;
            }
            if (!(i2 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iIndexOf$default != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i4 && 31 >= i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i3 >= 0 && 23 >= i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && 59 >= i5)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && 59 >= i6)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(o00OOO00.f51188OooO0o0);
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

    public o00O00o0(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f51296OooO00o = str;
        this.f51297OooO0O0 = str2;
        this.f51298OooO0OO = j;
        this.f51299OooO0Oo = str3;
        this.f51301OooO0o0 = str4;
        this.f51300OooO0o = z;
        this.f51302OooO0oO = z2;
        this.f51303OooO0oo = z3;
        this.f51295OooO = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O00o0) {
            o00O00o0 o00o00o1 = (o00O00o0) obj;
            if (Intrinsics.areEqual(o00o00o1.f51296OooO00o, this.f51296OooO00o) && Intrinsics.areEqual(o00o00o1.f51297OooO0O0, this.f51297OooO0O0) && o00o00o1.f51298OooO0OO == this.f51298OooO0OO && Intrinsics.areEqual(o00o00o1.f51299OooO0Oo, this.f51299OooO0Oo) && Intrinsics.areEqual(o00o00o1.f51301OooO0o0, this.f51301OooO0o0) && o00o00o1.f51300OooO0o == this.f51300OooO0o && o00o00o1.f51302OooO0oO == this.f51302OooO0oO && o00o00o1.f51303OooO0oo == this.f51303OooO0oo && o00o00o1.f51295OooO == this.f51295OooO) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.f51297OooO0O0, o0O0O00.OooO00o(this.f51296OooO00o, 527, 31), 31);
        long j = this.f51298OooO0OO;
        return ((((((o0O0O00.OooO00o(this.f51301OooO0o0, o0O0O00.OooO00o(this.f51299OooO0Oo, (iOooO00o + ((int) (j ^ (j >>> 32)))) * 31, 31), 31) + (this.f51300OooO0o ? 1231 : 1237)) * 31) + (this.f51302OooO0oO ? 1231 : 1237)) * 31) + (this.f51303OooO0oo ? 1231 : 1237)) * 31) + (this.f51295OooO ? 1231 : 1237);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51296OooO00o);
        sb.append('=');
        sb.append(this.f51297OooO0O0);
        if (this.f51303OooO0oo) {
            if (this.f51298OooO0OO == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date toHttpDateString = new Date(this.f51298OooO0OO);
                oO00o00.OooO00o oooO00o = oO00o00.f51866OooO00o;
                Intrinsics.checkNotNullParameter(toHttpDateString, "$this$toHttpDateString");
                String str = oO00o00.f51866OooO00o.get().format(toHttpDateString);
                Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f51295OooO) {
            sb.append("; domain=");
            sb.append(this.f51299OooO0Oo);
        }
        sb.append("; path=");
        sb.append(this.f51301OooO0o0);
        if (this.f51300OooO0o) {
            sb.append("; secure");
        }
        if (this.f51302OooO0oO) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }
}
