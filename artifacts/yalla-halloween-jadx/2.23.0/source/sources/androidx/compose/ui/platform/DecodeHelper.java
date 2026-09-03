package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0016\u0010(\u001a\u00020)ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010\u0012J\u0018\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "string", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "dataAvailable", "", "decodeBaselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeByte", "", "decodeColor", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeFloat", "", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "decodeInt", "decodeShadow", "Landroidx/compose/ui/graphics/Shadow;", "decodeSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "decodeString", "decodeTextDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextUnit", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeULong", "Lkotlin/ULong;", "decodeULong-s-VKNKU", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecodeHelper {

    @NotNull
    private final Parcel parcel;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m3087decodeBaselineShifty9eOQZs() {
        return BaselineShift.m3565constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m3089decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        boolean z = (companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z2 = (iDecodeInt & companion.getUnderline().getMask()) != 0;
        if (z && z2) {
            return companion.combine(CollectionsKt.listOf((Object[]) new TextDecoration[]{companion.getLineThrough(), companion.getUnderline()}));
        }
        if (z) {
            return companion.getLineThrough();
        }
        return z2 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m3088decodeULongsVKNKU() {
        return ULong.m4387constructorimpl(this.parcel.readLong());
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m3089decodeColor0d7_KjU() {
        return Color.m1666constructorimpl(m3088decodeULongsVKNKU());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m3090decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontStyle.INSTANCE.m3411getNormal_LCdwA();
        }
        return bDecodeByte == 1 ? FontStyle.INSTANCE.m3410getItalic_LCdwA() : FontStyle.INSTANCE.m3411getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m3091decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontSynthesis.INSTANCE.m3422getNoneGVVA2EU();
        }
        if (bDecodeByte == 1) {
            return FontSynthesis.INSTANCE.m3421getAllGVVA2EU();
        }
        if (bDecodeByte == 3) {
            return FontSynthesis.INSTANCE.m3423getStyleGVVA2EU();
        }
        return bDecodeByte == 2 ? FontSynthesis.INSTANCE.m3424getWeightGVVA2EU() : FontSynthesis.INSTANCE.m3422getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (bDecodeByte == 2) {
                    if (dataAvailable() < 5) {
                        return mutableSpanStyle.toSpanStyle();
                    }
                    mutableSpanStyle.m3120setFontSizeR2X_6o(m3092decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (bDecodeByte == 3) {
                    if (dataAvailable() < 4) {
                        return mutableSpanStyle.toSpanStyle();
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (bDecodeByte == 4) {
                    if (dataAvailable() < 1) {
                        return mutableSpanStyle.toSpanStyle();
                    }
                    mutableSpanStyle.m3121setFontStylemLjRB2g(FontStyle.m3403boximpl(m3090decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (bDecodeByte != 5) {
                    if (bDecodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (bDecodeByte == 7) {
                        if (dataAvailable() < 5) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.m3123setLetterSpacingR2X_6o(m3092decodeTextUnitXSAIIZE());
                    } else if (bDecodeByte == 8) {
                        if (dataAvailable() < 4) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.m3118setBaselineShift_isdbwI(BaselineShift.m3564boximpl(m3087decodeBaselineShifty9eOQZs()));
                    } else if (bDecodeByte == 9) {
                        if (dataAvailable() < 8) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                    } else if (bDecodeByte == 10) {
                        if (dataAvailable() < 8) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.m3117setBackground8_81llA(m3089decodeColor0d7_KjU());
                    } else if (bDecodeByte == 11) {
                        if (dataAvailable() < 4) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                    } else if (bDecodeByte == 12) {
                        if (dataAvailable() < 20) {
                            return mutableSpanStyle.toSpanStyle();
                        }
                        mutableSpanStyle.setShadow(decodeShadow());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (dataAvailable() < 1) {
                        return mutableSpanStyle.toSpanStyle();
                    }
                    mutableSpanStyle.m3122setFontSynthesistDdu0R4(FontSynthesis.m3412boximpl(m3091decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m3119setColor8_81llA(m3089decodeColor0d7_KjU());
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m3092decodeTextUnitXSAIIZE() {
        long jM3978getEmUIouoOA;
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 1) {
            jM3978getEmUIouoOA = TextUnitType.INSTANCE.m3979getSpUIouoOA();
        } else {
            jM3978getEmUIouoOA = bDecodeByte == 2 ? TextUnitType.INSTANCE.m3978getEmUIouoOA() : TextUnitType.INSTANCE.m3980getUnspecifiedUIouoOA();
        }
        return TextUnitType.m3974equalsimpl0(jM3978getEmUIouoOA, TextUnitType.INSTANCE.m3980getUnspecifiedUIouoOA()) ? TextUnit.INSTANCE.m3957getUnspecifiedXSAIIZE() : TextUnitKt.m3958TextUnitanM5pPY(decodeFloat(), jM3978getEmUIouoOA);
    }
}
