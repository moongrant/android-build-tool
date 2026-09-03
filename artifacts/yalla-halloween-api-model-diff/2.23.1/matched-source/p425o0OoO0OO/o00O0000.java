package p425o0OoO0OO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.jvm.internal.Intrinsics;
import p505o0o00oO.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46698OooO0o0;

    public /* synthetic */ o00O0000(Object obj, int i) {
        this.f46697OooO0Oo = i;
        this.f46698OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46697OooO0Oo;
        Object obj2 = this.f46698OooO0o0;
        switch (i) {
            case 0:
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserveSticky.<no name provided>.invokeSuspend$lambda$0");
                ((Observer) obj2).onChanged(obj);
                break;
            case 1:
                FollowerActivity this$0 = (FollowerActivity) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i2 = FollowerActivity.f26639OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00Ooo o00ooo2 = this$0.f26643OooOo0;
                o00Ooo o00ooo3 = null;
                if (o00ooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o00ooo2 = null;
                }
                int size = o00ooo2.f13200OooOOoo.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                    } else {
                        o00Ooo o00ooo4 = this$0.f26643OooOo0;
                        if (o00ooo4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            o00ooo4 = null;
                        }
                        UserInfoModel userInfoModel = (UserInfoModel) o00ooo4.f13200OooOOoo.get(i3);
                        Intrinsics.checkNotNull(userInfoModel);
                        if (jLongValue != userInfoModel.getUserId()) {
                            i3++;
                        }
                    }
                }
                if (i3 > 0) {
                    o00Ooo o00ooo5 = this$0.f26643OooOo0;
                    if (o00ooo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o00ooo5 = null;
                    }
                    if (i3 < o00ooo5.f13200OooOOoo.size()) {
                        o00Ooo o00ooo6 = this$0.f26643OooOo0;
                        if (o00ooo6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            o00ooo3 = o00ooo6;
                        }
                        o00ooo3.OooOOo(i3);
                    }
                }
                break;
            default:
                MainMomentFragment.initObserver$lambda$10((MainMomentFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
