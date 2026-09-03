package p180o00o00;

import android.app.Activity;
import android.view.View;
import com.app.base.bean.AbsJavaBean;
import com.app.base.view.pop.roomExitPop.RoomExitTag;
import com.weieyu.yalla.R;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends OooO0O0<AbsJavaBean, RoomExitTag> {
    public OooO0OO(Activity activity) {
        super(activity, 0);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final float OooO0o() {
        return 0.85f;
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.layout_room_exit_pop;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        getWindow().setWindowAnimations(R.style.anim_dialog_room_enter_exit);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.layout_room_exit_pop_bg_layout || id == R.id.layout_room_exit_pop_content_layout) {
            OooOO0(RoomExitTag.bg);
        } else if (id == R.id.layout_room_exit_pop_hook_tv) {
            OooOO0(RoomExitTag.keep);
        } else if (id == R.id.layout_room_exit_pop_exit_tv) {
            OooOO0(RoomExitTag.exit);
        }
    }
}
