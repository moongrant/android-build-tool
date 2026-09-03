package p561o0oOo00O;

import android.view.View;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.view.pop.roomExitPop.RoomExitTag;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes5.dex */
public final class oo000o extends OooOO0<AbsJavaBean, RoomExitTag> {
    public oo000o(MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final float OooO0o() {
        return 0.85f;
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.layout_room_exit_pop;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        getWindow().setWindowAnimations(oO00Oo00.anim_dialog_room_enter_exit);
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.layout_room_exit_pop_bg_layout || id == oO00O0oO.layout_room_exit_pop_content_layout) {
            OooOO0(this.f44398OooO0o0, RoomExitTag.bg);
        } else if (id == oO00O0oO.layout_room_exit_pop_hook_tv) {
            OooOO0(this.f44398OooO0o0, RoomExitTag.keep);
        } else if (id == oO00O0oO.layout_room_exit_pop_exit_tv) {
            OooOO0(this.f44398OooO0o0, RoomExitTag.exit);
        }
    }
}
