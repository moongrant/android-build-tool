package androidx.constraintlayout.core.parser;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CLParsingException (");
        sbOooO0o0.append(hashCode());
        sbOooO0o0.append(") : ");
        sbOooO0o0.append("null (null at line 0)");
        return sbOooO0o0.toString();
    }
}
