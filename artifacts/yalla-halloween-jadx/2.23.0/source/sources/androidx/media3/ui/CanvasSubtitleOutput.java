package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f6454OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f6455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f6456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Cue> f6457OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f6458OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CaptionStyleCompat f6459OooO0oo;

    public CanvasSubtitleOutput() {
        throw null;
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6455OooO0Oo = new ArrayList();
        this.f6457OooO0o0 = Collections.emptyList();
        this.f6456OooO0o = 0;
        this.f6458OooO0oO = 0.0533f;
        this.f6459OooO0oo = CaptionStyleCompat.f6460OooO0oO;
        this.f6454OooO = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.OooO00o
    public final void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f6457OooO0o0 = list;
        this.f6459OooO0oo = captionStyleCompat;
        this.f6458OooO0oO = f;
        this.f6456OooO0o = i;
        this.f6454OooO = f2;
        while (true) {
            ArrayList arrayList = this.f6455OooO0Oo;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new o0000O(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04fc  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        float f;
        int i5;
        float f2;
        boolean z2;
        int i6;
        int iMax;
        int iMin;
        int iRound;
        int i7;
        Canvas canvas2;
        float f3;
        int i8;
        List<Cue> list = this.f6457OooO0o0;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i9 = paddingBottom - paddingTop;
        float fOooO0O0 = o000.OooO0O0(this.f6456OooO0o, this.f6458OooO0oO, height, i9);
        if (fOooO0O0 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Cue cue = list.get(i10);
            if (cue.f6242OooOOOo != Integer.MIN_VALUE) {
                CharSequence charSequence = cue.f6228OooO00o;
                Bitmap bitmap = cue.f6231OooO0Oo;
                Layout.Alignment alignment = cue.f6230OooO0OO;
                int i11 = cue.f6234OooO0oO;
                int i12 = cue.f6239OooOOO;
                float f4 = cue.f6241OooOOOO;
                float f5 = cue.f6236OooOO0;
                float f6 = cue.f6237OooOO0O;
                boolean z3 = cue.f6238OooOO0o;
                int i13 = cue.f6240OooOOO0;
                int i14 = cue.f6242OooOOOo;
                float f7 = cue.f6243OooOOo0;
                int i15 = cue.f6232OooO0o;
                float f8 = cue.f6233OooO0o0;
                if (i15 == 0) {
                    f3 = 1.0f - f8;
                    i8 = 0;
                } else {
                    f3 = (-f8) - 1.0f;
                    i8 = 1;
                }
                int i16 = cue.f6234OooO0oO;
                cue = new Cue(charSequence, null, alignment, bitmap, f3, i8, i16 != 0 ? i16 != 2 ? i11 : 0 : 2, -3.4028235E38f, Integer.MIN_VALUE, i12, f4, f5, f6, z3, i13, i14, f7);
            }
            float fOooO0O1 = o000.OooO0O0(cue.f6239OooOOO, cue.f6241OooOOOO, height, i9);
            int i17 = i10;
            o0000O o0000o2 = (o0000O) this.f6455OooO0Oo.get(i17);
            CaptionStyleCompat captionStyleCompat = this.f6459OooO0oo;
            float f9 = this.f6454OooO;
            o0000o2.getClass();
            Bitmap bitmap2 = cue.f6231OooO0Oo;
            boolean z4 = bitmap2 == null;
            CharSequence charSequence2 = cue.f6228OooO00o;
            if (z4) {
                if (TextUtils.isEmpty(charSequence2)) {
                    canvas2 = canvas;
                    i2 = height;
                    i3 = i9;
                    i4 = i17;
                } else {
                    i = cue.f6238OooOO0o ? cue.f6240OooOOO0 : captionStyleCompat.f6463OooO0OO;
                }
                i10 = i4 + 1;
                height = i2;
                i9 = i3;
                list = list;
                size = size;
                paddingBottom = paddingBottom;
                width = width;
                paddingTop = paddingTop;
                paddingLeft = paddingLeft;
                fOooO0O0 = fOooO0O0;
            } else {
                i = -16777216;
            }
            CharSequence charSequence3 = o0000o2.f6706OooO;
            boolean z5 = charSequence3 == charSequence2 || (charSequence3 != null && charSequence3.equals(charSequence2));
            TextPaint textPaint = o0000o2.f6711OooO0o;
            float f10 = cue.f6237OooOO0O;
            float f11 = cue.f6236OooOO0;
            i2 = height;
            int i18 = cue.f6227OooO;
            i3 = i9;
            float f12 = cue.f6235OooO0oo;
            i4 = i17;
            int i19 = cue.f6234OooO0oO;
            int i20 = cue.f6232OooO0o;
            boolean z6 = z4;
            float f13 = cue.f6233OooO0o0;
            Layout.Alignment alignment2 = cue.f6229OooO0O0;
            if (z5 && o000O000.OooO0o.OooO00o(o0000o2.f6715OooOO0, alignment2) && o0000o2.f6716OooOO0O == bitmap2 && o0000o2.f6717OooOO0o == f13 && o0000o2.f6719OooOOO0 == i20) {
                if (o000O000.OooO0o.OooO00o(Integer.valueOf(o0000o2.f6718OooOOO), Integer.valueOf(i19)) && o0000o2.f6720OooOOOO == f12 && o000O000.OooO0o.OooO00o(Integer.valueOf(o0000o2.f6721OooOOOo), Integer.valueOf(i18)) && o0000o2.f6723OooOOo0 == f11 && o0000o2.f6722OooOOo == f10 && o0000o2.f6724OooOOoo == captionStyleCompat.f6461OooO00o && o0000o2.f6727OooOo00 == captionStyleCompat.f6462OooO0O0 && o0000o2.f6726OooOo0 == i && o0000o2.f6729OooOo0o == captionStyleCompat.f6464OooO0Oo && o0000o2.f6728OooOo0O == captionStyleCompat.f6466OooO0o0 && o000O000.OooO0o.OooO00o(textPaint.getTypeface(), captionStyleCompat.f6465OooO0o) && o0000o2.f6725OooOo == fOooO0O0 && o0000o2.f6731OooOoO0 == fOooO0O1 && o0000o2.f6730OooOoO == f9) {
                    int i21 = paddingLeft;
                    if (o0000o2.f6732OooOoOO == i21) {
                        paddingLeft = i21;
                        int i22 = paddingTop;
                        if (o0000o2.f6734OooOoo0 == i22) {
                            paddingTop = i22;
                            int i23 = width;
                            if (o0000o2.f6733OooOoo == i23) {
                                width = i23;
                                int i24 = paddingBottom;
                                if (o0000o2.f6735OooOooO == i24) {
                                    canvas2 = canvas;
                                    paddingBottom = i24;
                                    o0000o2.OooO00o(canvas2, z6);
                                    i10 = i4 + 1;
                                    height = i2;
                                    i9 = i3;
                                    list = list;
                                    size = size;
                                    paddingBottom = paddingBottom;
                                    width = width;
                                    paddingTop = paddingTop;
                                    paddingLeft = paddingLeft;
                                    fOooO0O0 = fOooO0O0;
                                } else {
                                    paddingBottom = i24;
                                }
                            } else {
                                width = i23;
                            }
                        } else {
                            paddingTop = i22;
                        }
                    } else {
                        paddingLeft = i21;
                    }
                }
            }
            o0000o2.f6706OooO = charSequence2;
            o0000o2.f6715OooOO0 = alignment2;
            o0000o2.f6716OooOO0O = bitmap2;
            o0000o2.f6717OooOO0o = f13;
            o0000o2.f6719OooOOO0 = i20;
            o0000o2.f6718OooOOO = i19;
            o0000o2.f6720OooOOOO = f12;
            o0000o2.f6721OooOOOo = i18;
            o0000o2.f6723OooOOo0 = f11;
            o0000o2.f6722OooOOo = f10;
            o0000o2.f6724OooOOoo = captionStyleCompat.f6461OooO00o;
            o0000o2.f6727OooOo00 = captionStyleCompat.f6462OooO0O0;
            o0000o2.f6726OooOo0 = i;
            o0000o2.f6729OooOo0o = captionStyleCompat.f6464OooO0Oo;
            o0000o2.f6728OooOo0O = captionStyleCompat.f6466OooO0o0;
            textPaint.setTypeface(captionStyleCompat.f6465OooO0o);
            fOooO0O0 = fOooO0O0;
            o0000o2.f6725OooOo = fOooO0O0;
            o0000o2.f6731OooOoO0 = fOooO0O1;
            o0000o2.f6730OooOoO = f9;
            int i25 = paddingLeft;
            o0000o2.f6732OooOoOO = i25;
            paddingTop = paddingTop;
            o0000o2.f6734OooOoo0 = paddingTop;
            int i26 = width;
            o0000o2.f6733OooOoo = i26;
            paddingBottom = paddingBottom;
            o0000o2.f6735OooOooO = paddingBottom;
            if (z6 != 0) {
                o0000o2.f6706OooO.getClass();
                CharSequence charSequence4 = o0000o2.f6706OooO;
                SpannableStringBuilder spannableStringBuilder = charSequence4 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence4 : new SpannableStringBuilder(o0000o2.f6706OooO);
                int i27 = o0000o2.f6733OooOoo - o0000o2.f6732OooOoOO;
                int i28 = o0000o2.f6735OooOooO - o0000o2.f6734OooOoo0;
                textPaint.setTextSize(o0000o2.f6725OooOo);
                int i29 = (int) ((o0000o2.f6725OooOo * 0.125f) + 0.5f);
                int i30 = i29 * 2;
                int i31 = i27 - i30;
                float f14 = o0000o2.f6723OooOOo0;
                if (f14 != -3.4028235E38f) {
                    i31 = (int) (i31 * f14);
                }
                if (i31 <= 0) {
                    synchronized (Log.f6261OooO00o) {
                        android.util.Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    }
                    paddingLeft = i25;
                    fOooO0O0 = fOooO0O0;
                    paddingTop = paddingTop;
                    paddingBottom = paddingBottom;
                    width = i26;
                    z2 = z6;
                } else {
                    paddingLeft = i25;
                    if (o0000o2.f6731OooOoO0 > 0.0f) {
                        i6 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) o0000o2.f6731OooOoO0), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i6 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (o0000o2.f6729OooOo0o == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i6, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i32 = 0;
                        for (int length = foregroundColorSpanArr.length; i32 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i32]);
                            i32++;
                        }
                    }
                    if (Color.alpha(o0000o2.f6727OooOo00) > 0) {
                        int i33 = o0000o2.f6729OooOo0o;
                        if (i33 == 0 || i33 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(o0000o2.f6727OooOo00), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(o0000o2.f6727OooOo00), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = o0000o2.f6715OooOO0;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    width = i26;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i31, alignment3, o0000o2.f6710OooO0Oo, o0000o2.f6712OooO0o0, true);
                    o0000o2.f6736OooOooo = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = o0000o2.f6736OooOooo.getLineCount();
                    int i34 = 0;
                    int iMax2 = 0;
                    while (i34 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(o0000o2.f6736OooOooo.getLineWidth(i34)), iMax2);
                        i34++;
                        lineCount = lineCount;
                        i29 = i29;
                        z6 = z6;
                    }
                    int i35 = i29;
                    z = z6;
                    if (o0000o2.f6723OooOOo0 == -3.4028235E38f || iMax2 >= i31) {
                        i31 = iMax2;
                    }
                    int i36 = i31 + i30;
                    float f15 = o0000o2.f6720OooOOOO;
                    if (f15 != -3.4028235E38f) {
                        int iRound2 = Math.round(i27 * f15);
                        int i37 = o0000o2.f6732OooOoOO;
                        int i38 = iRound2 + i37;
                        int i39 = o0000o2.f6721OooOOOo;
                        if (i39 == 1) {
                            i38 = ((i38 * 2) - i36) / 2;
                        } else if (i39 == 2) {
                            i38 -= i36;
                        }
                        iMax = Math.max(i38, i37);
                        iMin = Math.min(i36 + iMax, o0000o2.f6733OooOoo);
                    } else {
                        iMax = o0000o2.f6732OooOoOO + ((i27 - i36) / 2);
                        iMin = iMax + i36;
                    }
                    int i40 = iMin - iMax;
                    if (i40 <= 0) {
                        Log.OooO0OO("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        z2 = z;
                    } else {
                        float f16 = o0000o2.f6717OooOO0o;
                        if (f16 != -3.4028235E38f) {
                            if (o0000o2.f6719OooOOO0 == 0) {
                                iRound = Math.round(i28 * f16) + o0000o2.f6734OooOoo0;
                                int i41 = o0000o2.f6718OooOOO;
                                if (i41 == 2) {
                                    iRound -= height2;
                                } else if (i41 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = o0000o2.f6736OooOooo.getLineBottom(0) - o0000o2.f6736OooOooo.getLineTop(0);
                                float f17 = o0000o2.f6717OooOO0o;
                                if (f17 >= 0.0f) {
                                    iRound = Math.round(f17 * lineBottom) + o0000o2.f6734OooOoo0;
                                } else {
                                    iRound = Math.round((f17 + 1.0f) * lineBottom) + o0000o2.f6735OooOooO;
                                    iRound -= height2;
                                }
                            }
                            int i42 = iRound + height2;
                            int i43 = o0000o2.f6735OooOooO;
                            if (i42 > i43) {
                                iRound = i43 - height2;
                            } else {
                                i7 = o0000o2.f6734OooOoo0;
                                if (iRound >= i7) {
                                }
                                Layout.Alignment alignment4 = alignment3;
                                o0000o2.f6736OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i40, alignment4, o0000o2.f6710OooO0Oo, o0000o2.f6712OooO0o0, true);
                                o0000o2.f6738Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i40, alignment4, o0000o2.f6710OooO0Oo, o0000o2.f6712OooO0o0, true);
                                o0000o2.f6739Oooo00O = iMax;
                                o0000o2.f6740Oooo00o = i7;
                                o0000o2.f6737Oooo0 = i35;
                            }
                        } else {
                            iRound = (o0000o2.f6735OooOooO - height2) - ((int) (i28 * o0000o2.f6730OooOoO));
                        }
                        i7 = iRound;
                        Layout.Alignment alignment5 = alignment3;
                        o0000o2.f6736OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i40, alignment5, o0000o2.f6710OooO0Oo, o0000o2.f6712OooO0o0, true);
                        o0000o2.f6738Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i40, alignment5, o0000o2.f6710OooO0Oo, o0000o2.f6712OooO0o0, true);
                        o0000o2.f6739Oooo00O = iMax;
                        o0000o2.f6740Oooo00o = i7;
                        o0000o2.f6737Oooo0 = i35;
                    }
                }
                o0000o2.OooO00o(canvas, z2);
                i10 = i4 + 1;
                height = i2;
                i9 = i3;
                list = list;
                size = size;
                paddingBottom = paddingBottom;
                width = width;
                paddingTop = paddingTop;
                paddingLeft = paddingLeft;
                fOooO0O0 = fOooO0O0;
            } else {
                paddingLeft = i25;
                fOooO0O0 = fOooO0O0;
                paddingTop = paddingTop;
                paddingBottom = paddingBottom;
                width = i26;
                z = z6;
                o0000o2.f6716OooOO0O.getClass();
                Bitmap bitmap3 = o0000o2.f6716OooOO0O;
                int i44 = o0000o2.f6733OooOoo;
                int i45 = o0000o2.f6732OooOoOO;
                int i46 = o0000o2.f6735OooOooO;
                int i47 = o0000o2.f6734OooOoo0;
                float f18 = i44 - i45;
                float f19 = (o0000o2.f6720OooOOOO * f18) + i45;
                float f20 = i46 - i47;
                float f21 = (o0000o2.f6717OooOO0o * f20) + i47;
                int iRound3 = Math.round(f18 * o0000o2.f6723OooOOo0);
                float f22 = o0000o2.f6722OooOOo;
                int iRound4 = f22 != -3.4028235E38f ? Math.round(f20 * f22) : Math.round((bitmap3.getHeight() / bitmap3.getWidth()) * iRound3);
                int i48 = o0000o2.f6721OooOOOo;
                if (i48 == 2) {
                    f = iRound3;
                } else {
                    if (i48 == 1) {
                        f = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f19);
                    i5 = o0000o2.f6718OooOOO;
                    if (i5 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i5 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f21);
                        o0000o2.f6741Oooo0O0 = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f21 -= f2;
                    int iRound7 = Math.round(f21);
                    o0000o2.f6741Oooo0O0 = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f19 -= f;
                int iRound8 = Math.round(f19);
                i5 = o0000o2.f6718OooOOO;
                if (i5 == 2) {
                    f2 = iRound4;
                } else {
                    if (i5 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f21);
                    o0000o2.f6741Oooo0O0 = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f21 -= f2;
                int iRound10 = Math.round(f21);
                o0000o2.f6741Oooo0O0 = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            z2 = z;
            o0000o2.OooO00o(canvas, z2);
            i10 = i4 + 1;
            height = i2;
            i9 = i3;
            list = list;
            size = size;
            paddingBottom = paddingBottom;
            width = width;
            paddingTop = paddingTop;
            paddingLeft = paddingLeft;
            fOooO0O0 = fOooO0O0;
        }
    }
}
