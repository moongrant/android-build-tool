package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/RedemptionCodeModel;", "", "()V", "cdk", "", "getCdk", "()Ljava/lang/String;", "setCdk", "(Ljava/lang/String;)V", "rewards", "", "Lcom/yalla/yalla/model/RedemptionCodeAwards;", "getRewards", "()Ljava/util/List;", "setRewards", "(Ljava/util/List;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RedemptionCodeModel {
    public static final int $stable = 8;

    @NotNull
    private String cdk = "";

    @Nullable
    private List<RedemptionCodeAwards> rewards;
    private long time;
    private long userId;

    @NotNull
    public final String getCdk() {
        return this.cdk;
    }

    @Nullable
    public final List<RedemptionCodeAwards> getRewards() {
        return this.rewards;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setCdk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cdk = str;
    }

    public final void setRewards(@Nullable List<RedemptionCodeAwards> list) {
        this.rewards = list;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
