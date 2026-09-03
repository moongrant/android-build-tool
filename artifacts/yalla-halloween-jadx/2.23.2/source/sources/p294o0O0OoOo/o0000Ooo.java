package p294o0O0OoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StackTraceElement[] f41705OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000Ooo f41706OooO0Oo;

    public o0000Ooo(Throwable th, o00000OO o00000oo2) {
        this.f41703OooO00o = th.getLocalizedMessage();
        this.f41704OooO0O0 = th.getClass().getName();
        this.f41705OooO0OO = o00000oo2.OooO00o(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f41706OooO0Oo = cause != null ? new o0000Ooo(cause, o00000oo2) : null;
    }
}
