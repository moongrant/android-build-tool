package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentCommentResultModel;", "Ljava/io/Serializable;", "()V", "cid", "", "getCid", "()J", "commentContent", "", "getCommentContent", "()Ljava/lang/String;", "commentNum", "getCommentNum", "contentModel", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "deblockingTime", "getDeblockingTime", "localAddType", "Lcom/yalla/yalla/model/moment/MomentCommentResultType;", "getLocalAddType", "()Lcom/yalla/yalla/model/moment/MomentCommentResultType;", "setLocalAddType", "(Lcom/yalla/yalla/model/moment/MomentCommentResultType;)V", "getContent", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentCommentResultModel implements Serializable {
    public static final int $stable = 8;
    private final long cid;

    @Nullable
    private final String commentContent;
    private final long commentNum;

    @Nullable
    private MomentSendContentModel contentModel;

    @Nullable
    private final String deblockingTime;

    @NotNull
    private MomentCommentResultType localAddType = MomentCommentResultType.Comment;

    public final long getCid() {
        return this.cid;
    }

    @Nullable
    public final String getCommentContent() {
        return this.commentContent;
    }

    public final long getCommentNum() {
        return this.commentNum;
    }

    @Nullable
    public final MomentSendContentModel getContent() {
        String str = this.commentContent;
        if (str == null) {
            this.contentModel = str != null ? (MomentSendContentModel) OooO.OooO0O0(MomentSendContentModel.class, str) : null;
        }
        return this.contentModel;
    }

    @Nullable
    public final String getDeblockingTime() {
        return this.deblockingTime;
    }

    @NotNull
    public final MomentCommentResultType getLocalAddType() {
        return this.localAddType;
    }

    public final void setLocalAddType(@NotNull MomentCommentResultType momentCommentResultType) {
        Intrinsics.checkNotNullParameter(momentCommentResultType, "<set-?>");
        this.localAddType = momentCommentResultType;
    }
}
