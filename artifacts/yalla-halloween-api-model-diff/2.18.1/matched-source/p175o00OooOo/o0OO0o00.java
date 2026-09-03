package p175o00OooOo;

import android.view.View;
import android.widget.EditText;
import com.app.base.view.SearchView;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO0o00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32745Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32746Oooo0oO;

    public /* synthetic */ o0OO0o00(Object obj, int i) {
        this.f32745Oooo0o = i;
        this.f32746Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32745Oooo0o) {
            case 0:
                SearchView this$0 = (SearchView) this.f32746Oooo0oO;
                int i = SearchView.f12074OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f12076Oooo0o;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                Function0<Unit> function0 = this$0.f12088OoooOoo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Function0 function1 = (Function0) this.f32746Oooo0oO;
                int i2 = MemberRemoveLayout.f24859Oooo0oO;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
        }
    }
}
