package com.common.support.utils;

import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/common/support/utils/ToastUtils;", "", "()V", "canShowToast", "", "getCanShowToast", "()Z", "setCanShowToast", "(Z)V", "toast", "Ljava/lang/ref/WeakReference;", "Landroid/widget/Toast;", "makeToast", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "duration", "", "safeShowToast", "", "content", "showToast", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ToastUtils {

    @NotNull
    public static final ToastUtils INSTANCE = new ToastUtils();
    private static boolean canShowToast = true;

    @Nullable
    private static WeakReference<Toast> toast;

    private ToastUtils() {
    }

    private final Toast makeToast(CharSequence value, int duration) {
        Toast toast2 = Toast.makeText(Utils.INSTANCE.getApp(), (CharSequence) null, duration);
        toast2.setText(value);
        Intrinsics.checkNotNullExpressionValue(toast2, "toast");
        return toast2;
    }

    public static /* synthetic */ void safeShowToast$default(ToastUtils toastUtils, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        toastUtils.safeShowToast(charSequence, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToast(CharSequence content, int duration) {
        Toast toastMakeToast = makeToast(content, duration);
        toastMakeToast.show();
        toast = new WeakReference<>(toastMakeToast);
    }

    public final boolean getCanShowToast() {
        return canShowToast;
    }

    public final void safeShowToast(@NotNull final CharSequence content, final int duration) {
        Toast toast2;
        Intrinsics.checkNotNullParameter(content, "content");
        if (canShowToast) {
            WeakReference<Toast> weakReference = toast;
            if (weakReference != null && (toast2 = weakReference.get()) != null) {
                toast2.cancel();
            }
            if (Looper.myLooper() == null || !Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                UtilsKt.runOnUiThread(new Function0<Unit>() { // from class: com.common.support.utils.ToastUtils.safeShowToast.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ToastUtils.INSTANCE.showToast(content, duration);
                    }
                });
            } else {
                showToast(content, duration);
            }
        }
    }

    public final void setCanShowToast(boolean z) {
        canShowToast = z;
    }
}
