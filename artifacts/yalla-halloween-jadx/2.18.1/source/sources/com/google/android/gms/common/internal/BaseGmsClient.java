package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Looper f15513OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f15514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f15515OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f15516OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f15519OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public zzu f15520OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Context f15521OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final GmsClientSupervisor f15522OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f15523OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O f15524OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mServiceBrokerLock")
    public IGmsServiceBroker f15527OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public ConnectionProgressReportCallbacks f15528OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public IInterface f15530OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public zze f15531OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final String f15532OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public final BaseConnectionCallbacks f15533OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public final BaseOnConnectionFailedListener f15535OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f15536OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public volatile String f15538OooOoO0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Feature[] f15512OooOooO = new Feature[0];

    @NonNull
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public volatile String f15518OooO0o = null;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Object f15526OooOOO0 = new Object();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Object f15525OooOOO = new Object();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList f15529OooOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f15534OooOo00 = 1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15537OooOoO = null;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f15539OooOoOO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public volatile zzj f15541OooOoo0 = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public AtomicInteger f15540OooOoo = new AtomicInteger(0);

    @KeepForSdk
    public interface BaseConnectionCallbacks {

        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(@Nullable Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(@NonNull ConnectionResult connectionResult);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(@NonNull ConnectionResult connectionResult);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.OooO0OO());
            } else {
                BaseOnConnectionFailedListener baseOnConnectionFailedListener = BaseGmsClient.this.f15535OooOo0O;
                if (baseOnConnectionFailedListener != null) {
                    baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
                }
            }
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    @VisibleForTesting
    @KeepForSdk
    public BaseGmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, @Nullable BaseConnectionCallbacks baseConnectionCallbacks, @Nullable BaseOnConnectionFailedListener baseOnConnectionFailedListener, @Nullable String str) {
        Preconditions.checkNotNull(context, "Context must not be null");
        this.f15521OooO0oo = context;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.f15513OooO = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.f15522OooOO0 = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.f15523OooOO0O = googleApiAvailabilityLight;
        this.f15524OooOO0o = new OooOO0O(this, looper);
        this.f15536OooOo0o = i;
        this.f15533OooOo0 = baseConnectionCallbacks;
        this.f15535OooOo0O = baseOnConnectionFailedListener;
        this.f15532OooOo = str;
    }

    public static /* bridge */ /* synthetic */ boolean OooO(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.f15526OooOOO0) {
            if (baseGmsClient.f15534OooOo00 != i) {
                return false;
            }
            baseGmsClient.OooOO0O(i2, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ void OooO0oo(BaseGmsClient baseGmsClient) {
        int i;
        int i2;
        synchronized (baseGmsClient.f15526OooOOO0) {
            i = baseGmsClient.f15534OooOo00;
        }
        if (i == 3) {
            baseGmsClient.f15539OooOoOO = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        OooOO0O oooOO0O = baseGmsClient.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(i2, baseGmsClient.f15540OooOoo.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean OooOO0(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.f15539OooOoOO || TextUtils.isEmpty(baseGmsClient.OooO0Oo()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.OooO0Oo());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Nullable
    @KeepForSdk
    public void OooO00o() {
    }

    @NonNull
    @KeepForSdk
    public Bundle OooO0O0() {
        return new Bundle();
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> OooO0OO() {
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    public abstract String OooO0Oo();

    @KeepForSdk
    @CallSuper
    public final void OooO0o(@NonNull ConnectionResult connectionResult) {
        this.f15517OooO0Oo = connectionResult.getErrorCode();
        this.f15519OooO0o0 = System.currentTimeMillis();
    }

    @KeepForSdk
    public boolean OooO0o0() {
        return getMinApkVersion() >= 211700000;
    }

    @NonNull
    public final String OooO0oO() {
        String str = this.f15532OooOo;
        return str == null ? this.f15521OooO0oo.getClass().getName() : str;
    }

    public final void OooOO0O(int i, @Nullable IInterface iInterface) {
        zzu zzuVar;
        Preconditions.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.f15526OooOOO0) {
            this.f15534OooOo00 = i;
            this.f15530OooOOo0 = iInterface;
            if (i == 1) {
                zze zzeVar = this.f15531OooOOoo;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.f15522OooOO0;
                    String str = this.f15520OooO0oO.f15681OooO00o;
                    Preconditions.checkNotNull(str);
                    zzu zzuVar2 = this.f15520OooO0oO;
                    gmsClientSupervisor.zzb(str, zzuVar2.f15682OooO0O0, zzuVar2.f15683OooO0OO, zzeVar, OooO0oO(), this.f15520OooO0oO.f15684OooO0Oo);
                    this.f15531OooOOoo = null;
                }
            } else if (i == 2 || i == 3) {
                zze zzeVar2 = this.f15531OooOOoo;
                if (zzeVar2 != null && (zzuVar = this.f15520OooO0oO) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzuVar.f15681OooO00o + " on " + zzuVar.f15682OooO0O0);
                    GmsClientSupervisor gmsClientSupervisor2 = this.f15522OooOO0;
                    String str2 = this.f15520OooO0oO.f15681OooO00o;
                    Preconditions.checkNotNull(str2);
                    zzu zzuVar3 = this.f15520OooO0oO;
                    gmsClientSupervisor2.zzb(str2, zzuVar3.f15682OooO0O0, zzuVar3.f15683OooO0OO, zzeVar2, OooO0oO(), this.f15520OooO0oO.f15684OooO0Oo);
                    this.f15540OooOoo.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.f15540OooOoo.get());
                this.f15531OooOOoo = zzeVar3;
                zzu zzuVar4 = new zzu("com.google.android.gms", getStartServiceAction(), false, GmsClientSupervisor.getDefaultBindFlags(), OooO0o0());
                this.f15520OooO0oO = zzuVar4;
                if (zzuVar4.f15684OooO0Oo && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f15520OooO0oO.f15681OooO00o)));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.f15522OooOO0;
                String str3 = this.f15520OooO0oO.f15681OooO00o;
                Preconditions.checkNotNull(str3);
                zzu zzuVar5 = this.f15520OooO0oO;
                String str4 = zzuVar5.f15682OooO0O0;
                int i2 = zzuVar5.f15683OooO0OO;
                String strOooO0oO = OooO0oO();
                boolean z = this.f15520OooO0oO.f15684OooO0Oo;
                OooO00o();
                if (!gmsClientSupervisor3.OooO0O0(new zzn(str3, str4, i2, z), zzeVar3, strOooO0oO, null)) {
                    zzu zzuVar6 = this.f15520OooO0oO;
                    Log.w("GmsClient", "unable to connect to service: " + zzuVar6.f15681OooO00o + " on " + zzuVar6.f15682OooO0O0);
                    int i3 = this.f15540OooOoo.get();
                    OooOO0O oooOO0O = this.f15524OooOO0o;
                    oooOO0O.sendMessage(oooOO0O.obtainMessage(7, i3, -1, new zzg(this, 16, null)));
                }
            } else if (i == 4) {
                Preconditions.checkNotNull(iInterface);
                this.f15516OooO0OO = System.currentTimeMillis();
            }
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.f15523OooOO0O.isGooglePlayServicesAvailable(this.f15521OooO0oo, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter());
            return;
        }
        OooOO0O(1, null);
        LegacyClientCallbackAdapter legacyClientCallbackAdapter = new LegacyClientCallbackAdapter();
        Preconditions.checkNotNull(legacyClientCallbackAdapter, "Connection progress callbacks cannot be null.");
        this.f15528OooOOOo = legacyClientCallbackAdapter;
        OooOO0O oooOO0O = this.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(3, this.f15540OooOoo.get(), iIsGooglePlayServicesAvailable, null));
    }

    @KeepForSdk
    public void connect(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f15528OooOOOo = connectionProgressReportCallbacks;
        OooOO0O(2, null);
    }

    @Nullable
    @KeepForSdk
    public abstract T createServiceInterface(@NonNull IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.f15540OooOoo.incrementAndGet();
        synchronized (this.f15529OooOOo) {
            int size = this.f15529OooOOo.size();
            for (int i = 0; i < size; i++) {
                ((zzc) this.f15529OooOOo.get(i)).zzf();
            }
            this.f15529OooOOo.clear();
        }
        synchronized (this.f15525OooOOO) {
            this.f15527OooOOOO = null;
        }
        OooOO0O(1, null);
    }

    @KeepForSdk
    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.f15526OooOOO0) {
            i = this.f15534OooOo00;
            iInterface = this.f15530OooOOo0;
        }
        synchronized (this.f15525OooOOO) {
            iGmsServiceBroker = this.f15527OooOOOO;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) OooO0Oo()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f15516OooO0OO > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f15516OooO0OO;
            printWriterAppend.println(j + ZegoConstants.ZegoVideoDataAuxPublishingStream + simpleDateFormat.format(new Date(j)));
        }
        if (this.f15515OooO0O0 > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f15514OooO00o;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f15515OooO0O0;
            printWriterAppend2.println(j2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + simpleDateFormat.format(new Date(j2)));
        }
        if (this.f15519OooO0o0 > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.getStatusCodeString(this.f15517OooO0Oo));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f15519OooO0o0;
            printWriterAppend3.println(j3 + ZegoConstants.ZegoVideoDataAuxPublishingStream + simpleDateFormat.format(new Date(j3)));
        }
    }

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getApiFeatures() {
        return f15512OooOooO;
    }

    @Nullable
    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.f15541OooOoo0;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f15673Oooo0oO;
    }

    @Nullable
    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final Context getContext() {
        return this.f15521OooO0oo;
    }

    @NonNull
    @KeepForSdk
    public String getEndpointPackageName() {
        zzu zzuVar;
        if (!isConnected() || (zzuVar = this.f15520OooO0oO) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return zzuVar.f15682OooO0O0;
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.f15536OooOo0o;
    }

    @Nullable
    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.f15518OooO0o;
    }

    @NonNull
    @KeepForSdk
    public final Looper getLooper() {
        return this.f15513OooO;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @KeepForSdk
    @WorkerThread
    public void getRemoteService(@Nullable IAccountAccessor iAccountAccessor, @NonNull Set<Scope> set) {
        Bundle bundleOooO0O0 = OooO0O0();
        int i = this.f15536OooOo0o;
        String str = this.f15538OooOoO0;
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.f15565OoooOoo;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f15566Ooooo00;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f15567Oooo = this.f15521OooO0oo.getPackageName();
        getServiceRequest.f15574OoooO0O = bundleOooO0O0;
        if (set != null) {
            getServiceRequest.f15572OoooO0 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", AccountType.GOOGLE);
            }
            getServiceRequest.f15571OoooO = account;
            if (iAccountAccessor != null) {
                getServiceRequest.f15573OoooO00 = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f15571OoooO = getAccount();
        }
        getServiceRequest.f15575OoooOO0 = f15512OooOooO;
        getServiceRequest.f15580o000oOoO = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f15578OoooOo0 = true;
        }
        try {
            synchronized (this.f15525OooOOO) {
                IGmsServiceBroker iGmsServiceBroker = this.f15527OooOOOO;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new zzd(this, this.f15540OooOoo.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.f15540OooOoo.get();
            OooOO0O oooOO0O = this.f15524OooOO0o;
            oooOO0O.sendMessage(oooOO0O.obtainMessage(1, i3, -1, new zzf(this, 8, null, null)));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.f15540OooOoo.get();
            OooOO0O oooOO0O2 = this.f15524OooOO0o;
            oooOO0O2.sendMessage(oooOO0O2.obtainMessage(1, i4, -1, new zzf(this, 8, null, null)));
        }
    }

    @NonNull
    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.f15526OooOOO0) {
            try {
                if (this.f15534OooOo00 == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t = (T) this.f15530OooOOo0;
                Preconditions.checkNotNull(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @Nullable
    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.f15525OooOOO) {
            IGmsServiceBroker iGmsServiceBroker = this.f15527OooOOOO;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    @NonNull
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull
    @KeepForSdk
    public abstract String getStartServiceAction();

    @Nullable
    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.f15541OooOoo0;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f15671Oooo;
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.f15541OooOoo0 != null;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.f15526OooOOO0) {
            z = this.f15534OooOo00 == 4;
        }
        return z;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z;
        synchronized (this.f15526OooOOO0) {
            int i = this.f15534OooOo00;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public void onUserSignOut(@NonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionTag(@NonNull String str) {
        this.f15538OooOoO0 = str;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i) {
        OooOO0O oooOO0O = this.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(6, this.f15540OooOoo.get(), i));
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    @KeepForSdk
    public void disconnect(@NonNull String str) {
        this.f15518OooO0o = str;
        disconnect();
    }
}
