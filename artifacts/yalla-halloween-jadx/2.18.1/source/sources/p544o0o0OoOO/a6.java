package p544o0o0OoOO;

import com.app.base.mixedroom.model.RoomLoginInformation;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.RoomReNameActivity;
import p034OoooO0O.o0Oo0oo;
import p160o00OoOO0.o00OO0O0;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f44202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f44203OooO0O0;

    public a6(RoomReNameActivity roomReNameActivity, String str) {
        this.f44203OooO0O0 = roomReNameActivity;
        this.f44202OooO00o = str;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        this.f44203OooO0O0.f22959OoooOo0.setBarname(this.f44202OooO00o);
        LiveEventBus.get("RoomName").post(this.f44202OooO00o);
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        RoomLoginInformation value = oooO00o.OooO00o().f43324OooOO0.getValue();
        if (value != null) {
            value.getRoom().setName(this.f44202OooO00o);
        }
        oooO00o.OooO00o().f43317OooO0O0.postValue(this.f44202OooO00o);
        o0Oo0oo.OooO0o0(33, this.f44203OooO0O0.f22959OoooOo0);
        ToastUtil.f12567OooO00o.OooO0O0(this.f44203OooO0O0.getResources().getString(R.string.OK));
        this.f44203OooO0O0.setResult(-1);
        this.f44203OooO0O0.finish();
    }
}
