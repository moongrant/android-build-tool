package p487o0o00O;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48889OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48890OooO0o0;

    public o0OOO0o(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        this.f48889OooO0Oo = blackListActivity;
        this.f48890OooO0o0 = dataBean;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        BlackListActivity blackListActivity = this.f48889OooO0Oo;
        if (blackListActivity.f22280OooO0oO && zBooleanValue) {
            o000000 o000000Var = blackListActivity.f24920OooOo0O;
            XRefreshLayout xRefreshLayout = null;
            if (o000000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000Var = null;
            }
            List<T> list = o000000Var.f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Intrinsics.checkNotNull(obj);
                if (Intrinsics.areEqual(((BlackUserModel.DataBean) obj).userid, this.f48890OooO0o0.userid.toString())) {
                    o000000 o000000Var2 = blackListActivity.f24920OooOo0O;
                    if (o000000Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        o000000Var2 = null;
                    }
                    o000000Var2.OooOOo(i);
                    break;
                }
            }
            o000000 o000000Var3 = blackListActivity.f24920OooOo0O;
            if (o000000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000000Var3 = null;
            }
            o000000Var3.Oooo00o();
            XRefreshLayout xRefreshLayout2 = blackListActivity.f24918OooOo0;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            } else {
                xRefreshLayout = xRefreshLayout2;
            }
            xRefreshLayout.OooOooo(true, true, false);
            String string = blackListActivity.getString(o000000.Success);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        BlackListActivity.OooOo0(blackListActivity);
    }
}
