package p423o0OoO0OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.jvm.internal.Intrinsics;
import p506o0o00oOo.oO000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46620OooO0o0;

    public /* synthetic */ o00(Object obj, int i) {
        this.f46619OooO0Oo = i;
        this.f46620OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46619OooO0Oo;
        Object obj2 = this.f46620OooO0o0;
        switch (i) {
            case 0:
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserve.<no name provided>.invokeSuspend$lambda$0");
                ((Observer) obj2).onChanged(obj);
                break;
            case 1:
                FollowerActivity this$0 = (FollowerActivity) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i2 = FollowerActivity.f26638OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oO000OOo oo000ooo = this$0.f26642OooOo0;
                oO000OOo oo000ooo2 = null;
                if (oo000ooo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oo000ooo = null;
                }
                int size = oo000ooo.f13189OooOOoo.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                    } else {
                        oO000OOo oo000ooo3 = this$0.f26642OooOo0;
                        if (oo000ooo3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo000ooo3 = null;
                        }
                        UserInfoModel userInfoModel = (UserInfoModel) oo000ooo3.f13189OooOOoo.get(i3);
                        Intrinsics.checkNotNull(userInfoModel);
                        if (jLongValue != userInfoModel.getUserId()) {
                            i3++;
                        }
                    }
                }
                if (i3 > 0) {
                    oO000OOo oo000ooo4 = this$0.f26642OooOo0;
                    if (oo000ooo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oo000ooo4 = null;
                    }
                    if (i3 < oo000ooo4.f13189OooOOoo.size()) {
                        oO000OOo oo000ooo5 = this$0.f26642OooOo0;
                        if (oo000ooo5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            oo000ooo2 = oo000ooo5;
                        }
                        oo000ooo2.OooOOo(i3);
                    }
                }
                break;
            default:
                MainMomentFragment.initObserver$lambda$9((MainMomentFragment) obj2, obj);
                break;
        }
    }
}
