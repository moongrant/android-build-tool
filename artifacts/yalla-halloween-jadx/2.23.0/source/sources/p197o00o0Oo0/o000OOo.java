package p197o00o0Oo0;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO00o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.OooO0O0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p192o00o0OO.o0000OO0;
import p201o00o0o00.OooOOO0;
import p201o00o0o00.OooOOOO;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo implements o0000OO0<SchedulerConfig> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000<OooOOO0> f39047OooO00o = OooOOOO.OooO00o.f39144OooO00o;

    @Override // p625o0ooO000.o000
    public final Object get() {
        OooOOO0 oooOOO0 = this.f39047OooO00o.get();
        HashMap map = new HashMap();
        Priority priority = Priority.DEFAULT;
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o.f10885OooO0OO = setEmptySet;
        oooO00o.f10883OooO00o = 30000L;
        oooO00o.f10884OooO0O0 = 86400000L;
        map.put(priority, oooO00o.OooO00o());
        Priority priority2 = Priority.HIGHEST;
        OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o2.f10885OooO0OO = setEmptySet2;
        oooO00o2.f10883OooO00o = 1000L;
        oooO00o2.f10884OooO0O0 = 86400000L;
        map.put(priority2, oooO00o2.OooO00o());
        Priority priority3 = Priority.VERY_LOW;
        OooO0O0.OooO00o oooO00o3 = new OooO0O0.OooO00o();
        Set<SchedulerConfig.Flag> setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o3.f10885OooO0OO = setEmptySet3;
        oooO00o3.f10883OooO00o = 86400000L;
        oooO00o3.f10884OooO0O0 = 86400000L;
        Set<SchedulerConfig.Flag> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        oooO00o3.f10885OooO0OO = setUnmodifiableSet;
        map.put(priority3, oooO00o3.OooO00o());
        if (oooOOO0 == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (map.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new OooO00o(oooOOO0, map);
    }
}
