package com.common.support.apm.configuration.specific;

import com.common.support.apm.configuration.ConfigurationManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/common/support/apm/configuration/specific/BlockConfig;", "", "()V", "isSampleBlock", "", "lagThresholdNum", "", "lagThresholdTimeConsumeMs", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BlockConfig {

    @NotNull
    public static final BlockConfig INSTANCE = new BlockConfig();

    private BlockConfig() {
    }

    public final boolean isSampleBlock() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getLagAnalysisTag() == 1;
    }

    public final int lagThresholdNum() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getLagThresholdNum();
    }

    public final long lagThresholdTimeConsumeMs() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getLagThresholdTimeConsumeMs();
    }
}
