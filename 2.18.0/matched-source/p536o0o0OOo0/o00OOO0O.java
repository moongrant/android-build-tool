package p536o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43549Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43550OoooO00;

    public /* synthetic */ o00OOO0O(Object obj, int i) {
        this.f43549Oooo = i;
        this.f43550OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43549Oooo) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43550OoooO00;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21753Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49644OooO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectWeChat");
                this$0.OooOooO(imageView);
                break;
            case 1:
                TreasureBoxDialog this$1 = (TreasureBoxDialog) this.f43550OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOO0O(2);
                this$1.f23805OoooOo0.f50137OooOOO0.setCurrentItem(2, true);
                break;
            case 2:
                TreasureBoxFragment.m422initView$lambda6((TreasureBoxFragment) this.f43550OoooO00, view);
                break;
            default:
                SearchLayout this$2 = (SearchLayout) this.f43550OoooO00;
                int i = SearchLayout.f25165OoooOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f25166Oooo.f49352OooO0Oo.setText("");
                KeyboardExtKt.OooO00o(this$2.f25166Oooo.f49352OooO0Oo);
                this$2.OooO0Oo();
                Function0<Unit> function0 = this$2.f25168OoooO0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
