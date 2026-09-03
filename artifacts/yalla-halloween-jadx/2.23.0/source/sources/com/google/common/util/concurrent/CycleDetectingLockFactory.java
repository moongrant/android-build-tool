package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.o000oOoO;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o00O;
import com.google.common.collect.oo000o;
import com.google.common.collect.oo0oOO0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
public final class CycleDetectingLockFactory {

    public class OooO00o extends ThreadLocal<ArrayList<OooO0OO>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<OooO0OO> initialValue() {
            oo000o.OooO0O0(3, "initialArraySize");
            return new ArrayList<>(3);
        }
    }

    public static class OooO0O0 extends IllegalStateException {
        static {
            ImmutableSet.OooOOOO(CycleDetectingLockFactory.class.getName(), OooO0O0.class.getName(), OooO0OO.class.getName());
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

        public final enum OooO00o extends Policies {
            public OooO00o() {
                super("THROW", 0);
            }
        }

        public final enum OooO0O0 extends Policies {
            public OooO0O0() {
                super("WARN", 1);
            }
        }

        public final enum OooO0OO extends Policies {
            public OooO0OO() {
                super("DISABLED", 2);
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

        public Policies() {
            throw null;
        }

        public Policies(String str, int i) {
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
            String message = super.getMessage();
            Objects.requireNonNull(message);
            return new StringBuilder(message).toString();
        }
    }

    static {
        oo0oOO0 oo0ooo0 = new oo0oOO0();
        o00O.o0OoOo0 o0oooo0 = o00O.o0OoOo0.WEAK;
        o00O.o0OoOo0 o0oooo1 = oo0ooo0.f19697OooO0Oo;
        o000oOoO.OooOO0o("Key strength was already set to %s", o0oooo1, o0oooo1 == null);
        o0oooo0.getClass();
        oo0ooo0.f19697OooO0Oo = o0oooo0;
        if (o0oooo0 != o00O.o0OoOo0.STRONG) {
            oo0ooo0.f19694OooO00o = true;
        }
        oo0ooo0.OooO0O0();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new OooO00o();
    }
}
