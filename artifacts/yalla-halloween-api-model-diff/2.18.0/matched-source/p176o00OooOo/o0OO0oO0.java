package p176o00OooOo;

import android.view.View;
import android.widget.EditText;
import com.app.base.view.SearchView;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO0oO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32764Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32765OoooO00;

    public /* synthetic */ o0OO0oO0(Object obj, int i) {
        this.f32764Oooo = i;
        this.f32765OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32764Oooo) {
            case 0:
                SearchView this$0 = (SearchView) this.f32765OoooO00;
                int i = SearchView.f12089OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f12090Oooo;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                Function0<Unit> function0 = this$0.f12103OooooO0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Function0 function1 = (Function0) this.f32765OoooO00;
                int i2 = MemberRemoveLayout.f24878OoooO00;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
        }
    }
}
