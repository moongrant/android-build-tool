package com.yalla.yalla.ui.view;

import com.weieyu.yalla.R;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomBroadcastTypeResId;", "", "", "resId", "Ljava/lang/Integer;", "getResId", "()Ljava/lang/Integer;", "Turntable", "Guessing", "LuckyGolds", "Other", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum RoomBroadcastTypeResId {
    Turntable(Integer.valueOf(R.drawable.ic_broadcast_turntable_game)),
    Guessing(Integer.valueOf(R.drawable.icon_room_bottom_game_box_mora)),
    LuckyGolds(Integer.valueOf(R.drawable.icon_room_bottom_game_box_lucky_golds)),
    Other(null);


    @Nullable
    private final Integer resId;

    RoomBroadcastTypeResId(Integer num) {
        this.resId = num;
    }
}
