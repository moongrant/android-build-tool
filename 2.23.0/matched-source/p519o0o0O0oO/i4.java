package p519o0o0O0oO;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i4 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f52363OooO0o0;

    public /* synthetic */ i4(Object obj, int i) {
        this.f52362OooO0Oo = i;
        this.f52363OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f52362OooO0Oo;
        Object obj = this.f52363OooO0o0;
        switch (i) {
            case 0:
                TreasureBoxOpenDialog this$0 = (TreasureBoxOpenDialog) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            default:
                SearchView this$1 = (SearchView) obj;
                int i2 = SearchView.f30645OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditText editText = this$1.f30647OooO0Oo;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                Function0<Unit> function0 = this$1.f30659OooOOo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
