package com.common.support.apm.netdiag;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/common/support/apm/netdiag/NetService;", "", "downloadSpeed", "", "publicIpAddress", "", "uploadSpeed", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface NetService {
    float downloadSpeed();

    @Nullable
    String publicIpAddress();

    float uploadSpeed();
}
