package com.common.support.atd.base;

import android.util.Log;
import com.common.support.atd.Detector;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"DEFAULT_LOG_TAG", "", "logD", "", "msg", ViewHierarchyConstants.TAG_KEY, "logE", "throwable", "", "lib_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LoggerKt {

    @NotNull
    private static final String DEFAULT_LOG_TAG = "Detector";

    public static final void logD(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logD(DEFAULT_LOG_TAG, msg);
    }

    public static final void logE(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        logE(DEFAULT_LOG_TAG, msg, th);
    }

    public static /* synthetic */ void logE$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        logE(str, th);
    }

    public static final void logD(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Detector.INSTANCE.isLogEnabled()) {
            Log.d(tag, msg);
        }
    }

    public static final void logE(@NotNull String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Detector.INSTANCE.isLogEnabled()) {
            Log.e(tag, msg, th);
        }
    }

    public static /* synthetic */ void logE$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logE(str, str2, th);
    }
}
