package p486o0o00O00;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48405OooO0o0;

    public oo000o(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        this.f48404OooO0Oo = blackListActivity;
        this.f48405OooO0o0 = dataBean;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        BlackListActivity blackListActivity = this.f48404OooO0Oo;
        if (blackListActivity.f22753OooO0oO && zBooleanValue) {
            oo0o0Oo oo0o0oo = blackListActivity.f25374OooOo0O;
            XRefreshLayout xRefreshLayout = null;
            if (oo0o0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo0o0oo = null;
            }
            List<T> list = oo0o0oo.f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "adapter.data");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                Intrinsics.checkNotNull(obj);
                if (Intrinsics.areEqual(((BlackUserModel.DataBean) obj).userid, this.f48405OooO0o0.userid.toString())) {
                    oo0o0Oo oo0o0oo2 = blackListActivity.f25374OooOo0O;
                    if (oo0o0oo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oo0o0oo2 = null;
                    }
                    oo0o0oo2.OooOOo(i);
                    break;
                }
            }
            oo0o0Oo oo0o0oo3 = blackListActivity.f25374OooOo0O;
            if (oo0o0oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo0o0oo3 = null;
            }
            oo0o0oo3.Oooo00o();
            XRefreshLayout xRefreshLayout2 = blackListActivity.f25372OooOo0;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("xRefreshLayout");
            } else {
                xRefreshLayout = xRefreshLayout2;
            }
            xRefreshLayout.OooOooo(true, true, false);
            String string = blackListActivity.getString(oO00OOo0.Success);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        BlackListActivity.OooOo0(blackListActivity);
    }
}
