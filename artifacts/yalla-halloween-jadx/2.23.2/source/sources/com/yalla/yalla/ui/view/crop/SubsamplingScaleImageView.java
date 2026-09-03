package com.yalla.yalla.ui.view.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.ui.view.crop.decoder.SkiaImageDecoder;
import com.yalla.yalla.ui.view.crop.decoder.SkiaImageRegionDecoder;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p022Oooo00O.o00O00OO;
import p555o0oOOoo.o0O0OOOo;
import p555o0oOOoo.o0O0o000;
import p555o0oOOoo.o0O0o00O;
import p555o0oOOoo.oo0OOoo;
import p556o0oOOoo0.oO0O0Oo0;
import p562o0oOo000.o00000;

/* JADX INFO: loaded from: classes4.dex */
public class SubsamplingScaleImageView extends View {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public static Bitmap.Config f30288o0OOO0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinkedHashMap f30292OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Bitmap f30293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f30294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f30295OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Uri f30296OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30297OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f30298OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f30299OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f30300OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f30301OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f30302OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f30303OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30304OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f30305OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30306OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Executor f30307OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f30308OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f30309OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f30310OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f30311OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f30312OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f30313OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f30314OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f30315OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public PointF f30316OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f30317OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public PointF f30318OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public PointF f30319OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public GestureDetector f30320Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f30321Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Float f30322Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public PointF f30323Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public PointF f30324Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f30325Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f30326Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f30327Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f30328Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f30329Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f30330Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public oo0OOoo<? extends o0O0o000> f30331OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o0O0o00O f30332OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public GestureDetector f30333OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final ReentrantReadWriteLock f30334OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public oo0OOoo<? extends o0O0o00O> f30335OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f30336OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final float f30337OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f30338OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f30339OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public PointF f30340OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public PointF f30341Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public PointF f30342Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public OooO0o f30343OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f30344OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f30345OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final Handler f30346Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View.OnLongClickListener f30347Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Paint f30348OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public Paint f30349Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public PointF f30350o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooOOO f30351o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public Matrix f30352o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public RectF f30353o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final float[] f30354o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final float[] f30355o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public Paint f30356o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final float f30357oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public Paint f30358ooOO;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final List<Integer> f30287o00oO0o = Arrays.asList(0, 90, 180, 270, -1);

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final List<Integer> f30286o00oO0O = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public static final List<Integer> f30289o0ooOO0 = Arrays.asList(2, 1);

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public static final List<Integer> f30290o0ooOOo = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public static final List<Integer> f30291o0ooOoO = Arrays.asList(2, 1, 3, 4);

    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            SubsamplingScaleImageView subsamplingScaleImageView;
            View.OnLongClickListener onLongClickListener;
            if (message.what == 1 && (onLongClickListener = (subsamplingScaleImageView = SubsamplingScaleImageView.this).f30347Oooooo0) != null) {
                subsamplingScaleImageView.f30330Oooo0oo = 0;
                SubsamplingScaleImageView.super.setOnLongClickListener(onLongClickListener);
                subsamplingScaleImageView.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30369OooO0Oo;

        public OooO0O0(Context context) {
            this.f30369OooO0Oo = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f30311OooOo0O || !subsamplingScaleImageView.f30344OooooOO || subsamplingScaleImageView.f30316OooOoo == null) {
                return onDoubleTapEvent(motionEvent);
            }
            subsamplingScaleImageView.setGestureDetector(this.f30369OooO0Oo);
            PointF pointF = null;
            if (!subsamplingScaleImageView.f30312OooOo0o) {
                PointF pointF2 = new PointF(motionEvent.getX(), motionEvent.getY());
                float f = pointF2.x;
                float f2 = pointF2.y;
                PointF pointF3 = new PointF();
                PointF pointF4 = subsamplingScaleImageView.f30316OooOoo;
                if (pointF4 != null) {
                    float f3 = f - pointF4.x;
                    float f4 = subsamplingScaleImageView.f30315OooOoOO;
                    pointF3.set(f3 / f4, (f2 - pointF4.y) / f4);
                    pointF = pointF3;
                }
                subsamplingScaleImageView.OooO(pointF, new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            subsamplingScaleImageView.f30350o000oOoO = new PointF(motionEvent.getX(), motionEvent.getY());
            PointF pointF5 = subsamplingScaleImageView.f30316OooOoo;
            subsamplingScaleImageView.f30318OooOooO = new PointF(pointF5.x, pointF5.y);
            subsamplingScaleImageView.f30317OooOoo0 = subsamplingScaleImageView.f30315OooOoOO;
            subsamplingScaleImageView.f30329Oooo0oO = true;
            subsamplingScaleImageView.f30328Oooo0o0 = true;
            subsamplingScaleImageView.f30338OoooOo0 = -1.0f;
            PointF pointF6 = subsamplingScaleImageView.f30350o000oOoO;
            float f5 = pointF6.x;
            float f6 = pointF6.y;
            PointF pointF7 = new PointF();
            PointF pointF8 = subsamplingScaleImageView.f30316OooOoo;
            if (pointF8 != null) {
                float f7 = f5 - pointF8.x;
                float f8 = subsamplingScaleImageView.f30315OooOoOO;
                pointF7.set(f7 / f8, (f6 - pointF8.y) / f8);
                pointF = pointF7;
            }
            subsamplingScaleImageView.f30341Ooooo00 = pointF;
            subsamplingScaleImageView.f30342Ooooo0o = new PointF(motionEvent.getX(), motionEvent.getY());
            PointF pointF9 = subsamplingScaleImageView.f30341Ooooo00;
            subsamplingScaleImageView.f30340OoooOoo = new PointF(pointF9.x, pointF9.y);
            subsamplingScaleImageView.f30339OoooOoO = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f30309OooOo0 || !subsamplingScaleImageView.f30344OooooOO || subsamplingScaleImageView.f30316OooOoo == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || subsamplingScaleImageView.f30328Oooo0o0))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = subsamplingScaleImageView.f30316OooOoo;
            PointF pointF2 = new PointF((f * 0.25f) + pointF.x, (f2 * 0.25f) + pointF.y);
            OooO oooO = subsamplingScaleImageView.new OooO(new PointF(((subsamplingScaleImageView.getWidth() / 2) - pointF2.x) / subsamplingScaleImageView.f30315OooOoOO, ((subsamplingScaleImageView.getHeight() / 2) - pointF2.y) / subsamplingScaleImageView.f30315OooOoOO));
            if (!SubsamplingScaleImageView.f30289o0ooOO0.contains(1)) {
                throw new IllegalArgumentException("Unknown easing type: 1");
            }
            oooO.f30365OooO0o0 = 1;
            oooO.f30367OooO0oo = false;
            oooO.f30364OooO0o = 3;
            oooO.OooO00o();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    public class OooO0OO extends GestureDetector.SimpleOnGestureListener {
        public OooO0OO() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f30373OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f30374OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public PointF f30375OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PointF f30376OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PointF f30377OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public PointF f30378OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public PointF f30379OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f30380OooO0oo = 500;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f30372OooO = true;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f30381OooOO0 = 2;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f30382OooOO0O = 1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f30383OooOO0o = System.currentTimeMillis();
    }

    public static class OooOO0 extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f30384OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<Context> f30385OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<oo0OOoo<? extends o0O0o000>> f30386OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f30387OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f30388OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f30389OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Exception f30390OooO0oO;

        public OooOO0(SubsamplingScaleImageView subsamplingScaleImageView, Context context, oo0OOoo<? extends o0O0o000> oo0oooo, Uri uri, boolean z) {
            this.f30384OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f30385OooO0O0 = new WeakReference<>(context);
            this.f30386OooO0OO = new WeakReference<>(oo0oooo);
            this.f30387OooO0Oo = uri;
            this.f30389OooO0o0 = z;
        }

        @Override // android.os.AsyncTask
        public final Integer doInBackground(Void[] voidArr) {
            Uri uri = this.f30387OooO0Oo;
            try {
                String string = uri.toString();
                Context context = this.f30385OooO0O0.get();
                oo0OOoo<? extends o0O0o000> oo0oooo = this.f30386OooO0OO.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f30384OooO00o.get();
                if (context != null && oo0oooo != null && subsamplingScaleImageView != null) {
                    List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                    this.f30388OooO0o = oo0oooo.OooO00o().OooO00o(context, uri);
                    return Integer.valueOf(SubsamplingScaleImageView.OooO0O0(subsamplingScaleImageView, context, string));
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap", e);
                this.f30390OooO0oO = e;
            } catch (OutOfMemoryError e2) {
                List<Integer> list3 = SubsamplingScaleImageView.f30287o00oO0o;
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap - OutOfMemoryError", e2);
                this.f30390OooO0oO = new RuntimeException(e2);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Integer num) {
            Integer num2 = num;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f30384OooO00o.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f30388OooO0o;
                if (bitmap == null || num2 == null) {
                    if (this.f30390OooO0oO != null) {
                        List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                        return;
                    }
                    return;
                }
                if (!this.f30389OooO0o0) {
                    int iIntValue = num2.intValue();
                    List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
                    subsamplingScaleImageView.OooOOo0(bitmap, iIntValue, false);
                    return;
                }
                List<Integer> list3 = SubsamplingScaleImageView.f30287o00oO0o;
                synchronized (subsamplingScaleImageView) {
                    if (subsamplingScaleImageView.f30293OooO0Oo == null && !subsamplingScaleImageView.f30345OooooOo) {
                        subsamplingScaleImageView.f30293OooO0Oo = bitmap;
                        subsamplingScaleImageView.f30295OooO0o0 = true;
                        if (subsamplingScaleImageView.OooO0oo()) {
                            subsamplingScaleImageView.invalidate();
                            subsamplingScaleImageView.requestLayout();
                        }
                        return;
                    }
                    bitmap.recycle();
                }
            }
        }
    }

    public interface OooOO0O {
    }

    public static class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f30391OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f30392OooO0O0;

        public OooOOO(float f, PointF pointF) {
            this.f30391OooO00o = f;
            this.f30392OooO0O0 = pointF;
        }
    }

