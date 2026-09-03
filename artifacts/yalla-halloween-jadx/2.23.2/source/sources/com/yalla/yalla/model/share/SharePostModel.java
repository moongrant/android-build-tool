package com.yalla.yalla.model.share;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/model/share/SharePostModel;", "", "targets", "", "", "momentId", "image", "", ViewHierarchyConstants.TEXT_KEY, "msg", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getMomentId", "()J", "getMsg", "getTargets", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SharePostModel {
    public static final int $stable = 8;

    @NotNull
    private final String image;
    private final long momentId;

    @NotNull
    private final String msg;

    @NotNull
    private final List<Long> targets;

    @NotNull
    private final String text;

    public SharePostModel(@NotNull List<Long> targets, long j, @NotNull String image, @NotNull String text, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.targets = targets;
        this.momentId = j;
        this.image = image;
        this.text = text;
        this.msg = msg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharePostModel copy$default(SharePostModel sharePostModel, List list, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sharePostModel.targets;
        }
        if ((i & 2) != 0) {
            j = sharePostModel.momentId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = sharePostModel.image;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = sharePostModel.text;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = sharePostModel.msg;
        }
        return sharePostModel.copy(list, j2, str4, str5, str3);
    }

    @NotNull
    public final List<Long> component1() {
        return this.targets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMomentId() {
        return this.momentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final SharePostModel copy(@NotNull List<Long> targets, long momentId, @NotNull String image, @NotNull String text, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new SharePostModel(targets, momentId, image, text, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharePostModel)) {
            return false;
        }
        SharePostModel sharePostModel = (SharePostModel) other;
        return Intrinsics.areEqual(this.targets, sharePostModel.targets) && this.momentId == sharePostModel.momentId && Intrinsics.areEqual(this.image, sharePostModel.image) && Intrinsics.areEqual(this.text, sharePostModel.text) && Intrinsics.areEqual(this.msg, sharePostModel.msg);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final long getMomentId() {
        return this.momentId;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final List<Long> getTargets() {
        return this.targets;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.targets.hashCode() * 31;
        long j = this.momentId;
        return this.msg.hashCode() + OooO0O0.OooO00o(this.text, OooO0O0.OooO00o(this.image, (iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        List<Long> list = this.targets;
        long j = this.momentId;
        String str = this.image;
        String str2 = this.text;
        String str3 = this.msg;
        StringBuilder sb = new StringBuilder("SharePostModel(targets=");
        sb.append(list);
        sb.append(", momentId=");
        sb.append(j);
        OooO0OO.OooO0O0.OooO00o(sb, ", image=", str, ", text=", str2);
        return androidx.compose.compiler.plugins.kotlin.OooO0O0.OooO00o(sb, ", msg=", str3, ")");
    }
}
