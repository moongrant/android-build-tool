package com.yalla.yalla.model;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/yalla/yalla/model/MomentCommentModel;", "Ljava/io/Serializable;", "()V", "comNickname", "", "getComNickname", "()Ljava/lang/String;", "setComNickname", "(Ljava/lang/String;)V", "comPraiseNum", "", "getComPraiseNum", "()I", "setComPraiseNum", "(I)V", "comUserid", "", "getComUserid", "()J", "setComUserid", "(J)V", "commentContent", "getCommentContent", "setCommentContent", "commentId", "getCommentId", "setCommentId", "isPraise", "", "()Z", "setPraise", "(Z)V", "getContent", "Lcom/yalla/yalla/model/MomentSendContentModel;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentCommentModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName(alternate = {"comNickName"}, value = "comNickname")
    @NotNull
    private String comNickname = "";

    @SerializedName("comPraiseNum")
    private int comPraiseNum;

    @SerializedName(alternate = {"comUserId"}, value = "comUserid")
    private long comUserid;

    @SerializedName(alternate = {"comContent"}, value = "commentContent")
    @Nullable
    private String commentContent;

    @SerializedName(alternate = {"comId"}, value = "commentid")
    private long commentId;

    @SerializedName("comisPraise")
    private boolean isPraise;

    @NotNull
    public final String getComNickname() {
        return this.comNickname;
    }

    public final int getComPraiseNum() {
        return this.comPraiseNum;
    }

    public final long getComUserid() {
        return this.comUserid;
    }

    @Nullable
    public final String getCommentContent() {
        return this.commentContent;
    }

    public final long getCommentId() {
        return this.commentId;
    }

    @NotNull
    public final MomentSendContentModel getContent() {
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel("");
        if (TextUtils.isEmpty(this.commentContent)) {
            return momentSendContentModel;
        }
        Object objOooO0OO = o0Oo0oo.OooO0OO(this.commentContent, new o00000O0<MomentSendContentModel>() { // from class: com.yalla.yalla.model.MomentCommentModel.getContent.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(commentContent,…ntSendContentModel>() {})");
        return (MomentSendContentModel) objOooO0OO;
    }

    /* JADX INFO: renamed from: isPraise, reason: from getter */
    public final boolean getIsPraise() {
        return this.isPraise;
    }

    public final void setComNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.comNickname = str;
    }

    public final void setComPraiseNum(int i) {
        this.comPraiseNum = i;
    }

    public final void setComUserid(long j) {
        this.comUserid = j;
    }

    public final void setCommentContent(@Nullable String str) {
        this.commentContent = str;
    }

    public final void setCommentId(long j) {
        this.commentId = j;
    }

    public final void setPraise(boolean z) {
        this.isPraise = z;
    }
}
