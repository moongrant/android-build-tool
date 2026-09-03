package o00OO0;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.MomentBarGetServerIpModel;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31173OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f31174OooO0O0;

    public OooO(OooOO0 oooOO1, int i) {
        this.f31174OooO0O0 = oooOO1;
        this.f31173OooO00o = i;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        MomentBarGetServerIpModel momentBarGetServerIpModel = (MomentBarGetServerIpModel) o0Oo0oo.OooO0O0(str, MomentBarGetServerIpModel.class);
        if (momentBarGetServerIpModel != null && com.yalla.support.common.util.OooO0OO.OooO0O0(Long.valueOf(momentBarGetServerIpModel.getRoomid())) && com.yalla.support.common.util.OooO0OO.OooO0O0(momentBarGetServerIpModel.getRoomserverip())) {
            this.f31174OooO0O0.OooO00o(momentBarGetServerIpModel.getRoomid(), momentBarGetServerIpModel.getRoomserverip(), this.f31173OooO00o);
        }
    }
}
