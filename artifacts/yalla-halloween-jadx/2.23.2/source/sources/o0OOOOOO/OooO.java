package o0OOOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f42819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f42820OooO0O0;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f42819OooO00o = iAvailableProcessors + 1;
        f42820OooO0O0 = (iAvailableProcessors * 2) + 1;
    }
}
