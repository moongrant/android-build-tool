package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/model/ApiError1058;", "Lcom/yalla/yalla/common/model/ApiError;", "()V", "additionalData", "Lcom/yalla/yalla/common/model/AdditionalData;", "getAdditionalData", "()Lcom/yalla/yalla/common/model/AdditionalData;", "setAdditionalData", "(Lcom/yalla/yalla/common/model/AdditionalData;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApiError1058 extends ApiError {
    public static final int $stable = 8;

    @Nullable
    private AdditionalData additionalData;

    public ApiError1058() {
        super(0, null, 3, null);
    }

    @Nullable
    public final AdditionalData getAdditionalData() {
        return this.additionalData;
    }

    public final void setAdditionalData(@Nullable AdditionalData additionalData) {
        this.additionalData = additionalData;
    }
}
