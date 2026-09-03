package com.common.support.imagepicker.crop.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.common.support.imagepicker.crop.utils.ResourceUtil;

/* JADX INFO: loaded from: classes2.dex */
class CropGestureDetector {
    private static final int INVALID_POINTER_ID = -1;
    private ScaleGestureDetector mDetector;
    private boolean mIsDragging;
    private float mLastTouchX;
    private float mLastTouchY;
    private CropGestureListener mListener;
    private final float mMinimumVelocity;
    private VelocityTracker mVelocityTracker;
    private boolean started;
    private long touchTime;
    private final float mTouchSlop = ResourceUtil.dp(1);
    private int mActivePointerId = -1;
    private int mActivePointerIndex = 0;

    public interface CropGestureListener {
        void onDrag(float f, float f2);

        void onFling(float f, float f2, float f3, float f4);

        void onScale(float f, float f2, float f3);

        void onTapUp();
    }

    public CropGestureDetector(Context context) {
        this.mMinimumVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.mDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.common.support.imagepicker.crop.widget.CropGestureDetector.1
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                CropGestureDetector.this.mListener.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        });
    }

    public float getActiveX(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public float getActiveY(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public boolean isScaling() {
        return this.mDetector.isInProgress();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float activeX;
        float activeY;
        float f;
        float f2;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTrackerObtain;
        this.mDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.touchTime = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.mIsDragging) {
                SystemClock.elapsedRealtime();
            }
            this.mListener.onTapUp();
            this.mActivePointerId = -1;
        } else if (action == 6) {
            int action2 = (65280 & motionEvent.getAction()) >> 8;
            if (motionEvent.getPointerId(action2) == this.mActivePointerId) {
                int i = action2 == 0 ? 1 : 0;
                this.mActivePointerId = motionEvent.getPointerId(i);
                this.mLastTouchX = motionEvent.getX(i);
                this.mLastTouchY = motionEvent.getY(i);
            }
        }
        int i2 = this.mActivePointerId;
        if (i2 == -1) {
            i2 = 0;
        }
        this.mActivePointerIndex = motionEvent.findPointerIndex(i2);
        int action3 = motionEvent.getAction();
        if (action3 == 0) {
            if (!this.started) {
                velocityTrackerObtain = VelocityTracker.obtain();
                this.mVelocityTracker = velocityTrackerObtain;
                if (velocityTrackerObtain != null) {
                    velocityTrackerObtain.addMovement(motionEvent);
                }
                this.mLastTouchX = getActiveX(motionEvent);
                this.mLastTouchY = getActiveY(motionEvent);
                this.mIsDragging = false;
                this.started = true;
                return true;
            }
            activeX = getActiveX(motionEvent);
            activeY = getActiveY(motionEvent);
            f = activeX - this.mLastTouchX;
            f2 = activeY - this.mLastTouchY;
            if (!this.mIsDragging) {
                this.mIsDragging = ((float) Math.sqrt((double) ((f2 * f2) + (f * f)))) >= this.mTouchSlop;
            }
            if (this.mIsDragging) {
                this.mListener.onDrag(f, f2);
                this.mLastTouchX = activeX;
                this.mLastTouchY = activeY;
                velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else if (action3 == 1) {
            if (this.mIsDragging) {
                if (this.mVelocityTracker != null) {
                    this.mLastTouchX = getActiveX(motionEvent);
                    this.mLastTouchY = getActiveY(motionEvent);
                    this.mVelocityTracker.addMovement(motionEvent);
                    this.mVelocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = this.mVelocityTracker.getXVelocity();
                    float yVelocity = this.mVelocityTracker.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.mMinimumVelocity) {
                        this.mListener.onFling(this.mLastTouchX, this.mLastTouchY, -xVelocity, -yVelocity);
                    }
                }
                this.mIsDragging = false;
            }
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.mVelocityTracker = null;
            }
            this.started = false;
        } else if (action3 != 2) {
            if (action3 == 3) {
                VelocityTracker velocityTracker3 = this.mVelocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mVelocityTracker = null;
                }
                this.started = false;
                this.mIsDragging = false;
            }
        } else {
            if (!this.started) {
                velocityTrackerObtain = VelocityTracker.obtain();
                this.mVelocityTracker = velocityTrackerObtain;
                if (velocityTrackerObtain != null) {
                    velocityTrackerObtain.addMovement(motionEvent);
                }
                this.mLastTouchX = getActiveX(motionEvent);
                this.mLastTouchY = getActiveY(motionEvent);
                this.mIsDragging = false;
                this.started = true;
                return true;
            }
            activeX = getActiveX(motionEvent);
            activeY = getActiveY(motionEvent);
            f = activeX - this.mLastTouchX;
            f2 = activeY - this.mLastTouchY;
            if (!this.mIsDragging) {
                this.mIsDragging = ((float) Math.sqrt((double) ((f2 * f2) + (f * f)))) >= this.mTouchSlop;
            }
            if (this.mIsDragging) {
                this.mListener.onDrag(f, f2);
                this.mLastTouchX = activeX;
                this.mLastTouchY = activeY;
                velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        }
        return true;
    }

    public void setOnGestureListener(CropGestureListener cropGestureListener) {
        this.mListener = cropGestureListener;
    }
}
