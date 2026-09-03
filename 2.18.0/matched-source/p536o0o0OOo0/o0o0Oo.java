package p536o0o0OOo0;

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
public final /* synthetic */ class o0o0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43611Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43612OoooO00;

    public /* synthetic */ o0o0Oo(Object obj, int i) {
        this.f43611Oooo = i;
        this.f43612OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43611Oooo) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43612OoooO00;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21753Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49652OooO0oo;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectTwitter");
                this$0.OooOooO(imageView);
                break;
            case 1:
                TreasureBoxDialog this$1 = (TreasureBoxDialog) this.f43612OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOO0O(1);
                this$1.f23805OoooOo0.f50137OooOOO0.setCurrentItem(1, true);
                break;
            default:
                SearchLayout this$2 = (SearchLayout) this.f43612OoooO00;
                int i = SearchLayout.f25165OoooOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f25166Oooo.f49352OooO0Oo.setText("");
                this$2.f25166Oooo.f49352OooO0Oo.requestFocus();
                this$2.OooO0O0(true);
                KeyboardExtKt.OooO0O0(this$2.f25166Oooo.f49352OooO0Oo);
                Function1<? super Boolean, Unit> function1 = this$2.f25173OoooOOo;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(this$2.f25174o000oOoO));
                }
                break;
        }
    }
}
