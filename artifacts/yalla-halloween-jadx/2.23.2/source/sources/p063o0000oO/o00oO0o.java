package p063o0000oO;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00oO0o f33779OooO0O0 = OooO00o(new Locale[0]);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f33780OooO00o;

    @RequiresApi(21)
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Locale[] f33781OooO00o = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @DoNotInline
        public static Locale OooO00o(String str) {
            return Locale.forLanguageTag(str);
        }

        @DoNotInline
        public static boolean OooO0O0(@NonNull Locale locale, @NonNull Locale locale2) {
            boolean z;
            boolean z2;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f33781OooO00o;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (localeArr[i].equals(locale)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                int length2 = localeArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z2 = false;
                        break;
                    }
                    if (localeArr[i2].equals(locale2)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (!z2) {
                    String strOooO00o = o0000O0O.OooO0O0.OooO00o(locale);
                    if (!strOooO00o.isEmpty()) {
                        return strOooO00o.equals(o0000O0O.OooO0O0.OooO00o(locale2));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
            }
            return false;
        }
    }

    @RequiresApi(24)
    public static class OooO0O0 {
        @DoNotInline
        public static LocaleList OooO00o(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        public static LocaleList OooO0O0() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        public static LocaleList OooO0OO() {
            return LocaleList.getDefault();
        }
    }

    public o00oO0o(o0OOO0o o0ooo0o2) {
        this.f33780OooO00o = o0ooo0o2;
    }

    @NonNull
    public static o00oO0o OooO00o(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new o00oO0o(new o0O0O00(OooO0O0.OooO00o(localeArr))) : new o00oO0o(new o0ooOOo(localeArr));
    }

    @NonNull
    public static o00oO0o OooO0O0(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return f33779OooO0O0;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = OooO00o.OooO00o(strArrSplit[i]);
        }
        return OooO00o(localeArr);
    }

    @Nullable
    public final Locale OooO0OO(int i) {
        return this.f33780OooO00o.get(i);
    }

    public final boolean OooO0Oo() {
        return this.f33780OooO00o.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00oO0o) {
            if (this.f33780OooO00o.equals(((o00oO0o) obj).f33780OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33780OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f33780OooO00o.toString();
    }
}
