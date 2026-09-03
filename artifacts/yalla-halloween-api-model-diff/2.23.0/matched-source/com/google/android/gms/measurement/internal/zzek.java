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
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.o0OO0oO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzek extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List f15904OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f15905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f15906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f15907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f15909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f15910OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f15911OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f15912OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f15913OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f15914OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f15915OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f15916OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f15917OooOOOo;

    public zzek(zzgd zzgdVar, long j) {
        super(zzgdVar);
        this.f15916OooOOOO = 0L;
        this.f15917OooOOOo = null;
        this.f15910OooO0oo = j;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fd A[Catch: NotFoundException -> 0x0202, TRY_LEAVE, TryCatch #3 {NotFoundException -> 0x0202, blocks: (B:73:0x01ea, B:76:0x01fd), top: B:103:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:85:0x0227  */
    /* JADX WARN: Code duplicated, block: B:88:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x0244  */
    /* JADX WARN: Code duplicated, block: B:93:0x0248  */
    /* JADX WARN: Code duplicated, block: B:95:0x0253  */
    @Override // p269o00ooooo.o0OO0oO0
    @EnsuresNonNull({RemoteConfigConstants$RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void OooO00o() {
        String str;
        Integer numValueOf;
        String[] stringArray;
        Iterator it;
        zzgd zzgdVar = this.f41276OooO00o;
        String packageName = zzgdVar.zzaw().getPackageName();
        PackageManager packageManager = zzgdVar.zzaw().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str2 = "";
        String str3 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String installerPackageName = "unknown";
        if (packageManager == null) {
            zzgdVar.zzaA().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzet.OooO0Oo(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzgdVar.zzaA().zzd().zzb("Error retrieving app installer package name. appId", zzet.OooO0Oo(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(zzgdVar.zzaw().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    try {
                        str3 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string;
                        zzgdVar.zzaA().zzd().zzc("Error retrieving package info. appId, appName", zzet.OooO0Oo(packageName), str3);
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
        }
        this.f15905OooO0OO = packageName;
        this.f15907OooO0o = installerPackageName;
        this.f15906OooO0Oo = str3;
        this.f15908OooO0o0 = i;
        this.f15909OooO0oO = 0L;
        boolean z = !TextUtils.isEmpty(zzgdVar.zzw()) && "am".equals(zzgdVar.zzx());
        int iZza = zzgdVar.zza();
        switch (iZza) {
            case 0:
                zzgdVar.zzaA().zzj().zza("App measurement collection enabled");
                break;
            case 1:
                zzgdVar.zzaA().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                zzgdVar.zzaA().zzj().zza("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzgdVar.zzaA().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzgdVar.zzaA().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                zzgdVar.zzaA().zzj().zza("App measurement disabled via the init parameters");
                break;
            case 6:
                zzgdVar.zzaA().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzgdVar.zzaA().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                zzgdVar.zzaA().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.f15913OooOO0o = "";
        this.f15915OooOOO0 = "";
        zzgdVar.zzay();
        if (z) {
            this.f15915OooOOO0 = zzgdVar.zzw();
        }
        try {
            String strZzc = zziq.zzc(zzgdVar.zzaw(), "google_app_id", zzgdVar.zzz());
            if (!TextUtils.isEmpty(strZzc)) {
                str2 = strZzc;
            }
            this.f15913OooOO0o = str2;
            if (!TextUtils.isEmpty(strZzc)) {
                Context contextZzaw = zzgdVar.zzaw();
                String strZzz = zzgdVar.zzz();
                Preconditions.checkNotNull(contextZzaw);
                Resources resources = contextZzaw.getResources();
                if (TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfv.zza(contextZzaw);
                }
                this.f15915OooOOO0 = zzfv.zzb("admob_app_id", resources, strZzz);
            }
            if (iZza == 0) {
                zzgdVar.zzaA().zzj().zzc("App measurement enabled for app package, google app id", this.f15905OooO0OO, TextUtils.isEmpty(this.f15913OooOO0o) ? this.f15915OooOOO0 : this.f15913OooOO0o);
            }
        } catch (IllegalStateException e) {
            zzgdVar.zzaA().zzd().zzc("Fetching Google App Id failed with exception. appId", zzet.OooO0Oo(packageName), e);
        }
        List listAsList = null;
        this.f15904OooO = null;
        zzgdVar.zzay();
        zzag zzagVarZzf = zzgdVar.zzf();
        zzagVarZzf.getClass();
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleOooO0O0 = zzagVarZzf.OooO0O0();
        zzgd zzgdVar2 = zzagVarZzf.f41276OooO00o;
        if (bundleOooO0O0 != null) {
            if (bundleOooO0O0.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleOooO0O0.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = zzgdVar2.zzaw().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e2) {
                    zzgdVar2.zzaA().zzd().zzb("Failed to load string array from metadata: resource not found", e2);
                }
            }
            if (listAsList != null) {
                this.f15904OooO = listAsList;
            } else if (listAsList.isEmpty()) {
                zzgdVar.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
            } else {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        this.f15904OooO = listAsList;
                    }
                } while (zzgdVar.zzv().OooOo0O("safelisted event", (String) it.next()));
            }
            if (packageManager != null) {
                this.f15912OooOO0O = InstantApps.isInstantApp(zzgdVar.zzaw()) ? 1 : 0;
            } else {
                this.f15912OooOO0O = 0;
            }
        }
        o0O0OO0.OooO00o(zzgdVar2, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = zzgdVar2.zzaw().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            this.f15904OooO = listAsList;
        } else if (listAsList.isEmpty()) {
            zzgdVar.zzaA().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    this.f15904OooO = listAsList;
                }
            } while (zzgdVar.zzv().OooOo0O("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.f15912OooOO0O = InstantApps.isInstantApp(zzgdVar.zzaw()) ? 1 : 0;
        } else {
            this.f15912OooOO0O = 0;
        }
    }

    @Override // p269o00ooooo.o0OO0oO0
    public final boolean OooO0O0() {
        return true;
    }

    @WorkerThread
    public final void OooO0OO() {
        String str;
        zzg();
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzgdVar.zzv().OooO0oo().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzgdVar.zzaA().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzer zzerVarZzc = zzgdVar.zzaA().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzerVarZzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.f15914OooOOO = str;
        this.f15916OooOOOO = zzgdVar.zzax().currentTimeMillis();
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.f15905OooO0OO);
        return this.f15905OooO0OO;
    }

    @WorkerThread
    public final String zzm() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.f15913OooOO0o);
        return this.f15913OooOO0o;
    }
}
