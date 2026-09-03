package com.common.support.apm.nlog;

import android.annotation.SuppressLint;
import com.common.support.apm.base.Env;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086 J\t\u0010\u0005\u001a\u00020\u0004H\u0086 J\t\u0010\u0006\u001a\u00020\u0004H\u0086 J\t\u0010\u0007\u001a\u00020\u0004H\u0086 J\t\u0010\b\u001a\u00020\u0004H\u0086 J\t\u0010\t\u001a\u00020\u0004H\u0086 J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/common/support/apm/nlog/NLog;", "", "()V", "A", "", "B", "C", "D", "E", "F", "G", "env", "Lcom/common/support/apm/base/Env;", "H", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"CodeNameCheck"})
public final class NLog {

    @NotNull
    public static final NLog INSTANCE = new NLog();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Env.values().length];
            iArr[Env.dev.ordinal()] = 1;
            iArr[Env.fat.ordinal()] = 2;
            iArr[Env.pro.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        System.loadLibrary("nlog");
    }

    private NLog() {
    }

    @NotNull
    public final native String A();

    @NotNull
    public final native String B();

    @NotNull
    public final native String C();

    @NotNull
    public final native String D();

    @NotNull
    public final native String E();

    @NotNull
    public final native String F();

    @NotNull
    public final String G(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int i = WhenMappings.$EnumSwitchMapping$0[env.ordinal()];
        if (i == 1) {
            return A();
        }
        if (i == 2) {
            return B();
        }
        if (i == 3) {
            return C();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String H(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int i = WhenMappings.$EnumSwitchMapping$0[env.ordinal()];
        if (i == 1) {
            return D();
        }
        if (i == 2) {
            return E();
        }
        if (i == 3) {
            return F();
        }
        throw new NoWhenBranchMatchedException();
    }
}
