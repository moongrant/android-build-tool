package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/VoteGameGift;", "", "()V", "giftId", "", "getGiftId", "()J", "setGiftId", "(J)V", "giftImageUrl", "", "getGiftImageUrl", "()Ljava/lang/String;", "setGiftImageUrl", "(Ljava/lang/String;)V", "giftPrice", "", "getGiftPrice", "()I", "setGiftPrice", "(I)V", "giftType", "getGiftType", "setGiftType", "clone", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoteGameGift {
    public static final int $stable = 8;
    private long giftId;

    @NotNull
    private String giftImageUrl = "";
    private int giftPrice;
    private int giftType;

    @NotNull
    public final VoteGameGift clone() {
        VoteGameGift voteGameGift = new VoteGameGift();
        voteGameGift.giftId = this.giftId;
        voteGameGift.giftType = this.giftType;
        voteGameGift.giftPrice = this.giftPrice;
        voteGameGift.giftImageUrl = this.giftImageUrl;
        return voteGameGift;
    }

    public final long getGiftId() {
        return this.giftId;
    }

    @NotNull
    public final String getGiftImageUrl() {
        return this.giftImageUrl;
    }

    public final int getGiftPrice() {
        return this.giftPrice;
    }

    public final int getGiftType() {
        return this.giftType;
    }

    public final void setGiftId(long j) {
        this.giftId = j;
    }

    public final void setGiftImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.giftImageUrl = str;
    }

    public final void setGiftPrice(int i) {
        this.giftPrice = i;
    }

    public final void setGiftType(int i) {
        this.giftType = i;
    }
}
