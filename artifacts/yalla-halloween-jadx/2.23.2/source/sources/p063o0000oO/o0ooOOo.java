package p063o0000oO;

import OooO0OO.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Locale[] f33786OooO0OO = new Locale[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Locale[] f33787OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final String f33788OooO0O0;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public o0ooOOo(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f33787OooO00o = f33786OooO0OO;
            this.f33788OooO0O0 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(OooO00o.OooO00o("list[", i, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f33787OooO00o = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f33788OooO0O0 = sb.toString();
    }

    @Override // p063o0000oO.o0OOO0o
    public final String OooO00o() {
        return this.f33788OooO0O0;
    }

    @Override // p063o0000oO.o0OOO0o
    @Nullable
    public final Object OooO0O0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        Locale[] localeArr = ((o0ooOOo) obj).f33787OooO00o;
        Locale[] localeArr2 = this.f33787OooO00o;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p063o0000oO.o0OOO0o
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f33787OooO00o;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f33787OooO00o) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p063o0000oO.o0OOO0o
    public final boolean isEmpty() {
        return this.f33787OooO00o.length == 0;
    }

    @Override // p063o0000oO.o0OOO0o
    public final int size() {
        return this.f33787OooO00o.length;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f33787OooO00o;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
