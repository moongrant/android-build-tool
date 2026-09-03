package p519o0o0O0oO;

import android.view.View;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f53107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f53108OooO0o0;

    public /* synthetic */ q3(Object obj, int i) {
        this.f53107OooO0Oo = i;
        this.f53108OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f53107OooO0Oo;
        Object obj = this.f53108OooO0o0;
        switch (i) {
            case 0:
                w3 this$0 = (w3) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            default:
                SearchLayout this$1 = (SearchLayout) obj;
                int i2 = SearchLayout.f30634OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f30636OooO0Oo.f57529OooO0Oo.setText("");
                Function0<Unit> function0 = this$1.f30639OooO0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
