package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/MomentLogActionTypeSendGift;", "Lcom/yalla/yalla/model/MomentLogActionTypeBase;", "object_userid", "", "discoveryid", "gift_value", "gift_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscoveryid", "()Ljava/lang/String;", "setDiscoveryid", "(Ljava/lang/String;)V", "getGift_type", "setGift_type", "getGift_value", "setGift_value", "getObject_userid", "setObject_userid", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentLogActionTypeSendGift extends MomentLogActionTypeBase {
    public static final int $stable = 8;

    @NotNull
    private String discoveryid;

    @NotNull
    private String gift_type;

    @NotNull
    private String gift_value;

    @NotNull
    private String object_userid;

    public MomentLogActionTypeSendGift() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final String getDiscoveryid() {
        return this.discoveryid;
    }

    @NotNull
    public final String getGift_type() {
        return this.gift_type;
    }

    @NotNull
    public final String getGift_value() {
        return this.gift_value;
    }

    @NotNull
    public final String getObject_userid() {
        return this.object_userid;
    }

    public final void setDiscoveryid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.discoveryid = str;
    }

    public final void setGift_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gift_type = str;
    }

    public final void setGift_value(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gift_value = str;
    }

    public final void setObject_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.object_userid = str;
    }

    public MomentLogActionTypeSendGift(@NotNull String object_userid, @NotNull String discoveryid, @NotNull String gift_value, @NotNull String gift_type) {
        Intrinsics.checkNotNullParameter(object_userid, "object_userid");
        Intrinsics.checkNotNullParameter(discoveryid, "discoveryid");
        Intrinsics.checkNotNullParameter(gift_value, "gift_value");
        Intrinsics.checkNotNullParameter(gift_type, "gift_type");
        this.object_userid = object_userid;
        this.discoveryid = discoveryid;
        this.gift_value = gift_value;
        this.gift_type = gift_type;
    }

    public /* synthetic */ MomentLogActionTypeSendGift(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
