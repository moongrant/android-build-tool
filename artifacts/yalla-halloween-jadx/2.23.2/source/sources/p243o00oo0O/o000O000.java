package p243o00oo0O;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO00o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO0O0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p240o00oo0.o000000;
import p249o00oo0oO.o000O0O0;
import p249o00oo0oO.o000O0Oo;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 implements o000000<SchedulerConfig> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<o000O0Oo> f40087OooO00o = o000O0O0.OooO00o.f40219OooO00o;

    @Override // p629o0ooO00O.o00000O0
    public final Object get() {
        o000O0Oo o000o0oo2 = this.f40087OooO00o.get();
        HashMap map = new HashMap();
        Priority priority = Priority.DEFAULT;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o.f13933OooO0OO = setEmptySet;
        oooO00o.f13931OooO00o = 30000L;
        oooO00o.f13932OooO0O0 = 86400000L;
        map.put(priority, oooO00o.OooO00o());
        Priority priority2 = Priority.HIGHEST;
        OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o2.f13933OooO0OO = setEmptySet2;
        oooO00o2.f13931OooO00o = 1000L;
        oooO00o2.f13932OooO0O0 = 86400000L;
        map.put(priority2, oooO00o2.OooO00o());
        Priority priority3 = Priority.VERY_LOW;
        OooO0O0.OooO00o oooO00o3 = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o3.f13933OooO0OO = setEmptySet3;
        oooO00o3.f13931OooO00o = 86400000L;
        oooO00o3.f13932OooO0O0 = 86400000L;
        Set<SchedulerConfig.Flag> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o3.f13933OooO0OO = setUnmodifiableSet;
        map.put(priority3, oooO00o3.OooO00o());
        if (o000o0oo2 == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (map.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new OooO00o(o000o0oo2, map);
    }
}
