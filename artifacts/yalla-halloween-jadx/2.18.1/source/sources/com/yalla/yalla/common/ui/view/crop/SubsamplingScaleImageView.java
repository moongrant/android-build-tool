package com.yalla.yalla.common.ui.view.crop;

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
import com.umeng.analytics.pro.bl;
import com.yalla.yalla.common.ui.view.crop.decoder.SkiaImageDecoder;
import com.yalla.yalla.common.ui.view.crop.decoder.SkiaImageRegionDecoder;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p444o0OoOo0O.o0O0OO0;
import p511o0o00ooO.o00O00;
import p511o0o00ooO.o00O000;
import p511o0o00ooO.o00O000o;
import p511o0o00ooO.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public class SubsamplingScaleImageView extends View {

    /* JADX INFO: renamed from: o0000oO0, reason: collision with root package name */
    public static Bitmap.Config f21066o0000oO0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Uri f21067Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Bitmap f21068Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f21069Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f21070Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f21071OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Map<Integer, List<OooOo00>> f21072OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f21073OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f21074OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f21075OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f21076OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f21077OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f21078OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f21079OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f21080OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Executor f21081Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f21082Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f21083OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f21084OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f21085OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f21086Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f21087Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f21088OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f21089Ooooooo;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public OooOOO0 f21090o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final float f21091o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public o00O000<? extends o00O00> f21092o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public PointF f21093o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public float f21094o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public boolean f21095o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public float f21096o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public PointF f21097o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public PointF f21098o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public PointF f21099o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public boolean f21100o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public boolean f21101o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public Paint f21102o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public Paint f21103o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public OooOOO f21104o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public Paint f21105o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public Matrix f21106o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public OooOOOO f21107o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public RectF f21108o0000OOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public final float[] f21109o0000OOo;

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public final float f21110o0000Oo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public final float[] f21111o0000Oo0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public OooO0o f21112o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public final Handler f21113o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public View.OnLongClickListener f21114o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public Paint f21115o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public o00O000<? extends o00O000o> f21116o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f21117o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public PointF f21118o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public PointF f21119o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public Float f21120o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public PointF f21121o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public int f21122o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f21123o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public PointF f21124o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public final ReentrantReadWriteLock f21125o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public GestureDetector f21126o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f21127o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public GestureDetector f21128o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public float f21129o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f21130o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f21131o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f21132o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f21133oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public o00O00 f21134oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public PointF f21135ooOO;

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public static final List<Integer> f21061o0000OoO = Arrays.asList(0, 90, 180, 270, -1);

    /* JADX INFO: renamed from: o0000o0, reason: collision with root package name */
    public static final List<Integer> f21063o0000o0 = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public static final List<Integer> f21064o0000o0O = Arrays.asList(2, 1);

    /* JADX INFO: renamed from: o0000o0o, reason: collision with root package name */
    public static final List<Integer> f21065o0000o0o = Arrays.asList(1, 2, 3);

    /* JADX INFO: renamed from: o0000o, reason: collision with root package name */
    public static final List<Integer> f21062o0000o = Arrays.asList(2, 1, 3, 4);

    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            SubsamplingScaleImageView subsamplingScaleImageView;
            View.OnLongClickListener onLongClickListener;
            if (message.what == 1 && (onLongClickListener = (subsamplingScaleImageView = SubsamplingScaleImageView.this).f21114o0000oo) != null) {
                subsamplingScaleImageView.f21127o0OOO0o = 0;
                SubsamplingScaleImageView.super.setOnLongClickListener(onLongClickListener);
                SubsamplingScaleImageView.this.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Context f21146OooO00o;

        public OooO0O0(Context context) {
            this.f21146OooO00o = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f21084OooooOO || !subsamplingScaleImageView.f21100o00000oO || subsamplingScaleImageView.f21135ooOO == null) {
                return onDoubleTapEvent(motionEvent);
            }
            subsamplingScaleImageView.setGestureDetector(this.f21146OooO00o);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView2.f21085OooooOo) {
                subsamplingScaleImageView2.OooOO0(subsamplingScaleImageView2.Oooo00O(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            subsamplingScaleImageView2.f21093o000000O = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            PointF pointF = SubsamplingScaleImageView.this.f21135ooOO;
            subsamplingScaleImageView3.f21118o00O0O = new PointF(pointF.x, pointF.y);
            SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView4.f21129o0OoOo0 = subsamplingScaleImageView4.f21089Ooooooo;
            subsamplingScaleImageView4.f21132o0ooOoO = true;
            subsamplingScaleImageView4.f21130o0ooOO0 = true;
            subsamplingScaleImageView4.f21096o00000O0 = -1.0f;
            subsamplingScaleImageView4.f21098o00000Oo = subsamplingScaleImageView4.Oooo00O(subsamplingScaleImageView4.f21093o000000O);
            SubsamplingScaleImageView.this.f21099o00000o0 = new PointF(motionEvent.getX(), motionEvent.getY());
            SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
            PointF pointF2 = SubsamplingScaleImageView.this.f21098o00000Oo;
            subsamplingScaleImageView5.f21097o00000OO = new PointF(pointF2.x, pointF2.y);
            SubsamplingScaleImageView.this.f21095o00000O = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.f21083OooooO0 || !subsamplingScaleImageView.f21100o00000oO || subsamplingScaleImageView.f21135ooOO == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.f21130o0ooOO0))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = SubsamplingScaleImageView.this.f21135ooOO;
            PointF pointF2 = new PointF((f * 0.25f) + pointF.x, (f2 * 0.25f) + pointF.y);
            float width = (SubsamplingScaleImageView.this.getWidth() / 2) - pointF2.x;
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            float f3 = width / subsamplingScaleImageView2.f21089Ooooooo;
            float height = (subsamplingScaleImageView2.getHeight() / 2) - pointF2.y;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            OooO oooO = subsamplingScaleImageView3.new OooO(new PointF(f3, height / subsamplingScaleImageView3.f21089Ooooooo));
            if (!SubsamplingScaleImageView.f21064o0000o0O.contains(1)) {
                throw new IllegalArgumentException("Unknown easing type: 1");
            }
            oooO.f21142OooO0o0 = 1;
            oooO.f21144OooO0oo = false;
            oooO.f21141OooO0o = 3;
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
        public float f21150OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f21151OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public PointF f21152OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PointF f21153OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PointF f21154OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public PointF f21155OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public PointF f21156OooO0oO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public OooOO0O f21161OooOOO0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f21157OooO0oo = 500;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f21149OooO = true;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f21158OooOO0 = 2;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f21159OooOO0O = 1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f21160OooOO0o = System.currentTimeMillis();
    }

    public static class OooOO0 extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f21162OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<Context> f21163OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<o00O000<? extends o00O000o>> f21164OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f21165OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f21166OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f21167OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Exception f21168OooO0oO;

        public OooOO0(SubsamplingScaleImageView subsamplingScaleImageView, Context context, o00O000<? extends o00O000o> o00o001, Uri uri, boolean z) {
            this.f21162OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f21163OooO0O0 = new WeakReference<>(context);
            this.f21164OooO0OO = new WeakReference<>(o00o001);
            this.f21165OooO0Oo = uri;
            this.f21167OooO0o0 = z;
        }

        @Override // android.os.AsyncTask
        public final Integer doInBackground(Void[] voidArr) {
            try {
                String string = this.f21165OooO0Oo.toString();
                Context context = this.f21163OooO0O0.get();
                o00O000<? extends o00O000o> o00o001 = this.f21164OooO0OO.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f21162OooO00o.get();
                if (context != null && o00o001 != null && subsamplingScaleImageView != null) {
                    List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                    this.f21166OooO0o = o00o001.OooO00o().OooO00o(context, this.f21165OooO0Oo);
                    return Integer.valueOf(SubsamplingScaleImageView.OooO0Oo(subsamplingScaleImageView, context, string));
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f21061o0000OoO;
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap", e);
                this.f21168OooO0oO = e;
            } catch (OutOfMemoryError e2) {
                List<Integer> list3 = SubsamplingScaleImageView.f21061o0000OoO;
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap - OutOfMemoryError", e2);
                this.f21168OooO0oO = new RuntimeException(e2);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Integer num) {
            OooOOO0 oooOOO0;
            Integer num2 = num;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f21162OooO00o.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f21166OooO0o;
                if (bitmap == null || num2 == null) {
                    if (this.f21168OooO0oO == null || (oooOOO0 = subsamplingScaleImageView.f21090o0000) == null) {
                        return;
                    }
                    if (this.f21167OooO0o0) {
                        oooOOO0.OooO0o();
                        return;
                    } else {
                        oooOOO0.OooO0o0();
                        return;
                    }
                }
                if (this.f21167OooO0o0) {
                    List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                    subsamplingScaleImageView.OooOOoo(bitmap);
                } else {
                    int iIntValue = num2.intValue();
                    List<Integer> list2 = SubsamplingScaleImageView.f21061o0000OoO;
                    subsamplingScaleImageView.OooOOo(bitmap, iIntValue, false);
                }
            }
        }
    }

    public interface OooOO0O {
        void OooO00o();

        void OooO0O0();

        void onComplete();
    }

    public interface OooOOO {
        void OooO00o();

        void OooO0O0();
    }

    public interface OooOOO0 {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();

        void OooO0o();

        void OooO0o0();
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f21169OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f21170OooO0O0;

        public OooOOOO(float f, PointF pointF) {
            this.f21169OooO00o = f;
            this.f21170OooO0O0 = pointF;
        }
    }

    public static class OooOo extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f21171OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<o00O00> f21172OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<OooOo00> f21173OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Exception f21174OooO0Oo;

        public OooOo(SubsamplingScaleImageView subsamplingScaleImageView, o00O00 o00o01, OooOo00 oooOo00) {
            this.f21171OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f21172OooO0O0 = new WeakReference<>(o00o01);
            this.f21173OooO0OO = new WeakReference<>(oooOo00);
            oooOo00.f21178OooO0Oo = true;
        }

        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(Void[] voidArr) {
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = this.f21171OooO00o.get();
                o00O00 o00o01 = this.f21172OooO0O0.get();
                OooOo00 oooOo00 = this.f21173OooO0OO.get();
                if (o00o01 != null && oooOo00 != null && subsamplingScaleImageView != null && o00o01.OooO0O0() && oooOo00.f21180OooO0o0) {
                    List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                    subsamplingScaleImageView.f21125o0O0O00.readLock().lock();
                    try {
                        if (o00o01.OooO0O0()) {
                            SubsamplingScaleImageView.OooO0o0(subsamplingScaleImageView, oooOo00.f21175OooO00o, oooOo00.f21181OooO0oO);
                            return o00o01.OooO0Oo(oooOo00.f21181OooO0oO, oooOo00.f21176OooO0O0);
                        }
                        oooOo00.f21178OooO0Oo = false;
                    } finally {
                        subsamplingScaleImageView.f21125o0O0O00.readLock().unlock();
                    }
                } else if (oooOo00 != null) {
                    oooOo00.f21178OooO0Oo = false;
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f21061o0000OoO;
                Log.e("SubsamplingScaleImageView", "Failed to decode tile", e);
                this.f21174OooO0Oo = e;
            } catch (OutOfMemoryError e2) {
                List<Integer> list3 = SubsamplingScaleImageView.f21061o0000OoO;
                Log.e("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", e2);
                this.f21174OooO0Oo = new RuntimeException(e2);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            OooOOO0 oooOOO0;
            Bitmap bitmap2;
            Bitmap bitmap3 = bitmap;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f21171OooO00o.get();
            OooOo00 oooOo00 = this.f21173OooO0OO.get();
            if (subsamplingScaleImageView == null || oooOo00 == null) {
                return;
            }
            if (bitmap3 == null) {
                if (this.f21174OooO0Oo == null || (oooOOO0 = subsamplingScaleImageView.f21090o0000) == null) {
                    return;
                }
                oooOOO0.OooO0OO();
                return;
            }
            oooOo00.f21177OooO0OO = bitmap3;
            oooOo00.f21178OooO0Oo = false;
            List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
            synchronized (subsamplingScaleImageView) {
                subsamplingScaleImageView.OooO0oo();
                subsamplingScaleImageView.OooO0oO();
                if (subsamplingScaleImageView.OooOOOo() && (bitmap2 = subsamplingScaleImageView.f21068Oooo0o) != null) {
                    if (!subsamplingScaleImageView.f21070Oooo0oo) {
                        bitmap2.recycle();
                    }
                    subsamplingScaleImageView.f21068Oooo0o = null;
                    OooOOO0 oooOOO1 = subsamplingScaleImageView.f21090o0000;
                    if (oooOOO1 != null && subsamplingScaleImageView.f21070Oooo0oo) {
                        oooOOO1.OooO00o();
                    }
                    subsamplingScaleImageView.f21069Oooo0oO = false;
                    subsamplingScaleImageView.f21070Oooo0oo = false;
                }
                subsamplingScaleImageView.invalidate();
            }
        }
    }

    public static class OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Rect f21175OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f21176OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Bitmap f21177OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f21178OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Rect f21179OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f21180OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Rect f21181OooO0oO;
    }

    public static class Oooo000 extends AsyncTask<Void, Void, int[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<SubsamplingScaleImageView> f21182OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference<Context> f21183OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<o00O000<? extends o00O00>> f21184OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f21185OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Exception f21186OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o00O00 f21187OooO0o0;

        public Oooo000(SubsamplingScaleImageView subsamplingScaleImageView, Context context, o00O000<? extends o00O00> o00o001, Uri uri) {
            this.f21182OooO00o = new WeakReference<>(subsamplingScaleImageView);
            this.f21183OooO0O0 = new WeakReference<>(context);
            this.f21184OooO0OO = new WeakReference<>(o00o001);
            this.f21185OooO0Oo = uri;
        }

        @Override // android.os.AsyncTask
        public final int[] doInBackground(Void[] voidArr) {
            try {
                String string = this.f21185OooO0Oo.toString();
                Context context = this.f21183OooO0O0.get();
                o00O000<? extends o00O00> o00o001 = this.f21184OooO0OO.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.f21182OooO00o.get();
                if (context != null && o00o001 != null && subsamplingScaleImageView != null) {
                    List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                    o00O00 o00o00OooO00o = o00o001.OooO00o();
                    this.f21187OooO0o0 = o00o00OooO00o;
                    Point pointOooO0OO = o00o00OooO00o.OooO0OO(context, this.f21185OooO0Oo);
                    return new int[]{pointOooO0OO.x, pointOooO0OO.y, SubsamplingScaleImageView.OooO0Oo(subsamplingScaleImageView, context, string)};
                }
            } catch (Exception e) {
                List<Integer> list2 = SubsamplingScaleImageView.f21061o0000OoO;
                Log.e("SubsamplingScaleImageView", "Failed to initialise bitmap decoder", e);
                this.f21186OooO0o = e;
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(int[] iArr) {
            OooOOO0 oooOOO0;
            int i;
            int i2;
            int i3;
            int[] iArr2 = iArr;
            SubsamplingScaleImageView subsamplingScaleImageView = this.f21182OooO00o.get();
            if (subsamplingScaleImageView != null) {
                o00O00 o00o01 = this.f21187OooO0o0;
                if (o00o01 == null || iArr2 == null || iArr2.length != 3) {
                    if (this.f21186OooO0o == null || (oooOOO0 = subsamplingScaleImageView.f21090o0000) == null) {
                        return;
                    }
                    oooOOO0.OooO0o0();
                    return;
                }
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                int i6 = iArr2[2];
                List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                synchronized (subsamplingScaleImageView) {
                    int i7 = subsamplingScaleImageView.f21133oo000o;
                    if (i7 > 0 && (i3 = subsamplingScaleImageView.f21123o00oO0o) > 0 && (i7 != i4 || i3 != i5)) {
                        subsamplingScaleImageView.OooOo(false);
                        Bitmap bitmap = subsamplingScaleImageView.f21068Oooo0o;
                        if (bitmap != null) {
                            if (!subsamplingScaleImageView.f21070Oooo0oo) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f21068Oooo0o = null;
                            OooOOO0 oooOOO1 = subsamplingScaleImageView.f21090o0000;
                            if (oooOOO1 != null && subsamplingScaleImageView.f21070Oooo0oo) {
                                oooOOO1.OooO00o();
                            }
                            subsamplingScaleImageView.f21069Oooo0oO = false;
                            subsamplingScaleImageView.f21070Oooo0oo = false;
                        }
                    }
                    subsamplingScaleImageView.f21134oo0o0Oo = o00o01;
                    subsamplingScaleImageView.f21133oo000o = i4;
                    subsamplingScaleImageView.f21123o00oO0o = i5;
                    subsamplingScaleImageView.f21122o00oO0O = i6;
                    subsamplingScaleImageView.OooO0oo();
                    if (!subsamplingScaleImageView.OooO0oO() && (i = subsamplingScaleImageView.f21079OoooOoO) > 0 && i != Integer.MAX_VALUE && (i2 = subsamplingScaleImageView.f21080OoooOoo) > 0 && i2 != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                        subsamplingScaleImageView.OooOOO(new Point(subsamplingScaleImageView.f21079OoooOoO, subsamplingScaleImageView.f21080OoooOoo));
                    }
                    subsamplingScaleImageView.invalidate();
                    subsamplingScaleImageView.requestLayout();
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.f21071OoooO = 0;
        this.f21075OoooOO0 = 2.0f;
        this.f21117o000oOoO = OooOOo0();
        this.f21076OoooOOO = -1;
        this.f21077OoooOOo = 1;
        this.f21078OoooOo0 = 1;
        this.f21079OoooOoO = Integer.MAX_VALUE;
        this.f21080OoooOoo = Integer.MAX_VALUE;
        this.f21081Ooooo00 = AsyncTask.THREAD_POOL_EXECUTOR;
        this.f21082Ooooo0o = true;
        this.f21083OooooO0 = true;
        this.f21084OooooOO = true;
        this.f21085OooooOo = true;
        this.f21087Oooooo0 = 1.0f;
        this.f21086Oooooo = 1;
        this.f21088OoooooO = 500;
        this.f21125o0O0O00 = new ReentrantReadWriteLock(true);
        this.f21116o000OOo = new o00oOoo(SkiaImageDecoder.class);
        this.f21092o000000 = new o00oOoo(SkiaImageRegionDecoder.class);
        this.f21109o0000OOo = new float[8];
        this.f21111o0000Oo0 = new float[8];
        this.f21110o0000Oo = getResources().getDisplayMetrics().density;
        setMinimumDpi(Constants.ERR_ALREADY_IN_RECORDING);
        setDoubleTapZoomDpi(Constants.ERR_ALREADY_IN_RECORDING);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.f21113o0000oO = new Handler(new OooO00o());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OO0.SubsamplingScaleImageView);
            if (typedArrayObtainStyledAttributes.hasValue(0) && (string = typedArrayObtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                String strOooO0Oo = "file:///android_asset/" + string;
                Objects.requireNonNull(strOooO0Oo, "Uri must not be null");
                if (!strOooO0Oo.contains("://")) {
                    strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo("file:///", strOooO0Oo.startsWith("/") ? strOooO0Oo.substring(1) : strOooO0Oo);
                }
                p509o0o00oo.OooOo00 oooOo00 = new p509o0o00oo.OooOo00(Uri.parse(strOooO0Oo));
                oooOo00.f41893OooO0Oo = true;
                setImage(oooOo00);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
                p509o0o00oo.OooOo00 oooOo01 = new p509o0o00oo.OooOo00(resourceId);
                oooOo01.f41893OooO0Oo = true;
                setImage(oooOo01);
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(5, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f21091o00000 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    public static int OooO0Oo(SubsamplingScaleImageView subsamplingScaleImageView, Context context, String str) {
        int i = 0;
        if (!str.startsWith("content")) {
            if (!str.startsWith("file:///") || str.startsWith("file:///android_asset/")) {
                return 0;
            }
            try {
                int iOooO0o0 = new ExifInterface(str.substring(7)).OooO0o0();
                if (iOooO0o0 != 1 && iOooO0o0 != 0) {
                    if (iOooO0o0 == 6) {
                        return 90;
                    }
                    if (iOooO0o0 == 3) {
                        return 180;
                    }
                    if (iOooO0o0 == 8) {
                        return 270;
                    }
                    Log.w("SubsamplingScaleImageView", "Unsupported EXIF orientation: " + iOooO0o0);
                    return 0;
                }
                return 0;
            } catch (Exception unused) {
                Log.w("SubsamplingScaleImageView", "Could not get EXIF orientation of image");
                return 0;
            }
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int i2 = cursorQuery.getInt(0);
                    if (!f21061o0000OoO.contains(Integer.valueOf(i2)) || i2 == -1) {
                        Log.w("SubsamplingScaleImageView", "Unsupported orientation: " + i2);
                    } else {
                        i = i2;
                    }
                }
                if (cursorQuery == null) {
                    return i;
                }
            } catch (Exception unused2) {
                Log.w("SubsamplingScaleImageView", "Could not get orientation of image from media store");
                if (cursorQuery == null) {
                    return 0;
                }
            }
            return i;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static void OooO0o0(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        if (subsamplingScaleImageView.getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (subsamplingScaleImageView.getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = subsamplingScaleImageView.f21123o00oO0o;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (subsamplingScaleImageView.getRequiredRotation() != 180) {
            int i3 = subsamplingScaleImageView.f21133oo000o;
            rect2.set(i3 - rect.bottom, rect.left, i3 - rect.top, rect.right);
        } else {
            int i4 = subsamplingScaleImageView.f21133oo000o;
            int i5 = i4 - rect.right;
            int i6 = subsamplingScaleImageView.f21123o00oO0o;
            rect2.set(i5, i6 - rect.bottom, i4 - rect.left, i6 - rect.top);
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return f21066o0000oO0;
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.f21071OoooO;
        return i == -1 ? this.f21122o00oO0O : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.f21128o0Oo0oo = new GestureDetector(context, new OooO0O0(context));
        this.f21126o0OO00O = new GestureDetector(context, new OooO0OO());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        f21066o0000oO0 = config;
    }

    public final float OooO(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public final int OooO0o(float f) {
        int iRound;
        if (this.f21076OoooOOO > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.f21076OoooOOO / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iOooOoO = (int) (OooOoO() * f);
        int iOooOoO0 = (int) (OooOoO0() * f);
        if (iOooOoO == 0 || iOooOoO0 == 0) {
            return 32;
        }
        int i = 1;
        if (OooOoO0() > iOooOoO0 || OooOoO() > iOooOoO) {
            iRound = Math.round(OooOoO0() / iOooOoO0);
            int iRound2 = Math.round(OooOoO() / iOooOoO);
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
        boolean zOooOOOo = OooOOOo();
        if (!this.f21101o00000oo && zOooOOOo) {
            OooOo00();
            this.f21101o00000oo = true;
            OooOOO0 oooOOO0 = this.f21090o0000;
            if (oooOOO0 != null) {
                oooOOO0.OooO0O0();
            }
        }
        return zOooOOOo;
    }

    public final boolean OooO0oo() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.f21133oo000o > 0 && this.f21123o00oO0o > 0 && (this.f21068Oooo0o != null || OooOOOo());
        if (!this.f21100o00000oO && z) {
            OooOo00();
            this.f21100o00000oO = true;
            OooOOO0 oooOOO0 = this.f21090o0000;
            if (oooOOO0 != null) {
                oooOOO0.OooO0Oo();
            }
        }
        return z;
    }

    public final void OooOO0(PointF pointF, PointF pointF2) {
        if (!this.f21083OooooO0) {
            PointF pointF3 = this.f21124o00ooo;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = OooOoO() / 2;
                pointF.y = OooOoO0() / 2;
            }
        }
        float fMin = Math.min(this.f21075OoooOO0, this.f21087Oooooo0);
        float f = this.f21089Ooooooo;
        boolean z = ((double) f) <= ((double) fMin) * 0.9d || f == this.f21117o000oOoO;
        if (!z) {
            fMin = OooOOo0();
        }
        int i = this.f21086Oooooo;
        if (i == 3) {
            this.f21112o0000Ooo = null;
            this.f21120o00Ooo = Float.valueOf(fMin);
            this.f21121o00o0O = pointF;
            this.f21124o00ooo = pointF;
            invalidate();
        } else if (i == 2 || !z || !this.f21083OooooO0) {
            OooO oooO = new OooO(fMin, pointF);
            oooO.f21143OooO0oO = false;
            oooO.f21140OooO0Oo = this.f21088OoooooO;
            oooO.f21141OooO0o = 4;
            oooO.OooO00o();
        } else if (i == 1) {
            OooO oooO2 = new OooO(fMin, pointF, pointF2);
            oooO2.f21143OooO0oO = false;
            oooO2.f21140OooO0Oo = this.f21088OoooooO;
            oooO2.f21141OooO0o = 4;
            oooO2.OooO00o();
        }
        invalidate();
    }

    public final float OooOO0O(int i, long j, float f, float f2, long j2) {
        float f3;
        if (i == 1) {
            float f4 = j / j2;
            return Oooo000.OooO00o.OooO00o(f4, 2.0f, (-f2) * f4, f);
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

    public final void OooOO0o(boolean z) {
        boolean z2;
        if (this.f21135ooOO == null) {
            z2 = true;
            this.f21135ooOO = new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            z2 = false;
        }
        if (this.f21107o0000OO0 == null) {
            this.f21107o0000OO0 = new OooOOOO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        }
        OooOOOO oooOOOO = this.f21107o0000OO0;
        oooOOOO.f21169OooO00o = this.f21089Ooooooo;
        oooOOOO.f21170OooO0O0.set(this.f21135ooOO);
        OooOOO0(z, this.f21107o0000OO0);
        OooOOOO oooOOOO2 = this.f21107o0000OO0;
        this.f21089Ooooooo = oooOOOO2.f21169OooO00o;
        this.f21135ooOO.set(oooOOOO2.f21170OooO0O0);
        if (!z2 || this.f21078OoooOo0 == 4) {
            return;
        }
        this.f21135ooOO.set(Oooo000(OooOoO() / 2, OooOoO0() / 2, this.f21089Ooooooo));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    public final synchronized void OooOOO(@NonNull Point point) {
        OooOOOO oooOOOO = new OooOOOO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        this.f21107o0000OO0 = oooOOOO;
        OooOOO0(true, oooOOOO);
        int iOooO0o = OooO0o(this.f21107o0000OO0.f21169OooO00o);
        this.f21073OoooO00 = iOooO0o;
        if (iOooO0o > 1) {
            this.f21073OoooO00 = iOooO0o / 2;
        }
        if (this.f21073OoooO00 != 1 || OooOoO() >= point.x || OooOoO0() >= point.y) {
            OooOOOO(point);
            Iterator it = ((List) this.f21072OoooO0.get(Integer.valueOf(this.f21073OoooO00))).iterator();
            while (it.hasNext()) {
                new OooOo(this, this.f21134oo0o0Oo, (OooOo00) it.next()).executeOnExecutor(this.f21081Ooooo00, new Void[0]);
            }
            OooOo0O(true);
        } else {
            this.f21134oo0o0Oo.OooO00o();
            this.f21134oo0o0Oo = null;
            new OooOO0(this, getContext(), this.f21116o000OOo, this.f21067Oooo, false).executeOnExecutor(this.f21081Ooooo00, new Void[0]);
        }
    }

    public final void OooOOO0(boolean z, OooOOOO oooOOOO) {
        float paddingLeft;
        float fMax;
        int iMax;
        float fMax2;
        if (this.f21077OoooOOo == 2 && this.f21100o00000oO) {
            z = false;
        }
        PointF pointF = oooOOOO.f21170OooO0O0;
        float fMin = Math.min(this.f21075OoooOO0, Math.max(OooOOo0(), oooOOOO.f21169OooO00o));
        float fOooOoO = OooOoO() * fMin;
        float fOooOoO0 = OooOoO0() * fMin;
        if (this.f21077OoooOOo == 3 && this.f21100o00000oO) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fOooOoO);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fOooOoO0);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fOooOoO);
            pointF.y = Math.max(pointF.y, getHeight() - fOooOoO0);
        } else {
            pointF.x = Math.max(pointF.x, -fOooOoO);
            pointF.y = Math.max(pointF.y, -fOooOoO0);
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
        if (this.f21077OoooOOo != 3 || !this.f21100o00000oO) {
            if (z) {
                fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (getWidth() - fOooOoO) * paddingLeft);
                fMax2 = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (getHeight() - fOooOoO0) * paddingTop);
            } else {
                fMax = Math.max(0, getWidth());
                iMax = Math.max(0, getHeight());
            }
            pointF.x = Math.min(pointF.x, fMax);
            pointF.y = Math.min(pointF.y, fMax2);
            oooOOOO.f21169OooO00o = fMin;
        }
        fMax = Math.max(0, getWidth() / 2);
        iMax = Math.max(0, getHeight() / 2);
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        oooOOOO.f21169OooO00o = fMin;
    }

    public final void OooOOOO(Point point) {
        this.f21072OoooO0 = new LinkedHashMap();
        int i = this.f21073OoooO00;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int iOooOoO = OooOoO() / i3;
            int iOooOoO0 = OooOoO0() / i4;
            int i5 = iOooOoO / i;
            int i6 = iOooOoO0 / i;
            while (true) {
                if (i5 + i3 + i2 <= point.x && (i5 <= ((double) getWidth()) * 1.25d || i >= this.f21073OoooO00)) {
                    break;
                }
                i3++;
                iOooOoO = OooOoO() / i3;
                i5 = iOooOoO / i;
            }
            while (true) {
                if (i6 + i4 + i2 <= point.y && (i6 <= ((double) getHeight()) * 1.25d || i >= this.f21073OoooO00)) {
                    break;
                }
                i4++;
                iOooOoO0 = OooOoO0() / i4;
                i6 = iOooOoO0 / i;
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    OooOo00 oooOo00 = new OooOo00();
                    oooOo00.f21176OooO0O0 = i;
                    oooOo00.f21180OooO0o0 = i == this.f21073OoooO00;
                    oooOo00.f21175OooO00o = new Rect(i7 * iOooOoO, i8 * iOooOoO0, i7 == i3 + (-1) ? OooOoO() : (i7 + 1) * iOooOoO, i8 == i4 + (-1) ? OooOoO0() : (i8 + 1) * iOooOoO0);
                    oooOo00.f21179OooO0o = new Rect(0, 0, 0, 0);
                    oooOo00.f21181OooO0oO = new Rect(oooOo00.f21175OooO00o);
                    arrayList.add(oooOo00);
                    i8++;
                }
                i7++;
            }
            this.f21072OoooO0.put(Integer.valueOf(i), arrayList);
            i2 = 1;
            if (i == 1) {
                return;
            } else {
                i /= 2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    public final boolean OooOOOo() {
        boolean z = true;
        if (this.f21068Oooo0o != null && !this.f21069Oooo0oO) {
            return true;
        }
        ?? r0 = this.f21072OoooO0;
        if (r0 == 0) {
            return false;
        }
        for (Map.Entry entry : r0.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.f21073OoooO00) {
                for (OooOo00 oooOo00 : (List) entry.getValue()) {
                    if (oooOo00.f21178OooO0Oo || oooOo00.f21177OooO0OO == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public final synchronized void OooOOo(Bitmap bitmap, int i, boolean z) {
        OooOOO0 oooOOO0;
        int i2 = this.f21133oo000o;
        if (i2 > 0 && this.f21123o00oO0o > 0 && (i2 != bitmap.getWidth() || this.f21123o00oO0o != bitmap.getHeight())) {
            OooOo(false);
        }
        Bitmap bitmap2 = this.f21068Oooo0o;
        if (bitmap2 != null && !this.f21070Oooo0oo) {
            bitmap2.recycle();
        }
        if (this.f21068Oooo0o != null && this.f21070Oooo0oo && (oooOOO0 = this.f21090o0000) != null) {
            oooOOO0.OooO00o();
        }
        this.f21069Oooo0oO = false;
        this.f21070Oooo0oo = z;
        this.f21068Oooo0o = bitmap;
        this.f21133oo000o = bitmap.getWidth();
        this.f21123o00oO0o = bitmap.getHeight();
        this.f21122o00oO0O = i;
        boolean zOooO0oo = OooO0oo();
        boolean zOooO0oO = OooO0oO();
        if (zOooO0oo || zOooO0oO) {
            invalidate();
            requestLayout();
        }
    }

    public final float OooOOo0() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i = this.f21078OoooOo0;
        if (i == 2 || i == 4) {
            return Math.max((getWidth() - paddingRight) / OooOoO(), (getHeight() - paddingTop) / OooOoO0());
        }
        if (i == 3) {
            float f = this.f21117o000oOoO;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return f;
            }
        }
        return Math.min((getWidth() - paddingRight) / OooOoO(), (getHeight() - paddingTop) / OooOoO0());
    }

    public final synchronized void OooOOoo(Bitmap bitmap) {
        if (this.f21068Oooo0o == null && !this.f21101o00000oo) {
            this.f21068Oooo0o = bitmap;
            this.f21069Oooo0oO = true;
            if (OooO0oo()) {
                invalidate();
                requestLayout();
            }
            return;
        }
        bitmap.recycle();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    public final void OooOo(boolean z) {
        OooOOO0 oooOOO0;
        this.f21089Ooooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f21129o0OoOo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f21135ooOO = null;
        this.f21118o00O0O = null;
        this.f21119o00Oo0 = null;
        this.f21120o00Ooo = Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f21121o00o0O = null;
        this.f21124o00ooo = null;
        this.f21130o0ooOO0 = false;
        this.f21131o0ooOOo = false;
        this.f21132o0ooOoO = false;
        this.f21127o0OOO0o = 0;
        this.f21073OoooO00 = 0;
        this.f21093o000000O = null;
        this.f21094o000000o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f21096o00000O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f21095o00000O = false;
        this.f21098o00000Oo = null;
        this.f21097o00000OO = null;
        this.f21099o00000o0 = null;
        this.f21112o0000Ooo = null;
        this.f21107o0000OO0 = null;
        this.f21106o0000OO = null;
        this.f21108o0000OOO = null;
        if (z) {
            this.f21067Oooo = null;
            this.f21125o0O0O00.writeLock().lock();
            try {
                o00O00 o00o01 = this.f21134oo0o0Oo;
                if (o00o01 != null) {
                    o00o01.OooO00o();
                    this.f21134oo0o0Oo = null;
                }
                this.f21125o0O0O00.writeLock().unlock();
                Bitmap bitmap = this.f21068Oooo0o;
                if (bitmap != null && !this.f21070Oooo0oo) {
                    bitmap.recycle();
                }
                if (this.f21068Oooo0o != null && this.f21070Oooo0oo && (oooOOO0 = this.f21090o0000) != null) {
                    oooOOO0.OooO00o();
                }
                this.f21133oo000o = 0;
                this.f21123o00oO0o = 0;
                this.f21122o00oO0O = 0;
                this.f21100o00000oO = false;
                this.f21101o00000oo = false;
                this.f21068Oooo0o = null;
                this.f21069Oooo0oO = false;
                this.f21070Oooo0oo = false;
            } catch (Throwable th) {
                this.f21125o0O0O00.writeLock().unlock();
                throw th;
            }
        }
        ?? r6 = this.f21072OoooO0;
        if (r6 != 0) {
            Iterator it = r6.entrySet().iterator();
            while (it.hasNext()) {
                for (OooOo00 oooOo00 : (List) ((Map.Entry) it.next()).getValue()) {
                    oooOo00.f21180OooO0o0 = false;
                    Bitmap bitmap2 = oooOo00.f21177OooO0OO;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        oooOo00.f21177OooO0OO = null;
                    }
                }
            }
            this.f21072OoooO0 = null;
        }
        setGestureDetector(getContext());
    }

    public final int OooOo0(int i) {
        return (int) (this.f21110o0000Oo * i);
    }

    public final void OooOo00() {
        Float f;
        if (getWidth() == 0 || getHeight() == 0 || this.f21133oo000o <= 0 || this.f21123o00oO0o <= 0) {
            return;
        }
        if (this.f21121o00o0O != null && (f = this.f21120o00Ooo) != null) {
            this.f21089Ooooooo = f.floatValue();
            if (this.f21135ooOO == null) {
                this.f21135ooOO = new PointF();
            }
            this.f21135ooOO.x = (getWidth() / 2) - (this.f21089Ooooooo * this.f21121o00o0O.x);
            this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * this.f21121o00o0O.y);
            this.f21121o00o0O = null;
            this.f21120o00Ooo = null;
            OooOO0o(true);
            OooOo0O(true);
        }
        OooOO0o(false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    public final void OooOo0O(boolean z) {
        if (this.f21134oo0o0Oo == null || this.f21072OoooO0 == null) {
            return;
        }
        int iMin = Math.min(this.f21073OoooO00, OooO0o(this.f21089Ooooooo));
        Iterator it = this.f21072OoooO0.entrySet().iterator();
        while (it.hasNext()) {
            for (OooOo00 oooOo00 : (List) ((Map.Entry) it.next()).getValue()) {
                int i = oooOo00.f21176OooO0O0;
                if (i < iMin || (i > iMin && i != this.f21073OoooO00)) {
                    oooOo00.f21180OooO0o0 = false;
                    Bitmap bitmap = oooOo00.f21177OooO0OO;
                    if (bitmap != null) {
                        bitmap.recycle();
                        oooOo00.f21177OooO0OO = null;
                    }
                }
                int i2 = oooOo00.f21176OooO0O0;
                if (i2 == iMin) {
                    float fOooo00o = Oooo00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float fOooo00o2 = Oooo00o(getWidth());
                    float fOooo0 = Oooo0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    float fOooo1 = Oooo0(getHeight());
                    Rect rect = oooOo00.f21175OooO00o;
                    if (fOooo00o <= ((float) rect.right) && ((float) rect.left) <= fOooo00o2 && fOooo0 <= ((float) rect.bottom) && ((float) rect.top) <= fOooo1) {
                        oooOo00.f21180OooO0o0 = true;
                        if (!oooOo00.f21178OooO0Oo && oooOo00.f21177OooO0OO == null && z) {
                            new OooOo(this, this.f21134oo0o0Oo, oooOo00).executeOnExecutor(this.f21081Ooooo00, new Void[0]);
                        }
                    } else if (oooOo00.f21176OooO0O0 != this.f21073OoooO00) {
                        oooOo00.f21180OooO0o0 = false;
                        Bitmap bitmap2 = oooOo00.f21177OooO0OO;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            oooOo00.f21177OooO0OO = null;
                        }
                    }
                } else if (i2 == this.f21073OoooO00) {
                    oooOo00.f21180OooO0o0 = true;
                }
            }
        }
    }

    public final void OooOo0o(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final int OooOoO() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f21123o00oO0o : this.f21133oo000o;
    }

    public final int OooOoO0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.f21133oo000o : this.f21123o00oO0o;
    }

    public final void OooOoOO(float f, PointF pointF, int i) {
        OooOOO oooOOO = this.f21104o0000O00;
        if (oooOOO != null && this.f21089Ooooooo != f) {
            oooOOO.OooO00o();
        }
        if (this.f21104o0000O00 == null || this.f21135ooOO.equals(pointF)) {
            return;
        }
        OooOOO oooOOO2 = this.f21104o0000O00;
        getCenter();
        oooOOO2.OooO0O0();
    }

    @Nullable
    public final PointF OooOoo(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.f21135ooOO == null) {
            return null;
        }
        pointF2.set(OooOooO(f), OooOooo(f2));
        return pointF2;
    }

    public final void OooOoo0(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public final float OooOooO(float f) {
        PointF pointF = this.f21135ooOO;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f21089Ooooooo) + pointF.x;
    }

    public final float OooOooo(float f) {
        PointF pointF = this.f21135ooOO;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.f21089Ooooooo) + pointF.y;
    }

    public final float Oooo0(float f) {
        PointF pointF = this.f21135ooOO;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.f21089Ooooooo;
    }

    @NonNull
    public final PointF Oooo000(float f, float f2, float f3) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.f21107o0000OO0 == null) {
            this.f21107o0000OO0 = new OooOOOO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        }
        OooOOOO oooOOOO = this.f21107o0000OO0;
        oooOOOO.f21169OooO00o = f3;
        oooOOOO.f21170OooO0O0.set(width - (f * f3), height - (f2 * f3));
        OooOOO0(true, this.f21107o0000OO0);
        return this.f21107o0000OO0.f21170OooO0O0;
    }

    @Nullable
    public final PointF Oooo00O(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.f21135ooOO == null) {
            return null;
        }
        pointF2.set(Oooo00o(f), Oooo0(f2));
        return pointF2;
    }

    public final float Oooo00o(float f) {
        PointF pointF = this.f21135ooOO;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.f21089Ooooooo;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    @Nullable
    public final PointF getCenter() {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        PointF pointF = new PointF();
        if (this.f21135ooOO == null) {
            return null;
        }
        pointF.set(Oooo00o(width), Oooo0(height));
        return pointF;
    }

    public float getMaxScale() {
        return this.f21075OoooOO0;
    }

    public final float getMinScale() {
        return OooOOo0();
    }

    public final int getOrientation() {
        return this.f21071OoooO;
    }

    public final int getSHeight() {
        return this.f21123o00oO0o;
    }

    public final int getSWidth() {
        return this.f21133oo000o;
    }

    public final float getScale() {
        return this.f21089Ooooooo;
    }

    @Nullable
    public final ImageViewState getState() {
        if (this.f21135ooOO == null || this.f21133oo000o <= 0 || this.f21123o00oO0o <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0156  */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.util.List<com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView$OooOo00>>] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float height;
        int i3;
        OooOo00 oooOo00;
        boolean z;
        super.onDraw(canvas);
        if (this.f21103o0000O0 == null) {
            Paint paint = new Paint();
            this.f21103o0000O0 = paint;
            paint.setAntiAlias(true);
            this.f21103o0000O0.setFilterBitmap(true);
            this.f21103o0000O0.setDither(true);
        }
        if ((this.f21105o0000O0O == null || this.f21115o000OO == null) && this.f21074OoooO0O) {
            Paint paint2 = new Paint();
            this.f21105o0000O0O = paint2;
            paint2.setTextSize(OooOo0(12));
            this.f21105o0000O0O.setColor(-65281);
            this.f21105o0000O0O.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.f21115o000OO = paint3;
            paint3.setColor(-65281);
            this.f21115o000OO.setStyle(Paint.Style.STROKE);
            this.f21115o000OO.setStrokeWidth(OooOo0(1));
        }
        if (this.f21133oo000o == 0 || this.f21123o00oO0o == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f21072OoooO0 == null && this.f21134oo0o0Oo != null) {
            OooOOO(new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f21079OoooOoO), Math.min(canvas.getMaximumBitmapHeight(), this.f21080OoooOoo)));
        }
        if (OooO0oo()) {
            OooOo00();
            OooO0o oooO0o = this.f21112o0000Ooo;
            if (oooO0o != null && oooO0o.f21154OooO0o != null) {
                float f = this.f21089Ooooooo;
                if (this.f21119o00Oo0 == null) {
                    this.f21119o00Oo0 = new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                this.f21119o00Oo0.set(this.f21135ooOO);
                long jCurrentTimeMillis = System.currentTimeMillis();
                OooO0o oooO0o2 = this.f21112o0000Ooo;
                long j = jCurrentTimeMillis - oooO0o2.f21160OooOO0o;
                long j2 = oooO0o2.f21157OooO0oo;
                boolean z2 = j > j2;
                long jMin = Math.min(j, j2);
                OooO0o oooO0o3 = this.f21112o0000Ooo;
                int i4 = oooO0o3.f21158OooOO0;
                float f2 = oooO0o3.f21150OooO00o;
                this.f21089Ooooooo = OooOO0O(i4, jMin, f2, oooO0o3.f21151OooO0O0 - f2, oooO0o3.f21157OooO0oo);
                OooO0o oooO0o4 = this.f21112o0000Ooo;
                int i5 = oooO0o4.f21158OooOO0;
                float f3 = oooO0o4.f21154OooO0o.x;
                float fOooOO0O = OooOO0O(i5, jMin, f3, oooO0o4.f21156OooO0oO.x - f3, oooO0o4.f21157OooO0oo);
                OooO0o oooO0o5 = this.f21112o0000Ooo;
                int i6 = oooO0o5.f21158OooOO0;
                float f4 = oooO0o5.f21154OooO0o.y;
                float fOooOO0O2 = OooOO0O(i6, jMin, f4, oooO0o5.f21156OooO0oO.y - f4, oooO0o5.f21157OooO0oo);
                this.f21135ooOO.x -= OooOooO(this.f21112o0000Ooo.f21153OooO0Oo.x) - fOooOO0O;
                this.f21135ooOO.y -= OooOooo(this.f21112o0000Ooo.f21153OooO0Oo.y) - fOooOO0O2;
                if (z2) {
                    z = true;
                } else {
                    OooO0o oooO0o6 = this.f21112o0000Ooo;
                    if (oooO0o6.f21150OooO00o == oooO0o6.f21151OooO0O0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                OooOO0o(z);
                OooOoOO(f, this.f21119o00Oo0, this.f21112o0000Ooo.f21159OooOO0O);
                OooOo0O(z2);
                if (z2) {
                    OooOO0O oooOO0O = this.f21112o0000Ooo.f21161OooOOO0;
                    if (oooOO0O != null) {
                        try {
                            oooOO0O.onComplete();
                        } catch (Exception e) {
                            Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                        }
                    }
                    this.f21112o0000Ooo = null;
                }
                invalidate();
            }
            if (this.f21072OoooO0 == null || !OooOOOo()) {
                i = 35;
                i2 = 15;
                Bitmap bitmap = this.f21068Oooo0o;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = this.f21089Ooooooo;
                    if (this.f21069Oooo0oO) {
                        width *= this.f21133oo000o / this.f21068Oooo0o.getWidth();
                        height = this.f21089Ooooooo * (this.f21123o00oO0o / this.f21068Oooo0o.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.f21106o0000OO == null) {
                        this.f21106o0000OO = new Matrix();
                    }
                    this.f21106o0000OO.reset();
                    this.f21106o0000OO.postScale(width, height);
                    this.f21106o0000OO.postRotate(getRequiredRotation());
                    Matrix matrix = this.f21106o0000OO;
                    PointF pointF = this.f21135ooOO;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.f21106o0000OO;
                        float f5 = this.f21089Ooooooo;
                        matrix2.postTranslate(this.f21133oo000o * f5, f5 * this.f21123o00oO0o);
                    } else if (getRequiredRotation() == 90) {
                        this.f21106o0000OO.postTranslate(this.f21089Ooooooo * this.f21123o00oO0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    } else if (getRequiredRotation() == 270) {
                        this.f21106o0000OO.postTranslate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f21089Ooooooo * this.f21133oo000o);
                    }
                    if (this.f21102o0000O != null) {
                        if (this.f21108o0000OOO == null) {
                            this.f21108o0000OOO = new RectF();
                        }
                        this.f21108o0000OOO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f21069Oooo0oO ? this.f21068Oooo0o.getWidth() : this.f21133oo000o, this.f21069Oooo0oO ? this.f21068Oooo0o.getHeight() : this.f21123o00oO0o);
                        this.f21106o0000OO.mapRect(this.f21108o0000OOO);
                        canvas.drawRect(this.f21108o0000OOO, this.f21102o0000O);
                    }
                    canvas.drawBitmap(this.f21068Oooo0o, this.f21106o0000OO, this.f21103o0000O0);
                }
            } else {
                int iMin = Math.min(this.f21073OoooO00, OooO0o(this.f21089Ooooooo));
                boolean z3 = false;
                for (Map.Entry entry : this.f21072OoooO0.entrySet()) {
                    if (((Integer) entry.getKey()).intValue() == iMin) {
                        for (OooOo00 oooOo01 : (List) entry.getValue()) {
                            if (oooOo01.f21180OooO0o0 && (oooOo01.f21178OooO0Oo || oooOo01.f21177OooO0OO == null)) {
                                z3 = true;
                            }
                        }
                    }
                }
                for (Map.Entry entry2 : this.f21072OoooO0.entrySet()) {
                    if (((Integer) entry2.getKey()).intValue() == iMin || z3) {
                        for (OooOo00 oooOo02 : (List) entry2.getValue()) {
                            Rect rect = oooOo02.f21175OooO00o;
                            oooOo02.f21179OooO0o.set((int) OooOooO(rect.left), (int) OooOooo(rect.top), (int) OooOooO(rect.right), (int) OooOooo(rect.bottom));
                            boolean z4 = oooOo02.f21178OooO0Oo;
                            if (z4 || oooOo02.f21177OooO0OO == null) {
                                i3 = iMin;
                                oooOo00 = oooOo02;
                                if (z4 && this.f21074OoooO0O) {
                                    canvas.drawText("LOADING", OooOo0(5) + oooOo00.f21179OooO0o.left, OooOo0(35) + oooOo00.f21179OooO0o.top, this.f21105o0000O0O);
                                }
                            } else {
                                Paint paint4 = this.f21102o0000O;
                                if (paint4 != null) {
                                    canvas.drawRect(oooOo02.f21179OooO0o, paint4);
                                }
                                if (this.f21106o0000OO == null) {
                                    this.f21106o0000OO = new Matrix();
                                }
                                this.f21106o0000OO.reset();
                                i3 = iMin;
                                oooOo00 = oooOo02;
                                OooOoo0(this.f21109o0000OOo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOo02.f21177OooO0OO.getWidth(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOo02.f21177OooO0OO.getWidth(), oooOo02.f21177OooO0OO.getHeight(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOo02.f21177OooO0OO.getHeight());
                                if (getRequiredRotation() == 0) {
                                    float[] fArr = this.f21111o0000Oo0;
                                    Rect rect2 = oooOo00.f21179OooO0o;
                                    float f6 = rect2.left;
                                    float f7 = rect2.top;
                                    float f8 = rect2.right;
                                    float f9 = rect2.bottom;
                                    OooOoo0(fArr, f6, f7, f8, f7, f8, f9, f6, f9);
                                } else if (getRequiredRotation() == 90) {
                                    float[] fArr2 = this.f21111o0000Oo0;
                                    Rect rect3 = oooOo00.f21179OooO0o;
                                    float f10 = rect3.right;
                                    float f11 = rect3.top;
                                    float f12 = rect3.bottom;
                                    float f13 = rect3.left;
                                    OooOoo0(fArr2, f10, f11, f10, f12, f13, f12, f13, f11);
                                } else if (getRequiredRotation() == 180) {
                                    float[] fArr3 = this.f21111o0000Oo0;
                                    Rect rect4 = oooOo00.f21179OooO0o;
                                    float f14 = rect4.right;
                                    float f15 = rect4.bottom;
                                    float f16 = rect4.left;
                                    float f17 = rect4.top;
                                    OooOoo0(fArr3, f14, f15, f16, f15, f16, f17, f14, f17);
                                } else if (getRequiredRotation() == 270) {
                                    float[] fArr4 = this.f21111o0000Oo0;
                                    Rect rect5 = oooOo00.f21179OooO0o;
                                    float f18 = rect5.left;
                                    float f19 = rect5.bottom;
                                    float f20 = rect5.top;
                                    float f21 = rect5.right;
                                    OooOoo0(fArr4, f18, f19, f18, f20, f21, f20, f21, f19);
                                }
                                this.f21106o0000OO.setPolyToPoly(this.f21109o0000OOo, 0, this.f21111o0000Oo0, 0, 4);
                                canvas.drawBitmap(oooOo00.f21177OooO0OO, this.f21106o0000OO, this.f21103o0000O0);
                                if (this.f21074OoooO0O) {
                                    canvas.drawRect(oooOo00.f21179OooO0o, this.f21115o000OO);
                                }
                            }
                            if (oooOo00.f21180OooO0o0 && this.f21074OoooO0O) {
                                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ISS ");
                                sbOooO0o0.append(oooOo00.f21176OooO0O0);
                                sbOooO0o0.append(" RECT ");
                                sbOooO0o0.append(oooOo00.f21175OooO00o.top);
                                sbOooO0o0.append(",");
                                sbOooO0o0.append(oooOo00.f21175OooO00o.left);
                                sbOooO0o0.append(",");
                                sbOooO0o0.append(oooOo00.f21175OooO00o.bottom);
                                sbOooO0o0.append(",");
                                sbOooO0o0.append(oooOo00.f21175OooO00o.right);
                                canvas.drawText(sbOooO0o0.toString(), OooOo0(5) + oooOo00.f21179OooO0o.left, OooOo0(15) + oooOo00.f21179OooO0o.top, this.f21105o0000O0O);
                            }
                            iMin = i3;
                        }
                    }
                    iMin = iMin;
                }
                i = 35;
                i2 = 15;
            }
            if (this.f21074OoooO0O) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Scale: ");
                Locale locale = Locale.ENGLISH;
                sbOooO0o1.append(String.format(locale, "%.2f", Float.valueOf(this.f21089Ooooooo)));
                sbOooO0o1.append(" (");
                sbOooO0o1.append(String.format(locale, "%.2f", Float.valueOf(OooOOo0())));
                sbOooO0o1.append(" - ");
                sbOooO0o1.append(String.format(locale, "%.2f", Float.valueOf(this.f21075OoooOO0)));
                sbOooO0o1.append(")");
                canvas.drawText(sbOooO0o1.toString(), OooOo0(5), OooOo0(i2), this.f21105o0000O0O);
                canvas.drawText("Translate: " + String.format(locale, "%.2f", Float.valueOf(this.f21135ooOO.x)) + CertificateUtil.DELIMITER + String.format(locale, "%.2f", Float.valueOf(this.f21135ooOO.y)), OooOo0(5), OooOo0(30), this.f21105o0000O0O);
                PointF center = getCenter();
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Source center: ");
                sbOooO0o2.append(String.format(locale, "%.2f", Float.valueOf(center.x)));
                sbOooO0o2.append(CertificateUtil.DELIMITER);
                sbOooO0o2.append(String.format(locale, "%.2f", Float.valueOf(center.y)));
                canvas.drawText(sbOooO0o2.toString(), OooOo0(5), OooOo0(45), this.f21105o0000O0O);
                OooO0o oooO0o7 = this.f21112o0000Ooo;
                if (oooO0o7 != null) {
                    PointF pointFOooOoo = OooOoo(oooO0o7.f21152OooO0OO);
                    PointF pointFOooOoo2 = OooOoo(this.f21112o0000Ooo.f21155OooO0o0);
                    PointF pointFOooOoo3 = OooOoo(this.f21112o0000Ooo.f21153OooO0Oo);
                    canvas.drawCircle(pointFOooOoo.x, pointFOooOoo.y, OooOo0(10), this.f21115o000OO);
                    this.f21115o000OO.setColor(bl.a);
                    canvas.drawCircle(pointFOooOoo2.x, pointFOooOoo2.y, OooOo0(20), this.f21115o000OO);
                    this.f21115o000OO.setColor(-16776961);
                    canvas.drawCircle(pointFOooOoo3.x, pointFOooOoo3.y, OooOo0(25), this.f21115o000OO);
                    this.f21115o000OO.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, OooOo0(30), this.f21115o000OO);
                }
                if (this.f21093o000000O != null) {
                    this.f21115o000OO.setColor(bl.a);
                    PointF pointF2 = this.f21093o000000O;
                    canvas.drawCircle(pointF2.x, pointF2.y, OooOo0(20), this.f21115o000OO);
                }
                if (this.f21098o00000Oo != null) {
                    this.f21115o000OO.setColor(-16776961);
                    canvas.drawCircle(OooOooO(this.f21098o00000Oo.x), OooOooo(this.f21098o00000Oo.y), OooOo0(i), this.f21115o000OO);
                }
                if (this.f21099o00000o0 != null && this.f21132o0ooOoO) {
                    this.f21115o000OO.setColor(-16711681);
                    PointF pointF3 = this.f21099o00000o0;
                    canvas.drawCircle(pointF3.x, pointF3.y, OooOo0(30), this.f21115o000OO);
                }
                this.f21115o000OO.setColor(-65281);
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
        if (this.f21133oo000o > 0 && this.f21123o00oO0o > 0) {
            if (z && z2) {
                size = OooOoO();
                size2 = OooOoO0();
            } else if (z2) {
                size2 = (int) ((((double) OooOoO0()) / ((double) OooOoO())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) OooOoO()) / ((double) OooOoO0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        PointF center = getCenter();
        if (!this.f21100o00000oO || center == null) {
            return;
        }
        this.f21112o0000Ooo = null;
        this.f21120o00Ooo = Float.valueOf(this.f21089Ooooooo);
        this.f21121o00o0O = center;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0412  */
    /* JADX WARN: Code duplicated, block: B:177:0x0441  */
    /* JADX WARN: Code duplicated, block: B:179:0x0448  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:206:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:209:0x0501  */
    /* JADX WARN: Code duplicated, block: B:211:0x050a  */
    /* JADX WARN: Code duplicated, block: B:213:0x050f  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v26 */
    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        ?? r0;
        boolean z3;
        boolean z4;
        GestureDetector gestureDetector;
        OooOO0O oooOO0O;
        OooO0o oooO0o = this.f21112o0000Ooo;
        if (oooO0o != null && !oooO0o.f21149OooO) {
            OooOo0o(true);
            return true;
        }
        if (oooO0o != null && (oooOO0O = oooO0o.f21161OooOOO0) != null) {
            try {
                oooOO0O.OooO00o();
            } catch (Exception e) {
                Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", e);
            }
        }
        this.f21112o0000Ooo = null;
        if (this.f21135ooOO == null) {
            GestureDetector gestureDetector2 = this.f21126o0OO00O;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.f21132o0ooOoO && ((gestureDetector = this.f21128o0Oo0oo) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.f21130o0ooOO0 = false;
            this.f21131o0ooOOo = false;
            this.f21127o0OOO0o = 0;
            return true;
        }
        PointF pointF = this.f21118o00O0O;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (pointF == null) {
            this.f21118o00O0O = new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (this.f21119o00Oo0 == null) {
            this.f21119o00Oo0 = new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (this.f21093o000000O == null) {
            this.f21093o000000O = new PointF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        float f2 = this.f21089Ooooooo;
        this.f21119o00Oo0.set(this.f21135ooOO);
        int pointerCount = motionEvent.getPointerCount();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21112o0000Ooo = null;
            OooOo0o(true);
            this.f21127o0OOO0o = Math.max(this.f21127o0OOO0o, pointerCount);
            if (pointerCount >= 2) {
                if (this.f21084OooooOO) {
                    float fOooO = OooO(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                    this.f21129o0OoOo0 = this.f21089Ooooooo;
                    this.f21094o000000o = fOooO;
                    PointF pointF2 = this.f21118o00O0O;
                    PointF pointF3 = this.f21135ooOO;
                    pointF2.set(pointF3.x, pointF3.y);
                    this.f21093o000000O.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                } else {
                    this.f21127o0OOO0o = 0;
                }
                this.f21113o0000oO.removeMessages(1);
            } else if (!this.f21132o0ooOoO) {
                PointF pointF4 = this.f21118o00O0O;
                PointF pointF5 = this.f21135ooOO;
                pointF4.set(pointF5.x, pointF5.y);
                this.f21093o000000O.set(motionEvent.getX(), motionEvent.getY());
                this.f21113o0000oO.sendEmptyMessageDelayed(1, 600L);
            }
            z = true;
        } else if (action == 1) {
            this.f21113o0000oO.removeMessages(1);
            if (this.f21132o0ooOoO) {
                this.f21132o0ooOoO = false;
                if (!this.f21095o00000O) {
                    OooOO0(this.f21098o00000Oo, this.f21093o000000O);
                }
            }
            if (this.f21127o0OOO0o <= 0 && ((z2 = this.f21130o0ooOO0) || this.f21131o0ooOOo)) {
                if (z2 && pointerCount == 2) {
                    this.f21131o0ooOOo = true;
                    PointF pointF6 = this.f21118o00O0O;
                    PointF pointF7 = this.f21135ooOO;
                    pointF6.set(pointF7.x, pointF7.y);
                    if (motionEvent.getActionIndex() == 1) {
                        this.f21093o000000O.set(motionEvent.getX(0), motionEvent.getY(0));
                    } else {
                        this.f21093o000000O.set(motionEvent.getX(1), motionEvent.getY(1));
                    }
                }
                if (pointerCount < 3) {
                    r0 = 0;
                    this.f21130o0ooOO0 = false;
                } else {
                    r0 = 0;
                }
                if (pointerCount < 2) {
                    this.f21131o0ooOOo = r0;
                    this.f21127o0OOO0o = r0;
                }
                OooOo0O(true);
            } else if (pointerCount == 1) {
                this.f21130o0ooOO0 = false;
                this.f21131o0ooOOo = false;
                this.f21127o0OOO0o = 0;
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
                    }
                    this.f21113o0000oO.removeMessages(1);
                    if (this.f21132o0ooOoO) {
                        this.f21132o0ooOoO = false;
                        if (!this.f21095o00000O) {
                            OooOO0(this.f21098o00000Oo, this.f21093o000000O);
                        }
                    }
                    if (this.f21127o0OOO0o <= 0) {
                        if (pointerCount == 1) {
                            this.f21130o0ooOO0 = false;
                            this.f21131o0ooOOo = false;
                            this.f21127o0OOO0o = 0;
                        }
                    } else if (pointerCount == 1) {
                        this.f21130o0ooOO0 = false;
                        this.f21131o0ooOOo = false;
                        this.f21127o0OOO0o = 0;
                    }
                    z = true;
                }
                this.f21112o0000Ooo = null;
                OooOo0o(true);
                this.f21127o0OOO0o = Math.max(this.f21127o0OOO0o, pointerCount);
                if (pointerCount >= 2) {
                    if (this.f21084OooooOO) {
                        float fOooO2 = OooO(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                        this.f21129o0OoOo0 = this.f21089Ooooooo;
                        this.f21094o000000o = fOooO2;
                        PointF pointF8 = this.f21118o00O0O;
                        PointF pointF9 = this.f21135ooOO;
                        pointF8.set(pointF9.x, pointF9.y);
                        this.f21093o000000O.set((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
                    } else {
                        this.f21127o0OOO0o = 0;
                    }
                    this.f21113o0000oO.removeMessages(1);
                } else if (!this.f21132o0ooOoO) {
                    PointF pointF10 = this.f21118o00O0O;
                    PointF pointF11 = this.f21135ooOO;
                    pointF10.set(pointF11.x, pointF11.y);
                    this.f21093o000000O.set(motionEvent.getX(), motionEvent.getY());
                    this.f21113o0000oO.sendEmptyMessageDelayed(1, 600L);
                }
                z = true;
            } else {
                if (this.f21127o0OOO0o <= 0) {
                    z3 = false;
                } else if (pointerCount >= 2) {
                    float fOooO3 = OooO(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                    float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    if (this.f21084OooooOO) {
                        PointF pointF12 = this.f21093o000000O;
                        if (OooO(pointF12.x, x, pointF12.y, y) > 5.0f || Math.abs(fOooO3 - this.f21094o000000o) > 5.0f || this.f21131o0ooOOo) {
                            this.f21130o0ooOO0 = true;
                            this.f21131o0ooOOo = true;
                            double d = this.f21089Ooooooo;
                            float fMin = Math.min(this.f21075OoooOO0, (fOooO3 / this.f21094o000000o) * this.f21129o0OoOo0);
                            this.f21089Ooooooo = fMin;
                            if (fMin <= OooOOo0()) {
                                this.f21094o000000o = fOooO3;
                                this.f21129o0OoOo0 = OooOOo0();
                                this.f21093o000000O.set(x, y);
                                this.f21118o00O0O.set(this.f21135ooOO);
                            } else if (this.f21083OooooO0) {
                                PointF pointF13 = this.f21093o000000O;
                                float f3 = pointF13.x;
                                PointF pointF14 = this.f21118o00O0O;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF13.y - pointF14.y;
                                float f6 = this.f21089Ooooooo / this.f21129o0OoOo0;
                                float f7 = f4 * f6;
                                float f8 = f6 * f5;
                                PointF pointF15 = this.f21135ooOO;
                                pointF15.x = x - f7;
                                pointF15.y = y - f8;
                                if ((((double) OooOoO0()) * d < getHeight() && this.f21089Ooooooo * OooOoO0() >= getHeight()) || (d * ((double) OooOoO()) < getWidth() && this.f21089Ooooooo * OooOoO() >= getWidth())) {
                                    OooOO0o(true);
                                    this.f21093o000000O.set(x, y);
                                    this.f21118o00O0O.set(this.f21135ooOO);
                                    this.f21129o0OoOo0 = this.f21089Ooooooo;
                                    this.f21094o000000o = fOooO3;
                                }
                            } else if (this.f21124o00ooo != null) {
                                this.f21135ooOO.x = (getWidth() / 2) - (this.f21089Ooooooo * this.f21124o00ooo.x);
                                this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * this.f21124o00ooo.y);
                            } else {
                                this.f21135ooOO.x = (getWidth() / 2) - (this.f21089Ooooooo * (OooOoO() / 2));
                                this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * (OooOoO0() / 2));
                            }
                            OooOO0o(true);
                            OooOo0O(this.f21082Ooooo0o);
                            z3 = true;
                        }
                    }
                    z3 = false;
                } else {
                    if (this.f21132o0ooOoO) {
                        float fAbs = (Math.abs(this.f21099o00000o0.y - motionEvent.getY()) * 2.0f) + this.f21091o00000;
                        if (this.f21096o00000O0 == -1.0f) {
                            this.f21096o00000O0 = fAbs;
                        }
                        float y2 = motionEvent.getY();
                        PointF pointF16 = this.f21097o00000OO;
                        boolean z5 = y2 > pointF16.y;
                        pointF16.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, motionEvent.getY());
                        float f9 = 1.0f;
                        float fAbs2 = Math.abs(1.0f - (fAbs / this.f21096o00000O0)) * 0.5f;
                        if (fAbs2 > 0.03f || this.f21095o00000O) {
                            this.f21095o00000O = true;
                            if (this.f21096o00000O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                f9 = z5 ? 1.0f + fAbs2 : 1.0f - fAbs2;
                            }
                            double d2 = this.f21089Ooooooo;
                            float fMax = Math.max(OooOOo0(), Math.min(this.f21075OoooOO0, this.f21089Ooooooo * f9));
                            this.f21089Ooooooo = fMax;
                            if (this.f21083OooooO0) {
                                PointF pointF17 = this.f21093o000000O;
                                float f10 = pointF17.x;
                                PointF pointF18 = this.f21118o00O0O;
                                float f11 = f10 - pointF18.x;
                                float f12 = pointF17.y;
                                float f13 = f12 - pointF18.y;
                                float f14 = fMax / this.f21129o0OoOo0;
                                float f15 = f11 * f14;
                                float f16 = f14 * f13;
                                PointF pointF19 = this.f21135ooOO;
                                pointF19.x = f10 - f15;
                                pointF19.y = f12 - f16;
                                if ((((double) OooOoO0()) * d2 < getHeight() && this.f21089Ooooooo * OooOoO0() >= getHeight()) || (d2 * ((double) OooOoO()) < getWidth() && this.f21089Ooooooo * OooOoO() >= getWidth())) {
                                    OooOO0o(true);
                                    this.f21093o000000O.set(OooOoo(this.f21098o00000Oo));
                                    this.f21118o00O0O.set(this.f21135ooOO);
                                    this.f21129o0OoOo0 = this.f21089Ooooooo;
                                }
                            } else if (this.f21124o00ooo != null) {
                                this.f21135ooOO.x = (getWidth() / 2) - (this.f21089Ooooooo * this.f21124o00ooo.x);
                                this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * this.f21124o00ooo.y);
                            } else {
                                this.f21135ooOO.x = (getWidth() / 2) - (this.f21089Ooooooo * (OooOoO() / 2));
                                this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * (OooOoO0() / 2));
                            }
                            f = fAbs;
                        } else {
                            f = fAbs;
                        }
                        this.f21096o00000O0 = f;
                        OooOO0o(true);
                        OooOo0O(this.f21082Ooooo0o);
                    } else {
                        if (!this.f21130o0ooOO0) {
                            float fAbs3 = Math.abs(motionEvent.getX() - this.f21093o000000O.x);
                            float fAbs4 = Math.abs(motionEvent.getY() - this.f21093o000000O.y);
                            float f17 = this.f21110o0000Oo * 5.0f;
                            if (fAbs3 > f17 || fAbs4 > f17 || this.f21131o0ooOOo) {
                                this.f21135ooOO.x = (motionEvent.getX() - this.f21093o000000O.x) + this.f21118o00O0O.x;
                                this.f21135ooOO.y = (motionEvent.getY() - this.f21093o000000O.y) + this.f21118o00O0O.y;
                                PointF pointF20 = this.f21135ooOO;
                                float f18 = pointF20.x;
                                float f19 = pointF20.y;
                                OooOO0o(true);
                                PointF pointF21 = this.f21135ooOO;
                                boolean z6 = f18 != pointF21.x;
                                float f20 = pointF21.y;
                                boolean z7 = f19 != f20;
                                boolean z8 = z6 && fAbs3 > fAbs4 && !this.f21131o0ooOOo;
                                boolean z9 = z7 && fAbs4 > fAbs3 && !this.f21131o0ooOOo;
                                boolean z10 = f19 == f20 && fAbs4 > 3.0f * f17;
                                if (z8 || z9 || (z6 && z7 && !z10 && !this.f21131o0ooOOo)) {
                                    if (fAbs3 > f17 || fAbs4 > f17) {
                                        z4 = false;
                                        this.f21127o0OOO0o = 0;
                                        this.f21113o0000oO.removeMessages(1);
                                        OooOo0o(false);
                                    }
                                    if (!this.f21083OooooO0) {
                                        PointF pointF22 = this.f21135ooOO;
                                        PointF pointF23 = this.f21118o00O0O;
                                        pointF22.x = pointF23.x;
                                        pointF22.y = pointF23.y;
                                        OooOo0o(z4);
                                    }
                                    OooOo0O(this.f21082Ooooo0o);
                                } else {
                                    this.f21131o0ooOOo = true;
                                }
                                z4 = false;
                                if (!this.f21083OooooO0) {
                                    PointF pointF24 = this.f21135ooOO;
                                    PointF pointF25 = this.f21118o00O0O;
                                    pointF24.x = pointF25.x;
                                    pointF24.y = pointF25.y;
                                    OooOo0o(z4);
                                }
                                OooOo0O(this.f21082Ooooo0o);
                            }
                        }
                        z3 = false;
                    }
                    z3 = true;
                }
                if (z3) {
                    this.f21113o0000oO.removeMessages(1);
                    invalidate();
                    z = true;
                }
            }
            z = false;
        }
        OooOoOO(f2, this.f21119o00Oo0, 2);
        return z || super.onTouchEvent(motionEvent);
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends o00O000o> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f21116o000OOo = new o00oOoo(cls);
    }

    public final void setBitmapDecoderFactory(@NonNull o00O000<? extends o00O000o> o00o001) {
        if (o00o001 == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f21116o000OOo = o00o001;
    }

    public final void setDebug(boolean z) {
        this.f21074OoooO0O = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.f21088OoooooO = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.f21087Oooooo0 = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (!f21063o0000o0.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid zoom style: ", i));
        }
        this.f21086Oooooo = i;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.f21082Ooooo0o = z;
    }

    public void setExecutor(@NonNull Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.f21081Ooooo00 = executor;
    }

    public final void setImage(@NonNull p509o0o00oo.OooOo00 oooOo00) {
        Objects.requireNonNull(oooOo00, "imageSource must not be null");
        OooOo(true);
        Bitmap bitmap = oooOo00.f41891OooO0O0;
        if (bitmap != null) {
            OooOOo(bitmap, 0, oooOo00.f41896OooO0oO);
            return;
        }
        Uri uri = oooOo00.f41890OooO00o;
        this.f21067Oooo = uri;
        if (uri == null && oooOo00.f41892OooO0OO != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("android.resource://");
            sbOooO0o0.append(getContext().getPackageName());
            sbOooO0o0.append("/");
            sbOooO0o0.append(oooOo00.f41892OooO0OO);
            this.f21067Oooo = Uri.parse(sbOooO0o0.toString());
        }
        if (oooOo00.f41893OooO0Oo) {
            new Oooo000(this, getContext(), this.f21092o000000, this.f21067Oooo).executeOnExecutor(this.f21081Ooooo00, new Void[0]);
        } else {
            new OooOO0(this, getContext(), this.f21116o000OOo, this.f21067Oooo, false).executeOnExecutor(this.f21081Ooooo00, new Void[0]);
        }
    }

    public final void setMaxScale(float f) {
        this.f21075OoooOO0 = f;
    }

    public void setMaxTileSize(int i) {
        this.f21079OoooOoO = i;
        this.f21080OoooOoo = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinScale(float f) {
        this.f21117o000oOoO = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumScaleType(int i) {
        if (!f21062o0000o.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid scale type: ", i));
        }
        this.f21078OoooOo0 = i;
        if (this.f21100o00000oO) {
            OooOO0o(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f21076OoooOOO = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (this.f21100o00000oO) {
            OooOo(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(OooOOO0 oooOOO0) {
        this.f21090o0000 = oooOOO0;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21114o0000oo = onLongClickListener;
    }

    public void setOnStateChangedListener(OooOOO oooOOO) {
        this.f21104o0000O00 = oooOOO;
    }

    public final void setOrientation(int i) {
        if (!f21061o0000OoO.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid orientation: ", i));
        }
        this.f21071OoooO = i;
        OooOo(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.f21083OooooO0 = z;
        if (z || (pointF = this.f21135ooOO) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f21089Ooooooo * (OooOoO() / 2));
        this.f21135ooOO.y = (getHeight() / 2) - (this.f21089Ooooooo * (OooOoO0() / 2));
        if (this.f21100o00000oO) {
            OooOo0O(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!f21065o0000o0o.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid pan limit: ", i));
        }
        this.f21077OoooOOo = i;
        if (this.f21100o00000oO) {
            OooOO0o(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.f21085OooooOo = z;
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends o00O00> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f21092o000000 = new o00oOoo(cls);
    }

    public final void setRegionDecoderFactory(@NonNull o00O000<? extends o00O00> o00o001) {
        if (o00o001 == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f21092o000000 = o00o001;
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f21102o0000O = null;
        } else {
            Paint paint = new Paint();
            this.f21102o0000O = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f21102o0000O.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.f21084OooooOO = z;
    }

    public final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f21137OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PointF f21138OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PointF f21139OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f21140OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f21141OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f21142OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f21143OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f21144OooO0oo;

        public OooO(PointF pointF) {
            this.f21140OooO0Oo = 500L;
            this.f21142OooO0o0 = 2;
            this.f21141OooO0o = 1;
            this.f21143OooO0oO = true;
            this.f21144OooO0oo = true;
            this.f21137OooO00o = SubsamplingScaleImageView.this.f21089Ooooooo;
            this.f21138OooO0O0 = pointF;
            this.f21139OooO0OO = null;
        }

        public final void OooO00o() {
            PointF pointF;
            OooOO0O oooOO0O;
            OooO0o oooO0o = SubsamplingScaleImageView.this.f21112o0000Ooo;
            if (oooO0o != null && (oooOO0O = oooO0o.f21161OooOOO0) != null) {
                try {
                    oooOO0O.OooO0O0();
                } catch (Exception e) {
                    List<Integer> list = SubsamplingScaleImageView.f21061o0000OoO;
                    Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", e);
                }
            }
            int width = (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2) + SubsamplingScaleImageView.this.getPaddingLeft();
            int height = (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2) + SubsamplingScaleImageView.this.getPaddingTop();
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            float fMin = Math.min(subsamplingScaleImageView.f21075OoooOO0, Math.max(subsamplingScaleImageView.OooOOo0(), this.f21137OooO00o));
            if (this.f21144OooO0oo) {
                SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                PointF pointF2 = this.f21138OooO0O0;
                float f = pointF2.x;
                float f2 = pointF2.y;
                pointF = new PointF();
                PointF pointFOooo000 = subsamplingScaleImageView2.Oooo000(f, f2, fMin);
                pointF.set((((((subsamplingScaleImageView2.getWidth() - subsamplingScaleImageView2.getPaddingRight()) - subsamplingScaleImageView2.getPaddingLeft()) / 2) + subsamplingScaleImageView2.getPaddingLeft()) - pointFOooo000.x) / fMin, (((((subsamplingScaleImageView2.getHeight() - subsamplingScaleImageView2.getPaddingBottom()) - subsamplingScaleImageView2.getPaddingTop()) / 2) + subsamplingScaleImageView2.getPaddingTop()) - pointFOooo000.y) / fMin);
            } else {
                pointF = this.f21138OooO0O0;
            }
            SubsamplingScaleImageView.this.f21112o0000Ooo = new OooO0o();
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            OooO0o oooO0o2 = subsamplingScaleImageView3.f21112o0000Ooo;
            oooO0o2.f21150OooO00o = subsamplingScaleImageView3.f21089Ooooooo;
            oooO0o2.f21151OooO0O0 = fMin;
            oooO0o2.f21160OooOO0o = System.currentTimeMillis();
            SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
            OooO0o oooO0o3 = subsamplingScaleImageView4.f21112o0000Ooo;
            oooO0o3.f21155OooO0o0 = pointF;
            oooO0o3.f21152OooO0OO = subsamplingScaleImageView4.getCenter();
            SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
            OooO0o oooO0o4 = subsamplingScaleImageView5.f21112o0000Ooo;
            oooO0o4.f21153OooO0Oo = pointF;
            oooO0o4.f21154OooO0o = subsamplingScaleImageView5.OooOoo(pointF);
            SubsamplingScaleImageView.this.f21112o0000Ooo.f21156OooO0oO = new PointF(width, height);
            OooO0o oooO0o5 = SubsamplingScaleImageView.this.f21112o0000Ooo;
            oooO0o5.f21157OooO0oo = this.f21140OooO0Oo;
            oooO0o5.f21149OooO = this.f21143OooO0oO;
            oooO0o5.f21158OooOO0 = this.f21142OooO0o0;
            oooO0o5.f21159OooOO0O = this.f21141OooO0o;
            oooO0o5.f21160OooOO0o = System.currentTimeMillis();
            OooO0o oooO0o6 = SubsamplingScaleImageView.this.f21112o0000Ooo;
            oooO0o6.f21161OooOOO0 = null;
            PointF pointF3 = this.f21139OooO0OO;
            if (pointF3 != null) {
                float f3 = pointF3.x;
                PointF pointF4 = oooO0o6.f21152OooO0OO;
                float f4 = f3 - (pointF4.x * fMin);
                float f5 = pointF3.y - (pointF4.y * fMin);
                PointF pointF5 = new PointF(f4, f5);
                SubsamplingScaleImageView.this.OooOOO0(true, new OooOOOO(fMin, pointF5));
                OooO0o oooO0o7 = SubsamplingScaleImageView.this.f21112o0000Ooo;
                PointF pointF6 = this.f21139OooO0OO;
                oooO0o7.f21156OooO0oO = new PointF((pointF5.x - f4) + pointF6.x, (pointF5.y - f5) + pointF6.y);
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public OooO(float f, PointF pointF) {
            this.f21140OooO0Oo = 500L;
            this.f21142OooO0o0 = 2;
            this.f21141OooO0o = 1;
            this.f21143OooO0oO = true;
            this.f21144OooO0oo = true;
            this.f21137OooO00o = f;
            this.f21138OooO0O0 = pointF;
            this.f21139OooO0OO = null;
        }

        public OooO(float f, PointF pointF, PointF pointF2) {
            this.f21140OooO0Oo = 500L;
            this.f21142OooO0o0 = 2;
            this.f21141OooO0o = 1;
            this.f21143OooO0oO = true;
            this.f21144OooO0oo = true;
            this.f21137OooO00o = f;
            this.f21138OooO0O0 = pointF;
            this.f21139OooO0OO = pointF2;
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }
}
