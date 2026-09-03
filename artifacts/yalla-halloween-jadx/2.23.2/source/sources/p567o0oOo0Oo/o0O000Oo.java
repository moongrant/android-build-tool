package p567o0oOo0Oo;

import android.view.View;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.view.pop.roomExitPop.RoomExitTag;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends OooO<AbsJavaBean, RoomExitTag> {
    public o0O000Oo(MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final float OooO0o() {
        return 0.85f;
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.layout_room_exit_pop;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        getWindow().setWindowAnimations(o000000O.anim_dialog_room_enter_exit);
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.layout_room_exit_pop_bg_layout || id == o0OO00O.layout_room_exit_pop_content_layout) {
            OooOO0(this.f43650OooO0o0, RoomExitTag.bg);
        } else if (id == o0OO00O.layout_room_exit_pop_hook_tv) {
            OooOO0(this.f43650OooO0o0, RoomExitTag.keep);
        } else if (id == o0OO00O.layout_room_exit_pop_exit_tv) {
            OooOO0(this.f43650OooO0o0, RoomExitTag.exit);
        }
    }
}
