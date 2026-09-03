package com.yalla.yalla.ui.view.room;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastTypeResId;", "", "", "resId", "Ljava/lang/Integer;", "getResId", "()Ljava/lang/Integer;", "Turntable", "Guessing", "LuckyGolds", "Other", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum RoomBroadcastTypeResId {
    Turntable("Turntable"),
    Guessing("Guessing"),
    LuckyGolds("LuckyGolds"),
    Other("Other");


    @Nullable
    private final Integer resId;

    RoomBroadcastTypeResId(String str) {
        this.resId = num;
    }
}
