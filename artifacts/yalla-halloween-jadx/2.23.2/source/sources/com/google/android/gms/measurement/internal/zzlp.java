package com.google.android.gms.measurement.internal;

import OooO0OO.OooO00o;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.conscrypt.PSKKeyManager;
import p271o00ooooo.oO;
import p271o00ooooo.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlp extends oO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f15636OooO0oO = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f15637OooO0oo = {"_err"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SecureRandom f15638OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicLong f15639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Integer f15640OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15641OooO0o0;

    public zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.f15640OooO0o = null;
        this.f15639OooO0Oo = new AtomicLong(0L);
    }

    public static MessageDigest OooO0oO() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void OooOOO(v0 v0Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        Oooo00O(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        v0Var.OooO00o(bundle, str);
    }

    public static boolean OooOoO0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean OooOoOO(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean OooOoo(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean OooOoo0(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean OooOooO(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null && serviceInfo2.enabled) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) != null && serviceInfo.enabled) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    public static boolean OooOooo(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] Oooo000(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final boolean Oooo00O(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean Oooo0O0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public static long Oooo0oo(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzK(zzir zzirVar, Bundle bundle, boolean z) {
        if (bundle != null && zzirVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzirVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzirVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzirVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzirVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzan(String str) {
        return !f15637OooO0oo[0].equals(str);
    }

    @WorkerThread
    public final void OooO(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f40788OooO00o.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    @Override // p271o00ooooo.oO
    @WorkerThread
    public final void OooO00o() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f40788OooO00o.zzaA().zzk().zza("Utils falling back to Random for random id");
            }
        }
        this.f15639OooO0Oo.set(jNextLong);
    }

    @Override // p271o00ooooo.oO
    public final boolean OooO0O0() {
        return true;
    }

    public final Object OooO0Oo(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        zzgd zzgdVar = this.f40788OooO00o;
        if (zEquals) {
            zzgdVar.zzf();
            return Oooo0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, obj, true, true);
        }
        if (OooOoOO(str)) {
            zzgdVar.zzf();
        } else {
            zzgdVar.zzf();
            i = 100;
        }
        return Oooo0(i, obj, false, true);
    }

    public final String OooO0o() {
        byte[] bArr = new byte[16];
        OooO0oo().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object OooO0o0(Object obj, String str) {
        return "_ldl".equals(str) ? Oooo0(Oooo00o(str), obj, true, false) : Oooo0(Oooo00o(str), obj, false, false);
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    public final SecureRandom OooO0oo() {
        zzg();
        if (this.f15638OooO0OO == null) {
            this.f15638OooO0OO = new SecureRandom();
        }
        return this.f15638OooO0OO;
    }

    public final void OooOO0(Bundle bundle, int i, String str, Object obj) {
        if (Oooo00O(i, bundle)) {
            this.f40788OooO00o.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void OooOO0O(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f40788OooO00o.zzv().OooOOOO(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void OooOO0o(Parcelable[] parcelableArr, int i, boolean z) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (OooOoo0(str) && !Oooo0O0(str, zzhd.zzd) && (i2 = i2 + 1) > i) {
                    zzgd zzgdVar = this.f40788OooO00o;
                    if (z) {
                        zzgdVar.zzaA().zze().zzc(OooO00o.OooO00o("Param can't contain more than ", i, " item-scoped custom parameters"), zzgdVar.zzj().OooO0o0(str), zzgdVar.zzj().OooO0O0(bundle));
                        Oooo00O(28, bundle);
                    } else {
                        zzgdVar.zzaA().zze().zzc("Param cannot contain item-scoped custom parameters", zzgdVar.zzj().OooO0o0(str), zzgdVar.zzj().OooO0O0(bundle));
                        Oooo00O(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final void OooOOO0(zzeu zzeuVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzeuVar.zzd.keySet())) {
            if (OooOoo0(str) && (i2 = i2 + 1) > i) {
                String strOooO00o = OooO00o.OooO00o("Event can't contain more than ", i, " params");
                zzgd zzgdVar = this.f40788OooO00o;
                zzgdVar.zzaA().zze().zzc(strOooO00o, zzgdVar.zzj().OooO0Oo(zzeuVar.zza), zzgdVar.zzj().OooO0O0(zzeuVar.zzd));
                Oooo00O(5, zzeuVar.zzd);
                zzeuVar.zzd.remove(str);
            }
        }
    }

    public final void OooOOOO(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzgd zzgdVar = this.f40788OooO00o;
            zzgdVar.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", zzgdVar.zzj().OooO0o0(str), simpleName);
        }
    }

    public final void OooOOOo(String str, String str2, Bundle bundle, List list, boolean z) {
        int iOooo0o;
        int iOooOOoo;
        int i;
        String str3;
        if (bundle == null) {
            return;
        }
        zzgd zzgdVar = this.f40788OooO00o;
        zzag zzagVarZzf = zzgdVar.zzf();
        zzpq.zzc();
        String str4 = null;
        int i2 = (zzagVarZzf.f40788OooO00o.zzf().zzs(null, zzeg.zzaz) && zzagVarZzf.f40788OooO00o.zzv().zzai(231100000, true)) ? 35 : 0;
        int i3 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iOooo0o = !z ? Oooo0o(str5) : 0;
                if (iOooo0o == 0) {
                    iOooo0o = Oooo0o0(str5);
                }
            } else {
                iOooo0o = 0;
            }
            if (iOooo0o != 0) {
                OooOO0(bundle, iOooo0o, str5, iOooo0o == 3 ? str5 : str4);
                bundle.remove(str5);
                i = i2;
            } else {
                if (OooOoO0(bundle.get(str5))) {
                    zzgdVar.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str5);
                    iOooOOoo = 22;
                } else {
                    iOooOOoo = OooOOoo(str, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (iOooOOoo != 0 && !"_ev".equals(str5)) {
                    OooOO0(bundle, iOooOOoo, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (OooOoo0(str5) && !Oooo0O0(str5, zzhd.zzd)) {
                    int i4 = i3 + 1;
                    if (zzai(231100000, true)) {
                        i = i2;
                        if (i4 > i) {
                            zzpq.zzc();
                            str3 = null;
                            if (zzgdVar.zzf().zzs(null, zzeg.zzaz)) {
                                zzgdVar.zzaA().zze().zzc(OooO00o.OooO00o("Item can't contain more than ", i, " item-scoped custom params"), zzgdVar.zzj().OooO0Oo(str), zzgdVar.zzj().OooO0O0(bundle));
                                Oooo00O(28, bundle);
                                bundle.remove(str5);
                            } else {
                                zzgdVar.zzaA().zze().zzc("Item cannot contain custom parameters", zzgdVar.zzj().OooO0Oo(str), zzgdVar.zzj().OooO0O0(bundle));
                                Oooo00O(23, bundle);
                                bundle.remove(str5);
                            }
                        }
                        i3 = i4;
                        str4 = str3;
                    } else {
                        zzgdVar.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzgdVar.zzj().OooO0Oo(str), zzgdVar.zzj().OooO0O0(bundle));
                        Oooo00O(23, bundle);
                        bundle.remove(str5);
                        i = i2;
                    }
                    str3 = null;
                    i3 = i4;
                    str4 = str3;
                }
                i = i2;
                str4 = null;
            }
            i2 = i;
        }
    }

    public final boolean OooOOo(int i, String str, String str2) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str2 == null) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzgdVar.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean OooOOo0(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzgd zzgdVar = this.f40788OooO00o;
        if (!zIsEmpty) {
            Preconditions.checkNotNull(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (zzgdVar.zzL()) {
                zzgdVar.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.OooO0Oo(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (zzgdVar.zzL()) {
                zzgdVar.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Preconditions.checkNotNull(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        zzgdVar.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzet.OooO0Oo(str2));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    @WorkerThread
    public final int OooOOoo(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        zzg();
        boolean zOooOoO0 = OooOoO0(obj);
        zzgd zzgdVar = this.f40788OooO00o;
        if (!zOooOoO0) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!Oooo0O0(str2, zzhd.zzc)) {
                return 20;
            }
            zzjz zzjzVarZzt = zzgdVar.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            if (zzjzVarZzt.OooO0o() && zzjzVarZzt.f40788OooO00o.zzv().zzm() < 200900) {
                return 25;
            }
            zzgdVar.zzf();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                zzgdVar.zzaA().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                zzgdVar.zzf();
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (OooOoOO(str) || OooOoOO(str2)) {
            zzgdVar.zzf();
            i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        } else {
            zzgdVar.zzf();
            i2 = 100;
        }
        if (OooOo0("param", str2, i2, obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            OooOOOo(str, str2, (Bundle) obj, list, z);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    zzgdVar.zzaA().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                    return 4;
                }
                OooOOOo(str, str2, (Bundle) parcelable, list, z);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj2 = arrayList2.get(i3);
                if (!(obj2 instanceof Bundle)) {
                    zzgdVar.zzaA().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                    return 4;
                }
                OooOOOo(str, str2, (Bundle) obj2, list, z);
            }
        }
        return i;
    }

    @WorkerThread
    public final boolean OooOo(String str) {
        zzg();
        zzgd zzgdVar = this.f40788OooO00o;
        if (Wrappers.packageManager(zzgdVar.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgdVar.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean OooOo0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.f40788OooO00o.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean OooOo00(String str, String[] strArr, String[] strArr2, String str2) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str2 == null) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f15636OooO0oO;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                zzgdVar.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Oooo0O0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Oooo0O0(str2, strArr2)) {
            return true;
        }
        zzgdVar.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean OooOo0O(String str, String str2) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str2 == null) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                zzgdVar.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgdVar.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean OooOo0o(String str, String str2) {
        zzgd zzgdVar = this.f40788OooO00o;
        if (str2 == null) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzgdVar.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzgdVar.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgdVar.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @VisibleForTesting
    public final boolean OooOoO(Context context, String str) {
        Signature[] signatureArr;
        zzgd zzgdVar = this.f40788OooO00o;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzgdVar.zzaA().zzd().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            zzgdVar.zzaA().zzd().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final Bundle Oooo(boolean z, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("utm_id");
                queryParameter6 = uri.getQueryParameter("dclid");
                queryParameter7 = uri.getQueryParameter("srsltid");
                queryParameter8 = z ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z || TextUtils.isEmpty(queryParameter8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter9 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("term", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("content", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("aclid", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("cp1", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("anid", queryParameter13);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("campaign_id", queryParameter5);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("dclid", queryParameter6);
            }
            String queryParameter14 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("source_platform", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("creative_format", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("marketing_tactic", queryParameter16);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("srsltid", queryParameter7);
            }
            if (z && !TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("sfmc_id", queryParameter8);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final Object Oooo0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzD(obj.toString(), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleOoooO00 = OoooO00((Bundle) parcelable);
                if (!bundleOoooO00.isEmpty()) {
                    arrayList.add(bundleOoooO00);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int Oooo00o(String str) {
        boolean zEquals = "_ldl".equals(str);
        zzgd zzgdVar = this.f40788OooO00o;
        if (zEquals) {
            zzgdVar.zzf();
            return 2048;
        }
        if ("_id".equals(str)) {
            zzgdVar.zzf();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ("_lgclid".equals(str)) {
            zzgdVar.zzf();
            return 100;
        }
        zzgdVar.zzf();
        return 36;
    }

    public final int Oooo0OO(Object obj, String str) {
        return "_ldl".equals(str) ? OooOo0("user property referrer", str, Oooo00o(str), obj) : OooOo0("user property", str, Oooo00o(str), obj) ? 0 : 7;
    }

    public final int Oooo0o(String str) {
        if (!OooOo0o("event param", str)) {
            return 3;
        }
        if (!OooOo00("event param", null, null, str)) {
            return 14;
        }
        this.f40788OooO00o.zzf();
        return !OooOOo(40, "event param", str) ? 3 : 0;
    }

    public final int Oooo0o0(String str) {
        if (!OooOo0O("event param", str)) {
            return 3;
        }
        if (!OooOo00("event param", null, null, str)) {
            return 14;
        }
        this.f40788OooO00o.zzf();
        return !OooOOo(40, "event param", str) ? 3 : 0;
    }

    public final int Oooo0oO(String str) {
        if (!OooOo0O("user property", str)) {
            return 6;
        }
        if (!OooOo00("user property", zzhe.zza, null, str)) {
            return 15;
        }
        this.f40788OooO00o.zzf();
        return !OooOOo(24, "user property", str) ? 6 : 0;
    }

    public final Bundle OoooO0(String str, Bundle bundle, List list, boolean z) {
        int iOooo0o;
        boolean zOooo0O0 = Oooo0O0(str, zzhc.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzgd zzgdVar = this.f40788OooO00o;
        int iZzc = zzgdVar.zzf().zzc();
        int i = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iOooo0o = !z ? Oooo0o(str2) : 0;
                if (iOooo0o == 0) {
                    iOooo0o = Oooo0o0(str2);
                }
            } else {
                iOooo0o = 0;
            }
            if (iOooo0o != 0) {
                OooOO0(bundle2, iOooo0o, str2, iOooo0o == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iOooOOoo = OooOOoo(str, str2, bundle.get(str2), bundle2, list, z, zOooo0O0);
                if (iOooOOoo == 17) {
                    OooOO0(bundle2, 17, str2, Boolean.FALSE);
                } else if (iOooOOoo != 0 && !"_ev".equals(str2)) {
                    OooOO0(bundle2, iOooOOoo, iOooOOoo == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (OooOoo0(str2)) {
                    int i2 = i + 1;
                    if (i2 > iZzc) {
                        zzgdVar.zzaA().zze().zzc(OooO00o.OooO00o("Event can't contain more than ", iZzc, " params"), zzgdVar.zzj().OooO0Oo(str), zzgdVar.zzj().OooO0O0(bundle));
                        Oooo00O(5, bundle2);
                        bundle2.remove(str2);
                    }
                    i = i2;
                }
            }
        }
        return bundle2;
    }

    public final Bundle OoooO00(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objOooO0Oo = OooO0Oo(bundle.get(str), str);
                if (objOooO0Oo == null) {
                    zzgd zzgdVar = this.f40788OooO00o;
                    zzgdVar.zzaA().zzl().zzb("Param value can't be null", zzgdVar.zzj().OooO0o0(str));
                } else {
                    OooOOOO(bundle2, str, objOooO0Oo);
                }
            }
        }
        return bundle2;
    }

    public final zzau OoooO0O(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (zzh(str) != 0) {
            zzgd zzgdVar = this.f40788OooO00o;
            zzgdVar.zzaA().zzd().zzb("Invalid conditional property event name", zzgdVar.zzj().OooO0o(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleOoooO0 = OoooO0(str, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleOoooO0 = OoooO00(bundleOoooO0);
        }
        Preconditions.checkNotNull(bundleOoooO0);
        return new zzau(str, new zzas(bundleOoooO0), str2, j);
    }

    public final String zzD(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final URL zzE(long j, String str, String str2, long j2) {
        zzgd zzgdVar = this.f40788OooO00o;
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 79000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j2));
            if (str.equals(zzgdVar.zzf().zzm())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            zzgdVar.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f40788OooO00o.zzaA().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    public final boolean zzai(int i, boolean z) {
        Boolean bool = this.f40788OooO00o.zzt().f15590OooO0o0;
        if (zzm() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int zzh(String str) {
        if (!OooOo0O("event", str)) {
            return 2;
        }
        if (!OooOo00("event", zzhc.zza, zzhc.zzb, str)) {
            return 13;
        }
        this.f40788OooO00o.zzf();
        return !OooOOo(40, "event", str) ? 2 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.f15640OooO0o == null) {
            this.f15640OooO0o = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f40788OooO00o.zzaw()) / 1000);
        }
        return this.f15640OooO0o.intValue();
    }

    public final int zzo(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.f40788OooO00o.zzaw(), 12451000);
    }

    public final long zzq() {
        long andIncrement;
        long j;
        if (this.f15639OooO0Oo.get() != 0) {
            synchronized (this.f15639OooO0Oo) {
                this.f15639OooO0Oo.compareAndSet(-1L, 1L);
                andIncrement = this.f15639OooO0Oo.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f15639OooO0Oo) {
            long jNextLong = new Random(System.nanoTime() ^ this.f40788OooO00o.zzax().currentTimeMillis()).nextLong();
            int i = this.f15641OooO0o0 + 1;
            this.f15641OooO0o0 = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final long zzr(long j, long j2) {
        return ((j2 * 60000) + j) / 86400000;
    }
}
