package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o00O0OO;
import com.google.common.collect.oo000o;
import com.google.common.collect.oo0o0O0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@Beta
@GwtIncompatible
public final class CycleDetectingLockFactory {

    public static class OooO00o extends ThreadLocal<ArrayList<OooO0OO>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<OooO0OO> initialValue() {
            oo000o.OooO0O0(3, "initialArraySize");
            return new ArrayList<>(3);
        }
    }

    public static class OooO0O0 extends IllegalStateException {
        static {
            String name = CycleDetectingLockFactory.class.getName();
            String name2 = OooO0O0.class.getName();
            String name3 = OooO0OO.class.getName();
            int i = ImmutableSet.f18204Oooo0oo;
            ImmutableSet.OooOO0O(3, name, name2, name3);
        }
    }

    public static class OooO0OO {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Beta
    public static abstract class Policies {
        private static final /* synthetic */ Policies[] $VALUES;
        public static final Policies DISABLED;
        public static final Policies THROW;
        public static final Policies WARN;

        public static enum OooO00o extends Policies {
            public OooO00o() {
                super("THROW", 0, null);
            }
        }

        public static enum OooO0O0 extends Policies {
            public OooO0O0() {
                super("WARN", 1, null);
            }
        }

        public static enum OooO0OO extends Policies {
            public OooO0OO() {
                super("DISABLED", 2, null);
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            THROW = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            WARN = oooO0O0;
            OooO0OO oooO0OO = new OooO0OO();
            DISABLED = oooO0OO;
            $VALUES = new Policies[]{oooO00o, oooO0O0, oooO0OO};
        }

        public Policies(String str, int i, OooO00o oooO00o) {
            super(str, i);
        }

        public static Policies valueOf(String str) {
            return (Policies) Enum.valueOf(Policies.class, str);
        }

        public static Policies[] values() {
            return (Policies[]) $VALUES.clone();
        }
    }

    @Beta
    public static final class PotentialDeadlockException extends OooO0O0 {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return new StringBuilder(super.getMessage()).toString();
        }
    }

    static {
        oo0o0O0 oo0o0o0 = new oo0o0O0();
        oo0o0o0.OooO0Oo(o00O0OO.o0OoOo0.WEAK);
        oo0o0o0.OooO0OO();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new OooO00o();
    }
}
