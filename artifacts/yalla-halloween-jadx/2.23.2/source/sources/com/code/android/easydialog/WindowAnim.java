package com.code.android.easydialog;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 com.code.android.easydialog.WindowAnim[], still in use, count: 1, list:
  (r13v2 com.code.android.easydialog.WindowAnim[]) from 0x0059: INVOKE (r13v2 com.code.android.easydialog.WindowAnim[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/code/android/easydialog/WindowAnim;", "", "Alpha", "Bottom", "BottomWithAlpha", "Scale", "ScaleWithAlpha", "Top", "TopWithAlpha", "YLDialog_release"}, k = 1, mv = {1, 9, 0})
public final class WindowAnim {
    Alpha,
    Bottom,
    BottomWithAlpha,
    Scale,
    ScaleWithAlpha,
    Top,
    TopWithAlpha;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(windowAnimArr);
    }

    public WindowAnim() {
        super(str, i);
    }

    public static WindowAnim valueOf(String str) {
        return (WindowAnim) Enum.valueOf(WindowAnim.class, str);
    }

    public static WindowAnim[] values() {
        return (WindowAnim[]) $VALUES.clone();
    }
}
