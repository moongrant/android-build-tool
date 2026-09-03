package p476o0o0000o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000Oo0 f47602OooO0Oo = new o000Oo0();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MixedRoomDataSource.OooO0o0().f23459OooO0Oo.obtainMessage(10008010, 1, 0, obj).sendToTarget();
    }
}
