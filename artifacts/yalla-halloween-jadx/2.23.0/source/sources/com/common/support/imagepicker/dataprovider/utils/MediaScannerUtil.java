package com.common.support.imagepicker.dataprovider.utils;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/utils/MediaScannerUtil;", "", "()V", "scanFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "paths", "", "", "mimeTypes", "(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaScannerUtil {

    @NotNull
    public static final MediaScannerUtil INSTANCE = new MediaScannerUtil();

    private MediaScannerUtil() {
    }

    @Nullable
    public final Object scanFile(@NotNull Context context, @NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Continuation<? super Uri> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        MediaScannerConnection.scanFile(context, strArr, strArr2, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.common.support.imagepicker.dataprovider.utils.MediaScannerUtil$scanFile$2$1
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                safeContinuation.resumeWith(Result.m4213constructorimpl(uri));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
