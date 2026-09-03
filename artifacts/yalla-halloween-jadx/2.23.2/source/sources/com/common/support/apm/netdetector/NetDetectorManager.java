package com.common.support.apm.netdetector;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/common/support/apm/netdetector/NetDetectorManager;", "", "", "startDetect", "stopDetect", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "Lo0ooOO0o/o0OoO00O;", "Lcom/common/support/apm/netdetector/NetDetector;", "netDetector", "Lcom/common/support/apm/netdetector/NetDetector;", "<init>", "(Lo0ooOO0o/o0OoO00O;)V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class NetDetectorManager {

    @NotNull
    private NetDetector netDetector;

    @NotNull
    private final o0OoO00O okHttpClient;

    public NetDetectorManager(@NotNull o0OoO00O okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.netDetector = new DefaultNetDetector(okHttpClient);
    }

    public final void startDetect() {
        if (this.netDetector.isWorking()) {
            return;
        }
        this.netDetector.start();
    }

    public final void stopDetect() {
        if (this.netDetector.isWorking()) {
            this.netDetector.stop();
        }
    }
}
