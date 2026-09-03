package p367o0OOo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0[] f38655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0 f38656OooO0O0 = new Oooo0();

    public Oooo000(o0OoOo0... o0oooo0Arr) {
        this.f38655OooO00o = o0oooo0Arr;
    }

    @Override // p367o0OOo00o.o0OoOo0
    public final StackTraceElement[] OooO00o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrOooO00o = stackTraceElementArr;
        for (o0OoOo0 o0oooo1 : this.f38655OooO00o) {
            if (stackTraceElementArrOooO00o.length <= 1024) {
                break;
            }
            stackTraceElementArrOooO00o = o0oooo1.OooO00o(stackTraceElementArr);
        }
        return stackTraceElementArrOooO00o.length > 1024 ? this.f38656OooO0O0.OooO00o(stackTraceElementArrOooO00o) : stackTraceElementArrOooO00o;
    }
}
