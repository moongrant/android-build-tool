package com.yalla.yalla.ui.adapter.message;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 com.yalla.yalla.ui.adapter.message.MessageModelHeadType[], still in use, count: 1, list:
  (r9v2 com.yalla.yalla.ui.adapter.message.MessageModelHeadType[]) from 0x0041: INVOKE (r9v2 com.yalla.yalla.ui.adapter.message.MessageModelHeadType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:66)
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/ui/adapter/message/MessageModelHeadType;", "", "TypeMoment", "TypeSystem", "TypeActivity", "TypeYallaTeam", "TypeFriends", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MessageModelHeadType {
    TypeMoment,
    TypeSystem,
    TypeActivity,
    TypeYallaTeam,
    TypeFriends;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(messageModelHeadTypeArr);
    }

    public MessageModelHeadType() {
        super(str, i);
    }

    public static MessageModelHeadType valueOf(String str) {
        return (MessageModelHeadType) Enum.valueOf(MessageModelHeadType.class, str);
    }

    public static MessageModelHeadType[] values() {
        return (MessageModelHeadType[]) $VALUES.clone();
    }
}
