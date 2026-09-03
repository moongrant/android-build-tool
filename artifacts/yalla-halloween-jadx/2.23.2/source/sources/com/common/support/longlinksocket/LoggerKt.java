package com.common.support.longlinksocket;

import android.util.Log;
import com.common.support.longlink.LongLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"logD", "", "content", "", "logE", "longlink-socket_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LoggerKt {
    public static final void logD(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (LongLink.INSTANCE.isLoggable()) {
            Log.d("SocketBasedLongLink", content);
        }
    }

    public static final void logE(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (LongLink.INSTANCE.isLoggable()) {
            Log.d("SocketBasedLongLink", content);
        }
    }
}
