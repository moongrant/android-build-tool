package p502o0o00oOO;

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
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0O0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0o0000 extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final View f49615OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final TextView f49616OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final TextView f49617OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final NetImageView f49618OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.chatlineContent)");
        this.f49615OooOo = viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_red_content)");
        this.f49617OooOoO0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.tv_red_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tv_red_number)");
        this.f49616OooOoO = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.iv_red_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_red_pic)");
        this.f49618OooOoOO = (NetImageView) viewFindViewById4;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        TextView textView = this.f49617OooOoO0;
        o0OOO0.OooO0O0(model, textView);
        int iOooO0OO = OooO.OooO0OO();
        TextView textView2 = this.f49616OooOoO;
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
        NetImageView netImageView = this.f49618OooOoOO;
        if (bonustype == 2) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f49471OooO00o);
            Room.GetBonusMessage getBonusMessage4 = model.getGetBonusMessage();
            Intrinsics.checkNotNull(getBonusMessage4);
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(getBonusMessage4.getGiftimg());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_gift_default_gray;
            oooO00o.OooO0Oo(netImageView);
        } else {
            netImageView.setImageResource(oOo00OO0.coin3);
        }
        Room.GetBonusMessage getBonusMessage5 = model.getGetBonusMessage();
        Intrinsics.checkNotNull(getBonusMessage5);
        long fromid = getBonusMessage5.getFromid();
        Room.GetBonusMessage getBonusMessage6 = model.getGetBonusMessage();
        Intrinsics.checkNotNull(getBonusMessage6);
        String fromname = getBonusMessage6.getFromname();
        Intrinsics.checkNotNullExpressionValue(fromname, "model.getBonusMessage!!.fromname");
        String strOooO0O0 = oOO0O0O.OooO0O0(fromid, fromname);
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Lucky_Bag_I_received_a_lucky_bag_from_XXX), strOooO0O0);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, strOooO0O0, 0, false, 6, (Object) null);
        int length = strOooO0O0.length() + iIndexOf$default;
        int iOooO00o = o0000.OooO00o(oO00O0o.color_ffe024);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO00o);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf$default, length, 33);
        textView.setText(spannableStringBuilder);
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return true;
    }
}
