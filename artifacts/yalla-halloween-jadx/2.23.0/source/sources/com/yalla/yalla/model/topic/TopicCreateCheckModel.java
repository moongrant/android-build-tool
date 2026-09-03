package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicCreateCheckModel;", "", "topicState", "Lcom/yalla/yalla/model/topic/TopicState;", "regTime", "", "userLevel", "keepLaw", "(Lcom/yalla/yalla/model/topic/TopicState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getKeepLaw", "()Ljava/lang/Integer;", "setKeepLaw", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRegTime", "setRegTime", "getTopicState", "()Lcom/yalla/yalla/model/topic/TopicState;", "setTopicState", "(Lcom/yalla/yalla/model/topic/TopicState;)V", "getUserLevel", "setUserLevel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicCreateCheckModel {
    public static final int $stable = 8;

    @Nullable
    private Integer keepLaw;

    @Nullable
    private Integer regTime;

    @NotNull
    private TopicState topicState;

    @Nullable
    private Integer userLevel;

    public TopicCreateCheckModel() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final Integer getKeepLaw() {
        return this.keepLaw;
    }

    @Nullable
    public final Integer getRegTime() {
        return this.regTime;
    }

    @NotNull
    public final TopicState getTopicState() {
        return this.topicState;
    }

    @Nullable
    public final Integer getUserLevel() {
        return this.userLevel;
    }

    public final void setKeepLaw(@Nullable Integer num) {
        this.keepLaw = num;
    }

    public final void setRegTime(@Nullable Integer num) {
        this.regTime = num;
    }

    public final void setTopicState(@NotNull TopicState topicState) {
        Intrinsics.checkNotNullParameter(topicState, "<set-?>");
        this.topicState = topicState;
    }

    public final void setUserLevel(@Nullable Integer num) {
        this.userLevel = num;
    }

    public TopicCreateCheckModel(@NotNull TopicState topicState, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(topicState, "topicState");
        this.topicState = topicState;
        this.regTime = num;
        this.userLevel = num2;
        this.keepLaw = num3;
    }

    public /* synthetic */ TopicCreateCheckModel(TopicState topicState, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TopicState.NULL : topicState, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0 : num3);
    }
}
