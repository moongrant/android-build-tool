package p142o00OOooO;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFragment;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import com.yalla.yalla.util.NetWork;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p522o0o0O0o.oo0o0O0;
import p579o0oOoOOo.oOOO000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31912OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31913OooO0O0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f31912OooO00o = i;
        this.f31913OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f31912OooO00o) {
            case 0:
                MainMomentFragment.m32initObserver$lambda8((MainMomentFragment) this.f31913OooO0O0, (Integer) obj);
                break;
            case 1:
                LoginActivity context = (LoginActivity) this.f31913OooO0O0;
                String url = (String) obj;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (url != null && !StringsKt.isBlank(url)) {
                    z = false;
                }
                if (!z) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                    Intrinsics.checkNotNullExpressionValue(url, "it");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.feedback));
                    o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                    webPageInfo.OooO00o("PID", o0Oo0oo.OooO00o());
                    webPageInfo.OooO00o("type", "1");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
                    webPageInfo.OooO00o("appVersion", o0OOO0o.OooO0O0());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, o0Oo0oo.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", o0Oo0oo.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            case 2:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f31913OooO0O0;
                String str = (String) obj;
                PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str != null) {
                    if (str.length() > 0) {
                        int itemCount = this$0.Oooo0().getItemCount();
                        for (int i = 0; i < itemCount; i++) {
                            if (Intrinsics.areEqual(str, this$0.Oooo0().getData(i).getMid())) {
                                this$0.Oooo0().notifyItemChanged(i);
                            }
                        }
                    }
                }
                break;
            case 3:
                UserInfoActivity this$1 = (UserInfoActivity) this.f31913OooO0O0;
                UserInfoActivity.OooO00o oooO00o3 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this$1.Oooo0OO();
                }
                break;
            case 4:
                oOOO000o this$2 = (oOOO000o) this.f31913OooO0O0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (Intrinsics.areEqual(obj, (Object) 0)) {
                    AppCompatTextView appCompatTextView = this$2.OooOO0O().f49398OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.selected");
                    oo0o0O0.OooO0oo(appCompatTextView, this$2.f46105OoooOO0);
                } else {
                    AppCompatTextView appCompatTextView2 = this$2.OooOO0O().f49398OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.selected");
                    oo0o0O0.OooO0oo(appCompatTextView2, this$2.f46104OoooO);
                }
                break;
            default:
                RoomThemeCustomizeVM roomThemeCustomizeVM = (RoomThemeCustomizeVM) this.f31913OooO0O0;
                if (obj != null) {
                    roomThemeCustomizeVM.setCustomImagePath((String) obj);
                    break;
                }
                break;
        }
    }
}
