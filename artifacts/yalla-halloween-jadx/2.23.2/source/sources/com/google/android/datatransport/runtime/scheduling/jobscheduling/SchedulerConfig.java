package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    @AutoValue
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$OooO00o$OooO00o, reason: collision with other inner class name */
        @AutoValue.Builder
        public static abstract class AbstractC0214OooO00o {
        }

        public abstract long OooO00o();

        public abstract Set<Flag> OooO0O0();

        public abstract long OooO0OO();
    }

    public abstract o000O0Oo OooO00o();

    public final long OooO0O0(Priority priority, long j, int i) {
        long time = j - OooO00o().getTime();
        OooO00o oooO00o = OooO0OO().get(priority);
        long jOooO00o = oooO00o.OooO00o();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jOooO00o * Math.max(1.0d, Math.log(10000.0d) / Math.log((jOooO00o > 1 ? jOooO00o : 2L) * ((long) i2)))), time), oooO00o.OooO0OO());
    }

    public abstract Map<Priority, OooO00o> OooO0OO();
}
