package androidx.media3.session;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo0o0Oo implements o000OoO.o00000O0.OooO00o, androidx.activity.result.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9512OooO0Oo;

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onAvailableCommandsChanged(((o0000OO0) this.f9512OooO0Oo).f9297OooO0OO);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        p335o0OO0o0O.o0OO00O this$0 = (p335o0OO0o0O.o0OO00O) this.f9512OooO0Oo;
        int i = p335o0OO0o0O.o0OO00O.f42474OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0OO();
    }
}
