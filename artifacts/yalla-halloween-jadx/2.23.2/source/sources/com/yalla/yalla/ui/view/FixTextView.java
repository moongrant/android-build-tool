package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public class FixTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f29856OooOO0O;

    public FixTextView(Context context) {
        super(context);
        this.f29856OooOO0O = false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getWidth() > 0 && getHeight() > 0 && this.f29856OooOO0O) {
            CharSequence text = getText();
            String string = text.toString();
            TextPaint paint = getPaint();
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            String[] strArrSplit = string.replaceAll("\r", "").split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str : strArrSplit) {
                if (paint.measureText(str) <= width) {
                    sb.append(str);
                } else {
                    int i3 = 0;
                    float f = 0.0f;
                    while (i3 != str.length()) {
                        char cCharAt = str.charAt(i3);
                        float fMeasureText = paint.measureText(String.valueOf(cCharAt)) + f;
                        if (fMeasureText <= width) {
                            sb.append(cCharAt);
                            f = fMeasureText;
                        } else {
                            int i4 = i3 - 2;
                            if (i4 >= 0) {
                                int i5 = i3 - 1;
                                if (str.charAt(i5) < 'A' || str.charAt(i5) > 'z' || str.charAt(i4) < 'A' || str.charAt(i4) > 'z') {
                                    sb.append("\n");
                                    i3--;
                                } else {
                                    sb.deleteCharAt(sb.length() - 1);
                                    sb.append("-\n");
                                    i3 = i4;
                                }
                            } else {
                                sb.append("\n");
                                i3--;
                            }
                            f = 0.0f;
                        }
                        i3++;
                    }
                }
                sb.append("\n");
            }
            if (!string.endsWith("\n")) {
                sb.deleteCharAt(sb.length() - 1);
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            if (text instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned) text, 0, text.length(), null, spannableString, 0);
            }
            if (!TextUtils.isEmpty(spannableString)) {
                setText(spannableString);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAutoSplitEnabled(boolean z) {
        this.f29856OooOO0O = z;
    }

    public FixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29856OooOO0O = false;
    }

    public FixTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29856OooOO0O = false;
    }
}
