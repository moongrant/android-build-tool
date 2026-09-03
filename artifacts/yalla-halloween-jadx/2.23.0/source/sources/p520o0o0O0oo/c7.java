package p520o0o0O0oo;

import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import java.util.List;
import p553o0oOOoo.o0oO0O0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 implements o0oO0O0o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List<GiftSendFragment> f53261OooO00o;

    public c7(List<GiftSendFragment> list) {
        this.f53261OooO00o = list;
    }

    @Override // o0oOOoo.o0oO0O0o.OooO0O0
    public final void OooO00o(int i) {
        if (this.f53261OooO00o.get(i).getPageTypeUser() == GiftPropTypeUser.Member.getValue()) {
            o0OO000.OooO00o("102045");
        }
    }
}
