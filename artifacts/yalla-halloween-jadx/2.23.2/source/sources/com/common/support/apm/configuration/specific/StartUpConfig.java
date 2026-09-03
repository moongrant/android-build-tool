package com.common.support.apm.configuration.specific;

import com.common.support.apm.configuration.ConfigurationManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/common/support/apm/configuration/specific/StartUpConfig;", "", "()V", "isStartUpAnalysisEnable", "", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StartUpConfig {

    @NotNull
    public static final StartUpConfig INSTANCE = new StartUpConfig();

    private StartUpConfig() {
    }

    public final boolean isStartUpAnalysisEnable() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getStartOverAnalysisTag() == 1;
    }
}
