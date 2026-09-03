package androidx.media3.ui;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6571OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6572OooO0o0;

    public /* synthetic */ OooOo(Object obj, int i) {
        this.f6571OooO0Oo = i;
        this.f6572OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6571OooO0Oo;
        Object obj = this.f6572OooO0o0;
        switch (i) {
            case 0:
                ((PlayerControlView.OooOO0O) obj).f6652OooO0OO.getClass();
                break;
            default:
                com.code.android.easydialog.OooO this$0 = (com.code.android.easydialog.OooO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f10136OooO0Oo) {
                    this$0.f10134OooO0O0.cancel();
                }
                break;
        }
    }
}
