package com.yalla.yalla.model.room;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/room/RoomItemInfoModelTag;", "", "(Ljava/lang/String;I)V", "Head", "RoomName", "Announcement", "Tag", "Permissions", "NumberOfMic", "MemberFee", "Bonus", "ForbiddenList", "EnterRoomAllow", "ActionRecords", "AllowLockMic", "AllowOpenApplyMic", "CreateEvent", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum RoomItemInfoModelTag {
    Head,
    RoomName,
    Announcement,
    Tag,
    Permissions,
    NumberOfMic,
    MemberFee,
    Bonus,
    ForbiddenList,
    EnterRoomAllow,
    ActionRecords,
    AllowLockMic,
    AllowOpenApplyMic,
    CreateEvent;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<RoomItemInfoModelTag> getEntries() {
        return $ENTRIES;
    }
}
