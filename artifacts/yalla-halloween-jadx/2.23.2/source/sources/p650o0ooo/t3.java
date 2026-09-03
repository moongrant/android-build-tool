package p650o0ooo;

import android.content.Context;
import android.text.Html;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.DateNumeralUtils;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o0OOo000.OooO0O0;
import p031OoooO0.o00Ooo;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p583o0oOoo00.o00000O;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThemePreviewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog$initView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
public final class t3 extends o0000oo<ThemeModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ v3 f59165OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(v3 v3Var, Context context, int i) {
        super(context, i);
        this.f59165OooOoo0 = v3Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        String str;
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ThemeModel themeModel = (ThemeModel) obj;
        if (viewHolder == null || themeModel == null) {
            return;
        }
        VideoView videoPlayer = (VideoView) viewHolder.getView(o0OO00O.videoView);
        Intrinsics.checkNotNull(videoPlayer);
        o000O.OooO0O0(videoPlayer);
        ImageView imageView = (ImageView) viewHolder.getView(o0OO00O.image);
        Intrinsics.checkNotNull(imageView);
        o000O.OooOOOO(imageView);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = OooO0OO.OooO0oo(o0000O0.OooO00o(292), o0000O0.OooO00o(530), themeModel.getPic());
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43138OooOOOo = o0Oo0oo.icon_room_theme_placeholder_big;
        oooO00o.f43133OooOO0O = new q3();
        oooO00o.OooO0Oo(imageView);
        if (!StringsKt.isBlank(themeModel.getVideoPath())) {
            OooO0O0 oooO0O0 = new OooO0O0();
            v3 v3Var = this.f59165OooOoo0;
            v3Var.f59187OooOOOo.add(oooO0O0);
            Intrinsics.checkNotNull(videoPlayer);
            Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
            oooO0O0.f43005OooO00o = videoPlayer;
            File file = o00000O.f56650OooO00o;
            o00000O.OooO00o(themeModel.getVideoPath()).observe(v3Var.f58509OooO0o0, new v3.OooO00o(new r3(v3Var, oooO0O0)));
            videoPlayer.setStateChangedListener(new s3(imageView, videoPlayer));
        }
        int i = o0OO00O.flSendTheme;
        viewHolder.setGone(i, themeModel.getIsCanGive());
        boolean z = themeModel.getIsHave() == 1;
        int i2 = o0OO00O.llBuyTheme;
        ((LinearLayout) viewHolder.getView(i2)).setSelected(z);
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(i2);
        LinearLayout linearLayout2 = (LinearLayout) viewHolder.getView(o0OO00O.llThemePrice);
        TextView textView = (TextView) viewHolder.getView(o0OO00O.tvThemePrice);
        TextView textView2 = (TextView) viewHolder.getView(o0OO00O.tvThemeCost);
        if (z || themeModel.getThemeTagType() == 1 || themeModel.getThemeTagType() == 3) {
            Intrinsics.checkNotNull(linearLayout2);
            o000O.OooO0O0(linearLayout2);
        } else {
            Intrinsics.checkNotNull(textView);
            o000O.OooO0O0(textView);
            Intrinsics.checkNotNull(linearLayout2);
            o000O.OooOOOO(linearLayout2);
            if (themeModel.getTimeLong() < 0) {
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    o000O.OooOOOO(textView);
                    textView.setText(String.valueOf(themeModel.getPrice()));
                    textView.getPaint().setFlags(17);
                }
                textView2.setText(String.valueOf(themeModel.getPromotionPrice()));
            } else if (themeModel.getPromotionPrice() <= 0) {
                viewHolder.setGone(o0OO00O.ivCoin, false);
                String strOooO00o = o00Ooo.OooO00o("/", themeModel.getThemeTag(), ZegoConstants.ZegoVideoDataAuxPublishingStream, o0000.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d)));
                textView2.setText(o0000.OooO0OO(o000000.Free) + strOooO00o);
            } else {
                viewHolder.setGone(o0OO00O.ivCoin, true);
                String strOooO0OO = o0000.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d));
                String strValueOf = String.valueOf(themeModel.getPromotionPrice());
                String strValueOf2 = String.valueOf(themeModel.getTimeLong());
                if (OooOo00.OooO0o0()) {
                    str = strValueOf + "<font color='#895431'><small>\\" + strValueOf2 + strOooO0OO + "</small></font>";
                } else {
                    str = strValueOf + "<font color='#895431'><small>/" + strValueOf2 + strOooO0OO + "</small></font>";
                }
                textView2.setText(Html.fromHtml(str));
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    o000O.OooOOOO(textView);
                    textView.setText(String.valueOf(themeModel.getPrice()));
                    textView.getPaint().setFlags(16);
                }
            }
        }
        if (z || o0O00oO0.f47987Ooooo00.getValue() == null) {
            linearLayout.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_theme_can_not_purchase));
        } else {
            linearLayout.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_theme_purchase));
        }
        int i3 = o0OO00O.tvThemePurchase;
        viewHolder.setGone(i3, z);
        TextView textView3 = (TextView) viewHolder.getView(i3);
        int themeTagType = themeModel.getThemeTagType();
        if (themeTagType != 0) {
            if (themeTagType == 1) {
                textView3.setText(o0000.OooO0OO(z ? o000000.Obtained : o000000.Obtain));
                viewHolder.setGone(i3, true);
            } else if (themeTagType != 2) {
                if (themeTagType == 3) {
                    textView3.setText(o0000.OooO0OO(z ? o000000.Obtained : o000000.Obtain));
                    viewHolder.setGone(i3, true);
                }
            } else if (z) {
                textView3.setText(o0000.OooO0OO(o000000.Purchased));
            }
        } else if (z) {
            textView3.setText(o0000.OooO0OO(o000000.Purchased));
        }
        textView3.setTextColor(o0000.OooO00o(z ? o0OOO0o.color_321 : o0OOO0o.color_630));
        viewHolder.addOnClickListener(i2);
        viewHolder.addOnClickListener(o0OO00O.ivClose);
        viewHolder.addOnClickListener(o0OO00O.clRootView);
        viewHolder.addOnClickListener(o0OO00O.card);
        viewHolder.addOnClickListener(i);
    }
}
