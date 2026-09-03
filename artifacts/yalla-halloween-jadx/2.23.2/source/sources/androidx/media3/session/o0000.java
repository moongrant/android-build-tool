package androidx.media3.session;

import androidx.media3.common.Player;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000 implements o000OoO.o00000O0.OooO00o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9281OooO0Oo;

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        SearchFriendActivity this$0 = (SearchFriendActivity) this.f9281OooO0Oo;
        int i = SearchFriendActivity.f25264OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo0(false);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onShuffleModeEnabledChanged(((o00O00O) this.f9281OooO0Oo).f9374OooOO0o);
    }
}
