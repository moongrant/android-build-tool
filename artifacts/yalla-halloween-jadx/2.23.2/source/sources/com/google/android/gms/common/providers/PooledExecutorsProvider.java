package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Deprecated
public class PooledExecutorsProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f14705OooO00o;

    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        if (f14705OooO00o == null) {
            f14705OooO00o = new OooO00o();
        }
        return f14705OooO00o;
    }
}
