package p502o0o00oOO;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooO0O0;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p385o0OOooOO.oOO00O;
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatGiftVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatGiftVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatGiftVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final class oOOoOOO0 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f49671OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final NetImageView f49672OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f49673OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f49674OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ImageView f49675OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ImageView f49676OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final ImageView f49677OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49678OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49679Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.tv_gift_blind_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_gift_blind_title)");
        this.f49671OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tv_gift_receiver);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_gift_receiver)");
        this.f49673OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.iv_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.iv_gift_icon)");
        this.f49672OooOoO = (NetImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_hundred)");
        this.f49674OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.iv_ten)");
        this.f49676OooOoo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(oO00O0oO.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_one)");
        this.f49675OooOoo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(oO00O0oO.iv_room_chat_gift_return);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.iv_room_chat_gift_return)");
        this.f49677OooOooO = (ImageView) viewFindViewById7;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull final ChatModel model) {
        String strOooO0OO;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        int fromboxid = model.getFromboxid();
        TextView textView = this.f49671OooOo;
        if (fromboxid > 0) {
            int blindBoxLevel = model.getBlindBoxLevel();
            if (blindBoxLevel != 1) {
                strOooO0OO = blindBoxLevel != 10 ? o0000.OooO0OO(oO00OOo0.room_chat_gift_blind_title) : o0000.OooO0OO(oO00OOo0.By_a_Premium_Surprise_Box);
            } else {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.By_a_Junior_Surprise_Box);
            }
            textView.setText(strOooO0OO);
            o000OO00.OooOOOO(textView);
        } else {
            o000OO00.OooO0O0(textView);
        }
        RoomUserInfoModel newTo = model.getNewTo();
        Intrinsics.checkNotNull(newTo);
        long jLongValue = newTo.getUserId().getValue().longValue();
        RoomUserInfoModel newTo2 = model.getNewTo();
        Intrinsics.checkNotNull(newTo2);
        this.f49673OooOoO0.setText(oOO0O0O.OooO0O0(jLongValue, newTo2.getUserName().getValue()));
        RoomUserInfoModel newTo3 = model.getNewTo();
        Intrinsics.checkNotNull(newTo3);
        boolean zOooO0O0 = OooOo00.OooO0O0(newTo3);
        ImageView imageView = this.f49677OooOooO;
        if (zOooO0O0) {
            RoomUserInfoModel newTo4 = model.getNewTo();
            Intrinsics.checkNotNull(newTo4);
            if (OooOo00.OooO0O0(newTo4.getUserId().getValue())) {
                RoomUserInfoModel newTo5 = model.getNewTo();
                Intrinsics.checkNotNull(newTo5);
                long jLongValue2 = newTo5.getUserId().getValue().longValue();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                if (l != null && jLongValue2 == l.longValue()) {
                    o000OO00.OooOOOO(imageView);
                } else {
                    o000OO00.OooO0O0(imageView);
                }
            } else {
                o000OO00.OooO0O0(imageView);
            }
        } else {
            o000OO00.OooO0O0(imageView);
        }
        imageView.setOnClickListener(new oO00OOOo(0, this, model));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o0o00oOO.oO00OOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oOOoOOO0 this$0 = this.f49550OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel model2 = model;
                Intrinsics.checkNotNullParameter(model2, "$model");
                o0OO000.OooO00o("102212");
                this$0.getClass();
                oO00Oo00 onLogin = new oO00Oo00(this$0, model2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o3 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i2 = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        };
        NetImageView netImageView = this.f49672OooOoO;
        netImageView.setOnClickListener(onClickListener);
        String giftUrl = model.getGiftUrl();
        if (giftUrl == null || StringsKt.isBlank(giftUrl)) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
            GiftPropModel giftPropModelOooO0O0 = oOO00O.OooO0O0(model.getGiftid());
            giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
        oooO00o.OooO00o(OooO.OooO0O0());
        oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(giftUrl);
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43936OooOoo0 = 1;
        oooO00o.OooO0Oo(netImageView);
        int number = model.getNumber() / 100;
        ImageView imageView2 = this.f49674OooOoOO;
        if (number == 0) {
            o000OO00.OooO0O0(imageView2);
        } else {
            o000OO00.OooOOOO(imageView2);
            imageView2.setImageResource(p407o0Oo0o00.OooO0o.f45169OooO0OO[number]);
        }
        int number2 = (model.getNumber() / 10) % 10;
        ImageView imageView3 = this.f49676OooOoo0;
        if (number2 == 0 && number == 0) {
            o000OO00.OooO0O0(imageView3);
        } else {
            o000OO00.OooOOOO(imageView3);
            imageView3.setImageResource(p407o0Oo0o00.OooO0o.f45169OooO0OO[number2]);
        }
        this.f49675OooOoo.setImageResource(p407o0Oo0o00.OooO0o.f45169OooO0OO[model.getNumber() % 10]);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
