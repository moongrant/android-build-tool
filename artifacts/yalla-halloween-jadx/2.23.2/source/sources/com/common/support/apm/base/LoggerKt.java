package com.common.support.apm.base;

import android.annotation.SuppressLint;
import android.util.Log;
import com.common.support.apm.Sailfish;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a \u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a,\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_LOG_TAG", "", "logD", "", ViewHierarchyConstants.TAG_KEY, "msg", "Lkotlin/Function0;", "logE", "throwable", "", "sailfish_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LoggerKt {

    @NotNull
    public static final String DEFAULT_LOG_TAG = "Sailfish";

    @SuppressLint({"AvoidUsageApiCheck"})
    public static final void logD(@NotNull String tag, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Sailfish.sdkLoggable) {
            Log.d(tag, msg.invoke());
        }
    }

    public static /* synthetic */ void logD$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DEFAULT_LOG_TAG;
        }
        logD(str, function0);
    }

    @SuppressLint({"AvoidUsageApiCheck"})
    public static final void logE(@NotNull String tag, @Nullable Throwable th, @NotNull Function0<String> msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Sailfish.sdkLoggable) {
            Log.e(tag, msg.invoke(), th);
        }
    }

    public static /* synthetic */ void logE$default(String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = DEFAULT_LOG_TAG;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        logE(str, th, function0);
    }
}
