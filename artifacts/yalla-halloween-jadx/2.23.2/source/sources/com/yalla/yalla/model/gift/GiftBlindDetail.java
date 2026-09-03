package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006%"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBlindDetail;", "Ljava/io/Serializable;", "()V", "blindBoxUrl", "", "getBlindBoxUrl", "()Ljava/lang/String;", "setBlindBoxUrl", "(Ljava/lang/String;)V", "level", "", "getLevel", "()I", "setLevel", "(I)V", "localGiftBlindId", "", "getLocalGiftBlindId", "()J", "setLocalGiftBlindId", "(J)V", "shopType", "getShopType", "setShopType", "task", "Lcom/yalla/yalla/model/gift/GiftBlindTask;", "getTask", "()Lcom/yalla/yalla/model/gift/GiftBlindTask;", "setTask", "(Lcom/yalla/yalla/model/gift/GiftBlindTask;)V", "type", "getType", "setType", "isFullScreen", "", "isNewType", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GiftBlindDetail implements Serializable {

    @NotNull
    private String blindBoxUrl = "";
    private int level;
    private long localGiftBlindId;
    private int shopType;

    @Nullable
    private GiftBlindTask task;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int TYPE_NEW = 1;
    private static final int TYPE_OLD = 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBlindDetail$Companion;", "", "()V", "TYPE_NEW", "", "getTYPE_NEW", "()I", "TYPE_OLD", "getTYPE_OLD", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTYPE_NEW() {
            return GiftBlindDetail.TYPE_NEW;
        }

        public final int getTYPE_OLD() {
            return GiftBlindDetail.TYPE_OLD;
        }
    }

    @NotNull
    public final String getBlindBoxUrl() {
        return this.blindBoxUrl;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getLocalGiftBlindId() {
        return this.localGiftBlindId;
    }

    public final int getShopType() {
        return this.shopType;
    }

    @Nullable
    public final GiftBlindTask getTask() {
        return this.task;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isFullScreen() {
        return this.shopType == 1;
    }

    public final boolean isNewType() {
        return this.type == TYPE_NEW;
    }

    public final void setBlindBoxUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blindBoxUrl = str;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setLocalGiftBlindId(long j) {
        this.localGiftBlindId = j;
    }

    public final void setShopType(int i) {
        this.shopType = i;
    }

    public final void setTask(@Nullable GiftBlindTask giftBlindTask) {
        this.task = giftBlindTask;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
