package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
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
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import javax.net.ssl.SSLException;
import o000O0O0.o00000O;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final Oooo000<Throwable> f9953OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Oooo000<OooOO0O> f9954Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final LottieDrawable f9955OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Oooo000<Throwable> f9956OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Oooo000<Throwable> f9957OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @DrawableRes
    public int f9958OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f9959OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @RawRes
    public int f9960OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f9961OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f9962OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f9963OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f9964OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f9965Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f9966Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public RenderMode f9967OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final Set<Oooo0> f9968OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f9969OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public OooOO0O f9970Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public o00Oo0<OooOO0O> f9971Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public String f9972o000oOoO;

    public class OooO00o implements Oooo000<Throwable> {
        @Override // com.airbnb.lottie.Oooo000
        public final void OooO00o(Throwable th) {
            Throwable th2 = th;
            ThreadLocal<PathMeasure> threadLocal = o000O0Oo.f31141OooO00o;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            o000Oo0.OooO0Oo("Unable to load composition.", th2);
        }
    }

    public class OooO0O0 implements Oooo000<OooOO0O> {
        public OooO0O0() {
        }

        @Override // com.airbnb.lottie.Oooo000
        public final void OooO00o(OooOO0O oooOO0O) {
            LottieAnimationView.this.setComposition(oooOO0O);
        }
    }

    public class OooO0OO implements Oooo000<Throwable> {
        public OooO0OO() {
        }

        @Override // com.airbnb.lottie.Oooo000
        public final void OooO00o(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.f9958OoooO0O;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            Oooo000<Throwable> oooo000 = LottieAnimationView.this.f9956OoooO0;
            if (oooo000 == null) {
                Oooo000<Throwable> oooo001 = LottieAnimationView.f9953OoooooO;
                oooo000 = LottieAnimationView.f9953OoooooO;
            }
            oooo000.OooO00o(th2);
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f9975OooO00o;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f9975OooO00o = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9975OooO00o[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9975OooO00o[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f9976Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public String f9977Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f9978Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f9979Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f9980OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f9981OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f9982OoooO0O;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f9977Oooo0o);
            parcel.writeFloat(this.f9979Oooo0oo);
            parcel.writeInt(this.f9976Oooo ? 1 : 0);
            parcel.writeString(this.f9981OoooO00);
            parcel.writeInt(this.f9980OoooO0);
            parcel.writeInt(this.f9982OoooO0O);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f9977Oooo0o = parcel.readString();
            this.f9979Oooo0oo = parcel.readFloat();
            this.f9976Oooo = parcel.readInt() == 1;
            this.f9981OoooO00 = parcel.readString();
            this.f9980OoooO0 = parcel.readInt();
            this.f9982OoooO0O = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f9954Oooo = new OooO0O0();
        this.f9957OoooO00 = new OooO0OO();
        this.f9958OoooO0O = 0;
        this.f9955OoooO = new LottieDrawable();
        this.f9961OoooOOo = false;
        this.f9962OoooOo0 = false;
        this.f9963OoooOoO = false;
        this.f9964OoooOoo = false;
        this.f9965Ooooo00 = false;
        this.f9966Ooooo0o = true;
        this.f9967OooooO0 = RenderMode.AUTOMATIC;
        this.f9968OooooOO = new HashSet();
        this.f9969OooooOo = 0;
        OooO0oO(null, oo000o.lottieAnimationViewStyle);
    }

    private void setCompositionTask(o00Oo0<OooOO0O> o00oo1) {
        this.f9970Oooooo = null;
        this.f9955OoooO.OooO0Oo();
        OooO0o0();
        o00oo1.OooO0O0(this.f9954Oooo);
        o00oo1.OooO00o(this.f9957OoooO00);
        this.f9971Oooooo0 = o00oo1;
    }

    @MainThread
    public final void OooO() {
        this.f9965Ooooo00 = false;
        this.f9963OoooOoO = false;
        this.f9962OoooOo0 = false;
        this.f9961OoooOOo = false;
        LottieDrawable lottieDrawable = this.f9955OoooO;
        lottieDrawable.f9987OoooO.clear();
        lottieDrawable.f9986Oooo0oo.OooOOO0();
        OooO0o();
    }

    public final void OooO0OO(Animator.AnimatorListener animatorListener) {
        this.f9955OoooO.f9986Oooo0oo.addListener(animatorListener);
    }

    @MainThread
    public final void OooO0Oo() {
        this.f9963OoooOoO = false;
        this.f9962OoooOo0 = false;
        this.f9961OoooOOo = false;
        LottieDrawable lottieDrawable = this.f9955OoooO;
        lottieDrawable.f9987OoooO.clear();
        lottieDrawable.f9986Oooo0oo.cancel();
        OooO0o();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void OooO0o() {
        int i;
        int i2 = OooO0o.f9975OooO00o[this.f9967OooooO0.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i3 = 1;
            } else {
                OooOO0O oooOO0O = this.f9970Oooooo;
                boolean z = false;
                if ((oooOO0O == null || !oooOO0O.f10052OooOOO || Build.VERSION.SDK_INT >= 28) && ((oooOO0O == null || oooOO0O.f10054OooOOOO <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) {
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

    public final void OooO0o0() {
        o00Oo0<OooOO0O> o00oo1 = this.f9971Oooooo0;
        if (o00oo1 != null) {
            Oooo000<OooOO0O> oooo000 = this.f9954Oooo;
            synchronized (o00oo1) {
                o00oo1.f10240OooO00o.remove(oooo000);
            }
            o00Oo0<OooOO0O> o00oo2 = this.f9971Oooooo0;
            Oooo000<Throwable> oooo001 = this.f9957OoooO00;
            synchronized (o00oo2) {
                o00oo2.f10241OooO0O0.remove(oooo001);
            }
        }
    }

    public final void OooO0oO(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00oO0o.LottieAnimationView, i, 0);
        this.f9966Ooooo0o = typedArrayObtainStyledAttributes.getBoolean(o00oO0o.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = o00oO0o.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = o00oO0o.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = o00oO0o.LottieAnimationView_lottie_url;
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
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(o00oO0o.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(o00oO0o.LottieAnimationView_lottie_autoPlay, false)) {
            this.f9963OoooOoO = true;
            this.f9965Ooooo00 = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(o00oO0o.LottieAnimationView_lottie_loop, false)) {
            this.f9955OoooO.f9986Oooo0oo.setRepeatCount(-1);
        }
        int i5 = o00oO0o.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = o00oO0o.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = o00oO0o.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(o00oO0o.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(o00oO0o.LottieAnimationView_lottie_progress, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o00oO0o.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        LottieDrawable lottieDrawable = this.f9955OoooO;
        if (lottieDrawable.f9995OoooOoO != z) {
            lottieDrawable.f9995OoooOoO = z;
            if (lottieDrawable.f9985Oooo0oO != null) {
                lottieDrawable.OooO0OO();
            }
        }
        int i8 = o00oO0o.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f9955OoooO.OooO00o(new o00O0OOO("**"), o000oOoO.f10234Oooo0OO, new o000000O(new o0ooOOo(p012OooOo0.OooOO0O.OooO00o(getContext(), typedArrayObtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor())));
        }
        int i9 = o00oO0o.LottieAnimationView_lottie_scale;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f9955OoooO.f9983Oooo = typedArrayObtainStyledAttributes.getFloat(i9, 1.0f);
        }
        int i10 = o00oO0o.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i10, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(o00oO0o.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        typedArrayObtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable2 = this.f9955OoooO;
        Context context = getContext();
        ThreadLocal<PathMeasure> threadLocal = o000O0Oo.f31141OooO00o;
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        Objects.requireNonNull(lottieDrawable2);
        lottieDrawable2.f9989OoooO00 = boolValueOf.booleanValue();
        OooO0o();
        this.f9959OoooOO0 = true;
    }

    public final boolean OooO0oo() {
        return this.f9955OoooO.OooOO0();
    }

    @MainThread
    public final void OooOO0() {
        if (!isShown()) {
            this.f9961OoooOOo = true;
        } else {
            this.f9955OoooO.OooOO0O();
            OooO0o();
        }
    }

    public final void OooOO0O() {
        boolean zOooO0oo = OooO0oo();
        setImageDrawable(null);
        setImageDrawable(this.f9955OoooO);
        if (zOooO0oo) {
            this.f9955OoooO.OooOO0o();
        }
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.f9969OooooOo++;
        super.buildDrawingCache(z);
        if (this.f9969OooooOo == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f9969OooooOo--;
        com.airbnb.lottie.OooO0o.OooO00o();
    }

    @Nullable
    public OooOO0O getComposition() {
        return this.f9970Oooooo;
    }

    public long getDuration() {
        OooOO0O oooOO0O = this.f9970Oooooo;
        if (oooOO0O != null) {
            return (long) oooOO0O.OooO0O0();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f9955OoooO.f9986Oooo0oo.f31132OoooO0;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f9955OoooO.f9992OoooOOO;
    }

    public float getMaxFrame() {
        return this.f9955OoooO.OooO0o();
    }

    public float getMinFrame() {
        return this.f9955OoooO.OooO0oO();
    }

    @Nullable
    public o00Ooo getPerformanceTracker() {
        OooOO0O oooOO0O = this.f9955OoooO.f9985Oooo0oO;
        if (oooOO0O != null) {
            return oooOO0O.f10041OooO00o;
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f9955OoooO.OooO0oo();
    }

    public int getRepeatCount() {
        return this.f9955OoooO.OooO();
    }

    public int getRepeatMode() {
        return this.f9955OoooO.f9986Oooo0oo.getRepeatMode();
    }

    public float getScale() {
        return this.f9955OoooO.f9983Oooo;
    }

    public float getSpeed() {
        return this.f9955OoooO.f9986Oooo0oo.f31130Oooo0oo;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f9955OoooO;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f9965Ooooo00 || this.f9963OoooOoO)) {
            OooOO0();
            this.f9965Ooooo00 = false;
            this.f9963OoooOoO = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (OooO0oo()) {
            OooO0Oo();
            this.f9963OoooOoO = true;
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
        String str = savedState.f9977Oooo0o;
        this.f9972o000oOoO = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f9972o000oOoO);
        }
        int i = savedState.f9978Oooo0oO;
        this.f9960OoooOOO = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f9979Oooo0oo);
        if (savedState.f9976Oooo) {
            OooOO0();
        }
        this.f9955OoooO.f9992OoooOOO = savedState.f9981OoooO00;
        setRepeatMode(savedState.f9980OoooO0);
        setRepeatCount(savedState.f9982OoooO0O);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9977Oooo0o = this.f9972o000oOoO;
        savedState.f9978Oooo0oO = this.f9960OoooOOO;
        savedState.f9979Oooo0oo = this.f9955OoooO.OooO0oo();
        if (this.f9955OoooO.OooOO0()) {
            z = true;
        } else {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this) || !this.f9963OoooOoO) {
                z = false;
            } else {
                z = true;
            }
        }
        savedState.f9976Oooo = z;
        LottieDrawable lottieDrawable = this.f9955OoooO;
        savedState.f9981OoooO00 = lottieDrawable.f9992OoooOOO;
        savedState.f9980OoooO0 = lottieDrawable.f9986Oooo0oo.getRepeatMode();
        savedState.f9982OoooO0O = this.f9955OoooO.OooO();
        return savedState;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f9959OoooOO0) {
            if (!isShown()) {
                if (OooO0oo()) {
                    OooO();
                    this.f9962OoooOo0 = true;
                    return;
                }
                return;
            }
            if (this.f9962OoooOo0) {
                if (isShown()) {
                    this.f9955OoooO.OooOO0o();
                    OooO0o();
                } else {
                    this.f9961OoooOOo = false;
                    this.f9962OoooOo0 = true;
                }
            } else if (this.f9961OoooOOo) {
                OooOO0();
            }
            this.f9962OoooOo0 = false;
            this.f9961OoooOOo = false;
        }
    }

    public void setAnimation(@RawRes int i) {
        o00Oo0<OooOO0O> o00oo0OooO0oO;
        o00Oo0<OooOO0O> o00oo1;
        this.f9960OoooOOO = i;
        this.f9972o000oOoO = null;
        if (isInEditMode()) {
            o00oo1 = new o00Oo0<>(new OooO(this, i), true);
        } else {
            if (this.f9966Ooooo0o) {
                Context context = getContext();
                o00oo0OooO0oO = OooOOO0.OooO0oO(context, i, OooOOO0.OooOOO0(context, i));
            } else {
                o00oo0OooO0oO = OooOOO0.OooO0oO(getContext(), i, null);
            }
            o00oo1 = o00oo0OooO0oO;
        }
        setCompositionTask(o00oo1);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        Map<String, o00Oo0<OooOO0O>> map = OooOOO0.f10057OooO00o;
        setCompositionTask(OooOOO0.OooO00o(null, new OooOOO(byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f9966Ooooo0o ? OooOOO0.OooO(getContext(), str) : OooOOO0.OooOO0(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f9955OoooO.f10000OooooOO = z;
    }

    public void setCacheComposition(boolean z) {
        this.f9966Ooooo0o = z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.Set<com.airbnb.lottie.Oooo0>] */
    public void setComposition(@NonNull OooOO0O oooOO0O) {
        this.f9955OoooO.setCallback(this);
        this.f9970Oooooo = oooOO0O;
        this.f9964OoooOoo = true;
        boolean zOooOOO0 = this.f9955OoooO.OooOOO0(oooOO0O);
        this.f9964OoooOoo = false;
        OooO0o();
        if (getDrawable() != this.f9955OoooO || zOooOOO0) {
            if (!zOooOOO0) {
                OooOO0O();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f9968OooooOO.iterator();
            while (it.hasNext()) {
                ((Oooo0) it.next()).OooO00o();
            }
        }
    }

    public void setFailureListener(@Nullable Oooo000<Throwable> oooo000) {
        this.f9956OoooO0 = oooo000;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f9958OoooO0O = i;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.OooO00o oooO00o) {
        p124o00O0o00.OooO0o oooO0o = this.f9955OoooO.f9994OoooOo0;
    }

    public void setFrame(int i) {
        this.f9955OoooO.OooOOO(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f9955OoooO.f9988OoooO0 = z;
    }

    public void setImageAssetDelegate(com.airbnb.lottie.OooO0O0 oooO0O0) {
        LottieDrawable lottieDrawable = this.f9955OoooO;
        lottieDrawable.f9993OoooOOo = oooO0O0;
        p124o00O0o00.OooO oooO = lottieDrawable.f10003o000oOoO;
        if (oooO != null) {
            oooO.f30979OooO0OO = oooO0O0;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f9955OoooO.f9992OoooOOO = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        OooO0o0();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        OooO0o0();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        OooO0o0();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f9955OoooO.OooOOOO(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f9955OoooO.OooOOo0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f9955OoooO.OooOOoo(str);
    }

    public void setMinFrame(int i) {
        this.f9955OoooO.OooOo00(i);
    }

    public void setMinProgress(float f) {
        this.f9955OoooO.OooOo0O(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.f9955OoooO;
        if (lottieDrawable.f9999OooooO0 == z) {
            return;
        }
        lottieDrawable.f9999OooooO0 = z;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = lottieDrawable.f9996OoooOoo;
        if (oooO0O0 != null) {
            oooO0O0.OooOo00(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.f9955OoooO;
        lottieDrawable.f9998Ooooo0o = z;
        OooOO0O oooOO0O = lottieDrawable.f9985Oooo0oO;
        if (oooOO0O != null) {
            oooOO0O.f10041OooO00o.f10245OooO00o = z;
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f9955OoooO.OooOo0o(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f9967OooooO0 = renderMode;
        OooO0o();
    }

    public void setRepeatCount(int i) {
        this.f9955OoooO.f9986Oooo0oo.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f9955OoooO.f9986Oooo0oo.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f9955OoooO.f9990OoooO0O = z;
    }

    public void setScale(float f) {
        this.f9955OoooO.f9983Oooo = f;
        if (getDrawable() == this.f9955OoooO) {
            OooOO0O();
        }
    }

    public void setSpeed(float f) {
        this.f9955OoooO.f9986Oooo0oo.f31130Oooo0oo = f;
    }

    public void setTextDelegate(o0OOO0o o0ooo0o2) {
        Objects.requireNonNull(this.f9955OoooO);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.f9964OoooOoo && drawable == (lottieDrawable = this.f9955OoooO) && lottieDrawable.OooOO0()) {
            OooO();
        } else if (!this.f9964OoooOoo && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.OooOO0()) {
                lottieDrawable2.f9987OoooO.clear();
                lottieDrawable2.f9986Oooo0oo.OooOOO0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f9955OoooO.OooOOOo(str);
    }

    public void setMinFrame(String str) {
        this.f9955OoooO.OooOo0(str);
    }

    public void setAnimation(String str) {
        o00Oo0<OooOO0O> o00oo0OooO0O0;
        this.f9972o000oOoO = str;
        this.f9960OoooOOO = 0;
        if (isInEditMode()) {
            o00oo0OooO0O0 = new o00Oo0<>(new OooOO0(this, str), true);
        } else {
            o00oo0OooO0O0 = this.f9966Ooooo0o ? OooOOO0.OooO0O0(getContext(), str) : OooOOO0.OooO0OO(getContext(), str, null);
        }
        setCompositionTask(o00oo0OooO0O0);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9954Oooo = new OooO0O0();
        this.f9957OoooO00 = new OooO0OO();
        this.f9958OoooO0O = 0;
        this.f9955OoooO = new LottieDrawable();
        this.f9961OoooOOo = false;
        this.f9962OoooOo0 = false;
        this.f9963OoooOoO = false;
        this.f9964OoooOoo = false;
        this.f9965Ooooo00 = false;
        this.f9966Ooooo0o = true;
        this.f9967OooooO0 = RenderMode.AUTOMATIC;
        this.f9968OooooOO = new HashSet();
        this.f9969OooooOo = 0;
        OooO0oO(attributeSet, oo000o.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9954Oooo = new OooO0O0();
        this.f9957OoooO00 = new OooO0OO();
        this.f9958OoooO0O = 0;
        this.f9955OoooO = new LottieDrawable();
        this.f9961OoooOOo = false;
        this.f9962OoooOo0 = false;
        this.f9963OoooOoO = false;
        this.f9964OoooOoo = false;
        this.f9965Ooooo00 = false;
        this.f9966Ooooo0o = true;
        this.f9967OooooO0 = RenderMode.AUTOMATIC;
        this.f9968OooooOO = new HashSet();
        this.f9969OooooOo = 0;
        OooO0oO(attributeSet, i);
    }
}
