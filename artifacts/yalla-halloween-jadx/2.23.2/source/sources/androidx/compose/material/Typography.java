package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012Bo\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/compose/material/Typography;", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "h1", "Landroidx/compose/ui/text/TextStyle;", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", ShareConstants.FEED_CAPTION_PARAM, "overline", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBody1", "()Landroidx/compose/ui/text/TextStyle;", "getBody2", "getButton", "getCaption", "getH1", "getH2", "getH3", "getH4", "getH5", "getH6", "getOverline", "getSubtitle1", "getSubtitle2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Typography {
    public static final int $stable = 0;

    @NotNull
    private final TextStyle body1;

    @NotNull
    private final TextStyle body2;

    @NotNull
    private final TextStyle button;

    @NotNull
    private final TextStyle caption;

    @NotNull
    private final TextStyle h1;

    @NotNull
    private final TextStyle h2;

    @NotNull
    private final TextStyle h3;

    @NotNull
    private final TextStyle h4;

    @NotNull
    private final TextStyle h5;

    @NotNull
    private final TextStyle h6;

    @NotNull
    private final TextStyle overline;

    @NotNull
    private final TextStyle subtitle1;

    @NotNull
    private final TextStyle subtitle2;

    public Typography(@NotNull TextStyle h1, @NotNull TextStyle h2, @NotNull TextStyle h3, @NotNull TextStyle h4, @NotNull TextStyle h5, @NotNull TextStyle h6, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    @NotNull
    public final Typography copy(@NotNull TextStyle h1, @NotNull TextStyle h2, @NotNull TextStyle h3, @NotNull TextStyle h4, @NotNull TextStyle h5, @NotNull TextStyle h6, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        return new Typography(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.h1, typography.h1) && Intrinsics.areEqual(this.h2, typography.h2) && Intrinsics.areEqual(this.h3, typography.h3) && Intrinsics.areEqual(this.h4, typography.h4) && Intrinsics.areEqual(this.h5, typography.h5) && Intrinsics.areEqual(this.h6, typography.h6) && Intrinsics.areEqual(this.subtitle1, typography.subtitle1) && Intrinsics.areEqual(this.subtitle2, typography.subtitle2) && Intrinsics.areEqual(this.body1, typography.body1) && Intrinsics.areEqual(this.body2, typography.body2) && Intrinsics.areEqual(this.button, typography.button) && Intrinsics.areEqual(this.caption, typography.caption) && Intrinsics.areEqual(this.overline, typography.overline);
    }

    @NotNull
    public final TextStyle getBody1() {
        return this.body1;
    }

    @NotNull
    public final TextStyle getBody2() {
        return this.body2;
    }

    @NotNull
    public final TextStyle getButton() {
        return this.button;
    }

    @NotNull
    public final TextStyle getCaption() {
        return this.caption;
    }

    @NotNull
    public final TextStyle getH1() {
        return this.h1;
    }

    @NotNull
    public final TextStyle getH2() {
        return this.h2;
    }

    @NotNull
    public final TextStyle getH3() {
        return this.h3;
    }

    @NotNull
    public final TextStyle getH4() {
        return this.h4;
    }

    @NotNull
    public final TextStyle getH5() {
        return this.h5;
    }

    @NotNull
    public final TextStyle getH6() {
        return this.h6;
    }

    @NotNull
    public final TextStyle getOverline() {
        return this.overline;
    }

    @NotNull
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    @NotNull
    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return this.overline.hashCode() + ((this.caption.hashCode() + ((this.button.hashCode() + ((this.body2.hashCode() + ((this.body1.hashCode() + ((this.subtitle2.hashCode() + ((this.subtitle1.hashCode() + ((this.h6.hashCode() + ((this.h5.hashCode() + ((this.h4.hashCode() + ((this.h3.hashCode() + ((this.h2.hashCode() + (this.h1.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TextStyle textStyleM3338copyv2rsoow;
        TextStyle textStyleM3338copyv2rsoow2;
        TextStyle textStyleM3338copyv2rsoow3;
        TextStyle textStyleM3338copyv2rsoow4;
        TextStyle textStyleM3338copyv2rsoow5;
        TextStyle textStyleM3338copyv2rsoow6;
        TextStyle textStyleM3338copyv2rsoow7;
        TextStyle textStyleM3338copyv2rsoow8;
        TextStyle textStyleM3338copyv2rsoow9;
        TextStyle textStyleM3338copyv2rsoow10;
        TextStyle textStyleM3338copyv2rsoow11;
        TextStyle textStyleM3338copyv2rsoow12;
        TextStyle textStyleM3338copyv2rsoow13;
        FontFamily fontFamily2 = (i & 1) != 0 ? FontFamily.INSTANCE.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            TextStyle defaultTextStyle = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow = defaultTextStyle.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle.spanStyle.getFontSize() : TextUnitKt.getSp(96), (16252927 & 4) != 0 ? defaultTextStyle.spanStyle.getFontWeight() : FontWeight.INSTANCE.getLight(), (16252927 & 8) != 0 ? defaultTextStyle.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle.spanStyle.getLetterSpacing() : TextUnitKt.getSp(-1.5d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow = textStyle;
        }
        if ((i & 4) != 0) {
            TextStyle defaultTextStyle2 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow2 = defaultTextStyle2.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle2.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle2.spanStyle.getFontSize() : TextUnitKt.getSp(60), (16252927 & 4) != 0 ? defaultTextStyle2.spanStyle.getFontWeight() : FontWeight.INSTANCE.getLight(), (16252927 & 8) != 0 ? defaultTextStyle2.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle2.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle2.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle2.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle2.spanStyle.getLetterSpacing() : TextUnitKt.getSp(-0.5d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle2.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle2.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle2.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle2.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle2.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle2.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle2.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle2.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle2.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle2.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle2.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle2.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle2.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle2.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle2.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle2.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow2 = textStyle2;
        }
        if ((i & 8) != 0) {
            TextStyle defaultTextStyle3 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow3 = defaultTextStyle3.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle3.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle3.spanStyle.getFontSize() : TextUnitKt.getSp(48), (16252927 & 4) != 0 ? defaultTextStyle3.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle3.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle3.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle3.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle3.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle3.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle3.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle3.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle3.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle3.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle3.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle3.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle3.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle3.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle3.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle3.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle3.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle3.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle3.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle3.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle3.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle3.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow3 = textStyle3;
        }
        if ((i & 16) != 0) {
            TextStyle defaultTextStyle4 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow4 = defaultTextStyle4.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle4.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle4.spanStyle.getFontSize() : TextUnitKt.getSp(34), (16252927 & 4) != 0 ? defaultTextStyle4.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle4.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle4.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle4.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle4.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle4.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.25d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle4.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle4.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle4.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle4.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle4.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle4.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle4.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle4.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle4.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle4.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle4.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle4.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle4.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle4.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle4.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle4.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow4 = textStyle4;
        }
        if ((i & 32) != 0) {
            TextStyle defaultTextStyle5 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow5 = defaultTextStyle5.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle5.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle5.spanStyle.getFontSize() : TextUnitKt.getSp(24), (16252927 & 4) != 0 ? defaultTextStyle5.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle5.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle5.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle5.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle5.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle5.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle5.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle5.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle5.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle5.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle5.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle5.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle5.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle5.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle5.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle5.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle5.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle5.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle5.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle5.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle5.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle5.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow5 = textStyle5;
        }
        if ((i & 64) != 0) {
            TextStyle defaultTextStyle6 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow6 = defaultTextStyle6.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle6.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle6.spanStyle.getFontSize() : TextUnitKt.getSp(20), (16252927 & 4) != 0 ? defaultTextStyle6.spanStyle.getFontWeight() : FontWeight.INSTANCE.getMedium(), (16252927 & 8) != 0 ? defaultTextStyle6.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle6.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle6.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle6.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle6.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.15d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle6.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle6.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle6.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle6.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle6.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle6.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle6.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle6.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle6.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle6.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle6.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle6.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle6.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle6.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle6.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle6.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow6 = textStyle6;
        }
        if ((i & 128) != 0) {
            TextStyle defaultTextStyle7 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow7 = defaultTextStyle7.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle7.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle7.spanStyle.getFontSize() : TextUnitKt.getSp(16), (16252927 & 4) != 0 ? defaultTextStyle7.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle7.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle7.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle7.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle7.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle7.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.15d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle7.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle7.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle7.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle7.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle7.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle7.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle7.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle7.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle7.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle7.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle7.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle7.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle7.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle7.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle7.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle7.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow7 = textStyle7;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            TextStyle defaultTextStyle8 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow8 = defaultTextStyle8.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle8.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle8.spanStyle.getFontSize() : TextUnitKt.getSp(14), (16252927 & 4) != 0 ? defaultTextStyle8.spanStyle.getFontWeight() : FontWeight.INSTANCE.getMedium(), (16252927 & 8) != 0 ? defaultTextStyle8.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle8.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle8.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle8.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle8.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.1d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle8.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle8.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle8.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle8.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle8.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle8.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle8.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle8.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle8.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle8.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle8.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle8.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle8.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle8.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle8.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle8.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow8 = textStyle8;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            TextStyle defaultTextStyle9 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow9 = defaultTextStyle9.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle9.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle9.spanStyle.getFontSize() : TextUnitKt.getSp(16), (16252927 & 4) != 0 ? defaultTextStyle9.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle9.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle9.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle9.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle9.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle9.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.5d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle9.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle9.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle9.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle9.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle9.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle9.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle9.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle9.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle9.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle9.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle9.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle9.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle9.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle9.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle9.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle9.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow9 = textStyle9;
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            TextStyle defaultTextStyle10 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow10 = defaultTextStyle10.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle10.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle10.spanStyle.getFontSize() : TextUnitKt.getSp(14), (16252927 & 4) != 0 ? defaultTextStyle10.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle10.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle10.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle10.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle10.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle10.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.25d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle10.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle10.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle10.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle10.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle10.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle10.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle10.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle10.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle10.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle10.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle10.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle10.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle10.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle10.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle10.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle10.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow10 = textStyle10;
        }
        if ((i & 2048) != 0) {
            TextStyle defaultTextStyle11 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow11 = defaultTextStyle11.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle11.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle11.spanStyle.getFontSize() : TextUnitKt.getSp(14), (16252927 & 4) != 0 ? defaultTextStyle11.spanStyle.getFontWeight() : FontWeight.INSTANCE.getMedium(), (16252927 & 8) != 0 ? defaultTextStyle11.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle11.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle11.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle11.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle11.spanStyle.getLetterSpacing() : TextUnitKt.getSp(1.25d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle11.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle11.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle11.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle11.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle11.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle11.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle11.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle11.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle11.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle11.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle11.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle11.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle11.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle11.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle11.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle11.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow11 = textStyle11;
        }
        if ((i & 4096) != 0) {
            TextStyle defaultTextStyle12 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow12 = defaultTextStyle12.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle12.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle12.spanStyle.getFontSize() : TextUnitKt.getSp(12), (16252927 & 4) != 0 ? defaultTextStyle12.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle12.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle12.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle12.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle12.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle12.spanStyle.getLetterSpacing() : TextUnitKt.getSp(0.4d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle12.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle12.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle12.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle12.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle12.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle12.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle12.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle12.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle12.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle12.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle12.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle12.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle12.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle12.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle12.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle12.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow12 = textStyle12;
        }
        if ((i & 8192) != 0) {
            TextStyle defaultTextStyle13 = TypographyKt.getDefaultTextStyle();
            textStyleM3338copyv2rsoow13 = defaultTextStyle13.m3338copyv2rsoow((16252927 & 1) != 0 ? defaultTextStyle13.spanStyle.m3279getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? defaultTextStyle13.spanStyle.getFontSize() : TextUnitKt.getSp(10), (16252927 & 4) != 0 ? defaultTextStyle13.spanStyle.getFontWeight() : FontWeight.INSTANCE.getNormal(), (16252927 & 8) != 0 ? defaultTextStyle13.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? defaultTextStyle13.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? defaultTextStyle13.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? defaultTextStyle13.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? defaultTextStyle13.spanStyle.getLetterSpacing() : TextUnitKt.getSp(1.5d), (16252927 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? defaultTextStyle13.spanStyle.getBaselineShift() : null, (16252927 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? defaultTextStyle13.spanStyle.getTextGeometricTransform() : null, (16252927 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? defaultTextStyle13.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? defaultTextStyle13.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? defaultTextStyle13.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? defaultTextStyle13.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? defaultTextStyle13.spanStyle.getDrawStyle() : null, (16252927 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? defaultTextStyle13.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? defaultTextStyle13.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? defaultTextStyle13.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? defaultTextStyle13.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? defaultTextStyle13.platformStyle : null, (16252927 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? defaultTextStyle13.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? defaultTextStyle13.paragraphStyle.getLineBreak() : null, (16252927 & Configuration.BLOCK_SIZE) != 0 ? defaultTextStyle13.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? defaultTextStyle13.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleM3338copyv2rsoow13 = textStyle13;
        }
        this(fontFamily2, textStyleM3338copyv2rsoow, textStyleM3338copyv2rsoow2, textStyleM3338copyv2rsoow3, textStyleM3338copyv2rsoow4, textStyleM3338copyv2rsoow5, textStyleM3338copyv2rsoow6, textStyleM3338copyv2rsoow7, textStyleM3338copyv2rsoow8, textStyleM3338copyv2rsoow9, textStyleM3338copyv2rsoow10, textStyleM3338copyv2rsoow11, textStyleM3338copyv2rsoow12, textStyleM3338copyv2rsoow13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography(@NotNull FontFamily defaultFontFamily, @NotNull TextStyle h1, @NotNull TextStyle h2, @NotNull TextStyle h3, @NotNull TextStyle h4, @NotNull TextStyle h5, @NotNull TextStyle h6, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        this(TypographyKt.withDefaultFontFamily(h1, defaultFontFamily), TypographyKt.withDefaultFontFamily(h2, defaultFontFamily), TypographyKt.withDefaultFontFamily(h3, defaultFontFamily), TypographyKt.withDefaultFontFamily(h4, defaultFontFamily), TypographyKt.withDefaultFontFamily(h5, defaultFontFamily), TypographyKt.withDefaultFontFamily(h6, defaultFontFamily), TypographyKt.withDefaultFontFamily(subtitle1, defaultFontFamily), TypographyKt.withDefaultFontFamily(subtitle2, defaultFontFamily), TypographyKt.withDefaultFontFamily(body1, defaultFontFamily), TypographyKt.withDefaultFontFamily(body2, defaultFontFamily), TypographyKt.withDefaultFontFamily(button, defaultFontFamily), TypographyKt.withDefaultFontFamily(caption, defaultFontFamily), TypographyKt.withDefaultFontFamily(overline, defaultFontFamily));
        Intrinsics.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
    }
}
