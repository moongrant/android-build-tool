package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "Ljava/io/Serializable;", "()V", "getNewPropTimeStamp", "", "getGetNewPropTimeStamp", "()J", "setGetNewPropTimeStamp", "(J)V", "isFrozen", "", "()Z", "setFrozen", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GiftBackpackInfoModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("getNewPropTimeStamp")
    private long getNewPropTimeStamp;

    @SerializedName("isFrozen")
    private boolean isFrozen;

    public final long getGetNewPropTimeStamp() {
        return this.getNewPropTimeStamp;
    }

    /* JADX INFO: renamed from: isFrozen, reason: from getter */
    public final boolean getIsFrozen() {
        return this.isFrozen;
    }

    public final void setFrozen(boolean z) {
        this.isFrozen = z;
    }

    public final void setGetNewPropTimeStamp(long j) {
        this.getNewPropTimeStamp = j;
    }
}
