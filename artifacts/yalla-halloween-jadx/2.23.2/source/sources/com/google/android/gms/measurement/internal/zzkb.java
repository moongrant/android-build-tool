package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p271o00ooooo.j0;
import p271o00ooooo.oOo000Oo;
import p271o00ooooo.x;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkb extends j0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f15593OooO0Oo;
    public final zzfe zza;
    public final zzfe zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfe zze;

    public zzkb(zzlh zzlhVar) {
        super(zzlhVar);
        this.f15593OooO0Oo = new HashMap();
        oOo000Oo ooo000ooZzm = this.f40788OooO00o.zzm();
        ooo000ooZzm.getClass();
        this.zza = new zzfe(ooo000ooZzm, "last_delete_stale", 0L);
        oOo000Oo ooo000ooZzm2 = this.f40788OooO00o.zzm();
        ooo000ooZzm2.getClass();
        this.zzb = new zzfe(ooo000ooZzm2, "backoff", 0L);
        oOo000Oo ooo000ooZzm3 = this.f40788OooO00o.zzm();
        ooo000ooZzm3.getClass();
        this.zzc = new zzfe(ooo000ooZzm3, "last_upload", 0L);
        oOo000Oo ooo000ooZzm4 = this.f40788OooO00o.zzm();
        ooo000ooZzm4.getClass();
        this.zzd = new zzfe(ooo000ooZzm4, "last_upload_attempt", 0L);
        oOo000Oo ooo000ooZzm5 = this.f40788OooO00o.zzm();
        ooo000ooZzm5.getClass();
        this.zze = new zzfe(ooo000ooZzm5, "midnight_offset", 0L);
    }

    @Override // p271o00ooooo.j0
    public final void OooO0O0() {
    }

    @WorkerThread
    @Deprecated
    public final Pair OooO0OO(String str) {
        x xVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        zzg();
        zzgd zzgdVar = this.f40788OooO00o;
        long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime();
        HashMap map = this.f15593OooO0Oo;
        x xVar2 = (x) map.get(str);
        if (xVar2 != null && jElapsedRealtime < xVar2.f40863OooO0OO) {
            return new Pair(xVar2.f40861OooO00o, Boolean.valueOf(xVar2.f40862OooO0O0));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzi = zzgdVar.zzf().zzi(str, zzeg.zza) + jElapsedRealtime;
        try {
            long jZzi2 = zzgdVar.zzf().zzi(str, zzeg.zzb);
            if (jZzi2 > 0) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzgdVar.zzaw());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (xVar2 != null && jElapsedRealtime < xVar2.f40863OooO0OO + jZzi2) {
                        return new Pair(xVar2.f40861OooO00o, Boolean.valueOf(xVar2.f40862OooO0O0));
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
            xVar = id != null ? new x(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi) : new x("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi);
            map.put(str, xVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(xVar.f40861OooO00o, Boolean.valueOf(xVar.f40862OooO0O0));
        } catch (Exception e) {
            zzgdVar.zzaA().zzc().zzb("Unable to get advertising id", e);
            xVar = new x("", false, jZzi);
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
