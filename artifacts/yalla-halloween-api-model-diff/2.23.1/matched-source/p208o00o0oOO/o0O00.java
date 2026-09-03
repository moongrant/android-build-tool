package p208o00o0oOO;

import android.view.View;
import com.code.android.yldialog.timechoose.OooO00o;
import com.yalla.yalla.mixedroom.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.internal.Intrinsics;
import p585o0oOoo00.o00000OO;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39625OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39626OooO0o0;

    public /* synthetic */ o0O00(Object obj, int i) {
        this.f39625OooO0Oo = i;
        this.f39626OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f39625OooO0Oo;
        Object obj = this.f39626OooO0o0;
        switch (i) {
            case 0:
                OooO00o this$0 = (OooO00o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
                break;
            default:
                LoginActivity this$1 = (LoginActivity) obj;
                int i2 = LoginActivity.f24734OooOo0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                h0.OooO0O0("101060");
                o00000OO.f56622OooO0oO.observe(this$1, new OooO0O0(this$1, 1));
                break;
        }
    }
}
