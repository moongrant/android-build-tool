package com.getkeepsafe.relinker;

import java.util.Arrays;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        StringBuilder sbOooO00o = o0OoOo0.OooO00o("Could not find '", str, "'. Looked for: ");
        sbOooO00o.append(Arrays.toString(strArr));
        sbOooO00o.append(", but only found: ");
        super(o0O00o0.OooO0O0(sbOooO00o, Arrays.toString(strArr2), "."));
    }
}
