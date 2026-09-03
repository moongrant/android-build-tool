package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/share/ShareThirdConfig;", "", "()V", "shareContent", "", "shareModelNew", "Lcom/yalla/yalla/model/share/ShareThirdModelNew;", "supportFriend", "supportMoment", "supportThird", "isSupportFriend", "isSupportMoment", "isSupportThird", "setShareThirdModel", "shareModel", "setSupportFriend", "support", "setSupportMoment", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareThirdConfig {
    public static final int $stable = 8;

    @Nullable
    private ShareThirdModelNew shareModelNew;
    private boolean supportFriend;
    private boolean supportMoment;
    private boolean supportThird = true;
    private boolean shareContent = true;

    /* JADX INFO: renamed from: isSupportFriend, reason: from getter */
    public final boolean getSupportFriend() {
        return this.supportFriend;
    }

    /* JADX INFO: renamed from: isSupportMoment, reason: from getter */
    public final boolean getSupportMoment() {
        return this.supportMoment;
    }

    /* JADX INFO: renamed from: isSupportThird, reason: from getter */
    public final boolean getSupportThird() {
        return this.supportThird;
    }

    @NotNull
    public final ShareThirdConfig setShareThirdModel(@NotNull ShareThirdModelNew shareModel) {
        Intrinsics.checkNotNullParameter(shareModel, "shareModel");
        this.shareModelNew = shareModel;
        if ((shareModel instanceof ShareThirdModelNew.ShareThirdH5ActivityModel) || (shareModel instanceof ShareThirdModelNew.ShareThirdRoomModel)) {
            this.supportFriend = true;
            this.supportMoment = true;
        }
        return this;
    }

    @NotNull
    public final ShareThirdConfig setSupportFriend(boolean support) {
        this.supportFriend = support;
        return this;
    }

    @NotNull
    public final ShareThirdConfig setSupportMoment(boolean support) {
        this.supportMoment = support;
        return this;
    }
}
