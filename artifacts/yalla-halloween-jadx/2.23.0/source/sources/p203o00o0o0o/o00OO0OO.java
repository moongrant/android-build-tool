package p203o00o0o0o;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO0OO implements o00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39205OooO0Oo;

    public /* synthetic */ o00OO0OO(Object obj) {
        this.f39205OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomSettingActivity this$0 = (RoomSettingActivity) this.f39205OooO0Oo;
        int i2 = RoomSettingActivity.f26645Oooo00O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO((RoomItemInfoModel) this$0.f26649OooOo00.get(i), i);
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onVideoSizeChanged((o0oOOo) this.f39205OooO0Oo);
    }
}
