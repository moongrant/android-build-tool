package p294o0O0OoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO[] f41700OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f41701OooO0O0 = new o00000O0();

    public o00000(o00000OO... o00000ooArr) {
        this.f41700OooO00o = o00000ooArr;
    }

    @Override // p294o0O0OoOo.o00000OO
    public final StackTraceElement[] OooO00o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrOooO00o = stackTraceElementArr;
        for (o00000OO o00000oo2 : this.f41700OooO00o) {
            if (stackTraceElementArrOooO00o.length <= 1024) {
                break;
            }
            stackTraceElementArrOooO00o = o00000oo2.OooO00o(stackTraceElementArr);
        }
        return stackTraceElementArrOooO00o.length > 1024 ? this.f41701OooO0O0.OooO00o(stackTraceElementArrOooO00o) : stackTraceElementArrOooO00o;
    }
}
