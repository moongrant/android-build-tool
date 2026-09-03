package com.yalla.yalla.module.event.ui.screen;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 com.yalla.yalla.module.event.ui.screen.EventPage[], still in use, count: 1, list:
  (r7v2 com.yalla.yalla.module.event.ui.screen.EventPage[]) from 0x0035: INVOKE (r7v2 com.yalla.yalla.module.event.ui.screen.EventPage[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:54)
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "", "Ljava/io/Serializable;", "SquareOngoing", "SquareUpcoming", "MineSubscribe", "MineCreator", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class EventPage implements Serializable {
    SquareOngoing,
    SquareUpcoming,
    MineSubscribe,
    MineCreator;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventPage.values().length];
            try {
                iArr[EventPage.SquareOngoing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventPage.SquareUpcoming.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventPage.MineSubscribe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(eventPageArr);
    }

    public EventPage() {
        super(str, i);
    }

    public static EventPage valueOf(String str) {
        return (EventPage) Enum.valueOf(EventPage.class, str);
    }

    public static EventPage[] values() {
        return (EventPage[]) $VALUES.clone();
    }
}
