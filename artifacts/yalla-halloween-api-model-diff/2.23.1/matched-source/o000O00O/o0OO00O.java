package o000O00O;

import android.view.View;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.fragment.message.MessageListFragment;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00O implements o000OoO.o00000.OooO00o, o0O0OO0, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34129OooO0o0;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f34128OooO0Oo = i;
        this.f34129OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f34129OooO0o0;
        int i = VehicleStoreActivity.f26579OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoOO();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MessageListFragment.initView$lambda$1((MessageListFragment) this.f34129OooO0o0, baseQuickAdapter, view, i);
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34128OooO0Oo;
        Object obj2 = this.f34129OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onMediaMetadataChanged((MediaMetadata) obj2);
                return;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}
