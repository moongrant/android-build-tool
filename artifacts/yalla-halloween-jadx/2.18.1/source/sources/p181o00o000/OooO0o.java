package p181o00o000;

import android.app.Activity;
import android.view.View;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.weieyu.yalla.R;
import p147o00Oo00o.oo0o0Oo;
import p184o00o000o.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends oo0o0Oo<RoomConfiguration, View> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOo f32957OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooOo f32958OoooO0O;

    public OooO0o(Activity activity) {
        super(activity, R.id.activity_mixed_room_gift_run_way_layout);
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0O0() {
        View view = this.f32957OoooO0.f32161Oooo0o;
        if (view != null) {
            view.setFocusable(false);
            view.setClickable(false);
        }
        View view2 = this.f32958OoooO0O.f32161Oooo0o;
        if (view2 != null) {
            view2.setFocusable(false);
            view2.setClickable(false);
        }
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0OO() {
        this.f32957OoooO0 = new OooOo(this.f32162Oooo0oO, R.id.include_room_gift_run_way_layout_gift_run_way_top);
        this.f32958OoooO0O = new OooOo(this.f32162Oooo0oO, R.id.include_room_gift_run_way_layout_gift_run_way_bottom);
        OooO0O0();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        view.getId();
    }
}
