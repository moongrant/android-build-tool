package com.yalantis.ucrop.view.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalantis.ucrop.model.AspectRatio;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Locale;
import o000O000.OooO00o;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOO0;
import p400o0Oo0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Paint f20440OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Rect f20441OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f20442OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public String f20443OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f20444OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f20445OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f20446o000oOoO;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    public final void OooO0OO(@ColorInt int i) {
        Paint paint = this.f20440OoooO;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i, OooO00o.OooO0O0(getContext(), OooO.ucrop_color_widget)}));
    }

    public final void OooO0o() {
        if (TextUtils.isEmpty(this.f20443OoooOOO)) {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f20444OoooOOo), Integer.valueOf((int) this.f20445OoooOo0)));
        } else {
            setText(this.f20443OoooOOO);
        }
    }

    public final void OooO0o0(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.f20443OoooOOO = typedArray.getString(OooOo00.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.f20444OoooOOo = typedArray.getFloat(OooOo00.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float f = typedArray.getFloat(OooOo00.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f20445OoooOo0 = f;
        float f2 = this.f20444OoooOOo;
        if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20446o000oOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            this.f20446o000oOoO = f2 / f;
        }
        this.f20442OoooOO0 = getContext().getResources().getDimensionPixelSize(OooOO0.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f20440OoooO = paint;
        paint.setStyle(Paint.Style.FILL);
        OooO0o();
        OooO0OO(getResources().getColor(OooO.ucrop_color_widget_active));
        typedArray.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f20441OoooO0O);
            Rect rect = this.f20441OoooO0O;
            float f = (rect.right - rect.left) / 2.0f;
            float f2 = rect.bottom - (rect.top / 2.0f);
            int i = this.f20442OoooOO0;
            canvas.drawCircle(f, f2 - (i * 1.5f), i / 2.0f, this.f20440OoooO);
        }
    }

    public void setActiveColor(@ColorInt int i) {
        OooO0OO(i);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.f20443OoooOOO = aspectRatio.f20336Oooo0o;
        float f = aspectRatio.f20337Oooo0oO;
        this.f20444OoooOOo = f;
        float f2 = aspectRatio.f20338Oooo0oo;
        this.f20445OoooOo0 = f2;
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f20446o000oOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            this.f20446o000oOoO = f / f2;
        }
        OooO0o();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20441OoooO0O = new Rect();
        OooO0o0(context.obtainStyledAttributes(attributeSet, OooOo00.ucrop_AspectRatioTextView));
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f20441OoooO0O = new Rect();
        OooO0o0(context.obtainStyledAttributes(attributeSet, OooOo00.ucrop_AspectRatioTextView));
    }
}
