package p509o0o00ooO;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooO0O0;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
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
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p391o0OOooo0.oo0o0Oo;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatGiftVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatGiftVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatGiftVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final class c3 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final TextView f50636OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final NetImageView f50637OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f50638OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final ImageView f50639OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ImageView f50640OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final ImageView f50641OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final ImageView f50642OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50643OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50644Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.tv_gift_blind_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50636OooOo = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tv_gift_receiver);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50638OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.iv_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50637OooOoO = (NetImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50639OooOoOO = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50641OooOoo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(o0OO00O.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f50640OooOoo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(o0OO00O.iv_room_chat_gift_return);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50642OooOooO = (ImageView) viewFindViewById7;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull final ChatModel model) {
        String strOooO0OO;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        int fromboxid = model.getFromboxid();
        TextView textView = this.f50636OooOo;
        if (fromboxid > 0) {
            int blindBoxLevel = model.getBlindBoxLevel();
            if (blindBoxLevel != 1) {
                strOooO0OO = blindBoxLevel != 10 ? o0000.OooO0OO(o000000.room_chat_gift_blind_title) : o0000.OooO0OO(o000000.By_a_Premium_Surprise_Box);
            } else {
                strOooO0OO = o0000.OooO0OO(o000000.By_a_Junior_Surprise_Box);
            }
            textView.setText(strOooO0OO);
            o000O.OooOOOO(textView);
        } else {
            o000O.OooO0O0(textView);
        }
        RoomUserInfoModel newTo = model.getNewTo();
        Intrinsics.checkNotNull(newTo);
        long jLongValue = newTo.getUserId().getValue().longValue();
        RoomUserInfoModel newTo2 = model.getNewTo();
        Intrinsics.checkNotNull(newTo2);
        this.f50638OooOoO0.setText(o000O000.OooO0O0(jLongValue, newTo2.getUserName().getValue()));
        RoomUserInfoModel newTo3 = model.getNewTo();
        Intrinsics.checkNotNull(newTo3);
        boolean zOooO0O0 = OooOo00.OooO0O0(newTo3);
        ImageView imageView = this.f50642OooOooO;
        if (zOooO0O0) {
            RoomUserInfoModel newTo4 = model.getNewTo();
            Intrinsics.checkNotNull(newTo4);
            if (OooOo00.OooO0O0(newTo4.getUserId().getValue())) {
                RoomUserInfoModel newTo5 = model.getNewTo();
                Intrinsics.checkNotNull(newTo5);
                long jLongValue2 = newTo5.getUserId().getValue().longValue();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && jLongValue2 == l.longValue()) {
                    o000O.OooOOOO(imageView);
                } else {
                    o000O.OooO0O0(imageView);
                }
            } else {
                o000O.OooO0O0(imageView);
            }
        } else {
            o000O.OooO0O0(imageView);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o0o00ooO.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c3 this$0 = this.f50888OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel model2 = model;
                Intrinsics.checkNotNullParameter(model2, "$model");
                this$0.getClass();
                b3 onLogin = new b3(this$0, model2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i2 = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o0o00ooO.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c3 this$0 = this.f50893OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ChatModel model2 = model;
                Intrinsics.checkNotNullParameter(model2, "$model");
                OooO00o.OooO0O0("102212");
                this$0.getClass();
                a3 onLogin = new a3(this$0, model2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i2 = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        };
        NetImageView netImageView = this.f50637OooOoO;
        netImageView.setOnClickListener(onClickListener);
        String giftUrl = model.getGiftUrl();
        if (giftUrl == null || StringsKt.isBlank(giftUrl)) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
            GiftPropModel giftPropModelOooO0O0 = oo0o0Oo.OooO0O0(model.getGiftid());
            giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
        oooO00o.OooO00o(d1.OooO0O0());
        oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(giftUrl);
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43151OooOoo0 = 1;
        oooO00o.OooO0Oo(netImageView);
        int number = model.getNumber() / 100;
        ImageView imageView2 = this.f50639OooOoOO;
        if (number == 0) {
            o000O.OooO0O0(imageView2);
        } else {
            o000O.OooOOOO(imageView2);
            imageView2.setImageResource(p413o0Oo0o0o.o0O00oO0.f46385OooO0OO[number]);
        }
        int number2 = (model.getNumber() / 10) % 10;
        ImageView imageView3 = this.f50641OooOoo0;
        if (number2 == 0 && number == 0) {
            o000O.OooO0O0(imageView3);
        } else {
            o000O.OooOOOO(imageView3);
            imageView3.setImageResource(p413o0Oo0o0o.o0O00oO0.f46385OooO0OO[number2]);
        }
        this.f50640OooOoo.setImageResource(p413o0Oo0o0o.o0O00oO0.f46385OooO0OO[model.getNumber() % 10]);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
