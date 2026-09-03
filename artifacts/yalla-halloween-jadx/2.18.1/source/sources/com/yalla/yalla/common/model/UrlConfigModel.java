package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/model/UrlConfigModel;", "", "()V", "region", "", "getRegion", "()I", "setRegion", "(I)V", "type", "getType", "setType", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UrlConfigModel {
    public static final int $stable = 8;
    private int region;
    private int type;

    @NotNull
    private String value = "";

    public final int getRegion() {
        return this.region;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }
}
