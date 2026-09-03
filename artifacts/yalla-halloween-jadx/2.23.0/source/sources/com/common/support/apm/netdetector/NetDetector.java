package com.common.support.apm.netdetector;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/common/support/apm/netdetector/NetDetector;", "", "checkGap", "", "isWorking", "", "report", "", "start", "stop", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface NetDetector {
    long checkGap();

    boolean isWorking();

    void report();

    void start();

    void stop();
}
