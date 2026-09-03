package p472o0OoooOO;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p511o0o0O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47900OooO0o0;

    public /* synthetic */ o0OO(Object obj, int i) {
        this.f47899OooO0Oo = i;
        this.f47900OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47899OooO0Oo;
        Object obj2 = this.f47900OooO0o0;
        switch (i) {
            case 0:
                o0OOO00 this$0 = (o0OOO00) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f47913OooO0Oo) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        if (!(!StringsKt.isBlank(str))) {
                            Function0<Unit> function0 = this$0.f47912OooO0OO;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            Function1<? super String, Unit> function1 = this$0.f47911OooO0O0;
                            if (function1 != null) {
                                function1.invoke(str);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                GiftLayoutHideSelectViewManager this$1 = (GiftLayoutHideSelectViewManager) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this$1.f27537OooO00o.f50959OooO0oO), new OooOOO0(this$1, null));
                break;
        }
    }
}
