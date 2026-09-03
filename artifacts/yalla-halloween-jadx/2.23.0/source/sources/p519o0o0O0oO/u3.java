package p519o0o0O0oO;

import android.content.Context;
import android.text.Html;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.code.android.videoplayer.view.VideoView;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.DateNumeralUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p031OoooO0.o00Ooo;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p402o0Oo0OOO.o00O000;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThemePreviewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog$initView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
public final class u3 extends o000O<ThemeModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ w3 f53168OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Context context, int i) {
        super(context, i);
        this.f53168OooOoo0 = w3Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String str;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ThemeModel themeModel = (ThemeModel) obj;
        if (viewHolder == null || themeModel == null) {
            return;
        }
        VideoView videoPlayer = (VideoView) viewHolder.getView(oO00O0oO.videoView);
        Intrinsics.checkNotNullExpressionValue(videoPlayer, "convert$lambda$0");
        o000OO00.OooO0O0(videoPlayer);
        ImageView convert$lambda$1 = (ImageView) viewHolder.getView(oO00O0oO.image);
        Intrinsics.checkNotNullExpressionValue(convert$lambda$1, "convert$lambda$1");
        o000OO00.OooOOOO(convert$lambda$1);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = OooO0o.OooO0oo(o0000O0.OooO00o(292), o0000O0.OooO00o(530), themeModel.getPic());
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder_big;
        oooO00o.f43918OooOO0O = new r3();
        oooO00o.OooO0Oo(convert$lambda$1);
        if (!StringsKt.isBlank(themeModel.getVideoPath())) {
            p152o00OoO.OooOO0 oooOO1 = new p152o00OoO.OooOO0();
            w3 w3Var = this.f53168OooOoo0;
            w3Var.f53198OooOOOo.add(oooOO1);
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoView");
            Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
            oooOO1.f38118OooO00o = videoPlayer;
            File file = o00O000.f44470OooO00o;
            o00O000.OooO00o(themeModel.getVideoPath()).observe(w3Var.f52534OooO0o0, new w3.OooO00o(new s3(w3Var, oooOO1)));
            videoPlayer.setStateChangedListener(new t3(convert$lambda$1, videoPlayer));
        }
        int i = oO00O0oO.flSendTheme;
        viewHolder.setGone(i, themeModel.getIsCanGive());
        boolean z = themeModel.getIsHave() == 1;
        int i2 = oO00O0oO.llBuyTheme;
        ((LinearLayout) viewHolder.getView(i2)).setSelected(z);
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(i2);
        LinearLayout llThemePrice = (LinearLayout) viewHolder.getView(oO00O0oO.llThemePrice);
        TextView tvThemePrice = (TextView) viewHolder.getView(oO00O0oO.tvThemePrice);
        TextView textView = (TextView) viewHolder.getView(oO00O0oO.tvThemeCost);
        if (z || themeModel.getThemeTagType() == 1 || themeModel.getThemeTagType() == 3) {
            Intrinsics.checkNotNullExpressionValue(llThemePrice, "llThemePrice");
            o000OO00.OooO0O0(llThemePrice);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvThemePrice, "tvThemePrice");
            o000OO00.OooO0O0(tvThemePrice);
            Intrinsics.checkNotNullExpressionValue(llThemePrice, "llThemePrice");
            o000OO00.OooOOOO(llThemePrice);
            if (themeModel.getTimeLong() < 0) {
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    o000OO00.OooOOOO(tvThemePrice);
                    tvThemePrice.setText(String.valueOf(themeModel.getPrice()));
                    tvThemePrice.getPaint().setFlags(17);
                }
                textView.setText(String.valueOf(themeModel.getPromotionPrice()));
            } else if (themeModel.getPromotionPrice() <= 0) {
                viewHolder.setGone(oO00O0oO.ivCoin, false);
                String strOooO00o = o00Ooo.OooO00o("/", themeModel.getThemeTag(), ZegoConstants.ZegoVideoDataAuxPublishingStream, o0000.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d)));
                textView.setText(o0000.OooO0OO(oO00OOo0.Free) + strOooO00o);
            } else {
                viewHolder.setGone(oO00O0oO.ivCoin, true);
                String strOooO0OO = o0000.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d));
                String strValueOf = String.valueOf(themeModel.getPromotionPrice());
                String strValueOf2 = String.valueOf(themeModel.getTimeLong());
                if (OooO.OooO0o0()) {
                    str = strValueOf + "<font color='#895431'><small>\\" + strValueOf2 + strOooO0OO + "</small></font>";
                } else {
                    str = strValueOf + "<font color='#895431'><small>/" + strValueOf2 + strOooO0OO + "</small></font>";
                }
                textView.setText(Html.fromHtml(str));
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    o000OO00.OooOOOO(tvThemePrice);
                    tvThemePrice.setText(String.valueOf(themeModel.getPrice()));
                    tvThemePrice.getPaint().setFlags(16);
                }
            }
        }
        if (z || o000000O.f46724OoooOoo.getValue() == null) {
            linearLayout.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_theme_can_not_purchase));
        } else {
            linearLayout.setBackground(o0000.OooO0O0(oOo00OO0.room_shape_theme_purchase));
        }
        int i3 = oO00O0oO.tvThemePurchase;
        viewHolder.setGone(i3, z);
        TextView textView2 = (TextView) viewHolder.getView(i3);
        int themeTagType = themeModel.getThemeTagType();
        if (themeTagType != 0) {
            if (themeTagType == 1) {
                textView2.setText(o0000.OooO0OO(z ? oO00OOo0.Obtained : oO00OOo0.Obtain));
                viewHolder.setGone(i3, true);
            } else if (themeTagType != 2) {
                if (themeTagType == 3) {
                    textView2.setText(o0000.OooO0OO(z ? oO00OOo0.Obtained : oO00OOo0.Obtain));
                    viewHolder.setGone(i3, true);
                }
            } else if (z) {
                textView2.setText(o0000.OooO0OO(oO00OOo0.Purchased));
            }
        } else if (z) {
            textView2.setText(o0000.OooO0OO(oO00OOo0.Purchased));
        }
        textView2.setTextColor(o0000.OooO00o(z ? oO00O0o.color_321 : oO00O0o.color_630));
        viewHolder.addOnClickListener(i2);
        viewHolder.addOnClickListener(oO00O0oO.ivClose);
        viewHolder.addOnClickListener(oO00O0oO.clRootView);
        viewHolder.addOnClickListener(oO00O0oO.card);
        viewHolder.addOnClickListener(i);
    }
}
