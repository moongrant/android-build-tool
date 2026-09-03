package com.yalla.yalla.ui.view.room;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v3 com.yalla.yalla.ui.view.room.RoomBroadcastTypeResId[], still in use, count: 1, list:
  (r7v3 com.yalla.yalla.ui.view.room.RoomBroadcastTypeResId[]) from 0x0048: INVOKE (r7v3 com.yalla.yalla.ui.view.room.RoomBroadcastTypeResId[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:73)
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastTypeResId;", "", "", "resId", "Ljava/lang/Integer;", "getResId", "()Ljava/lang/Integer;", "Turntable", "Guessing", "LuckyGolds", "Other", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomBroadcastTypeResId {
    Turntable("Turntable"),
    Guessing("Guessing"),
    LuckyGolds("LuckyGolds"),
    Other("Other");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @Nullable
    private final Integer resId;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(roomBroadcastTypeResIdArr);
    }

    public RoomBroadcastTypeResId(String str) {
        super(str, i);
        this.resId = num;
    }

    public static RoomBroadcastTypeResId valueOf(String str) {
        return (RoomBroadcastTypeResId) Enum.valueOf(RoomBroadcastTypeResId.class, str);
    }

    public static RoomBroadcastTypeResId[] values() {
        return (RoomBroadcastTypeResId[]) $VALUES.clone();
    }
}
