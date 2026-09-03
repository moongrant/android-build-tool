package com.common.support.atd.network;

import com.common.support.atd.Detector;
import com.common.support.atd.base.Env;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/common/support/atd/network/Domain;", "", "()V", "defaultDomains", "", "Lcom/common/support/atd/base/Env;", "", "getDomain", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Domain {

    @NotNull
    public static final Domain INSTANCE = new Domain();

    @NotNull
    private static final Map<Env, String> defaultDomains = MapsKt.mapOf(new Pair(Env.FAT, "https://fat-sailfish.yallalive.cn"), new Pair(Env.PRO, "https://sailfish.yalla.live"));

    private Domain() {
    }

    @NotNull
    public final String getDomain() {
        String str = defaultDomains.get(Detector.INSTANCE.getEnv());
        return str == null ? "" : str;
    }
}
