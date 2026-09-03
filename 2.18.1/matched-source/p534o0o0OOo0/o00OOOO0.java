package p534o0o0OOo0;

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
public final /* synthetic */ class o00OOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43531Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43532Oooo0oO;

    public /* synthetic */ o00OOOO0(Object obj, int i) {
        this.f43531Oooo0o = i;
        this.f43532Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43531Oooo0o) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43532Oooo0oO;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21734Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49707OooO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectWeChat");
                this$0.OooOooO(imageView);
                break;
            case 1:
                TreasureBoxDialog this$1 = (TreasureBoxDialog) this.f43532Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOO0O(2);
                this$1.f23787o000oOoO.f50200OooOOO0.setCurrentItem(2, true);
                break;
            case 2:
                TreasureBoxFragment.m422initView$lambda6((TreasureBoxFragment) this.f43532Oooo0oO, view);
                break;
            default:
                SearchLayout this$2 = (SearchLayout) this.f43532Oooo0oO;
                int i = SearchLayout.f25146o000oOoO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f25148Oooo0o.f49415OooO0Oo.setText("");
                KeyboardExtKt.OooO00o(this$2.f25148Oooo0o.f49415OooO0Oo);
                this$2.OooO0Oo();
                Function0<Unit> function0 = this$2.f25150Oooo0oo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
