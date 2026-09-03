package p501o0o00o;

import com.yalla.yalla.common.ui.fragment.GiftSendFragment;
import com.yalla.yalla.model.GiftPropTypeUser;
import java.util.List;
import p183o00o000O.OooO0O0;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O implements OooO0O0.InterfaceC0348OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<GiftSendFragment> f41466OooO00o;

    public o000O00O(List<GiftSendFragment> list) {
        this.f41466OooO00o = list;
    }

    @Override // p183o00o000O.OooO0O0.InterfaceC0348OooO0O0
    public final void OooO00o(int i) {
        if (this.f41466OooO00o.get(i).getPageType() == GiftPropTypeUser.Member.getValue()) {
            OooOo.OooO0O0("102045");
        }
    }
}
