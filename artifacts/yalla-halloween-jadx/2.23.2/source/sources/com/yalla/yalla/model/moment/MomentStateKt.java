package com.yalla.yalla.model.moment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isApprovedState", "", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "isSystemDelete", "isUnderReview", "Common_YallaRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MomentStateKt {
    public static final boolean isApprovedState(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        return momentDetailModel.getState() == MomentState.Approved.getValue();
    }

    public static final boolean isSystemDelete(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        return momentDetailModel.getState() == MomentState.SystemDelete.getValue();
    }

    public static final boolean isUnderReview(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<this>");
        return momentDetailModel.getState() == MomentState.UnderReview.getValue();
    }
}
