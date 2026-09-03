package p487o0o00O;

import android.view.View;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p509o0o00ooO.m4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00Oo0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48831OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f48830OooO0Oo = i;
        this.f48831OooO0o0 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f48830OooO0Oo;
        Object obj = this.f48831OooO0o0;
        switch (i) {
            case 0:
                AboutActivity context = (AboutActivity) obj;
                int i2 = AboutActivity.f24899OooOoOO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(context, "context");
                return true;
            default:
                m4 this$0 = (m4) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Boolean> function0 = this$0.f50753OooO0Oo;
                if (function0 == null) {
                    return false;
                }
                function0.invoke();
                return false;
        }
    }
}
