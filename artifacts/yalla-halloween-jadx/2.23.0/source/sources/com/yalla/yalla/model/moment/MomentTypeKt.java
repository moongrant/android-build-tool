package com.yalla.yalla.model.moment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isSupportMomentType", "", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "Common_YallaRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MomentTypeKt {
    public static final boolean isSupportMomentType(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        int type = momentDetailModel.getType();
        return ((((((((type == MomentType.Text.getValue() || type == MomentType.Image.getValue()) || type == MomentType.Forward.getValue()) || type == MomentType.Share.getValue()) || type == MomentType.YallaTeam.getValue()) || type == MomentType.Topic.getValue()) || type == MomentType.Video.getValue()) || type == MomentType.Event.getValue()) || type == MomentType.Poll.getValue()) || type == MomentType.YallaChatGroup.getValue();
    }
}
