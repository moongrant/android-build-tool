package p159o00OoOO;

import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o implements Observer<RoomConfiguration> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32455OooO00o;

    public o000O0o(MixedRoomActivity mixedRoomActivity) {
        this.f32455OooO00o = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(RoomConfiguration roomConfiguration) {
        MixedRoomActivity mixedRoomActivity = this.f32455OooO00o;
        int i = MixedRoomActivity.f11764o00000oO;
        mixedRoomActivity.Oooo0();
    }
}
