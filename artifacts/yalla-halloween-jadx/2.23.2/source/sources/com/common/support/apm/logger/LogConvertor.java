package com.common.support.apm.logger;

import com.common.support.sailfish_commons.logmodels.BaseModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00028\u0000\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/common/support/apm/logger/LogConvertor;", "O", "", "convert", "T", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "(Lcom/common/support/sailfish_commons/logmodels/BaseModel;)Ljava/lang/Object;", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LogConvertor<O> {
    <T extends BaseModel> O convert(@NotNull T model);
}
