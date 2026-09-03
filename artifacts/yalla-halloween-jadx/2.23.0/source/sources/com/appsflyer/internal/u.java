package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class u {
    public final ExecutorService AFInAppEventParameterName;
    public final bj valueOf;

    public interface e {
        void AFInAppEventParameterName(String str, Exception exc);

        void values(@NonNull String str, @NonNull String str2);
    }

    public u() {
    }

    public u(bj bjVar, ExecutorService executorService) {
        this.valueOf = bjVar;
        this.AFInAppEventParameterName = executorService;
    }
}
