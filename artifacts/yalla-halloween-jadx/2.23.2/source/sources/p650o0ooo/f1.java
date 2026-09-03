package p650o0ooo;

import android.view.View;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f58212OooO0o0;

    public /* synthetic */ f1(Object obj, int i) {
        this.f58211OooO0Oo = i;
        this.f58212OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f58211OooO0Oo;
        Object obj = this.f58212OooO0o0;
        switch (i) {
            case 0:
                h1 this$0 = (h1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            default:
                Function0 function0 = (Function0) obj;
                int i2 = ThemeLayout.f30213OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
