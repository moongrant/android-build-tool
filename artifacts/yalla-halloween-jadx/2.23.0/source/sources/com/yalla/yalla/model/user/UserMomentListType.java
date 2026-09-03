package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/user/UserMomentListType;", "", "()V", "AllType", "", "ImageType", "VideoType", "all", "Lcom/yalla/yalla/model/user/UserMomentListTypeModel;", "getAll", "()Lcom/yalla/yalla/model/user/UserMomentListTypeModel;", "image", "getImage", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, "getVideo", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserMomentListType {
    public static final int $stable = 0;
    public static final int AllType = -1;
    public static final int ImageType = 1;
    public static final int VideoType = 2;

    @NotNull
    public static final UserMomentListType INSTANCE = new UserMomentListType();

    @NotNull
    private static final UserMomentListTypeModel all = new UserMomentListTypeModel(-1, oO00OOo0.user_moment_list_type_all);

    @NotNull
    private static final UserMomentListTypeModel image = new UserMomentListTypeModel(1, oO00OOo0.user_moment_list_type_graphic);

    @NotNull
    private static final UserMomentListTypeModel video = new UserMomentListTypeModel(2, oO00OOo0.user_moment_list_type_video);

    private UserMomentListType() {
    }

    @NotNull
    public final UserMomentListTypeModel getAll() {
        return all;
    }

    @NotNull
    public final UserMomentListTypeModel getImage() {
        return image;
    }

    @NotNull
    public final UserMomentListTypeModel getVideo() {
        return video;
    }
}
