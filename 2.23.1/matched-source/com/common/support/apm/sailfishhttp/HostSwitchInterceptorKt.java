package com.common.support.apm.sailfishhttp;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p640o0ooO0oo.o0OOOO0o;
import p640o0ooO0oo.o0oo0000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0000¨\u0006\b"}, d2 = {"Lo0ooO0oo/o0oo0000;", "", "", "hosts", "", "updateHosts", "(Lo0ooO0oo/o0oo0000;[Ljava/lang/String;)V", "currentHost", "sailfish_release"}, k = 2, mv = {1, 7, 1})
public final class HostSwitchInterceptorKt {
    @Nullable
    public static final String currentHost(@NotNull o0oo0000 o0oo0000Var) {
        Object next;
        Intrinsics.checkNotNullParameter(o0oo0000Var, "<this>");
        Iterator<T> it = o0oo0000Var.f57388OooO0o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o0OOOO0o) next) instanceof HostSwitchInterceptor));
        o0OOOO0o o0oooo0o = (o0OOOO0o) next;
        if (o0oooo0o != null) {
            return ((HostSwitchInterceptor) o0oooo0o).getHostProvider().getLatestValidHost();
        }
        return null;
    }

    public static final void updateHosts(@NotNull o0oo0000 o0oo0000Var, @NotNull String... hosts) {
        Object next;
        Intrinsics.checkNotNullParameter(o0oo0000Var, "<this>");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Iterator<T> it = o0oo0000Var.f57388OooO0o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o0OOOO0o) next) instanceof HostSwitchInterceptor));
        o0OOOO0o o0oooo0o = (o0OOOO0o) next;
        if (o0oooo0o != null) {
            ((HostSwitchInterceptor) o0oooo0o).getHostProvider().setHosts((String[]) Arrays.copyOf(hosts, hosts.length));
        }
    }
}
