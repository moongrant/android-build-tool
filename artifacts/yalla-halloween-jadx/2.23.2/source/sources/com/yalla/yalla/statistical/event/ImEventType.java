package com.yalla.yalla.statistical.event;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v14 com.yalla.yalla.statistical.event.ImEventType[], still in use, count: 1, list:
  (r4v14 com.yalla.yalla.statistical.event.ImEventType[]) from 0x0172: INVOKE (r4v14 com.yalla.yalla.statistical.event.ImEventType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:371)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/statistical/event/ImEventType;", "", "IM_Disconnect", "IM_ConnectError", "IM_TokenIsEmpty", "IM_UnknownNotify", "IM_UnknownMessage", "IM_ConfirmMsgFailed", "IM_Deserialize", "IM_DeserializeNotification", "IM_UnknownNotification", "IM_Text", "IM_Gift", "IM_Voice", "IM_MiniGame", "IM_Sticker", "IM_ShareRoom", "IM_ShareCircle", "IM_ShareMoment", "IM_FriendBlock", "IM_FriendUnblock", "IM_FriendApply", "IM_AddFriend", "IM_DeleteFriend", "IM_ReceiveMsg", "IM_BanStatus", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ImEventType {
    IM_Disconnect,
    IM_ConnectError,
    IM_TokenIsEmpty,
    IM_UnknownNotify,
    IM_UnknownMessage,
    IM_ConfirmMsgFailed,
    IM_Deserialize,
    IM_DeserializeNotification,
    IM_UnknownNotification,
    IM_Text,
    IM_Gift,
    IM_Voice,
    IM_MiniGame,
    IM_Sticker,
    IM_ShareRoom,
    IM_ShareCircle,
    IM_ShareMoment,
    IM_FriendBlock,
    IM_FriendUnblock,
    IM_FriendApply,
    IM_AddFriend,
    IM_DeleteFriend,
    IM_ReceiveMsg,
    IM_BanStatus;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(imEventTypeArr);
    }

    public ImEventType() {
        super(str, i);
    }

    public static ImEventType valueOf(String str) {
        return (ImEventType) Enum.valueOf(ImEventType.class, str);
    }

    public static ImEventType[] values() {
        return (ImEventType[]) $VALUES.clone();
    }
}
