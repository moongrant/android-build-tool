package p505o0o00oO;

import android.view.View;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p565o0oOo000.o000OOo;
import p675oO0Oo.d7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f50444OooO0o0;

    public /* synthetic */ o0O0O00(int i, View.OnClickListener onClickListener) {
        this.f50443OooO0Oo = i;
        this.f50444OooO0o0 = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50443OooO0Oo;
        View.OnClickListener onClickListener = this.f50444OooO0o0;
        switch (i) {
            case 0:
                PremiumActivity this$0 = (PremiumActivity) onClickListener;
                int i2 = PremiumActivity.f26674Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o000O o000o = new o000O(this$0);
                o000o.OooOOoo(o000OOo.vip3vip4_to_vip2vip1);
                o000o.OooOO0o();
                break;
            default:
                d7 this$1 = (d7) onClickListener;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
