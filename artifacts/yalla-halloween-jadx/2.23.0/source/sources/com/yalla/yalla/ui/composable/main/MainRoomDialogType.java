package com.yalla.yalla.ui.composable.main;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/composable/main/MainRoomDialogType;", "", "", "level", "I", "getLevel", "()I", "Welcome", "UserReturn", "OfficialAction", "BindYallaChatTips", "CheckInTask", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum MainRoomDialogType {
    Welcome(1),
    UserReturn(2),
    OfficialAction(3),
    BindYallaChatTips(4),
    CheckInTask(5);

    private final int level;

    MainRoomDialogType(int i) {
        this.level = i;
    }
}
