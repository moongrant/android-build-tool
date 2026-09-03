package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.GiveThemeModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.ShareActivityModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yalla/yalla/common/model/ShareToFriendModel;", "Ljava/io/Serializable;", "type", "Lcom/yalla/yalla/common/model/ShareType;", "(Lcom/yalla/yalla/common/model/ShareType;)V", "eventModel", "Lcom/yalla/yalla/model/EventModel;", "getEventModel", "()Lcom/yalla/yalla/model/EventModel;", "setEventModel", "(Lcom/yalla/yalla/model/EventModel;)V", "giveThemeModel", "Lcom/yalla/yalla/model/GiveThemeModel;", "getGiveThemeModel", "()Lcom/yalla/yalla/model/GiveThemeModel;", "setGiveThemeModel", "(Lcom/yalla/yalla/model/GiveThemeModel;)V", "momentAdapterTag", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "getMomentAdapterTag", "()Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "setMomentAdapterTag", "(Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;)V", "postDetailModel", "Lcom/yalla/yalla/model/MomentDetailModel;", "getPostDetailModel", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setPostDetailModel", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "shareActivityModel", "Lcom/yalla/yalla/model/ShareActivityModel;", "getShareActivityModel", "()Lcom/yalla/yalla/model/ShareActivityModel;", "setShareActivityModel", "(Lcom/yalla/yalla/model/ShareActivityModel;)V", "topicInfoModel", "Lcom/yalla/yalla/model/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/TopicInfoModel;)V", "getType", "()Lcom/yalla/yalla/common/model/ShareType;", "userInfoModel", "Lcom/yalla/yalla/common/model/UserInfoModel;", "getUserInfoModel", "()Lcom/yalla/yalla/common/model/UserInfoModel;", "setUserInfoModel", "(Lcom/yalla/yalla/common/model/UserInfoModel;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShareToFriendModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private EventModel eventModel;

    @Nullable
    private GiveThemeModel giveThemeModel;

    @Nullable
    private MomentAdapterTag momentAdapterTag;

    @Nullable
    private MomentDetailModel postDetailModel;

    @Nullable
    private ShareActivityModel shareActivityModel;

    @Nullable
    private TopicInfoModel topicInfoModel;

    @NotNull
    private final ShareType type;

    @Nullable
    private UserInfoModel userInfoModel;

    public ShareToFriendModel(@NotNull ShareType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Nullable
    public final EventModel getEventModel() {
        return this.eventModel;
    }

    @Nullable
    public final GiveThemeModel getGiveThemeModel() {
        return this.giveThemeModel;
    }

    @Nullable
    public final MomentAdapterTag getMomentAdapterTag() {
        return this.momentAdapterTag;
    }

    @Nullable
    public final MomentDetailModel getPostDetailModel() {
        return this.postDetailModel;
    }

    @Nullable
    public final ShareActivityModel getShareActivityModel() {
        return this.shareActivityModel;
    }

    @Nullable
    public final TopicInfoModel getTopicInfoModel() {
        return this.topicInfoModel;
    }

    @NotNull
    public final ShareType getType() {
        return this.type;
    }

    @Nullable
    public final UserInfoModel getUserInfoModel() {
        return this.userInfoModel;
    }

    public final void setEventModel(@Nullable EventModel eventModel) {
        this.eventModel = eventModel;
    }

    public final void setGiveThemeModel(@Nullable GiveThemeModel giveThemeModel) {
        this.giveThemeModel = giveThemeModel;
    }

    public final void setMomentAdapterTag(@Nullable MomentAdapterTag momentAdapterTag) {
        this.momentAdapterTag = momentAdapterTag;
    }

    public final void setPostDetailModel(@Nullable MomentDetailModel momentDetailModel) {
        this.postDetailModel = momentDetailModel;
    }

    public final void setShareActivityModel(@Nullable ShareActivityModel shareActivityModel) {
        this.shareActivityModel = shareActivityModel;
    }

    public final void setTopicInfoModel(@Nullable TopicInfoModel topicInfoModel) {
        this.topicInfoModel = topicInfoModel;
    }

    public final void setUserInfoModel(@Nullable UserInfoModel userInfoModel) {
        this.userInfoModel = userInfoModel;
    }
}
