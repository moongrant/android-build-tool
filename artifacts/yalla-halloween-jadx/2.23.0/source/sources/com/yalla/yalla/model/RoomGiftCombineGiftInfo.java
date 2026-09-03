package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\u000e\u0012\b\u0012\u00060\nR\u00020\u0000\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u000e\u0012\b\u0012\u00060\nR\u00020\u0000\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo;", "", "()V", "isSound", "", "()I", "setSound", "(I)V", "replaceImageInfo", "", "Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo$CombineGiftInfoReplaceInfo;", "getReplaceImageInfo", "()Ljava/util/List;", "setReplaceImageInfo", "(Ljava/util/List;)V", "replaceTextInfo", "getReplaceTextInfo", "setReplaceTextInfo", "transformToGiftPlayReplaceInfo", "Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo;", "CombineGiftInfoReplaceInfo", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomGiftModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftCombineGiftInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n1855#2,2:415\n1855#2,2:417\n*S KotlinDebug\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftCombineGiftInfo\n*L\n402#1:415,2\n406#1:417,2\n*E\n"})
public final class RoomGiftCombineGiftInfo {
    public static final int $stable = 8;

    @SerializedName("isSound")
    private int isSound;

    @SerializedName("replaceImageInfo")
    @Nullable
    private List<CombineGiftInfoReplaceInfo> replaceImageInfo;

    @SerializedName("replaceTextInfo")
    @Nullable
    private List<CombineGiftInfoReplaceInfo> replaceTextInfo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo$CombineGiftInfoReplaceInfo;", "", "(Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "position", "getPosition", "setPosition", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CombineGiftInfoReplaceInfo {

        @SerializedName("content")
        @Nullable
        private String content;

        @SerializedName("position")
        @Nullable
        private String position;

        public CombineGiftInfoReplaceInfo() {
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getPosition() {
            return this.position;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setPosition(@Nullable String str) {
            this.position = str;
        }
    }

    @Nullable
    public final List<CombineGiftInfoReplaceInfo> getReplaceImageInfo() {
        return this.replaceImageInfo;
    }

    @Nullable
    public final List<CombineGiftInfoReplaceInfo> getReplaceTextInfo() {
        return this.replaceTextInfo;
    }

    /* JADX INFO: renamed from: isSound, reason: from getter */
    public final int getIsSound() {
        return this.isSound;
    }

    public final void setReplaceImageInfo(@Nullable List<CombineGiftInfoReplaceInfo> list) {
        this.replaceImageInfo = list;
    }

    public final void setReplaceTextInfo(@Nullable List<CombineGiftInfoReplaceInfo> list) {
        this.replaceTextInfo = list;
    }

    public final void setSound(int i) {
        this.isSound = i;
    }

    @NotNull
    public final GiftPlayReplaceInfo transformToGiftPlayReplaceInfo() {
        GiftPlayReplaceInfo giftPlayReplaceInfo = new GiftPlayReplaceInfo();
        List<CombineGiftInfoReplaceInfo> list = this.replaceImageInfo;
        if (list != null) {
            for (CombineGiftInfoReplaceInfo combineGiftInfoReplaceInfo : list) {
                giftPlayReplaceInfo.getReplaceImageInfoList().add(new GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo(combineGiftInfoReplaceInfo.getPosition(), combineGiftInfoReplaceInfo.getContent()));
            }
        }
        List<CombineGiftInfoReplaceInfo> list2 = this.replaceTextInfo;
        if (list2 != null) {
            for (CombineGiftInfoReplaceInfo combineGiftInfoReplaceInfo2 : list2) {
                giftPlayReplaceInfo.getReplaceTextInfoList().add(new GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo(combineGiftInfoReplaceInfo2.getPosition(), combineGiftInfoReplaceInfo2.getContent()));
            }
        }
        return giftPlayReplaceInfo;
    }
}
