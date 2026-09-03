package com.common.support.apm.sailfishhttp;

import com.qiniu.android.collect.ReportItem;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HostProvider;", "", "hosts", "", "", "([Ljava/lang/String;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "kotlin.jvm.PlatformType", "latestValidHost", "()[Ljava/lang/String;", "setHosts", "", "updateValidHost", ReportItem.RequestKeyHost, "validHost", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HostProvider {

    @NotNull
    private final CopyOnWriteArrayList<String> hosts;

    @NotNull
    private String latestValidHost;

    public HostProvider(@NotNull String... hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        if (hosts.length == 0) {
            throw new IllegalArgumentException("Hosts can not be empty");
        }
        this.hosts = new CopyOnWriteArrayList<>(hosts);
        this.latestValidHost = hosts[0];
    }

    @NotNull
    public final String[] hosts() {
        Object[] array = this.hosts.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final void setHosts(@NotNull String... hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        if (hosts.length == 0) {
            return;
        }
        this.hosts.clear();
        CollectionsKt__MutableCollectionsKt.addAll(this.hosts, hosts);
        this.latestValidHost = hosts[0];
    }

    public final void updateValidHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.latestValidHost = host;
    }

    @NotNull
    /* JADX INFO: renamed from: validHost, reason: from getter */
    public final String getLatestValidHost() {
        return this.latestValidHost;
    }
}
