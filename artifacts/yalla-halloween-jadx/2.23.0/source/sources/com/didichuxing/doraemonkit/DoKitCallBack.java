package com.didichuxing.doraemonkit;

import com.didichuxing.doraemonkit.kit.network.bean.NetworkRecord;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/didichuxing/doraemonkit/DoKitCallBack;", "", "onCpuCallBack", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "filePath", "", "onFpsCallBack", "onMemoryCallBack", "onNetworkCallBack", "record", "Lcom/didichuxing/doraemonkit/kit/network/bean/NetworkRecord;", "dokit-no-op_release"}, k = 1, mv = {1, 4, 2})
public interface DoKitCallBack {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static final class DefaultImpls {
        public static void onCpuCallBack(@NotNull DoKitCallBack doKitCallBack, float f, @NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
        }

        public static void onFpsCallBack(@NotNull DoKitCallBack doKitCallBack, float f, @NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
        }

        public static void onMemoryCallBack(@NotNull DoKitCallBack doKitCallBack, float f, @NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
        }

        public static void onNetworkCallBack(@NotNull DoKitCallBack doKitCallBack, @NotNull NetworkRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
        }
    }

    void onCpuCallBack(float value, @NotNull String filePath);

    void onFpsCallBack(float value, @NotNull String filePath);

    void onMemoryCallBack(float value, @NotNull String filePath);

    void onNetworkCallBack(@NotNull NetworkRecord record);
}
