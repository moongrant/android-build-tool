package p203o00o0o0o;

import android.support.v4.media.session.OooO0o;
import android.view.View;
import android.widget.PopupWindow;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.OooOO0O;
import p028Oooo0oO.o00O0000;
import p245o00oo0o.o00O;
import p539o0o0OoOO.b3;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO000 implements o00O.OooO00o, o000oOoO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39202OooO0Oo;

    public /* synthetic */ o00OO000(Object obj) {
        this.f39202OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        OooOO0O oooOO0O = (OooOO0O) this.f39202OooO0Oo;
        oooOO0O.f60389OooOOo = false;
        List<T> list = oooOO0O.f60387OooOOOO.f10111OooOOoo;
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) list.get(list.size() - 1);
        long jLongValue = roomUserInfoModel.getPriority().getValue().longValue();
        long jLongValue2 = roomUserInfoModel.getUserId().getValue().longValue();
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10055, OooO0o.OooO0O0(o00O0000.OooO00o("{\"prioritid\":", jLongValue, ",\"kind\":1,\"userid\":"), jLongValue2, "}"));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        b3 this$0 = (b3) this.f39202OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Model, Unit> function1 = this$0.f55470OooO0oo;
        if (function1 != 0) {
            function1.invoke((Object) baseQuickAdapter.OooOOO(i));
        }
        PopupWindow popupWindow = this$0.f55466OooO0Oo;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMetadata((Metadata) this.f39202OooO0Oo);
    }
}
