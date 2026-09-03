package o0O0OOO0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zziq;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o0O0OOO.OooOO0;
import p285o0O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile OooO0OO f41371OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final AppMeasurementSdk f41372OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final ConcurrentHashMap f41373OooO0O0;

    public OooO0OO(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f41372OooO00o = appMeasurementSdk;
        this.f41373OooO0O0 = new ConcurrentHashMap();
    }

    @Override // o0O0OOO0.OooO00o
    @KeepForSdk
    public final void OooO00o(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (o0O0OOO.OooO0O0.OooO0OO(str) && o0O0OOO.OooO0O0.OooO0O0(bundle, str2) && o0O0OOO.OooO0O0.OooO00o(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f41372OooO00o.logEvent(str, str2, bundle);
        }
    }

    @Override // o0O0OOO0.OooO00o
    @KeepForSdk
    public final void OooO0O0(@NonNull OooO00o.OooO0O0 oooO0O0) {
        zzjb zzjbVar = o0O0OOO.OooO0O0.f41345OooO00o;
        String str = oooO0O0.f41357OooO00o;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = oooO0O0.f41359OooO0OO;
        if ((obj == null || zziq.zza(obj) != null) && o0O0OOO.OooO0O0.OooO0OO(str) && o0O0OOO.OooO0O0.OooO0Oo(str, oooO0O0.f41358OooO0O0)) {
            String str2 = oooO0O0.f41366OooOO0O;
            if (str2 != null) {
                if (!o0O0OOO.OooO0O0.OooO0O0(oooO0O0.f41367OooOO0o, str2)) {
                    return;
                }
                if (!o0O0OOO.OooO0O0.OooO00o(oooO0O0.f41367OooOO0o, str, oooO0O0.f41366OooOO0O)) {
                    return;
                }
            }
            String str3 = oooO0O0.f41364OooO0oo;
            if (str3 != null) {
                if (!o0O0OOO.OooO0O0.OooO0O0(oooO0O0.f41356OooO, str3)) {
                    return;
                }
                if (!o0O0OOO.OooO0O0.OooO00o(oooO0O0.f41356OooO, str, oooO0O0.f41364OooO0oo)) {
                    return;
                }
            }
            String str4 = oooO0O0.f41361OooO0o;
            if (str4 != null) {
                if (!o0O0OOO.OooO0O0.OooO0O0(oooO0O0.f41363OooO0oO, str4)) {
                    return;
                }
                if (!o0O0OOO.OooO0O0.OooO00o(oooO0O0.f41363OooO0oO, str, oooO0O0.f41361OooO0o)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            String str5 = oooO0O0.f41357OooO00o;
            if (str5 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str5);
            }
            String str6 = oooO0O0.f41358OooO0O0;
            if (str6 != null) {
                bundle.putString("name", str6);
            }
            Object obj2 = oooO0O0.f41359OooO0OO;
            if (obj2 != null) {
                zzgz.zzb(bundle, obj2);
            }
            String str7 = oooO0O0.f41360OooO0Oo;
            if (str7 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, oooO0O0.f41362OooO0o0);
            String str8 = oooO0O0.f41361OooO0o;
            if (str8 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
            }
            Bundle bundle2 = oooO0O0.f41363OooO0oO;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str9 = oooO0O0.f41364OooO0oo;
            if (str9 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
            }
            Bundle bundle3 = oooO0O0.f41356OooO;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, oooO0O0.f41365OooOO0);
            String str10 = oooO0O0.f41366OooOO0O;
            if (str10 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
            }
            Bundle bundle4 = oooO0O0.f41367OooOO0o;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, oooO0O0.f41369OooOOO0);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, oooO0O0.f41368OooOOO);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, oooO0O0.f41370OooOOOO);
            this.f41372OooO00o.setConditionalUserProperty(bundle);
        }
    }

    @Override // o0O0OOO0.OooO00o
    @KeepForSdk
    public final void OooO0OO(@NonNull @Size(max = 24, min = 1) String str) {
        this.f41372OooO00o.clearConditionalUserProperty(str, null, null);
    }

    @Override // o0O0OOO0.OooO00o
    @NonNull
    @KeepForSdk
    @WorkerThread
    public final ArrayList OooO0Oo(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f41372OooO00o.getConditionalUserProperties(str, "")) {
            zzjb zzjbVar = o0O0OOO.OooO0O0.f41345OooO00o;
            Preconditions.checkNotNull(bundle);
            OooO00o.OooO0O0 oooO0O0 = new OooO00o.OooO0O0();
            oooO0O0.f41357OooO00o = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
            oooO0O0.f41358OooO0O0 = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "name", String.class, null));
            oooO0O0.f41359OooO0OO = zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            oooO0O0.f41360OooO0Oo = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            oooO0O0.f41362OooO0o0 = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            oooO0O0.f41361OooO0o = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            oooO0O0.f41363OooO0oO = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            oooO0O0.f41364OooO0oo = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            oooO0O0.f41356OooO = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            oooO0O0.f41365OooOO0 = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            oooO0O0.f41366OooOO0O = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            oooO0O0.f41367OooOO0o = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            oooO0O0.f41368OooOOO = ((Boolean) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            oooO0O0.f41369OooOOO0 = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            oooO0O0.f41370OooOOOO = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(oooO0O0);
        }
        return arrayList;
    }

    @Override // o0O0OOO0.OooO00o
    @KeepForSdk
    @WorkerThread
    public final int OooO0o(@NonNull @Size(min = 1) String str) {
        return this.f41372OooO00o.getMaxUserProperties(str);
    }

    @Override // o0O0OOO0.OooO00o
    @NonNull
    @KeepForSdk
    @WorkerThread
    public final Map<String, Object> OooO0o0(boolean z) {
        return this.f41372OooO00o.getUserProperties(null, null, z);
    }

    @Override // o0O0OOO0.OooO00o
    @NonNull
    @KeepForSdk
    @WorkerThread
    public final OooO0O0 OooO0oO(@NonNull String str, @NonNull OooOOO0 oooOOO0) {
        Object oooOO1;
        Preconditions.checkNotNull(oooOOO0);
        if (!o0O0OOO.OooO0O0.OooO0OO(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f41373OooO0O0;
        if ((zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) ? false : true) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f41372OooO00o;
        if (zEquals) {
            oooOO1 = new o0O0OOO.OooO0o(appMeasurementSdk, oooOOO0);
        } else {
            oooOO1 = "clx".equals(str) ? new OooOO0(appMeasurementSdk, oooOOO0) : null;
        }
        if (oooOO1 == null) {
            return null;
        }
        concurrentHashMap.put(str, oooOO1);
        return new OooO0O0();
    }

    @Override // o0O0OOO0.OooO00o
    @KeepForSdk
    public final void OooO0oo(@NonNull String str) {
        if (o0O0OOO.OooO0O0.OooO0OO(AppMeasurement.FCM_ORIGIN) && o0O0OOO.OooO0O0.OooO0Oo(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.f41372OooO00o.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", str);
        }
    }
}
