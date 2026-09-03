package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBlindTask;", "", "()V", "optionType", "", "getOptionType", "()I", "setOptionType", "(I)V", "rewardImage", "", "getRewardImage", "()Ljava/lang/String;", "setRewardImage", "(Ljava/lang/String;)V", "sendPropId", "", "getSendPropId", "()J", "setSendPropId", "(J)V", "sendPropImage", "getSendPropImage", "setSendPropImage", "targetCount", "getTargetCount", "setTargetCount", "taskId", "getTaskId", "setTaskId", "type", "getType", "setType", "isTaskEveryday", "", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GiftBlindTask {
    private int optionType;
    private long sendPropId;
    private int targetCount;
    private long taskId;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int TYPE_EVERYDAY = 1;
    private static final int TYPE_REPEAT = 2;
    private static final int OptionType_Get = 1;
    private static final int OptionType_Send = 2;

    @NotNull
    private String rewardImage = "";

    @NotNull
    private String sendPropImage = "";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBlindTask$Companion;", "", "()V", "OptionType_Get", "", "getOptionType_Get", "()I", "OptionType_Send", "getOptionType_Send", "TYPE_EVERYDAY", "getTYPE_EVERYDAY", "TYPE_REPEAT", "getTYPE_REPEAT", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getOptionType_Get() {
            return GiftBlindTask.OptionType_Get;
        }

        public final int getOptionType_Send() {
            return GiftBlindTask.OptionType_Send;
        }

        public final int getTYPE_EVERYDAY() {
            return GiftBlindTask.TYPE_EVERYDAY;
        }

        public final int getTYPE_REPEAT() {
            return GiftBlindTask.TYPE_REPEAT;
        }
    }

    public final int getOptionType() {
        return this.optionType;
    }

    @NotNull
    public final String getRewardImage() {
        return this.rewardImage;
    }

    public final long getSendPropId() {
        return this.sendPropId;
    }

    @NotNull
    public final String getSendPropImage() {
        return this.sendPropImage;
    }

    public final int getTargetCount() {
        return this.targetCount;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isTaskEveryday() {
        return this.type == TYPE_EVERYDAY;
    }

    public final void setOptionType(int i) {
        this.optionType = i;
    }

    public final void setRewardImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardImage = str;
    }

    public final void setSendPropId(long j) {
        this.sendPropId = j;
    }

    public final void setSendPropImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sendPropImage = str;
    }

    public final void setTargetCount(int i) {
        this.targetCount = i;
    }

    public final void setTaskId(long j) {
        this.taskId = j;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
