package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MoraGiftListModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o00oO0o;
import p373o0OOo0oO.o0OoOo0;
import p675oO0Oo.l0;
import p675oO0Oo.n0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49671OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f49670OooO0Oo = i;
        this.f49671OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49670OooO0Oo;
        n0 n0Var = null;
        Object obj2 = this.f49671OooO0o0;
        switch (i) {
            case 0:
                o0OO00O messageInputState = (o0OO00O) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(messageInputState, "$messageInputState");
                if (zBooleanValue) {
                    o00oO0o o00oo0oOooO0O0 = messageInputState.OooO0O0();
                    o0OoOo0 o0oooo1 = o00oo0oOooO0O0 != null ? o00oo0oOooO0O0.f43173OooO0o0 : null;
                    if (o0oooo1 != null) {
                        o0oooo1.f43177OooO0OO = !zBooleanValue;
                        break;
                    }
                }
                break;
            default:
                final l0 this$0 = (l0) obj2;
                List<MoraGiftListModel> it = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                n0 n0Var2 = this$0.f59309OooOO0O;
                if (n0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    n0Var = n0Var2;
                }
                n0Var.OooOoO0(it);
                this$0.OooOO0().f44169OooOoO0.postDelayed(new Runnable() { // from class: oO0Oo.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l0 this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.OooOO0().f44169OooOoO0.scrollToPosition(0);
                    }
                }, 200L);
                this$0.f59311OooOOO = it;
                break;
        }
    }
}
