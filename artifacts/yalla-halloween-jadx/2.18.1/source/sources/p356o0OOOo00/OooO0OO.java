package p356o0OOOo00;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p355o0OOOo0.OooO0O0;
import p355o0OOOo0.OooO0o;
import p355o0OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile OooO0OO f38315OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final AppMeasurementSdk f38316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final ConcurrentHashMap f38317OooO0O0;

    public class OooO00o implements OooO0O0.OooO00o {
    }

    public OooO0OO(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f38316OooO00o = appMeasurementSdk;
        this.f38317OooO0O0 = new ConcurrentHashMap();
    }

    @Override // p356o0OOOo00.OooO0O0
    @KeepForSdk
    public final void OooO00o(@NonNull Object obj) {
        if (OooO0O0.OooO00o(AppMeasurement.FCM_ORIGIN)) {
            this.f38316OooO00o.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", obj);
        }
    }

    @Override // p356o0OOOo00.OooO0O0
    @NonNull
    @KeepForSdk
    @WorkerThread
    public final OooO0O0.OooO00o OooO0O0(@NonNull String str, @NonNull OooO0O0.InterfaceC0381OooO0O0 interfaceC0381OooO0O0) {
        Object oooOO1;
        Preconditions.checkNotNull(interfaceC0381OooO0O0);
        if (!OooO0O0.OooO00o(str)) {
            return null;
        }
        if ((str.isEmpty() || !this.f38317OooO0O0.containsKey(str) || this.f38317OooO0O0.get(str) == null) ? false : true) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f38316OooO00o;
        if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
            oooOO1 = new OooO0o(appMeasurementSdk, interfaceC0381OooO0O0);
        } else {
            oooOO1 = (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new OooOO0(appMeasurementSdk, interfaceC0381OooO0O0) : null;
        }
        if (oooOO1 == null) {
            return null;
        }
        this.f38317OooO0O0.put(str, oooOO1);
        return new OooO00o();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    @Override // p356o0OOOo00.OooO0O0
    @KeepForSdk
    public final void OooO0OO(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        boolean z;
        byte b;
        if (OooO0O0.OooO00o(str)) {
            boolean z2 = false;
            if (!OooO0O0.f38305OooO0O0.contains(str2)) {
                Iterator it = OooO0O0.f38307OooO0Oo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (bundle.containsKey((String) it.next())) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                if (!"_cmp".equals(str2)) {
                    z2 = true;
                    break;
                }
                if (OooO0O0.OooO00o(str)) {
                    Iterator it2 = OooO0O0.f38307OooO0Oo.iterator();
                    do {
                        if (!it2.hasNext()) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != 101200) {
                                if (iHashCode != 101230) {
                                    if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
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
                            } else if (b == 1) {
                                bundle.putString("_cis", "fdl_integration");
                            } else if (b != 2) {
                                break;
                            } else {
                                bundle.putString("_cis", "fiam_integration");
                            }
                            z2 = true;
                            break;
                        }
                    } while (!bundle.containsKey((String) it2.next()));
                }
                if (z2) {
                    if ("clx".equals(str) && "_ae".equals(str2)) {
                        bundle.putLong("_r", 1L);
                    }
                    this.f38316OooO00o.logEvent(str, str2, bundle);
                }
            }
        }
    }
}
