package com.common.support.apm.logger;

import com.common.support.sailfish_commons.logmodels.BaseModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001f\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0006H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/common/support/apm/logger/LogWriter;", "", "flush", "", "write", "", "T", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "(Lcom/common/support/sailfish_commons/logmodels/BaseModel;)Z", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LogWriter {
    void flush();

    <T extends BaseModel> boolean write(@NotNull T model);
}
