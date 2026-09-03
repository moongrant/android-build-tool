package com.yalla.yalla.ui.activity.message;

import com.yy.yyeva.view.EvaAnimView;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f25523OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f25522OooO0Oo = i;
        this.f25523OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25522OooO0Oo;
        Object obj = this.f25523OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) obj;
                int i2 = PrivateChatActivity.f25239Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isDestroyed() && !this$0.isFinishing()) {
                    String strValueOf = String.valueOf(this$0.OooOo().getTargetId());
                    o00000O0 o00000o1 = new o00000O0(this$0, false);
                    LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
                    linkedHashMapOooO00o.put("touserid", strValueOf);
                    com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43390Oooooo0, linkedHashMapOooO00o, o00000o1);
                    break;
                }
                break;
            default:
                Function0 f = (Function0) obj;
                int i3 = EvaAnimView.f32438OooOOo;
                Intrinsics.checkNotNullParameter(f, "$f");
                f.invoke();
                break;
        }
    }
}
