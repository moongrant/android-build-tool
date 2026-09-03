package com.common.support.utils;

import android.os.Handler;
import android.os.Looper;
import com.qiniu.android.collect.ReportItem;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u001a\u0014\u0010\u000e\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000f"}, d2 = {"mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "runDelayedOnUiThread", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "runOnUiThread", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UtilsKt {

    @NotNull
    private static final Lazy mainHandler$delegate = LazyKt.lazy(new Function0<Handler>() { // from class: com.common.support.utils.UtilsKt$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    @NotNull
    public static final Handler getMainHandler() {
        return (Handler) mainHandler$delegate.getValue();
    }

    public static final void runDelayedOnUiThread(long j, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        getMainHandler().postDelayed(new androidx.compose.ui.text.input.OooO0OO(block, 1), timeUnit.toMillis(j));
    }

    public static /* synthetic */ void runDelayedOnUiThread$default(long j, TimeUnit timeUnit, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        runDelayedOnUiThread(j, timeUnit, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runDelayedOnUiThread$lambda-1, reason: not valid java name */
    public static final void m4028runDelayedOnUiThread$lambda1(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final void runOnUiThread(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getMainHandler().post(new Runnable() { // from class: com.common.support.utils.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                UtilsKt.m4029runOnUiThread$lambda0(block);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m4029runOnUiThread$lambda0(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke();
    }
}
