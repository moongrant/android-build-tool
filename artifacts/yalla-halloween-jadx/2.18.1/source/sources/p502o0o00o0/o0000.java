package p502o0o00o0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p544o0o0OoOO.b5;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41539Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41540Oooo0oO;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f41539Oooo0o = i;
        this.f41540Oooo0oO = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41539Oooo0o) {
            case 0:
                o0000oo this$0 = (o0000oo) this.f41540Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f41581OoooO00) {
                    this$0.dismiss();
                }
                break;
            case 1:
                MemberListRemoveActivity this$1 = (MemberListRemoveActivity) this.f41540Oooo0oO;
                MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$1);
                oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_remove_dialog_title));
                oo0ooo0.OooOo0O(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_member_remove_dialog_info), String.valueOf(this$1.f22890OooooO0.size())));
                oo0ooo0.OooOo0o(new b5(this$1));
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOOO0();
                break;
            default:
                MainSearchUserFragment.m371initSearchHistory$lambda15((MainSearchUserFragment) this.f41540Oooo0oO, view);
                break;
        }
    }
}
