package p208o00o0oOO;

import android.graphics.Typeface;
import android.view.View;
import com.code.android.yldialog.timechoose.OooO0OO;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p590o0oOooo0.oOO0Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OoO00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39639OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39640OooO0o0;

    public /* synthetic */ o0OoO00O(Object obj, int i) {
        this.f39639OooO0Oo = i;
        this.f39640OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f39639OooO0Oo;
        Object obj = this.f39640OooO0o0;
        switch (i) {
            case 0:
                OooO0OO this$0 = (OooO0OO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Lazy lazy = o0O000o0.f39631OooO00o;
                long jOooO0O0 = o0O000o0.OooO0O0(this$0.f13546OooOOO);
                Function1<? super Long, Unit> function1 = this$0.f13551OooOOo0;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(jOooO0O0));
                }
                this$0.OooO0OO();
                break;
            default:
                PasswordActivity this$1 = (PasswordActivity) obj;
                int i2 = PasswordActivity.f24770OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO0().f44208OooO0OO.setText("");
                this$1.OooOoO0().f44208OooO0OO.setTypeface(Typeface.MONOSPACE);
                oOO0Oo00.OooO0Oo(this$1.OooOoO0().f44208OooO0OO);
                break;
        }
    }
}
