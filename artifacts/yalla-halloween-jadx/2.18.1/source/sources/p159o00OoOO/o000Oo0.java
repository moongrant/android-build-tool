package p159o00OoOO;

import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32463OooO00o;

    public o000Oo0(MixedRoomActivity mixedRoomActivity) {
        this.f32463OooO00o = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            MixedRoomActivity mixedRoomActivity = this.f32463OooO00o;
            if (mixedRoomActivity.f11792o00ooo != null) {
                mixedRoomActivity.Oooo00O();
            }
        }
    }
}
