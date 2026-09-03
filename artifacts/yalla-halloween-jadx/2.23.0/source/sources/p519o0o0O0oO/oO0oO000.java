package p519o0o0O0oO;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0oO000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f52900OooO0o0;

    public /* synthetic */ oO0oO000(Fragment fragment, int i) {
        this.f52899OooO0Oo = i;
        this.f52900OooO0o0 = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f52899OooO0Oo;
        Fragment fragment = this.f52900OooO0o0;
        switch (i) {
            case 0:
                oOO00000 ooo00000 = (oOO00000) fragment;
                ooo00000.f52919OooO0Oo.isSelectedForSendHats().setValue(Boolean.valueOf(!ooo00000.f52919OooO0Oo.isSelectedForSendHats().getValue().booleanValue()));
                if (ooo00000.f52919OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
                    ooo00000.f52932OooOOo0.setBorderColor(o0000.OooO00o(oO00O0o.color_00d8c9));
                } else {
                    ooo00000.f52932OooOOo0.setBorderColor(o0000.OooO00o(oO00O0o.transparent));
                }
                ooo00000.OooO0OO();
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$1((RoomInfoMemberListFragment) fragment, view);
                break;
        }
    }
}
