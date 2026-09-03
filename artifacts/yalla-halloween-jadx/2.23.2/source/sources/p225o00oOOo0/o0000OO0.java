package p225o00oOOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 implements o0000O0O {
    public final String OooO00o(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
