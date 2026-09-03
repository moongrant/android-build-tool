package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/MemberBadgeInfo;", "Ljava/io/Serializable;", "()V", "badgeLevelUrl", "", "getBadgeLevelUrl", "()Ljava/lang/String;", "badgeState", "", "getBadgeState", "()Z", "badgeUrl", "getBadgeUrl", "isTopRank", "memberLevel", "", "getMemberLevel", "()I", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MemberBadgeInfo implements Serializable {
    public static final int $stable = 0;
    private final boolean badgeState;
    private final boolean isTopRank;
    private final int memberLevel;

    @NotNull
    private final String badgeUrl = "";

    @NotNull
    private final String badgeLevelUrl = "";

    @NotNull
    public final String getBadgeLevelUrl() {
        return this.badgeLevelUrl;
    }

    public final boolean getBadgeState() {
        return this.badgeState;
    }

    @NotNull
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final int getMemberLevel() {
        return this.memberLevel;
    }

    /* JADX INFO: renamed from: isTopRank, reason: from getter */
    public final boolean getIsTopRank() {
        return this.isTopRank;
    }
}
