package p519o0o0O0oO;

import android.view.View;
import com.yalla.yalla.ext.KeyboardExtKt;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j2 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f52377OooO0o0;

    public /* synthetic */ j2(Object obj, int i) {
        this.f52376OooO0Oo = i;
        this.f52377OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f52376OooO0Oo;
        Object obj = this.f52377OooO0o0;
        switch (i) {
            case 0:
                o00O00OO this_apply = (o00O00OO) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
            default:
                SearchLayout this$0 = (SearchLayout) obj;
                int i2 = SearchLayout.f30634OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f30636OooO0Oo.f57529OooO0Oo.setText("");
                KeyboardExtKt.OooO00o(this$0.f30636OooO0Oo.f57529OooO0Oo);
                this$0.OooO0OO();
                Function0<Unit> function0 = this$0.f30637OooO0o;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
