package p294o0O0OoOo;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 implements o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f41702OooO00o = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;

    @Override // p294o0O0OoOo.o00000OO
    public final StackTraceElement[] OooO00o(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f41702OooO00o;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
