package oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 implements OooO0OO {
    public final String OooO00o(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
