package com.common.support.imagepicker.base.utils;

import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\u001c\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J(\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u001e\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0012J\u001a\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/common/support/imagepicker/base/utils/ImagePickerLogUtil;", "", "()V", "<set-?>", "", "debuggable", "getDebuggable", "()Z", "d", "", ViewHierarchyConstants.TAG_KEY, "", "msg", "e", "thr", "", "initDebug", "debug", "initDebug$base_release", "w", "base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImagePickerLogUtil {

    @NotNull
    public static final ImagePickerLogUtil INSTANCE = new ImagePickerLogUtil();
    private static boolean debuggable = true;

    private ImagePickerLogUtil() {
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (debuggable) {
            Log.d(tag, msg);
        }
    }

    public static /* synthetic */ void d$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        d(str, str2);
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg, @Nullable Throwable thr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (debuggable) {
            if (thr == null) {
                Log.e(tag, msg);
            } else {
                Log.e(tag, msg, thr);
            }
        }
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        e(str, str2, th);
    }

    public static /* synthetic */ void w$default(ImagePickerLogUtil imagePickerLogUtil, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        imagePickerLogUtil.w(str, str2);
    }

    public final boolean getDebuggable() {
        return debuggable;
    }

    public final void initDebug$base_release(boolean debug) {
        debuggable = debug;
    }

    public final void w(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (debuggable) {
            Log.w(tag, msg);
        }
    }

    public static /* synthetic */ void e$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        e(str, str2);
    }

    public static /* synthetic */ void e$default(String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            th = null;
        }
        e(str, th);
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        e(tag, msg, null);
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @Nullable Throwable thr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        e(tag, "", thr);
    }
}
