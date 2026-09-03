package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeAwards;", "", "()V", "rewardCount", "", "getRewardCount", "()I", "setRewardCount", "(I)V", "rewardId", "", "getRewardId", "()J", "setRewardId", "(J)V", "rewardImage", "", "getRewardImage", "()Ljava/lang/String;", "setRewardImage", "(Ljava/lang/String;)V", "rewardName", "getRewardName", "setRewardName", "rewardType", "getRewardType", "setRewardType", "unit", "getUnit", "setUnit", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RedemptionCodeAwards {
    private int rewardCount;
    private long rewardId;

    @NotNull
    private String rewardImage = "";

    @NotNull
    private String rewardName = "";
    private int rewardType;
    private int unit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeAwards$Companion;", "", "()V", "test", "Lcom/yalla/yalla/model/RedemptionCodeAwards;", "index", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RedemptionCodeAwards test(int index) {
            RedemptionCodeAwards redemptionCodeAwards = new RedemptionCodeAwards();
            redemptionCodeAwards.setRewardType(RedemptionCodeType.RewardType.INSTANCE.getCoin());
            redemptionCodeAwards.setRewardId(index);
            redemptionCodeAwards.setRewardCount(index * 10);
            redemptionCodeAwards.setRewardImage("");
            redemptionCodeAwards.setRewardName("rewardName-" + index);
            redemptionCodeAwards.setUnit(RedemptionCodeType.Unit.INSTANCE.getCoin());
            return redemptionCodeAwards;
        }
    }

    public final int getRewardCount() {
        return this.rewardCount;
    }

    public final long getRewardId() {
        return this.rewardId;
    }

    @NotNull
    public final String getRewardImage() {
        return this.rewardImage;
    }

    @NotNull
    public final String getRewardName() {
        return this.rewardName;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public final int getUnit() {
        return this.unit;
    }

    public final void setRewardCount(int i) {
        this.rewardCount = i;
    }

    public final void setRewardId(long j) {
        this.rewardId = j;
    }

    public final void setRewardImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardImage = str;
    }

    public final void setRewardName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardName = str;
    }

    public final void setRewardType(int i) {
        this.rewardType = i;
    }

    public final void setUnit(int i) {
        this.unit = i;
    }
}
