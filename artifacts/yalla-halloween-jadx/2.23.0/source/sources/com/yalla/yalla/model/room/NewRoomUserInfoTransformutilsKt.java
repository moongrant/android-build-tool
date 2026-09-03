package com.yalla.yalla.model.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"transformToModel", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "", "", "updateData", "newUserInfoModel", "Common_YallaRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewRoomUserInfoTransformutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewRoomUserInfoTransformutils.kt\ncom/yalla/yalla/model/room/NewRoomUserInfoTransformutilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1549#2:172\n1620#2,3:173\n*S KotlinDebug\n*F\n+ 1 NewRoomUserInfoTransformutils.kt\ncom/yalla/yalla/model/room/NewRoomUserInfoTransformutilsKt\n*L\n4#1:172\n4#1:173,3\n*E\n"})
public final class NewRoomUserInfoTransformutilsKt {
    @NotNull
    public static final RoomUserInfoModel transformToModel(@NotNull RoomUserInfoDTO roomUserInfoDTO) {
        Intrinsics.checkNotNullParameter(roomUserInfoDTO, "<this>");
        RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
        roomUserInfoModel.getHasMic().setValue(Boolean.valueOf(roomUserInfoDTO.getHasMic()));
        roomUserInfoModel.getMicPosition().setValue(Integer.valueOf(roomUserInfoDTO.getMicPosition()));
        roomUserInfoModel.getRoomMemberType().setValue(Integer.valueOf(roomUserInfoDTO.getRoomMemberType()));
        roomUserInfoModel.getSilenced().setValue(Boolean.valueOf(roomUserInfoDTO.getSilenced()));
        roomUserInfoModel.getRankWeek().setValue(Integer.valueOf(roomUserInfoDTO.getRankWeek()));
        roomUserInfoModel.getRankDay().setValue(Integer.valueOf(roomUserInfoDTO.getRankDay()));
        roomUserInfoModel.getPriority().setValue(Long.valueOf(roomUserInfoDTO.getPriority()));
        roomUserInfoModel.getHeaderCardId().setValue(Integer.valueOf(roomUserInfoDTO.getHeaderCardId()));
        roomUserInfoModel.getHeaderCardUrl().setValue(roomUserInfoDTO.getHeaderCardUrl());
        roomUserInfoModel.isUnLoginUser().setValue(Boolean.valueOf(roomUserInfoDTO.getIsUnLoginUser()));
        roomUserInfoModel.getVehicleId().setValue(Integer.valueOf(roomUserInfoDTO.getVehicleId()));
        roomUserInfoModel.getVehicleUrl().setValue(roomUserInfoDTO.getVehicleUrl());
        roomUserInfoModel.getVehicleSVGAUrl().setValue(roomUserInfoDTO.getVehicleSVGAUrl());
        roomUserInfoModel.isSelectedForSendHats().setValue(Boolean.valueOf(roomUserInfoDTO.getIsSelectedForSendHats()));
        roomUserInfoModel.getShowPremiumFirst().setValue(Boolean.valueOf(roomUserInfoDTO.getShowPremiumFirst()));
        roomUserInfoModel.getBubbleInfo().setValue(roomUserInfoDTO.getBubbleInfo());
        roomUserInfoModel.getBadgeState().setValue(Boolean.valueOf(roomUserInfoDTO.getBadgeState()));
        roomUserInfoModel.getMemberLevel().setValue(Integer.valueOf(roomUserInfoDTO.getMemberLevel()));
        roomUserInfoModel.getBadgeUrl().setValue(roomUserInfoDTO.getBadgeUrl());
        roomUserInfoModel.getBadgeLevelUrl().setValue(roomUserInfoDTO.getBadgeLevelUrl());
        roomUserInfoModel.isTopRank().setValue(Boolean.valueOf(roomUserInfoDTO.getIsTopRank()));
        roomUserInfoModel.isSelected().setValue(Boolean.valueOf(roomUserInfoDTO.getIsSelected()));
        roomUserInfoModel.getLasttime().setValue(Long.valueOf(roomUserInfoDTO.getLasttime()));
        roomUserInfoModel.getHeadPhotoResId().setValue(Integer.valueOf(roomUserInfoDTO.getHeadPhotoResId()));
        roomUserInfoModel.isSetting().setValue(Boolean.valueOf(roomUserInfoDTO.getIsSetting()));
        roomUserInfoModel.getDayContributeNum().setValue(Long.valueOf(roomUserInfoDTO.getDayContributeNum()));
        roomUserInfoModel.getWeekContributeNum().setValue(Long.valueOf(roomUserInfoDTO.getWeekContributeNum()));
        roomUserInfoModel.getProfileCardInfo().setValue(roomUserInfoDTO.getProfileCardInfo());
        roomUserInfoModel.getInRoomEffectsInfo().setValue(roomUserInfoDTO.getInRoomEffectsInfo());
        roomUserInfoModel.getConveneNum().setValue(Integer.valueOf(roomUserInfoDTO.getConveneNum()));
        roomUserInfoModel.getWealthBadge().setValue(roomUserInfoDTO.getWealthBadge());
        roomUserInfoModel.getWealthProfileCardImg().setValue(roomUserInfoDTO.getWealthProfileCardImg());
        roomUserInfoModel.getVoiceChangerId().setValue(Integer.valueOf(roomUserInfoDTO.getVoiceChangerId()));
        roomUserInfoModel.isInRoom().setValue(Boolean.valueOf(roomUserInfoDTO.getIsInRoom()));
        roomUserInfoModel.isShowMomentPostDialog().setValue(Boolean.valueOf(roomUserInfoDTO.getIsShowMomentPostDialog()));
        roomUserInfoModel.isFollow().setValue(Boolean.valueOf(roomUserInfoDTO.getIsFollow()));
        roomUserInfoModel.isFriend().setValue(Boolean.valueOf(roomUserInfoDTO.getIsFriend()));
        roomUserInfoModel.isBlack().setValue(Boolean.valueOf(roomUserInfoDTO.getIsBlack()));
        roomUserInfoModel.getInHeBlack().setValue(Boolean.valueOf(roomUserInfoDTO.getInHeBlack()));
        roomUserInfoModel.getMemoName().setValue(roomUserInfoDTO.getMemoName());
        roomUserInfoModel.getProfileLimit().setValue(roomUserInfoDTO.getProfileLimit());
        roomUserInfoModel.getPurview().setValue(roomUserInfoDTO.getPurview());
        roomUserInfoModel.getFriendTime().setValue(Long.valueOf(roomUserInfoDTO.getFriendTime()));
        roomUserInfoModel.getEventSubscribeTime().setValue(Long.valueOf(roomUserInfoDTO.getEventSubscribeTime()));
        roomUserInfoModel.getUserId().setValue(Long.valueOf(roomUserInfoDTO.getUserId()));
        roomUserInfoModel.getUserIdx().setValue(roomUserInfoDTO.getUserIdx());
        roomUserInfoModel.getIdLevel().setValue(Integer.valueOf(roomUserInfoDTO.getIdLevel()));
        roomUserInfoModel.getUserName().setValue(roomUserInfoDTO.getUserName());
        roomUserInfoModel.getUserHeader().setValue(roomUserInfoDTO.getUserHeader());
        roomUserInfoModel.getUserHeaderFrame().setValue(roomUserInfoDTO.getUserHeaderFrame());
        roomUserInfoModel.getBackground().setValue(roomUserInfoDTO.getBackground());
        roomUserInfoModel.getUserLevel().setValue(Integer.valueOf(roomUserInfoDTO.getUserLevel()));
        roomUserInfoModel.isBlackUser().setValue(Boolean.valueOf(roomUserInfoDTO.getIsBlackUser()));
        roomUserInfoModel.getSex().setValue(Integer.valueOf(roomUserInfoDTO.getSex()));
        roomUserInfoModel.getBio().setValue(roomUserInfoDTO.getBio());
        roomUserInfoModel.getBirthday().setValue(roomUserInfoDTO.getBirthday());
        roomUserInfoModel.getAge().setValue(Integer.valueOf(roomUserInfoDTO.getAge()));
        roomUserInfoModel.getCountryId().setValue(Integer.valueOf(roomUserInfoDTO.getCountryId()));
        roomUserInfoModel.getMedal().setValue(roomUserInfoDTO.getMedal());
        roomUserInfoModel.getVisitorNum().setValue(Integer.valueOf(roomUserInfoDTO.getVisitorNum()));
        roomUserInfoModel.getFollowedNum().setValue(Integer.valueOf(roomUserInfoDTO.getFollowedNum()));
        roomUserInfoModel.getFansNum().setValue(Integer.valueOf(roomUserInfoDTO.getFansNum()));
        roomUserInfoModel.getJoinRoomNum().setValue(Integer.valueOf(roomUserInfoDTO.getJoinRoomNum()));
        roomUserInfoModel.getRole().setValue(Integer.valueOf(roomUserInfoDTO.getRole()));
        roomUserInfoModel.getRegTime().setValue(Integer.valueOf(roomUserInfoDTO.getRegTime()));
        roomUserInfoModel.getTags().setValue(roomUserInfoDTO.getTags());
        roomUserInfoModel.isPremium().setValue(Boolean.valueOf(roomUserInfoDTO.isPremium()));
        roomUserInfoModel.getPremiumLevel().setValue(Integer.valueOf(roomUserInfoDTO.getPremiumLevel()));
        roomUserInfoModel.getVipState().setValue(Integer.valueOf(roomUserInfoDTO.getVipState()));
        roomUserInfoModel.getVipLevel().setValue(Integer.valueOf(roomUserInfoDTO.getVipLevel()));
        roomUserInfoModel.getShowVIP().setValue(Boolean.valueOf(roomUserInfoDTO.getShowVIP()));
        roomUserInfoModel.getWealthLevel().setValue(Integer.valueOf(roomUserInfoDTO.getWealthLevel()));
        roomUserInfoModel.getWealthBadgeWithBg().setValue(roomUserInfoDTO.getWealthBadgeWithBg());
        roomUserInfoModel.getCurrBadgeLv().setValue(Integer.valueOf(roomUserInfoDTO.getCurrBadgeLv()));
        return roomUserInfoModel;
    }

