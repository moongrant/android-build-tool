package o00OO0O0;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0O0 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final TextView f31621OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final View f31622OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final TextView f31623OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final NetImageView f31624OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.chatlineContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.chatlineContent)");
        this.f31622OooOOo0 = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_red_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_red_content)");
        this.f31621OooOOo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_red_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tv_red_number)");
        this.f31623OooOOoo = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_red_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_red_pic)");
        this.f31624OooOo00 = (NetImageView) viewFindViewById4;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31621OooOOo);
        int iOooO0O0 = p168o00Ooo0.oo000o.OooO0O0();
        if (iOooO0O0 == 1 || iOooO0O0 == 8) {
            TextView textView = this.f31623OooOOoo;
            StringBuilder sb = new StringBuilder();
            sb.append(model.getBonusMessage.getBonuscount());
            sb.append('x');
            textView.setText(sb.toString());
        } else {
            TextView textView2 = this.f31623OooOOoo;
            StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('x');
            sbOooO00o.append(model.getBonusMessage.getBonuscount());
            textView2.setText(sbOooO00o.toString());
        }
        if (model.getBonusMessage.getBonustype() == 2) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(model.getBonusMessage.getGiftimg());
            oooO00o.f48427OooO00o = 0;
            oooO00o.f48441OooOOOo = R.drawable.icon_gift_default_gray;
            oooO00o.OooO0o(this.f31624OooOo00);
        } else {
            this.f31624OooOo00.setImageResource(R.drawable.coin3);
        }
        p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
        long fromid = model.getBonusMessage.getFromid();
        String fromname = model.getBonusMessage.getFromname();
        Intrinsics.checkNotNullExpressionValue(fromname, "model.getBonusMessage.fromname");
        String strOooO0O0 = o00o0o2.OooO0O0(fromid, fromname);
        String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Lucky_Bag_I_received_a_lucky_bag_from_XXX), strOooO0O0);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, strOooO0O0, 0, false, 6, (Object) null);
        int length = strOooO0O0.length() + iIndexOf$default;
        TextView textView3 = this.f31621OooOOo;
        int iOooO00o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_ffe024);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO00o);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf$default, length, 33);
        textView3.setText(spannableStringBuilder);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
