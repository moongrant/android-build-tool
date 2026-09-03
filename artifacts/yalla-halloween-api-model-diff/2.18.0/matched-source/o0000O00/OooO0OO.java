package o0000O00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.appcompat.widget.o00000O0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.Oooo0;
import o00000O.oo0o0Oo;
import o00000OO.o00O0O;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0O0;
import p042Ooooo0o.o000O0Oo;
import p051o00000Oo.o00Ooo;
import p051o00000Oo.oo000o;
import p052o00000o0.o00000OO;
import p064o0000oO.o0000;
import p146o00Oo0.OooOOO;
import p146o00Oo0.OooOOOO;
import p146o00Oo0.o000O0o;
import p146o00Oo0.o000OO00;
import p146o00Oo0.o0O0O00;
import p146o00Oo0.o0Oo0oo;
import p146o00Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o00000O.OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f27293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27294OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f27295OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O0O f27296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f27297OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<o00O0O.OooOO0O> f27298OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00Ooo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00Ooo invoke() {
            Locale textLocale = OooO0OO.this.f27293OooO00o.f27307OooO0oO.getTextLocale();
            Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
            return new o00Ooo(textLocale, OooO0OO.this.f27296OooO0Oo.OooO0oo());
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x007a  */
    public OooO0OO(OooO0o oooO0o, int i, boolean z, long j) {
        o0000[] brushSpans;
        List<o00O0O.OooOO0O> listEmptyList;
        o00O0O.OooOO0O oooOO0O;
        float fOooOOoo;
        float fOooO0O0;
        int iOooO0O0;
        float fOooO0o;
        float fOooO0O1;
        float fOooO0O2;
        this.f27293OooO00o = oooO0o;
        this.f27294OooO0O0 = i;
        this.f27295OooO0OO = j;
        if (!(o0000O0O.OooO0O0.OooO(j) == 0 && o0000O0O.OooO0O0.OooOO0(j) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (!(i >= 1)) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        oo0o0Oo oo0o0oo = oooO0o.f27302OooO0O0;
        o0000O0.OooO0o oooO0o2 = oo0o0oo.f26921OooO0O0.f26812OooO00o;
        int i2 = 3;
        if (!(oooO0o2 != null && oooO0o2.f27281OooO00o == 1)) {
            if (oooO0o2 != null && oooO0o2.f27281OooO00o == 2) {
                i2 = 4;
            } else if (oooO0o2 != null && oooO0o2.f27281OooO00o == 3) {
                i2 = 2;
            } else if (oooO0o2 != null && oooO0o2.f27281OooO00o == 5) {
                i2 = 0;
            } else if (oooO0o2 != null && oooO0o2.f27281OooO00o == 6) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        int i3 = (oooO0o2 != null && oooO0o2.f27281OooO00o == 4) ? 1 : 0;
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        o00O0O o00o0oOooOo0O = OooOo0O(i2, i3, truncateAt, i);
        if (!z || o00o0oOooOo0O.OooO00o() <= o0000O0O.OooO0O0.OooO0oO(j) || i <= 1) {
            this.f27296OooO0Oo = o00o0oOooOo0O;
        } else {
            int iOooO0oO = o0000O0O.OooO0O0.OooO0oO(j);
            int i4 = o00o0oOooOo0O.f27081OooO0OO;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    i5 = o00o0oOooOo0O.f27081OooO0OO;
                    break;
                } else if (o00o0oOooOo0O.OooO0OO(i5) > iOooO0oO) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 > 0 && i5 != this.f27294OooO0O0) {
                o00o0oOooOo0O = OooOo0O(i2, i3, truncateAt, i5);
            }
            this.f27296OooO0Oo = o00o0oOooOo0O;
        }
        this.f27293OooO00o.f27307OooO0oO.OooO00o(oo0o0oo.OooO0O0(), OooOo.OooO00o(getWidth(), getHeight()));
        o00O0O o00o0o2 = this.f27296OooO0Oo;
        if (o00o0o2.OooO0oo() instanceof Spanned) {
            brushSpans = (o0000[]) ((Spanned) o00o0o2.OooO0oo()).getSpans(0, o00o0o2.OooO0oo().length(), o0000.class);
            Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
            if (brushSpans.length == 0) {
                brushSpans = new o0000[0];
            }
        } else {
            brushSpans = new o0000[0];
        }
        for (o0000 o0000Var : brushSpans) {
            o0000Var.f27934OoooO00 = new OooOo00(OooOo.OooO00o(getWidth(), getHeight()));
        }
        CharSequence charSequence = this.f27293OooO00o.f27308OooO0oo;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), o00000OO.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                o00000OO o00000oo2 = (o00000OO) obj;
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(o00000oo2);
                int spanEnd = spanned.getSpanEnd(o00000oo2);
                int iOooO0o0 = this.f27296OooO0Oo.OooO0o0(spanStart);
                boolean z2 = this.f27296OooO0Oo.f27080OooO0O0.getEllipsisCount(iOooO0o0) > 0 && spanEnd > this.f27296OooO0Oo.f27080OooO0O0.getEllipsisStart(iOooO0o0);
                boolean z3 = spanEnd > this.f27296OooO0Oo.OooO0Oo(iOooO0o0);
                if (z2 || z3) {
                    oooOO0O = null;
                } else {
                    int i6 = OooO00o.$EnumSwitchMapping$0[(this.f27296OooO0Oo.f27080OooO0O0.isRtlCharAt(spanStart) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr).ordinal()];
                    if (i6 == 1) {
                        fOooOOoo = OooOOoo(spanStart, true);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fOooOOoo = OooOOoo(spanStart, true) - o00000oo2.OooO0OO();
                    }
                    float fOooO0OO = o00000oo2.OooO0OO() + fOooOOoo;
                    o00O0O o00o0o3 = this.f27296OooO0Oo;
                    switch (o00000oo2.f27115OoooOO0) {
                        case 0:
                            fOooO0O0 = o00o0o3.OooO0O0(iOooO0o0);
                            iOooO0O0 = o00000oo2.OooO0O0();
                            fOooO0o = fOooO0O0 - iOooO0O0;
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 1:
                            fOooO0o = o00o0o3.OooO0o(iOooO0o0);
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 2:
                            fOooO0O0 = o00o0o3.OooO0OO(iOooO0o0);
                            iOooO0O0 = o00000oo2.OooO0O0();
                            fOooO0o = fOooO0O0 - iOooO0O0;
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 3:
                            fOooO0o = ((o00o0o3.OooO0OO(iOooO0o0) + o00o0o3.OooO0o(iOooO0o0)) - o00000oo2.OooO0O0()) / 2;
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 4:
                            fOooO0O1 = o00000oo2.OooO00o().ascent;
                            fOooO0O2 = o00o0o3.OooO0O0(iOooO0o0);
                            fOooO0o = fOooO0O2 + fOooO0O1;
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 5:
                            fOooO0o = (o00o0o3.OooO0O0(iOooO0o0) + o00000oo2.OooO00o().descent) - o00000oo2.OooO0O0();
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntOooO00o = o00000oo2.OooO00o();
                            fOooO0O1 = ((fontMetricsIntOooO00o.ascent + fontMetricsIntOooO00o.descent) - o00000oo2.OooO0O0()) / 2;
                            fOooO0O2 = o00o0o3.OooO0O0(iOooO0o0);
                            fOooO0o = fOooO0O2 + fOooO0O1;
                            oooOO0O = new o00O0O.OooOO0O(fOooOOoo, fOooO0o, fOooO0OO, o00000oo2.OooO0O0() + fOooO0o);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(oooOO0O);
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f27298OooO0o0 = listEmptyList;
        this.f27297OooO0o = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OooO0O0());
    }

    @Override // o00000O.OooOO0O
    public final float OooO(int i) {
        return this.f27296OooO0Oo.OooO0OO(i);
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final ResolvedTextDirection OooO00o(int i) {
        return this.f27296OooO0Oo.f27080OooO0O0.getParagraphDirection(this.f27296OooO0Oo.OooO0o0(i)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // o00000O.OooOO0O
    public final float OooO0O0(int i) {
        return this.f27296OooO0Oo.OooO0o(i);
    }

    @Override // o00000O.OooOO0O
    public final float OooO0OO() {
        int i = this.f27294OooO0O0;
        int i2 = this.f27296OooO0Oo.f27081OooO0OO;
        return i < i2 ? OooOo0o(i - 1) : OooOo0o(i2 - 1);
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final o00O0O.OooOO0O OooO0Oo(int i) {
        if (i >= 0 && i <= this.f27293OooO00o.f27308OooO0oo.length()) {
            float fOooO0oO = o00O0O.OooO0oO(this.f27296OooO0Oo, i);
            int iOooO0o0 = this.f27296OooO0Oo.OooO0o0(i);
            return new o00O0O.OooOO0O(fOooO0oO, this.f27296OooO0Oo.OooO0o(iOooO0o0), fOooO0oO, this.f27296OooO0Oo.OooO0OO(iOooO0o0));
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("offset(", i, ") is out of bounds (0,");
        sbOooO00o.append(this.f27293OooO00o.f27308OooO0oo.length());
        throw new AssertionError(sbOooO00o.toString());
    }

    @Override // o00000O.OooOO0O
    public final int OooO0o(int i) {
        return this.f27296OooO0Oo.OooO0o0(i);
    }

    @Override // o00000O.OooOO0O
    public final long OooO0o0(int i) {
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        o00Ooo o00ooo2 = (o00Ooo) this.f27297OooO0o.getValue();
        oo000o oo000oVar = o00ooo2.f27088OooO00o;
        oo000oVar.OooO00o(i);
        if (o00ooo2.f27088OooO00o.OooO0o0(oo000oVar.f27093OooO0Oo.preceding(i))) {
            oo000o oo000oVar2 = o00ooo2.f27088OooO00o;
            oo000oVar2.OooO00o(i);
            iPreceding = i;
            while (iPreceding != -1) {
                if (oo000oVar2.OooO0o0(iPreceding) && !oo000oVar2.OooO0OO(iPreceding)) {
                    break;
                }
                oo000oVar2.OooO00o(iPreceding);
                iPreceding = oo000oVar2.f27093OooO0Oo.preceding(iPreceding);
            }
        } else {
            oo000o oo000oVar3 = o00ooo2.f27088OooO00o;
            oo000oVar3.OooO00o(i);
            if (oo000oVar3.OooO0Oo(i)) {
                if (!oo000oVar3.f27093OooO0Oo.isBoundary(i) || oo000oVar3.OooO0O0(i)) {
                    iPreceding2 = oo000oVar3.f27093OooO0Oo.preceding(i);
                    iPreceding = iPreceding2;
                } else {
                    iPreceding = i;
                }
            } else if (oo000oVar3.OooO0O0(i)) {
                iPreceding2 = oo000oVar3.f27093OooO0Oo.preceding(i);
                iPreceding = iPreceding2;
            } else {
                iPreceding = -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = i;
        }
        o00Ooo o00ooo3 = (o00Ooo) this.f27297OooO0o.getValue();
        oo000o oo000oVar4 = o00ooo3.f27088OooO00o;
        oo000oVar4.OooO00o(i);
        if (o00ooo3.f27088OooO00o.OooO0OO(oo000oVar4.f27093OooO0Oo.following(i))) {
            oo000o oo000oVar5 = o00ooo3.f27088OooO00o;
            oo000oVar5.OooO00o(i);
            iFollowing = i;
            while (iFollowing != -1) {
                if (!oo000oVar5.OooO0o0(iFollowing) && oo000oVar5.OooO0OO(iFollowing)) {
                    break;
                }
                oo000oVar5.OooO00o(iFollowing);
                iFollowing = oo000oVar5.f27093OooO0Oo.following(iFollowing);
            }
        } else {
            oo000o oo000oVar6 = o00ooo3.f27088OooO00o;
            oo000oVar6.OooO00o(i);
            if (oo000oVar6.OooO0O0(i)) {
                if (!oo000oVar6.f27093OooO0Oo.isBoundary(i) || oo000oVar6.OooO0Oo(i)) {
                    iFollowing2 = oo000oVar6.f27093OooO0Oo.following(i);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = i;
                }
            } else if (oo000oVar6.OooO0Oo(i)) {
                iFollowing2 = oo000oVar6.f27093OooO0Oo.following(i);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            i = iFollowing;
        }
        return o000O0O0.OooO00o(iPreceding, i);
    }

    @Override // o00000O.OooOO0O
    public final float OooO0oO() {
        return OooOo0o(0);
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final ResolvedTextDirection OooO0oo(int i) {
        return this.f27296OooO0Oo.f27080OooO0O0.isRtlCharAt(i) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // o00000O.OooOO0O
    public final int OooOO0(long j) {
        o00O0O o00o0o2 = this.f27296OooO0Oo;
        int lineForVertical = o00o0o2.f27080OooO0O0.getLineForVertical(o00o0o2.f27082OooO0Oo + ((int) o00O0O.OooO.OooO0Oo(j)));
        o00O0O o00o0o3 = this.f27296OooO0Oo;
        return o00o0o3.f27080OooO0O0.getOffsetForHorizontal(lineForVertical, o00O0O.OooO.OooO0OO(j));
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final o00O0O.OooOO0O OooOO0O(int i) {
        float fOooO0oO = o00O0O.OooO0oO(this.f27296OooO0Oo, i);
        float fOooO0oO2 = o00O0O.OooO0oO(this.f27296OooO0Oo, i + 1);
        int iOooO0o0 = this.f27296OooO0Oo.OooO0o0(i);
        return new o00O0O.OooOO0O(fOooO0oO, this.f27296OooO0Oo.OooO0o(iOooO0o0), fOooO0oO2, this.f27296OooO0Oo.OooO0OO(iOooO0o0));
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final List<o00O0O.OooOO0O> OooOO0o() {
        return this.f27298OooO0o0;
    }

    @Override // o00000O.OooOO0O
    public final int OooOOO(int i, boolean z) {
        if (!z) {
            return this.f27296OooO0Oo.OooO0Oo(i);
        }
        o00O0O o00o0o2 = this.f27296OooO0Oo;
        if (o00o0o2.f27080OooO0O0.getEllipsisStart(i) == 0) {
            return o00o0o2.f27080OooO0O0.getLineVisibleEnd(i);
        }
        return o00o0o2.f27080OooO0O0.getEllipsisStart(i) + o00o0o2.f27080OooO0O0.getLineStart(i);
    }

    @Override // o00000O.OooOO0O
    public final int OooOOO0(int i) {
        return this.f27296OooO0Oo.f27080OooO0O0.getLineStart(i);
    }

    @Override // o00000O.OooOO0O
    public final float OooOOOO(int i) {
        return this.f27296OooO0Oo.f27080OooO0O0.getLineRight(i);
    }

    @Override // o00000O.OooOO0O
    public final void OooOOOo(@NotNull o0O0O00 canvas, @NotNull o0Oo0oo brush, @Nullable o000OO00 o000oo01, @Nullable o0000O0.OooO oooO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        OooOO0 oooOO1 = this.f27293OooO00o.f27307OooO0oO;
        oooOO1.OooO00o(brush, OooOo.OooO00o(getWidth(), getHeight()));
        oooOO1.OooO0OO(o000oo01);
        oooOO1.OooO0Oo(oooO);
        Canvas canvas2 = OooOOOO.f32070OooO00o;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Canvas canvas3 = ((OooOOO) canvas).f32067OooO00o;
        if (this.f27296OooO0Oo.f27079OooO00o) {
            canvas3.save();
            canvas3.clipRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
        }
        this.f27296OooO0Oo.OooO(canvas3);
        if (this.f27296OooO0Oo.f27079OooO00o) {
            canvas3.restore();
        }
    }

    @Override // o00000O.OooOO0O
    @NotNull
    public final o000O0o OooOOo(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z || i2 > this.f27293OooO00o.f27308OooO0oo.length()) {
            StringBuilder sbOooO0OO = o000O0Oo.OooO0OO("Start(", i, ") or End(", i2, ") is out of Range(0..");
            sbOooO0OO.append(this.f27293OooO00o.f27308OooO0oo.length());
            sbOooO0OO.append("), or start > end!");
            throw new AssertionError(sbOooO0OO.toString());
        }
        Path dest = new Path();
        o00O0O o00o0o2 = this.f27296OooO0Oo;
        Objects.requireNonNull(o00o0o2);
        Intrinsics.checkNotNullParameter(dest, "dest");
        o00o0o2.f27080OooO0O0.getSelectionPath(i, i2, dest);
        if (o00o0o2.f27082OooO0Oo != 0 && !dest.isEmpty()) {
            dest.offset(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00o0o2.f27082OooO0Oo);
        }
        Intrinsics.checkNotNullParameter(dest, "<this>");
        return new o0OoOo0(dest);
    }

    @Override // o00000O.OooOO0O
    public final int OooOOo0(float f) {
        o00O0O o00o0o2 = this.f27296OooO0Oo;
        return o00o0o2.f27080OooO0O0.getLineForVertical(o00o0o2.f27082OooO0Oo + ((int) f));
    }

    @Override // o00000O.OooOO0O
    public final float OooOOoo(int i, boolean z) {
        return z ? o00O0O.OooO0oO(this.f27296OooO0Oo, i) : ((o00000OO.OooO0O0) this.f27296OooO0Oo.f27085OooO0oO.getValue()).OooO0O0(i, false, false);
    }

    @Override // o00000O.OooOO0O
    public final float OooOo0(int i) {
        return this.f27296OooO0Oo.f27080OooO0O0.getLineLeft(i);
    }

    @Override // o00000O.OooOO0O
    public final void OooOo00(@NotNull o0O0O00 canvas, long j, @Nullable o000OO00 o000oo01, @Nullable o0000O0.OooO oooO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OooOO0 oooOO1 = this.f27293OooO00o.f27307OooO0oO;
        oooOO1.OooO0O0(j);
        oooOO1.OooO0OO(o000oo01);
        oooOO1.OooO0Oo(oooO);
        Canvas canvas2 = OooOOOO.f32070OooO00o;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Canvas canvas3 = ((OooOOO) canvas).f32067OooO00o;
        if (this.f27296OooO0Oo.f27079OooO00o) {
            canvas3.save();
            canvas3.clipRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
        }
        this.f27296OooO0Oo.OooO(canvas3);
        if (this.f27296OooO0Oo.f27079OooO00o) {
            canvas3.restore();
        }
    }

    public final o00O0O OooOo0O(int i, int i2, TextUtils.TruncateAt truncateAt, int i3) {
        Oooo0 oooo0;
        CharSequence charSequence = this.f27293OooO00o.f27308OooO0oo;
        float width = getWidth();
        OooO0o oooO0o = this.f27293OooO00o;
        OooOO0 oooOO1 = oooO0o.f27307OooO0oO;
        int i4 = oooO0o.f27310OooOO0O;
        o00000OO.OooO0OO oooO0OO = oooO0o.f27300OooO;
        oo0o0Oo oo0o0oo = oooO0o.f27302OooO0O0;
        Intrinsics.checkNotNullParameter(oo0o0oo, "<this>");
        o00000O.o0OoOo0 o0oooo1 = oo0o0oo.f26922OooO0OO;
        return new o00O0O(charSequence, width, oooOO1, i, truncateAt, i4, (o0oooo1 == null || (oooo0 = o0oooo1.f26902OooO00o) == null) ? true : oooo0.f26818OooO00o, i3, i2, oooO0OO);
    }

    public final float OooOo0o(int i) {
        return this.f27296OooO0Oo.OooO0O0(i);
    }

    @Override // o00000O.OooOO0O
    public final float getHeight() {
        return this.f27296OooO0Oo.OooO00o();
    }

    @Override // o00000O.OooOO0O
    public final float getWidth() {
        return o0000O0O.OooO0O0.OooO0oo(this.f27295OooO0OO);
    }
}
