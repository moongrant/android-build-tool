package p535o0o0OOoO;

import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p034OoooO0O.o0Oo0oo;
import p391o0OOooOo.o0O00000;
import p488o0o000oo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOo0O00 extends o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f43719OooO00o;

    public oOOo0O00(WebActivity webActivity) {
        this.f43719OooO00o = webActivity;
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void CreateRoom() {
        WebActivity webActivity = this.f43719OooO00o;
        webActivity.f22109OoooOo0 = true;
        CreateRoomActivity.f22774Ooooooo.OooO00o(webActivity);
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void buySuccess() {
        WebActivity webActivity = this.f43719OooO00o;
        WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
        Objects.requireNonNull(webActivity);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new oOOo0000(webActivity, null), 3, null);
        o0Oo0oo.OooO0o0(192, null);
    }

    @Override // p488o0o000oo.o0OO00O
    public final void closePage() {
        this.f43719OooO00o.finish();
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void goToRecharge() {
        o0O00000.OooO0OO("Me_award_rechargenow");
        WebPageInfo webPageInfo = this.f43719OooO00o.f22118Oooooo0;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        if (webPageInfo.f21216Oooo0o == WebFrom.FirstChargeRewardUrlWallet) {
            this.f43719OooO00o.finish();
        } else {
            WalletActivity.f23268OoooooO.OooO00o(this.f43719OooO00o, false);
        }
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void onBackPress(boolean z) {
        this.f43719OooO00o.f22116OooooOo = z;
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void rechargePage() {
        goToRecharge();
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void refreshUrl() {
        WebActivity webActivity = this.f43719OooO00o;
        WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
        Objects.requireNonNull(webActivity);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new oOOo0000(webActivity, null), 3, null);
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void showClose(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        if (OooO.OooO00o(show)) {
            HeaderLayout headerLayout = this.f43719OooO00o.f11463OoooO;
            if (headerLayout != null) {
                headerLayout.setNavigationIcon(R.drawable.btn_header_close);
                return;
            }
            return;
        }
        HeaderLayout headerLayout2 = this.f43719OooO00o.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationIcon(R.drawable.btn_return);
        }
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void showOpenInBrowser(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        Menu menu = this.f43719OooO00o.f22117Oooooo;
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.item_web_action_browsers) : null;
        if (menuItemFindItem == null) {
            return;
        }
        menuItemFindItem.setVisible(OooO.OooO00o(show));
    }

    @Override // p488o0o000oo.o00000O
    @JavascriptInterface
    public void showShare(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        Menu menu = this.f43719OooO00o.f22117Oooooo;
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.item_web_action_share) : null;
        if (menuItemFindItem == null) {
            return;
        }
        menuItemFindItem.setVisible(OooO.OooO00o(show));
    }
}
