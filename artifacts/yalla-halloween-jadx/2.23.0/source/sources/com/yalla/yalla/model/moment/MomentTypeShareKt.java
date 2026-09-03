package com.yalla.yalla.model.moment;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isSupportMomentTypeShare", "", "shareType", "", "Common_YallaRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MomentTypeShareKt {
    public static final boolean isSupportMomentTypeShare(int i) {
        return ((((((((i == MomentTypeShare.Text.getValue() || i == MomentTypeShare.Image.getValue()) || i == MomentTypeShare.Forward.getValue()) || i == MomentTypeShare.Share.getValue()) || i == MomentTypeShare.YallaTeam.getValue()) || i == MomentTypeShare.Topic.getValue()) || i == MomentTypeShare.Event.getValue()) || i == MomentTypeShare.Poll.getValue()) || i == MomentTypeShare.YallaChatGroup.getValue()) || i == MomentTypeShare.Edit.getValue();
    }
}