    public interface OooOOO0 {
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f30393OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f30394OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Bitmap f30395OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f30396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Rect f30397OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f30398OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Rect f30399OooO0oO;
    }

    public static class OooOo extends AsyncTask<Void, Void, int[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f30400OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<Context> f30401OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<oo0OOoo<? extends o0O0o00O>> f30402OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f30403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Exception f30404OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0O0o00O f30405OooO0o0;

        public OooOo(SubsamplingScaleImageView subsamplingScaleImageView, Context context, oo0OOoo<? extends o0O0o00O> oo0oooo, Uri uri) {
            this.f30400OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f30401OooO0O0 = new WeakReference<>(context);
            this.f30402OooO0OO = new WeakReference<>(oo0oooo);
            this.f30403OooO0Oo = uri;
        }

        @Override // android.os.AsyncTask
        public final int[] doInBackground(Void[] voidArr) {
            Uri uri = this.f30403OooO0Oo;
            try {
                String string = uri.toString();
                Context context = this.f30401OooO0O0.get();
                oo0OOoo<? extends o0O0o00O> oo0oooo = this.f30402OooO0OO.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f30400OooO00o.get();
                if (context != null && oo0oooo != null && subsamplingScaleImageView != null) {
                    List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                    o0O0o00O o0o0o00oOooO00o = oo0oooo.OooO00o();
                    this.f30405OooO0o0 = o0o0o00oOooO00o;
                    Point pointOooO0O0 = o0o0o00oOooO00o.OooO0O0(context, uri);
                    return new int[]{pointOooO0O0.x, pointOooO0O0.y, SubsamplingScaleImageView.OooO0O0(subsamplingScaleImageView, context, string)};
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
                Log.e("SubsamplingScaleImageView", "Failed to initialise bitmap decoder", e);
                this.f30404OooO0o = e;
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(int[] iArr) {
            int i;
            int i2;
            int i3;
            int[] iArr2 = iArr;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f30400OooO00o.get();
            if (subsamplingScaleImageView != null) {
                o0O0o00O o0o0o00o = this.f30405OooO0o0;
                if (o0o0o00o == null || iArr2 == null || iArr2.length != 3) {
                    if (this.f30404OooO0o != null) {
                        List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                        return;
                    }
                    return;
                }
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                int i6 = iArr2[2];
                List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
                synchronized (subsamplingScaleImageView) {
                    int i7 = subsamplingScaleImageView.f30321Oooo0;
                    if (i7 > 0 && (i3 = subsamplingScaleImageView.f30325Oooo0O0) > 0 && (i7 != i4 || i3 != i5)) {
                        subsamplingScaleImageView.OooOo00(false);
                        Bitmap bitmap = subsamplingScaleImageView.f30293OooO0Oo;
                        if (bitmap != null) {
                            if (!subsamplingScaleImageView.f30294OooO0o) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f30293OooO0Oo = null;
                            subsamplingScaleImageView.f30295OooO0o0 = false;
                            subsamplingScaleImageView.f30294OooO0o = false;
                        }
                    }
                    subsamplingScaleImageView.f30332OoooO0 = o0o0o00o;
                    subsamplingScaleImageView.f30321Oooo0 = i4;
                    subsamplingScaleImageView.f30325Oooo0O0 = i5;
                    subsamplingScaleImageView.f30326Oooo0OO = i6;
                    subsamplingScaleImageView.OooO0oo();
                    if (!subsamplingScaleImageView.OooO0oO() && (i = subsamplingScaleImageView.f30306OooOOo0) > 0 && i != Integer.MAX_VALUE && (i2 = subsamplingScaleImageView.f30305OooOOo) > 0 && i2 != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                        subsamplingScaleImageView.OooOOO0(new Point(subsamplingScaleImageView.f30306OooOOo0, subsamplingScaleImageView.f30305OooOOo));
                    }
                    subsamplingScaleImageView.invalidate();
                    subsamplingScaleImageView.requestLayout();
                }
            }
        }
    }

    public static class OooOo00 extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f30406OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<o0O0o00O> f30407OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<OooOOOO> f30408OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Exception f30409OooO0Oo;

        public OooOo00(SubsamplingScaleImageView subsamplingScaleImageView, o0O0o00O o0o0o00o, OooOOOO oooOOOO) {
            this.f30406OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f30407OooO0O0 = new WeakReference<>(o0o0o00o);
            this.f30408OooO0OO = new WeakReference<>(oooOOOO);
            oooOOOO.f30396OooO0Oo = true;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x006c A[Catch: OutOfMemoryError -> 0x006f, Exception -> 0x007f, TRY_LEAVE, TryCatch #3 {Exception -> 0x007f, OutOfMemoryError -> 0x006f, blocks: (B:3:0x0004, B:7:0x0023, B:9:0x002b, B:11:0x002f, B:15:0x004d, B:18:0x0057, B:20:0x0060, B:21:0x0069, B:23:0x006c), top: B:32:0x0004 }] */
        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(Void[] voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f30406OooO00o.get();
                o0O0o00O o0o0o00o = this.f30407OooO0O0.get();
                OooOOOO oooOOOO = this.f30408OooO0OO.get();
                if (o0o0o00o != null && oooOOOO != null && subsamplingScaleImageView != null) {
                    ReentrantReadWriteLock reentrantReadWriteLock = subsamplingScaleImageView.f30334OoooO0O;
                    if (o0o0o00o.OooO0Oo() && oooOOOO.f30398OooO0o0) {
                        List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                        reentrantReadWriteLock.readLock().lock();
                        try {
                            if (o0o0o00o.OooO0Oo()) {
                                SubsamplingScaleImageView.OooO00o(subsamplingScaleImageView, oooOOOO.f30393OooO00o, oooOOOO.f30399OooO0oO);
                                return o0o0o00o.OooO0OO(oooOOOO.f30394OooO0O0, oooOOOO.f30399OooO0oO);
                            }
                            oooOOOO.f30396OooO0Oo = false;
                        } finally {
                            subsamplingScaleImageView.f30334OoooO0O.readLock().unlock();
                        }
                    } else if (oooOOOO != null) {
                        oooOOOO.f30396OooO0Oo = false;
                    }
                } else if (oooOOOO != null) {
                    oooOOOO.f30396OooO0Oo = false;
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
                Log.e("SubsamplingScaleImageView", "Failed to decode tile", e);
                this.f30409OooO0Oo = e;
            } catch (OutOfMemoryError e2) {
                List<Integer> list3 = SubsamplingScaleImageView.f30287o00oO0o;
                Log.e("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", e2);
                this.f30409OooO0Oo = new RuntimeException(e2);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2;
            Bitmap bitmap3 = bitmap;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f30406OooO00o.get();
            OooOOOO oooOOOO = this.f30408OooO0OO.get();
            if (subsamplingScaleImageView == null || oooOOOO == null) {
                return;
            }
            if (bitmap3 == null) {
                if (this.f30409OooO0Oo != null) {
                    List<Integer> list = SubsamplingScaleImageView.f30287o00oO0o;
                    return;
                }
                return;
            }
            oooOOOO.f30395OooO0OO = bitmap3;
            oooOOOO.f30396OooO0Oo = false;
            List<Integer> list2 = SubsamplingScaleImageView.f30287o00oO0o;
            synchronized (subsamplingScaleImageView) {
                subsamplingScaleImageView.OooO0oo();
                subsamplingScaleImageView.OooO0oO();
                if (subsamplingScaleImageView.OooOOOO() && (bitmap2 = subsamplingScaleImageView.f30293OooO0Oo) != null) {
                    if (!subsamplingScaleImageView.f30294OooO0o) {
                        bitmap2.recycle();
                    }
                    subsamplingScaleImageView.f30293OooO0Oo = null;
                    subsamplingScaleImageView.f30295OooO0o0 = false;
                    subsamplingScaleImageView.f30294OooO0o = false;
                }
                subsamplingScaleImageView.invalidate();
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f30299OooOO0O = 0;
        this.f30300OooOO0o = 2.0f;
        this.f30302OooOOO0 = OooOOOo();
        this.f30301OooOOO = -1;
        this.f30303OooOOOO = 1;
        this.f30304OooOOOo = 1;
        this.f30306OooOOo0 = Integer.MAX_VALUE;
        this.f30305OooOOo = Integer.MAX_VALUE;
        this.f30307OooOOoo = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f30310OooOo00 = true;
        this.f30309OooOo0 = true;
        this.f30311OooOo0O = true;
        this.f30312OooOo0o = true;
        this.f30308OooOo = 1.0f;
        this.f30314OooOoO0 = 1;
        this.f30313OooOoO = 500;
        this.f30334OoooO0O = new ReentrantReadWriteLock(true);
        this.f30331OoooO = new o0O0OOOo(SkiaImageDecoder.class);
        this.f30335OoooOO0 = new o0O0OOOo(SkiaImageRegionDecoder.class);
        this.f30354o00o0O = new float[8];
        this.f30355o00ooo = new float[8];
        this.f30357oo000o = getResources().getDisplayMetrics().density;
        setMinimumDpi(Constants.ERR_ALREADY_IN_RECORDING);
        setDoubleTapZoomDpi(Constants.ERR_ALREADY_IN_RECORDING);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.f30346Oooooo = new Handler(new OooO00o());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00000.SubsamplingScaleImageView);
            int i = o00000.SubsamplingScaleImageView_assetName;
            if (typedArrayObtainStyledAttributes.hasValue(i) && (string = typedArrayObtainStyledAttributes.getString(i)) != null && string.length() > 0) {
                String strConcat = "file:///android_asset/".concat(string);
                if (strConcat == null) {
                    throw new NullPointerException("Uri must not be null");
                }
                if (!strConcat.contains("://")) {
                    strConcat = o00O00OO.OooO00o("file:///", strConcat.startsWith("/") ? strConcat.substring(1) : strConcat);
                }
                oO0O0Oo0 oo0o0oo0 = new oO0O0Oo0(Uri.parse(strConcat));
                oo0o0oo0.f56159OooO0Oo = true;
                setImage(oo0o0oo0);
            }
            int i2 = o00000.SubsamplingScaleImageView_src;
            if (typedArrayObtainStyledAttributes.hasValue(i2) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) > 0) {
                oO0O0Oo0 oo0o0oo1 = new oO0O0Oo0(resourceId);
                oo0o0oo1.f56159OooO0Oo = true;
                setImage(oo0o0oo1);
            }
            int i3 = o00000.SubsamplingScaleImageView_panEnabled;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(i3, true));
            }
            int i4 = o00000.SubsamplingScaleImageView_zoomEnabled;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(i4, true));
            }
            int i5 = o00000.SubsamplingScaleImageView_quickScaleEnabled;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(i5, true));
            }
            int i6 = o00000.SubsamplingScaleImageView_tileBackgroundColor;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(i6, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f30337OoooOOo = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public static void OooO00o(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        if (subsamplingScaleImageView.getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (subsamplingScaleImageView.getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = subsamplingScaleImageView.f30325Oooo0O0;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (subsamplingScaleImageView.getRequiredRotation() != 180) {
            int i3 = subsamplingScaleImageView.f30321Oooo0;
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
        } else {
            int i4 = subsamplingScaleImageView.f30321Oooo0;
            int i5 = i4 - rect.right;
            int i6 = subsamplingScaleImageView.f30325Oooo0O0;
            rect2.set(i5, i6 - rect.bottom, i4 - rect.left, i6 - rect.top);
        }
    }

    public static int OooO0O0(SubsamplingScaleImageView subsamplingScaleImageView, Context context, String str) {
        int i;
        int i2 = 0;
        if (str.startsWith("content")) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i3 = cursorQuery.getInt(0);
                        if (!f30287o00oO0o.contains(Integer.valueOf(i3)) || i3 == -1) {
                            Log.w("SubsamplingScaleImageView", "Unsupported orientation: " + i3);
                        } else {
                            i2 = i3;
                        }
                    }
                    if (cursorQuery == null) {
                        return i2;
                    }
                } catch (Exception unused) {
                    Log.w("SubsamplingScaleImageView", "Could not get orientation of image from media store");
                    if (cursorQuery == null) {
                        return 0;
                    }
                }
                return i2;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        if (!str.startsWith("file:///") || str.startsWith("file:///android_asset/")) {
            return 0;
        }
        try {
            int iOooO0o0 = new ExifInterface(str.substring(7)).OooO0o0(1, "Orientation");
            if (iOooO0o0 != 1 && iOooO0o0 != 0) {
                if (iOooO0o0 == 6) {
                    i = 90;
                } else if (iOooO0o0 == 3) {
                    i = 180;
                } else {
                    if (iOooO0o0 != 8) {
                        Log.w("SubsamplingScaleImageView", "Unsupported EXIF orientation: " + iOooO0o0);
                        return 0;
                    }
                    i = 270;
                }
                return i;
            }
            return 0;
        } catch (Exception unused2) {
            Log.w("SubsamplingScaleImageView", "Could not get EXIF orientation of image");
            return 0;
        }
    }

    public static float OooOO0(int i, long j, float f, float f2, long j2) {
        float f3;
        if (i == 1) {
            float f4 = j / j2;
            return OooOo.OooO0o.OooO00o(f4, 2.0f, (-f2) * f4, f);
        }
        if (i != 2) {
            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unexpected easing type: ", i));
        }
        float f5 = j / (j2 / 2.0f);
        if (f5 < 1.0f) {
            f3 = (f2 / 2.0f) * f5 * f5;
        } else {
            float f6 = f5 - 1.0f;
            f3 = (((f6 - 2.0f) * f6) - 1.0f) * ((-f2) / 2.0f);
        }
        return f3 + f;
    }

    public static void OooOo0o(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return f30288o0OOO0o;
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f30299OooOO0O;
        return i == -1 ? this.f30326Oooo0OO : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f30320Oooo = new GestureDetector(context, new OooO0O0(context));
        this.f30333OoooO00 = new GestureDetector(context, new OooO0OO());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        f30288o0OOO0o = config;
    }

    public final void OooO(PointF pointF, PointF pointF2) {
        if (!this.f30309OooOo0) {
            PointF pointF3 = this.f30324Oooo00o;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = OooOo0O() / 2;
                pointF.y = OooOo0() / 2;
            }
        }
        float fMin = Math.min(this.f30300OooOO0o, this.f30308OooOo);
        float f = this.f30315OooOoOO;
        boolean z = ((double) f) <= ((double) fMin) * 0.9d || f == this.f30302OooOOO0;
        if (!z) {
            fMin = OooOOOo();
        }
        int i = this.f30314OooOoO0;
        if (i == 3) {
            this.f30343OooooO0 = null;
            this.f30322Oooo000 = Float.valueOf(fMin);
            this.f30323Oooo00O = pointF;
            this.f30324Oooo00o = pointF;
            invalidate();
        } else if (i == 2 || !z || !this.f30309OooOo0) {
            OooO oooO = new OooO(fMin, pointF);
            oooO.f30366OooO0oO = false;
            oooO.f30363OooO0Oo = this.f30313OooOoO;
            oooO.f30364OooO0o = 4;
            oooO.OooO00o();
        } else if (i == 1) {
            OooO oooO2 = new OooO(fMin, pointF, pointF2);
            oooO2.f30366OooO0oO = false;
            oooO2.f30363OooO0Oo = this.f30313OooOoO;
            oooO2.f30364OooO0o = 4;
            oooO2.OooO00o();
        }
        invalidate();
    }

