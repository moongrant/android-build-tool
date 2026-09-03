package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzlb;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Boolean f37849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f37850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Long f37851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Long f37852OooO0o0;

    public o0OO0o(String str, int i) {
        this.f37847OooO00o = str;
        this.f37848OooO0O0 = i;
    }

    @VisibleForTesting
    public static Boolean OooO0Oo(BigDecimal bigDecimal, zzeq zzeqVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzeqVar);
        if (zzeqVar.zzg()) {
            if (zzeqVar.zzm() != 1) {
                if (zzeqVar.zzm() == 5) {
                    if (!zzeqVar.zzk() || !zzeqVar.zzj()) {
                        return null;
                    }
                } else if (!zzeqVar.zzh()) {
                    return null;
                }
                int iZzm = zzeqVar.zzm();
                if (zzeqVar.zzm() == 5) {
                    if (zzlb.OooOoo(zzeqVar.zze()) && zzlb.OooOoo(zzeqVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzeqVar.zze());
                            bigDecimal4 = new BigDecimal(zzeqVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!zzlb.OooOoo(zzeqVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzeqVar.zzc());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iZzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i = iZzm - 1;
                if (i == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i != 3) {
                    if (i == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public static Boolean OooO0o(long j, zzeq zzeqVar) {
        try {
            return OooO0Oo(new BigDecimal(j), zzeqVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public static Boolean OooO0o0(String str, zzex zzexVar, zzeo zzeoVar) {
        List listZze;
        Preconditions.checkNotNull(zzexVar);
        if (str == null || !zzexVar.zzi() || zzexVar.zzj() == 1) {
            return null;
        }
        if (zzexVar.zzj() == 7) {
            if (zzexVar.zza() == 0) {
                return null;
            }
        } else if (!zzexVar.zzh()) {
            return null;
        }
        int iZzj = zzexVar.zzj();
        boolean zZzf = zzexVar.zzf();
        String strZzd = (zZzf || iZzj == 2 || iZzj == 7) ? zzexVar.zzd() : zzexVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzexVar.zza() == 0) {
            listZze = null;
        } else {
            listZze = zzexVar.zze();
            if (!zZzf) {
                ArrayList arrayList = new ArrayList(listZze.size());
                Iterator it = listZze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listZze = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iZzj == 2 ? strZzd : null;
        if (iZzj == 7) {
            if (listZze == null || listZze.isEmpty()) {
                return null;
            }
        } else if (strZzd == null) {
            return null;
        }
        if (!zZzf && iZzj != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (iZzj - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != zZzf ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzeoVar == null) {
                        return null;
                    }
                    zzeoVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(strZzd));
            case 3:
                return Boolean.valueOf(str.endsWith(strZzd));
            case 4:
                return Boolean.valueOf(str.contains(strZzd));
            case 5:
                return Boolean.valueOf(str.equals(strZzd));
            case 6:
                if (listZze == null) {
                    return null;
                }
                return Boolean.valueOf(listZze.contains(str));
            default:
                return null;
        }
    }

    public static Boolean OooO0oO(String str, zzeq zzeqVar) {
        if (!zzlb.OooOoo(str)) {
            return null;
        }
        try {
            return OooO0Oo(new BigDecimal(str), zzeqVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public static Boolean OooO0oo(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int OooO00o();

    public abstract boolean OooO0O0();

    public abstract boolean OooO0OO();
}
