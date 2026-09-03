package p544o0o0OoOO;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p579o0oOoOOo.oOOO000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p4 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44290Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44291Oooo0oO;

    public /* synthetic */ p4(Object obj, int i) {
        this.f44290Oooo0o = i;
        this.f44291Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44290Oooo0o) {
            case 0:
                MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f44291Oooo0oO;
                int i = MemberListConveneActivity.f22860o0OoOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_convene_dialog_title));
                oo0ooo0.OooOo0(R.string.room_member_convene_dialog_content);
                oo0ooo0.OooOo0o(new x4(this$0));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
            default:
                oOOO000o this$1 = (oOOO000o) this.f44291Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
