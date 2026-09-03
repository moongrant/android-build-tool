package com.common.support.longlink.log;

import android.util.Log;
import com.common.support.longlink.LongLink;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"logD", "", ViewHierarchyConstants.TAG_KEY, "", "content", "logE", "longlink_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LoggerKt {
    public static final void logD(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        if (LongLink.INSTANCE.isLoggable()) {
            Log.d("LongLinkHttpClient", "LongLink --> 【" + tag + (char) 12305 + content);
        }
    }

    public static final void logE(@NotNull String tag, @NotNull String content) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(content, "content");
        if (LongLink.INSTANCE.isLoggable()) {
            Log.d("LongLinkHttpClient", "LongLink --> 【" + tag + (char) 12305 + content);
        }
    }
}
