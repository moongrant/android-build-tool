package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f\u001a'\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"createPlatformTextStyleInternal", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformSpanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformParagraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextStyleKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle start, @NotNull TextStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextStyle(SpanStyleKt.lerp(start.toSpanStyle(), stop.toSpanStyle(), f), ParagraphStyleKt.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), f));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle style, @NotNull LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(style.getSpanStyle()), ParagraphStyleKt.resolveParagraphStyleDefaults(style.getParagraphStyle(), direction), style.getPlatformStyle());
    }

    /* JADX INFO: renamed from: resolveTextDirection-Yj3eThk, reason: not valid java name */
    public static final int m3352resolveTextDirectionYj3eThk(@NotNull LayoutDirection layoutDirection, @Nullable TextDirection textDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (textDirection == null ? false : TextDirection.m3690equalsimpl0(textDirection.getValue(), companion.m3694getContents_7Xco())) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i == 1) {
                return companion.m3695getContentOrLtrs_7Xco();
            }
            if (i == 2) {
                return companion.m3696getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (textDirection != null) {
            return textDirection.getValue();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 == 1) {
            return companion.m3697getLtrs_7Xco();
        }
        if (i2 == 2) {
            return companion.m3698getRtls_7Xco();
        }
        throw new NoWhenBranchMatchedException();
    }
}
