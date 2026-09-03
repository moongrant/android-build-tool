package oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o[] f60900OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f60901OooO0O0 = new OooO0O0();

    public OooO00o(OooO0o... oooO0oArr) {
        this.f60900OooO00o = oooO0oArr;
    }

    @Override // oo0OOoo.OooO0o
    public final StackTraceElement[] OooO00o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrOooO00o = stackTraceElementArr;
        for (OooO0o oooO0o : this.f60900OooO00o) {
            if (stackTraceElementArrOooO00o.length <= 1024) {
                break;
            }
            stackTraceElementArrOooO00o = oooO0o.OooO00o(stackTraceElementArr);
        }
        return stackTraceElementArrOooO00o.length > 1024 ? this.f60901OooO0O0.OooO00o(stackTraceElementArrOooO00o) : stackTraceElementArrOooO00o;
    }
}
