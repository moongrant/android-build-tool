package o00OO0O0;

import android.view.View;
import com.app.base.model.ChatModel;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31377Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31378Oooo0oO;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f31377Oooo0o = i;
        this.f31378Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super ChatModel, Unit> function1;
        switch (this.f31377Oooo0o) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f31378Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel chatModel = this$0.f31397OooOOOo;
                if (chatModel != null && (function1 = this$0.f31388OooO0o0) != null) {
                    function1.invoke(chatModel);
                    break;
                }
                break;
            case 1:
                ((SearchFriendActivity) this.f31378Oooo0oO).f22199OoooOo0.setText("");
                break;
            case 2:
                BadgeFragment.m314showPopupWindow$lambda9((BadgeFragment) this.f31378Oooo0oO, view);
                break;
            case 3:
                WalletCoinFragment.m435iniView$lambda14((WalletCoinFragment) this.f31378Oooo0oO, view);
                break;
            default:
                Function0 function0 = (Function0) this.f31378Oooo0oO;
                int i = ThemeLayout.f25215Oooo0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
