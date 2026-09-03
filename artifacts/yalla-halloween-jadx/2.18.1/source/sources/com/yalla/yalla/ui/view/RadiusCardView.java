package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p444o0OoOo0O.o0O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public class RadiusCardView extends CardView {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f25077OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f25078OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f25079OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f25080o000oOoO;

    public RadiusCardView(Context context) {
        this(context, null);
    }

    private RectF getRectF() {
        Rect rect = new Rect();
        getDrawingRect(rect);
        return new RectF(rect);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = new Path();
        RectF rectF = getRectF();
        float f = this.f25080o000oOoO;
        float f2 = this.f25077OoooOOO;
        float f3 = this.f25078OoooOOo;
        float f4 = this.f25079OoooOo0;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.INTERSECT);
        super.onDraw(canvas);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setRadius(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OO0.RadiusCardView);
        this.f25080o000oOoO = typedArrayObtainStyledAttributes.getDimension(2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f25077OoooOOO = typedArrayObtainStyledAttributes.getDimension(3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f25078OoooOOo = typedArrayObtainStyledAttributes.getDimension(1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f25079OoooOo0 = typedArrayObtainStyledAttributes.getDimension(0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        setBackground(new ColorDrawable());
    }
}
