package com.yalla.yalla.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v15 com.yalla.yalla.util.DeleteNotificationType[], still in use, count: 1, list:
  (r3v15 com.yalla.yalla.util.DeleteNotificationType[]) from 0x01a2: INVOKE (r3v15 com.yalla.yalla.util.DeleteNotificationType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:419)
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/util/DeleteNotificationType;", "", "", "deleteType", "I", "OooO00o", "()I", "CODE_POST_OFFICIAL_DELETE_Type_10", "CODE_POST_OFFICIAL_DELETE_Type_20", "CODE_POST_OFFICIAL_DELETE_Type_30", "CODE_POST_OFFICIAL_DELETE_Type_50", "CODE_POST_OFFICIAL_DELETE_Type_55", "CODE_POST_OFFICIAL_DELETE_Type_57", "CODE_POST_OFFICIAL_DELETE_Type_58", "CODE_POST_OFFICIAL_DELETE_Type_60", "CODE_POST_OFFICIAL_DELETE_Type_101", "CODE_POST_OFFICIAL_DELETE_Type_102", "CODE_POST_OFFICIAL_DELETE_Type_103", "CODE_POST_OFFICIAL_DELETE_Type_104", "CODE_POST_OFFICIAL_DELETE_Type_105", "CODE_POST_OFFICIAL_DELETE_Type_106", "CODE_POST_OFFICIAL_DELETE_Type_107", "CODE_POST_OFFICIAL_DELETE_Type_108", "CODE_POST_OFFICIAL_DELETE_Type_109", "CODE_POST_OFFICIAL_DELETE_Type_110", "CODE_POST_OFFICIAL_DELETE_Type_111", "CODE_POST_OFFICIAL_DELETE_Type_112", "CODE_POST_OFFICIAL_DELETE_Type_113", "CODE_POST_OFFICIAL_DELETE_Type_114", "CODE_POST_OFFICIAL_DELETE_Type_115", "CODE_POST_OFFICIAL_DELETE_Type_116", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class DeleteNotificationType {
    CODE_POST_OFFICIAL_DELETE_Type_10(10),
    CODE_POST_OFFICIAL_DELETE_Type_20(20),
    CODE_POST_OFFICIAL_DELETE_Type_30(30),
    CODE_POST_OFFICIAL_DELETE_Type_50(50),
    CODE_POST_OFFICIAL_DELETE_Type_55(55),
    CODE_POST_OFFICIAL_DELETE_Type_57(57),
    CODE_POST_OFFICIAL_DELETE_Type_58(58),
    CODE_POST_OFFICIAL_DELETE_Type_60(60),
    CODE_POST_OFFICIAL_DELETE_Type_101(101),
    CODE_POST_OFFICIAL_DELETE_Type_102(102),
    CODE_POST_OFFICIAL_DELETE_Type_103(103),
    CODE_POST_OFFICIAL_DELETE_Type_104(104),
    CODE_POST_OFFICIAL_DELETE_Type_105(105),
    CODE_POST_OFFICIAL_DELETE_Type_106(106),
    CODE_POST_OFFICIAL_DELETE_Type_107(107),
    CODE_POST_OFFICIAL_DELETE_Type_108(108),
    CODE_POST_OFFICIAL_DELETE_Type_109(109),
    CODE_POST_OFFICIAL_DELETE_Type_110(110),
    CODE_POST_OFFICIAL_DELETE_Type_111(111),
    CODE_POST_OFFICIAL_DELETE_Type_112(112),
    CODE_POST_OFFICIAL_DELETE_Type_113(113),
    CODE_POST_OFFICIAL_DELETE_Type_114(114),
    CODE_POST_OFFICIAL_DELETE_Type_115(115),
    CODE_POST_OFFICIAL_DELETE_Type_116(116);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int deleteType;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(deleteNotificationTypeArr);
    }

    public DeleteNotificationType(int i) {
        super(str, i);
        this.deleteType = i;
    }

    public static DeleteNotificationType valueOf(String str) {
        return (DeleteNotificationType) Enum.valueOf(DeleteNotificationType.class, str);
    }

    public static DeleteNotificationType[] values() {
        return (DeleteNotificationType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getDeleteType() {
        return this.deleteType;
    }
}
