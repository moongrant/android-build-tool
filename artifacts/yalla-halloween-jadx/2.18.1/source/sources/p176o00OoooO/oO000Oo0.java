package p176o00OoooO;

import android.database.Cursor;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.PostDetailPraiseFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0O0O0Oo.OooO0O0;
import o0O0OOOo.oo0o0Oo;
import p186o00o00Oo.o0ooOOo;
import p294o0O0Oo0o.o000OOo;
import p391o0OOooOo.o0O00000;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.O0000000;
import p712oooOO0.o0O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO000Oo0 implements BaseQuickAdapter.OooOOOO, LoginClient.OnCompletedListener, oo0o0Oo.OooO00o, o000OOo.OooO00o, o0ooOOo, BaseQuickAdapter.Oooo000, oO00OO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f32841OooO0Oo;

    public /* synthetic */ oO000Oo0(Object obj) {
        this.f32841OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.Oooo000
    public final int OooO00o(GridLayoutManager gridLayoutManager, int i) {
        UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f32841OooO0Oo;
        UserInfoTagActivity.OooO00o oooO00o = UserInfoTagActivity.f23538o00ooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = gridLayoutManager.f8828Oooo0oO;
        if (i < i2) {
            return 1;
        }
        if (this$0.f23546Oooooo0 != i) {
            i2 = 1;
        }
        return i2;
    }

    @Override // o0O0Oo0o.o000OOo.OooO00o
    public final void OooO0O0(o000OOo o000ooo2) {
        o0O00O o0o00o2 = (o0O00O) this.f32841OooO0Oo;
        o0O00O.OooO0OO oooO0OO = (o0O00O.OooO0OO) o000ooo2;
        Objects.requireNonNull(o0o00o2);
        oooO0OO.clear();
        o0o00o2.f53553OooO0O0.add(oooO0OO);
    }

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo oo000oo) {
        PostDetailPraiseFragment.m394init$lambda0((PostDetailPraiseFragment) this.f32841OooO0Oo, oo000oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f32841OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f12164OoooOO0.getData().size() > i) {
            long userId = this$0.f12164OoooOO0.getData().get(i).getUserId();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Long value = oooOOO.OooOo().getValue();
            if (value != null && userId == value.longValue()) {
                return;
            }
            if (this$0.f12164OoooOO0.getItemViewType(i) == RoomMoraGameListDialog.GuessType.ChallengeGuessing.getValue()) {
                long toUserId = this$0.f12164OoooOO0.getData().get(i).getToUserId();
                Long value2 = oooOOO.OooOo().getValue();
                if (value2 == null || toUserId != value2.longValue()) {
                    return;
                }
            }
            Room.RoshamboModel roshamboModel = this$0.f12164OoooOO0.getData().get(i);
            Intrinsics.checkNotNullExpressionValue(roshamboModel, "moraAdapter.data[position]");
            Room.RoshamboModel roshamboModel2 = roshamboModel;
            o0O00000.OooO0OO("InRoom_game_roshambo_pk");
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.setUserHeader(CloudImageUtilKt.imgFormat(roshamboModel2.getHeadphoto()));
            String name = roshamboModel2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "model.name");
            roomUserInfoModel.setUserName(name);
            roomUserInfoModel.setUserId(roshamboModel2.getUserId());
            O0000000 o0000000 = new O0000000(this$0.f12162OoooO0, false);
            long morauuid = roshamboModel2.getMorauuid();
            int moragiftid = roshamboModel2.getMoragiftid();
            String giftImage = roshamboModel2.getGiftImage();
            Intrinsics.checkNotNullExpressionValue(giftImage, "model.giftImage");
            o0000000.OooOOO0(morauuid, moragiftid, giftImage, String.valueOf(roshamboModel2.getMoranum()), roshamboModel2.getGiftprice(), roomUserInfoModel, roshamboModel2.getToUserId());
            o0000000.OooOO0();
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f32841OooO0Oo;
        VehicleStoreActivity.OooO00o oooO00o = VehicleStoreActivity.f23259OooooOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Oooo000();
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        oo0o0Oo oo0o0oo = (oo0o0Oo) this.f32841OooO0Oo;
        Cursor cursor = (Cursor) obj;
        OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        Objects.requireNonNull(oo0o0oo);
        while (cursor.moveToNext()) {
            oo0o0oo.OooO0o(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // com.facebook.login.LoginClient.OnCompletedListener
    public final void onCompleted(LoginClient.Result result) {
        LoginFragment.m226onCreate$lambda0((LoginFragment) this.f32841OooO0Oo, result);
    }
}
