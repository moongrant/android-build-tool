package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/GiftPropSubDetailsModel;", "Ljava/io/Serializable;", "()V", "blindBoxId", "", "getBlindBoxId", "()J", "setBlindBoxId", "(J)V", "descImage", "", "getDescImage", "()Ljava/lang/String;", "setDescImage", "(Ljava/lang/String;)V", "descUrl", "getDescUrl", "setDescUrl", "subProps", "", "Lcom/yalla/yalla/model/GiftPropSubItemModel;", "getSubProps", "()Ljava/util/List;", "setSubProps", "(Ljava/util/List;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftPropSubDetailsModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("blindBoxId")
    private long blindBoxId;

    @SerializedName("descImage")
    @NotNull
    private String descImage = "";

    @SerializedName("descUrl")
    @NotNull
    private String descUrl = "";

    @SerializedName("subProps")
    @NotNull
    private List<GiftPropSubItemModel> subProps = new ArrayList();

    public final long getBlindBoxId() {
        return this.blindBoxId;
    }

    @NotNull
    public final String getDescImage() {
        return this.descImage;
    }

    @NotNull
    public final String getDescUrl() {
        return this.descUrl;
    }

    @NotNull
    public final List<GiftPropSubItemModel> getSubProps() {
        return this.subProps;
    }

    public final void setBlindBoxId(long j) {
        this.blindBoxId = j;
    }

    public final void setDescImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.descImage = str;
    }

    public final void setDescUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.descUrl = str;
    }

    public final void setSubProps(@NotNull List<GiftPropSubItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.subProps = list;
    }
}
