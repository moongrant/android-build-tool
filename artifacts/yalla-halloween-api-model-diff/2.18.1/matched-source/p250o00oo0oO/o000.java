package p250o00oo0oO;

import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p502o0o00o0.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34192Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34193Oooo0oO;

    public /* synthetic */ o000(Object obj, int i) {
        this.f34192Oooo0o = i;
        this.f34193Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34192Oooo0o) {
            case 0:
                o000O000 this$0 = (o000O000) this.f34193Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f34202OooO0Oo) {
                    this$0.OooO0OO();
                }
                break;
            default:
                o0000O0 this$1 = (o0000O0) this.f34193Oooo0oO;
                int i = o0000O0.f41562OoooO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Dialog dialog = this$1.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
