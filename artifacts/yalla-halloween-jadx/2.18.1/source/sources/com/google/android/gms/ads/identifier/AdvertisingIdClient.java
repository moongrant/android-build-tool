package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p322o0O0oo.OooO;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@ParametersAreNonnullByDefault
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public BlockingServiceConnection f15018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public zzf f15019OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f15020OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("this")
    public final Context f15022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mAutoDisconnectTaskLock")
    public OooO f15023OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f15024OooO0oO;

    @KeepForSdkWithMembers
    public static final class Info {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final String f15025OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f15026OooO0O0;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.f15025OooO00o = str;
            this.f15026OooO0O0 = z;
        }

        @Nullable
        public String getId() {
            return this.f15025OooO00o;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f15026OooO0O0;
        }

        @NonNull
        public String toString() {
            String str = this.f15025OooO00o;
            boolean z = this.f15026OooO0O0;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.OooO00o(false);
            Info infoOooO0OO = advertisingIdClient.OooO0OO();
            advertisingIdClient.OooO0O0(infoOooO0OO, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            advertisingIdClient.zza();
            return infoOooO0OO;
        } catch (Throwable th) {
            try {
                advertisingIdClient.OooO0O0(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.OooO00o(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (advertisingIdClient.f15020OooO0OO) {
                    Preconditions.checkNotNull(advertisingIdClient.f15018OooO00o);
                    Preconditions.checkNotNull(advertisingIdClient.f15019OooO0O0);
                    zZzd = advertisingIdClient.f15019OooO0O0.zzd();
                } else {
                    synchronized (advertisingIdClient.f15021OooO0Oo) {
                        OooO oooO = advertisingIdClient.f15023OooO0o0;
                        if (oooO == null || !oooO.f36886Oooo) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.OooO00o(false);
                        if (!advertisingIdClient.f15020OooO0OO) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        Preconditions.checkNotNull(advertisingIdClient.f15018OooO00o);
                        Preconditions.checkNotNull(advertisingIdClient.f15019OooO0O0);
                        try {
                            zZzd = advertisingIdClient.f15019OooO0O0.zzd();
                        } catch (RemoteException e) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                throw th;
            }
            advertisingIdClient.OooO0Oo();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    @VisibleForTesting
    public final void OooO00o(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f15020OooO0OO) {
                zza();
            }
            Context context = this.f15022OooO0o;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f15018OooO00o = blockingServiceConnection;
                    try {
                        this.f15019OooO0O0 = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                        this.f15020OooO0OO = true;
                        if (z) {
                            OooO0Oo();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } catch (Throwable th2) {
                    throw new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    @VisibleForTesting
    public final boolean OooO0O0(@Nullable Info info, long j, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put(ViewHierarchyConstants.TAG_KEY, "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new OooO00o(map).start();
        return true;
    }

    public final Info OooO0OO() throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f15020OooO0OO) {
                Preconditions.checkNotNull(this.f15018OooO00o);
                Preconditions.checkNotNull(this.f15019OooO0O0);
                info = new Info(this.f15019OooO0O0.zzc(), this.f15019OooO0O0.zze(true));
            } else {
                synchronized (this.f15021OooO0Oo) {
                    OooO oooO = this.f15023OooO0o0;
                    if (oooO == null || !oooO.f36886Oooo) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    OooO00o(false);
                    if (!this.f15020OooO0OO) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    Preconditions.checkNotNull(this.f15018OooO00o);
                    Preconditions.checkNotNull(this.f15019OooO0O0);
                    try {
                        info = new Info(this.f15019OooO0O0.zzc(), this.f15019OooO0O0.zze(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        OooO0Oo();
        return info;
    }

    public final void OooO0Oo() {
        synchronized (this.f15021OooO0Oo) {
            OooO oooO = this.f15023OooO0o0;
            if (oooO != null) {
                oooO.f36889Oooo0oo.countDown();
                try {
                    this.f15023OooO0o0.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f15024OooO0oO;
            if (j > 0) {
                this.f15023OooO0o0 = new OooO(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return OooO0OO();
    }

    @KeepForSdk
    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        OooO00o(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f15022OooO0o == null || this.f15018OooO00o == null) {
                return;
            }
            try {
                if (this.f15020OooO0OO) {
                    ConnectionTracker.getInstance().unbindService(this.f15022OooO0o, this.f15018OooO00o);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f15020OooO0OO = false;
            this.f15019OooO0O0 = null;
            this.f15018OooO00o = null;
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f15021OooO0Oo = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f15022OooO0o = context;
        this.f15020OooO0OO = false;
        this.f15024OooO0oO = j;
    }
}
