package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\""}, d2 = {"Lcom/yalla/yalla/model/GiftBlindBoxRecordModel;", "", "()V", "giftId", "", "getGiftId", "()J", "setGiftId", "(J)V", "giftImage", "", "getGiftImage", "()Ljava/lang/String;", "setGiftImage", "(Ljava/lang/String;)V", "recordId", "getRecordId", "setRecordId", "time", "getTime", "setTime", "toUserHead", "getToUserHead", "setToUserHead", "toUserId", "getToUserId", "setToUserId", "toUserName", "getToUserName", "setToUserName", "testData", "", "index", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftBlindBoxRecordModel {
    public static final int $stable = 8;

    @SerializedName("propId")
    private long giftId;

    @SerializedName("id")
    private long recordId;

    @SerializedName("sendTime")
    private long time;

    @SerializedName("getUserId")
    private long toUserId;

    @SerializedName("propImage")
    @NotNull
    private String giftImage = "";

    @SerializedName("getUserNick")
    @NotNull
    private String toUserName = "";

    @SerializedName("getUserHead")
    @NotNull
    private String toUserHead = "";

    public final long getGiftId() {
        return this.giftId;
    }

    @NotNull
    public final String getGiftImage() {
        return this.giftImage;
    }

    public final long getRecordId() {
        return this.recordId;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getToUserHead() {
        return this.toUserHead;
    }

    public final long getToUserId() {
        return this.toUserId;
    }

    @NotNull
    public final String getToUserName() {
        return this.toUserName;
    }

    public final void setGiftId(long j) {
        this.giftId = j;
    }

    public final void setGiftImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.giftImage = str;
    }

    public final void setRecordId(long j) {
        this.recordId = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setToUserHead(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toUserHead = str;
    }

    public final void setToUserId(long j) {
        this.toUserId = j;
    }

    public final void setToUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toUserName = str;
    }

    public final void testData(int index) {
        long j = index;
        this.giftId = 1 + j;
        boolean z = false;
        if (index >= 0 && index < 9) {
            z = true;
        }
        this.giftImage = z ? OooO0O0.OooO00o.OooO00o("https://yallatestfile.yalla.live/19145269/MoMent/1uBT7jPk1D/", index, ".jpeg") : "https://yallatestfile.yalla.live/19145269/MoMent/1uBT7jPk1D/0.jpeg";
        this.toUserId = 11 + j;
        this.toUserName = OooO0O0.OooO00o.OooO00o("toUserName", index, "-toUserName-toUserName-toUserName-toUserName-toUserName");
        this.time = System.currentTimeMillis() - (j * 86400000);
    }
}
