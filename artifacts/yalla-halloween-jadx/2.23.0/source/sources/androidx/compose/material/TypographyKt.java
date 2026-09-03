package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "Landroidx/compose/ui/text/TextStyle;", NewFriendsOld.State_Default, "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TypographyKt {

    @NotNull
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    });

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.getFontFamily() != null ? textStyle : textStyle.m3324copyCXVQc50((4194271 & 1) != 0 ? textStyle.spanStyle.m3269getColor0d7_KjU() : 0L, (4194271 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (4194271 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (4194271 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (4194271 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (4194271 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (4194271 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (4194271 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (4194271 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (4194271 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (4194271 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? textStyle.spanStyle.getLocaleList() : null, (4194271 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (4194271 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (4194271 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (4194271 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : null, (4194271 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (4194271 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (4194271 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (4194271 & 262144) != 0 ? textStyle.platformStyle : null, (4194271 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (4194271 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (4194271 & 2097152) != 0 ? textStyle.paragraphStyle.getHyphens() : null);
    }
}
