package p534o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43533Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43534Oooo0oO;

    public /* synthetic */ o00OOOOo(Object obj, int i) {
        this.f43533Oooo0o = i;
        this.f43534Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43533Oooo0o) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43534Oooo0oO;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21734Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49715OooO0oo;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectTwitter");
                this$0.OooOooO(imageView);
                break;
            case 1:
                TreasureBoxDialog this$1 = (TreasureBoxDialog) this.f43534Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOO0O(1);
                this$1.f23787o000oOoO.f50200OooOOO0.setCurrentItem(1, true);
                break;
            default:
                SearchLayout this$2 = (SearchLayout) this.f43534Oooo0oO;
                int i = SearchLayout.f25146o000oOoO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f25148Oooo0o.f49415OooO0Oo.setText("");
                this$2.f25148Oooo0o.f49415OooO0Oo.requestFocus();
                this$2.OooO0O0(true);
                KeyboardExtKt.OooO0O0(this$2.f25148Oooo0o.f49415OooO0Oo);
                Function1<? super Boolean, Unit> function1 = this$2.f25155OoooOO0;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this$2.f25154OoooO0O));
                }
                break;
        }
    }
}
