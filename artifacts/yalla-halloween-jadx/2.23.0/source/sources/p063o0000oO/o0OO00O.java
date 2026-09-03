package p063o0000oO;

import OooO0OO.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Locale[] f34292OooO0OO = new Locale[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Locale[] f34293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final String f34294OooO0O0;

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

    public o0OO00O(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f34293OooO00o = f34292OooO0OO;
            this.f34294OooO0O0 = "";
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
        this.f34293OooO00o = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f34294OooO0O0 = sb.toString();
    }

    @Override // p063o0000oO.oo0o0Oo
    public final String OooO00o() {
        return this.f34294OooO0O0;
    }

    @Override // p063o0000oO.oo0o0Oo
    @Nullable
    public final Object OooO0O0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OO00O)) {
            return false;
        }
        Locale[] localeArr = ((o0OO00O) obj).f34293OooO00o;
        Locale[] localeArr2 = this.f34293OooO00o;
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

    @Override // p063o0000oO.oo0o0Oo
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f34293OooO00o;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f34293OooO00o) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p063o0000oO.oo0o0Oo
    public final boolean isEmpty() {
        return this.f34293OooO00o.length == 0;
    }

    @Override // p063o0000oO.oo0o0Oo
    public final int size() {
        return this.f34293OooO00o.length;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f34293OooO00o;
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
