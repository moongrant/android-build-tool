package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/RoomBroadcastOpenNobleModel;", "", "()V", "data", "Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;", "getData", "()Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;", "setData", "(Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomBroadcastOpenNobleModel {
    public static final int $stable = 8;

    @Nullable
    private RoomBroadcastOpenNobleDataModel data;

    @NotNull
    private String msg = "";

    @Nullable
    public final RoomBroadcastOpenNobleDataModel getData() {
        return this.data;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final void setData(@Nullable RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel) {
        this.data = roomBroadcastOpenNobleDataModel;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }
}
