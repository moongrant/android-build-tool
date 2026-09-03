package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p289o0O0OOoO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
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
        public static abstract class AbstractC0094OooO00o {
            public abstract OooO00o OooO00o();

            public abstract AbstractC0094OooO00o OooO0O0(long j);

            public abstract AbstractC0094OooO00o OooO0OO();
        }

        public static AbstractC0094OooO00o OooO00o() {
            OooO0O0.C0093OooO0O0 c0093OooO0O0 = new OooO0O0.C0093OooO0O0();
            Set<Flag> setEmptySet = Collections.emptySet();
            Objects.requireNonNull(setEmptySet, "Null flags");
            c0093OooO0O0.f13094OooO0OO = setEmptySet;
            return c0093OooO0O0;
        }

        public abstract long OooO0O0();

        public abstract Set<Flag> OooO0OO();

        public abstract long OooO0Oo();
    }

    public abstract o0000Ooo OooO00o();

    public final long OooO0O0(Priority priority, long j, int i) {
        long time = j - OooO00o().getTime();
        OooO00o oooO00o = OooO0OO().get(priority);
        long jOooO0O0 = oooO00o.OooO0O0();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jOooO0O0 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jOooO0O0 > 1 ? jOooO0O0 : 2L) * ((long) i2)))), time), oooO00o.OooO0Oo());
    }

    public abstract Map<Priority, OooO00o> OooO0OO();
}
