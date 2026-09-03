package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o0OO0OoO.Oooo0;
import o0OO0OoO.oo0o0Oo;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzef extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List f16108OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f16109OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f16110OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f16111OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16112OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f16113OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f16114OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f16115OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16116OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f16117OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f16118OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f16119OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f16120OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f16121OooOOOo;

    public zzef(zzfy zzfyVar, long j) {
        super(zzfyVar);
        this.f16120OooOOOO = 0L;
        this.f16121OooOOOo = null;
        this.f16114OooO0oo = j;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x021d  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e A[Catch: NotFoundException -> 0x0223, TRY_LEAVE, TryCatch #4 {NotFoundException -> 0x0223, blocks: (B:72:0x0209, B:75:0x021e), top: B:104:0x0209 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0236  */
    /* JADX WARN: Code duplicated, block: B:83:0x023c  */
    /* JADX WARN: Code duplicated, block: B:84:0x024c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0256  */
    /* JADX WARN: Code duplicated, block: B:90:0x026b  */
    /* JADX WARN: Code duplicated, block: B:92:0x026f  */
    /* JADX WARN: Code duplicated, block: B:94:0x027c  */
    @Override // o0OO0OoO.oo0o0Oo
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void OooO00o() {
        String str;
        Integer numValueOf;
        String[] stringArray;
        Iterator it;
        String packageName = this.f37615OooO00o.zzau().getPackageName();
        PackageManager packageManager = this.f37615OooO00o.zzau().getPackageManager();
        String str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        int i = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        if (packageManager == null) {
            this.f37615OooO00o.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeo.OooO0o0(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f37615OooO00o.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeo.OooO0o0(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f37615OooO00o.zzau().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    try {
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str2;
                        str2 = string;
                        this.f37615OooO00o.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeo.OooO0o0(packageName), str2);
                        str2 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
        }
        this.f16109OooO0OO = packageName;
        this.f16111OooO0o = installerPackageName;
        this.f16110OooO0Oo = str2;
        this.f16112OooO0o0 = i;
        this.f16113OooO0oO = 0L;
        boolean z = !TextUtils.isEmpty(this.f37615OooO00o.zzw()) && "am".equals(this.f37615OooO00o.zzx());
        int iZza = this.f37615OooO00o.zza();
        switch (iZza) {
            case 0:
                Oooo0.OooO00o(this.f37615OooO00o, "App measurement collection enabled");
                break;
            case 1:
                this.f37615OooO00o.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                Oooo0.OooO00o(this.f37615OooO00o, "App measurement deactivated via the init parameters");
                break;
            case 3:
                this.f37615OooO00o.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                this.f37615OooO00o.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                Oooo0.OooO00o(this.f37615OooO00o, "App measurement disabled via the init parameters");
                break;
            case 6:
                this.f37615OooO00o.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                this.f37615OooO00o.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                this.f37615OooO00o.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.f16117OooOO0o = "";
        this.f16119OooOOO0 = "";
        this.f37615OooO00o.zzaw();
        if (z) {
            this.f16119OooOOO0 = this.f37615OooO00o.zzw();
        }
        try {
            String strZzc = zzij.zzc(this.f37615OooO00o.zzau(), "google_app_id", this.f37615OooO00o.zzz());
            this.f16117OooOO0o = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                Context contextZzau = this.f37615OooO00o.zzau();
                String strZzz = this.f37615OooO00o.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources = contextZzau.getResources();
                if (TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfq.zza(contextZzau);
                }
                this.f16119OooOOO0 = zzfq.zzb("admob_app_id", resources, strZzz);
            }
            if (iZza == 0) {
                this.f37615OooO00o.zzay().zzj().zzc("App measurement enabled for app package, google app id", this.f16109OooO0OO, TextUtils.isEmpty(this.f16117OooOO0o) ? this.f16119OooOOO0 : this.f16117OooOO0o);
            }
        } catch (IllegalStateException e) {
            this.f37615OooO00o.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeo.OooO0o0(packageName), e);
        }
        List listAsList = null;
        this.f16108OooO = null;
        this.f37615OooO00o.zzaw();
        zzag zzagVarZzf = this.f37615OooO00o.zzf();
        Objects.requireNonNull(zzagVarZzf);
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleOooO0OO = zzagVarZzf.OooO0OO();
        if (bundleOooO0OO != null) {
            if (bundleOooO0OO.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleOooO0OO.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = zzagVarZzf.f37615OooO00o.zzau().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e2) {
                    zzagVarZzf.f37615OooO00o.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e2);
                }
            }
            if (listAsList != null) {
                this.f16108OooO = listAsList;
            } else if (listAsList.isEmpty()) {
                this.f37615OooO00o.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
            } else {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        this.f16108OooO = listAsList;
                    }
                } while (this.f37615OooO00o.zzv().OooOo0O("safelisted event", (String) it.next()));
            }
            if (packageManager != null) {
                this.f16116OooOO0O = InstantApps.isInstantApp(this.f37615OooO00o.zzau()) ? 1 : 0;
            } else {
                this.f16116OooOO0O = 0;
            }
        }
        OooOO0.OooO0O0(zzagVarZzf.f37615OooO00o, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = zzagVarZzf.f37615OooO00o.zzau().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            this.f16108OooO = listAsList;
        } else if (listAsList.isEmpty()) {
            this.f37615OooO00o.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    this.f16108OooO = listAsList;
                }
            } while (this.f37615OooO00o.zzv().OooOo0O("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.f16116OooOO0O = InstantApps.isInstantApp(this.f37615OooO00o.zzau()) ? 1 : 0;
        } else {
            this.f16116OooOO0O = 0;
        }
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @WorkerThread
    public final void OooO0OO() {
        String str;
        zzg();
        if (this.f37615OooO00o.zzm().OooO0o().zzi(zzah.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.f37615OooO00o.zzv().OooO().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.f37615OooO00o.zzay().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzem zzemVarZzc = this.f37615OooO00o.zzay().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzemVarZzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.f16118OooOOO = str;
        this.f16120OooOOOO = this.f37615OooO00o.zzav().currentTimeMillis();
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.f16109OooO0OO);
        return this.f16109OooO0OO;
    }

    @WorkerThread
    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.f16117OooOO0o);
        return this.f16117OooOO0o;
    }
}
