package p502o0o00oOO;

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
import p362o0OOo0O.OooOO0;
import p385o0OOooOO.oOO00O;
import p407o0Oo0o00.OooO0o;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class ooo0o extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49700OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final ImageView f49701OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final NetImageView f49702OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f49703OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ImageView f49704OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ImageView f49705OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final ImageView f49706OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f49707OooOooo;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49708OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f49708OooO0Oo = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            long toUserId = this.f49708OooO0Oo.getToUserId();
            if (toUserId > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(toUserId);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends oo00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49709OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ooo0o f49710OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f49711OooO0oo;

        public OooO0O0(ChatModel chatModel, ooo0o ooo0oVar, boolean z) {
            this.f49710OooO0oO = ooo0oVar;
            this.f49711OooO0oo = z;
            this.f49709OooO = chatModel;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@Nullable View view) {
            ooo0o ooo0oVar = this.f49710OooO0oO;
            ooo0oVar.getClass();
            oO0OO00 onLogin = new oO0OO00(this.f49709OooO, ooo0oVar, this.f49711OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tv_mora_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_mora_title)");
        this.f49700OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.iv_mora_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_gift_icon)");
        this.f49702OooOoO0 = (NetImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.iv_hundred)");
        this.f49701OooOoO = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_ten)");
        this.f49703OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.iv_one)");
        this.f49705OooOoo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(oO00O0oO.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_mora_pk)");
        this.f49704OooOoo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(oO00O0oO.iv_mora_pk_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.iv_mora_pk_label)");
        this.f49706OooOooO = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(oO00O0oO.ll_mora_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.ll_mora_list)");
        this.f49707OooOooo = (LinearLayout) viewFindViewById8;
    }

    public static void OooO0o0(ImageView imageView, int i) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(OooO0o.f45170OooO0Oo[i]);
            imageView.setVisibility(0);
        }
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49700OooOo;
        o0OOO0.OooO0O0(model, textView);
        if (model.getToUserId() > 0) {
            String strOooO00o = o00O00OO.OooO00o("@", model.getToNickname());
            textView.setText(strOooO00o + "  " + o0000.OooO0OO(oO00OOo0.room_dialog_guess_start_by_me));
            o000O0o.OooO00o(textView, strOooO00o, new OooO00o(model));
            long toUserId = model.getToUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && toUserId == l.longValue()) {
                o000O0o.OooO0O0(textView, o0000.OooO00o(oO00O0o.color_FBFF45), strOooO00o);
            } else {
                o000.OooO0O0(textView, o0000.OooO00o(oO00O0o.color_FF7217), strOooO00o);
            }
        } else {
            textView.setText(model.getMessage());
        }
        boolean isTie = model.getIsTie();
        LinearLayout linearLayout = this.f49707OooOooo;
        if (isTie) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        ImageView imageView = this.f49706OooOooO;
        imageView.setVisibility(8);
        ImageView imageView2 = this.f49704OooOoo;
        imageView2.setVisibility(0);
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        long jLongValue = newFrom.getUserId().getValue().longValue();
        o000000O o000000o3 = o000000O.f46674OooO00o;
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        boolean z2 = true;
        if (l2 != null && jLongValue == l2.longValue()) {
            z = true;
        } else {
            if (model.getToUserId() > 0) {
                long toUserId2 = model.getToUserId();
                Long l3 = (Long) o000000O.OooOOo0().getValue();
                if (l3 == null || toUserId2 != l3.longValue()) {
                    z = true;
                }
            }
            z = false;
        }
        if (model.getPkType() == 1) {
            imageView2.setImageResource(oOo00OO0.icon_room_bottom_game_box_mora_pk_1);
            if (z) {
                imageView2.setVisibility(8);
            }
        } else if (model.getPkType() == 2) {
            imageView2.setImageResource(oOo00OO0.icon_room_bottom_game_box_mora_pk_2);
            imageView2.setClickable(false);
            if (z) {
                imageView2.setVisibility(8);
            }
        } else {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageResource(oOo00OO0.icon_room_bottom_game_box_mora);
        }
        String num = model.getNum();
        Intrinsics.checkNotNull(num);
        OooO0o0(this.f49701OooOoO, Integer.parseInt(num) / 100);
        String num2 = model.getNum();
        Intrinsics.checkNotNull(num2);
        OooO0o0(this.f49703OooOoOO, (Integer.parseInt(num2) % 100) / 10);
        String num3 = model.getNum();
        Intrinsics.checkNotNull(num3);
        OooO0o0(this.f49705OooOoo0, (Integer.parseInt(num3) % 100) % 10);
        String giftUrl = model.getGiftUrl();
        if (giftUrl != null && !StringsKt.isBlank(giftUrl)) {
            z2 = false;
        }
        if (z2) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
            GiftPropModel giftPropModelOooO0O0 = oOO00O.OooO0O0(model.getGiftid());
            giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
        oooO00o.OooO00o(OooO.OooO0O0());
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(giftUrl);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(this.f49702OooOoO0);
        imageView2.setOnClickListener(new OooO0O0(model, this, z));
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
