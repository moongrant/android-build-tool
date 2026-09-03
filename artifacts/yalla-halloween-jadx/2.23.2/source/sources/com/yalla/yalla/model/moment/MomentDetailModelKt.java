package com.yalla.yalla.model.moment;

import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentSelectMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002¨\u0006\u000b"}, d2 = {"cloneData", "", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "data", "commentNumAdd", "commentNumDelete", "editVideoToLocalModel", "", "Lcom/yalla/yalla/model/MomentSelectMedia;", "getVideoInfo", "Lcom/yalla/yalla/model/moment/MomentImageModel;", "Common_YallaRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MomentDetailModelKt {
    public static final void cloneData(@Nullable MomentDetailModel momentDetailModel, @Nullable MomentDetailModel momentDetailModel2) {
        if (momentDetailModel == null || momentDetailModel2 == null || momentDetailModel.getId() != momentDetailModel2.getId()) {
            return;
        }
        momentDetailModel.setUserId(momentDetailModel2.getUserId());
        momentDetailModel.setNickName(momentDetailModel2.getNickName());
        momentDetailModel.setHeadUrl(momentDetailModel2.getHeadUrl());
        momentDetailModel.setSex(momentDetailModel2.getSex());
        momentDetailModel.setNVipLv(momentDetailModel2.getNVipLv());
        momentDetailModel.setVIP(momentDetailModel2.getIsVIP());
        momentDetailModel.setKaVipLv(momentDetailModel2.getKaVipLv());
        momentDetailModel.setKaVipState(momentDetailModel2.getKaVipState());
        momentDetailModel.setAddress(momentDetailModel2.getAddress());
        momentDetailModel.setCreateTime(momentDetailModel2.getCreateTime());
        momentDetailModel.setType(momentDetailModel2.getType());
        momentDetailModel.setSourcesId(momentDetailModel2.getSourcesId());
        momentDetailModel.setPraiseNum(momentDetailModel2.getPraiseNum());
        momentDetailModel.setCommentNum(momentDetailModel2.getCommentNum());
        momentDetailModel.setPower(momentDetailModel2.getPower());
        momentDetailModel.setPraise(momentDetailModel2.isPraise());
        momentDetailModel.setFriend(momentDetailModel2.getIsFriend());
        momentDetailModel.setPFName(momentDetailModel2.getPFName());
        momentDetailModel.setPNumber(momentDetailModel2.getPNumber());
        momentDetailModel.setSize(momentDetailModel2.getSize());
        momentDetailModel.setForward(momentDetailModel2.getIsForward());
        momentDetailModel.setFeatured(momentDetailModel2.getIsFeatured());
        momentDetailModel.setMedal(momentDetailModel2.getMedal());
        momentDetailModel.setForwardType(momentDetailModel2.getForwardType());
        momentDetailModel.setRole(momentDetailModel2.getRole());
        momentDetailModel.setWaterMark(momentDetailModel2.getIsWaterMark());
        momentDetailModel.setUserIdx(momentDetailModel2.getUserIdx());
        momentDetailModel.setTotalPropValue(momentDetailModel2.getTotalPropValue());
        momentDetailModel.setSendPropUsers(momentDetailModel2.getSendPropUsers());
        momentDetailModel.setDeleteType(momentDetailModel2.getDeleteType());
        momentDetailModel.setInRoom(momentDetailModel2.isInRoom());
        momentDetailModel.setAdData(momentDetailModel2.getAdData());
        momentDetailModel.setFollow(momentDetailModel2.isFollow());
        momentDetailModel.setTop(momentDetailModel2.isTop());
        momentDetailModel.setComment(momentDetailModel2.getComment());
        momentDetailModel.setEdited(momentDetailModel2.getIsEdited());
        momentDetailModel.setCanEdit(momentDetailModel2.getIsCanEdit());
        momentDetailModel.setCanDel(momentDetailModel2.getIsCanDel());
        momentDetailModel.setCanShare(momentDetailModel2.getIsCanShare());
        momentDetailModel.setCanReport(momentDetailModel2.getIsCanReport());
        momentDetailModel.setCanTop(momentDetailModel2.getIsCanTop());
        momentDetailModel.setWealthLevel(momentDetailModel2.getWealthLevel());
        momentDetailModel.setWealthBadgeImage(momentDetailModel2.getWealthBadgeImage());
        momentDetailModel.setPlayNum(momentDetailModel2.getPlayNum());
        momentDetailModel.setShareNum(momentDetailModel2.getShareNum());
        momentDetailModel.setState(momentDetailModel2.getState());
        momentDetailModel.setContent(momentDetailModel2.getContent());
        momentDetailModel.setForward(momentDetailModel2.getForward());
        momentDetailModel.setVideoUrl(momentDetailModel2.getVideoUrl());
        momentDetailModel.setVideoSize(momentDetailModel2.getVideoSize());
        momentDetailModel.setCoverPic(momentDetailModel2.getCoverPic());
        momentDetailModel.setVideoDuration(momentDetailModel2.getVideoDuration());
        momentDetailModel.setSendPostModel(momentDetailModel2.getSendPostModel());
        momentDetailModel.setPositionid(momentDetailModel2.getPositionid());
        momentDetailModel.setCircleDisbanded(momentDetailModel2.getCircleDisbanded());
        momentDetailModel.setIsblack(momentDetailModel2.getIsblack());
        momentDetailModel.setInHeBlack(momentDetailModel2.getIsInHeBlack());
    }

    public static final void commentNumAdd(@Nullable MomentDetailModel momentDetailModel) {
        if (momentDetailModel != null) {
            momentDetailModel.setCommentNum(momentDetailModel.getCommentNum() + 1);
        }
    }

    public static final void commentNumDelete(@Nullable MomentDetailModel momentDetailModel) {
        if (momentDetailModel != null) {
            momentDetailModel.setCommentNum(momentDetailModel.getCommentNum() - 1);
            if (momentDetailModel.getCommentNum() < 0) {
                momentDetailModel.setCommentNum(0L);
            }
        }
    }

    @NotNull
    public static final List<MomentSelectMedia> editVideoToLocalModel(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        ArrayList arrayList = new ArrayList();
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) momentDetailModel.getVideoSize(), new String[]{"*"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() > 1) {
            MomentSelectMedia momentSelectMedia = new MomentSelectMedia(momentDetailModel.getVideoUrl());
            momentSelectMedia.setDuration(((long) momentDetailModel.getVideoDuration()) * 1000);
            momentSelectMedia.setWidth(o0OoOo0.OooO0o(0, (String) listSplit$default.get(0)));
            momentSelectMedia.setHeight(o0OoOo0.OooO0o(0, (String) listSplit$default.get(1)));
            arrayList.add(momentSelectMedia);
        }
        return arrayList;
    }

    @Nullable
    public static final MomentImageModel getVideoInfo(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        if (!(momentDetailModel.getVideoUrl().length() == 0)) {
            if (!(momentDetailModel.getVideoSize().length() == 0)) {
                MomentImageModel momentImageModel = new MomentImageModel(momentDetailModel.getVideoUrl());
                momentImageModel.setDuration(((long) momentDetailModel.getVideoDuration()) * 1000);
                momentImageModel.setSize(momentDetailModel.getVideoSize());
                return momentImageModel;
            }
        }
        return null;
    }
}
