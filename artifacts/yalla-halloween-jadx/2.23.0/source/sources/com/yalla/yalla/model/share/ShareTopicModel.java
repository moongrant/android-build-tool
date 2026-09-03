package com.yalla.yalla.model.share;

import OooO0OO.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JU\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006&"}, d2 = {"Lcom/yalla/yalla/model/share/ShareTopicModel;", "", "targets", "", "", "circleId", "image", "", "name", "userCount", "", "momentCount", "msg", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getCircleId", "()J", "getImage", "()Ljava/lang/String;", "getMomentCount", "()I", "getMsg", "getName", "getTargets", "()Ljava/util/List;", "getUserCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShareTopicModel {
    public static final int $stable = 8;
    private final long circleId;

    @NotNull
    private final String image;
    private final int momentCount;

    @NotNull
    private final String msg;

    @NotNull
    private final String name;

    @NotNull
    private final List<Long> targets;
    private final int userCount;

    public ShareTopicModel(@NotNull List<Long> targets, long j, @NotNull String image, @NotNull String name, int i, int i2, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.targets = targets;
        this.circleId = j;
        this.image = image;
        this.name = name;
        this.userCount = i;
        this.momentCount = i2;
        this.msg = msg;
    }

    @NotNull
    public final List<Long> component1() {
        return this.targets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCircleId() {
        return this.circleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUserCount() {
        return this.userCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMomentCount() {
        return this.momentCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ShareTopicModel copy(@NotNull List<Long> targets, long circleId, @NotNull String image, @NotNull String name, int userCount, int momentCount, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ShareTopicModel(targets, circleId, image, name, userCount, momentCount, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareTopicModel)) {
            return false;
        }
        ShareTopicModel shareTopicModel = (ShareTopicModel) other;
        return Intrinsics.areEqual(this.targets, shareTopicModel.targets) && this.circleId == shareTopicModel.circleId && Intrinsics.areEqual(this.image, shareTopicModel.image) && Intrinsics.areEqual(this.name, shareTopicModel.name) && this.userCount == shareTopicModel.userCount && this.momentCount == shareTopicModel.momentCount && Intrinsics.areEqual(this.msg, shareTopicModel.msg);
    }

    public final long getCircleId() {
        return this.circleId;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final int getMomentCount() {
        return this.momentCount;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Long> getTargets() {
        return this.targets;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        int iHashCode = this.targets.hashCode() * 31;
        long j = this.circleId;
        return this.msg.hashCode() + ((((o0OO00O.OooO00o(this.name, o0OO00O.OooO00o(this.image, (iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31), 31) + this.userCount) * 31) + this.momentCount) * 31);
    }

    @NotNull
    public String toString() {
        List<Long> list = this.targets;
        long j = this.circleId;
        String str = this.image;
        String str2 = this.name;
        int i = this.userCount;
        int i2 = this.momentCount;
        String str3 = this.msg;
        StringBuilder sb = new StringBuilder("ShareTopicModel(targets=");
        sb.append(list);
        sb.append(", circleId=");
        sb.append(j);
        OooO0O0.OooO00o(sb, ", image=", str, ", name=", str2);
        sb.append(", userCount=");
        sb.append(i);
        sb.append(", momentCount=");
        sb.append(i2);
        return OooO0OO.OooO0OO(sb, ", msg=", str3, ")");
    }
}
