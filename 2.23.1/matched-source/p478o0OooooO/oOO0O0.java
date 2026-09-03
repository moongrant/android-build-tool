package p478o0OooooO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import p474o0OoooOO.oo0oO0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48338OooO0o0;

    public /* synthetic */ oOO0O0(Object obj, int i) {
        this.f48337OooO0Oo = i;
        this.f48338OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48337OooO0Oo;
        Object obj2 = this.f48338OooO0o0;
        switch (i) {
            case 0:
                IMMessageService this$0 = (IMMessageService) obj2;
                IMMessageService iMMessageService = IMMessageService.f24486OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    OooOOOO.OooO0OO("MessageService", "New_Message_Firebase : getMessageFromServer");
                    this$0.f24487OooO0Oo.OooO0OO();
                }
                break;
            default:
                MainMomentsTopicFollowingFragment.initObserver$lambda$0((MainMomentsTopicFollowingFragment) obj2, obj);
                break;
        }
    }
}
