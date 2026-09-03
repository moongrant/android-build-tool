package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import o0OO0OoO.o0O00OO;
import o0OO0OoO.o0O0O00;
import o0OO0OoO.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzju extends oo0OOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f16273OooO0Oo;
    public final zzez zza;
    public final zzez zzb;
    public final zzez zzc;
    public final zzez zzd;
    public final zzez zze;

    public zzju(zzkz zzkzVar) {
        super(zzkzVar);
        this.f16273OooO0Oo = new HashMap();
        o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
        Objects.requireNonNull(o0o0o00Zzm);
        this.zza = new zzez(o0o0o00Zzm, "last_delete_stale", 0L);
        o0O0O00 o0o0o00Zzm2 = this.f37615OooO00o.zzm();
        Objects.requireNonNull(o0o0o00Zzm2);
        this.zzb = new zzez(o0o0o00Zzm2, "backoff", 0L);
        o0O0O00 o0o0o00Zzm3 = this.f37615OooO00o.zzm();
        Objects.requireNonNull(o0o0o00Zzm3);
        this.zzc = new zzez(o0o0o00Zzm3, "last_upload", 0L);
        o0O0O00 o0o0o00Zzm4 = this.f37615OooO00o.zzm();
        Objects.requireNonNull(o0o0o00Zzm4);
        this.zzd = new zzez(o0o0o00Zzm4, "last_upload_attempt", 0L);
        o0O0O00 o0o0o00Zzm5 = this.f37615OooO00o.zzm();
        Objects.requireNonNull(o0o0o00Zzm5);
        this.zze = new zzez(o0o0o00Zzm5, "midnight_offset", 0L);
    }

    @Override // o0OO0OoO.oo0OOoo
    public final void OooO0O0() {
    }

    @WorkerThread
    @Deprecated
    public final Pair OooO0OO(String str) {
        o0O00OO o0o00oo2;
        zzg();
        long jElapsedRealtime = this.f37615OooO00o.zzav().elapsedRealtime();
        o0O00OO o0o00oo3 = (o0O00OO) this.f16273OooO0Oo.get(str);
        if (o0o00oo3 != null && jElapsedRealtime < o0o00oo3.f37753OooO0OO) {
            return new Pair(o0o00oo3.f37751OooO00o, Boolean.valueOf(o0o00oo3.f37752OooO0O0));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzi = this.f37615OooO00o.zzf().zzi(str, zzeb.zza) + jElapsedRealtime;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f37615OooO00o.zzau());
            if (advertisingIdInfo == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            o0o00oo2 = id != null ? new o0O00OO(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi) : new o0O00OO("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi);
            this.f16273OooO0Oo.put(str, o0o00oo2);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(o0o00oo2.f37751OooO00o, Boolean.valueOf(o0o00oo2.f37752OooO0O0));
        } catch (Exception e) {
            this.f37615OooO00o.zzay().zzc().zzb("Unable to get advertising id", e);
            o0o00oo2 = new o0O00OO("", false, jZzi);
        }
    }

    @WorkerThread
    public final Pair OooO0Oo(String str, zzai zzaiVar) {
        return zzaiVar.zzi(zzah.AD_STORAGE) ? OooO0OO(str) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final String OooO0o0(String str, boolean z) {
        zzg();
        String str2 = z ? (String) OooO0OO(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestOooO0oo = zzlh.OooO0oo();
        if (messageDigestOooO0oo == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestOooO0oo.digest(str2.getBytes())));
    }
}
