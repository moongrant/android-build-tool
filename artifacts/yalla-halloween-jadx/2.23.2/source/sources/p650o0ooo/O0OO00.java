package p650o0ooo;

import android.content.DialogInterface;
import com.yalla.yalla.util.Function.OooO0O0;
import p424o0OoO0Oo.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class O0OO00 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ a f58135OooO0Oo;

    public O0OO00(a aVar) {
        this.f58135OooO0Oo = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f58135OooO0Oo;
        g gVar = aVar.f58138OooO0O0;
        if (gVar != null) {
            o00OOO00.OooO0O0().OooO00o(((OooO0O0) gVar).f32274OooO00o);
            aVar.f58138OooO0O0 = null;
        }
    }
}
