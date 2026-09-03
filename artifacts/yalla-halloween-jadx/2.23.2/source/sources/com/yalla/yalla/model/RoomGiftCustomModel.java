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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u000e\u0012\b\u0012\u00060\u000bR\u00020\u0000\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftCustomModel;", "", "()V", "customHideInfo", "", "", "getCustomHideInfo", "()Ljava/util/List;", "setCustomHideInfo", "(Ljava/util/List;)V", "customShowAvatarInfo", "Lcom/yalla/yalla/model/RoomGiftCustomModel$CustomShowAvatarInfoDTO;", "getCustomShowAvatarInfo", "setCustomShowAvatarInfo", "customSkinUrl", "getCustomSkinUrl", "()Ljava/lang/String;", "setCustomSkinUrl", "(Ljava/lang/String;)V", "transformToGiftPlayReplaceInfo", "Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo;", "CustomShowAvatarInfoDTO", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomGiftModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftCustomModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n1855#2,2:415\n*S KotlinDebug\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftCustomModel\n*L\n365#1:415,2\n*E\n"})
public final class RoomGiftCustomModel {
    public static final int $stable = 8;

    @SerializedName("customHideInfo")
    @Nullable
    private List<String> customHideInfo;

    @SerializedName("customShowAvatarInfo")
    @Nullable
    private List<CustomShowAvatarInfoDTO> customShowAvatarInfo;

    @SerializedName("customSkinUrl")
    @Nullable
    private String customSkinUrl;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftCustomModel$CustomShowAvatarInfoDTO;", "", "(Lcom/yalla/yalla/model/RoomGiftCustomModel;)V", "headPhoto", "", "getHeadPhoto", "()Ljava/lang/String;", "setHeadPhoto", "(Ljava/lang/String;)V", "position", "getPosition", "setPosition", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class CustomShowAvatarInfoDTO {

        @SerializedName("headPhoto")
        @Nullable
        private String headPhoto;

        @SerializedName("position")
        @Nullable
        private String position;

        public CustomShowAvatarInfoDTO() {
        }

        @Nullable
        public final String getHeadPhoto() {
            return this.headPhoto;
        }

        @Nullable
        public final String getPosition() {
            return this.position;
        }

        public final void setHeadPhoto(@Nullable String str) {
            this.headPhoto = str;
        }

        public final void setPosition(@Nullable String str) {
            this.position = str;
        }
    }

    @Nullable
    public final List<String> getCustomHideInfo() {
        return this.customHideInfo;
    }

    @Nullable
    public final List<CustomShowAvatarInfoDTO> getCustomShowAvatarInfo() {
        return this.customShowAvatarInfo;
    }

    @Nullable
    public final String getCustomSkinUrl() {
        return this.customSkinUrl;
    }

    public final void setCustomHideInfo(@Nullable List<String> list) {
        this.customHideInfo = list;
    }

    public final void setCustomShowAvatarInfo(@Nullable List<CustomShowAvatarInfoDTO> list) {
        this.customShowAvatarInfo = list;
    }

    public final void setCustomSkinUrl(@Nullable String str) {
        this.customSkinUrl = str;
    }

    @NotNull
    public final GiftPlayReplaceInfo transformToGiftPlayReplaceInfo() {
        GiftPlayReplaceInfo giftPlayReplaceInfo = new GiftPlayReplaceInfo();
        List<CustomShowAvatarInfoDTO> list = this.customShowAvatarInfo;
        if (list != null) {
            for (CustomShowAvatarInfoDTO customShowAvatarInfoDTO : list) {
                giftPlayReplaceInfo.getReplaceImageInfoList().add(new GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo(customShowAvatarInfoDTO.getPosition(), customShowAvatarInfoDTO.getHeadPhoto()));
            }
        }
        List<String> list2 = this.customHideInfo;
        if (list2 != null) {
            giftPlayReplaceInfo.getCustomHideInfo().addAll(list2);
        }
        return giftPlayReplaceInfo;
    }
}
