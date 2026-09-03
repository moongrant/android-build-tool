package p504o0o00o0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p546o0o0OoOO.a5;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41558Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41559OoooO00;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f41558Oooo = i;
        this.f41559OoooO00 = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41558Oooo) {
            case 0:
                o0000oo this$0 = (o0000oo) this.f41559OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f41598OoooO) {
                    this$0.dismiss();
                }
                break;
            case 1:
                MemberListRemoveActivity this$1 = (MemberListRemoveActivity) this.f41559OoooO00;
                MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22905Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$1);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_remove_dialog_title));
                oo0ooo0.OooOo0O(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_member_remove_dialog_info), String.valueOf(this$1.f22910Oooooo0.size())));
                oo0ooo0.OooOo0o(new a5(this$1));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
            default:
                MainSearchUserFragment.m371initSearchHistory$lambda15((MainSearchUserFragment) this.f41559OoooO00, view);
                break;
        }
    }
}
