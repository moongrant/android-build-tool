package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/GiftPropSubItemModel;", "Ljava/io/Serializable;", "()V", "propId", "", "getPropId", "()J", "setPropId", "(J)V", "propImage", "", "getPropImage", "()Ljava/lang/String;", "setPropImage", "(Ljava/lang/String;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftPropSubItemModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("propId")
    private long propId;

    @SerializedName("propImage")
    @NotNull
    private String propImage = "";

    public final long getPropId() {
        return this.propId;
    }

    @NotNull
    public final String getPropImage() {
        return this.propImage;
    }

    public final void setPropId(long j) {
        this.propId = j;
    }

    public final void setPropImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.propImage = str;
    }
}
