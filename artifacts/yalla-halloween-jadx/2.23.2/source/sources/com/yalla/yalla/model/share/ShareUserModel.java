package com.yalla.yalla.model.share;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.OooOOO0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yalla/yalla/model/share/ShareUserModel;", "", "targets", "", "", "id", "idx", "head", "", "name", "msg", "(Ljava/util/List;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHead", "()Ljava/lang/String;", "getId", "()J", "getIdx", "getMsg", "getName", "getTargets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ShareUserModel {
    public static final int $stable = 8;

    @NotNull
    private final String head;
    private final long id;
    private final long idx;

    @NotNull
    private final String msg;

    @NotNull
    private final String name;

    @NotNull
    private final List<Long> targets;

    public ShareUserModel(@NotNull List<Long> targets, long j, long j2, @NotNull String head, @NotNull String name, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.targets = targets;
        this.id = j;
        this.idx = j2;
        this.head = head;
        this.name = name;
        this.msg = msg;
    }

    @NotNull
    public final List<Long> component1() {
        return this.targets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getIdx() {
        return this.idx;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHead() {
        return this.head;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ShareUserModel copy(@NotNull List<Long> targets, long id, long idx, @NotNull String head, @NotNull String name, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ShareUserModel(targets, id, idx, head, name, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareUserModel)) {
            return false;
        }
        ShareUserModel shareUserModel = (ShareUserModel) other;
        return Intrinsics.areEqual(this.targets, shareUserModel.targets) && this.id == shareUserModel.id && this.idx == shareUserModel.idx && Intrinsics.areEqual(this.head, shareUserModel.head) && Intrinsics.areEqual(this.name, shareUserModel.name) && Intrinsics.areEqual(this.msg, shareUserModel.msg);
    }

    @NotNull
    public final String getHead() {
        return this.head;
    }

    public final long getId() {
        return this.id;
    }

    public final long getIdx() {
        return this.idx;
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

    public int hashCode() {
        int iHashCode = this.targets.hashCode() * 31;
        long j = this.id;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.idx;
        return this.msg.hashCode() + OooO0O0.OooO00o(this.name, OooO0O0.OooO00o(this.head, (i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        List<Long> list = this.targets;
        long j = this.id;
        long j2 = this.idx;
        String str = this.head;
        String str2 = this.name;
        String str3 = this.msg;
        StringBuilder sb = new StringBuilder("ShareUserModel(targets=");
        sb.append(list);
        sb.append(", id=");
        sb.append(j);
        OooOOO0.OooO00o(sb, ", idx=", j2, ", head=");
        OooO0OO.OooO0O0.OooO00o(sb, str, ", name=", str2, ", msg=");
        return o0oOO.OooO0O0(sb, str3, ")");
    }
}
