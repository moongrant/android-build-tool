package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class at<T> {
    public final Context AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.at.3
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (at.this.AFInAppEventType()) {
                return (T) at.this.values();
            }
            return null;
        }
    });
    private final String[] values;

    public at(Context context, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFInAppEventType = str;
        this.values = strArr;
    }

    @Nullable
    public T AFInAppEventParameterName() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return null;
        }
    }

    public final boolean AFInAppEventType() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.values).contains(aa.valueOf(this.AFInAppEventParameterName.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return false;
        }
    }

    public abstract T values();
}
