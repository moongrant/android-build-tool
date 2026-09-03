package com.common.support.apm.configuration.specific;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/common/support/apm/configuration/specific/HostConfig;", "", "()V", "isHostSwitchOn", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HostConfig {

    @NotNull
    public static final HostConfig INSTANCE = new HostConfig();

    private HostConfig() {
    }

    public final boolean isHostSwitchOn() {
        return true;
    }
}