    public final int OooO0o(float f) {
        int iRound;
        if (this.f30301OooOOO > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.f30301OooOOO / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iOooOo0O = (int) (OooOo0O() * f);
        int iOooOo0 = (int) (OooOo0() * f);
        if (iOooOo0O == 0 || iOooOo0 == 0) {
            return 32;
        }
        int i = 1;
        if (OooOo0() > iOooOo0 || OooOo0O() > iOooOo0O) {
            iRound = Math.round(OooOo0() / iOooOo0);
            int iRound2 = Math.round(OooOo0O() / iOooOo0O);
            if (iRound >= iRound2) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        while (true) {
            int i2 = i * 2;
            if (i2 >= iRound) {
                return i;
            }
            i = i2;
        }
    }

    public final boolean OooO0oO() {
        boolean zOooOOOO = OooOOOO();
        if (!this.f30345OooooOo && zOooOOOO) {
            OooOOo();
            this.f30345OooooOo = true;
        }
        return zOooOOOO;
    }

    public final boolean OooO0oo() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f30321Oooo0 > 0 && this.f30325Oooo0O0 > 0 && (this.f30293OooO0Oo != null || OooOOOO());
        if (!this.f30344OooooOO && z) {
            OooOOo();
            this.f30344OooooOO = true;
        }
        return z;
    }

    public final void OooOO0O(boolean z) {
        boolean z2;
        if (this.f30316OooOoo == null) {
            this.f30316OooOoo = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f30351o00O0O == null) {
            this.f30351o00O0O = new OooOOO(0.0f, new PointF(0.0f, 0.0f));
        }
        OooOOO oooOOO = this.f30351o00O0O;
        oooOOO.f30391OooO00o = this.f30315OooOoOO;
        oooOOO.f30392OooO0O0.set(this.f30316OooOoo);
        OooOO0o(z, this.f30351o00O0O);
        OooOOO oooOOO2 = this.f30351o00O0O;
        this.f30315OooOoOO = oooOOO2.f30391OooO00o;
        this.f30316OooOoo.set(oooOOO2.f30392OooO0O0);
        if (!z2 || this.f30304OooOOOo == 4) {
            return;
        }
        this.f30316OooOoo.set(OooOoOO(OooOo0O() / 2, OooOo0() / 2, this.f30315OooOoOO));
    }

    public final void OooOO0o(boolean z, OooOOO oooOOO) {
        float paddingLeft;
        float fMax;
        int iMax;
        float fMax2;
        if (this.f30303OooOOOO == 2 && this.f30344OooooOO) {
            z = false;
        }
        PointF pointF = oooOOO.f30392OooO0O0;
        float fMin = Math.min(this.f30300OooOO0o, Math.max(OooOOOo(), oooOOO.f30391OooO00o));
        float fOooOo0O = OooOo0O() * fMin;
        float fOooOo0 = OooOo0() * fMin;
        if (this.f30303OooOOOO == 3 && this.f30344OooooOO) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fOooOo0O);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fOooOo0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fOooOo0O);
            pointF.y = Math.max(pointF.y, getHeight() - fOooOo0);
        } else {
            pointF.x = Math.max(pointF.x, -fOooOo0O);
            pointF.y = Math.max(pointF.y, -fOooOo0);
        }
        float paddingTop = 0.5f;
        if (getPaddingLeft() > 0 || getPaddingRight() > 0) {
            paddingLeft = getPaddingLeft() / (getPaddingRight() + getPaddingLeft());
        } else {
            paddingLeft = 0.5f;
        }
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            paddingTop = getPaddingTop() / (getPaddingBottom() + getPaddingTop());
        }
        if (this.f30303OooOOOO != 3 || !this.f30344OooooOO) {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fOooOo0O) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fOooOo0) * paddingTop);
            } else {
                fMax = Math.max(0, getWidth());
                iMax = Math.max(0, getHeight());
            }
            pointF.x = Math.min(pointF.x, fMax);
            pointF.y = Math.min(pointF.y, fMax2);
            oooOOO.f30391OooO00o = fMin;
        }
        fMax = Math.max(0, getWidth() / 2);
        iMax = Math.max(0, getHeight() / 2);
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        oooOOO.f30391OooO00o = fMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO(Point point) {
        this.f30292OooO = new LinkedHashMap();
        int i = this.f30297OooO0oo;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int iOooOo0O = OooOo0O() / i3;
            int iOooOo0 = OooOo0() / i4;
            int i5 = iOooOo0O / i;
            int i6 = iOooOo0 / i;
            while (true) {
                if (i5 + i3 + i2 <= point.x && (i5 <= ((double) getWidth()) * 1.25d || i >= this.f30297OooO0oo)) {
                    break;
                }
                i3++;
                iOooOo0O = OooOo0O() / i3;
                i5 = iOooOo0O / i;
            }
            while (true) {
                if (i6 + i4 + i2 <= point.y && (i6 <= ((double) getHeight()) * 1.25d || i >= this.f30297OooO0oo)) {
                    break;
                }
                i4++;
                iOooOo0 = OooOo0() / i4;
                i6 = iOooOo0 / i;
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    OooOOOO oooOOOO = new OooOOOO();
                    oooOOOO.f30394OooO0O0 = i;
                    oooOOOO.f30398OooO0o0 = i == this.f30297OooO0oo ? i2 : 0;
                    oooOOOO.f30393OooO00o = new Rect(i7 * iOooOo0O, i8 * iOooOo0, i7 == i3 + (-1) ? OooOo0O() : (i7 + 1) * iOooOo0O, i8 == i4 + (-1) ? OooOo0() : (i8 + 1) * iOooOo0);
                    oooOOOO.f30397OooO0o = new Rect(0, 0, 0, 0);
                    oooOOOO.f30399OooO0oO = new Rect(oooOOOO.f30393OooO00o);
                    arrayList.add(oooOOOO);
                    i8++;
                    i2 = 1;
                }
                i7++;
                i2 = 1;
            }
            this.f30292OooO.put(Integer.valueOf(i), arrayList);
            i2 = 1;
            if (i == 1) {
                return;
            } else {
                i /= 2;
            }
        }
    }

    public final synchronized void OooOOO0(@NonNull Point point) {
        OooOOO oooOOO = new OooOOO(0.0f, new PointF(0.0f, 0.0f));
        this.f30351o00O0O = oooOOO;
        OooOO0o(true, oooOOO);
        int iOooO0o = OooO0o(this.f30351o00O0O.f30391OooO00o);
        this.f30297OooO0oo = iOooO0o;
        if (iOooO0o > 1) {
            this.f30297OooO0oo = iOooO0o / 2;
        }
        if (this.f30297OooO0oo != 1 || OooOo0O() >= point.x || OooOo0() >= point.y) {
            OooOOO(point);
            Iterator it = ((List) this.f30292OooO.get(Integer.valueOf(this.f30297OooO0oo))).iterator();
            while (it.hasNext()) {
                new OooOo00(this, this.f30332OoooO0, (OooOOOO) it.next()).executeOnExecutor(this.f30307OooOOoo, new Void[0]);
            }
            OooOOoo(true);
        } else {
            this.f30332OoooO0.OooO00o();
            this.f30332OoooO0 = null;
            new OooOO0(this, getContext(), this.f30331OoooO, this.f30296OooO0oO, false).executeOnExecutor(this.f30307OooOOoo, new Void[0]);
        }
    }

    public final boolean OooOOOO() {
        boolean z = true;
        if (this.f30293OooO0Oo != null && !this.f30295OooO0o0) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f30292OooO;
        if (linkedHashMap == null) {
            return false;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.f30297OooO0oo) {
                for (OooOOOO oooOOOO : (List) entry.getValue()) {
                    if (oooOOOO.f30396OooO0Oo || oooOOOO.f30395OooO0OO == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public final float OooOOOo() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.f30304OooOOOo;
        if (i == 2 || i == 4) {
            return Math.max((getWidth() - paddingRight) / OooOo0O(), (getHeight() - paddingTop) / OooOo0());
        }
        if (i == 3) {
            float f = this.f30302OooOOO0;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingRight) / OooOo0O(), (getHeight() - paddingTop) / OooOo0());
    }

    public final void OooOOo() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.f30321Oooo0 <= 0 || this.f30325Oooo0O0 <= 0) {
            return;
        }
        if (this.f30323Oooo00O != null && (f = this.f30322Oooo000) != null) {
            this.f30315OooOoOO = f.floatValue();
            if (this.f30316OooOoo == null) {
                this.f30316OooOoo = new PointF();
            }
            this.f30316OooOoo.x = (getWidth() / 2) - (this.f30315OooOoOO * this.f30323Oooo00O.x);
            this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * this.f30323Oooo00O.y);
            this.f30323Oooo00O = null;
            this.f30322Oooo000 = null;
            OooOO0O(true);
            OooOOoo(true);
        }
        OooOO0O(false);
    }

    public final synchronized void OooOOo0(Bitmap bitmap, int i, boolean z) {
        int i2 = this.f30321Oooo0;
        if (i2 > 0 && this.f30325Oooo0O0 > 0 && (i2 != bitmap.getWidth() || this.f30325Oooo0O0 != bitmap.getHeight())) {
            OooOo00(false);
        }
        Bitmap bitmap2 = this.f30293OooO0Oo;
        if (bitmap2 != null && !this.f30294OooO0o) {
            bitmap2.recycle();
        }
        if (this.f30293OooO0Oo != null) {
            boolean z2 = this.f30294OooO0o;
        }
        this.f30295OooO0o0 = false;
        this.f30294OooO0o = z;
        this.f30293OooO0Oo = bitmap;
        this.f30321Oooo0 = bitmap.getWidth();
        this.f30325Oooo0O0 = bitmap.getHeight();
        this.f30326Oooo0OO = i;
        boolean zOooO0oo = OooO0oo();
        boolean zOooO0oO = OooO0oO();
        if (zOooO0oo || zOooO0oO) {
            invalidate();
            requestLayout();
        }
    }

    public final void OooOOoo(boolean z) {
        if (this.f30332OoooO0 == null || this.f30292OooO == null) {
            return;
        }
        int iMin = Math.min(this.f30297OooO0oo, OooO0o(this.f30315OooOoOO));
        Iterator it = this.f30292OooO.entrySet().iterator();
        while (it.hasNext()) {
            for (OooOOOO oooOOOO : (List) ((Map.Entry) it.next()).getValue()) {
                int i = oooOOOO.f30394OooO0O0;
                if (i < iMin || (i > iMin && i != this.f30297OooO0oo)) {
                    oooOOOO.f30398OooO0o0 = false;
                    Bitmap bitmap = oooOOOO.f30395OooO0OO;
                    if (bitmap != null) {
                        bitmap.recycle();
                        oooOOOO.f30395OooO0OO = null;
                    }
                }
                int i2 = oooOOOO.f30394OooO0O0;
                if (i2 == iMin) {
                    PointF pointF = this.f30316OooOoo;
                    float f = pointF == null ? Float.NaN : (0.0f - pointF.x) / this.f30315OooOoOO;
                    float width = getWidth();
                    PointF pointF2 = this.f30316OooOoo;
                    float f2 = pointF2 == null ? Float.NaN : (width - pointF2.x) / this.f30315OooOoOO;
                    float f3 = pointF2 == null ? Float.NaN : (0.0f - pointF2.y) / this.f30315OooOoOO;
                    float height = getHeight();
                    PointF pointF3 = this.f30316OooOoo;
                    float f4 = pointF3 != null ? (height - pointF3.y) / this.f30315OooOoOO : Float.NaN;
                    Rect rect = oooOOOO.f30393OooO00o;
                    if (f <= ((float) rect.right) && ((float) rect.left) <= f2 && f3 <= ((float) rect.bottom) && ((float) rect.top) <= f4) {
                        oooOOOO.f30398OooO0o0 = true;
                        if (!oooOOOO.f30396OooO0Oo && oooOOOO.f30395OooO0OO == null && z) {
                            new OooOo00(this, this.f30332OoooO0, oooOOOO).executeOnExecutor(this.f30307OooOOoo, new Void[0]);
                        }
                    } else if (oooOOOO.f30394OooO0O0 != this.f30297OooO0oo) {
                        oooOOOO.f30398OooO0o0 = false;
                        Bitmap bitmap2 = oooOOOO.f30395OooO0OO;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            oooOOOO.f30395OooO0OO = null;
                        }
                    }
                } else if (i2 == this.f30297OooO0oo) {
                    oooOOOO.f30398OooO0o0 = true;
                }
            }
        }
    }

    @Nullable
    public final PointF OooOo(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.f30316OooOoo == null) {
            return null;
        }
        pointF2.set(OooOoO0(f), OooOoO(f2));
        return pointF2;
    }

    public final int OooOo0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f30321Oooo0 : this.f30325Oooo0O0;
    }

    public final void OooOo00(boolean z) {
        this.f30315OooOoOO = 0.0f;
        this.f30317OooOoo0 = 0.0f;
        this.f30316OooOoo = null;
        this.f30318OooOooO = null;
        this.f30319OooOooo = null;
        this.f30322Oooo000 = Float.valueOf(0.0f);
        this.f30323Oooo00O = null;
        this.f30324Oooo00o = null;
        this.f30328Oooo0o0 = false;
        this.f30327Oooo0o = false;
        this.f30329Oooo0oO = false;
        this.f30330Oooo0oo = 0;
        this.f30297OooO0oo = 0;
        this.f30350o000oOoO = null;
        this.f30336OoooOOO = 0.0f;
        this.f30338OoooOo0 = 0.0f;
        this.f30339OoooOoO = false;
        this.f30341Ooooo00 = null;
        this.f30340OoooOoo = null;
        this.f30342Ooooo0o = null;
        this.f30343OooooO0 = null;
        this.f30351o00O0O = null;
        this.f30352o00Oo0 = null;
        this.f30353o00Ooo = null;
        if (z) {
            this.f30296OooO0oO = null;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f30334OoooO0O;
            reentrantReadWriteLock.writeLock().lock();
            try {
                o0O0o00O o0o0o00o = this.f30332OoooO0;
                if (o0o0o00o != null) {
                    o0o0o00o.OooO00o();
                    this.f30332OoooO0 = null;
                }
                reentrantReadWriteLock.writeLock().unlock();
                Bitmap bitmap = this.f30293OooO0Oo;
                if (bitmap != null && !this.f30294OooO0o) {
                    bitmap.recycle();
                }
                this.f30321Oooo0 = 0;
                this.f30325Oooo0O0 = 0;
                this.f30326Oooo0OO = 0;
                this.f30344OooooOO = false;
                this.f30345OooooOo = false;
                this.f30293OooO0Oo = null;
                this.f30295OooO0o0 = false;
                this.f30294OooO0o = false;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        }
        LinkedHashMap linkedHashMap = this.f30292OooO;
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                for (OooOOOO oooOOOO : (List) ((Map.Entry) it.next()).getValue()) {
                    oooOOOO.f30398OooO0o0 = false;
                    Bitmap bitmap2 = oooOOOO.f30395OooO0OO;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        oooOOOO.f30395OooO0OO = null;
                    }
                }
            }
            this.f30292OooO = null;
        }
        setGestureDetector(getContext());
    }

    public final int OooOo0O() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f30325Oooo0O0 : this.f30321Oooo0;
    }

    public final float OooOoO(float f) {
        PointF pointF = this.f30316OooOoo;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f30315OooOoOO) + pointF.y;
    }

    public final float OooOoO0(float f) {
        PointF pointF = this.f30316OooOoo;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f30315OooOoOO) + pointF.x;
    }

    @NonNull
    public final PointF OooOoOO(float f, float f2, float f3) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.f30351o00O0O == null) {
            this.f30351o00O0O = new OooOOO(0.0f, new PointF(0.0f, 0.0f));
        }
        OooOOO oooOOO = this.f30351o00O0O;
        oooOOO.f30391OooO00o = f3;
        oooOOO.f30392OooO0O0.set(width - (f * f3), height - (f2 * f3));
        OooOO0o(true, this.f30351o00O0O);
        return this.f30351o00O0O.f30392OooO0O0;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    @Nullable
    public final PointF getCenter() {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        PointF pointF = new PointF();
        PointF pointF2 = this.f30316OooOoo;
        if (pointF2 == null) {
            return null;
        }
        float f = width - pointF2.x;
        float f2 = this.f30315OooOoOO;
        pointF.set(f / f2, (height - pointF2.y) / f2);
        return pointF;
    }

    public float getMaxScale() {
        return this.f30300OooOO0o;
    }

    public final float getMinScale() {
        return OooOOOo();
    }

    public final int getOrientation() {
        return this.f30299OooOO0O;
    }

    public final int getSHeight() {
        return this.f30325Oooo0O0;
    }

    public final int getSWidth() {
        return this.f30321Oooo0;
    }

    public final float getScale() {
        return this.f30315OooOoOO;
    }

    @Nullable
    public final ImageViewState getState() {
        if (this.f30316OooOoo == null || this.f30321Oooo0 <= 0 || this.f30325Oooo0O0 <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0151  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height;
        boolean z;
        super.onDraw(canvas);
        if (this.f30348OoooooO == null) {
            Paint paint = new Paint();
            this.f30348OoooooO = paint;
            paint.setAntiAlias(true);
            this.f30348OoooooO.setFilterBitmap(true);
            this.f30348OoooooO.setDither(true);
        }
        Paint paint2 = this.f30349Ooooooo;
        float f = this.f30357oo000o;
        if ((paint2 == null || this.f30356o0OoOo0 == null) && this.f30298OooOO0) {
            Paint paint3 = new Paint();
            this.f30349Ooooooo = paint3;
            paint3.setTextSize((int) (12 * f));
            this.f30349Ooooooo.setColor(-65281);
            this.f30349Ooooooo.setStyle(Paint.Style.FILL);
            Paint paint4 = new Paint();
            this.f30356o0OoOo0 = paint4;
            paint4.setColor(-65281);
            this.f30356o0OoOo0.setStyle(Paint.Style.STROKE);
            this.f30356o0OoOo0.setStrokeWidth((int) (1 * f));
        }
        if (this.f30321Oooo0 == 0 || this.f30325Oooo0O0 == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f30292OooO == null && this.f30332OoooO0 != null) {
            OooOOO0(new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f30306OooOOo0), Math.min(canvas.getMaximumBitmapHeight(), this.f30305OooOOo)));
        }
        if (OooO0oo()) {
            OooOOo();
            OooO0o oooO0o = this.f30343OooooO0;
            if (oooO0o != null && oooO0o.f30377OooO0o != null) {
                if (this.f30319OooOooo == null) {
                    this.f30319OooOooo = new PointF(0.0f, 0.0f);
                }
                this.f30319OooOooo.set(this.f30316OooOoo);
                long jCurrentTimeMillis = System.currentTimeMillis();
                OooO0o oooO0o2 = this.f30343OooooO0;
                long j = jCurrentTimeMillis - oooO0o2.f30383OooOO0o;
                long j2 = oooO0o2.f30380OooO0oo;
                boolean z2 = j > j2;
                long jMin = Math.min(j, j2);
                OooO0o oooO0o3 = this.f30343OooooO0;
                int i = oooO0o3.f30381OooOO0;
                float f2 = oooO0o3.f30373OooO00o;
                this.f30315OooOoOO = OooOO0(i, jMin, f2, oooO0o3.f30374OooO0O0 - f2, oooO0o3.f30380OooO0oo);
                OooO0o oooO0o4 = this.f30343OooooO0;
                int i2 = oooO0o4.f30381OooOO0;
                float f3 = oooO0o4.f30377OooO0o.x;
                float fOooOO0 = OooOO0(i2, jMin, f3, oooO0o4.f30379OooO0oO.x - f3, oooO0o4.f30380OooO0oo);
                OooO0o oooO0o5 = this.f30343OooooO0;
                int i3 = oooO0o5.f30381OooOO0;
                float f4 = oooO0o5.f30377OooO0o.y;
                float fOooOO1 = OooOO0(i3, jMin, f4, oooO0o5.f30379OooO0oO.y - f4, oooO0o5.f30380OooO0oo);
                this.f30316OooOoo.x -= OooOoO0(this.f30343OooooO0.f30376OooO0Oo.x) - fOooOO0;
                this.f30316OooOoo.y -= OooOoO(this.f30343OooooO0.f30376OooO0Oo.y) - fOooOO1;
                if (z2) {
                    z = true;
                } else {
                    OooO0o oooO0o6 = this.f30343OooooO0;
                    if (oooO0o6.f30373OooO00o == oooO0o6.f30374OooO0O0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                OooOO0O(z);
                int i4 = this.f30343OooooO0.f30382OooOO0O;
                OooOOoo(z2);
                if (z2) {
                    this.f30343OooooO0.getClass();
                    this.f30343OooooO0 = null;
                }
                invalidate();
            }
            if (this.f30292OooO == null || !OooOOOO()) {
                Bitmap bitmap = this.f30293OooO0Oo;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = this.f30315OooOoOO;
                    if (this.f30295OooO0o0) {
                        width *= this.f30321Oooo0 / this.f30293OooO0Oo.getWidth();
                        height = this.f30315OooOoOO * (this.f30325Oooo0O0 / this.f30293OooO0Oo.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.f30352o00Oo0 == null) {
                        this.f30352o00Oo0 = new Matrix();
                    }
                    this.f30352o00Oo0.reset();
                    this.f30352o00Oo0.postScale(width, height);
                    this.f30352o00Oo0.postRotate(getRequiredRotation());
                    Matrix matrix = this.f30352o00Oo0;
                    PointF pointF = this.f30316OooOoo;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.f30352o00Oo0;
                        float f5 = this.f30315OooOoOO;
                        matrix2.postTranslate(this.f30321Oooo0 * f5, f5 * this.f30325Oooo0O0);
                    } else if (getRequiredRotation() == 90) {
                        this.f30352o00Oo0.postTranslate(this.f30315OooOoOO * this.f30325Oooo0O0, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.f30352o00Oo0.postTranslate(0.0f, this.f30315OooOoOO * this.f30321Oooo0);
                    }
                    if (this.f30358ooOO != null) {
                        if (this.f30353o00Ooo == null) {
                            this.f30353o00Ooo = new RectF();
                        }
                        this.f30353o00Ooo.set(0.0f, 0.0f, this.f30295OooO0o0 ? this.f30293OooO0Oo.getWidth() : this.f30321Oooo0, this.f30295OooO0o0 ? this.f30293OooO0Oo.getHeight() : this.f30325Oooo0O0);
                        this.f30352o00Oo0.mapRect(this.f30353o00Ooo);
                        canvas.drawRect(this.f30353o00Ooo, this.f30358ooOO);
                    }
                    canvas.drawBitmap(this.f30293OooO0Oo, this.f30352o00Oo0, this.f30348OoooooO);
                }
            } else {
                int iMin = Math.min(this.f30297OooO0oo, OooO0o(this.f30315OooOoOO));
                boolean z3 = false;
                for (Map.Entry entry : this.f30292OooO.entrySet()) {
                    if (((Integer) entry.getKey()).intValue() == iMin) {
                        for (OooOOOO oooOOOO : (List) entry.getValue()) {
                            if (oooOOOO.f30398OooO0o0 && (oooOOOO.f30396OooO0Oo || oooOOOO.f30395OooO0OO == null)) {
                                z3 = true;
                            }
                        }
                    }
                }
                for (Map.Entry entry2 : this.f30292OooO.entrySet()) {
                    if (((Integer) entry2.getKey()).intValue() == iMin || z3) {
                        for (OooOOOO oooOOOO2 : (List) entry2.getValue()) {
                            Rect rect = oooOOOO2.f30393OooO00o;
                            oooOOOO2.f30397OooO0o.set((int) OooOoO0(rect.left), (int) OooOoO(rect.top), (int) OooOoO0(rect.right), (int) OooOoO(rect.bottom));
                            boolean z4 = oooOOOO2.f30396OooO0Oo;
                            if (!z4 && oooOOOO2.f30395OooO0OO != null) {
                                Paint paint5 = this.f30358ooOO;
                                if (paint5 != null) {
                                    canvas.drawRect(oooOOOO2.f30397OooO0o, paint5);
                                }
                                if (this.f30352o00Oo0 == null) {
                                    this.f30352o00Oo0 = new Matrix();
                                }
                                this.f30352o00Oo0.reset();
                                OooOo0o(this.f30354o00o0O, 0.0f, 0.0f, oooOOOO2.f30395OooO0OO.getWidth(), 0.0f, oooOOOO2.f30395OooO0OO.getWidth(), oooOOOO2.f30395OooO0OO.getHeight(), 0.0f, oooOOOO2.f30395OooO0OO.getHeight());
                                if (getRequiredRotation() == 0) {
                                    float[] fArr = this.f30355o00ooo;
                                    Rect rect2 = oooOOOO2.f30397OooO0o;
                                    float f6 = rect2.left;
                                    float f7 = rect2.top;
                                    float f8 = rect2.right;
                                    float f9 = rect2.bottom;
                                    OooOo0o(fArr, f6, f7, f8, f7, f8, f9, f6, f9);
                                } else if (getRequiredRotation() == 90) {
                                    float[] fArr2 = this.f30355o00ooo;
                                    Rect rect3 = oooOOOO2.f30397OooO0o;
                                    float f10 = rect3.right;
                                    float f11 = rect3.top;
                                    float f12 = rect3.bottom;
                                    float f13 = rect3.left;
                                    OooOo0o(fArr2, f10, f11, f10, f12, f13, f12, f13, f11);
                                } else if (getRequiredRotation() == 180) {
                                    float[] fArr3 = this.f30355o00ooo;
                                    Rect rect4 = oooOOOO2.f30397OooO0o;
                                    float f14 = rect4.right;
                                    float f15 = rect4.bottom;
                                    float f16 = rect4.left;
                                    float f17 = rect4.top;
                                    OooOo0o(fArr3, f14, f15, f16, f15, f16, f17, f14, f17);
                                } else if (getRequiredRotation() == 270) {
                                    float[] fArr4 = this.f30355o00ooo;
                                    Rect rect5 = oooOOOO2.f30397OooO0o;
                                    float f18 = rect5.left;
                                    float f19 = rect5.bottom;
                                    float f20 = rect5.top;
                                    float f21 = rect5.right;
                                    OooOo0o(fArr4, f18, f19, f18, f20, f21, f20, f21, f19);
                                }
                                this.f30352o00Oo0.setPolyToPoly(this.f30354o00o0O, 0, this.f30355o00ooo, 0, 4);
                                canvas.drawBitmap(oooOOOO2.f30395OooO0OO, this.f30352o00Oo0, this.f30348OoooooO);
                                if (this.f30298OooOO0) {
                                    canvas.drawRect(oooOOOO2.f30397OooO0o, this.f30356o0OoOo0);
                                }
                            } else if (z4 && this.f30298OooOO0) {
                                Rect rect6 = oooOOOO2.f30397OooO0o;
                                canvas.drawText("LOADING", rect6.left + ((int) (5 * f)), rect6.top + ((int) (35 * f)), this.f30349Ooooooo);
                            }
                            if (oooOOOO2.f30398OooO0o0 && this.f30298OooOO0) {
                                String str = "ISS " + oooOOOO2.f30394OooO0O0 + " RECT " + oooOOOO2.f30393OooO00o.top + "," + oooOOOO2.f30393OooO00o.left + "," + oooOOOO2.f30393OooO00o.bottom + "," + oooOOOO2.f30393OooO00o.right;
                                Rect rect7 = oooOOOO2.f30397OooO0o;
                                canvas.drawText(str, rect7.left + ((int) (5 * f)), rect7.top + ((int) (15 * f)), this.f30349Ooooooo);
                            }
                        }
                    }
                }
            }
            if (this.f30298OooOO0) {
                StringBuilder sb = new StringBuilder("Scale: ");
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.f30315OooOoOO)));
                sb.append(" (");
                sb.append(String.format(locale, "%.2f", Float.valueOf(OooOOOo())));
                sb.append(" - ");
                sb.append(String.format(locale, "%.2f", Float.valueOf(this.f30300OooOO0o)));
                sb.append(")");
                float f22 = (int) (5 * f);
                canvas.drawText(sb.toString(), f22, (int) (15 * f), this.f30349Ooooooo);
                float f23 = (int) (30 * f);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.f30316OooOoo.x)) + CertificateUtil.DELIMITER + String.format(locale, "%.2f", Float.valueOf(this.f30316OooOoo.y)), f22, f23, this.f30349Ooooooo);
                PointF center = getCenter();
                canvas.drawText("Source center: " + String.format(locale, "%.2f", Float.valueOf(center.x)) + CertificateUtil.DELIMITER + String.format(locale, "%.2f", Float.valueOf(center.y)), f22, (int) (45 * f), this.f30349Ooooooo);
                OooO0o oooO0o7 = this.f30343OooooO0;
                if (oooO0o7 != null) {
                    PointF pointFOooOo = OooOo(oooO0o7.f30375OooO0OO);
                    PointF pointFOooOo2 = OooOo(this.f30343OooooO0.f30378OooO0o0);
                    PointF pointFOooOo3 = OooOo(this.f30343OooooO0.f30376OooO0Oo);
                    canvas.drawCircle(pointFOooOo.x, pointFOooOo.y, (int) (10 * f), this.f30356o0OoOo0);
                    this.f30356o0OoOo0.setColor(-65536);
                    canvas.drawCircle(pointFOooOo2.x, pointFOooOo2.y, (int) (20 * f), this.f30356o0OoOo0);
                    this.f30356o0OoOo0.setColor(-16776961);
                    canvas.drawCircle(pointFOooOo3.x, pointFOooOo3.y, (int) (25 * f), this.f30356o0OoOo0);
                    this.f30356o0OoOo0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, f23, this.f30356o0OoOo0);
                }
                if (this.f30350o000oOoO != null) {
                    this.f30356o0OoOo0.setColor(-65536);
                    PointF pointF2 = this.f30350o000oOoO;
                    canvas.drawCircle(pointF2.x, pointF2.y, (int) (20 * f), this.f30356o0OoOo0);
                }
                if (this.f30341Ooooo00 != null) {
                    this.f30356o0OoOo0.setColor(-16776961);
                    canvas.drawCircle(OooOoO0(this.f30341Ooooo00.x), OooOoO(this.f30341Ooooo00.y), (int) (35 * f), this.f30356o0OoOo0);
                }
                if (this.f30342Ooooo0o != null && this.f30329Oooo0oO) {
                    this.f30356o0OoOo0.setColor(-16711681);
                    PointF pointF3 = this.f30342Ooooo0o;
                    canvas.drawCircle(pointF3.x, pointF3.y, f23, this.f30356o0OoOo0);
                }
                this.f30356o0OoOo0.setColor(-65281);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        if (this.f30321Oooo0 > 0 && this.f30325Oooo0O0 > 0) {
            if (z && z2) {
                size = OooOo0O();
                size2 = OooOo0();
            } else if (z2) {
                size2 = (int) ((((double) OooOo0()) / ((double) OooOo0O())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) OooOo0O()) / ((double) OooOo0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        PointF center = getCenter();
        if (!this.f30344OooooOO || center == null) {
            return;
        }
        this.f30343OooooO0 = null;
        this.f30322Oooo000 = Float.valueOf(this.f30315OooOoOO);
        this.f30323Oooo00O = center;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0425  */
    /* JADX WARN: Code duplicated, block: B:176:0x042b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0480 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0482  */
    /* JADX WARN: Code duplicated, block: B:199:0x0492  */
    /* JADX WARN: Code duplicated, block: B:202:0x049f  */
    /* JADX WARN: Code duplicated, block: B:204:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:205:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f3  */
    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        boolean z2;
        boolean z3;
        GestureDetector gestureDetector;
        OooO0o oooO0o = this.f30343OooooO0;
        if (oooO0o != null && !oooO0o.f30372OooO) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        this.f30343OooooO0 = null;
        if (this.f30316OooOoo == null) {
            GestureDetector gestureDetector2 = this.f30333OoooO00;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.f30329Oooo0oO && ((gestureDetector = this.f30320Oooo) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.f30328Oooo0o0 = false;
            this.f30327Oooo0o = false;
            this.f30330Oooo0oo = 0;
            return true;
        }
        float f = 0.0f;
        if (this.f30318OooOooO == null) {
            this.f30318OooOooO = new PointF(0.0f, 0.0f);
        }
        if (this.f30319OooOooo == null) {
            this.f30319OooOooo = new PointF(0.0f, 0.0f);
        }
        if (this.f30350o000oOoO == null) {
            this.f30350o000oOoO = new PointF(0.0f, 0.0f);
        }
        this.f30319OooOooo.set(this.f30316OooOoo);
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        Handler handler = this.f30346Oooooo;
        if (action == 0) {
            this.f30343OooooO0 = null;
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f30330Oooo0oo = Math.max(this.f30330Oooo0oo, pointerCount);
            if (pointerCount >= 2) {
                if (this.f30311OooOo0O) {
                    float x = motionEvent.getX(0) - motionEvent.getX(1);
                    float y = motionEvent.getY(0) - motionEvent.getY(1);
                    float fSqrt = (float) Math.sqrt((y * y) + (x * x));
                    this.f30317OooOoo0 = this.f30315OooOoOO;
                    this.f30336OoooOOO = fSqrt;
                    PointF pointF = this.f30318OooOooO;
                    PointF pointF2 = this.f30316OooOoo;
                    pointF.set(pointF2.x, pointF2.y);
                    this.f30350o000oOoO.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                } else {
                    this.f30330Oooo0oo = 0;
                }
                handler.removeMessages(1);
            } else if (!this.f30329Oooo0oO) {
                PointF pointF3 = this.f30318OooOooO;
                PointF pointF4 = this.f30316OooOoo;
                pointF3.set(pointF4.x, pointF4.y);
                this.f30350o000oOoO.set(motionEvent.getX(), motionEvent.getY());
                handler.sendEmptyMessageDelayed(1, 600L);
            }
            z = true;
        } else if (action == 1) {
            handler.removeMessages(1);
            if (this.f30329Oooo0oO) {
                this.f30329Oooo0oO = false;
                if (!this.f30339OoooOoO) {
                    OooO(this.f30341Ooooo00, this.f30350o000oOoO);
                }
            }
            if (this.f30330Oooo0oo <= 0 && ((z2 = this.f30328Oooo0o0) || this.f30327Oooo0o)) {
                if (z2 && pointerCount == 2) {
                    this.f30327Oooo0o = true;
                    PointF pointF5 = this.f30318OooOooO;
                    PointF pointF6 = this.f30316OooOoo;
                    pointF5.set(pointF6.x, pointF6.y);
                    if (motionEvent.getActionIndex() == 1) {
                        this.f30350o000oOoO.set(motionEvent.getX(0), motionEvent.getY(0));
                    } else {
                        this.f30350o000oOoO.set(motionEvent.getX(1), motionEvent.getY(1));
                    }
                }
                if (pointerCount < 3) {
                    this.f30328Oooo0o0 = false;
                }
                if (pointerCount < 2) {
                    this.f30327Oooo0o = false;
                    this.f30330Oooo0oo = 0;
                }
                OooOOoo(true);
            } else if (pointerCount == 1) {
                this.f30328Oooo0o0 = false;
                this.f30327Oooo0o = false;
                this.f30330Oooo0oo = 0;
            }
            z = true;
        } else {
            if (action != 2) {
                if (action != 5) {
                    if (action != 6) {
                        if (action != 261) {
                            if (action != 262) {
                            }
                        }
                        z = true;
                    }
                    handler.removeMessages(1);
                    if (this.f30329Oooo0oO) {
                        this.f30329Oooo0oO = false;
                        if (!this.f30339OoooOoO) {
                            OooO(this.f30341Ooooo00, this.f30350o000oOoO);
                        }
                    }
                    if (this.f30330Oooo0oo <= 0) {
                        if (pointerCount == 1) {
                            this.f30328Oooo0o0 = false;
                            this.f30327Oooo0o = false;
                            this.f30330Oooo0oo = 0;
                        }
                    } else if (pointerCount == 1) {
                        this.f30328Oooo0o0 = false;
                        this.f30327Oooo0o = false;
                        this.f30330Oooo0oo = 0;
                    }
                    z = true;
                }
                this.f30343OooooO0 = null;
                parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f30330Oooo0oo = Math.max(this.f30330Oooo0oo, pointerCount);
                if (pointerCount >= 2) {
                    if (this.f30311OooOo0O) {
                        float x2 = motionEvent.getX(0) - motionEvent.getX(1);
                        float y2 = motionEvent.getY(0) - motionEvent.getY(1);
                        float fSqrt2 = (float) Math.sqrt((y2 * y2) + (x2 * x2));
                        this.f30317OooOoo0 = this.f30315OooOoOO;
                        this.f30336OoooOOO = fSqrt2;
                        PointF pointF7 = this.f30318OooOooO;
                        PointF pointF8 = this.f30316OooOoo;
                        pointF7.set(pointF8.x, pointF8.y);
                        this.f30350o000oOoO.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                    } else {
                        this.f30330Oooo0oo = 0;
                    }
                    handler.removeMessages(1);
                } else if (!this.f30329Oooo0oO) {
                    PointF pointF9 = this.f30318OooOooO;
                    PointF pointF10 = this.f30316OooOoo;
                    pointF9.set(pointF10.x, pointF10.y);
                    this.f30350o000oOoO.set(motionEvent.getX(), motionEvent.getY());
                    handler.sendEmptyMessageDelayed(1, 600L);
                }
                z = true;
            } else {
                if (this.f30330Oooo0oo <= 0) {
                    z3 = false;
                } else if (pointerCount >= 2) {
                    float x3 = motionEvent.getX(0) - motionEvent.getX(1);
                    float y3 = motionEvent.getY(0) - motionEvent.getY(1);
                    float fSqrt3 = (float) Math.sqrt((y3 * y3) + (x3 * x3));
                    float x4 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    float y4 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    if (this.f30311OooOo0O) {
                        PointF pointF11 = this.f30350o000oOoO;
                        float f2 = pointF11.x - x4;
                        float f3 = pointF11.y - y4;
                        if (((float) Math.sqrt((f3 * f3) + (f2 * f2))) > 5.0f || Math.abs(fSqrt3 - this.f30336OoooOOO) > 5.0f || this.f30327Oooo0o) {
                            this.f30328Oooo0o0 = true;
                            this.f30327Oooo0o = true;
                            double d = this.f30315OooOoOO;
                            float fMin = Math.min(this.f30300OooOO0o, (fSqrt3 / this.f30336OoooOOO) * this.f30317OooOoo0);
                            this.f30315OooOoOO = fMin;
                            if (fMin <= OooOOOo()) {
                                this.f30336OoooOOO = fSqrt3;
                                this.f30317OooOoo0 = OooOOOo();
                                this.f30350o000oOoO.set(x4, y4);
                                this.f30318OooOooO.set(this.f30316OooOoo);
                            } else if (this.f30309OooOo0) {
                                PointF pointF12 = this.f30350o000oOoO;
                                float f4 = pointF12.x;
                                PointF pointF13 = this.f30318OooOooO;
                                float f5 = f4 - pointF13.x;
                                float f6 = pointF12.y - pointF13.y;
                                float f7 = this.f30315OooOoOO / this.f30317OooOoo0;
                                float f8 = f5 * f7;
                                float f9 = f7 * f6;
                                PointF pointF14 = this.f30316OooOoo;
                                pointF14.x = x4 - f8;
                                pointF14.y = y4 - f9;
                                if ((((double) OooOo0()) * d < getHeight() && this.f30315OooOoOO * OooOo0() >= getHeight()) || (d * ((double) OooOo0O()) < getWidth() && this.f30315OooOoOO * OooOo0O() >= getWidth())) {
                                    OooOO0O(true);
                                    this.f30350o000oOoO.set(x4, y4);
                                    this.f30318OooOooO.set(this.f30316OooOoo);
                                    this.f30317OooOoo0 = this.f30315OooOoOO;
                                    this.f30336OoooOOO = fSqrt3;
                                }
                            } else if (this.f30324Oooo00o != null) {
                                this.f30316OooOoo.x = (getWidth() / 2) - (this.f30315OooOoOO * this.f30324Oooo00o.x);
                                this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * this.f30324Oooo00o.y);
                            } else {
                                this.f30316OooOoo.x = (getWidth() / 2) - (this.f30315OooOoOO * (OooOo0O() / 2));
                                this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * (OooOo0() / 2));
                            }
                            OooOO0O(true);
                            OooOOoo(this.f30310OooOo00);
                            z3 = true;
                        }
                    }
                    z3 = false;
                } else {
                    if (this.f30329Oooo0oO) {
                        float fAbs = (Math.abs(this.f30342Ooooo0o.y - motionEvent.getY()) * 2.0f) + this.f30337OoooOOo;
                        if (this.f30338OoooOo0 == -1.0f) {
                            this.f30338OoooOo0 = fAbs;
                        }
                        float y5 = motionEvent.getY();
                        PointF pointF15 = this.f30340OoooOoo;
                        boolean z4 = y5 > pointF15.y;
                        pointF15.set(0.0f, motionEvent.getY());
                        float f10 = 1.0f;
                        float fAbs2 = Math.abs(1.0f - (fAbs / this.f30338OoooOo0)) * 0.5f;
                        if (fAbs2 > 0.03f || this.f30339OoooOoO) {
                            this.f30339OoooOoO = true;
                            if (this.f30338OoooOo0 > 0.0f) {
                                f10 = z4 ? 1.0f + fAbs2 : 1.0f - fAbs2;
                            }
                            double d2 = this.f30315OooOoOO;
                            float fMax = Math.max(OooOOOo(), Math.min(this.f30300OooOO0o, this.f30315OooOoOO * f10));
                            this.f30315OooOoOO = fMax;
                            if (this.f30309OooOo0) {
                                PointF pointF16 = this.f30350o000oOoO;
                                float f11 = pointF16.x;
                                PointF pointF17 = this.f30318OooOooO;
                                float f12 = f11 - pointF17.x;
                                float f13 = pointF16.y;
                                float f14 = f13 - pointF17.y;
                                float f15 = fMax / this.f30317OooOoo0;
                                float f16 = f12 * f15;
                                float f17 = f15 * f14;
                                PointF pointF18 = this.f30316OooOoo;
                                pointF18.x = f11 - f16;
                                pointF18.y = f13 - f17;
                                if ((((double) OooOo0()) * d2 < getHeight() && this.f30315OooOoOO * OooOo0() >= getHeight()) || (d2 * ((double) OooOo0O()) < getWidth() && this.f30315OooOoOO * OooOo0O() >= getWidth())) {
                                    OooOO0O(true);
                                    this.f30350o000oOoO.set(OooOo(this.f30341Ooooo00));
                                    this.f30318OooOooO.set(this.f30316OooOoo);
                                    this.f30317OooOoo0 = this.f30315OooOoOO;
                                }
                            } else if (this.f30324Oooo00o != null) {
                                this.f30316OooOoo.x = (getWidth() / 2) - (this.f30315OooOoOO * this.f30324Oooo00o.x);
                                this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * this.f30324Oooo00o.y);
                            } else {
                                this.f30316OooOoo.x = (getWidth() / 2) - (this.f30315OooOoOO * (OooOo0O() / 2));
                                this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * (OooOo0() / 2));
                            }
                            f = fAbs;
                        } else {
                            f = fAbs;
                        }
                        this.f30338OoooOo0 = f;
                        OooOO0O(true);
                        OooOOoo(this.f30310OooOo00);
                    } else {
                        if (!this.f30328Oooo0o0) {
                            float fAbs3 = Math.abs(motionEvent.getX() - this.f30350o000oOoO.x);
                            float fAbs4 = Math.abs(motionEvent.getY() - this.f30350o000oOoO.y);
                            float f18 = this.f30357oo000o * 5.0f;
                            if (fAbs3 > f18 || fAbs4 > f18 || this.f30327Oooo0o) {
                                this.f30316OooOoo.x = (motionEvent.getX() - this.f30350o000oOoO.x) + this.f30318OooOooO.x;
                                this.f30316OooOoo.y = (motionEvent.getY() - this.f30350o000oOoO.y) + this.f30318OooOooO.y;
                                PointF pointF19 = this.f30316OooOoo;
                                float f19 = pointF19.x;
                                float f20 = pointF19.y;
                                OooOO0O(true);
                                PointF pointF20 = this.f30316OooOoo;
                                boolean z5 = f19 != pointF20.x;
                                float f21 = pointF20.y;
                                boolean z6 = f20 != f21;
                                boolean z7 = z5 && fAbs3 > fAbs4 && !this.f30327Oooo0o;
                                boolean z8 = z6 && fAbs4 > fAbs3 && !this.f30327Oooo0o;
                                boolean z9 = f20 == f21 && fAbs4 > 3.0f * f18;
                                if (!z7 && !z8 && (!z5 || !z6 || z9 || this.f30327Oooo0o)) {
                                    this.f30327Oooo0o = true;
                                } else if (fAbs3 > f18 || fAbs4 > f18) {
                                    this.f30330Oooo0oo = 0;
                                    handler.removeMessages(1);
                                    ViewParent parent3 = getParent();
                                    if (parent3 != null) {
                                        parent3.requestDisallowInterceptTouchEvent(false);
                                    }
                                }
                                if (!this.f30309OooOo0) {
                                    PointF pointF21 = this.f30316OooOoo;
                                    PointF pointF22 = this.f30318OooOooO;
                                    pointF21.x = pointF22.x;
                                    pointF21.y = pointF22.y;
                                    ViewParent parent4 = getParent();
                                    if (parent4 != null) {
                                        parent4.requestDisallowInterceptTouchEvent(false);
                                    }
                                }
                                OooOOoo(this.f30310OooOo00);
                            }
                        }
                        z3 = false;
                    }
                    z3 = true;
                }
                if (z3) {
                    handler.removeMessages(1);
                    invalidate();
                    z = true;
                }
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends o0O0o000> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f30331OoooO = new o0O0OOOo(cls);
    }

    public final void setBitmapDecoderFactory(@NonNull oo0OOoo<? extends o0O0o000> oo0oooo) {
        if (oo0oooo == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f30331OoooO = oo0oooo;
    }

    public final void setDebug(boolean z) {
        this.f30298OooOO0 = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f30313OooOoO = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f30308OooOo = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (!f30286o00oO0O.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid zoom style: ", i));
        }
        this.f30314OooOoO0 = i;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f30310OooOo00 = z;
    }

    public void setExecutor(@NonNull Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.f30307OooOOoo = executor;
    }

    public final void setImage(@NonNull oO0O0Oo0 oo0o0oo0) {
        Integer num;
        if (oo0o0oo0 == null) {
            throw new NullPointerException("imageSource must not be null");
        }
        OooOo00(true);
        Bitmap bitmap = oo0o0oo0.f56157OooO0O0;
        if (bitmap != null) {
            OooOOo0(bitmap, 0, oo0o0oo0.f56160OooO0o0);
            return;
        }
        Uri uri = oo0o0oo0.f56156OooO00o;
        this.f30296OooO0oO = uri;
        if (uri == null && (num = oo0o0oo0.f56158OooO0OO) != null) {
            this.f30296OooO0oO = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + num);
        }
        if (oo0o0oo0.f56159OooO0Oo) {
            new OooOo(this, getContext(), this.f30335OoooOO0, this.f30296OooO0oO).executeOnExecutor(this.f30307OooOOoo, new Void[0]);
        } else {
            new OooOO0(this, getContext(), this.f30331OoooO, this.f30296OooO0oO, false).executeOnExecutor(this.f30307OooOOoo, new Void[0]);
        }
    }

    public final void setMaxScale(float f) {
        this.f30300OooOO0o = f;
    }

    public void setMaxTileSize(int i) {
        this.f30306OooOOo0 = i;
        this.f30305OooOOo = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.f30302OooOOO0 = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!f30291o0ooOoO.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid scale type: ", i));
        }
        this.f30304OooOOOo = i;
        if (this.f30344OooooOO) {
            OooOO0O(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f30301OooOOO = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (this.f30344OooooOO) {
            OooOo00(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(OooOO0O oooOO0O) {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f30347Oooooo0 = onLongClickListener;
    }

    public void setOnStateChangedListener(OooOOO0 oooOOO0) {
    }

    public final void setOrientation(int i) {
        if (!f30287o00oO0o.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid orientation: ", i));
        }
        this.f30299OooOO0O = i;
        OooOo00(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f30309OooOo0 = z;
        if (z || (pointF = this.f30316OooOoo) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f30315OooOoOO * (OooOo0O() / 2));
        this.f30316OooOoo.y = (getHeight() / 2) - (this.f30315OooOoOO * (OooOo0() / 2));
        if (this.f30344OooooOO) {
            OooOOoo(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!f30290o0ooOOo.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid pan limit: ", i));
        }
        this.f30303OooOOOO = i;
        if (this.f30344OooooOO) {
            OooOO0O(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f30312OooOo0o = z;
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends o0O0o00O> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f30335OoooOO0 = new o0O0OOOo(cls);
    }

    public final void setRegionDecoderFactory(@NonNull oo0OOoo<? extends o0O0o00O> oo0oooo) {
        if (oo0oooo == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f30335OoooOO0 = oo0oooo;
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f30358ooOO = null;
        } else {
            Paint paint = new Paint();
            this.f30358ooOO = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f30358ooOO.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f30311OooOo0O = z;
    }

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f30360OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f30361OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PointF f30362OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f30363OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f30364OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f30365OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f30366OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f30367OooO0oo;

        public OooO(PointF pointF) {
            this.f30363OooO0Oo = 500L;
            this.f30365OooO0o0 = 2;
            this.f30364OooO0o = 1;
            this.f30366OooO0oO = true;
            this.f30367OooO0oo = true;
            this.f30360OooO00o = SubsamplingScaleImageView.this.f30315OooOoOO;
            this.f30361OooO0O0 = pointF;
            this.f30362OooO0OO = null;
        }

        public final void OooO00o() {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            OooO0o oooO0o = subsamplingScaleImageView.f30343OooooO0;
            int width = (((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2) + subsamplingScaleImageView.getPaddingLeft();
            int height = (((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2) + subsamplingScaleImageView.getPaddingTop();
            float fMin = Math.min(subsamplingScaleImageView.f30300OooOO0o, Math.max(subsamplingScaleImageView.OooOOOo(), this.f30360OooO00o));
            boolean z = this.f30367OooO0oo;
            PointF pointF = this.f30361OooO0O0;
            if (z) {
                float f = pointF.x;
                float f2 = pointF.y;
                PointF pointF2 = new PointF();
                PointF pointFOooOoOO = subsamplingScaleImageView.OooOoOO(f, f2, fMin);
                pointF2.set((((((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2) + subsamplingScaleImageView.getPaddingLeft()) - pointFOooOoOO.x) / fMin, (((((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2) + subsamplingScaleImageView.getPaddingTop()) - pointFOooOoOO.y) / fMin);
                pointF = pointF2;
            }
            OooO0o oooO0o2 = new OooO0o();
            subsamplingScaleImageView.f30343OooooO0 = oooO0o2;
            oooO0o2.f30373OooO00o = subsamplingScaleImageView.f30315OooOoOO;
            oooO0o2.f30374OooO0O0 = fMin;
            oooO0o2.f30383OooOO0o = System.currentTimeMillis();
            OooO0o oooO0o3 = subsamplingScaleImageView.f30343OooooO0;
            oooO0o3.f30378OooO0o0 = pointF;
            oooO0o3.f30375OooO0OO = subsamplingScaleImageView.getCenter();
            OooO0o oooO0o4 = subsamplingScaleImageView.f30343OooooO0;
            oooO0o4.f30376OooO0Oo = pointF;
            oooO0o4.f30377OooO0o = subsamplingScaleImageView.OooOo(pointF);
            subsamplingScaleImageView.f30343OooooO0.f30379OooO0oO = new PointF(width, height);
            OooO0o oooO0o5 = subsamplingScaleImageView.f30343OooooO0;
            oooO0o5.f30380OooO0oo = this.f30363OooO0Oo;
            oooO0o5.f30372OooO = this.f30366OooO0oO;
            oooO0o5.f30381OooOO0 = this.f30365OooO0o0;
            oooO0o5.f30382OooOO0O = this.f30364OooO0o;
            oooO0o5.f30383OooOO0o = System.currentTimeMillis();
            subsamplingScaleImageView.f30343OooooO0.getClass();
            PointF pointF3 = this.f30362OooO0OO;
            if (pointF3 != null) {
                float f3 = pointF3.x;
                PointF pointF4 = subsamplingScaleImageView.f30343OooooO0.f30375OooO0OO;
                float f4 = f3 - (pointF4.x * fMin);
                float f5 = pointF3.y - (pointF4.y * fMin);
                PointF pointF5 = new PointF(f4, f5);
                subsamplingScaleImageView.OooOO0o(true, new OooOOO(fMin, pointF5));
                subsamplingScaleImageView.f30343OooooO0.f30379OooO0oO = new PointF((pointF5.x - f4) + pointF3.x, (pointF5.y - f5) + pointF3.y);
            }
            subsamplingScaleImageView.invalidate();
        }

        public OooO(float f, PointF pointF) {
            this.f30363OooO0Oo = 500L;
            this.f30365OooO0o0 = 2;
            this.f30364OooO0o = 1;
            this.f30366OooO0oO = true;
            this.f30367OooO0oo = true;
            this.f30360OooO00o = f;
            this.f30361OooO0O0 = pointF;
            this.f30362OooO0OO = null;
        }

        public OooO(float f, PointF pointF, PointF pointF2) {
            this.f30363OooO0Oo = 500L;
            this.f30365OooO0o0 = 2;
            this.f30364OooO0o = 1;
            this.f30366OooO0oO = true;
            this.f30367OooO0oo = true;
            this.f30360OooO00o = f;
            this.f30361OooO0O0 = pointF;
            this.f30362OooO0OO = pointF2;
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
