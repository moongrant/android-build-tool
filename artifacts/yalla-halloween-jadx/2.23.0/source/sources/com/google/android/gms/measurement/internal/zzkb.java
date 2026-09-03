package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p269o00ooooo.o0OOO0;
import p269o00ooooo.oOO0O0O;
import p269o00ooooo.oOOO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkb extends oOOO0O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f16069OooO0Oo;
    public final zzfe zza;
    public final zzfe zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfe zze;

    public zzkb(zzlh zzlhVar) {
        super(zzlhVar);
        this.f16069OooO0Oo = new HashMap();
        o0OOO0 o0ooo0Zzm = this.f41276OooO00o.zzm();
        o0ooo0Zzm.getClass();
        this.zza = new zzfe(o0ooo0Zzm, "last_delete_stale", 0L);
        o0OOO0 o0ooo0Zzm2 = this.f41276OooO00o.zzm();
        o0ooo0Zzm2.getClass();
        this.zzb = new zzfe(o0ooo0Zzm2, "backoff", 0L);
        o0OOO0 o0ooo0Zzm3 = this.f41276OooO00o.zzm();
        o0ooo0Zzm3.getClass();
        this.zzc = new zzfe(o0ooo0Zzm3, "last_upload", 0L);
        o0OOO0 o0ooo0Zzm4 = this.f41276OooO00o.zzm();
        o0ooo0Zzm4.getClass();
        this.zzd = new zzfe(o0ooo0Zzm4, "last_upload_attempt", 0L);
        o0OOO0 o0ooo0Zzm5 = this.f41276OooO00o.zzm();
        o0ooo0Zzm5.getClass();
        this.zze = new zzfe(o0ooo0Zzm5, "midnight_offset", 0L);
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    @WorkerThread
    @Deprecated
    public final Pair OooO0OO(String str) {
        oOO0O0O ooo0o0o;
        AdvertisingIdClient.Info advertisingIdInfo;
        zzg();
        zzgd zzgdVar = this.f41276OooO00o;
        long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime();
        HashMap map = this.f16069OooO0Oo;
        oOO0O0O ooo0o0o2 = (oOO0O0O) map.get(str);
        if (ooo0o0o2 != null && jElapsedRealtime < ooo0o0o2.f41456OooO0OO) {
            return new Pair(ooo0o0o2.f41454OooO00o, Boolean.valueOf(ooo0o0o2.f41455OooO0O0));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzi = zzgdVar.zzf().zzi(str, zzeg.zza) + jElapsedRealtime;
        try {
            long jZzi2 = zzgdVar.zzf().zzi(str, zzeg.zzb);
            if (jZzi2 > 0) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzgdVar.zzaw());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (ooo0o0o2 != null && jElapsedRealtime < ooo0o0o2.f41456OooO0OO + jZzi2) {
                        return new Pair(ooo0o0o2.f41454OooO00o, Boolean.valueOf(ooo0o0o2.f41455OooO0O0));
                    }
                    advertisingIdInfo = null;
                }
            } else {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzgdVar.zzaw());
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            ooo0o0o = id != null ? new oOO0O0O(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi) : new oOO0O0O("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi);
            map.put(str, ooo0o0o);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(ooo0o0o.f41454OooO00o, Boolean.valueOf(ooo0o0o.f41455OooO0O0));
        } catch (Exception e) {
            zzgdVar.zzaA().zzc().zzb("Unable to get advertising id", e);
            ooo0o0o = new oOO0O0O("", false, jZzi);
        }
    }

    @WorkerThread
    @Deprecated
    public final String OooO0Oo(String str, boolean z) {
        zzg();
        String str2 = z ? (String) OooO0OO(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestOooO0oO = zzlp.OooO0oO();
        if (messageDigestOooO0oO == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestOooO0oO.digest(str2.getBytes())));
    }
}
