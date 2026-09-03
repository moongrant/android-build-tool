package com.yalla.yalla.data.constant;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 com.yalla.yalla.data.constant.LucklyPacket$Action[], still in use, count: 1, list:
  (r4v1 com.yalla.yalla.data.constant.LucklyPacket$Action[]) from 0x001d: INVOKE (r4v1 com.yalla.yalla.data.constant.LucklyPacket$Action[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:30)
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yalla/yalla/data/constant/LucklyPacket$Action", "", "Lcom/yalla/yalla/data/constant/LucklyPacket$Action;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Companion", "Receive", "Send", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class LucklyPacket$Action {
    Receive(1),
    Send(2);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.yalla.yalla.data.constant.LucklyPacket$Action$OooO00o, reason: from kotlin metadata */
    @SourceDebugExtension({"SMAP\nLucklyPacket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LucklyPacket.kt\ncom/yalla/yalla/data/constant/LucklyPacket$Action$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
    public static final class Companion {
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new LucklyPacket$Action[]{r0, r1});
    }

    public LucklyPacket$Action(int i) {
        super(str, i);
        this.value = i;
    }

    public static LucklyPacket$Action valueOf(String str) {
        return (LucklyPacket$Action) Enum.valueOf(LucklyPacket$Action.class, str);
    }

    public static LucklyPacket$Action[] values() {
        return (LucklyPacket$Action[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
