package p367o0OOo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StackTraceElement[] f38659OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O f38660OooO0Oo;

    public o00O0O(Throwable th, o0OoOo0 o0oooo1) {
        this.f38657OooO00o = th.getLocalizedMessage();
        this.f38658OooO0O0 = th.getClass().getName();
        this.f38659OooO0OO = o0oooo1.OooO00o(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f38660OooO0Oo = cause != null ? new o00O0O(cause, o0oooo1) : null;
    }
}
