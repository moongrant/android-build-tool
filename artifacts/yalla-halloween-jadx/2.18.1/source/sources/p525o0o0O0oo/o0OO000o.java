package p525o0o0O0oo;

import android.os.Looper;
import android.os.MessageQueue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p617o0oo0o.Oooo0;
import p617o0oo0o.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o0OO000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f43104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43105OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO000 f43106OooO0OO = new MessageQueue.IdleHandler() { // from class: o0o0O0oo.o0OO000
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            o0OO000o this$0 = this.f43103OooO00o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String text = "idleHandler " + Oooo0.OooO00o(this$0.getClass());
            Intrinsics.checkNotNullParameter(text, "text");
            StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(text, "  ");
            sbOooO00o.append(System.currentTimeMillis() - o00000O.f48475OooO00o);
            o00O00.OooO0OO("TaskDispatcher", sbOooO00o.toString());
            this$0.OooO0O0();
            this$0.f43105OooO0O0 = true;
            if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                return false;
            }
            this$0.OooO0Oo();
            return false;
        }
    };

    public void OooO00o() {
    }

    public abstract void OooO0O0();

    public void OooO0OO() {
        Looper.myQueue().addIdleHandler(this.f43106OooO0OO);
    }

    public final void OooO0Oo() {
        if (this.f43104OooO00o || !this.f43105OooO0O0) {
            return;
        }
        this.f43104OooO00o = true;
        OooO00o();
    }

    public void OooO0o0() {
        Looper.myQueue().removeIdleHandler(this.f43106OooO0OO);
    }
}
