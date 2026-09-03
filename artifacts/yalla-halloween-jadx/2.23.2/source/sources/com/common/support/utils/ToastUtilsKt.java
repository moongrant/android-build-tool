package com.common.support.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"toast", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Function0;", "", "toastLong", "toastRes", "", "toastResLong", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ToastUtilsKt {
    public static final void toast(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ToastUtils.safeShowToast$default(ToastUtils.INSTANCE, value, 0, 2, null);
    }

    public static final void toastLong(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ToastUtils.INSTANCE.safeShowToast(value, 1);
    }

    public static final void toastRes(int i) {
        ToastUtils.safeShowToast$default(ToastUtils.INSTANCE, ContextExtensionsKt.string(Utils.INSTANCE.getApp(), i), 0, 2, null);
    }

    public static final void toastResLong(int i) {
        ToastUtils.INSTANCE.safeShowToast(ContextExtensionsKt.string(Utils.INSTANCE.getApp(), i), 1);
    }

    public static final void toast(@NotNull Function0<? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ToastUtils.safeShowToast$default(ToastUtils.INSTANCE, value.invoke(), 0, 2, null);
    }

    public static final void toastLong(@NotNull Function0<? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ToastUtils.INSTANCE.safeShowToast(value.invoke(), 1);
    }
}
