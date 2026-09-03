package com.common.support.apm.configuration.specific;

import com.common.support.apm.configuration.ConfigurationManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/common/support/apm/configuration/specific/ApmConfig;", "", "()V", "apmLogCollectionRate", "", "apmLogReportFrequency", "", "apmLogSize", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApmConfig {

    @NotNull
    public static final ApmConfig INSTANCE = new ApmConfig();

    private ApmConfig() {
    }

    public final int apmLogCollectionRate() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getApmLogCollectionRate();
    }

    public final long apmLogReportFrequency() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getApmLogReportFrequencySec();
    }

    public final long apmLogSize() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getApmLogReportFileSizeK();
    }
}
