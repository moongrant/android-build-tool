package p469o0Oooo;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oO0OO.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47868OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47869OooO0o0;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f47868OooO0Oo = i;
        this.f47869OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47868OooO0Oo;
        Object obj2 = this.f47869OooO0o0;
        switch (i) {
            case 0:
                o0000O this$0 = (o0000O) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f47862OooO0Oo) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        if (!(!StringsKt.isBlank(str))) {
                            Function0<Unit> function0 = this$0.f47861OooO0OO;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            Function1<? super String, Unit> function1 = this$0.f47860OooO0O0;
                            if (function1 != null) {
                                function1.invoke(str);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                GiftLayoutShowSelectViewManager this$1 = (GiftLayoutShowSelectViewManager) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this$1.f27565OooO00o), new OooOOOO(this$1, null));
                break;
        }
    }
}
