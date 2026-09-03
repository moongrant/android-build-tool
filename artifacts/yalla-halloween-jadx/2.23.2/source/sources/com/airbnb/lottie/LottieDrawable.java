package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.ULong;
import p134o00OO0o.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public final class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11760OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f11761OooO0Oo = new Matrix();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OOO0.OooOO0O f11762OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public com.airbnb.lottie.OooOO0 f11763OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f11764OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11765OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f11766OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<Oooo0> f11767OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o00OO0OO.OooO0O0 f11768OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o00OO0OO.OooO00o f11769OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public String f11770OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f11771OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.model.layer.OooO0O0 f11772OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f11773OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f11774OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f11775OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final boolean f11776OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f11777OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f11778OooOo0O;

    public class OooO implements ValueAnimator.AnimatorUpdateListener {
        public OooO() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            LottieDrawable lottieDrawable = LottieDrawable.this;
            com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = lottieDrawable.f11772OooOOOo;
            if (oooO0O0 != null) {
                o00OOO0.OooOO0O oooOO0O = lottieDrawable.f11762OooO0o;
                com.airbnb.lottie.OooOO0 oooOO1 = oooOO0O.f37430OooOOO0;
                if (oooOO1 == null) {
                    f = 0.0f;
                } else {
                    float f2 = oooOO0O.f37422OooO;
                    float f3 = oooOO1.f11822OooOO0O;
                    f = (f2 - f3) / (oooOO1.f11823OooOO0o - f3);
                }
                oooO0O0.OooOOoo(f);
            }
        }
    }

    public class OooO00o implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f11780OooO00o;

        public OooO00o(String str) {
            this.f11780OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOOO0(this.f11780OooO00o);
        }
    }

    public class OooO0O0 implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f11782OooO00o;

        public OooO0O0(int i) {
            this.f11782OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooO(this.f11782OooO00o);
        }
    }

    public class OooO0OO implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f11784OooO00o;

        public OooO0OO(float f) {
            this.f11784OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOOo0(this.f11784OooO00o);
        }
    }

    public class OooO0o implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ p135o00OO0o0.o00oO0o f11786OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Object f11787OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o00OOO0O.OooO0OO f11788OooO0OO;

        public OooO0o(p135o00OO0o0.o00oO0o o00oo0o2, Object obj, o00OOO0O.OooO0OO oooO0OO) {
            this.f11786OooO00o = o00oo0o2;
            this.f11787OooO0O0 = obj;
            this.f11788OooO0OO = oooO0OO;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooO00o(this.f11786OooO00o, this.f11787OooO0O0, this.f11788OooO0OO);
        }
    }

    public class OooOO0 implements Oooo0 {
        public OooOO0() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooO0o();
        }
    }

    public class OooOO0O implements Oooo0 {
        public OooOO0O() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooO0oO();
        }
    }

    public class OooOOO implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f11792OooO00o;

        public OooOOO(float f) {
            this.f11792OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOOOo(this.f11792OooO00o);
        }
    }

    public class OooOOO0 implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f11794OooO00o;

        public OooOOO0(int i) {
            this.f11794OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOOO(this.f11794OooO00o);
        }
    }

    public class OooOOOO implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f11796OooO00o;

        public OooOOOO(int i) {
            this.f11796OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOO0(this.f11796OooO00o);
        }
    }

    public class OooOo implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f11798OooO00o;

        public OooOo(String str) {
            this.f11798OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOOOO(this.f11798OooO00o);
        }
    }

    public class OooOo00 implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f11800OooO00o;

        public OooOo00(float f) {
            this.f11800OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOO0o(this.f11800OooO00o);
        }
    }

    public interface Oooo0 {
        void run();
    }

    public class Oooo000 implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f11802OooO00o;

        public Oooo000(String str) {
            this.f11802OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.Oooo0
        public final void run() {
            LottieDrawable.this.OooOO0O(this.f11802OooO00o);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        o00OOO0.OooOO0O oooOO0O = new o00OOO0.OooOO0O();
        this.f11762OooO0o = oooOO0O;
        this.f11764OooO0oO = 1.0f;
        this.f11765OooO0oo = true;
        this.f11760OooO = false;
        this.f11766OooOO0 = false;
        this.f11767OooOO0O = new ArrayList<>();
        OooO oooO = new OooO();
        this.f11774OooOOo0 = 255;
        this.f11776OooOo0 = true;
        this.f11778OooOo0O = false;
        oooOO0O.addUpdateListener(oooO);
    }

    public final void OooO(int i) {
        if (this.f11763OooO0o0 == null) {
            this.f11767OooOO0O.add(new OooO0O0(i));
        } else {
            this.f11762OooO0o.OooO(i);
        }
    }

    public final <T> void OooO00o(p135o00OO0o0.o00oO0o o00oo0o2, T t, @Nullable o00OOO0O.OooO0OO<T> oooO0OO) {
        float f;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = this.f11772OooOOOo;
        if (oooO0O0 == null) {
            this.f11767OooOO0O.add(new OooO0o(o00oo0o2, t, oooO0OO));
            return;
        }
        boolean zIsEmpty = true;
        if (o00oo0o2 == p135o00OO0o0.o00oO0o.f37326OooO0OO) {
            oooO0O0.OooO0Oo(oooO0OO, t);
        } else {
            p135o00OO0o0.o0ooOOo o0ooooo = o00oo0o2.f37328OooO0O0;
            if (o0ooooo != null) {
                o0ooooo.OooO0Oo(oooO0OO, t);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f11772OooOOOo.OooO0o0(o00oo0o2, 0, arrayList, new p135o00OO0o0.o00oO0o(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((p135o00OO0o0.o00oO0o) arrayList.get(i)).f37328OooO0O0.OooO0Oo(oooO0OO, t);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == o00Oo0.f12000OooOooo) {
                o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
                com.airbnb.lottie.OooOO0 oooOO1 = oooOO0O.f37430OooOOO0;
                if (oooOO1 == null) {
                    f = 0.0f;
                } else {
                    float f2 = oooOO0O.f37422OooO;
                    float f3 = oooOO1.f11822OooOO0O;
                    f = (f2 - f3) / (oooOO1.f11823OooOO0o - f3);
                }
                OooOOo0(f);
            }
        }
    }

    public final boolean OooO0O0() {
        return this.f11765OooO0oo || this.f11760OooO;
    }

    public final void OooO0OO() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        JsonReader.OooO00o oooO00o = o00OO.o0ooOOo.f36912OooO00o;
        Rect rect = oooOO1.f11821OooOO0;
        Layer layer = new Layer(Collections.emptyList(), oooOO1, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new o000000O(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
        com.airbnb.lottie.OooOO0 oooOO2 = this.f11763OooO0o0;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = new com.airbnb.lottie.model.layer.OooO0O0(this, layer, oooOO2.f11812OooO, oooOO2);
        this.f11772OooOOOo = oooO0O0;
        if (this.f11775OooOOoo) {
            oooO0O0.OooOOo(true);
        }
    }

    public final void OooO0Oo() {
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        if (oooOO0O.f37429OooOOO) {
            oooOO0O.cancel();
        }
        this.f11763OooO0o0 = null;
        this.f11772OooOOOo = null;
        this.f11768OooOO0o = null;
        oooOO0O.f37430OooOOO0 = null;
        oooOO0O.f37427OooOO0O = -2.14748365E9f;
        oooOO0O.f37428OooOO0o = 2.14748365E9f;
        invalidateSelf();
    }

    @MainThread
    public final void OooO0o() {
        if (this.f11772OooOOOo == null) {
            this.f11767OooOO0O.add(new OooOO0());
            return;
        }
        boolean zOooO0O0 = OooO0O0();
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        if (zOooO0O0 || oooOO0O.getRepeatCount() == 0) {
            oooOO0O.f37429OooOOO = true;
            boolean zOooO0oO = oooOO0O.OooO0oO();
            for (Animator.AnimatorListener animatorListener : oooOO0O.f37420OooO0o0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(oooOO0O, zOooO0oO);
                } else {
                    animatorListener.onAnimationStart(oooOO0O);
                }
            }
            oooOO0O.OooO((int) (oooOO0O.OooO0oO() ? oooOO0O.OooO0o0() : oooOO0O.OooO0o()));
            oooOO0O.f37425OooO0oo = 0L;
            oooOO0O.f37426OooOO0 = 0;
            if (oooOO0O.f37429OooOOO) {
                oooOO0O.OooO0oo(false);
                Choreographer.getInstance().postFrameCallback(oooOO0O);
            }
        }
        if (OooO0O0()) {
            return;
        }
        OooO((int) (oooOO0O.f37423OooO0o < 0.0f ? oooOO0O.OooO0o() : oooOO0O.OooO0o0()));
        oooOO0O.OooO0oo(true);
        oooOO0O.OooO0O0(oooOO0O.OooO0oO());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public final void OooO0o0(@NonNull Canvas canvas) {
        boolean z;
        float f;
        float f2;
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null || getBounds().isEmpty()) {
            z = true;
        } else {
            Rect bounds = getBounds();
            float fWidth = bounds.width() / bounds.height();
            Rect rect = oooOO1.f11821OooOO0;
            if (fWidth == rect.width() / rect.height()) {
                z = true;
            } else {
                z = false;
            }
        }
        Matrix matrix = this.f11761OooO0Oo;
        int iSave = -1;
        if (z) {
            if (this.f11772OooOOOo == null) {
                return;
            }
            float f3 = this.f11764OooO0oO;
            float fMin = Math.min(canvas.getWidth() / this.f11763OooO0o0.f11821OooOO0.width(), canvas.getHeight() / this.f11763OooO0o0.f11821OooOO0.height());
            if (f3 > fMin) {
                f = this.f11764OooO0oO / fMin;
            } else {
                fMin = f3;
                f = 1.0f;
            }
            if (f > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = this.f11763OooO0o0.f11821OooOO0.width() / 2.0f;
                float fHeight = this.f11763OooO0o0.f11821OooOO0.height() / 2.0f;
                float f4 = fWidth2 * fMin;
                float f5 = fHeight * fMin;
                float f6 = this.f11764OooO0oO;
                canvas.translate((fWidth2 * f6) - f4, (f6 * fHeight) - f5);
                canvas.scale(f, f, f4, f5);
            }
            matrix.reset();
            matrix.preScale(fMin, fMin);
            this.f11772OooOOOo.OooO0oo(canvas, matrix, this.f11774OooOOo0);
            if (iSave > 0) {
                canvas.restoreToCount(iSave);
                return;
            }
            return;
        }
        if (this.f11772OooOOOo == null) {
            return;
        }
        Rect bounds2 = getBounds();
        float fWidth3 = bounds2.width() / this.f11763OooO0o0.f11821OooOO0.width();
        float fHeight2 = bounds2.height() / this.f11763OooO0o0.f11821OooOO0.height();
        if (this.f11776OooOo0) {
            float fMin2 = Math.min(fWidth3, fHeight2);
            if (fMin2 < 1.0f) {
                f2 = 1.0f / fMin2;
                fWidth3 /= f2;
                fHeight2 /= f2;
            } else {
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                iSave = canvas.save();
                float fWidth4 = bounds2.width() / 2.0f;
                float fHeight3 = bounds2.height() / 2.0f;
                float f7 = fWidth4 * fMin2;
                float f8 = fMin2 * fHeight3;
                canvas.translate(fWidth4 - f7, fHeight3 - f8);
                canvas.scale(f2, f2, f7, f8);
            }
        }
        matrix.reset();
        matrix.preScale(fWidth3, fHeight2);
        this.f11772OooOOOo.OooO0oo(canvas, matrix, this.f11774OooOOo0);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    @MainThread
    public final void OooO0oO() {
        if (this.f11772OooOOOo == null) {
            this.f11767OooOO0O.add(new OooOO0O());
            return;
        }
        boolean zOooO0O0 = OooO0O0();
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        if (zOooO0O0 || oooOO0O.getRepeatCount() == 0) {
            oooOO0O.f37429OooOOO = true;
            oooOO0O.OooO0oo(false);
            Choreographer.getInstance().postFrameCallback(oooOO0O);
            oooOO0O.f37425OooO0oo = 0L;
            if (oooOO0O.OooO0oO() && oooOO0O.f37422OooO == oooOO0O.OooO0o()) {
                oooOO0O.f37422OooO = oooOO0O.OooO0o0();
            } else if (!oooOO0O.OooO0oO() && oooOO0O.f37422OooO == oooOO0O.OooO0o0()) {
                oooOO0O.f37422OooO = oooOO0O.OooO0o();
            }
        }
        if (OooO0O0()) {
            return;
        }
        OooO((int) (oooOO0O.f37423OooO0o < 0.0f ? oooOO0O.OooO0o() : oooOO0O.OooO0o0()));
        oooOO0O.OooO0oo(true);
        oooOO0O.OooO0O0(oooOO0O.OooO0oO());
    }

    public final boolean OooO0oo(com.airbnb.lottie.OooOO0 oooOO1) {
        if (this.f11763OooO0o0 == oooOO1) {
            return false;
        }
        this.f11778OooOo0O = false;
        OooO0Oo();
        this.f11763OooO0o0 = oooOO1;
        OooO0OO();
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        boolean z = oooOO0O.f37430OooOOO0 == null;
        oooOO0O.f37430OooOOO0 = oooOO1;
        if (z) {
            oooOO0O.OooOO0((int) Math.max(oooOO0O.f37427OooOO0O, oooOO1.f11822OooOO0O), (int) Math.min(oooOO0O.f37428OooOO0o, oooOO1.f11823OooOO0o));
        } else {
            oooOO0O.OooOO0((int) oooOO1.f11822OooOO0O, (int) oooOO1.f11823OooOO0o);
        }
        float f = oooOO0O.f37422OooO;
        oooOO0O.f37422OooO = 0.0f;
        oooOO0O.OooO((int) f);
        oooOO0O.OooO0Oo();
        OooOOo0(oooOO0O.getAnimatedFraction());
        this.f11764OooO0oO = this.f11764OooO0oO;
        ArrayList<Oooo0> arrayList = this.f11767OooOO0O;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            Oooo0 oooo0 = (Oooo0) it.next();
            if (oooo0 != null) {
                oooo0.run();
            }
            it.remove();
        }
        arrayList.clear();
        oooOO1.f11813OooO00o.f12018OooO00o = this.f11773OooOOo;
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void OooOO0(int i) {
        if (this.f11763OooO0o0 == null) {
            this.f11767OooOO0O.add(new OooOOOO(i));
            return;
        }
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        oooOO0O.OooOO0(oooOO0O.f37427OooOO0O, i + 0.99f);
    }

    public final void OooOO0O(String str) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            this.f11767OooOO0O.add(new Oooo000(str));
            return;
        }
        p135o00OO0o0.o0Oo0oo o0oo0ooOooO0OO = oooOO1.OooO0OO(str);
        if (o0oo0ooOooO0OO == null) {
            throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO0O0("Cannot find marker with name ", str, "."));
        }
        OooOO0((int) (o0oo0ooOooO0OO.f37334OooO0O0 + o0oo0ooOooO0OO.f37335OooO0OO));
    }

    public final void OooOO0o(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            this.f11767OooOO0O.add(new OooOo00(f));
            return;
        }
        float f2 = oooOO1.f11822OooOO0O;
        float f3 = oooOO1.f11823OooOO0o;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        OooOO0((int) OooOo.OooO0o.OooO00o(f3, f2, f, f2));
    }

    public final void OooOOO(int i) {
        if (this.f11763OooO0o0 == null) {
            this.f11767OooOO0O.add(new OooOOO0(i));
        } else {
            o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
            oooOO0O.OooOO0(i, (int) oooOO0O.f37428OooOO0o);
        }
    }

    public final void OooOOO0(String str) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        ArrayList<Oooo0> arrayList = this.f11767OooOO0O;
        if (oooOO1 == null) {
            arrayList.add(new OooO00o(str));
            return;
        }
        p135o00OO0o0.o0Oo0oo o0oo0ooOooO0OO = oooOO1.OooO0OO(str);
        if (o0oo0ooOooO0OO == null) {
            throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO0O0("Cannot find marker with name ", str, "."));
        }
        int i = (int) o0oo0ooOooO0OO.f37334OooO0O0;
        int i2 = ((int) o0oo0ooOooO0OO.f37335OooO0OO) + i;
        if (this.f11763OooO0o0 == null) {
            arrayList.add(new com.airbnb.lottie.Oooo0(this, i, i2));
        } else {
            this.f11762OooO0o.OooOO0(i, i2 + 0.99f);
        }
    }

    public final void OooOOOO(String str) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            this.f11767OooOO0O.add(new OooOo(str));
            return;
        }
        p135o00OO0o0.o0Oo0oo o0oo0ooOooO0OO = oooOO1.OooO0OO(str);
        if (o0oo0ooOooO0OO == null) {
            throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO0O0("Cannot find marker with name ", str, "."));
        }
        OooOOO((int) o0oo0ooOooO0OO.f37334OooO0O0);
    }

    public final void OooOOOo(float f) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            this.f11767OooOO0O.add(new OooOOO(f));
            return;
        }
        float f2 = oooOO1.f11822OooOO0O;
        float f3 = oooOO1.f11823OooOO0o;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        OooOOO((int) OooOo.OooO0o.OooO00o(f3, f2, f, f2));
    }

    public final void OooOOo0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            this.f11767OooOO0O.add(new OooO0OO(f));
            return;
        }
        float f2 = oooOO1.f11822OooOO0O;
        float f3 = oooOO1.f11823OooOO0o;
        PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
        this.f11762OooO0o.OooO(OooOo.OooO0o.OooO00o(f3, f2, f, f2));
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        this.f11778OooOo0O = false;
        if (this.f11766OooOO0) {
            try {
                OooO0o0(canvas);
            } catch (Throwable unused) {
                o00OOO0.OooOO0.f37421OooO00o.getClass();
            }
        } else {
            OooO0o0(canvas);
        }
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11774OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            return -1;
        }
        return (int) (oooOO1.f11821OooOO0.height() * this.f11764OooO0oO);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f11763OooO0o0;
        if (oooOO1 == null) {
            return -1;
        }
        return (int) (oooOO1.f11821OooOO0.width() * this.f11764OooO0oO);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f11778OooOo0O) {
            return;
        }
        this.f11778OooOo0O = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        if (oooOO0O == null) {
            return false;
        }
        return oooOO0O.f37429OooOOO;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = ULong.MIN_VALUE, to = 255) int i) {
        this.f11774OooOOo0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        o00OOO0.OooOO0.OooO0O0("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        OooO0o();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public final void stop() {
        this.f11767OooOO0O.clear();
        o00OOO0.OooOO0O oooOO0O = this.f11762OooO0o;
        oooOO0O.OooO0oo(true);
        oooOO0O.OooO0O0(oooOO0O.OooO0oO());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
