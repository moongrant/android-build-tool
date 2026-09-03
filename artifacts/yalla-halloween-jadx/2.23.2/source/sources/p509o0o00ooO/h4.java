package p509o0o00ooO;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h4 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final View f50695OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final TextView f50696OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f50697OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final NetImageView f50698OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50695OooOo = viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50697OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.tv_red_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50696OooOoO = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.iv_red_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50698OooOoOO = (NetImageView) viewFindViewById4;
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f50697OooOoO0;
        p1.OooO0O0(model, textView);
        int iOooO0OO = OooOo00.OooO0OO();
        TextView textView2 = this.f50696OooOoO;
        if (iOooO0OO == 1 || iOooO0OO == 8) {
            Room.GetBonusMessage getBonusMessage = model.getGetBonusMessage();
            Intrinsics.checkNotNull(getBonusMessage);
            textView2.setText(getBonusMessage.getBonuscount() + "x");
        } else {
            Room.GetBonusMessage getBonusMessage2 = model.getGetBonusMessage();
            Intrinsics.checkNotNull(getBonusMessage2);
            textView2.setText("x" + getBonusMessage2.getBonuscount());
        }
        Room.GetBonusMessage getBonusMessage3 = model.getGetBonusMessage();
        Intrinsics.checkNotNull(getBonusMessage3);
        int bonustype = getBonusMessage3.getBonustype();
        NetImageView netImageView = this.f50698OooOoOO;
        if (bonustype == 2) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f50780OooO00o);
            Room.GetBonusMessage getBonusMessage4 = model.getGetBonusMessage();
            Intrinsics.checkNotNull(getBonusMessage4);
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(getBonusMessage4.getGiftimg());
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43138OooOOOo = o0Oo0oo.icon_gift_default_gray;
            oooO00o.OooO0Oo(netImageView);
        } else {
            netImageView.setImageResource(o0Oo0oo.coin3);
        }
        Room.GetBonusMessage getBonusMessage5 = model.getGetBonusMessage();
        Intrinsics.checkNotNull(getBonusMessage5);
        long fromid = getBonusMessage5.getFromid();
        Room.GetBonusMessage getBonusMessage6 = model.getGetBonusMessage();
        Intrinsics.checkNotNull(getBonusMessage6);
        String fromname = getBonusMessage6.getFromname();
        Intrinsics.checkNotNullExpressionValue(fromname, "getFromname(...)");
        String strOooO0O0 = o000O000.OooO0O0(fromid, fromname);
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Lucky_Bag_I_received_a_lucky_bag_from_XXX), strOooO0O0);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, strOooO0O0, 0, false, 6, (Object) null);
        int length = strOooO0O0.length() + iIndexOf$default;
        int iOooO00o = o0000.OooO00o(o0OOO0o.color_ffe024);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO00o);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf$default, length, 33);
        textView.setText(spannableStringBuilder);
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return true;
    }
}
