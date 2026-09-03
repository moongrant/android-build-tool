package p432o0OoOOO;

import android.os.MessageQueue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p423o0OoO0OO.o0000oo;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOo0o00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f46843OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f46844OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00000O0 f46845OooO0OO = new MessageQueue.IdleHandler() { // from class: o0OoOOO.o00000O0
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            o00000O this$0 = this.f46846OooO00o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String text = "idleHandler ".concat(o0000oo.OooO00o(this$0.getClass()));
            Intrinsics.checkNotNullParameter(text, "text");
            o0000O00.OooO0OO("TaskDispatcher", text + "  " + (System.currentTimeMillis() - oOo0o00.f57239OooO00o));
            this$0.OooO0O0();
            this$0.f46844OooO0O0 = true;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE) || this$0.f46843OooO00o || !this$0.f46844OooO0O0) {
                return false;
            }
            this$0.f46843OooO00o = true;
            this$0.OooO00o();
            return false;
        }
    };

    public void OooO00o() {
    }

    public abstract void OooO0O0();
}
