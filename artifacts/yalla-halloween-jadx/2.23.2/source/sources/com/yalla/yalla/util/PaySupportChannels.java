package com.yalla.yalla.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 com.yalla.yalla.util.PaySupportChannels[], still in use, count: 1, list:
  (r10v1 com.yalla.yalla.util.PaySupportChannels[]) from 0x0042: INVOKE (r10v1 com.yalla.yalla.util.PaySupportChannels[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:67)
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/util/PaySupportChannels;", "", "", "num", "I", "OooO00o", "()I", "pay_type_googlePay", "pay_type_payssionPay", "pay_type_huaWeiPay", "pay_type_tapPay", "pay_type_mintroute", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class PaySupportChannels {
    pay_type_googlePay(1),
    pay_type_payssionPay(3),
    pay_type_huaWeiPay(4),
    pay_type_tapPay(5),
    pay_type_mintroute(6);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int num;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(paySupportChannelsArr);
    }

    public PaySupportChannels(int i) {
        super(str, i);
        this.num = i;
    }

    public static PaySupportChannels valueOf(String str) {
        return (PaySupportChannels) Enum.valueOf(PaySupportChannels.class, str);
    }

    public static PaySupportChannels[] values() {
        return (PaySupportChannels[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getNum() {
        return this.num;
    }
}
