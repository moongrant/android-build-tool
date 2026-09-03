package com.common.support.apm.configuration.specific;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.Env;
import com.common.support.apm.configuration.ConfigurationManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0007"}, d2 = {"Lcom/common/support/apm/configuration/specific/DomainConfig;", "", "()V", "getDefaultDomains", "", "", "getDomains", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DomainConfig {

    @NotNull
    public static final DomainConfig INSTANCE = new DomainConfig();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Env.values().length];
            iArr[Env.dev.ordinal()] = 1;
            iArr[Env.fat.ordinal()] = 2;
            iArr[Env.pro.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DomainConfig() {
    }

    @NotNull
    public final List<String> getDefaultDomains() {
        int i = WhenMappings.$EnumSwitchMapping$0[Sailfish.INSTANCE.getConfig$sailfish_release().getEnv().ordinal()];
        if (i == 1) {
            return CollectionsKt.listOf("https://dev-sailfish.yallalive.cn");
        }
        if (i == 2) {
            return CollectionsKt.listOf("https://fat-sailfish.yallalive.cn");
        }
        if (i == 3) {
            return CollectionsKt.listOf("https://sailfish.yalla.live");
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final List<String> getDomains() {
        ConfigurationManager configurationManager = ConfigurationManager.INSTANCE;
        List<String> domainConfigData = configurationManager.getDomainConfigData();
        return domainConfigData == null || domainConfigData.isEmpty() ? getDefaultDomains() : configurationManager.getDomainConfigData();
    }
}
