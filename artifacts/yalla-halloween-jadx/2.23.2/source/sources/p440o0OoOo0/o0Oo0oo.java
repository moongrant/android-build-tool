package p440o0OoOo0;

import androidx.camera.view.OooO0OO;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000;
import p110o000ooo0.o000000O;
import p110o000ooo0.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47202OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f47201OooO0Oo = i;
        this.f47202OooO0o0 = obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0065 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = this.f47201OooO0Oo;
        Object obj = this.f47202OooO0o0;
        switch (i) {
            case 0:
                ((o00oO0o) ((OooO0OO.OooO00o) obj)).OooO00o();
                return;
            default:
                o000O000 this$0 = (o000O000) obj;
                int i2 = o000O000.f35899OooOO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f35908OooO0oo.compareAndSet(false, true)) {
                    o000000O o000000o2 = this$0.f35901OooO00o.f10983OooO0o0;
                    o000000o2.getClass();
                    o000 observer = this$0.f35906OooO0o0;
                    Intrinsics.checkNotNullParameter(observer, "observer");
                    o000000o2.OooO00o(new o000000O.OooO(o000000o2, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f35907OooO0oO;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f35905OooO0o;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                objCall = this$0.f35904OooO0Oo.call();
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
