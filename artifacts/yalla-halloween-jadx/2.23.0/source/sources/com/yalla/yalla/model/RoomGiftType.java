package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftType;", "", "()V", "ALL_GIFT_ANSWER", "", "ALL_GIFT_IN_MIC", "ALL_GIFT_OTHER", "ALL_GIFT_RECEIVER", "GIFT_Blind", "GIFT_CUSTOM_MADE", "ONE_GIFT_ANSWER", "ONE_GIFT_OTHER", "ONE_GIFT_RECEIVER", "BlindBoxType", "EnvelopFlagType", "MoraFlagType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomGiftType {
    public static final int $stable = 0;
    public static final int ALL_GIFT_ANSWER = 71;
    public static final int ALL_GIFT_IN_MIC = 8;
    public static final int ALL_GIFT_OTHER = 72;
    public static final int ALL_GIFT_RECEIVER = 7;
    public static final int GIFT_Blind = 81;
    public static final int GIFT_CUSTOM_MADE = 92;

    @NotNull
    public static final RoomGiftType INSTANCE = new RoomGiftType();
    public static final int ONE_GIFT_ANSWER = 61;
    public static final int ONE_GIFT_OTHER = 62;
    public static final int ONE_GIFT_RECEIVER = 6;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftType$BlindBoxType;", "", "()V", "Primary", "", "Senior", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BlindBoxType {
        public static final int $stable = 0;

        @NotNull
        public static final BlindBoxType INSTANCE = new BlindBoxType();
        public static final int Primary = 1;
        public static final int Senior = 10;

        private BlindBoxType() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftType$EnvelopFlagType;", "", "()V", "ordinary", "", "redEnvelope", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EnvelopFlagType {
        public static final int $stable = 0;

        @NotNull
        public static final EnvelopFlagType INSTANCE = new EnvelopFlagType();
        public static final int ordinary = 0;
        public static final int redEnvelope = 1;

        private EnvelopFlagType() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftType$MoraFlagType;", "", "()V", "guessingGame", "", "ordinary", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MoraFlagType {
        public static final int $stable = 0;

        @NotNull
        public static final MoraFlagType INSTANCE = new MoraFlagType();
        public static final int guessingGame = 1;
        public static final int ordinary = 0;

        private MoraFlagType() {
        }
    }

    private RoomGiftType() {
    }
}
