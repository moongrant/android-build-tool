package p143o00OOooo;

import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.app.base.mixedroom.MixedRoomService;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.TopRankResponse;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p445o0OoOo0o.o0O0o000;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.o00OO000;
import p530o0o0OOO.o00OO00O;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32004OooO0O0;

    public /* synthetic */ o00O0OO(Object obj, int i) {
        this.f32003OooO00o = i;
        this.f32004OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer value;
        switch (this.f32003OooO00o) {
            case 0:
                RoomInfoMomentFragment.m66initObserver$lambda2((RoomInfoMomentFragment) this.f32004OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                MixedRoomService mixedRoomService = (MixedRoomService) this.f32004OooO0O0;
                Boolean bool = (Boolean) obj;
                int i = MixedRoomService.f11827OoooOOO;
                Objects.requireNonNull(mixedRoomService);
                o00O00.OooO0O0("muteMikeObserver == xxxx");
                o00O00.OooO0OO("麦变更", "audioChatService muteLocalAudio " + bool);
                o0O0o000 o0o0o000 = mixedRoomService.f11831Oooo0oo;
                if (o0o0o000 != null) {
                    o0o0o000.OooOo0(bool.booleanValue());
                }
                break;
            case 2:
                BaseWebView this$0 = (BaseWebView) this.f32004OooO0O0;
                BaseWebView.OooO0OO oooO0OO = BaseWebView.f20915OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.loadState == BaseWebView.LoadState.Success) {
                    o00OO000.OooO0OO(this$0);
                }
                break;
            case 3:
                wa bindingDrawer = (wa) this.f32004OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50875OooO0o.f50952OooOOoo.setText(o00O0.OooO0O0(String.valueOf((Long) obj)));
                break;
            case 4:
                MainActivity this$1 = (MainActivity) this.f32004OooO0O0;
                MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(obj instanceof MainActivity)) {
                    this$1.OooOoo().f49539OooO0oO.OooO00o();
                }
                break;
            case 5:
                RoomGameBoxDialog this$2 = (RoomGameBoxDialog) this.f32004OooO0O0;
                Boolean bool2 = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                boolean z = false;
                if ((bool2 == null ? false : bool2.booleanValue()) && (value = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue()) != null && value.intValue() == 1) {
                    z = true;
                }
                this$2.OooOOOO(z, RoomGameBoxDialog.GameType.GameTurntable);
                break;
            default:
                TopDataFragment.m398initData$lambda5((TopDataFragment) this.f32004OooO0O0, (TopRankResponse) obj);
                break;
        }
    }
}
