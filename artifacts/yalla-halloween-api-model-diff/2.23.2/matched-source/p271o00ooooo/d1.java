package p271o00ooooo;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzlj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40482OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40483OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Boolean f40484OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f40485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Long f40486OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Long f40487OooO0o0;

    public d1(String str, int i) {
        this.f40482OooO00o = str;
        this.f40483OooO0O0 = i;
    }

    @VisibleForTesting
    public static Boolean OooO0Oo(BigDecimal bigDecimal, zzer zzerVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzerVar);
        if (zzerVar.zzg()) {
            if (zzerVar.zzm() != 1) {
                if (zzerVar.zzm() == 5) {
                    if (!zzerVar.zzk() || !zzerVar.zzj()) {
                        return null;
                    }
                } else if (!zzerVar.zzh()) {
                    return null;
                }
                int iZzm = zzerVar.zzm();
                if (zzerVar.zzm() == 5) {
                    if (zzlj.OooOoOO(zzerVar.zze()) && zzlj.OooOoOO(zzerVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!zzlj.OooOoOO(zzerVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzerVar.zzc());
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

    @VisibleForTesting
    public static Boolean OooO0o(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @VisibleForTesting
    public static Boolean OooO0o0(String str, zzey zzeyVar, zzet zzetVar) {
        List listZze;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int iZzj = zzeyVar.zzj();
        boolean zZzf = zzeyVar.zzf();
        String strZzd = (zZzf || iZzj == 2 || iZzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzeyVar.zza() == 0) {
            listZze = null;
        } else {
            listZze = zzeyVar.zze();
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
                    if (zzetVar == null) {
                        return null;
                    }
                    zzetVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str2);
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

    public abstract int OooO00o();

    public abstract boolean OooO0O0();

    public abstract boolean OooO0OO();
}
