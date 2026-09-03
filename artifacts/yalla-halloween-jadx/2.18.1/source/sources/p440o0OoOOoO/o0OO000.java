package p440o0OoOOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f40187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f40188OooO0O0;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f40187OooO00o = iAvailableProcessors + 1;
        f40188OooO0O0 = (iAvailableProcessors * 2) + 1;
    }
}
