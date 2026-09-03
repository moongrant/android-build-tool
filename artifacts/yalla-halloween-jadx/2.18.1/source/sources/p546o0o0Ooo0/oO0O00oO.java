package p546o0o0Ooo0;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.FriendCheckModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserRankView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.view.RoomUserVipView;
import com.yalla.yalla.ui.view.UserInfoPremiumLayout;
import io.agora.rtc.Constants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p043OooooO0.o00O0000;
import p100o000oOoO.o0O00OO;
import p139o00OOOo0.o000O000;
import p139o00OOOo0.o000OO0O;
import p143o00OOooo.o00O0OOO;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p164o00OoOo0.o00OO0OO;
import p168o00Ooo0.oo000o;
import p176o00OoooO.oO000O0O;
import p176o00OoooO.ooo0Oo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p522o0o0O0o.o00O00O;
import p524o0o0O0oO.o0O00oO0;
import p524o0o0O0oO.o0O0O0O;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p534o0o0OOo0.o00O0O0;
import p545o0o0OoOo.c8;
import p579o0oOoOOo.b0;
import p579o0oOoOOo.d0;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00oO extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44531OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f44532OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public FriendCheckModel f44533OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f44534OooO0o0;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44536Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44536Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            long userId = this.f44536Oooo0oO.getUserId();
            if (oo0o00oo.OooO0OO(userId).getFirst().booleanValue()) {
                o0O00000.OooO0OO("InRoom_userprofile_leavemic");
                oo0oOO0 oo0ooo0 = new oo0oOO0(oo0o00oo.f44365OooO00o);
                oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.remove_to_mic));
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOo0o(new oO0O0(userId));
                oo0ooo0.OooOOO0();
            } else {
                int iOooO0oO = o000O00O.OooO().OooO0oO();
                if (o000O00O.OooO().OooO0oo() >= 0) {
                    o00O000.OooO().OooOOO0(userId, false);
                } else if (iOooO0oO >= 0) {
                    p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                    Activity activityOooO0O0 = p254o00ooO0O.o00O000.OooO0O0();
                    if (activityOooO0O0 != null) {
                        oo0oOO0 oo0ooo1 = new oo0oOO0(activityOooO0O0);
                        oo0ooo1.OooOo0(R.string.only_locked_mic);
                        oo0ooo1.OooOo(oO0O00.f44518Oooo0o);
                        oo0ooo1.OooOo0o(new oO0O00O(userId));
                        oo0ooo1.OooOOO0();
                    }
                } else {
                    ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.microom_code_1005));
                }
                o0O00000.OooO0OO("InRoom_userprofile_ban");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<b0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b0 invoke() {
            return new b0(oO0O00oO.this.f44531OooO0O0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44539Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44539Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel roomUserInfoModel = this.f44539Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_add");
            FriendCheckModel friendCheckModel = oo0o00oo.f44533OooO0Oo;
            if (friendCheckModel.isBlack) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(oo0o00oo.f44365OooO00o);
                oo0ooo0.OooOo0(R.string.As_Block_Add_Friends);
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOo0o(new oO0O00o0(oo0o00oo, roomUserInfoModel));
                oo0ooo0.OooOOO0();
            } else if (friendCheckModel.isVerify) {
                oo0o00oo.OooO0o(roomUserInfoModel.getUserId());
            } else {
                oo0o00oo.f44365OooO00o.f11780o00000O0.addFriend(roomUserInfoModel.getUserId(), o000O0O0.OooO0OO(R.string.addbuddy)).observe(oo0o00oo.f44365OooO00o, com.yalla.yalla.common.manager.data.o0OoOo0.f20640OooO0OO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44541Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44541Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            long userId = this.f44541Oooo0oO.getUserId();
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_message");
            PrivateChatActivity.f22166o00oO0o.OooO00o(oo0o00oo.f44365OooO00o, Long.valueOf(userId));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44543Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44543Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel userModel = this.f44543Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_setMember");
            MixedRoomActivity activity = oo0o00oo.f44365OooO00o;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userModel, "userModel");
            activity.showDialog((String) null, o00O0000.OooO0O0(150629884, true, new o000O000(userModel)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44545Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44545Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            long userId = this.f44545Oooo0oO.getUserId();
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_ban");
            oo0oOO0 oo0ooo0 = new oo0oOO0(oo0o00oo.f44365OooO00o);
            RoomUserInfoModel roomUserInfoModel = oo0o00oo.f44534OooO0o0;
            oo0ooo0.OooOo0O(roomUserInfoModel != null && !roomUserInfoModel.getSilenced() ? o000O0O0.OooO0OO(R.string.ban_chat) : o000O0O0.OooO0OO(R.string.cancel_ban_chat));
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOo0o(new oO0O000(userId, oo0o00oo));
            oo0ooo0.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44547Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44547Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel userModel = this.f44547Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_kick");
            MixedRoomActivity activity = oo0o00oo.f44365OooO00o;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userModel, "userModel");
            activity.showDialog((String) null, o00O0000.OooO0O0(1607032650, true, new o000OO0O(userModel, o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44549Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44549Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            int premiumLevel = this.f44549Oooo0oO.getPremiumLevel();
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_aristocracy");
            PremiumActivity.f23360o0ooOOo.OooO00o(oo0o00oo.f44365OooO00o, PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(premiumLevel)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44551Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44551Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            int vipLevel = this.f44551Oooo0oO.getVipLevel();
            Objects.requireNonNull(oo0o00oo);
            VipActivity.f23570OoooOOo.OooO00o(oo0o00oo.f44365OooO00o, VipLevel.INSTANCE.OooO0O0(vipLevel));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44553Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44553Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            long userId = this.f44553Oooo0oO.getUserId();
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_profile");
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, oo0o00oo.f44365OooO00o, String.valueOf(userId), true, 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44555Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44555Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            final oO0O00oO oo0o00oo = oO0O00oO.this;
            final RoomUserInfoModel roomUserInfoModel = this.f44555Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_at");
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            o0O00OO<Boolean> o0o00oo2 = o00O.OooO0o.f43215OooO;
            Boolean bool = Boolean.FALSE;
            o0o00oo2.setValue(bool);
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00O.OooOO0.f43244OooO0O0.setValue(bool);
            oo0o00oo.f44365OooO00o.f11788o00Ooo.postDelayed(new Runnable() { // from class: o0o0Ooo0.oO0
                @Override // java.lang.Runnable
                public final void run() {
                    oO0O00oO this$0 = oo0o00oo;
                    RoomUserInfoModel userModel = roomUserInfoModel;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(userModel, "$userModel");
                    this$0.f44365OooO00o.Oooo00o(userModel);
                }
            }, 200L);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44557Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44557Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            long userId = this.f44557Oooo0oO.getUserId();
            Objects.requireNonNull(oo0o00oo);
            o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(2, userId, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : Boolean.TRUE, (52 & 32) != 0 ? null : null));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44559Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44559Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel roomUserInfoModel = this.f44559Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_badge");
            BadgeActivity.OooO00o oooO00o = BadgeActivity.f23283OooooOo;
            MixedRoomActivity mixedRoomActivity = oo0o00oo.f44365OooO00o;
            long userId = roomUserInfoModel.getUserId();
            String userName = roomUserInfoModel.getUserName();
            String userHeader = roomUserInfoModel.getUserHeader();
            String medal = roomUserInfoModel.getMedal();
            if (medal == null) {
                medal = "";
            }
            oooO00o.OooO00o(mixedRoomActivity, userId, userName, userHeader, medal, false);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44561Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44561Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            int idLevel = this.f44561Oooo0oO.getIdLevel();
            Objects.requireNonNull(oo0o00oo);
            if (idLevel != 0) {
                SharedUrlManager.INSTANCE.getPrettyUserIdUrl().observe(oo0o00oo.f44365OooO00o, new o00OO0OO(oo0o00oo, 6));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {
        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_vehicles");
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0o0().OooOoOO();
            SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
            VehicleStoreActivity.f23259OooooOO.OooO00o(oo0o00oo.f44365OooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44564Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44564Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel roomUserInfoModel = this.f44564Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_magic");
            oO000O0O oo000o0o = new oO000O0O();
            Bundle bundle = new Bundle();
            bundle.putSerializable("user_key", roomUserInfoModel);
            oo000o0o.setArguments(bundle);
            oo000o0o.show(oo0o00oo.f44365OooO00o.getSupportFragmentManager(), "MagicCard");
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44566Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44566Oooo0oO = roomUserInfoModel;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Long] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel roomUserInfoModel = this.f44566Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            o0O00000.OooO0OO("InRoom_userprofile_mutemic");
            ?? ValueOf = Long.valueOf(roomUserInfoModel.getUserId());
            p140o00OOOoO.OooO0OO oooO0OO = new p140o00OOOoO.OooO0OO();
            oooO0OO.f31885OooO00o = Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT;
            oooO0OO.f31887OooO0OO = ValueOf;
            o0Oo0oo.OooO0o(oooO0OO);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f44568Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(long j) {
            super(1);
            this.f44568Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.f44365OooO00o.f11780o00000O0.addFriend(this.f44568Oooo0oO, it).observe(oo0o00oo.f44365OooO00o, com.yalla.yalla.common.manager.data.o0OoOo0.f20640OooO0OO);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f44570Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(RoomUserInfoModel roomUserInfoModel) {
            super(0);
            this.f44570Oooo0oO = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            RoomUserInfoModel roomUserInfoModel = this.f44570Oooo0oO;
            Objects.requireNonNull(oo0o00oo);
            p606o0oo0O.OooOo.OooO0O0("102037");
            oo0o00oo.f44365OooO00o.f11773OoooooO.OooO0O0(roomUserInfoModel, 0, -1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44531OooO0O0 = roomActivity;
        this.f44532OooO0OO = LazyKt.lazy(new OooO00o());
        this.f44533OooO0Oo = new FriendCheckModel();
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        oooO00o.OooO00o().f43366OoooOoo.observe(roomActivity, new p524o0o0O0oO.o0O00OO(this, 4));
        int i = 3;
        oooO00o.OooO00o().f43367Ooooo00.observe(this.f44365OooO00o, new o0O00oO0(this, 3));
        oooO00o.OooO00o().f43368Ooooo0o.observe(this.f44365OooO00o, new o0O0O0O(this, i));
        oooO00o.OooO00o().f43369OooooO0.observe(this.f44365OooO00o, new o00O0OOO(this, 3));
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION", RoomUserInfoModel.class).observe(this.f44365OooO00o, new o00O0O0(this, i));
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
        o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(null);
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(null);
    }

    public final Pair<Boolean, Boolean> OooO0OO(long j) {
        SparseArray<RoomLoginInformation.MIC> sparseArray;
        boolean zIsMuteSound;
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        boolean z = false;
        if ((value != null && j == value.longValue()) || (sparseArray = o000O00O.OooO().f32431OoooO) == null) {
            zIsMuteSound = false;
        } else {
            int size = sparseArray.size();
            boolean z2 = false;
            zIsMuteSound = false;
            for (int i = 0; i < size; i++) {
                RoomLoginInformation.MIC mic = sparseArray.get(sparseArray.keyAt(i));
                Intrinsics.checkNotNullExpressionValue(mic, "micList.get(micList.keyAt(i))");
                RoomLoginInformation.MIC mic2 = mic;
                RoomUserInfoModel roomUserInfoModel = mic2.user;
                if (roomUserInfoModel != null && roomUserInfoModel.getUserId() == j) {
                    zIsMuteSound = mic2.isMuteSound();
                    z2 = true;
                }
            }
            z = z2;
        }
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(zIsMuteSound));
    }

    public final b0 OooO0Oo() {
        return (b0) this.f44532OooO0OO.getValue();
    }

    public final void OooO0o(long j) {
        ooo0Oo0.OooO00o(this.f44365OooO00o, o000O0O0.OooO0OO(R.string.UserInfo_Dialog_Friend_Request), o000O0O0.OooO0OO(R.string.import_verifymessage), o000O0O0.OooO0OO(R.string.iam) + ' ' + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoO().getValue(), new o00Ooo(j));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x030d  */
    /* JADX WARN: Code duplicated, block: B:54:0x031c  */
    /* JADX WARN: Code duplicated, block: B:56:0x031f  */
    public final void OooO0o0(b0 b0Var, RoomUserInfoModel userModel) {
        String medal;
        boolean z;
        int i;
        this.f44534OooO0o0 = userModel;
        b0Var.f45928o000oOoO = new OooOOOO(userModel);
        b0Var.f45914OoooOOO = new OooOo00(userModel);
        b0Var.f45915OoooOOo = new OooOo(userModel);
        b0Var.f45916OoooOo0 = new Oooo000(userModel);
        b0Var.f45917OoooOoO = new Oooo0(userModel);
        b0Var.f45918OoooOoo = new o000oOoO();
        b0Var.f45919Ooooo00 = new o0OoOo0(userModel);
        b0Var.f45920Ooooo0o = new o00O0O(userModel);
        b0Var.f45921OooooO0 = new o00Oo0(userModel);
        b0Var.f45922OooooOO = new OooO0O0(userModel);
        b0Var.f45923OooooOo = new OooO0OO(userModel);
        b0Var.f45925Oooooo0 = new OooO0o(userModel);
        b0Var.f45924Oooooo = new OooO(userModel);
        b0Var.f45926OoooooO = new OooOO0(userModel);
        b0Var.f45927Ooooooo = new OooOO0O(userModel);
        b0Var.f45929o0OoOo0 = new OooOOO0(userModel);
        b0Var.f45930ooOO = new OooOOO(userModel);
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        b0Var.f45912OoooO.f50458OooO0O0.OooO0OO(userModel.getVipState(), userModel.getVipLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowVIP())), o000Oo0.OooO0O0(Boolean.valueOf(userModel.isPremium())), userModel.getPremiumLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowPremiumFirst())));
        b0Var.f45912OoooO.f50477OooOo00.OooO0OO(userModel.getVipState(), userModel.getVipLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowVIP())), o000Oo0.OooO0O0(Boolean.valueOf(userModel.isPremium())), userModel.getPremiumLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowPremiumFirst())));
        b0Var.f45912OoooO.f50471OooOOOo.OooO0O0(userModel.getVipState(), userModel.getVipLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowVIP())), o000Oo0.OooO0O0(Boolean.valueOf(userModel.isPremium())), userModel.getPremiumLevel(), o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowPremiumFirst())));
        b0Var.f45912OoooO.f50481OooOoO0.setYalla(userModel.getRole());
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(b0Var.f41543Oooo0o);
        oooO00o.f48429OooO0OO = o00O00O.OooO00o(userModel.getUserHeader());
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48446OooOo0 = true;
        oooO00o.OooO0OO(2, o000O0O0.OooO00o(R.color.white));
        oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
        oooO00o.OooO0o(b0Var.f45912OoooO.f50465OooOO0);
        if (b0Var.f45913OoooOO0 == null) {
            b0Var.f45913OoooOO0 = new p168o00Ooo0.o00O0O(b0Var.f41544Oooo0oO, b0Var.f45912OoooO.f50466OooOO0O);
        }
        p168o00Ooo0.o00O0O o00o0o2 = b0Var.f45913OoooOO0;
        if (o00o0o2 != null) {
            o00o0o2.OooO00o(userModel.getUserHeaderFrame());
        }
        b0Var.f45912OoooO.f50464OooO0oo.setVisibility(userModel.isOfficialRole() ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = b0Var.f45912OoooO.f50469OooOOO0;
        long userId = userModel.getUserId();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        linearLayoutCompat.setVisibility((value != null && userId == value.longValue()) ? 4 : 0);
        b0Var.f45912OoooO.f50474OooOOoo.setSex(userModel.getSex());
        b0Var.f45912OoooO.f50479OooOo0o.setFlash(userModel.getShowVIP() && userModel.getVipState() == VipState.Vip.getValue() && userModel.getVipLevel() >= VipLevel.Vip4.getValue());
        String strOooO0O0 = p520o0o0O0O0.o00O0O.f42677OooO00o.OooO0O0(userModel.getUserId(), "");
        if (StringsKt.isBlank(strOooO0O0)) {
            b0Var.f45912OoooO.f50475OooOo.setVisibility(8);
            b0Var.f45912OoooO.f50479OooOo0o.setText(userModel.getUserName());
        } else {
            b0Var.f45912OoooO.f50475OooOo.setVisibility(0);
            b0Var.f45912OoooO.f50475OooOo.setText(o000O0O0.OooO0OO(R.string.User_Edit_Remark_name) + ' ' + userModel.getUserName());
            b0Var.f45912OoooO.f50479OooOo0o.setText(strOooO0O0);
        }
        int roomMemberType = userModel.getRoomMemberType();
        b0Var.f45912OoooO.f50459OooO0OO.setIdentityInfo(roomMemberType);
        b0Var.f45912OoooO.f50462OooO0o0.f50203OooO0O0.OooO0OO(roomMemberType, true, true);
        b0Var.f45912OoooO.f50473OooOOo0.setUserPrettyId(userModel.getIdLevel());
        TextView textView = b0Var.f45912OoooO.f50478OooOo0O;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
        sbOooO0o0.append(userModel.getUserIdx());
        textView.setText(sbOooO0o0.toString());
        TextView textView2 = b0Var.f45912OoooO.f50476OooOo0;
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("LV.");
        sbOooO0o1.append(userModel.getUserLevel());
        sbOooO0o1.append(' ');
        textView2.setText(sbOooO0o1.toString());
        o00O o00o2 = o00O.f43140OooO00o;
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00o2.OooOO0(userModel.getUserId());
        if (roomUserInfoModelOooOO0 != null) {
            b0Var.f45912OoooO.f50470OooOOOO.OooO00o(Integer.valueOf(roomUserInfoModelOooOO0.getMemberLevel()), roomUserInfoModelOooOO0.getBadgeUrl(), roomUserInfoModelOooOO0.getIsTopRank(), 9.0f);
        }
        b0Var.f45912OoooO.f50472OooOOo.setBgHeight(18);
        b0Var.f45912OoooO.f50472OooOOo.OooO00o(userModel.getRankWeek(), userModel.getRankDay());
        UserRankView userRankView = b0Var.f45912OoooO.f50472OooOOo;
        Intrinsics.checkNotNullExpressionValue(userRankView, "binding.rankLayout");
        oOO00O.OooO0oO(userRankView, new d0(userModel));
        View view = b0Var.f45912OoooO.f50482OooOoOO;
        if (userModel.getRankWeek() > 0 || userModel.getRankDay() > 0) {
            medal = userModel.getMedal();
            if (medal != null || StringsKt.isBlank(medal)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
            }
        } else {
            if (userModel.getMemberLevel() > 0) {
                String badgeUrl = userModel.getBadgeUrl();
                if (!(badgeUrl == null || StringsKt.isBlank(badgeUrl))) {
                    medal = userModel.getMedal();
                    if (medal != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    i = z ? 8 : 0;
                }
            }
        }
        view.setVisibility(i);
        String medal2 = userModel.getMedal();
        if (medal2 == null || StringsKt.isBlank(medal2)) {
            b0Var.f45912OoooO.f50468OooOOO.setVisibility(8);
        } else {
            b0Var.f45912OoooO.f50468OooOOO.OooO0O0(userModel.getMedal(), b0Var.f41544Oooo0oO);
            b0Var.f45912OoooO.f50468OooOOO.setVisibility(0);
        }
        RoomUserVipView roomUserVipView = b0Var.f45912OoooO.f50467OooOO0o;
        int vipState = userModel.getVipState();
        int vipLevel = userModel.getVipLevel();
        int iOooO0O0 = o000Oo0.OooO0O0(Boolean.valueOf(userModel.getShowVIP()));
        Objects.requireNonNull(roomUserVipView);
        if (vipState == VipState.Vip.getValue() && vipLevel > VipLevel.Vip0.getValue() && iOooO0O0 == 1) {
            roomUserVipView.setVisibility(0);
            if (vipLevel == VipLevel.Vip1.getValue()) {
                roomUserVipView.setBackgroundResource(R.drawable.room_user_info_dialog_ka_vip_1);
            } else if (vipLevel == VipLevel.Vip2.getValue()) {
                roomUserVipView.setBackgroundResource(R.drawable.room_user_info_dialog_ka_vip_2);
            } else if (vipLevel == VipLevel.Vip3.getValue()) {
                roomUserVipView.setBackgroundResource(R.drawable.room_user_info_dialog_ka_vip_3);
            } else if (vipLevel == VipLevel.Vip4.getValue()) {
                roomUserVipView.setBackgroundResource(R.drawable.room_user_info_dialog_ka_vip_4);
            } else if (vipLevel == VipLevel.Vip5.getValue()) {
                roomUserVipView.setBackgroundResource(R.drawable.room_user_info_dialog_ka_vip_5);
            } else {
                roomUserVipView.setVisibility(8);
            }
        } else {
            roomUserVipView.setVisibility(8);
        }
        UserInfoPremiumLayout userInfoPremiumLayout = b0Var.f45912OoooO.f50483OooOoo;
        int iOooO0O1 = o000Oo0.OooO0O0(Boolean.valueOf(userModel.isPremium()));
        int premiumLevel = userModel.getPremiumLevel();
        userInfoPremiumLayout.setVisibility(iOooO0O1 == 1 ? 0 : 8);
        userInfoPremiumLayout.f25235Oooo0o.f51043OooO0O0.OooO0OO(iOooO0O1, premiumLevel);
        if (premiumLevel == PremiumLevel.Premium1.getValue()) {
            userInfoPremiumLayout.f25235Oooo0o.f51044OooO0OO.setBackgroundResource(R.drawable.room_user_info_dialog_aristocrat_1);
            userInfoPremiumLayout.f25235Oooo0o.f51045OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Patrician));
        } else if (premiumLevel == PremiumLevel.Premium2.getValue()) {
            userInfoPremiumLayout.f25235Oooo0o.f51044OooO0OO.setBackgroundResource(R.drawable.room_user_info_dialog_aristocrat_2);
            userInfoPremiumLayout.f25235Oooo0o.f51045OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Knight));
        } else if (premiumLevel == PremiumLevel.Premium3.getValue()) {
            userInfoPremiumLayout.f25235Oooo0o.f51044OooO0OO.setBackgroundResource(R.drawable.room_user_info_dialog_aristocrat_3);
            userInfoPremiumLayout.f25235Oooo0o.f51045OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Baron));
        } else if (premiumLevel == PremiumLevel.Premium4.getValue()) {
            userInfoPremiumLayout.f25235Oooo0o.f51044OooO0OO.setBackgroundResource(R.drawable.room_user_info_dialog_aristocrat_4);
            userInfoPremiumLayout.f25235Oooo0o.f51045OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Count));
        } else if (premiumLevel == PremiumLevel.Premium5.getValue()) {
            userInfoPremiumLayout.f25235Oooo0o.f51044OooO0OO.setBackgroundResource(R.drawable.room_user_info_dialog_aristocrat_5);
            userInfoPremiumLayout.f25235Oooo0o.f51045OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Marquis));
        } else {
            userInfoPremiumLayout.setVisibility(8);
        }
        if (oo000o.OooO0o0()) {
            b0Var.f45912OoooO.f50463OooO0oO.setScaleX(-1.0f);
        }
        if (StringsKt.isBlank(userModel.getVehicleUrl()) || userModel.getVehicleId() == 0) {
            b0Var.f45912OoooO.f50463OooO0oO.setVisibility(8);
            b0Var.f45912OoooO.f50484OooOoo0.setVisibility(8);
        } else {
            b0Var.f45912OoooO.f50463OooO0oO.setVisibility(0);
            b0Var.f45912OoooO.f50484OooOoo0.setVisibility(0);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(b0Var.f41543Oooo0o);
            oooO00o2.f48429OooO0OO = userModel.getVehicleUrl();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.icon_vehicel_placeholder;
            oooO00o2.OooO0o(b0Var.f45912OoooO.f50463OooO0oO);
        }
        LinearLayoutCompat linearLayoutCompat2 = b0Var.f45912OoooO.f50460OooO0Oo.f50120OooO0o;
        long userId2 = userModel.getUserId();
        Long value2 = oooOOO.OooOo().getValue();
        linearLayoutCompat2.setVisibility((value2 == null || userId2 != value2.longValue()) ? 0 : 8);
        Pair<Boolean, Boolean> pairOooO0OO = OooO0OO(userModel.getUserId());
        b0Var.OooOOO(pairOooO0OO);
        long userId3 = userModel.getUserId();
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            Long value3 = oooOOO.OooOo().getValue();
            final boolean z2 = value3 != null && value3.longValue() == userId3;
            if (z2) {
                OooO0Oo().OooOOO0(z2, false);
            } else {
                this.f44365OooO00o.f11780o00000O0.checkIsFriend(userId3).observe(this.f44365OooO00o, new Observer() { // from class: o0o0Ooo0.oOo000o0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        oO0O00oO this$0 = this.f44588OooO00o;
                        boolean z3 = z2;
                        FriendCheckModel it = (FriendCheckModel) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        this$0.f44533OooO0Oo = it;
                        this$0.OooO0Oo().OooOOO0(z3, it.isFriend);
                    }
                });
            }
        }
        if (o000O00O.OooO().f32430Oooo0oo != null) {
            Long value4 = oooOOO.OooOo().getValue();
            if (value4 == null) {
                value4 = 0L;
            }
            Intrinsics.checkNotNullExpressionValue(value4, "Account.userId.value ?: 0");
            RoomUserInfoModel roomUserInfoModelOooOO1 = o00o2.OooOO0(value4.longValue());
            Integer numValueOf = roomUserInfoModelOooOO1 != null ? Integer.valueOf(roomUserInfoModelOooOO1.getRole()) : null;
            long userId4 = userModel.getUserId();
            Long value5 = oooOOO.OooOo().getValue();
            if (value5 != null && userId4 == value5.longValue()) {
                b0.OooOO0o(OooO0Oo(), false, false, false, 15);
            } else if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 4)) {
                o00OO00O.OooO00o oooO00o3 = o00OO00O.f43313OooooOo;
                if (oooO00o3.OooO00o().OooOOo0()) {
                    OooO0Oo().OooOO0O(true, true, true, true);
                } else if (oooO00o3.OooO00o().OooOOOO()) {
                    if (userModel.getRoomMemberType() == 1 || userModel.getRoomMemberType() == 2) {
                        b0.OooOO0o(OooO0Oo(), false, false, false, 15);
                    } else {
                        b0.OooOO0o(OooO0Oo(), true, true, true, 1);
                    }
                }
            } else if (o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                OooO0Oo().OooOO0O(true, true, true, true);
            } else {
                b0.OooOO0o(OooO0Oo(), false, true, true, 3);
            }
        }
        b0Var.f45912OoooO.f50462OooO0o0.f50204OooO0OO.setImageResource(pairOooO0OO.getFirst().booleanValue() ? R.drawable.room_dialog_user_info_set_up_mic_down : R.drawable.room_dialog_user_info_set_up_mic_up);
    }
}
