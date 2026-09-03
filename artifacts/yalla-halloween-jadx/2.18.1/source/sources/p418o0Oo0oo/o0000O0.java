package p418o0Oo0oo;

import android.view.MotionEvent;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import o00O0O.OooO;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0000O0 {
    public static final boolean OooO00o(int i) {
        return (i & 1) != 0;
    }

    public static final void OooO0O0(o00Oo0 o00oo1, long j, Function1 function1, boolean z) {
        MotionEvent motionEventOooO00o = o00oo1.OooO00o();
        if (motionEventOooO00o == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEventOooO00o.getAction();
        if (z) {
            motionEventOooO00o.setAction(3);
        }
        motionEventOooO00o.offsetLocation(-OooO.OooO0OO(j), -OooO.OooO0Oo(j));
        function1.invoke(motionEventOooO00o);
        motionEventOooO00o.offsetLocation(OooO.OooO0OO(j), OooO.OooO0Oo(j));
        motionEventOooO00o.setAction(action);
    }
}
