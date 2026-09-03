package p579o0oOoOOo;

import android.content.Context;
import android.text.Html;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.app.base.util.DateNumeralUtils;
import com.chad.library.adapter.base.OooO00o;
import com.common.videoplayer.view.VideoView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.manager.data.SharedThemeVideoManager;
import com.yalla.yalla.model.ThemeModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0O00O0o.OooO0O0;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends OooO0OO<ThemeModel> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f45903OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ c1 f45904OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, Context context) {
        super(context, R.layout.room_item_theme_preview_dialog);
        this.f45904OooO00o = c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0217  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList, java.util.List<o0O00O0o.OooO0O0>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        ThemeModel themeModel = (ThemeModel) obj;
        if (oooO0o == null || themeModel == null) {
            return;
        }
        VideoView videoPlayer = (VideoView) oooO0o.OooO0Oo(R.id.videoView);
        Intrinsics.checkNotNullExpressionValue(videoPlayer, "");
        oOO00O.OooO00o(videoPlayer);
        ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.image);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        oOO00O.OooO(imageView);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(themeModel.getPic(), OooOo00.OooO00o(292), OooOo00.OooO00o(530));
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48441OooOOOo = R.drawable.icon_room_theme_placeholder_big;
        oooO00o2.f48436OooOO0O = new y0();
        oooO00o2.OooO0o(imageView);
        int i = 1;
        if (!StringsKt.isBlank(themeModel.getVideoPath())) {
            o0O00000.OooO0OO("InRoom_hostTheme_previewDynamic");
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f45904OooO00o.f45939OoooOo0.add(oooO0O0);
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoView");
            Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
            oooO0O0.f35126OooO00o = videoPlayer;
            LiveData<String> liveDataLoadVideo = SharedThemeVideoManager.INSTANCE.loadVideo(themeModel.getVideoPath());
            c1 c1Var = this.f45904OooO00o;
            liveDataLoadVideo.observe(c1Var.f41544Oooo0oO, new p163o00OoOo.oOO00O(c1Var, oooO0O0, i));
            videoPlayer.setStateChangedListener(new z0(imageView, videoPlayer));
        }
        oooO0o.OooO0oO(R.id.flSendTheme, themeModel.getIsCanGive());
        boolean z = themeModel.getIsHave() == 1;
        ((LinearLayout) oooO0o.OooO0Oo(R.id.llBuyTheme)).setSelected(z);
        LinearLayout linearLayout = (LinearLayout) oooO0o.OooO0Oo(R.id.llBuyTheme);
        LinearLayout llThemePrice = (LinearLayout) oooO0o.OooO0Oo(R.id.llThemePrice);
        TextView tvThemePrice = (TextView) oooO0o.OooO0Oo(R.id.tvThemePrice);
        TextView textView = (TextView) oooO0o.OooO0Oo(R.id.tvThemeCost);
        if (z || themeModel.getThemeTagType() == 1 || themeModel.getThemeTagType() == 3) {
            Intrinsics.checkNotNullExpressionValue(llThemePrice, "llThemePrice");
            oOO00O.OooO00o(llThemePrice);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvThemePrice, "tvThemePrice");
            oOO00O.OooO00o(tvThemePrice);
            Intrinsics.checkNotNullExpressionValue(llThemePrice, "llThemePrice");
            oOO00O.OooO(llThemePrice);
            if (themeModel.getTimeLong() < 0) {
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    oOO00O.OooO(tvThemePrice);
                    tvThemePrice.setText(String.valueOf(themeModel.getPrice()));
                    tvThemePrice.getPaint().setFlags(17);
                }
                textView.setText(String.valueOf(themeModel.getPromotionPrice()));
            } else if (themeModel.getPromotionPrice() <= 0) {
                oooO0o.OooO0oO(R.id.ivCoin, false);
                textView.setText(o000O0O0.OooO0OO(R.string.Free) + ('/' + themeModel.getThemeTag() + ' ' + o000O0O0.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d))));
            } else {
                oooO0o.OooO0oO(R.id.ivCoin, true);
                String strOooO0OO = o000O0O0.OooO0OO(DateNumeralUtils.OooO00o(themeModel.getTimeLong(), DateNumeralUtils.DateType.d));
                String strValueOf = String.valueOf(themeModel.getPromotionPrice());
                String strValueOf2 = String.valueOf(themeModel.getTimeLong());
                textView.setText(Html.fromHtml(oo000o.OooO0o0() ? p060o0000o.oo000o.OooO00o(strValueOf, "<font color='#895431'><small>\\", strValueOf2, strOooO0OO, "</small></font>") : p060o0000o.oo000o.OooO00o(strValueOf, "<font color='#895431'><small>/", strValueOf2, strOooO0OO, "</small></font>")));
                if (themeModel.getPrice() > themeModel.getPromotionPrice()) {
                    oOO00O.OooO(tvThemePrice);
                    tvThemePrice.setText(String.valueOf(themeModel.getPrice()));
                    tvThemePrice.getPaint().setFlags(16);
                }
            }
        }
        if (z) {
            linearLayout.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_theme_can_not_purchase));
        } else {
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            if (p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue() == null) {
                linearLayout.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_theme_can_not_purchase));
            } else {
                linearLayout.setBackground(OooOOO.OooO0O0(R.drawable.room_shape_theme_purchase));
            }
        }
        oooO0o.OooO0oO(R.id.tvThemePurchase, z);
        TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.tvThemePurchase);
        int themeTagType = themeModel.getThemeTagType();
        if (themeTagType != 0) {
            if (themeTagType == 1) {
                textView2.setText(z ? o000O0O0.OooO0OO(R.string.Obtained) : o000O0O0.OooO0OO(R.string.Obtain));
                oooO0o.OooO0oO(R.id.tvThemePurchase, true);
            } else if (themeTagType != 2) {
                if (themeTagType == 3) {
                    textView2.setText(z ? o000O0O0.OooO0OO(R.string.Obtained) : o000O0O0.OooO0OO(R.string.Obtain));
                    oooO0o.OooO0oO(R.id.tvThemePurchase, true);
                }
            } else if (z) {
                textView2.setText(o000O0O0.OooO0OO(R.string.Purchased));
            }
        } else if (z) {
            textView2.setText(o000O0O0.OooO0OO(R.string.Purchased));
        }
        textView2.setTextColor(o000O0O0.OooO00o(z ? R.color.color_321 : R.color.color_630));
        oooO0o.OooO0O0(R.id.llBuyTheme);
        oooO0o.OooO0O0(R.id.ivClose);
        oooO0o.OooO0O0(R.id.clRootView);
        oooO0o.OooO0O0(R.id.card);
        oooO0o.OooO0O0(R.id.flSendTheme);
    }
}
