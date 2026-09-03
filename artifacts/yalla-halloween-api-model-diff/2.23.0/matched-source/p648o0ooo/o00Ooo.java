package p648o0ooo;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ThemeLayout;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f59764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f59765OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f59764OooO0Oo = i;
        this.f59765OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f59764OooO0Oo;
        Object obj = this.f59765OooO0o0;
        switch (i) {
            case 0:
                oo000o.OooO00o this$0 = (oo000o.OooO00o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout constraintLayout = this$0.OooOO0().f59119OooO0OO;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutBg");
                OooO00o.OooO0OO(this$0.f59789OooOO0O, PermissionGroupReveal.f32884OooO0o0, null, new o0ooOOo(this$0, constraintLayout));
                break;
            default:
                Function0 function0 = (Function0) obj;
                int i2 = ThemeLayout.f30758OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
