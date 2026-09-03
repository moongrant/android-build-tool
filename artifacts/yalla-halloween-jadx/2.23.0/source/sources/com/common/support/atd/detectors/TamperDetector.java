package com.common.support.atd.detectors;

import android.content.Context;
import android.os.Debug;
import com.common.support.atd.AbstractDetector;
import com.common.support.atd.DetectResult;
import com.common.support.atd.utils.UtilsKt;
import com.common.support.sailfish_commons.logmodels.SecModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/common/support/atd/detectors/TamperDetector;", "Lcom/common/support/atd/AbstractDetector;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "keySubstrate", "", "detect", "", "sailfishSecModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "resultForApi", "Lcom/common/support/atd/DetectResult;", "isDebuggable", "", "isDebuggerConnected", "isInject", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TamperDetector extends AbstractDetector {

    @NotNull
    private final Context context;

    @NotNull
    private final String keySubstrate;

    public TamperDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.keySubstrate = "com.saurik.substrate.MS$2";
    }

    private final boolean isDebuggable() {
        return (this.context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    private final boolean isDebuggerConnected() {
        return Debug.isDebuggerConnected();
    }

    private final boolean isInject() {
        try {
            throw new Exception("");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (Intrinsics.areEqual(stackTraceElement.getClassName(), "com.android.internal.os.ZygoteInit") && (i = i + 1) == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.common.support.atd.AbstractDetector
    public void detect(@NotNull SecModel sailfishSecModel, @NotNull DetectResult resultForApi) {
        Intrinsics.checkNotNullParameter(sailfishSecModel, "sailfishSecModel");
        Intrinsics.checkNotNullParameter(resultForApi, "resultForApi");
        sailfishSecModel.setDebug(isDebuggable() && isDebuggerConnected());
        sailfishSecModel.setInjection(isInject());
        resultForApi.setA5(UtilsKt.toInt(sailfishSecModel.getDebug()));
        resultForApi.setA7(UtilsKt.toInt(sailfishSecModel.getInjection()));
    }
}
