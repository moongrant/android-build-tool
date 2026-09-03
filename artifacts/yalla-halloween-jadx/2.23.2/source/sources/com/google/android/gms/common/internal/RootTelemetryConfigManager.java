package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class RootTelemetryConfigManager {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static RootTelemetryConfigManager f14631OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final RootTelemetryConfiguration f14632OooO0OO = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public RootTelemetryConfiguration f14633OooO00o;

    @NonNull
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        if (f14631OooO0O0 == null) {
            f14631OooO0O0 = new RootTelemetryConfigManager();
        }
        return f14631OooO0O0;
    }

    @Nullable
    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.f14633OooO00o;
    }

    @VisibleForTesting
    public final synchronized void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.f14633OooO00o = f14632OooO0OO;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f14633OooO00o;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.f14633OooO00o = rootTelemetryConfiguration;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
