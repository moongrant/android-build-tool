package com.getkeepsafe.relinker;

import java.util.Arrays;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Could not find '", str, "'. Looked for: ");
        sbOooO0O0.append(Arrays.toString(strArr));
        sbOooO0O0.append(", but only found: ");
        super(o0oOO.OooO0O0(sbOooO0O0, Arrays.toString(strArr2), "."));
    }
}
