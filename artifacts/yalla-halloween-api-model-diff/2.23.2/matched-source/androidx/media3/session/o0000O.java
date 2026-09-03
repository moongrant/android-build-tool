package androidx.media3.session;

import com.yalla.yalla.ui.dialog.RoomLuckyNumberHistoryDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O implements p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9291OooO0o0;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f9290OooO0Oo = i;
        this.f9291OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f9290OooO0Oo;
        Object obj = this.f9291OooO0o0;
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
