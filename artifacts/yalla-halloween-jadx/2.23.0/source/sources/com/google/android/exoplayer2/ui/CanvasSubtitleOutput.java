package com.google.android.exoplayer2.ui;

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
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class CanvasSubtitleOutput extends View implements SubtitleView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f13742OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f13743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13744OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Cue> f13745OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f13746OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CaptionStyleCompat f13747OooO0oo;

    public CanvasSubtitleOutput() {
        throw null;
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13743OooO0Oo = new ArrayList();
        this.f13745OooO0o0 = Collections.emptyList();
        this.f13744OooO0o = 0;
        this.f13746OooO0oO = 0.0533f;
        this.f13747OooO0oo = CaptionStyleCompat.f13748OooO0oO;
        this.f13742OooO = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.OooO00o
    public final void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f13745OooO0o0 = list;
        this.f13747OooO0oo = captionStyleCompat;
        this.f13746OooO0oO = f;
        this.f13744OooO0o = i;
        this.f13742OooO = f2;
        while (true) {
            ArrayList arrayList = this.f13743OooO0Oo;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new o0000O00(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:203:0x04f1  */
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
        List<Cue> list = this.f13745OooO0o0;
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
        float fOooO0O0 = o0000oo.OooO0O0(this.f13744OooO0o, this.f13746OooO0oO, height, i9);
        if (fOooO0O0 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Cue cue = list.get(i10);
            if (cue.f13416OooOOoo != Integer.MIN_VALUE) {
                CharSequence charSequence = cue.f13402OooO0Oo;
                Bitmap bitmap = cue.f13405OooO0oO;
                Layout.Alignment alignment = cue.f13403OooO0o;
                int i11 = cue.f13415OooOOo0;
                float f4 = cue.f13414OooOOo;
                float f5 = cue.f13411OooOOO0;
                float f6 = cue.f13410OooOOO;
                boolean z3 = cue.f13412OooOOOO;
                int i12 = cue.f13413OooOOOo;
                int i13 = cue.f13416OooOOoo;
                float f7 = cue.f13417OooOo00;
                int i14 = cue.f13401OooO;
                float f8 = cue.f13406OooO0oo;
                if (i14 == 0) {
                    f3 = 1.0f - f8;
                    i8 = 0;
                } else {
                    f3 = (-f8) - 1.0f;
                    i8 = 1;
                }
                int i15 = cue.f13407OooOO0;
                cue = new Cue(charSequence, null, alignment, bitmap, f3, i8, i15 != 0 ? i15 != 2 ? i15 : 0 : 2, -3.4028235E38f, Integer.MIN_VALUE, i11, f4, f5, f6, z3, i12, i13, f7);
            }
            float fOooO0O1 = o0000oo.OooO0O0(cue.f13415OooOOo0, cue.f13414OooOOo, height, i9);
            int i16 = i10;
            o0000O00 o0000o00 = (o0000O00) this.f13743OooO0Oo.get(i16);
            CaptionStyleCompat captionStyleCompat = this.f13747OooO0oo;
            float f9 = this.f13742OooO;
            o0000o00.getClass();
            Bitmap bitmap2 = cue.f13405OooO0oO;
            boolean z4 = bitmap2 == null;
            CharSequence charSequence2 = cue.f13402OooO0Oo;
            if (z4) {
                if (TextUtils.isEmpty(charSequence2)) {
                    canvas2 = canvas;
                    i2 = height;
                    i3 = i9;
                    i4 = i16;
                } else {
                    i = cue.f13412OooOOOO ? cue.f13413OooOOOo : captionStyleCompat.f13751OooO0OO;
                }
                canvas = canvas2;
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
            CharSequence charSequence3 = o0000o00.f14082OooO;
            boolean z5 = charSequence3 == charSequence2 || (charSequence3 != null && charSequence3.equals(charSequence2));
            TextPaint textPaint = o0000o00.f14087OooO0o;
            float f10 = cue.f13410OooOOO;
            float f11 = cue.f13411OooOOO0;
            i2 = height;
            int i17 = cue.f13409OooOO0o;
            i3 = i9;
            float f12 = cue.f13408OooOO0O;
            i4 = i16;
            int i18 = cue.f13407OooOO0;
            int i19 = cue.f13401OooO;
            boolean z6 = z4;
            float f13 = cue.f13406OooO0oo;
            Layout.Alignment alignment2 = cue.f13404OooO0o0;
            if (z5 && o0O00.OooO00o(o0000o00.f14091OooOO0, alignment2) && o0000o00.f14092OooOO0O == bitmap2 && o0000o00.f14093OooOO0o == f13 && o0000o00.f14095OooOOO0 == i19) {
                if (o0O00.OooO00o(Integer.valueOf(o0000o00.f14094OooOOO), Integer.valueOf(i18)) && o0000o00.f14096OooOOOO == f12 && o0O00.OooO00o(Integer.valueOf(o0000o00.f14097OooOOOo), Integer.valueOf(i17)) && o0000o00.f14099OooOOo0 == f11 && o0000o00.f14098OooOOo == f10 && o0000o00.f14100OooOOoo == captionStyleCompat.f13749OooO00o && o0000o00.f14103OooOo00 == captionStyleCompat.f13750OooO0O0 && o0000o00.f14102OooOo0 == i && o0000o00.f14105OooOo0o == captionStyleCompat.f13752OooO0Oo && o0000o00.f14104OooOo0O == captionStyleCompat.f13754OooO0o0 && o0O00.OooO00o(textPaint.getTypeface(), captionStyleCompat.f13753OooO0o) && o0000o00.f14101OooOo == fOooO0O0 && o0000o00.f14107OooOoO0 == fOooO0O1 && o0000o00.f14106OooOoO == f9) {
                    int i20 = paddingLeft;
                    if (o0000o00.f14108OooOoOO == i20) {
                        paddingLeft = i20;
                        int i21 = paddingTop;
                        if (o0000o00.f14110OooOoo0 == i21) {
                            paddingTop = i21;
                            int i22 = width;
                            if (o0000o00.f14109OooOoo == i22) {
                                width = i22;
                                int i23 = paddingBottom;
                                if (o0000o00.f14111OooOooO == i23) {
                                    canvas2 = canvas;
                                    paddingBottom = i23;
                                    o0000o00.OooO00o(canvas2, z6);
                                    canvas = canvas2;
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
                                    paddingBottom = i23;
                                }
                            } else {
                                width = i22;
                            }
                        } else {
                            paddingTop = i21;
                        }
                    } else {
                        paddingLeft = i20;
                    }
                }
            }
            o0000o00.f14082OooO = charSequence2;
            o0000o00.f14091OooOO0 = alignment2;
            o0000o00.f14092OooOO0O = bitmap2;
            o0000o00.f14093OooOO0o = f13;
            o0000o00.f14095OooOOO0 = i19;
            o0000o00.f14094OooOOO = i18;
            o0000o00.f14096OooOOOO = f12;
            o0000o00.f14097OooOOOo = i17;
            o0000o00.f14099OooOOo0 = f11;
            o0000o00.f14098OooOOo = f10;
            o0000o00.f14100OooOOoo = captionStyleCompat.f13749OooO00o;
            o0000o00.f14103OooOo00 = captionStyleCompat.f13750OooO0O0;
            o0000o00.f14102OooOo0 = i;
            o0000o00.f14105OooOo0o = captionStyleCompat.f13752OooO0Oo;
            o0000o00.f14104OooOo0O = captionStyleCompat.f13754OooO0o0;
            textPaint.setTypeface(captionStyleCompat.f13753OooO0o);
            fOooO0O0 = fOooO0O0;
            o0000o00.f14101OooOo = fOooO0O0;
            o0000o00.f14107OooOoO0 = fOooO0O1;
            o0000o00.f14106OooOoO = f9;
            int i24 = paddingLeft;
            o0000o00.f14108OooOoOO = i24;
            paddingTop = paddingTop;
            o0000o00.f14110OooOoo0 = paddingTop;
            int i25 = width;
            o0000o00.f14109OooOoo = i25;
            paddingBottom = paddingBottom;
            o0000o00.f14111OooOooO = paddingBottom;
            if (z6 != 0) {
                o0000o00.f14082OooO.getClass();
                CharSequence charSequence4 = o0000o00.f14082OooO;
                SpannableStringBuilder spannableStringBuilder = charSequence4 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence4 : new SpannableStringBuilder(o0000o00.f14082OooO);
                int i26 = o0000o00.f14109OooOoo - o0000o00.f14108OooOoOO;
                int i27 = o0000o00.f14111OooOooO - o0000o00.f14110OooOoo0;
                textPaint.setTextSize(o0000o00.f14101OooOo);
                int i28 = (int) ((o0000o00.f14101OooOo * 0.125f) + 0.5f);
                int i29 = i28 * 2;
                int i30 = i26 - i29;
                float f14 = o0000o00.f14099OooOOo0;
                if (f14 != -3.4028235E38f) {
                    i30 = (int) (i30 * f14);
                }
                if (i30 <= 0) {
                    Log.OooO0o("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    paddingLeft = i24;
                    fOooO0O0 = fOooO0O0;
                    paddingTop = paddingTop;
                    paddingBottom = paddingBottom;
                    width = i25;
                    z2 = z6;
                } else {
                    paddingLeft = i24;
                    if (o0000o00.f14107OooOoO0 > 0.0f) {
                        i6 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) o0000o00.f14107OooOoO0), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i6 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (o0000o00.f14105OooOo0o == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i6, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i31 = 0;
                        for (int length = foregroundColorSpanArr.length; i31 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i31]);
                            i31++;
                        }
                    }
                    if (Color.alpha(o0000o00.f14103OooOo00) > 0) {
                        int i32 = o0000o00.f14105OooOo0o;
                        if (i32 == 0 || i32 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(o0000o00.f14103OooOo00), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(o0000o00.f14103OooOo00), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = o0000o00.f14091OooOO0;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    width = i25;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i30, alignment3, o0000o00.f14086OooO0Oo, o0000o00.f14088OooO0o0, true);
                    o0000o00.f14112OooOooo = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = o0000o00.f14112OooOooo.getLineCount();
                    int i33 = 0;
                    int iMax2 = 0;
                    while (i33 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(o0000o00.f14112OooOooo.getLineWidth(i33)), iMax2);
                        i33++;
                        lineCount = lineCount;
                        z6 = z6;
                        i28 = i28;
                    }
                    int i34 = i28;
                    z = z6;
                    if (o0000o00.f14099OooOOo0 == -3.4028235E38f || iMax2 >= i30) {
                        i30 = iMax2;
                    }
                    int i35 = i30 + i29;
                    float f15 = o0000o00.f14096OooOOOO;
                    if (f15 != -3.4028235E38f) {
                        int iRound2 = Math.round(i26 * f15);
                        int i36 = o0000o00.f14108OooOoOO;
                        int i37 = iRound2 + i36;
                        int i38 = o0000o00.f14097OooOOOo;
                        if (i38 == 1) {
                            i37 = ((i37 * 2) - i35) / 2;
                        } else if (i38 == 2) {
                            i37 -= i35;
                        }
                        iMax = Math.max(i37, i36);
                        iMin = Math.min(i35 + iMax, o0000o00.f14109OooOoo);
                    } else {
                        iMax = o0000o00.f14108OooOoOO + ((i26 - i35) / 2);
                        iMin = iMax + i35;
                    }
                    int i39 = iMin - iMax;
                    if (i39 <= 0) {
                        Log.OooO0o("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        z2 = z;
                    } else {
                        float f16 = o0000o00.f14093OooOO0o;
                        if (f16 != -3.4028235E38f) {
                            if (o0000o00.f14095OooOOO0 == 0) {
                                iRound = Math.round(i27 * f16) + o0000o00.f14110OooOoo0;
                                int i40 = o0000o00.f14094OooOOO;
                                if (i40 == 2) {
                                    iRound -= height2;
                                } else if (i40 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = o0000o00.f14112OooOooo.getLineBottom(0) - o0000o00.f14112OooOooo.getLineTop(0);
                                float f17 = o0000o00.f14093OooOO0o;
                                if (f17 >= 0.0f) {
                                    iRound = Math.round(f17 * lineBottom) + o0000o00.f14110OooOoo0;
                                } else {
                                    iRound = Math.round((f17 + 1.0f) * lineBottom) + o0000o00.f14111OooOooO;
                                    iRound -= height2;
                                }
                            }
                            int i41 = iRound + height2;
                            int i42 = o0000o00.f14111OooOooO;
                            if (i41 > i42) {
                                iRound = i42 - height2;
                            } else {
                                i7 = o0000o00.f14110OooOoo0;
                                if (iRound >= i7) {
                                }
                                Layout.Alignment alignment4 = alignment3;
                                o0000o00.f14112OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i39, alignment4, o0000o00.f14086OooO0Oo, o0000o00.f14088OooO0o0, true);
                                o0000o00.f14114Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i39, alignment4, o0000o00.f14086OooO0Oo, o0000o00.f14088OooO0o0, true);
                                o0000o00.f14115Oooo00O = iMax;
                                o0000o00.f14116Oooo00o = i7;
                                o0000o00.f14113Oooo0 = i34;
                            }
                        } else {
                            iRound = (o0000o00.f14111OooOooO - height2) - ((int) (i27 * o0000o00.f14106OooOoO));
                        }
                        i7 = iRound;
                        Layout.Alignment alignment5 = alignment3;
                        o0000o00.f14112OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i39, alignment5, o0000o00.f14086OooO0Oo, o0000o00.f14088OooO0o0, true);
                        o0000o00.f14114Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i39, alignment5, o0000o00.f14086OooO0Oo, o0000o00.f14088OooO0o0, true);
                        o0000o00.f14115Oooo00O = iMax;
                        o0000o00.f14116Oooo00o = i7;
                        o0000o00.f14113Oooo0 = i34;
                    }
                }
                o0000o00.OooO00o(canvas, z2);
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
                paddingLeft = i24;
                fOooO0O0 = fOooO0O0;
                paddingTop = paddingTop;
                paddingBottom = paddingBottom;
                width = i25;
                z = z6;
                o0000o00.f14092OooOO0O.getClass();
                Bitmap bitmap3 = o0000o00.f14092OooOO0O;
                int i43 = o0000o00.f14109OooOoo;
                int i44 = o0000o00.f14108OooOoOO;
                int i45 = o0000o00.f14111OooOooO;
                int i46 = o0000o00.f14110OooOoo0;
                float f18 = i43 - i44;
                float f19 = (o0000o00.f14096OooOOOO * f18) + i44;
                float f20 = i45 - i46;
                float f21 = (o0000o00.f14093OooOO0o * f20) + i46;
                int iRound3 = Math.round(f18 * o0000o00.f14099OooOOo0);
                float f22 = o0000o00.f14098OooOOo;
                int iRound4 = f22 != -3.4028235E38f ? Math.round(f20 * f22) : Math.round((bitmap3.getHeight() / bitmap3.getWidth()) * iRound3);
                int i47 = o0000o00.f14097OooOOOo;
                if (i47 == 2) {
                    f = iRound3;
                } else {
                    if (i47 == 1) {
                        f = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f19);
                    i5 = o0000o00.f14094OooOOO;
                    if (i5 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i5 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f21);
                        o0000o00.f14117Oooo0O0 = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f21 -= f2;
                    int iRound7 = Math.round(f21);
                    o0000o00.f14117Oooo0O0 = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f19 -= f;
                int iRound8 = Math.round(f19);
                i5 = o0000o00.f14094OooOOO;
                if (i5 == 2) {
                    f2 = iRound4;
                } else {
                    if (i5 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f21);
                    o0000o00.f14117Oooo0O0 = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f21 -= f2;
                int iRound10 = Math.round(f21);
                o0000o00.f14117Oooo0O0 = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            z2 = z;
            o0000o00.OooO00o(canvas, z2);
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
