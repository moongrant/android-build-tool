package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.message.MessageModelHeadType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/model/SystemConversationModel;", "", "type", "Lcom/app/base/adapter/message/MessageModelHeadType;", "(Lcom/app/base/adapter/message/MessageModelHeadType;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "targetUserId", "", "getTargetUserId", "()J", "setTargetUserId", "(J)V", "time", "getTime", "setTime", "getType", "()Lcom/app/base/adapter/message/MessageModelHeadType;", "setType", "unReadCount", "", "getUnReadCount", "()I", "setUnReadCount", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SystemConversationModel {
    public static final int $stable = 8;

    @NotNull
    private String content;
    private long targetUserId;
    private long time;

    @NotNull
    private MessageModelHeadType type;
    private int unReadCount;

    public SystemConversationModel(@NotNull MessageModelHeadType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.content = "";
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getTargetUserId() {
        return this.targetUserId;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final MessageModelHeadType getType() {
        return this.type;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setTargetUserId(long j) {
        this.targetUserId = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setType(@NotNull MessageModelHeadType messageModelHeadType) {
        Intrinsics.checkNotNullParameter(messageModelHeadType, "<set-?>");
        this.type = messageModelHeadType;
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }
}
