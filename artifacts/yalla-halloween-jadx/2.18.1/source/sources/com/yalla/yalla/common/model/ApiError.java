package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.manager.error.CommonError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/common/model/ApiError;", "Lcom/yalla/yalla/common/manager/error/CommonError;", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(ILjava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class ApiError extends CommonError {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiError() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i, @NotNull String message) {
        super(i, message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ ApiError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
