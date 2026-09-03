package com.common.support.apm.configuration.specific;

import com.common.support.apm.configuration.ConfigurationManager;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/common/support/apm/configuration/specific/SysVersionConfig;", "", "()V", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SysVersionConfig {

    @NotNull
    public static final SysVersionConfig INSTANCE = new SysVersionConfig();

    private SysVersionConfig() {
    }

    public final int version() {
        return ConfigurationManager.INSTANCE.getLogConfigData().getVersion();
    }
}
