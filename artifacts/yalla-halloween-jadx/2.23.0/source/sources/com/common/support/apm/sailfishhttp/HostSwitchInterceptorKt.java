package com.common.support.apm.sailfishhttp;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0000¨\u0006\b"}, d2 = {"Lo0ooO0oO/o00OOOO0;", "", "", "hosts", "", "updateHosts", "(Lo0ooO0oO/o00OOOO0;[Ljava/lang/String;)V", "currentHost", "sailfish_release"}, k = 2, mv = {1, 5, 1})
public final class HostSwitchInterceptorKt {
    @Nullable
    public static final String currentHost(@NotNull o00OOOO0 o00oooo1) {
        Object next;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Iterator<T> it = o00oooo1.f57257OooO0o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o00OOO00) next) instanceof HostSwitchInterceptor));
        o00OOO00 o00ooo01 = (o00OOO00) next;
        if (o00ooo01 == null) {
            return null;
        }
        return ((HostSwitchInterceptor) o00ooo01).getHostProvider().getLatestValidHost();
    }

    public static final void updateHosts(@NotNull o00OOOO0 o00oooo1, @NotNull String... hosts) {
        Object next;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Iterator<T> it = o00oooo1.f57257OooO0o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o00OOO00) next) instanceof HostSwitchInterceptor));
        o00OOO00 o00ooo01 = (o00OOO00) next;
        if (o00ooo01 == null) {
            return;
        }
        ((HostSwitchInterceptor) o00ooo01).getHostProvider().setHosts((String[]) Arrays.copyOf(hosts, hosts.length));
    }
}
