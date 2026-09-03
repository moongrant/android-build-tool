package p509o0o00ooO;

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
import p423o0OoO0OO.o00O00OO;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class i4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50702OooOo;

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50703OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ i4 f50704OooO0oo;

        /* JADX INFO: renamed from: o0o00ooO.i4$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0466OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ChatModel f50705OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ i4 f50706OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0466OooO00o(ChatModel chatModel, i4 i4Var) {
                super(0);
                this.f50705OooO0Oo = chatModel;
                this.f50706OooO0o0 = i4Var;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0056  */
            /* JADX WARN: Code duplicated, block: B:12:0x007a  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Room.BonusDetailRequest.Builder builderNewBuilder;
                RoomLiveService roomLiveService;
                ChatModel chatModel = this.f50705OooO0Oo;
                Room.SendBonusMessage sendBonusMessage = chatModel.getSendBonusMessage();
                Intrinsics.checkNotNull(sendBonusMessage);
                if (sendBonusMessage.getBonustype() == 2) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Long l = (Long) o0O00oO0.OooOOo0().getValue();
                    Room.SendBonusMessage sendBonusMessage2 = chatModel.getSendBonusMessage();
                    Intrinsics.checkNotNull(sendBonusMessage2);
                    long userId = sendBonusMessage2.getUser().getUserId();
                    if (l != null && l.longValue() == userId) {
                        int i = LuckyPacketDetailActivity.f26104OooOo;
                        FragmentActivity fragmentActivity = this.f50706OooO0o0.f50780OooO00o;
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
                        roomLiveService = RoomLiveService.f24596OooOo00;
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
                    roomLiveService = RoomLiveService.f24596OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oo(10078, builderNewBuilder.build().toByteArray());
                    }
                    StringsKt__StringsKt.lastIndexOf$default("23rsaff.asdfasddf", ".", 0, false, 6, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(ChatModel chatModel, i4 i4Var) {
            this.f50703OooO0oO = chatModel;
            this.f50704OooO0oo = i4Var;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oo0000.OooO00o.OooO0O0("102138");
            C0466OooO00o onLogin = new C0466OooO00o(this.f50703OooO0oO, this.f50704OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50702OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.iv_mora_lucky);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50702OooOo;
        p1.OooO0O0(model, textView);
        textView.setText(o0000.OooO0OO(o000000.I_sent_a_lucky_bag));
        textView.append("\n");
        textView.append(o00O00OO.OooO0OO(0, o0000.OooO0OO(o000000.Lucky_Bag_Open_Now), "#FFE024"));
        textView.setOnClickListener(new OooO00o(model, this));
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
