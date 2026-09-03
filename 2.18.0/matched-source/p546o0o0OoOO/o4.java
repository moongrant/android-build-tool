package p546o0o0OoOO;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p581o0oOoOOo.oOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44299Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44300OoooO00;

    public /* synthetic */ o4(Object obj, int i) {
        this.f44299Oooo = i;
        this.f44300OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44299Oooo) {
            case 0:
                MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f44300OoooO00;
                int i = MemberListConveneActivity.f22879o00Oo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_convene_dialog_title));
                oo0ooo0.OooOo0(R.string.room_member_convene_dialog_content);
                oo0ooo0.OooOo0o(new w4(this$0));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
            default:
                oOO this$1 = (oOO) this.f44300OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
