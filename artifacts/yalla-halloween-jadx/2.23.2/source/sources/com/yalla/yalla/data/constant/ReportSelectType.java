package com.yalla.yalla.data.constant;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 com.yalla.yalla.data.constant.ReportSelectType[], still in use, count: 1, list:
  (r14v2 com.yalla.yalla.data.constant.ReportSelectType[]) from 0x005b: INVOKE (r14v2 com.yalla.yalla.data.constant.ReportSelectType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:92)
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/constant/ReportSelectType;", "", "Ljava/io/Serializable;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "Porn", "Spam", "Violence", "Illegal", "Fraud", "Plagiarism", "Other", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ReportSelectType implements Serializable {
    Porn(1),
    Spam(2),
    Violence(3),
    Illegal(4),
    Fraud(5),
    Plagiarism(6),
    Other(10);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int value;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(reportSelectTypeArr);
    }

    public ReportSelectType(int i) {
        super(str, i);
        this.value = i;
    }

    public static ReportSelectType valueOf(String str) {
        return (ReportSelectType) Enum.valueOf(ReportSelectType.class, str);
    }

    public static ReportSelectType[] values() {
        return (ReportSelectType[]) $VALUES.clone();
    }
}
