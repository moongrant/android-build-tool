package p650o0ooo;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58250OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f58251OooO0o0;

    public /* synthetic */ h(Object obj, int i) {
        this.f58250OooO0Oo = i;
        this.f58251OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58250OooO0Oo;
        Object obj = this.f58251OooO0o0;
        switch (i) {
            case 0:
                j this$0 = (j) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f58288OooOOO.invoke(this$0.f58289OooOOO0);
                this$0.dismiss();
                break;
            default:
                SearchView this$1 = (SearchView) obj;
                int i2 = SearchView.f30100OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EditText editText = this$1.f30102OooO0Oo;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                Function0<Unit> function0 = this$1.clearListener;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
