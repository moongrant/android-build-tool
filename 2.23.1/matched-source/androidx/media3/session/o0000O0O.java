package androidx.media3.session;

import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O0O implements o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9305OooO0o0;

    public /* synthetic */ o0000O0O(Object obj, int i) {
        this.f9304OooO0Oo = i;
        this.f9305OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f9304OooO0Oo;
        Object obj = this.f9305OooO0o0;
        switch (i) {
            case 1:
                RoomLuckyNumberHistoryDialog this$0 = (RoomLuckyNumberHistoryDialog) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOO(false);
                break;
            default:
                MainRoomPopularFragment.initView$lambda$0((MainRoomPopularFragment) obj);
                break;
        }
    }
}
