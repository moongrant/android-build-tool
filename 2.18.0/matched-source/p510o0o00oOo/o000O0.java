package p510o0o00oOo;

import android.view.View;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.x;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41840Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41841OoooO00;

    public /* synthetic */ o000O0(Object obj, int i) {
        this.f41840Oooo = i;
        this.f41841OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41840Oooo) {
            case 0:
                SetLuckyNumberLayout this$0 = (SetLuckyNumberLayout) this.f41841OoooO00;
                int i = SetLuckyNumberLayout.f21033OoooOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0(3);
                this$0.OooO0OO(3);
                break;
            default:
                x this$1 = (x) this.f41841OoooO00;
                int i2 = x.f46378OoooOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.dismiss();
                break;
        }
    }
}
