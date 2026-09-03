package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.KotlinVersion;
import kotlin.ULong;
import p127o00O0oO.o000;
import p129o00O0oOo.o000O0;
import p129o00O0oOo.o000O00;
import p129o00O0oOo.o000Oo0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;
import p225o00oOOo.o00OO000;
import p225o00oOOo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f9983Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Matrix f9984Oooo0o = new Matrix();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public com.airbnb.lottie.OooOO0O f9985Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o000O00 f9986Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final ArrayList<o000oOoO> f9987OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f9988OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f9989OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f9990OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooOO0 f9991OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public String f9992OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.OooO0O0 f9993OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public p124o00O0o00.OooO0o f9994OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f9995OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.model.layer.OooO0O0 f9996OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f9997Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f9998Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f9999OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f10000OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f10001OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f10002Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public p124o00O0o00.OooO f10003o000oOoO;

    public class OooO implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O0OOO f10004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Object f10005OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o000000O f10006OooO0OO;

        public OooO(o00O0OOO o00o0ooo2, Object obj, o000000O o000000o2) {
            this.f10004OooO00o = o00o0ooo2;
            this.f10005OooO0O0 = obj;
            this.f10006OooO0OO = o000000o2;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooO00o(this.f10004OooO00o, this.f10005OooO0O0, this.f10006OooO0OO);
        }
    }

    public class OooO00o implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f10008OooO00o;

        public OooO00o(String str) {
            this.f10008OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOoo(this.f10008OooO00o);
        }
    }

    public class OooO0O0 implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f10010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f10011OooO0O0;

        public OooO0O0(int i, int i2) {
            this.f10010OooO00o = i;
            this.f10011OooO0O0 = i2;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOo(this.f10010OooO00o, this.f10011OooO0O0);
        }
    }

    public class OooO0OO implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f10013OooO00o;

        public OooO0OO(int i) {
            this.f10013OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOO(this.f10013OooO00o);
        }
    }

    public class OooO0o implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f10015OooO00o;

        public OooO0o(float f) {
            this.f10015OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOo0o(this.f10015OooO00o);
        }
    }

    public class OooOO0 implements ValueAnimator.AnimatorUpdateListener {
        public OooOO0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LottieDrawable lottieDrawable = LottieDrawable.this;
            com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = lottieDrawable.f9996OoooOoo;
            if (oooO0O0 != null) {
                oooO0O0.OooOo0(lottieDrawable.f9986Oooo0oo.OooO0oO());
            }
        }
    }

    public class OooOO0O implements o000oOoO {
        public OooOO0O() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOO0O();
        }
    }

    public class OooOOO implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f10019OooO00o;

        public OooOOO(int i) {
            this.f10019OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOo00(this.f10019OooO00o);
        }
    }

    public class OooOOO0 implements o000oOoO {
        public OooOOO0() {
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOO0o();
        }
    }

    public class OooOOOO implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f10022OooO00o;

        public OooOOOO(float f) {
            this.f10022OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOo0O(this.f10022OooO00o);
        }
    }

    public class OooOo implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ float f10024OooO00o;

        public OooOo(float f) {
            this.f10024OooO00o = f;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOo0(this.f10024OooO00o);
        }
    }

    public class OooOo00 implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f10026OooO00o;

        public OooOo00(int i) {
            this.f10026OooO00o = i;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOOO(this.f10026OooO00o);
        }
    }

    public class Oooo0 implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f10028OooO00o;

        public Oooo0(String str) {
            this.f10028OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOOOo(this.f10028OooO00o);
        }
    }

    public class Oooo000 implements o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f10030OooO00o;

        public Oooo000(String str) {
            this.f10030OooO00o = str;
        }

        @Override // com.airbnb.lottie.LottieDrawable.o000oOoO
        public final void run() {
            LottieDrawable.this.OooOo0(this.f10030OooO00o);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public interface o000oOoO {
        void run();
    }

    public LottieDrawable() {
        o000O00 o000o01 = new o000O00();
        this.f9986Oooo0oo = o000o01;
        this.f9983Oooo = 1.0f;
        this.f9989OoooO00 = true;
        this.f9988OoooO0 = false;
        this.f9990OoooO0O = false;
        this.f9987OoooO = new ArrayList<>();
        OooOO0 oooOO1 = new OooOO0();
        this.f9991OoooOO0 = oooOO1;
        this.f9997Ooooo00 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f10001OooooOo = true;
        this.f10002Oooooo0 = false;
        o000o01.addUpdateListener(oooOO1);
    }

    public final int OooO() {
        return this.f9986Oooo0oo.getRepeatCount();
    }

    public final <T> void OooO00o(o00O0OOO o00o0ooo2, T t, @Nullable o000000O<T> o000000o2) {
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = this.f9996OoooOoo;
        if (oooO0O0 == null) {
            this.f9987OoooO.add(new OooO(o00o0ooo2, t, o000000o2));
            return;
        }
        boolean zIsEmpty = true;
        if (o00o0ooo2 == o00O0OOO.f33864OooO0OO) {
            oooO0O0.OooO0o0(t, o000000o2);
        } else {
            oo0oOO0 oo0ooo0 = o00o0ooo2.f33866OooO0O0;
            if (oo0ooo0 != null) {
                oo0ooo0.OooO0o0(t, o000000o2);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f9996OoooOoo.OooO0Oo(o00o0ooo2, 0, arrayList, new o00O0OOO(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((o00O0OOO) arrayList.get(i)).f33866OooO0O0.OooO0o0(t, o000000o2);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == com.airbnb.lottie.o000oOoO.f10228OooOooo) {
                OooOo0o(OooO0oo());
            }
        }
    }

    public final boolean OooO0O0() {
        return this.f9989OoooO00 || this.f9988OoooO0;
    }

    public final void OooO0OO() {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        JsonReader.OooO00o oooO00o = o000.f31065OooO00o;
        Rect rect = oooOO0O.f10049OooOO0;
        Layer layer = new Layer(Collections.emptyList(), oooOO0O, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new p123o00O0o0.o00O0O(), 0, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
        com.airbnb.lottie.OooOO0O oooOO0O2 = this.f9985Oooo0oO;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = new com.airbnb.lottie.model.layer.OooO0O0(this, layer, oooOO0O2.f10040OooO, oooOO0O2);
        this.f9996OoooOoo = oooO0O0;
        if (this.f9999OooooO0) {
            oooO0O0.OooOo00(true);
        }
    }

    public final void OooO0Oo() {
        o000O00 o000o01 = this.f9986Oooo0oo;
        if (o000o01.f31136OoooOOO) {
            o000o01.cancel();
        }
        this.f9985Oooo0oO = null;
        this.f9996OoooOoo = null;
        this.f10003o000oOoO = null;
        o000O00 o000o02 = this.f9986Oooo0oo;
        o000o02.f31137o000oOoO = null;
        o000o02.f31131OoooO = -2.14748365E9f;
        o000o02.f31135OoooOO0 = 2.14748365E9f;
        invalidateSelf();
    }

    public final float OooO0o() {
        return this.f9986Oooo0oo.OooO();
    }

    public final void OooO0o0(@NonNull Canvas canvas) {
        float f;
        float f2;
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        boolean z = true;
        if (oooOO0O != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            float fWidth = bounds.width() / bounds.height();
            Rect rect = oooOO0O.f10049OooOO0;
            if (fWidth != rect.width() / rect.height()) {
                z = false;
            }
        }
        int iSave = -1;
        if (z) {
            if (this.f9996OoooOoo == null) {
                return;
            }
            float f3 = this.f9983Oooo;
            float fMin = Math.min(canvas.getWidth() / this.f9985Oooo0oO.f10049OooOO0.width(), canvas.getHeight() / this.f9985Oooo0oO.f10049OooOO0.height());
            if (f3 > fMin) {
                f = this.f9983Oooo / fMin;
            } else {
                fMin = f3;
                f = 1.0f;
            }
            if (f > 1.0f) {
                iSave = canvas.save();
                float fWidth2 = this.f9985Oooo0oO.f10049OooOO0.width() / 2.0f;
                float fHeight = this.f9985Oooo0oO.f10049OooOO0.height() / 2.0f;
                float f4 = fWidth2 * fMin;
                float f5 = fHeight * fMin;
                float f6 = this.f9983Oooo;
                canvas.translate((fWidth2 * f6) - f4, (f6 * fHeight) - f5);
                canvas.scale(f, f, f4, f5);
            }
            this.f9984Oooo0o.reset();
            this.f9984Oooo0o.preScale(fMin, fMin);
            this.f9996OoooOoo.OooO0oo(canvas, this.f9984Oooo0o, this.f9997Ooooo00);
            if (iSave > 0) {
                canvas.restoreToCount(iSave);
                return;
            }
            return;
        }
        if (this.f9996OoooOoo == null) {
            return;
        }
        Rect bounds2 = getBounds();
        float fWidth3 = bounds2.width() / this.f9985Oooo0oO.f10049OooOO0.width();
        float fHeight2 = bounds2.height() / this.f9985Oooo0oO.f10049OooOO0.height();
        if (this.f10001OooooOo) {
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
        this.f9984Oooo0o.reset();
        this.f9984Oooo0o.preScale(fWidth3, fHeight2);
        this.f9996OoooOoo.OooO0oo(canvas, this.f9984Oooo0o, this.f9997Ooooo00);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    public final float OooO0oO() {
        return this.f9986Oooo0oo.OooOO0();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float OooO0oo() {
        return this.f9986Oooo0oo.OooO0oO();
    }

    public final boolean OooOO0() {
        o000O00 o000o01 = this.f9986Oooo0oo;
        if (o000o01 == null) {
            return false;
        }
        return o000o01.f31136OoooOOO;
    }

    @MainThread
    public final void OooOO0O() {
        if (this.f9996OoooOoo == null) {
            this.f9987OoooO.add(new OooOO0O());
            return;
        }
        if (OooO0O0() || OooO() == 0) {
            o000O00 o000o01 = this.f9986Oooo0oo;
            o000o01.f31136OoooOOO = true;
            o000o01.OooO0Oo(o000o01.OooOO0O());
            o000o01.OooOOO((int) (o000o01.OooOO0O() ? o000o01.OooO() : o000o01.OooOO0()));
            o000o01.f31133OoooO00 = 0L;
            o000o01.f31134OoooO0O = 0;
            o000o01.OooOO0o();
        }
        if (OooO0O0()) {
            return;
        }
        OooOOO((int) (this.f9986Oooo0oo.f31130Oooo0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? OooO0oO() : OooO0o()));
        this.f9986Oooo0oo.OooO0o();
    }

    @MainThread
    public final void OooOO0o() {
        if (this.f9996OoooOoo == null) {
            this.f9987OoooO.add(new OooOOO0());
            return;
        }
        if (OooO0O0() || OooO() == 0) {
            o000O00 o000o01 = this.f9986Oooo0oo;
            o000o01.f31136OoooOOO = true;
            o000o01.OooOO0o();
            o000o01.f31133OoooO00 = 0L;
            if (o000o01.OooOO0O() && o000o01.f31132OoooO0 == o000o01.OooOO0()) {
                o000o01.f31132OoooO0 = o000o01.OooO();
            } else if (!o000o01.OooOO0O() && o000o01.f31132OoooO0 == o000o01.OooO()) {
                o000o01.f31132OoooO0 = o000o01.OooOO0();
            }
        }
        if (OooO0O0()) {
            return;
        }
        OooOOO((int) (this.f9986Oooo0oo.f31130Oooo0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? OooO0oO() : OooO0o()));
        this.f9986Oooo0oo.OooO0o();
    }

    public final void OooOOO(int i) {
        if (this.f9985Oooo0oO == null) {
            this.f9987OoooO.add(new OooO0OO(i));
        } else {
            this.f9986Oooo0oo.OooOOO(i);
        }
    }

    public final boolean OooOOO0(com.airbnb.lottie.OooOO0O oooOO0O) {
        if (this.f9985Oooo0oO == oooOO0O) {
            return false;
        }
        this.f10002Oooooo0 = false;
        OooO0Oo();
        this.f9985Oooo0oO = oooOO0O;
        OooO0OO();
        o000O00 o000o01 = this.f9986Oooo0oo;
        boolean z = o000o01.f31137o000oOoO == null;
        o000o01.f31137o000oOoO = oooOO0O;
        if (z) {
            o000o01.OooOOOO((int) Math.max(o000o01.f31131OoooO, oooOO0O.f10050OooOO0O), (int) Math.min(o000o01.f31135OoooOO0, oooOO0O.f10051OooOO0o));
        } else {
            o000o01.OooOOOO((int) oooOO0O.f10050OooOO0O, (int) oooOO0O.f10051OooOO0o);
        }
        float f = o000o01.f31132OoooO0;
        o000o01.f31132OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        o000o01.OooOOO((int) f);
        o000o01.OooO0o0();
        OooOo0o(this.f9986Oooo0oo.getAnimatedFraction());
        this.f9983Oooo = this.f9983Oooo;
        Iterator it = new ArrayList(this.f9987OoooO).iterator();
        while (it.hasNext()) {
            o000oOoO o000oooo2 = (o000oOoO) it.next();
            if (o000oooo2 != null) {
                o000oooo2.run();
            }
            it.remove();
        }
        this.f9987OoooO.clear();
        oooOO0O.f10041OooO00o.f10245OooO00o = this.f9998Ooooo0o;
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void OooOOOO(int i) {
        if (this.f9985Oooo0oO == null) {
            this.f9987OoooO.add(new OooOo00(i));
            return;
        }
        o000O00 o000o01 = this.f9986Oooo0oo;
        o000o01.OooOOOO(o000o01.f31131OoooO, i + 0.99f);
    }

    public final void OooOOOo(String str) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new Oooo0(str));
            return;
        }
        o00OO000 o00oo000OooO0OO = oooOO0O.OooO0OO(str);
        if (o00oo000OooO0OO == null) {
            throw new IllegalArgumentException(OooO0o.OooO0OO.OooO00o("Cannot find marker with name ", str, "."));
        }
        OooOOOO((int) (o00oo000OooO0OO.f33868OooO0O0 + o00oo000OooO0OO.f33869OooO0OO));
    }

    public final void OooOOo(int i, int i2) {
        if (this.f9985Oooo0oO == null) {
            this.f9987OoooO.add(new OooO0O0(i, i2));
        } else {
            this.f9986Oooo0oo.OooOOOO(i, i2 + 0.99f);
        }
    }

    public final void OooOOo0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new OooOo(f));
            return;
        }
        float f2 = oooOO0O.f10050OooOO0O;
        float f3 = oooOO0O.f10051OooOO0o;
        PointF pointF = o000O0.f31128OooO00o;
        OooOOOO((int) Oooo000.OooO00o.OooO00o(f3, f2, f, f2));
    }

    public final void OooOOoo(String str) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new OooO00o(str));
            return;
        }
        o00OO000 o00oo000OooO0OO = oooOO0O.OooO0OO(str);
        if (o00oo000OooO0OO == null) {
            throw new IllegalArgumentException(OooO0o.OooO0OO.OooO00o("Cannot find marker with name ", str, "."));
        }
        int i = (int) o00oo000OooO0OO.f33868OooO0O0;
        OooOOo(i, ((int) o00oo000OooO0OO.f33869OooO0OO) + i);
    }

    public final void OooOo0(String str) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new Oooo000(str));
            return;
        }
        o00OO000 o00oo000OooO0OO = oooOO0O.OooO0OO(str);
        if (o00oo000OooO0OO == null) {
            throw new IllegalArgumentException(OooO0o.OooO0OO.OooO00o("Cannot find marker with name ", str, "."));
        }
        OooOo00((int) o00oo000OooO0OO.f33868OooO0O0);
    }

    public final void OooOo00(int i) {
        if (this.f9985Oooo0oO == null) {
            this.f9987OoooO.add(new OooOOO(i));
        } else {
            o000O00 o000o01 = this.f9986Oooo0oo;
            o000o01.OooOOOO(i, (int) o000o01.f31135OoooOO0);
        }
    }

    public final void OooOo0O(float f) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new OooOOOO(f));
            return;
        }
        float f2 = oooOO0O.f10050OooOO0O;
        float f3 = oooOO0O.f10051OooOO0o;
        PointF pointF = o000O0.f31128OooO00o;
        OooOo00((int) Oooo000.OooO00o.OooO00o(f3, f2, f, f2));
    }

    public final void OooOo0o(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            this.f9987OoooO.add(new OooO0o(f));
            return;
        }
        o000O00 o000o01 = this.f9986Oooo0oo;
        float f2 = oooOO0O.f10050OooOO0O;
        float f3 = oooOO0O.f10051OooOO0o;
        PointF pointF = o000O0.f31128OooO00o;
        o000o01.OooOOO(((f3 - f2) * f) + f2);
        com.airbnb.lottie.OooO0o.OooO00o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        this.f10002Oooooo0 = false;
        if (this.f9990OoooO0O) {
            try {
                OooO0o0(canvas);
            } catch (Throwable unused) {
                o000Oo0.OooO0O0();
            }
        } else {
            OooO0o0(canvas);
        }
        com.airbnb.lottie.OooO0o.OooO00o();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9997Ooooo00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            return -1;
        }
        return (int) (oooOO0O.f10049OooOO0.height() * this.f9983Oooo);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        com.airbnb.lottie.OooOO0O oooOO0O = this.f9985Oooo0oO;
        if (oooOO0O == null) {
            return -1;
        }
        return (int) (oooOO0O.f10049OooOO0.width() * this.f9983Oooo);
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
        if (this.f10002Oooooo0) {
            return;
        }
        this.f10002Oooooo0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return OooOO0();
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
        this.f9997Ooooo00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        o000Oo0.OooO0OO("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        OooOO0O();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public final void stop() {
        this.f9987OoooO.clear();
        this.f9986Oooo0oo.OooO0o();
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
