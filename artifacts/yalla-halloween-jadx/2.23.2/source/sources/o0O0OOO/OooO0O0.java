package o0O0OOO;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.firebase.abt.FirebaseABTesting;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final zzjb f41345OooO00o = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final zzja f41346OooO0O0 = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final zzja f41347OooO0OO = zzja.zzi(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final zzja f41348OooO0Oo = zzja.zzh("_r", "_dbg");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final zzja f41349OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final zzja f41350OooO0o0;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        f41350OooO0o0 = zzixVar.zzb();
        f41349OooO0o = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public static boolean OooO00o(Bundle bundle, String str, String str2) {
        byte b;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!OooO0OO(str) || bundle == null) {
            return false;
        }
        zzja zzjaVar = f41348OooO0Oo;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("fdl")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean OooO0O0(Bundle bundle, String str) {
        if (f41346OooO0O0.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzjaVar = f41348OooO0Oo;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0OO(String str) {
        return !f41347OooO0OO.contains(str);
    }

    public static boolean OooO0Oo(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("fiam");
        }
        if (f41350OooO0o0.contains(str2)) {
            return false;
        }
        zzja zzjaVar = f41349OooO0o;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) zzjaVar.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }
}
