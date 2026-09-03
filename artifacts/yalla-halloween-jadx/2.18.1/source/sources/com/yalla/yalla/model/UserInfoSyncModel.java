package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/UserInfoSyncModel;", "Lcom/yalla/yalla/common/model/UserInfoModel;", "()V", "timesTamp", "", "getTimesTamp", "()J", "setTimesTamp", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserInfoSyncModel extends UserInfoModel {
    public static final int $stable = 8;

    @SerializedName(alternate = {"timestamp"}, value = "timesTamp")
    private long timesTamp;

    public final long getTimesTamp() {
        return this.timesTamp;
    }

    public final void setTimesTamp(long j) {
        this.timesTamp = j;
    }
}
