package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import javax.net.ssl.SSLException;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f8640OooOo0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f8641OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f8642OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0OoOo0<Throwable> f8643OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f8644OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @DrawableRes
    public int f8645OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LottieDrawable f8646OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f8647OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @RawRes
    public int f8648OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8649OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f8650OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f8651OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8652OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f8653OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RenderMode f8654OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f8655OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashSet f8656OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public o00oO0o<OooOO0> f8657OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f8658OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public OooOO0 f8659OooOo0O;

    public class OooO00o implements o0OoOo0<Throwable> {
        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(Throwable th) {
            Throwable th2 = th;
            o00O0.OooOOOO.OooO00o oooO00o = o00O0.OooOOOO.f35982OooO00o;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            o00O0.OooOO0.OooO0OO("Unable to load composition.", th2);
        }
    }

    public class OooO0O0 implements o0OoOo0<OooOO0> {
        public OooO0O0() {
        }

        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(OooOO0 oooOO1) {
            LottieAnimationView.this.setComposition(oooOO1);
        }
    }

    public class OooO0OO implements o0OoOo0<Throwable> {
        public OooO0OO() {
        }

        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.f8645OooO0oO;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            o0OoOo0 o0oooo0 = lottieAnimationView.f8643OooO0o;
            if (o0oooo0 == null) {
                o0oooo0 = LottieAnimationView.f8640OooOo0o;
            }
            o0oooo0.OooO00o(th2);
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8662OooO00o;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f8662OooO00o = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8662OooO00o[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8662OooO00o[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f8663OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f8664OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f8665OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8666OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f8667OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f8668OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f8669OooOO0;

        public class OooO00o implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f8664OooO0Oo = parcel.readString();
            this.f8665OooO0o = parcel.readFloat();
            this.f8667OooO0oO = parcel.readInt() == 1;
            this.f8668OooO0oo = parcel.readString();
            this.f8663OooO = parcel.readInt();
            this.f8669OooOO0 = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f8664OooO0Oo);
            parcel.writeFloat(this.f8665OooO0o);
            parcel.writeInt(this.f8667OooO0oO ? 1 : 0);
            parcel.writeString(this.f8668OooO0oo);
            parcel.writeInt(this.f8663OooO);
            parcel.writeInt(this.f8669OooOO0);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f8642OooO0Oo = new OooO0O0();
        this.f8644OooO0o0 = new OooO0OO();
        this.f8645OooO0oO = 0;
        this.f8646OooO0oo = new LottieDrawable();
        this.f8649OooOO0o = false;
        this.f8651OooOOO0 = false;
        this.f8650OooOOO = false;
        this.f8652OooOOOO = false;
        this.f8653OooOOOo = false;
        this.f8655OooOOo0 = true;
        this.f8654OooOOo = RenderMode.AUTOMATIC;
        this.f8656OooOOoo = new HashSet();
        this.f8658OooOo00 = 0;
        OooO0o(null, o0OOO0o.lottieAnimationViewStyle);
    }

    private void setCompositionTask(o00oO0o<OooOO0> o00oo0o2) {
        this.f8659OooOo0O = null;
        this.f8646OooO0oo.OooO0Oo();
        OooO0Oo();
        o00oo0o2.OooO0OO(this.f8642OooO0Oo);
        o00oo0o2.OooO0O0(this.f8644OooO0o0);
        this.f8657OooOo0 = o00oo0o2;
    }

    @MainThread
    public final void OooO0OO() {
        this.f8650OooOOO = false;
        this.f8651OooOOO0 = false;
        this.f8649OooOO0o = false;
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        lottieDrawable.f8677OooOO0O.clear();
        lottieDrawable.f8672OooO0o.cancel();
        OooO0o0();
    }

    public final void OooO0Oo() {
        o00oO0o<OooOO0> o00oo0o2 = this.f8657OooOo0;
        if (o00oo0o2 != null) {
            OooO0O0 oooO0O0 = this.f8642OooO0Oo;
            synchronized (o00oo0o2) {
                o00oo0o2.f8923OooO00o.remove(oooO0O0);
            }
            this.f8657OooOo0.OooO0Oo(this.f8644OooO0o0);
        }
    }

    public final void OooO0o(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0Oo0oo.LottieAnimationView, i, 0);
        this.f8655OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = o0Oo0oo.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = o0Oo0oo.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = o0Oo0oo.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(o0Oo0oo.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_autoPlay, false)) {
            this.f8650OooOOO = true;
            this.f8653OooOOOo = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_loop, false);
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        if (z) {
            lottieDrawable.f8672OooO0o.setRepeatCount(-1);
        }
        int i5 = o0Oo0oo.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = o0Oo0oo.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = o0Oo0oo.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(o0Oo0oo.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(o0Oo0oo.LottieAnimationView_lottie_progress, 0.0f));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        if (lottieDrawable.f8681OooOOOO != z2) {
            lottieDrawable.f8681OooOOOO = z2;
            if (lottieDrawable.f8673OooO0o0 != null) {
                lottieDrawable.OooO0OO();
            }
        }
        int i8 = o0Oo0oo.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            lottieDrawable.OooO00o(new oOO00O.OooO0o("**"), o00Oo0.f8916Oooo0OO, new o00O0O00.OooO0OO(new o0OO00O(ContextCompat.OooO0O0(typedArrayObtainStyledAttributes.getResourceId(i8, -1), getContext()).getDefaultColor())));
        }
        int i9 = o0Oo0oo.LottieAnimationView_lottie_scale;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            lottieDrawable.f8674OooO0oO = typedArrayObtainStyledAttributes.getFloat(i9, 1.0f);
        }
        int i10 = o0Oo0oo.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i10, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        o00O0.OooOOOO.OooO00o oooO00o = o00O0.OooOOOO.f35982OooO00o;
        lottieDrawable.f8675OooO0oo = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
        OooO0o0();
        this.f8641OooO = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void OooO0o0() {
        int i;
        int i2 = OooO0o.f8662OooO00o[this.f8654OooOOo.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i3 = 1;
            } else {
                OooOO0 oooOO1 = this.f8659OooOo0O;
                boolean z = false;
                if ((oooOO1 == null || !oooOO1.f8734OooOOO || Build.VERSION.SDK_INT >= 28) && ((oooOO1 == null || oooOO1.f8736OooOOOO <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) {
                    z = true;
                }
                if (!z) {
                    i3 = 1;
                }
            }
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    @MainThread
    public final void OooO0oO() {
        if (!isShown()) {
            this.f8649OooOO0o = true;
        } else {
            this.f8646OooO0oo.OooO0o();
            OooO0o0();
        }
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.f8658OooOo00++;
        super.buildDrawingCache(z);
        if (this.f8658OooOo00 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f8658OooOo00--;
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Nullable
    public OooOO0 getComposition() {
        return this.f8659OooOo0O;
    }

    public long getDuration() {
        OooOO0 oooOO1 = this.f8659OooOo0O;
        if (oooOO1 != null) {
            return (long) oooOO1.OooO0O0();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f8646OooO0oo.f8672OooO0o.f35971OooO;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f8646OooO0oo.f8680OooOOO0;
    }

    public float getMaxFrame() {
        return this.f8646OooO0oo.f8672OooO0o.OooO0o0();
    }

    public float getMinFrame() {
        return this.f8646OooO0oo.f8672OooO0o.OooO0o();
    }

    @Nullable
    public o0ooOOo getPerformanceTracker() {
        OooOO0 oooOO1 = this.f8646OooO0oo.f8673OooO0o0;
        if (oooOO1 != null) {
            return oooOO1.f8723OooO00o;
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        o00O0.OooOO0O oooOO0O = this.f8646OooO0oo.f8672OooO0o;
        OooOO0 oooOO1 = oooOO0O.f35979OooOOO0;
        if (oooOO1 == null) {
            return 0.0f;
        }
        float f = oooOO0O.f35971OooO;
        float f2 = oooOO1.f8732OooOO0O;
        return (f - f2) / (oooOO1.f8733OooOO0o - f2);
    }

    public int getRepeatCount() {
        return this.f8646OooO0oo.f8672OooO0o.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f8646OooO0oo.f8672OooO0o.getRepeatMode();
    }

    public float getScale() {
        return this.f8646OooO0oo.f8674OooO0oO;
    }

    public float getSpeed() {
        return this.f8646OooO0oo.f8672OooO0o.f35972OooO0o;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f8653OooOOOo || this.f8650OooOOO) {
            OooO0oO();
            this.f8653OooOOOo = false;
            this.f8650OooOOO = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        o00O0.OooOO0O oooOO0O = this.f8646OooO0oo.f8672OooO0o;
        if (oooOO0O == null ? false : oooOO0O.f35978OooOOO) {
            OooO0OO();
            this.f8650OooOOO = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f8664OooO0Oo;
        this.f8647OooOO0 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f8647OooOO0);
        }
        int i = savedState.f8666OooO0o0;
        this.f8648OooOO0O = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f8665OooO0o);
        if (savedState.f8667OooO0oO) {
            OooO0oO();
        }
        this.f8646OooO0oo.f8680OooOOO0 = savedState.f8668OooO0oo;
        setRepeatMode(savedState.f8663OooO);
        setRepeatCount(savedState.f8669OooOO0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        float f;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8664OooO0Oo = this.f8647OooOO0;
        savedState.f8666OooO0o0 = this.f8648OooOO0O;
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        o00O0.OooOO0O oooOO0O = lottieDrawable.f8672OooO0o;
        OooOO0 oooOO1 = oooOO0O.f35979OooOOO0;
        if (oooOO1 == null) {
            f = 0.0f;
        } else {
            float f2 = oooOO0O.f35971OooO;
            float f3 = oooOO1.f8732OooOO0O;
            f = (f2 - f3) / (oooOO1.f8733OooOO0o - f3);
        }
        savedState.f8665OooO0o = f;
        boolean z = false;
        if (oooOO0O == null ? false : oooOO0O.f35978OooOOO) {
            z = true;
        } else {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (!ViewCompat.OooOO0O.OooO0O0(this) && this.f8650OooOOO) {
                z = true;
            }
        }
        savedState.f8667OooO0oO = z;
        savedState.f8668OooO0oo = lottieDrawable.f8680OooOOO0;
        o00O0.OooOO0O oooOO0O2 = lottieDrawable.f8672OooO0o;
        savedState.f8663OooO = oooOO0O2.getRepeatMode();
        savedState.f8669OooOO0 = oooOO0O2.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f8641OooO) {
            boolean zIsShown = isShown();
            LottieDrawable lottieDrawable = this.f8646OooO0oo;
            if (zIsShown) {
                if (this.f8651OooOOO0) {
                    if (isShown()) {
                        lottieDrawable.OooO0oO();
                        OooO0o0();
                    } else {
                        this.f8649OooOO0o = false;
                        this.f8651OooOOO0 = true;
                    }
                } else if (this.f8649OooOO0o) {
                    OooO0oO();
                }
                this.f8651OooOOO0 = false;
                this.f8649OooOO0o = false;
                return;
            }
            o00O0.OooOO0O oooOO0O = lottieDrawable.f8672OooO0o;
            if (oooOO0O == null ? false : oooOO0O.f35978OooOOO) {
                this.f8653OooOOOo = false;
                this.f8650OooOOO = false;
                this.f8651OooOOO0 = false;
                this.f8649OooOO0o = false;
                lottieDrawable.f8677OooOO0O.clear();
                lottieDrawable.f8672OooO0o.OooO0oo(true);
                OooO0o0();
                this.f8651OooOOO0 = true;
            }
        }
    }

    public void setAnimation(@RawRes int i) {
        o00oO0o<OooOO0> o00oo0oOooO0o0;
        o00oO0o<OooOO0> o00oo0o2;
        this.f8648OooOO0O = i;
        this.f8647OooOO0 = null;
        if (isInEditMode()) {
            o00oo0o2 = new o00oO0o<>(new com.airbnb.lottie.OooO0o(this, i), true);
        } else {
            if (this.f8655OooOOo0) {
                Context context = getContext();
                o00oo0oOooO0o0 = OooOO0O.OooO0o0(i, context, OooOO0O.OooO(i, context));
            } else {
                o00oo0oOooO0o0 = OooOO0O.OooO0o0(i, getContext(), null);
            }
            o00oo0o2 = o00oo0oOooO0o0;
        }
        setCompositionTask(o00oo0o2);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(OooOO0O.OooO00o(null, new OooOo00(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        o00oO0o<OooOO0> o00oo0oOooO00o;
        if (this.f8655OooOOo0) {
            Context context = getContext();
            HashMap map = OooOO0O.f8737OooO00o;
            String strOooO00o = o00O00OO.OooO00o("url_", str);
            o00oo0oOooO00o = OooOO0O.OooO00o(strOooO00o, new OooOOO0(context, str, strOooO00o));
        } else {
            o00oo0oOooO00o = OooOO0O.OooO00o(null, new OooOOO0(getContext(), str, null));
        }
        setCompositionTask(o00oo0oOooO00o);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f8646OooO0oo.f8687OooOo00 = z;
    }

    public void setCacheComposition(boolean z) {
        this.f8655OooOOo0 = z;
    }

    public void setComposition(@NonNull OooOO0 oooOO1) {
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        lottieDrawable.setCallback(this);
        this.f8659OooOo0O = oooOO1;
        this.f8652OooOOOO = true;
        boolean zOooO0oo = lottieDrawable.OooO0oo(oooOO1);
        this.f8652OooOOOO = false;
        OooO0o0();
        if (getDrawable() != lottieDrawable || zOooO0oo) {
            if (!zOooO0oo) {
                o00O0.OooOO0O oooOO0O = lottieDrawable.f8672OooO0o;
                boolean z = oooOO0O != null ? oooOO0O.f35978OooOOO : false;
                setImageDrawable(null);
                setImageDrawable(lottieDrawable);
                if (z) {
                    lottieDrawable.OooO0oO();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f8656OooOOoo.iterator();
            while (it.hasNext()) {
                ((o00O0O) it.next()).OooO00o();
            }
        }
    }

    public void setFailureListener(@Nullable o0OoOo0<Throwable> o0oooo0) {
        this.f8643OooO0o = o0oooo0;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f8645OooO0oO = i;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.OooO00o oooO00o) {
        o00O00O.OooO00o oooO00o2 = this.f8646OooO0oo.f8679OooOOO;
    }

    public void setFrame(int i) {
        this.f8646OooO0oo.OooO(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f8646OooO0oo.f8670OooO = z;
    }

    public void setImageAssetDelegate(com.airbnb.lottie.OooO0O0 oooO0O0) {
        o00O00O.OooO0O0 oooO0O1 = this.f8646OooO0oo.f8678OooOO0o;
    }

    public void setImageAssetsFolder(String str) {
        this.f8646OooO0oo.f8680OooOOO0 = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        OooO0Oo();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        OooO0Oo();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        OooO0Oo();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f8646OooO0oo.OooOO0(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f8646OooO0oo.OooOO0o(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f8646OooO0oo.OooOOO0(str);
    }

    public void setMinFrame(int i) {
        this.f8646OooO0oo.OooOOO(i);
    }

    public void setMinProgress(float f) {
        this.f8646OooO0oo.OooOOOo(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        if (lottieDrawable.f8685OooOOoo == z) {
            return;
        }
        lottieDrawable.f8685OooOOoo = z;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = lottieDrawable.f8682OooOOOo;
        if (oooO0O0 != null) {
            oooO0O0.OooOOo(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        lottieDrawable.f8683OooOOo = z;
        OooOO0 oooOO1 = lottieDrawable.f8673OooO0o0;
        if (oooOO1 != null) {
            oooOO1.f8723OooO00o.f8928OooO00o = z;
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f8646OooO0oo.OooOOo0(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f8654OooOOo = renderMode;
        OooO0o0();
    }

    public void setRepeatCount(int i) {
        this.f8646OooO0oo.f8672OooO0o.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f8646OooO0oo.f8672OooO0o.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f8646OooO0oo.f8676OooOO0 = z;
    }

    public void setScale(float f) {
        LottieDrawable lottieDrawable = this.f8646OooO0oo;
        lottieDrawable.f8674OooO0oO = f;
        if (getDrawable() == lottieDrawable) {
            o00O0.OooOO0O oooOO0O = lottieDrawable.f8672OooO0o;
            boolean z = oooOO0O == null ? false : oooOO0O.f35978OooOOO;
            setImageDrawable(null);
            setImageDrawable(lottieDrawable);
            if (z) {
                lottieDrawable.OooO0oO();
            }
        }
    }

    public void setSpeed(float f) {
        this.f8646OooO0oo.f8672OooO0o.f35972OooO0o = f;
    }

    public void setTextDelegate(oo0o0Oo oo0o0oo) {
        this.f8646OooO0oo.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        o00O0.OooOO0O oooOO0O;
        LottieDrawable lottieDrawable2;
        boolean z = this.f8652OooOOOO;
        if (!z && drawable == (lottieDrawable2 = this.f8646OooO0oo)) {
            o00O0.OooOO0O oooOO0O2 = lottieDrawable2.f8672OooO0o;
            if (oooOO0O2 == null ? false : oooOO0O2.f35978OooOOO) {
                this.f8653OooOOOo = false;
                this.f8650OooOOO = false;
                this.f8651OooOOO0 = false;
                this.f8649OooOO0o = false;
                lottieDrawable2.f8677OooOO0O.clear();
                lottieDrawable2.f8672OooO0o.OooO0oo(true);
                OooO0o0();
            } else if (!z) {
                lottieDrawable = (LottieDrawable) drawable;
                oooOO0O = lottieDrawable.f8672OooO0o;
                if (oooOO0O != null ? oooOO0O.f35978OooOOO : false) {
                    lottieDrawable.f8677OooOO0O.clear();
                    lottieDrawable.f8672OooO0o.OooO0oo(true);
                }
            }
        } else if (!z && (drawable instanceof LottieDrawable)) {
            lottieDrawable = (LottieDrawable) drawable;
            oooOO0O = lottieDrawable.f8672OooO0o;
            if (oooOO0O != null ? oooOO0O.f35978OooOOO : false) {
                lottieDrawable.f8677OooOO0O.clear();
                lottieDrawable.f8672OooO0o.OooO0oo(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f8646OooO0oo.OooOO0O(str);
    }

    public void setMinFrame(String str) {
        this.f8646OooO0oo.OooOOOO(str);
    }

    public void setAnimation(String str) {
        o00oO0o<OooOO0> o00oo0oOooO00o;
        o00oO0o<OooOO0> o00oo0o2;
        this.f8647OooOO0 = str;
        this.f8648OooOO0O = 0;
        if (isInEditMode()) {
            o00oo0o2 = new o00oO0o<>(new OooO(this, str), true);
        } else {
            if (this.f8655OooOOo0) {
                Context context = getContext();
                HashMap map = OooOO0O.f8737OooO00o;
                String strOooO00o = o00O00OO.OooO00o("asset_", str);
                o00oo0oOooO00o = OooOO0O.OooO00o(strOooO00o, new OooOOO(context.getApplicationContext(), str, strOooO00o));
            } else {
                Context context2 = getContext();
                HashMap map2 = OooOO0O.f8737OooO00o;
                o00oo0oOooO00o = OooOO0O.OooO00o(null, new OooOOO(context2.getApplicationContext(), str, null));
            }
            o00oo0o2 = o00oo0oOooO00o;
        }
        setCompositionTask(o00oo0o2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8642OooO0Oo = new OooO0O0();
        this.f8644OooO0o0 = new OooO0OO();
        this.f8645OooO0oO = 0;
        this.f8646OooO0oo = new LottieDrawable();
        this.f8649OooOO0o = false;
        this.f8651OooOOO0 = false;
        this.f8650OooOOO = false;
        this.f8652OooOOOO = false;
        this.f8653OooOOOo = false;
        this.f8655OooOOo0 = true;
        this.f8654OooOOo = RenderMode.AUTOMATIC;
        this.f8656OooOOoo = new HashSet();
        this.f8658OooOo00 = 0;
        OooO0o(attributeSet, o0OOO0o.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8642OooO0Oo = new OooO0O0();
        this.f8644OooO0o0 = new OooO0OO();
        this.f8645OooO0oO = 0;
        this.f8646OooO0oo = new LottieDrawable();
        this.f8649OooOO0o = false;
        this.f8651OooOOO0 = false;
        this.f8650OooOOO = false;
        this.f8652OooOOOO = false;
        this.f8653OooOOOo = false;
        this.f8655OooOOo0 = true;
        this.f8654OooOOo = RenderMode.AUTOMATIC;
        this.f8656OooOOoo = new HashSet();
        this.f8658OooOo00 = 0;
        OooO0o(attributeSet, i);
    }
}
