package p520o0o0O00o;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p532o0o0OOO.o00OO000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00O implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o000O00O f42206OooO0O0 = new o000O00O(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o000O00O f42207OooO0OO = new o000O00O(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o000O00O f42208OooO0Oo = new o000O00O(2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42209OooO00o;

    public /* synthetic */ o000O00O(int i) {
        this.f42209OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f42209OooO00o) {
            case 0:
                SharedMessageVM.m300_get_userDot_$lambda11$lambda10((Boolean) obj);
                break;
            case 1:
                Integer num = (Integer) obj;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
                if (num != null && num.intValue() == 1) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.send_successfully);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                } else if (num != null && num.intValue() == 2) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Added_successfully);
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o002 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                }
                break;
            default:
                String url = (String) obj;
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FaqRule);
                Intrinsics.checkNotNullExpressionValue(url, "it");
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f21237OoooO00 = url;
                webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.Member_Group_FAQ));
                o00OO000.f43171OooO00o.OooOOO(webPageInfo);
                break;
        }
    }
}
