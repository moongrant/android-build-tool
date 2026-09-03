package com.yalla.yalla.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isSupportMomentType", "", "type", "", "app_YallaRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MomentTypeKt {
    public static final boolean isSupportMomentType(int i) {
        return (((((((i == MomentType.Text.getValue() || i == MomentType.Image.getValue()) || i == MomentType.Forward.getValue()) || i == MomentType.Share.getValue()) || i == MomentType.YallaTeam.getValue()) || i == MomentType.Topic.getValue()) || i == MomentType.Event.getValue()) || i == MomentType.Poll.getValue()) || i == MomentType.YallaChatGroup.getValue();
    }
}
