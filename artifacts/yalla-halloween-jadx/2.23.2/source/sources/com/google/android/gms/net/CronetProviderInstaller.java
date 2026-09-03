package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import javax.annotation.concurrent.GuardedBy;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes3.dex */
public class CronetProviderInstaller {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f15643OooO00o = GoogleApiAvailabilityLight.getInstance();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f15644OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public static DynamiteModule f15645OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("lock")
    public static String f15646OooO0Oo = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NonNull
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";

    @NonNull
    public static Task<Void> installProvider(@NonNull final Context context) {
        Preconditions.checkNotNull(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (isInstalled()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    CronetProviderInstaller.zzc(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static boolean isInstalled() {
        DynamiteModule dynamiteModule;
        synchronized (f15644OooO0O0) {
            dynamiteModule = f15645OooO0OO;
        }
        return dynamiteModule != null;
    }

    @ShowFirstParty
    @Deprecated
    public static void zzc(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        synchronized (f15644OooO0O0) {
            try {
                if (isInstalled()) {
                    return;
                }
                Preconditions.checkNotNull(context, "Context must not be null");
                try {
                    ((ClassLoader) Preconditions.checkNotNull(CronetProviderInstaller.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = f15643OooO00o;
                    googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleLoad.getModuleContext().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                                throw new GooglePlayServicesNotAvailableException(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                            int iIntValue = ((Integer) Preconditions.checkNotNull((Integer) method.invoke(null, new Object[0]))).intValue();
                            f15646OooO0Oo = (String) Preconditions.checkNotNull((String) method2.invoke(null, new Object[0]));
                            if (apiLevel <= iIntValue) {
                                f15645OooO0OO = dynamiteModuleLoad;
                                return;
                            }
                            Intent errorResolutionIntent = googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr");
                            if (errorResolutionIntent == null) {
                                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                                throw new GooglePlayServicesNotAvailableException(2);
                            }
                            String str = f15646OooO0Oo;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(iIntValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str);
                            throw new GooglePlayServicesRepairableException(2, sb.toString(), errorResolutionIntent);
                        } catch (Exception e) {
                            Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", e);
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e));
                        }
                    } catch (DynamiteModule.LoadingException e2) {
                        Log.e("CronetProviderInstaller", "Unable to load Cronet module", e2);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e2));
                    }
                } catch (ClassNotFoundException e3) {
                    Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
