package p442o0OoOo0;

import androidx.camera.view.OooO0OO;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000;
import p110o000ooo0.o000000O;
import p110o000ooo0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47200OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f47199OooO0Oo = i;
        this.f47200OooO0o0 = obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0065 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = this.f47199OooO0Oo;
        Object obj = this.f47200OooO0o0;
        switch (i) {
            case 0:
                ((o0ooOOo) ((OooO0OO.OooO00o) obj)).OooO00o();
                return;
            default:
                o000 this$0 = (o000) obj;
                int i2 = o000.f35824OooOO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f35833OooO0oo.compareAndSet(false, true)) {
                    o000000O o000000o2 = this$0.f35826OooO00o.f10994OooO0o0;
                    o000000o2.getClass();
                    o0000OO0 observer = this$0.f35831OooO0o0;
                    Intrinsics.checkNotNullParameter(observer, "observer");
                    o000000o2.OooO00o(new o000000O.OooO(o000000o2, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f35832OooO0oO;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f35830OooO0o;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                objCall = this$0.f35829OooO0Oo.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                            break;
                        }
                        if (z) {
                            this$0.postValue(objCall);
                        }
                        atomicBoolean2.set(false);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
        }
    }
}
