package OooO00o;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o0000Ooo;
import p560o0oOOooO.oO00OO0O;
import p561o0oOOooo.oOo000Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f74Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f75Oooo0oO;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f74Oooo0o = i;
        this.f75Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oO00OO0O oo00oo0o;
        switch (this.f74Oooo0o) {
            case 0:
                OooOOO this$0 = (OooOOO) this.f75Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super OooOo, Unit> function1 = this$0.f79OooO0Oo;
                if (function1 != null) {
                    function1.invoke(OooOo.f86OooO0O0);
                    break;
                }
                break;
            default:
                oOo000Oo this$1 = (oOo000Oo) this.f75Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MixedRoomActivity mixedRoomActivity = this$1.f44923OooO0O0;
                mixedRoomActivity.f11783o00000o0 = false;
                if (o0000Ooo.OooO00o(mixedRoomActivity) && (oo00oo0o = this$1.f44924OooO0OO.f44362OooO0oO) != null) {
                    oo00oo0o.OooO0oO(null);
                    break;
                }
                break;
        }
    }
}
