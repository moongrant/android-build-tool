package p492o0o00O0O;

import android.view.View;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p510o0o00oo0.oOO00000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0ooOOo implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49043OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f49042OooO0Oo = i;
        this.f49043OooO0o0 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f49042OooO0Oo;
        Object obj = this.f49043OooO0o0;
        switch (i) {
            case 0:
                AboutActivity context = (AboutActivity) obj;
                int i2 = AboutActivity.f24900OooOoOO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(context, "context");
                return true;
            default:
                oOO00000 this$0 = (oOO00000) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f50614OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
        }
    }
}
