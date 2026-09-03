package o0O0OOO0;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p289o0O0OOoO.o0000O00;
import p289o0O0OOoO.o0000Ooo;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<o0000Ooo> f35628OooO00o = o0000O00.OooO00o.f35703OooO00o;

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        o0000Ooo o0000ooo = this.f35628OooO00o.get();
        HashMap map = new HashMap();
        Priority priority = Priority.DEFAULT;
        SchedulerConfig.OooO00o.AbstractC0094OooO00o abstractC0094OooO00oOooO00o = SchedulerConfig.OooO00o.OooO00o();
        abstractC0094OooO00oOooO00o.OooO0O0(30000L);
        abstractC0094OooO00oOooO00o.OooO0OO();
        map.put(priority, abstractC0094OooO00oOooO00o.OooO00o());
        Priority priority2 = Priority.HIGHEST;
        SchedulerConfig.OooO00o.AbstractC0094OooO00o abstractC0094OooO00oOooO00o2 = SchedulerConfig.OooO00o.OooO00o();
        abstractC0094OooO00oOooO00o2.OooO0O0(1000L);
        abstractC0094OooO00oOooO00o2.OooO0OO();
        map.put(priority2, abstractC0094OooO00oOooO00o2.OooO00o());
        Priority priority3 = Priority.VERY_LOW;
        SchedulerConfig.OooO00o.AbstractC0094OooO00o abstractC0094OooO00oOooO00o3 = SchedulerConfig.OooO00o.OooO00o();
        abstractC0094OooO00oOooO00o3.OooO0O0(86400000L);
        abstractC0094OooO00oOooO00o3.OooO0OO();
        Set<SchedulerConfig.Flag> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE)));
        com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO0O0.C0093OooO0O0 c0093OooO0O0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO0O0.C0093OooO0O0) abstractC0094OooO00oOooO00o3;
        Objects.requireNonNull(setUnmodifiableSet, "Null flags");
        c0093OooO0O0.f13094OooO0OO = setUnmodifiableSet;
        map.put(priority3, c0093OooO0O0.OooO00o());
        Objects.requireNonNull(o0000ooo, "missing required property: clock");
        if (map.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO00o(o0000ooo, map);
    }
}
