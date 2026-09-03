package com.yalla.yalla.data.constant;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v5 com.yalla.yalla.data.constant.ClientCodeType[], still in use, count: 1, list:
  (r9v5 com.yalla.yalla.data.constant.ClientCodeType[]) from 0x0097: INVOKE (r9v5 com.yalla.yalla.data.constant.ClientCodeType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:152)
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/constant/ClientCodeType;", "", "Ljava/io/Serializable;", "", "source", "I", "OooO00o", "()I", "Login", "Register", "Retrieve", "BingingPhone", "ChangeOld", "Change", "UnbindThird", "DeleteAccount", "LoginVerification", "TurnOnProtection", "TunOnProtectionBingingPhone", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ClientCodeType implements Serializable {
    Login(1),
    Register(2),
    Retrieve(-1),
    BingingPhone(3),
    ChangeOld(-1),
    Change(4),
    UnbindThird(-1),
    DeleteAccount(-1),
    LoginVerification(-1),
    TurnOnProtection(-1),
    TunOnProtectionBingingPhone(5);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int source;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(clientCodeTypeArr);
    }

    public ClientCodeType(int i) {
        super(str, i);
        this.source = i;
    }

    public static ClientCodeType valueOf(String str) {
        return (ClientCodeType) Enum.valueOf(ClientCodeType.class, str);
    }

    public static ClientCodeType[] values() {
        return (ClientCodeType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getSource() {
        return this.source;
    }
}
