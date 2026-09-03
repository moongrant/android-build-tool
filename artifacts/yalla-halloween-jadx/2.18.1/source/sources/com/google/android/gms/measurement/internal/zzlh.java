package com.google.android.gms.measurement.internal;

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
import androidx.appcompat.widget.o00000O0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ao;
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
import o0OO0OoO.OooO00o;
import o0OO0OoO.o000OO0O;
import o0OO0OoO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlh extends o000OO0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f16315OooO0oO = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f16316OooO0oo = {"_err"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SecureRandom f16317OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicLong f16318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Integer f16319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16320OooO0o0;

    public zzlh(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16319OooO0o = null;
        this.f16318OooO0Oo = new AtomicLong(0L);
    }

    public static MessageDigest OooO0oo() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static boolean OooOoo(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean OooOoo0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean OooOooO(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean OooOooo(Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? Oooo0o0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : Oooo0o0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static final boolean Oooo00o(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean Oooo0OO(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzlf.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Oooo0o0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    public static long OoooO00(byte[] bArr) {
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
            zzgu.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzaw zzawVar = zzacVar.zzg;
            if (zzawVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzawVar.zza);
                zzau zzauVar = zzawVar.zzb;
                if (zzauVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzauVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzaw zzawVar2 = zzacVar.zzi;
            if (zzawVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzawVar2.zza);
                zzau zzauVar2 = zzawVar2.zzb;
                if (zzauVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzauVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzaw zzawVar3 = zzacVar.zzk;
            if (zzawVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzawVar3.zza);
                zzau zzauVar3 = zzawVar3.zzb;
                if (zzauVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzauVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzK(zzik zzikVar, Bundle bundle, boolean z) {
        if (bundle != null && zzikVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzikVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzikVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzikVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzikVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzal(String str) {
        return !f16316OooO0oo[0].equals(str);
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    public final SecureRandom OooO() {
        zzg();
        if (this.f16317OooO0OO == null) {
            this.f16317OooO0OO = new SecureRandom();
        }
        return this.f16317OooO0OO;
    }

    @Override // o0OO0OoO.o000OO0O
    @WorkerThread
    public final void OooO00o() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                OooO00o.OooO0O0(this.f37615OooO00o, "Utils falling back to Random for random id");
            }
        }
        this.f16318OooO0Oo.set(jNextLong);
    }

    @Override // o0OO0OoO.o000OO0O
    public final boolean OooO0O0() {
        return true;
    }

    public final Object OooO0o(String str, Object obj) {
        return "_ldl".equals(str) ? Oooo0O0(Oooo0(str), obj, true, false) : Oooo0O0(Oooo0(str), obj, false, false);
    }

    public final Object OooO0o0(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f37615OooO00o.zzf();
            return Oooo0O0(256, obj, true, true);
        }
        if (OooOoo0(str)) {
            this.f37615OooO00o.zzf();
        } else {
            this.f37615OooO00o.zzf();
            i = 100;
        }
        return Oooo0O0(i, obj, false, true);
    }

    public final String OooO0oO() {
        byte[] bArr = new byte[16];
        OooO().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @WorkerThread
    public final void OooOO0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f37615OooO00o.zzay().zzk().zzb("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void OooOO0O(Bundle bundle, int i, String str, Object obj) {
        if (Oooo00o(bundle, i)) {
            this.f37615OooO00o.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void OooOO0o(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f37615OooO00o.zzv().OooOOOO(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void OooOOO(o0OO00OO o0oo00oo2, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        Oooo00o(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        o0oo00oo2.OooO00o(str, bundle);
    }

    public final void OooOOO0(zzep zzepVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzepVar.zzd.keySet())) {
            if (OooOoo(str) && (i2 = i2 + 1) > i) {
                this.f37615OooO00o.zzay().zze().zzc(o00000O0.OooO00o("Event can't contain more than ", i, " params").toString(), this.f37615OooO00o.zzj().OooO0Oo(zzepVar.zza), this.f37615OooO00o.zzj().OooO0O0(zzepVar.zzd));
                Oooo00o(zzepVar.zzd, 5);
                zzepVar.zzd.remove(str);
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
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f37615OooO00o.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.f37615OooO00o.zzj().OooO0o0(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void OooOOOo(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int iOooo0oo;
        int iOooOo00;
        if (bundle == null) {
            return;
        }
        this.f37615OooO00o.zzf();
        int i = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iOooo0oo = !z ? Oooo0oo(str4) : 0;
                if (iOooo0oo == 0) {
                    iOooo0oo = Oooo0oO(str4);
                }
            } else {
                iOooo0oo = 0;
            }
            if (iOooo0oo != 0) {
                OooOO0O(bundle, iOooo0oo, str4, iOooo0oo == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (OooOoO(bundle.get(str4))) {
                    this.f37615OooO00o.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iOooOo00 = 22;
                } else {
                    iOooOo00 = OooOo00(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iOooOo00 != 0 && !"_ev".equals(str4)) {
                    OooOO0O(bundle, iOooOo00, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (OooOoo(str4) && !Oooo0OO(str4, zzgw.zzd) && (i = i + 1) > 0) {
                    this.f37615OooO00o.zzay().zze().zzc("Item cannot contain custom parameters", this.f37615OooO00o.zzj().OooO0Oo(str2), this.f37615OooO00o.zzj().OooO0O0(bundle));
                    Oooo00o(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean OooOOo(String str, int i, String str2) {
        if (str2 == null) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.f37615OooO00o.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean OooOOo0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Preconditions.checkNotNull(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.f37615OooO00o.zzL()) {
                this.f37615OooO00o.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeo.OooO0o0(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f37615OooO00o.zzL()) {
                this.f37615OooO00o.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Preconditions.checkNotNull(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        this.f37615OooO00o.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeo.OooO0o0(str2));
        return false;
    }

    public final boolean OooOOoo(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f16315OooO0oO;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f37615OooO00o.zzay().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Oooo0OO(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Oooo0OO(str2, strArr2)) {
            return true;
        }
        this.f37615OooO00o.zzay().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    @WorkerThread
    public final boolean OooOo(String str) {
        zzg();
        if (Wrappers.packageManager(this.f37615OooO00o.zzau()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f37615OooO00o.zzay().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean OooOo0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.f37615OooO00o.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    @WorkerThread
    public final int OooOo00(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        zzg();
        if (!OooOoO(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!Oooo0OO(str3, zzgw.zzc)) {
                return 20;
            }
            zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
            zzjsVarZzt.zzg();
            zzjsVarZzt.zza();
            if (zzjsVarZzt.OooO0o() && zzjsVarZzt.f37615OooO00o.zzv().zzm() < 200900) {
                return 25;
            }
            this.f37615OooO00o.zzf();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                this.f37615OooO00o.zzay().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.f37615OooO00o.zzf();
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (OooOoo0(str2) || OooOoo0(str3)) {
            this.f37615OooO00o.zzf();
            i2 = 256;
        } else {
            this.f37615OooO00o.zzf();
            i2 = 100;
        }
        if (OooOo0("param", str3, i2, obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            OooOOOo(str, str2, str3, (Bundle) obj, list, z);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    this.f37615OooO00o.zzay().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    return 4;
                }
                OooOOOo(str, str2, str3, (Bundle) parcelable, list, z);
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
                    this.f37615OooO00o.zzay().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                    return 4;
                }
                OooOOOo(str, str2, str3, (Bundle) obj2, list, z);
            }
        }
        return i;
    }

    public final boolean OooOo0O(String str, String str2) {
        if (str2 == null) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f37615OooO00o.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f37615OooO00o.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean OooOo0o(String str, String str2) {
        if (str2 == null) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f37615OooO00o.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f37615OooO00o.zzay().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f37615OooO00o.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean OooOoO(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean OooOoO0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strZzl = this.f37615OooO00o.zzf().zzl();
        this.f37615OooO00o.zzaw();
        return strZzl.equals(str);
    }

    @VisibleForTesting
    public final boolean OooOoOO(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.f37615OooO00o.zzay().zzd().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.f37615OooO00o.zzay().zzd().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final int Oooo(String str) {
        if (!OooOo0O("user property", str)) {
            return 6;
        }
        if (!OooOOoo("user property", zzgx.zza, null, str)) {
            return 15;
        }
        this.f37615OooO00o.zzf();
        return !OooOOo("user property", 24, str) ? 6 : 0;
    }

    public final int Oooo0(String str) {
        if ("_ldl".equals(str)) {
            this.f37615OooO00o.zzf();
            return RecyclerView.oo0o0Oo.FLAG_MOVED;
        }
        if (ao.d.equals(str)) {
            this.f37615OooO00o.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f37615OooO00o.zzf();
            return 100;
        }
        this.f37615OooO00o.zzf();
        return 36;
    }

    public final boolean Oooo000(String str, String str2, String str3, String str4) {
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

    public final byte[] Oooo00O(Parcelable parcelable) {
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

    public final Object Oooo0O0(int i, Object obj, boolean z, boolean z2) {
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
                Bundle bundleOoooO0O = OoooO0O((Bundle) parcelable);
                if (!bundleOoooO0O.isEmpty()) {
                    arrayList.add(bundleOoooO0O);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int Oooo0o(String str, Object obj) {
        return "_ldl".equals(str) ? OooOo0("user property referrer", str, Oooo0(str), obj) : OooOo0("user property", str, Oooo0(str), obj) ? 0 : 7;
    }

    public final int Oooo0oO(String str) {
        if (!OooOo0O("event param", str)) {
            return 3;
        }
        if (!OooOOoo("event param", null, null, str)) {
            return 14;
        }
        this.f37615OooO00o.zzf();
        return !OooOOo("event param", 40, str) ? 3 : 0;
    }

    public final int Oooo0oo(String str) {
        if (!OooOo0o("event param", str)) {
            return 3;
        }
        if (!OooOOoo("event param", null, null, str)) {
            return 14;
        }
        this.f37615OooO00o.zzf();
        return !OooOOo("event param", 40, str) ? 3 : 0;
    }

    public final Bundle OoooO(String str, String str2, Bundle bundle, List list, boolean z) {
        int iOooo0oo;
        boolean zOooo0OO = Oooo0OO(str2, zzgv.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iZzc = this.f37615OooO00o.zzf().zzc();
        int i = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iOooo0oo = !z ? Oooo0oo(str3) : 0;
                if (iOooo0oo == 0) {
                    iOooo0oo = Oooo0oO(str3);
                }
            } else {
                iOooo0oo = 0;
            }
            if (iOooo0oo != 0) {
                OooOO0O(bundle2, iOooo0oo, str3, iOooo0oo == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iOooOo00 = OooOo00(str, str2, str3, bundle.get(str3), bundle2, list, z, zOooo0OO);
                if (iOooOo00 == 17) {
                    OooOO0O(bundle2, 17, str3, Boolean.FALSE);
                } else if (iOooOo00 != 0 && !"_ev".equals(str3)) {
                    OooOO0O(bundle2, iOooOo00, iOooOo00 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (OooOoo(str3)) {
                    int i2 = i + 1;
                    if (i2 > iZzc) {
                        this.f37615OooO00o.zzay().zze().zzc(o00000O0.OooO00o("Event can't contain more than ", iZzc, " params").toString(), this.f37615OooO00o.zzj().OooO0Oo(str2), this.f37615OooO00o.zzj().OooO0O0(bundle));
                        Oooo00o(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i = i2;
                }
            }
        }
        return bundle2;
    }

    public final Bundle OoooO0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("utm_id");
                    queryParameter6 = uri.getQueryParameter("dclid");
                    queryParameter7 = uri.getQueryParameter("srsltid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7)) {
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
                String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("term", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("content", queryParameter9);
                }
                String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("aclid", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("cp1", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("anid", queryParameter12);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("campaign_id", queryParameter5);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("dclid", queryParameter6);
                }
                String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("source_platform", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("creative_format", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("marketing_tactic", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("srsltid", queryParameter7);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f37615OooO00o.zzay().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    public final Bundle OoooO0O(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objOooO0o0 = OooO0o0(str, bundle.get(str));
                if (objOooO0o0 == null) {
                    this.f37615OooO00o.zzay().zzl().zzb("Param value can't be null", this.f37615OooO00o.zzj().OooO0o0(str));
                } else {
                    OooOOOO(bundle2, str, objOooO0o0);
                }
            }
        }
        return bundle2;
    }

    public final zzaw OoooOO0(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.f37615OooO00o.zzay().zzd().zzb("Invalid conditional property event name", this.f37615OooO00o.zzj().OooO0o(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleOoooO = OoooO(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleOoooO = OoooO0O(bundleOoooO);
        }
        Preconditions.checkNotNull(bundleOoooO);
        return new zzaw(str2, new zzau(bundleOoooO), str3, j);
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
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 73000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j2));
            if (str.equals(this.f37615OooO00o.zzf().zzm())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f37615OooO00o.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void zzP(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f37615OooO00o.zzay().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    public final int zzh(String str) {
        if (!OooOo0O("event", str)) {
            return 2;
        }
        if (!OooOOoo("event", zzgv.zza, zzgv.zzb, str)) {
            return 13;
        }
        this.f37615OooO00o.zzf();
        return !OooOOo("event", 40, str) ? 2 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.f16319OooO0o == null) {
            this.f16319OooO0o = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f37615OooO00o.zzau()) / 1000);
        }
        return this.f16319OooO0o.intValue();
    }

    public final int zzo(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.f37615OooO00o.zzau(), 12451000);
    }

    public final long zzq() {
        long andIncrement;
        long j;
        if (this.f16318OooO0Oo.get() != 0) {
            synchronized (this.f16318OooO0Oo) {
                this.f16318OooO0Oo.compareAndSet(-1L, 1L);
                andIncrement = this.f16318OooO0Oo.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f16318OooO0Oo) {
            long jNextLong = new Random(System.nanoTime() ^ this.f37615OooO00o.zzav().currentTimeMillis()).nextLong();
            int i = this.f16320OooO0o0 + 1;
            this.f16320OooO0o0 = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final long zzr(long j, long j2) {
        return ((j2 * 60000) + j) / 86400000;
    }
}
