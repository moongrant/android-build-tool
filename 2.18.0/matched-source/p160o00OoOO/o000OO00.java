package p160o00OoOO;

import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomService;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO00 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o000OO00 f32480OooO0O0 = new o000OO00(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o000OO00 f32481OooO0OO = new o000OO00(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32482OooO00o;

    public /* synthetic */ o000OO00(int i) {
        this.f32482OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32482OooO00o) {
            case 0:
                int i = MixedRoomService.f11842OoooOoO;
                o000O00O.OooO().f32449Oooo.obtainMessage(10008010, 1, 0, obj).sendToTarget();
                break;
            default:
                SharedMainMessageManager.m266_get_storeDot_$lambda22$lambda19((Boolean) obj);
                break;
        }
    }
}
