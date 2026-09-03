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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31395Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31396OoooO00;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f31395Oooo = i;
        this.f31396OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super ChatModel, Unit> function1;
        switch (this.f31395Oooo) {
            case 0:
                OooOO0O this$0 = (OooOO0O) this.f31396OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel chatModel = this$0.f31415OooOOOo;
                if (chatModel != null && (function1 = this$0.f31406OooO0o0) != null) {
                    function1.invoke(chatModel);
                    break;
                }
                break;
            case 1:
                ((SearchFriendActivity) this.f31396OoooO00).f22218Ooooo00.setText("");
                break;
            case 2:
                BadgeFragment.m314showPopupWindow$lambda9((BadgeFragment) this.f31396OoooO00, view);
                break;
            case 3:
                WalletCoinFragment.m435iniView$lambda14((WalletCoinFragment) this.f31396OoooO00, view);
                break;
            default:
                Function0 function0 = (Function0) this.f31396OoooO00;
                int i = ThemeLayout.f25234OoooO00;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
