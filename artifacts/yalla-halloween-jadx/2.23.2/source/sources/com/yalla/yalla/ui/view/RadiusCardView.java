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
import p562o0oOo000.o00000;
import p562o0oOo000.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public class RadiusCardView extends CardView {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f30033OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f30034OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f30035OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f30036OooOOO0;

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
        float f = this.f30033OooOO0O;
        float f2 = this.f30034OooOO0o;
        float f3 = this.f30036OooOOO0;
        float f4 = this.f30035OooOOO;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.INTERSECT);
        super.onDraw(canvas);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o0ooOOo.materialCardViewStyle);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setRadius(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00000.RadiusCardView);
        this.f30033OooOO0O = typedArrayObtainStyledAttributes.getDimension(o00000.RadiusCardView_rcv_topLeftRadiu, 0.0f);
        this.f30034OooOO0o = typedArrayObtainStyledAttributes.getDimension(o00000.RadiusCardView_rcv_topRightRadiu, 0.0f);
        this.f30036OooOOO0 = typedArrayObtainStyledAttributes.getDimension(o00000.RadiusCardView_rcv_bottomRightRadiu, 0.0f);
        this.f30035OooOOO = typedArrayObtainStyledAttributes.getDimension(o00000.RadiusCardView_rcv_bottomLeftRadiu, 0.0f);
        setBackground(new ColorDrawable());
    }
}
