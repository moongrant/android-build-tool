package p159o00OoOO;

import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.impl.PostGifPlayControl;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.RoomModel;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.app.base.view.pop.passwordSettingPop.PasswordSettingModel;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0O0;
import p186o00o00Oo.o0ooOOo;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000 implements OooO0O0, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f32401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f32402OooO0o0;

    public /* synthetic */ o00000(Object obj, int i) {
        this.f32401OooO0Oo = i;
        this.f32402OooO0o0 = obj;
    }

    @Override // o00Oo00.OooO0O0
    public final void OooO0O0(Object obj, int i, Object obj2) {
        RoomModel roomModel;
        MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32402OooO0o0;
        PasswordSettingModel passwordSettingModel = (PasswordSettingModel) obj;
        int i2 = MixedRoomActivity.f11764o00000oO;
        Objects.requireNonNull(mixedRoomActivity);
        int i3 = MixedRoomActivity.OooO00o.f11804OooO00o[((AbsListenerTag) obj2).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            mixedRoomActivity.OooOoo();
        } else {
            if (passwordSettingModel == null) {
                return;
            }
            if (mixedRoomActivity.f11767Ooooo0o != null && (roomModel = mixedRoomActivity.f11802oo0o0Oo) != null) {
                roomModel.setPassword(passwordSettingModel.getPassword());
                mixedRoomActivity.f11767Ooooo0o.OooO0OO(mixedRoomActivity.f11802oo0o0Oo);
            }
            o00O00.OooO0O0("他人的房间 + 解锁");
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32401OooO0Oo) {
            case 1:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32402OooO0o0;
                int i = RoomMoraGameListDialog.f12160OoooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00O000.OooO().OooOOo0(Long.valueOf(this$0.f12164OoooOO0.getData().get(this$0.f12164OoooOO0.getData().size() - 1).getMorauuid()), false);
                break;
            default:
                UserPostListActivity this$1 = (UserPostListActivity) this.f32402OooO0o0;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ((PostGifPlayControl) this$1.f22681Oooooo.getValue()).OooO0OO();
                this$1.Oooo00O(true);
                break;
        }
    }
}
