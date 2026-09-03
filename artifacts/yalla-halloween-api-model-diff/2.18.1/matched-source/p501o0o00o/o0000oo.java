package p501o0o00o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p142o00OOooO.o0000O;
import p169o00Ooo00.OooOOOO;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;
import p524o0o0O0oO.o0O0000O;
import p563o0oOo0.o00000OO;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41461OooO0O0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f41460OooO00o = i;
        this.f41461OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f41460OooO00o) {
            case 0:
                o000 this$0 = (o000) this.f41461OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoo();
                break;
            case 1:
                o0O0000O this$1 = (o0O0000O) this.f41461OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                wa waVar = this$1.f43025OooO0oo;
                if (waVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                    waVar = null;
                }
                DotView dotView = waVar.f50875OooO0o.f50937OooO0OO;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                dotView.OooO0OO(it.booleanValue());
                break;
            case 2:
                SmsCodeActivity this$2 = (SmsCodeActivity) this.f41461OooO0O0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (((ApiResult) obj).isSuccess()) {
                    this$2.finish();
                }
                break;
            case 3:
                ShareToFriendsActivity this$3 = (ShareToFriendsActivity) this.f41461OooO0O0;
                Boolean it2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.Share_Shared_successfully);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                }
                this$3.finish();
                break;
            case 4:
                ShowImageActivity this$4 = (ShowImageActivity) this.f41461OooO0O0;
                ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Bitmap?>{ kotlin.collections.TypeAliasesKt.ArrayList<android.graphics.Bitmap?> }");
                this$4.f22525Oooooo0 = (ArrayList) obj;
                this$4.OooOooo().f31641OooO0oo = this$4.f22525Oooooo0;
                break;
            case 5:
                UserPostListActivity this$5 = (UserPostListActivity) this.f41461OooO0O0;
                UserPostListActivity.OooO00o oooO00o2 = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                o00O00.OooO0O0("动态任务 新增 刷新 ");
                if (o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, this$5.f22677Ooooo0o)) {
                    o00000OO o00000ooOooOooo = this$5.OooOooo();
                    OooOOOO oooOOOO = OooOOOO.f32671OooO00o;
                    o00000ooOooOooo.setNewData(OooOOOO.OooO00o(this$5.OooOooo().getData()));
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this$5.OooOoo().f50651OooO0OO.getLayoutManager();
                    Intrinsics.checkNotNull(linearLayoutManager);
                    linearLayoutManager.scrollToPositionWithOffset(0, 0);
                    o00000OO o00000ooOooOooo2 = this$5.OooOooo();
                    Boolean bool = Boolean.TRUE;
                    o00000ooOooOooo2.setLoadComplete(bool, bool, Boolean.FALSE);
                    this$5.OooOoo().f50652OooO0Oo.Oooo0o0(true, true, false);
                    break;
                }
                break;
            default:
                MainRoomFragment.m451initObserver$lambda4((MainRoomFragment) this.f41461OooO0O0, obj);
                break;
        }
    }
}
