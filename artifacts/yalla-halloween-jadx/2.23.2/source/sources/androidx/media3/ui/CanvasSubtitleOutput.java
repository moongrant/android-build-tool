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
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f9519OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f9520OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9521OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Cue> f9522OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f9523OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public CaptionStyleCompat f9524OooO0oo;

    public CanvasSubtitleOutput() {
        throw null;
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9520OooO0Oo = new ArrayList();
        this.f9522OooO0o0 = Collections.emptyList();
        this.f9521OooO0o = 0;
        this.f9523OooO0oO = 0.0533f;
        this.f9524OooO0oo = CaptionStyleCompat.f9525OooO0oO;
        this.f9519OooO = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.OooO00o
    public final void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f9522OooO0o0 = list;
        this.f9524OooO0oo = captionStyleCompat;
        this.f9523OooO0oO = f;
        this.f9521OooO0o = i;
        this.f9519OooO = f2;
        while (true) {
            ArrayList arrayList = this.f9520OooO0Oo;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new o0000OO0(getContext()));
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
        List<Cue> list = this.f9522OooO0o0;
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
        float fOooO0O0 = o000.OooO0O0(this.f9521OooO0o, this.f9523OooO0oO, height, i9);
        if (fOooO0O0 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Cue cue = list.get(i10);
            if (cue.f6912OooOOoo != Integer.MIN_VALUE) {
                CharSequence charSequence = cue.f6898OooO0Oo;
                Bitmap bitmap = cue.f6901OooO0oO;
                Layout.Alignment alignment = cue.f6899OooO0o;
                int i11 = cue.f6911OooOOo0;
                float f4 = cue.f6910OooOOo;
                float f5 = cue.f6907OooOOO0;
                float f6 = cue.f6906OooOOO;
                boolean z3 = cue.f6908OooOOOO;
                int i12 = cue.f6909OooOOOo;
                int i13 = cue.f6912OooOOoo;
                float f7 = cue.f6913OooOo00;
                int i14 = cue.f6897OooO;
                float f8 = cue.f6902OooO0oo;
                if (i14 == 0) {
                    f3 = 1.0f - f8;
                    i8 = 0;
                } else {
                    f3 = (-f8) - 1.0f;
                    i8 = 1;
                }
                int i15 = cue.f6903OooOO0;
                cue = new Cue(charSequence, null, alignment, bitmap, f3, i8, i15 != 0 ? i15 != 2 ? i15 : 0 : 2, -3.4028235E38f, Integer.MIN_VALUE, i11, f4, f5, f6, z3, i12, i13, f7);
            }
            float fOooO0O1 = o000.OooO0O0(cue.f6911OooOOo0, cue.f6910OooOOo, height, i9);
            int i16 = i10;
            o0000OO0 o0000oo1 = (o0000OO0) this.f9520OooO0Oo.get(i16);
            CaptionStyleCompat captionStyleCompat = this.f9524OooO0oo;
            float f9 = this.f9519OooO;
            o0000oo1.getClass();
            Bitmap bitmap2 = cue.f6901OooO0oO;
            boolean z4 = bitmap2 == null;
            CharSequence charSequence2 = cue.f6898OooO0Oo;
            if (z4) {
                if (TextUtils.isEmpty(charSequence2)) {
                    canvas2 = canvas;
                    i2 = height;
                    i3 = i9;
                    i4 = i16;
                } else {
                    i = cue.f6908OooOOOO ? cue.f6909OooOOOo : captionStyleCompat.f9528OooO0OO;
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
            CharSequence charSequence3 = o0000oo1.f9806OooO;
            boolean z5 = charSequence3 == charSequence2 || (charSequence3 != null && charSequence3.equals(charSequence2));
            TextPaint textPaint = o0000oo1.f9811OooO0o;
            float f10 = cue.f6906OooOOO;
            float f11 = cue.f6907OooOOO0;
            i2 = height;
            int i17 = cue.f6905OooOO0o;
            i3 = i9;
            float f12 = cue.f6904OooOO0O;
            i4 = i16;
            int i18 = cue.f6903OooOO0;
            int i19 = cue.f6897OooO;
            boolean z6 = z4;
            float f13 = cue.f6902OooO0oo;
            Layout.Alignment alignment2 = cue.f6900OooO0o0;
            if (z5 && o00.OooO00o(o0000oo1.f9815OooOO0, alignment2) && o0000oo1.f9816OooOO0O == bitmap2 && o0000oo1.f9817OooOO0o == f13 && o0000oo1.f9819OooOOO0 == i19) {
                if (o00.OooO00o(Integer.valueOf(o0000oo1.f9818OooOOO), Integer.valueOf(i18)) && o0000oo1.f9820OooOOOO == f12 && o00.OooO00o(Integer.valueOf(o0000oo1.f9821OooOOOo), Integer.valueOf(i17)) && o0000oo1.f9823OooOOo0 == f11 && o0000oo1.f9822OooOOo == f10 && o0000oo1.f9824OooOOoo == captionStyleCompat.f9526OooO00o && o0000oo1.f9827OooOo00 == captionStyleCompat.f9527OooO0O0 && o0000oo1.f9826OooOo0 == i && o0000oo1.f9829OooOo0o == captionStyleCompat.f9529OooO0Oo && o0000oo1.f9828OooOo0O == captionStyleCompat.f9531OooO0o0 && o00.OooO00o(textPaint.getTypeface(), captionStyleCompat.f9530OooO0o) && o0000oo1.f9825OooOo == fOooO0O0 && o0000oo1.f9831OooOoO0 == fOooO0O1 && o0000oo1.f9830OooOoO == f9) {
                    int i20 = paddingLeft;
                    if (o0000oo1.f9832OooOoOO == i20) {
                        paddingLeft = i20;
                        int i21 = paddingTop;
                        if (o0000oo1.f9834OooOoo0 == i21) {
                            paddingTop = i21;
                            int i22 = width;
                            if (o0000oo1.f9833OooOoo == i22) {
                                width = i22;
                                int i23 = paddingBottom;
                                if (o0000oo1.f9835OooOooO == i23) {
                                    canvas2 = canvas;
                                    paddingBottom = i23;
                                    o0000oo1.OooO00o(canvas2, z6);
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
            o0000oo1.f9806OooO = charSequence2;
            o0000oo1.f9815OooOO0 = alignment2;
            o0000oo1.f9816OooOO0O = bitmap2;
            o0000oo1.f9817OooOO0o = f13;
            o0000oo1.f9819OooOOO0 = i19;
            o0000oo1.f9818OooOOO = i18;
            o0000oo1.f9820OooOOOO = f12;
            o0000oo1.f9821OooOOOo = i17;
            o0000oo1.f9823OooOOo0 = f11;
            o0000oo1.f9822OooOOo = f10;
            o0000oo1.f9824OooOOoo = captionStyleCompat.f9526OooO00o;
            o0000oo1.f9827OooOo00 = captionStyleCompat.f9527OooO0O0;
            o0000oo1.f9826OooOo0 = i;
            o0000oo1.f9829OooOo0o = captionStyleCompat.f9529OooO0Oo;
            o0000oo1.f9828OooOo0O = captionStyleCompat.f9531OooO0o0;
            textPaint.setTypeface(captionStyleCompat.f9530OooO0o);
            fOooO0O0 = fOooO0O0;
            o0000oo1.f9825OooOo = fOooO0O0;
            o0000oo1.f9831OooOoO0 = fOooO0O1;
            o0000oo1.f9830OooOoO = f9;
            int i24 = paddingLeft;
            o0000oo1.f9832OooOoOO = i24;
            paddingTop = paddingTop;
            o0000oo1.f9834OooOoo0 = paddingTop;
            int i25 = width;
            o0000oo1.f9833OooOoo = i25;
            paddingBottom = paddingBottom;
            o0000oo1.f9835OooOooO = paddingBottom;
            if (z6 != 0) {
                o0000oo1.f9806OooO.getClass();
                CharSequence charSequence4 = o0000oo1.f9806OooO;
                SpannableStringBuilder spannableStringBuilder = charSequence4 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence4 : new SpannableStringBuilder(o0000oo1.f9806OooO);
                int i26 = o0000oo1.f9833OooOoo - o0000oo1.f9832OooOoOO;
                int i27 = o0000oo1.f9835OooOooO - o0000oo1.f9834OooOoo0;
                textPaint.setTextSize(o0000oo1.f9825OooOo);
                int i28 = (int) ((o0000oo1.f9825OooOo * 0.125f) + 0.5f);
                int i29 = i28 * 2;
                int i30 = i26 - i29;
                float f14 = o0000oo1.f9823OooOOo0;
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
                    if (o0000oo1.f9831OooOoO0 > 0.0f) {
                        i6 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) o0000oo1.f9831OooOoO0), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i6 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (o0000oo1.f9829OooOo0o == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i6, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i31 = 0;
                        for (int length = foregroundColorSpanArr.length; i31 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i31]);
                            i31++;
                        }
                    }
                    if (Color.alpha(o0000oo1.f9827OooOo00) > 0) {
                        int i32 = o0000oo1.f9829OooOo0o;
                        if (i32 == 0 || i32 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(o0000oo1.f9827OooOo00), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(o0000oo1.f9827OooOo00), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = o0000oo1.f9815OooOO0;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    width = i25;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i30, alignment3, o0000oo1.f9810OooO0Oo, o0000oo1.f9812OooO0o0, true);
                    o0000oo1.f9836OooOooo = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = o0000oo1.f9836OooOooo.getLineCount();
                    int i33 = 0;
                    int iMax2 = 0;
                    while (i33 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(o0000oo1.f9836OooOooo.getLineWidth(i33)), iMax2);
                        i33++;
                        lineCount = lineCount;
                        z6 = z6;
                        i28 = i28;
                    }
                    int i34 = i28;
                    z = z6;
                    if (o0000oo1.f9823OooOOo0 == -3.4028235E38f || iMax2 >= i30) {
                        i30 = iMax2;
                    }
                    int i35 = i30 + i29;
                    float f15 = o0000oo1.f9820OooOOOO;
                    if (f15 != -3.4028235E38f) {
                        int iRound2 = Math.round(i26 * f15);
                        int i36 = o0000oo1.f9832OooOoOO;
                        int i37 = iRound2 + i36;
                        int i38 = o0000oo1.f9821OooOOOo;
                        if (i38 == 1) {
                            i37 = ((i37 * 2) - i35) / 2;
                        } else if (i38 == 2) {
                            i37 -= i35;
                        }
                        iMax = Math.max(i37, i36);
                        iMin = Math.min(i35 + iMax, o0000oo1.f9833OooOoo);
                    } else {
                        iMax = o0000oo1.f9832OooOoOO + ((i26 - i35) / 2);
                        iMin = iMax + i35;
                    }
                    int i39 = iMin - iMax;
                    if (i39 <= 0) {
                        Log.OooO0o("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        z2 = z;
                    } else {
                        float f16 = o0000oo1.f9817OooOO0o;
                        if (f16 != -3.4028235E38f) {
                            if (o0000oo1.f9819OooOOO0 == 0) {
                                iRound = Math.round(i27 * f16) + o0000oo1.f9834OooOoo0;
                                int i40 = o0000oo1.f9818OooOOO;
                                if (i40 == 2) {
                                    iRound -= height2;
                                } else if (i40 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = o0000oo1.f9836OooOooo.getLineBottom(0) - o0000oo1.f9836OooOooo.getLineTop(0);
                                float f17 = o0000oo1.f9817OooOO0o;
                                if (f17 >= 0.0f) {
                                    iRound = Math.round(f17 * lineBottom) + o0000oo1.f9834OooOoo0;
                                } else {
                                    iRound = Math.round((f17 + 1.0f) * lineBottom) + o0000oo1.f9835OooOooO;
                                    iRound -= height2;
                                }
                            }
                            int i41 = iRound + height2;
                            int i42 = o0000oo1.f9835OooOooO;
                            if (i41 > i42) {
                                iRound = i42 - height2;
                            } else {
                                i7 = o0000oo1.f9834OooOoo0;
                                if (iRound >= i7) {
                                }
                                Layout.Alignment alignment4 = alignment3;
                                o0000oo1.f9836OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i39, alignment4, o0000oo1.f9810OooO0Oo, o0000oo1.f9812OooO0o0, true);
                                o0000oo1.f9838Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i39, alignment4, o0000oo1.f9810OooO0Oo, o0000oo1.f9812OooO0o0, true);
                                o0000oo1.f9839Oooo00O = iMax;
                                o0000oo1.f9840Oooo00o = i7;
                                o0000oo1.f9837Oooo0 = i34;
                            }
                        } else {
                            iRound = (o0000oo1.f9835OooOooO - height2) - ((int) (i27 * o0000oo1.f9830OooOoO));
                        }
                        i7 = iRound;
                        Layout.Alignment alignment5 = alignment3;
                        o0000oo1.f9836OooOooo = new StaticLayout(spannableStringBuilder, textPaint, i39, alignment5, o0000oo1.f9810OooO0Oo, o0000oo1.f9812OooO0o0, true);
                        o0000oo1.f9838Oooo000 = new StaticLayout(spannableStringBuilder2, textPaint, i39, alignment5, o0000oo1.f9810OooO0Oo, o0000oo1.f9812OooO0o0, true);
                        o0000oo1.f9839Oooo00O = iMax;
                        o0000oo1.f9840Oooo00o = i7;
                        o0000oo1.f9837Oooo0 = i34;
                    }
                }
                o0000oo1.OooO00o(canvas, z2);
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
                o0000oo1.f9816OooOO0O.getClass();
                Bitmap bitmap3 = o0000oo1.f9816OooOO0O;
                int i43 = o0000oo1.f9833OooOoo;
                int i44 = o0000oo1.f9832OooOoOO;
                int i45 = o0000oo1.f9835OooOooO;
                int i46 = o0000oo1.f9834OooOoo0;
                float f18 = i43 - i44;
                float f19 = (o0000oo1.f9820OooOOOO * f18) + i44;
                float f20 = i45 - i46;
                float f21 = (o0000oo1.f9817OooOO0o * f20) + i46;
                int iRound3 = Math.round(f18 * o0000oo1.f9823OooOOo0);
                float f22 = o0000oo1.f9822OooOOo;
                int iRound4 = f22 != -3.4028235E38f ? Math.round(f20 * f22) : Math.round((bitmap3.getHeight() / bitmap3.getWidth()) * iRound3);
                int i47 = o0000oo1.f9821OooOOOo;
                if (i47 == 2) {
                    f = iRound3;
                } else {
                    if (i47 == 1) {
                        f = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f19);
                    i5 = o0000oo1.f9818OooOOO;
                    if (i5 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i5 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f21);
                        o0000oo1.f9841Oooo0O0 = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f21 -= f2;
                    int iRound7 = Math.round(f21);
                    o0000oo1.f9841Oooo0O0 = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f19 -= f;
                int iRound8 = Math.round(f19);
                i5 = o0000oo1.f9818OooOOO;
                if (i5 == 2) {
                    f2 = iRound4;
                } else {
                    if (i5 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f21);
                    o0000oo1.f9841Oooo0O0 = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f21 -= f2;
                int iRound10 = Math.round(f21);
                o0000oo1.f9841Oooo0O0 = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            z2 = z;
            o0000oo1.OooO00o(canvas, z2);
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
