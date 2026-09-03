package p435o0OoOOoO;

import android.os.MessageQueue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p417o0OoO0.o0OoOo0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO00o00;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class o0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f46042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f46043OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f46044OooO0OO = new MessageQueue.IdleHandler() { // from class: o0OoOOoO.o0O00O0o
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            o0O00O this$0 = this.f46045OooO00o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String text = "idleHandler ".concat(o0OoOo0.OooO00o(this$0.getClass()));
            Intrinsics.checkNotNullParameter(text, "text");
            OooOOO0.OooO0OO("TaskDispatcher", text + "  " + (System.currentTimeMillis() - oO00o00.f56562OooO00o));
            this$0.OooO0O0();
            this$0.f46043OooO0O0 = true;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE) || this$0.f46042OooO00o || !this$0.f46043OooO0O0) {
                return false;
            }
            this$0.f46042OooO00o = true;
            this$0.OooO00o();
            return false;
        }
    };

    public void OooO00o() {
    }

    public abstract void OooO0O0();
}
