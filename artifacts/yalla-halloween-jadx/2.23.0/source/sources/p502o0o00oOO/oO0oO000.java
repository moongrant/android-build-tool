package p502o0o00oOO;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.protobuf.room.Room;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p417o0OoO0.o0000O0O;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0oO000 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49626OooOo;

    public static final class OooO00o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49627OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oO0oO000 f49628OooO0oo;

        /* JADX INFO: renamed from: o0o00oOO.oO0oO000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0487OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ChatModel f49629OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ oO0oO000 f49630OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0487OooO00o(ChatModel chatModel, oO0oO000 oo0oo000) {
                super(0);
                this.f49629OooO0Oo = chatModel;
                this.f49630OooO0o0 = oo0oo000;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0056  */
            /* JADX WARN: Code duplicated, block: B:12:0x007a  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Room.BonusDetailRequest.Builder builderNewBuilder;
                RoomLiveService roomLiveService;
                ChatModel chatModel = this.f49629OooO0Oo;
                Room.SendBonusMessage sendBonusMessage = chatModel.getSendBonusMessage();
                Intrinsics.checkNotNull(sendBonusMessage);
                if (sendBonusMessage.getBonustype() == 2) {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Long l = (Long) o000000O.OooOOo0().getValue();
                    Room.SendBonusMessage sendBonusMessage2 = chatModel.getSendBonusMessage();
                    Intrinsics.checkNotNull(sendBonusMessage2);
                    long userId = sendBonusMessage2.getUser().getUserId();
                    if (l != null && l.longValue() == userId) {
                        int i = LuckyPacketDetailActivity.f26556OooOo;
                        FragmentActivity fragmentActivity = this.f49630OooO0o0.f49471OooO00o;
                        Room.SendBonusMessage sendBonusMessage3 = chatModel.getSendBonusMessage();
                        Intrinsics.checkNotNull(sendBonusMessage3);
                        long bonusid = sendBonusMessage3.getBonusid();
                        Room.SendBonusMessage sendBonusMessage4 = chatModel.getSendBonusMessage();
                        Intrinsics.checkNotNull(sendBonusMessage4);
                        LuckyPacketDetailActivity.OooO00o.OooO00o(fragmentActivity, bonusid, sendBonusMessage4.getBonustype());
                    } else {
                        Room.SendBonusMessage sendBonusMessage5 = chatModel.getSendBonusMessage();
                        Intrinsics.checkNotNull(sendBonusMessage5);
                        long bonusid2 = sendBonusMessage5.getBonusid();
                        Room.SendBonusMessage sendBonusMessage6 = chatModel.getSendBonusMessage();
                        Intrinsics.checkNotNull(sendBonusMessage6);
                        int bonustype = sendBonusMessage6.getBonustype();
                        builderNewBuilder = Room.BonusDetailRequest.newBuilder();
                        builderNewBuilder.setBonustype(bonustype);
                        builderNewBuilder.setBonusid(bonusid2);
                        roomLiveService = RoomLiveService.f25058OooOo00;
                        if (roomLiveService != null) {
                            roomLiveService.OooO0oo(10078, builderNewBuilder.build().toByteArray());
                        }
                        StringsKt__StringsKt.lastIndexOf$default("23rsaff.asdfasddf", ".", 0, false, 6, (Object) null);
                    }
                } else {
                    Room.SendBonusMessage sendBonusMessage7 = chatModel.getSendBonusMessage();
                    Intrinsics.checkNotNull(sendBonusMessage7);
                    long bonusid3 = sendBonusMessage7.getBonusid();
                    Room.SendBonusMessage sendBonusMessage8 = chatModel.getSendBonusMessage();
                    Intrinsics.checkNotNull(sendBonusMessage8);
                    int bonustype2 = sendBonusMessage8.getBonustype();
                    builderNewBuilder = Room.BonusDetailRequest.newBuilder();
                    builderNewBuilder.setBonustype(bonustype2);
                    builderNewBuilder.setBonusid(bonusid3);
                    roomLiveService = RoomLiveService.f25058OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oo(10078, builderNewBuilder.build().toByteArray());
                    }
                    StringsKt__StringsKt.lastIndexOf$default("23rsaff.asdfasddf", ".", 0, false, 6, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(ChatModel chatModel, oO0oO000 oo0oo000) {
            this.f49627OooO0oO = chatModel;
            this.f49628OooO0oo = oo0oo000;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0OO000.OooO00o("102138");
            C0487OooO00o onLogin = new C0487OooO00o(this.f49627OooO0oO, this.f49628OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0oO000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_red_content)");
        this.f49626OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.iv_mora_lucky);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_lucky)");
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49626OooOo;
        o0OOO0.OooO0O0(model, textView);
        textView.setText(o0000.OooO0OO(oO00OOo0.I_sent_a_lucky_bag));
        textView.append("\n");
        textView.append(o0000O0O.OooO0OO(0, o0000.OooO0OO(oO00OOo0.Lucky_Bag_Open_Now), "#FFE024"));
        textView.setOnClickListener(new OooO00o(model, this));
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
