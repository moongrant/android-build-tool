package com.yalla.yalla.manager.main;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 com.yalla.yalla.manager.main.MainDialogManager$PriorityType[], still in use, count: 1, list:
  (r10v3 com.yalla.yalla.manager.main.MainDialogManager$PriorityType[]) from 0x0059: INVOKE (r10v3 com.yalla.yalla.manager.main.MainDialogManager$PriorityType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yalla/yalla/manager/main/MainDialogManager$PriorityType", "", "Lcom/yalla/yalla/manager/main/MainDialogManager$PriorityType;", "", "priorityLevel", "I", "getPriorityLevel", "()I", "BindMoreAccount", "Welcome", "UserReturn", "OfficialAction", "BindYallaChatTips", "CheckInTask", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainDialogManager$PriorityType {
    BindMoreAccount(100),
    Welcome(101),
    UserReturn(102),
    OfficialAction(103),
    BindYallaChatTips(104),
    CheckInTask(105);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int priorityLevel;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(mainDialogManager$PriorityTypeArr);
    }

    public MainDialogManager$PriorityType(int i) {
        super(str, i);
        this.priorityLevel = i;
    }

    public static MainDialogManager$PriorityType valueOf(String str) {
        return (MainDialogManager$PriorityType) Enum.valueOf(MainDialogManager$PriorityType.class, str);
    }

    public static MainDialogManager$PriorityType[] values() {
        return (MainDialogManager$PriorityType[]) $VALUES.clone();
    }
}
