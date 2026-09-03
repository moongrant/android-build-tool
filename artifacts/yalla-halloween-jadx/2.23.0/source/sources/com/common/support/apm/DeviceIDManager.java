package com.common.support.apm;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/common/support/apm/DeviceIDManager;", "", "()V", "SP_SAILFISH", "", "SP_SAILFISH_DEVICE_ID", "createAndSave", "sp", "Landroid/content/SharedPreferences;", "get", "context", "Landroid/content/Context;", "save", "", "deviceId", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceIDManager {

    @NotNull
    public static final DeviceIDManager INSTANCE = new DeviceIDManager();

    @NotNull
    private static final String SP_SAILFISH = "sailfish_sp";

    @NotNull
    private static final String SP_SAILFISH_DEVICE_ID = "device_id";

    private DeviceIDManager() {
    }

    private final String createAndSave(SharedPreferences sp) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        String strOooOoO = StringsKt.OooOoO(string, "-", "");
        SharedPreferences.Editor editorEdit = sp.edit();
        editorEdit.putString(SP_SAILFISH_DEVICE_ID, strOooOoO);
        editorEdit.apply();
        return strOooOoO;
    }

    @NotNull
    public final String get(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sp = context.getSharedPreferences(SP_SAILFISH, 0);
        String string = sp.getString(SP_SAILFISH_DEVICE_ID, null);
        if (string != null) {
            return string;
        }
        DeviceIDManager deviceIDManager = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(sp, "sp");
        return deviceIDManager.createAndSave(sp);
    }

    public final void save(@NotNull Context context, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_SAILFISH, 0).edit();
        editorEdit.putString(SP_SAILFISH_DEVICE_ID, deviceId);
        editorEdit.apply();
    }
}
