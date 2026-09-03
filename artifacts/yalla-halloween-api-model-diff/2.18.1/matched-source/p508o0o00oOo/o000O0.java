package p508o0o00oOo;

import android.view.View;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoOOo.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41821Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41822Oooo0oO;

    public /* synthetic */ o000O0(Object obj, int i) {
        this.f41821Oooo0o = i;
        this.f41822Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41821Oooo0o) {
            case 0:
                SetLuckyNumberLayout this$0 = (SetLuckyNumberLayout) this.f41822Oooo0oO;
                int i = SetLuckyNumberLayout.f21014OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0(3);
                this$0.OooO0OO(3);
                break;
            default:
                y this$1 = (y) this.f41822Oooo0oO;
                int i2 = y.f46365OoooOOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
        }
    }
}
