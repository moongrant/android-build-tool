package androidx.camera.core.impl;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3788OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f3787OooO0Oo = i;
        this.f3788OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3787OooO0Oo) {
            case 0:
                Oooo00O.o000OO.OooO0OO oooO0OO = (Oooo00O.o000OO.OooO0OO) ((o0O0O00.OooO0OO) this.f3788OooO0o0);
                if (p022Oooo00O.o000OO.this.f553OooO0oo == Oooo00O.o000OO.OooOO0.PENDING_OPEN) {
                    p022Oooo00O.o000OO.this.Oooo0OO(false);
                }
                break;
            case 1:
                p045Oooooo.o0000Ooo o0000ooo = (p045Oooooo.o0000Ooo) this.f3788OooO0o0;
                if (o0000ooo.f1912OooOo0o) {
                    p028Oooo0oO.o00O0O0.OooO0oo(o0000ooo.f1890OooO00o, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    o0000ooo.f1908OooOo = null;
                    o0000ooo.OooOOO0();
                    o0000ooo.f1912OooOo0o = false;
                }
                break;
            default:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f3788OooO0o0;
                int i = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isDestroyed() && !this$0.isFinishing()) {
                    String strValueOf = String.valueOf(this$0.OooOo().getTargetId());
                    com.yalla.yalla.ui.activity.message.o00000O0 o00000o1 = new com.yalla.yalla.ui.activity.message.o00000O0(this$0, false);
                    LinkedHashMap linkedHashMapOooO00o = p428o0OoO0o0.OooOOOO.OooO00o();
                    linkedHashMapOooO00o.put("touserid", strValueOf);
                    com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p386o0OOoo0O.o000oOoO.f43359OooOoo, p386o0OOoo0O.o000oOoO.f43390Oooooo0, linkedHashMapOooO00o, o00000o1);
                    break;
                }
                break;
        }
    }
}
