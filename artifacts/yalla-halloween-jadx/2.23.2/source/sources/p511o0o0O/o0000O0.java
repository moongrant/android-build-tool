package p511o0o0O;

import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import java.util.List;
import o0oo0000.OooO00o;
import p563o0oOo00O.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 implements o0O0O00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<GiftSendFragment> f51000OooO00o;

    public o0000O0(List<GiftSendFragment> list) {
        this.f51000OooO00o = list;
    }

    @Override // o0oOo00O.o0O0O00.OooO0O0
    public final void OooO00o(int i) {
        if (this.f51000OooO00o.get(i).getPageTypeUser() == GiftPropTypeUser.Member.getValue()) {
            OooO00o.OooO0O0("102045");
        }
    }
}
