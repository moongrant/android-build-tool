package OooO00o;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o0000Ooo;
import p562o0oOOooO.oO00O0oO;
import p563o0oOOooo.oO0OO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f74Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f75OoooO00;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f74Oooo = i;
        this.f75OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oO00O0oO oo00o0oo;
        switch (this.f74Oooo) {
            case 0:
                OooOOO this$0 = (OooOOO) this.f75OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super OooOo, Unit> function1 = this$0.f79OooO0Oo;
                if (function1 != null) {
                    function1.invoke(OooOo.f86OooO0O0);
                    break;
                }
                break;
            default:
                oO0OO00o this$1 = (oO0OO00o) this.f75OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MixedRoomActivity mixedRoomActivity = this$1.f44932OooO0O0;
                mixedRoomActivity.f11798o00000oo = false;
                if (o0000Ooo.OooO00o(mixedRoomActivity) && (oo00o0oo = this$1.f44933OooO0OO.f44388OooO0oO) != null) {
                    oo00o0oo.OooO0oO(null);
                    break;
                }
                break;
        }
    }
}
