package o000O00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements OooOOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Locale[] f28091OooO0O0 = new Locale[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Locale[] f28092OooO00o;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i = OooOOO0.f28093OooO0O0;
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

    public OooOOO(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f28092OooO00o = f28091OooO0O0;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(OooO0O0.OooO00o.OooO00o("list[", i, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f28092OooO00o = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // o000O00O.OooOOOO
    @Nullable
    public final Object OooO00o() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        Locale[] localeArr = ((OooOOO) obj).f28092OooO00o;
        if (this.f28092OooO00o.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f28092OooO00o;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // o000O00O.OooOOOO
    public final Locale get() {
        Locale[] localeArr = this.f28092OooO00o;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f28092OooO00o) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f28092OooO00o;
            if (i >= localeArr.length) {
                sbOooO0o0.append("]");
                return sbOooO0o0.toString();
            }
            sbOooO0o0.append(localeArr[i]);
            if (i < this.f28092OooO00o.length - 1) {
                sbOooO0o0.append(',');
            }
            i++;
        }
    }
}
