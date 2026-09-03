package o0OOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f43631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f43632OooO0O0;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f43631OooO00o = iAvailableProcessors + 1;
        f43632OooO0O0 = (iAvailableProcessors * 2) + 1;
    }
}
