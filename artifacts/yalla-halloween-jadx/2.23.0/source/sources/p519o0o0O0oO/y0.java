package p519o0o0O0oO;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.model.gift.ThemeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGifBuyDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGifBuyDialogUtil.kt\ncom/yalla/yalla/ui/dialog/RoomGifBuyDialogUtil$showRoomGifBuyDialog$1$1\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,110:1\n1098#2:111\n154#3:112\n*S KotlinDebug\n*F\n+ 1 RoomGifBuyDialogUtil.kt\ncom/yalla/yalla/ui/dialog/RoomGifBuyDialogUtil$showRoomGifBuyDialog$1$1\n*L\n54#1:111\n105#1:112\n*E\n"})
public final class y0 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GifListJson f53214OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(GifListJson gifListJson) {
        super(3);
        this.f53214OooO0Oo = gifListJson;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        String beforeTips2;
        ColumnScope TextDialog = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362092999, iIntValue, -1, "com.yalla.yalla.ui.dialog.RoomGifBuyDialogUtil.showRoomGifBuyDialog.<anonymous>.<anonymous> (RoomGifBuyDialogUtil.kt:37)");
            }
            GifListJson gifListJson = this.f53214OooO0Oo;
            int price = gifListJson.getPrice();
            int promotionPrice = gifListJson.getPromotionPrice();
            boolean z = price == promotionPrice;
            ThemeConfig themeConfig = gifListJson.getThemeConfig();
            if (z) {
                if (themeConfig != null) {
                    beforeTips2 = themeConfig.getBeforeTips1();
                } else {
                    beforeTips2 = null;
                }
            } else if (themeConfig != null) {
                beforeTips2 = themeConfig.getBeforeTips2();
            } else {
                beforeTips2 = null;
            }
            if (beforeTips2 != null) {
                String strOooO00o = z ? o0000O.OooO00o(beforeTips2, "XXX", String.valueOf(price)) : o0000O.OooO00o(o0000O.OooO00o(beforeTips2, "XXX1", String.valueOf(price)), "XXX2", String.valueOf(promotionPrice));
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(strOooO00o);
                if (z) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX", 0, false, 6, (Object) null);
                    builder.addStyle(new SpanStyle(o0oO0O0o.f47087o000oOoo, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, String.valueOf(price).length() + iIndexOf$default);
                } else if (StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX1", 0, false, 6, (Object) null) < StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX2", 0, false, 6, (Object) null)) {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX1", 0, false, 6, (Object) null);
                    int length = String.valueOf(price).length();
                    long j = o0oO0O0o.f47087o000oOoo;
                    int i = length + iIndexOf$default2;
                    builder.addStyle(new SpanStyle(Color.m1669copywmQWz5c$default(j, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), iIndexOf$default2, i);
                    int i2 = i + 1;
                    builder.addStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), i2, String.valueOf(promotionPrice).length() + i2);
                } else {
                    int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) beforeTips2, "XXX2", 0, false, 6, (Object) null);
                    int length2 = String.valueOf(price).length();
                    long j2 = o0oO0O0o.f47087o000oOoo;
                    int i3 = length2 + iIndexOf$default3;
                    builder.addStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default3, i3);
                    int i4 = i3 + 1;
                    builder.addStyle(new SpanStyle(Color.m1669copywmQWz5c$default(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), i4, String.valueOf(price).length() + i4);
                }
                TextKt.m1252TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(25), 0.0f, 2, null), o0oO0O0o.f47085o000o0oo, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 3120, 0, 262128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
