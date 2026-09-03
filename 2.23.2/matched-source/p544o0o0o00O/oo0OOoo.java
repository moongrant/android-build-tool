package p544o0o0o00O;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;
import p511o0o0O.OooOOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0OOoo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f55757OooO0o0;

    public /* synthetic */ oo0OOoo(Object obj, int i) {
        this.f55756OooO0Oo = i;
        this.f55757OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f55756OooO0Oo;
        Object obj2 = this.f55757OooO0o0;
        switch (i) {
            case 0:
                IMMessageService this$0 = (IMMessageService) obj2;
                IMMessageService iMMessageService = IMMessageService.f24478OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    o0000O00.OooO0OO("MessageService", "New_Message_Firebase : getMessageFromServer");
                    this$0.f24479OooO0Oo.OooO0OO();
                }
                break;
            default:
                GiftLayoutShowSelectViewManager this$1 = (GiftLayoutShowSelectViewManager) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this$1.f27556OooO00o), new OooOOOO(this$1, null));
                break;
        }
    }
}