    @NotNull
    public static final RoomUserInfoModel updateData(@NotNull RoomUserInfoModel roomUserInfoModel, @NotNull RoomUserInfoModel newUserInfoModel) {
        Intrinsics.checkNotNullParameter(roomUserInfoModel, "<this>");
        Intrinsics.checkNotNullParameter(newUserInfoModel, "newUserInfoModel");
        roomUserInfoModel.getHasMic().setValue(newUserInfoModel.getHasMic().getValue());
        roomUserInfoModel.getMicPosition().setValue(newUserInfoModel.getMicPosition().getValue());
        roomUserInfoModel.getRoomMemberType().setValue(newUserInfoModel.getRoomMemberType().getValue());
        roomUserInfoModel.getSilenced().setValue(newUserInfoModel.getSilenced().getValue());
        roomUserInfoModel.getRankWeek().setValue(newUserInfoModel.getRankWeek().getValue());
        roomUserInfoModel.getRankDay().setValue(newUserInfoModel.getRankDay().getValue());
        roomUserInfoModel.getPriority().setValue(newUserInfoModel.getPriority().getValue());
        roomUserInfoModel.getHeaderCardId().setValue(newUserInfoModel.getHeaderCardId().getValue());
        roomUserInfoModel.getHeaderCardUrl().setValue(newUserInfoModel.getHeaderCardUrl().getValue());
        roomUserInfoModel.isUnLoginUser().setValue(newUserInfoModel.isUnLoginUser().getValue());
        roomUserInfoModel.getVehicleId().setValue(newUserInfoModel.getVehicleId().getValue());
        roomUserInfoModel.getVehicleUrl().setValue(newUserInfoModel.getVehicleUrl().getValue());
        roomUserInfoModel.getVehicleSVGAUrl().setValue(newUserInfoModel.getVehicleSVGAUrl().getValue());
        roomUserInfoModel.isSelectedForSendHats().setValue(newUserInfoModel.isSelectedForSendHats().getValue());
        roomUserInfoModel.getShowPremiumFirst().setValue(newUserInfoModel.getShowPremiumFirst().getValue());
        roomUserInfoModel.getBubbleInfo().setValue(newUserInfoModel.getBubbleInfo().getValue());
        roomUserInfoModel.getBadgeState().setValue(newUserInfoModel.getBadgeState().getValue());
        roomUserInfoModel.getMemberLevel().setValue(newUserInfoModel.getMemberLevel().getValue());
        roomUserInfoModel.getBadgeUrl().setValue(newUserInfoModel.getBadgeUrl().getValue());
        roomUserInfoModel.getBadgeLevelUrl().setValue(newUserInfoModel.getBadgeLevelUrl().getValue());
        roomUserInfoModel.isTopRank().setValue(newUserInfoModel.isTopRank().getValue());
        roomUserInfoModel.isSelected().setValue(newUserInfoModel.isSelected().getValue());
        roomUserInfoModel.getLasttime().setValue(newUserInfoModel.getLasttime().getValue());
        roomUserInfoModel.getHeadPhotoResId().setValue(newUserInfoModel.getHeadPhotoResId().getValue());
        roomUserInfoModel.isSetting().setValue(newUserInfoModel.isSetting().getValue());
        roomUserInfoModel.getDayContributeNum().setValue(newUserInfoModel.getDayContributeNum().getValue());
        roomUserInfoModel.getWeekContributeNum().setValue(newUserInfoModel.getWeekContributeNum().getValue());
        roomUserInfoModel.getProfileCardInfo().setValue(newUserInfoModel.getProfileCardInfo().getValue());
        roomUserInfoModel.getInRoomEffectsInfo().setValue(newUserInfoModel.getInRoomEffectsInfo().getValue());
        roomUserInfoModel.getConveneNum().setValue(newUserInfoModel.getConveneNum().getValue());
        roomUserInfoModel.getWealthBadge().setValue(newUserInfoModel.getWealthBadge().getValue());
        roomUserInfoModel.getWealthProfileCardImg().setValue(newUserInfoModel.getWealthProfileCardImg().getValue());
        roomUserInfoModel.getVoiceChangerId().setValue(newUserInfoModel.getVoiceChangerId().getValue());
        roomUserInfoModel.isInRoom().setValue(newUserInfoModel.isInRoom().getValue());
        roomUserInfoModel.isShowMomentPostDialog().setValue(newUserInfoModel.isShowMomentPostDialog().getValue());
        roomUserInfoModel.isFollow().setValue(newUserInfoModel.isFollow().getValue());
        roomUserInfoModel.isFriend().setValue(newUserInfoModel.isFriend().getValue());
        roomUserInfoModel.isBlack().setValue(newUserInfoModel.isBlack().getValue());
        roomUserInfoModel.getInHeBlack().setValue(newUserInfoModel.getInHeBlack().getValue());
        roomUserInfoModel.getMemoName().setValue(newUserInfoModel.getMemoName().getValue());
        roomUserInfoModel.getProfileLimit().setValue(newUserInfoModel.getProfileLimit().getValue());
        roomUserInfoModel.getPurview().setValue(newUserInfoModel.getPurview().getValue());
        roomUserInfoModel.getFriendTime().setValue(newUserInfoModel.getFriendTime().getValue());
        roomUserInfoModel.getEventSubscribeTime().setValue(newUserInfoModel.getEventSubscribeTime().getValue());
        roomUserInfoModel.getUserId().setValue(newUserInfoModel.getUserId().getValue());
        roomUserInfoModel.getUserIdx().setValue(newUserInfoModel.getUserIdx().getValue());
        roomUserInfoModel.getIdLevel().setValue(newUserInfoModel.getIdLevel().getValue());
        roomUserInfoModel.getUserName().setValue(newUserInfoModel.getUserName().getValue());
        roomUserInfoModel.getUserHeader().setValue(newUserInfoModel.getUserHeader().getValue());
        roomUserInfoModel.getUserHeaderFrame().setValue(newUserInfoModel.getUserHeaderFrame().getValue());
        roomUserInfoModel.getBackground().setValue(newUserInfoModel.getBackground().getValue());
        roomUserInfoModel.getUserLevel().setValue(newUserInfoModel.getUserLevel().getValue());
        roomUserInfoModel.isBlackUser().setValue(newUserInfoModel.isBlackUser().getValue());
        roomUserInfoModel.getSex().setValue(newUserInfoModel.getSex().getValue());
        roomUserInfoModel.getBio().setValue(newUserInfoModel.getBio().getValue());
        roomUserInfoModel.getBirthday().setValue(newUserInfoModel.getBirthday().getValue());
        roomUserInfoModel.getAge().setValue(newUserInfoModel.getAge().getValue());
        roomUserInfoModel.getCountryId().setValue(newUserInfoModel.getCountryId().getValue());
        roomUserInfoModel.getMedal().setValue(newUserInfoModel.getMedal().getValue());
        roomUserInfoModel.getVisitorNum().setValue(newUserInfoModel.getVisitorNum().getValue());
        roomUserInfoModel.getFollowedNum().setValue(newUserInfoModel.getFollowedNum().getValue());
        roomUserInfoModel.getFansNum().setValue(newUserInfoModel.getFansNum().getValue());
        roomUserInfoModel.getJoinRoomNum().setValue(newUserInfoModel.getJoinRoomNum().getValue());
        roomUserInfoModel.getRole().setValue(newUserInfoModel.getRole().getValue());
        roomUserInfoModel.getRegTime().setValue(newUserInfoModel.getRegTime().getValue());
        roomUserInfoModel.getTags().setValue(newUserInfoModel.getTags().getValue());
        roomUserInfoModel.isPremium().setValue(newUserInfoModel.isPremium().getValue());
        roomUserInfoModel.getPremiumLevel().setValue(newUserInfoModel.getPremiumLevel().getValue());
        roomUserInfoModel.getVipState().setValue(newUserInfoModel.getVipState().getValue());
        roomUserInfoModel.getVipLevel().setValue(newUserInfoModel.getVipLevel().getValue());
        roomUserInfoModel.getShowVIP().setValue(newUserInfoModel.getShowVIP().getValue());
        roomUserInfoModel.getWealthLevel().setValue(newUserInfoModel.getWealthLevel().getValue());
        roomUserInfoModel.getWealthBadgeWithBg().setValue(newUserInfoModel.getWealthBadgeWithBg().getValue());
        roomUserInfoModel.getCurrBadgeLv().setValue(newUserInfoModel.getCurrBadgeLv().getValue());
        return roomUserInfoModel;
    }

    @NotNull
    public static final List<RoomUserInfoModel> transformToModel(@NotNull List<? extends RoomUserInfoDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transformToModel((RoomUserInfoDTO) it.next()));
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }
}
