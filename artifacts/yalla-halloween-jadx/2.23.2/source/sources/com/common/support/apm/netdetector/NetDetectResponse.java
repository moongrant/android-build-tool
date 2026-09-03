package com.common.support.apm.netdetector;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/common/support/apm/netdetector/NetDetectResponse;", "", "isSysConfigChange", "", "(Z)V", "()Z", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetDetectResponse {
    private final boolean isSysConfigChange;

    public NetDetectResponse(boolean z) {
        this.isSysConfigChange = z;
    }

    /* JADX INFO: renamed from: isSysConfigChange, reason: from getter */
    public final boolean getIsSysConfigChange() {
        return this.isSysConfigChange;
    }
}
