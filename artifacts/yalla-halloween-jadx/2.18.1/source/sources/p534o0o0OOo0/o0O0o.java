package p534o0o0OOo0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43559Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43560Oooo0oO;

    public /* synthetic */ o0O0o(Object obj, int i) {
        this.f43559Oooo0o = i;
        this.f43560Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43559Oooo0o) {
            case 0:
                DeleteAccountSubmitActivity this$0 = (DeleteAccountSubmitActivity) this.f43560Oooo0oO;
                DeleteAccountSubmitActivity.OooO00o oooO00o = DeleteAccountSubmitActivity.f21745Ooooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00000.OooO0OO("Me_account_delete_delete");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.account_delete_account_confirm_dialog2_title));
                oo0ooo0.OooOo0(R.string.delete_account_confirm_content2);
                oo0ooo0.OooOOOo(R.string.Continue_);
                oo0ooo0.OooOo0o(new o0(this$0));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
            case 1:
                WebActivity this$1 = (WebActivity) this.f43560Oooo0oO;
                WebActivity.OooO00o oooO00o2 = WebActivity.f22108OoooooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 2:
                UserDefaultHeadActivity this$2 = (UserDefaultHeadActivity) this.f43560Oooo0oO;
                UserDefaultHeadActivity.OooO00o oooO00o3 = UserDefaultHeadActivity.f23427Oooooo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                UserDefaultHeadListModel.UserDefaultHeadItemModel userDefaultHeadItemModel = this$2.f23431OooooO0;
                if (userDefaultHeadItemModel != null) {
                    this$2.OooOooO(userDefaultHeadItemModel);
                }
                break;
            case 3:
                TreasureBoxOpenDialog this$3 = (TreasureBoxOpenDialog) this.f43560Oooo0oO;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                this$3.OooO0O0();
                break;
            case 4:
                TreasureBoxFragment.m423initView$lambda8((TreasureBoxFragment) this.f43560Oooo0oO, view);
                break;
            default:
                SearchLayout this$4 = (SearchLayout) this.f43560Oooo0oO;
                int i = SearchLayout.f25146o000oOoO;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                this$4.f25148Oooo0o.f49415OooO0Oo.setText("");
                Function0<Unit> function0 = this$4.clearListener;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
