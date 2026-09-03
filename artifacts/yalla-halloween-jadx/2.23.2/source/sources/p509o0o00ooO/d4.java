package p509o0o00ooO;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p391o0OOooo0.oo0o0Oo;
import p423o0OoO0OO.o00O0O0O;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class d4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50649OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final ImageView f50650OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f50651OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f50652OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ImageView f50653OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ImageView f50654OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final ImageView f50655OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f50656OooOooo;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50657OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f50657OooO0Oo = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            long toUserId = this.f50657OooO0Oo.getToUserId();
            if (toUserId > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(toUserId);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50658OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ d4 f50659OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50660OooO0oo;

        public OooO0O0(ChatModel chatModel, d4 d4Var, boolean z) {
            this.f50659OooO0oO = d4Var;
            this.f50660OooO0oo = z;
            this.f50658OooO = chatModel;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@Nullable View view) {
            d4 d4Var = this.f50659OooO0oO;
            d4Var.getClass();
            e4 onLogin = new e4(this.f50658OooO, d4Var, this.f50660OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_mora_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50649OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.iv_mora_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50651OooOoO0 = (NetImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50650OooOoO = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50652OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50654OooOoo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(o0OO00O.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f50653OooOoo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(o0OO00O.iv_mora_pk_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50655OooOooO = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(o0OO00O.ll_mora_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f50656OooOooo = (LinearLayout) viewFindViewById8;
    }

    public static void OooO0o0(ImageView imageView, int i) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(p413o0Oo0o0o.o0O00oO0.f46386OooO0Oo[i]);
            imageView.setVisibility(0);
        }
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50649OooOo;
        p1.OooO0O0(model, textView);
        if (model.getToUserId() > 0) {
            String strOooO00o = o00O00OO.OooO00o("@", model.getToNickname());
            textView.setText(strOooO00o + "  " + o0000.OooO0OO(o000000.room_dialog_guess_start_by_me));
            o00O0O0O.OooO00o(textView, strOooO00o, new OooO00o(model));
            long toUserId = model.getToUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && toUserId == l.longValue()) {
                o00O0O0O.OooO0O0(textView, o0000.OooO00o(o0OOO0o.color_FBFF45), strOooO00o);
            } else {
                o000.OooO0O0(textView, o0000.OooO00o(o0OOO0o.color_FF7217), strOooO00o);
            }
        } else {
            textView.setText(model.getMessage());
        }
        boolean isTie = model.getIsTie();
        LinearLayout linearLayout = this.f50656OooOooo;
        if (isTie) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        ImageView imageView = this.f50655OooOooO;
        imageView.setVisibility(8);
        ImageView imageView2 = this.f50653OooOoo;
        imageView2.setVisibility(0);
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        long jLongValue = newFrom.getUserId().getValue().longValue();
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
        boolean z2 = true;
        if (l2 != null && jLongValue == l2.longValue()) {
            z = true;
        } else {
            if (model.getToUserId() > 0) {
                long toUserId2 = model.getToUserId();
                Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
                if (l3 == null || toUserId2 != l3.longValue()) {
                    z = true;
                }
            }
            z = false;
        }
        if (model.getPkType() == 1) {
            imageView2.setImageResource(o0Oo0oo.icon_room_bottom_game_box_mora_pk_1);
            if (z) {
                imageView2.setVisibility(8);
            }
        } else if (model.getPkType() == 2) {
            imageView2.setImageResource(o0Oo0oo.icon_room_bottom_game_box_mora_pk_2);
            imageView2.setClickable(false);
            if (z) {
                imageView2.setVisibility(8);
            }
        } else {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageResource(o0Oo0oo.icon_room_bottom_game_box_mora);
        }
        String num = model.getNum();
        Intrinsics.checkNotNull(num);
        OooO0o0(this.f50650OooOoO, Integer.parseInt(num) / 100);
        String num2 = model.getNum();
        Intrinsics.checkNotNull(num2);
        OooO0o0(this.f50652OooOoOO, (Integer.parseInt(num2) % 100) / 10);
        String num3 = model.getNum();
        Intrinsics.checkNotNull(num3);
        OooO0o0(this.f50654OooOoo0, (Integer.parseInt(num3) % 100) % 10);
        String giftUrl = model.getGiftUrl();
        if (giftUrl != null && !StringsKt.isBlank(giftUrl)) {
            z2 = false;
        }
        if (z2) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
            GiftPropModel giftPropModelOooO0O0 = oo0o0Oo.OooO0O0(model.getGiftid());
            giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(giftUrl);
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(this.f50651OooOoO0);
        imageView2.setOnClickListener(new OooO0O0(model, this, z));
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
