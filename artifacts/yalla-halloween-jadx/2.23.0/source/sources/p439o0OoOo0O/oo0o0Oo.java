package p439o0OoOo0O;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46110OooO0Oo;

    public oo0o0Oo(RoomFrameUIController roomFrameUIController) {
        this.f46110OooO0Oo = roomFrameUIController;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        Looper.myQueue().addIdleHandler(this.f46110OooO0Oo.f23551OooO0oo);
    }
}
