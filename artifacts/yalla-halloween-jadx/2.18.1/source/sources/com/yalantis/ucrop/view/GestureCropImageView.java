package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.KotlinVersion;
import p454o0Ooo0.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public class GestureCropImageView extends CropImageView {

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public GestureDetector f20381o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public OooOOOO f20382o00oO0o;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f20383o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f20384o0Oo0oo;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public float f20385o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public float f20386o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f20387o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public ScaleGestureDetector f20388oo000o;

    public class OooO00o extends GestureDetector.SimpleOnGestureListener {
        public OooO00o() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float doubleTapTargetScale = gestureCropImageView.getDoubleTapTargetScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (doubleTapTargetScale > gestureCropImageView.getMaxScale()) {
                doubleTapTargetScale = gestureCropImageView.getMaxScale();
            }
            float currentScale = gestureCropImageView.getCurrentScale();
            CropImageView.OooO0O0 oooO0O0 = new CropImageView.OooO0O0(gestureCropImageView, currentScale, doubleTapTargetScale - currentScale, x, y);
            gestureCropImageView.f20363ooOO = oooO0O0;
            gestureCropImageView.post(oooO0O0);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.OooO(-f, -f2);
            return true;
        }
    }

    public class OooO0O0 extends OooOOOO.OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public OooO0OO() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            GestureCropImageView gestureCropImageView2 = GestureCropImageView.this;
            gestureCropImageView.OooO0oo(scaleFactor, gestureCropImageView2.f20385o0ooOO0, gestureCropImageView2.f20386o0ooOOo);
            return true;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.f20387o0ooOoO = true;
        this.f20383o0OOO0o = true;
        this.f20384o0Oo0oo = 5;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public final void OooO0o0() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f20381o00oO0O = new GestureDetector(getContext(), new OooO00o(), null, true);
        this.f20388oo000o = new ScaleGestureDetector(getContext(), new OooO0OO());
        this.f20382o00oO0o = new OooOOOO(new OooO0O0());
    }

    public int getDoubleTapScaleSteps() {
        return this.f20384o0Oo0oo;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f20384o0Oo0oo));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            OooOO0O();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f20385o0ooOO0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f20386o0ooOOo = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.f20381o00oO0O.onTouchEvent(motionEvent);
        if (this.f20383o0OOO0o) {
            this.f20388oo000o.onTouchEvent(motionEvent);
        }
        if (this.f20387o0ooOoO) {
            OooOOOO oooOOOO = this.f20382o00oO0o;
            Objects.requireNonNull(oooOOOO);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                oooOOOO.f40370OooO0OO = motionEvent.getX();
                oooOOOO.f40371OooO0Oo = motionEvent.getY();
                oooOOOO.f40373OooO0o0 = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                oooOOOO.f40374OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                oooOOOO.f40375OooO0oo = true;
            } else if (actionMasked == 1) {
                oooOOOO.f40373OooO0o0 = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    oooOOOO.f40368OooO00o = motionEvent.getX();
                    oooOOOO.f40369OooO0O0 = motionEvent.getY();
                    oooOOOO.f40372OooO0o = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    oooOOOO.f40374OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    oooOOOO.f40375OooO0oo = true;
                } else if (actionMasked == 6) {
                    oooOOOO.f40372OooO0o = -1;
                }
            } else if (oooOOOO.f40373OooO0o0 != -1 && oooOOOO.f40372OooO0o != -1 && motionEvent.getPointerCount() > oooOOOO.f40372OooO0o) {
                float x = motionEvent.getX(oooOOOO.f40373OooO0o0);
                float y = motionEvent.getY(oooOOOO.f40373OooO0o0);
                float x2 = motionEvent.getX(oooOOOO.f40372OooO0o);
                float y2 = motionEvent.getY(oooOOOO.f40372OooO0o);
                if (oooOOOO.f40375OooO0oo) {
                    oooOOOO.f40374OooO0oO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    oooOOOO.f40375OooO0oo = false;
                } else {
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y2 - y, x2 - x))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(oooOOOO.f40369OooO0O0 - oooOOOO.f40371OooO0Oo, oooOOOO.f40368OooO00o - oooOOOO.f40370OooO0OO))) % 360.0f);
                    oooOOOO.f40374OooO0oO = degrees;
                    if (degrees < -180.0f) {
                        oooOOOO.f40374OooO0oO = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        oooOOOO.f40374OooO0oO = degrees - 360.0f;
                    }
                }
                OooOOOO.OooO00o oooO00o = oooOOOO.f40367OooO;
                if (oooO00o != null) {
                    GestureCropImageView gestureCropImageView = GestureCropImageView.this;
                    gestureCropImageView.OooO0oO(oooOOOO.f40374OooO0oO, gestureCropImageView.f20385o0ooOO0, gestureCropImageView.f20386o0ooOOo);
                }
                oooOOOO.f40368OooO00o = x2;
                oooOOOO.f40369OooO0O0 = y2;
                oooOOOO.f40370OooO0OO = x;
                oooOOOO.f40371OooO0Oo = y;
            }
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.f20384o0Oo0oo = i;
    }

    public void setRotateEnabled(boolean z) {
        this.f20387o0ooOoO = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f20383o0OOO0o = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20387o0ooOoO = true;
        this.f20383o0OOO0o = true;
        this.f20384o0Oo0oo = 5;
    }
}
