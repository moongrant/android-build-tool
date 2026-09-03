package p251o00oo0oO;

import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import p504o0o00o0.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34214Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34215OoooO00;

    public /* synthetic */ o000(Object obj, int i) {
        this.f34214Oooo = i;
        this.f34215OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34214Oooo) {
            case 0:
                o000O000 this$0 = (o000O000) this.f34215OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f34224OooO0Oo) {
                    this$0.OooO0OO();
                }
                break;
            default:
                o0000O0 this$1 = (o0000O0) this.f34215OoooO00;
                int i = o0000O0.f41581o000oOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Dialog dialog = this$1.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
