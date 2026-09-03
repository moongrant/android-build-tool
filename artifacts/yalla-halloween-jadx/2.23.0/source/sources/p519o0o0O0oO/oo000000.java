package p519o0o0O0oO;

import android.content.DialogInterface;
import com.yalla.yalla.util.Function.OooO0O0;
import p420o0OoO0OO.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000000 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ O0000000 f53020OooO0Oo;

    public oo000000(O0000000 o0000000) {
        this.f53020OooO0Oo = o0000000;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        O0000000 o0000000 = this.f53020OooO0Oo;
        c cVar = o0000000.f52154OooO0O0;
        if (cVar != null) {
            o000000.OooO0O0().OooO00o(((OooO0O0) cVar).f32810OooO00o);
            o0000000.f52154OooO0O0 = null;
        }
    }
}
