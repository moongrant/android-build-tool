package com.common.support.apm.netdetector;

import androidx.annotation.Keep;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/common/support/apm/netdetector/NetDetectLog;", "", "deviceNo", "", "(Ljava/lang/String;)V", "data", "Lcom/common/support/apm/netdetector/NetDetectLogData;", "getData", "()Lcom/common/support/apm/netdetector/NetDetectLogData;", "setData", "(Lcom/common/support/apm/netdetector/NetDetectLogData;)V", ViewHierarchyConstants.TAG_KEY, "getTag", "()Ljava/lang/String;", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NetDetectLog {

    @SerializedName("Data")
    @NotNull
    private NetDetectLogData data;

    @SerializedName("Tag")
    @NotNull
    private final String tag;

    public NetDetectLog(@NotNull String deviceNo) {
        Intrinsics.checkNotNullParameter(deviceNo, "deviceNo");
        this.tag = "net_detect";
        this.data = new NetDetectLogData(deviceNo, "", -1L, "");
    }

    @NotNull
    public final NetDetectLogData getData() {
        return this.data;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final void setData(@NotNull NetDetectLogData netDetectLogData) {
        Intrinsics.checkNotNullParameter(netDetectLogData, "<set-?>");
        this.data = netDetectLogData;
    }
}
