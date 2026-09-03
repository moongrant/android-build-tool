package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ProviderInstaller {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f15649OooO00o = GoogleApiAvailabilityLight.getInstance();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f15650OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("ProviderInstaller.lock")
    public static Method f15651OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("ProviderInstaller.lock")
    public static Method f15652OooO0Oo = null;

    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, @Nullable Intent intent);

        void onProviderInstalled();
    }

    @GuardedBy("ProviderInstaller.lock")
    public static void OooO00o(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f15651OooO0OO == null) {
                f15651OooO0OO = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f15651OooO0OO.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }

    public static void installIfNeeded(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context moduleContext;
        Preconditions.checkNotNull(context, "Context must not be null");
        f15649OooO00o.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (f15650OooO0O0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                moduleContext = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (DynamiteModule.LoadingException e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                moduleContext = null;
            }
            if (moduleContext != null) {
                OooO00o(moduleContext, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (f15652OooO0Oo == null) {
                        Class<?> cls = Long.TYPE;
                        f15652OooO0Oo = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f15652OooO0Oo.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e2) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (remoteContext != null) {
                OooO00o(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void installIfNeededAsync(@NonNull Context context, @NonNull ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new OooO00o(context, providerInstallListener).execute(new Void[0]);
    }
}
