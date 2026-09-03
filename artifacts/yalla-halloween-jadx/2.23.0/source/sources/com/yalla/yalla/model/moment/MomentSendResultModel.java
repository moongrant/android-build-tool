package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendResultModel;", "Ljava/io/Serializable;", "()V", "DeblockingTime", "", "getDeblockingTime", "()Ljava/lang/String;", "setDeblockingTime", "(Ljava/lang/String;)V", "blockingMsg", "getBlockingMsg", "setBlockingMsg", "dyid", "getDyid", "setDyid", "joinedCircle", "", "getJoinedCircle", "()Z", "setJoinedCircle", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentSendResultModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String DeblockingTime;

    @Nullable
    private String blockingMsg;

    @Nullable
    private String dyid;
    private boolean joinedCircle;

    @Nullable
    public final String getBlockingMsg() {
        return this.blockingMsg;
    }

    @Nullable
    public final String getDeblockingTime() {
        return this.DeblockingTime;
    }

    @Nullable
    public final String getDyid() {
        return this.dyid;
    }

    public final boolean getJoinedCircle() {
        return this.joinedCircle;
    }

    public final void setBlockingMsg(@Nullable String str) {
        this.blockingMsg = str;
    }

    public final void setDeblockingTime(@Nullable String str) {
        this.DeblockingTime = str;
    }

    public final void setDyid(@Nullable String str) {
        this.dyid = str;
    }

    public final void setJoinedCircle(boolean z) {
        this.joinedCircle = z;
    }
}
