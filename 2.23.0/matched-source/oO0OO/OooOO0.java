package oO0OO;

import android.view.View;
import android.widget.RadioButton;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f60384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f60385OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f60384OooO0Oo = i;
        this.f60385OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f60384OooO0Oo;
        Object obj = this.f60385OooO0o0;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                int i2 = OooOO0O.f60386OooOo0;
                boolean z = !zArr[0];
                zArr[0] = z;
                ((RadioButton) view).setChecked(z);
                break;
            default:
                Function0 function0 = (Function0) obj;
                int i3 = ThemeLayout.f30758OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
