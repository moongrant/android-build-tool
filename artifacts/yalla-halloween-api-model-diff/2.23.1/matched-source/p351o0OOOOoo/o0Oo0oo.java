package p351o0OOOOoo;

import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import p426o0OoO0Oo.oo0oOO0;
import p492o0o00O0O.o000OOo;
import p492o0o00O0O.o0O0O00;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0Oo0oo implements ObservableScrollView.OooO00o, o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f42853OooO0o0;

    public /* synthetic */ o0Oo0oo(KeyEvent.Callback callback, int i) {
        this.f42852OooO0Oo = i;
        this.f42853OooO0o0 = callback;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f42852OooO0Oo;
        KeyEvent.Callback callback = this.f42853OooO0o0;
        switch (i) {
            case 1:
                BlackListActivity this$0 = (BlackListActivity) callback;
                int i2 = BlackListActivity.f24915OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                oo0oOO0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o0O0O00(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new o000OOo(this$0, false)));
                break;
            default:
                BanEnterRoomListActivity this$1 = (BanEnterRoomListActivity) callback;
                int i3 = BanEnterRoomListActivity.f26015OooOooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f26026OooOoOO) {
                    this$1.OooOo0O(false);
                } else {
                    this$1.OooOo0o(this$1.f26027OooOoo, false);
                }
                break;
        }
    }
}
