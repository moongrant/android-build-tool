package com.yalla.yalla.model;

import android.support.v4.media.session.OooO0OO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00o.oO00OOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/TreasureBoxModel;", "", "()V", "awards", "", "Lcom/yalla/yalla/model/TreasureBoxModel$Award;", "getAwards", "()Ljava/util/List;", "box", "Lcom/yalla/yalla/model/TreasureBoxModel$Box;", "getBox", "()Lcom/yalla/yalla/model/TreasureBoxModel$Box;", "userRank", "Lcom/yalla/yalla/model/TreasureBoxModel$Rank;", "getUserRank", "Award", "Box", "Rank", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TreasureBoxModel {
    public static final int $stable = 8;

    @Nullable
    private final Box box;

    @NotNull
    private final List<Award> awards = new ArrayList();

    @NotNull
    private final List<Rank> userRank = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/TreasureBoxModel$Award;", "", "imageUrl", "", "showName", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getShowName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Award {
        public static final int $stable = 0;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String showName;

        /* JADX WARN: Multi-variable type inference failed */
        public Award() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Award copy$default(Award award, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = award.imageUrl;
            }
            if ((i & 2) != 0) {
                str2 = award.showName;
            }
            return award.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getShowName() {
            return this.showName;
        }

        @NotNull
        public final Award copy(@NotNull String imageUrl, @NotNull String showName) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(showName, "showName");
            return new Award(imageUrl, showName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Award)) {
                return false;
            }
            Award award = (Award) other;
            return Intrinsics.areEqual(this.imageUrl, award.imageUrl) && Intrinsics.areEqual(this.showName, award.showName);
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getShowName() {
            return this.showName;
        }

        public int hashCode() {
            return this.showName.hashCode() + (this.imageUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return oO00OOOo.OooO00o("Award(imageUrl=", this.imageUrl, ", showName=", this.showName, ")");
        }

        public Award(@NotNull String imageUrl, @NotNull String showName) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(showName, "showName");
            this.imageUrl = imageUrl;
            this.showName = showName;
        }

        public /* synthetic */ Award(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/TreasureBoxModel$Box;", "", "boxLevel", "", "isDraw", "", "percent", "timeId", "(IZII)V", "getBoxLevel", "()I", "()Z", "getPercent", "getTimeId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Box {
        public static final int $stable = 0;
        private final int boxLevel;
        private final boolean isDraw;
        private final int percent;
        private final int timeId;

        public Box() {
            this(0, false, 0, 0, 15, null);
        }

        public static /* synthetic */ Box copy$default(Box box, int i, boolean z, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = box.boxLevel;
            }
            if ((i4 & 2) != 0) {
                z = box.isDraw;
            }
            if ((i4 & 4) != 0) {
                i2 = box.percent;
            }
            if ((i4 & 8) != 0) {
                i3 = box.timeId;
            }
            return box.copy(i, z, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBoxLevel() {
            return this.boxLevel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsDraw() {
            return this.isDraw;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getTimeId() {
            return this.timeId;
        }

        @NotNull
        public final Box copy(int boxLevel, boolean isDraw, int percent, int timeId) {
            return new Box(boxLevel, isDraw, percent, timeId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Box)) {
                return false;
            }
            Box box = (Box) other;
            return this.boxLevel == box.boxLevel && this.isDraw == box.isDraw && this.percent == box.percent && this.timeId == box.timeId;
        }

        public final int getBoxLevel() {
            return this.boxLevel;
        }

        public final int getPercent() {
            return this.percent;
        }

        public final int getTimeId() {
            return this.timeId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int i = this.boxLevel * 31;
            boolean z = this.isDraw;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((((i + r1) * 31) + this.percent) * 31) + this.timeId;
        }

        public final boolean isDraw() {
            return this.isDraw;
        }

        @NotNull
        public String toString() {
            return "Box(boxLevel=" + this.boxLevel + ", isDraw=" + this.isDraw + ", percent=" + this.percent + ", timeId=" + this.timeId + ")";
        }

        public Box(int i, boolean z, int i2, int i3) {
            this.boxLevel = i;
            this.isDraw = z;
            this.percent = i2;
            this.timeId = i3;
        }

        public /* synthetic */ Box(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/TreasureBoxModel$Rank;", "", "headUrl", "", "nickName", "userId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getHeadUrl", "()Ljava/lang/String;", "getNickName", "getUserId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Rank {
        public static final int $stable = 0;

        @NotNull
        private final String headUrl;

        @NotNull
        private final String nickName;
        private final long userId;

        public Rank() {
            this(null, null, 0L, 7, null);
        }

        public static /* synthetic */ Rank copy$default(Rank rank, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rank.headUrl;
            }
            if ((i & 2) != 0) {
                str2 = rank.nickName;
            }
            if ((i & 4) != 0) {
                j = rank.userId;
            }
            return rank.copy(str, str2, j);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeadUrl() {
            return this.headUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final Rank copy(@NotNull String headUrl, @NotNull String nickName, long userId) {
            Intrinsics.checkNotNullParameter(headUrl, "headUrl");
            Intrinsics.checkNotNullParameter(nickName, "nickName");
            return new Rank(headUrl, nickName, userId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rank)) {
                return false;
            }
            Rank rank = (Rank) other;
            return Intrinsics.areEqual(this.headUrl, rank.headUrl) && Intrinsics.areEqual(this.nickName, rank.nickName) && this.userId == rank.userId;
        }

        @NotNull
        public final String getHeadUrl() {
            return this.headUrl;
        }

        @NotNull
        public final String getNickName() {
            return this.nickName;
        }

        public final long getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iOooO00o = OooO0O0.OooO00o(this.nickName, this.headUrl.hashCode() * 31, 31);
            long j = this.userId;
            return iOooO00o + ((int) (j ^ (j >>> 32)));
        }

        @NotNull
        public String toString() {
            String str = this.headUrl;
            String str2 = this.nickName;
            return OooO0OO.OooO0O0(androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO00o("Rank(headUrl=", str, ", nickName=", str2, ", userId="), this.userId, ")");
        }

        public Rank(@NotNull String headUrl, @NotNull String nickName, long j) {
            Intrinsics.checkNotNullParameter(headUrl, "headUrl");
            Intrinsics.checkNotNullParameter(nickName, "nickName");
            this.headUrl = headUrl;
            this.nickName = nickName;
            this.userId = j;
        }

        public /* synthetic */ Rank(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
        }
    }

    @NotNull
    public final List<Award> getAwards() {
        return this.awards;
    }

    @Nullable
    public final Box getBox() {
        return this.box;
    }

    @NotNull
    public final List<Rank> getUserRank() {
        return this.userRank;
    }
}
