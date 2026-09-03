package oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f60896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f60897OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StackTraceElement[] f60898OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f60899OooO0Oo;

    public OooO(Throwable th, OooO0o oooO0o) {
        this.f60896OooO00o = th.getLocalizedMessage();
        this.f60897OooO0O0 = th.getClass().getName();
        this.f60898OooO0OO = oooO0o.OooO00o(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f60899OooO0Oo = cause != null ? new OooO(cause, oooO0o) : null;
    }
}
