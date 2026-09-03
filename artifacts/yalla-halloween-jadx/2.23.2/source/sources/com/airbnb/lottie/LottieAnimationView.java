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
import androidx.core.view.o000OOo0;
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
    public static final OooO00o f11730OooOo0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11731OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f11732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o0OoOo0<Throwable> f11733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f11734OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @DrawableRes
    public int f11735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LottieDrawable f11736OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public String f11737OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @RawRes
    public int f11738OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f11739OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11740OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f11741OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f11742OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f11743OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RenderMode f11744OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f11745OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final HashSet f11746OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public o00oO0o<OooOO0> f11747OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f11748OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public OooOO0 f11749OooOo0O;

    public class OooO00o implements o0OoOo0<Throwable> {
        @Override // com.airbnb.lottie.o0OoOo0
        public final void OooO00o(Throwable th) {
            Throwable th2 = th;
            o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37433OooO00o;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            o00OOO0.OooOO0.OooO0OO("Unable to load composition.", th2);
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
            int i = lottieAnimationView.f11735OooO0oO;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            o0OoOo0 o0oooo1 = lottieAnimationView.f11733OooO0o;
            if (o0oooo1 == null) {
                o0oooo1 = LottieAnimationView.f11730OooOo0o;
            }
            o0oooo1.OooO00o(th2);
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11752OooO00o;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f11752OooO00o = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11752OooO00o[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11752OooO00o[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f11753OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f11754OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f11755OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f11756OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f11757OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f11758OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f11759OooOO0;

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
            this.f11754OooO0Oo = parcel.readString();
            this.f11755OooO0o = parcel.readFloat();
            this.f11757OooO0oO = parcel.readInt() == 1;
            this.f11758OooO0oo = parcel.readString();
            this.f11753OooO = parcel.readInt();
            this.f11759OooOO0 = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f11754OooO0Oo);
            parcel.writeFloat(this.f11755OooO0o);
            parcel.writeInt(this.f11757OooO0oO ? 1 : 0);
            parcel.writeString(this.f11758OooO0oo);
            parcel.writeInt(this.f11753OooO);
            parcel.writeInt(this.f11759OooOO0);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f11732OooO0Oo = new OooO0O0();
        this.f11734OooO0o0 = new OooO0OO();
        this.f11735OooO0oO = 0;
        this.f11736OooO0oo = new LottieDrawable();
        this.f11739OooOO0o = false;
        this.f11741OooOOO0 = false;
        this.f11740OooOOO = false;
        this.f11742OooOOOO = false;
        this.f11743OooOOOo = false;
        this.f11745OooOOo0 = true;
        this.f11744OooOOo = RenderMode.AUTOMATIC;
        this.f11746OooOOoo = new HashSet();
        this.f11748OooOo00 = 0;
        OooO0o(null, o0OOO0o.lottieAnimationViewStyle);
    }

    private void setCompositionTask(o00oO0o<OooOO0> o00oo0o2) {
        this.f11749OooOo0O = null;
        this.f11736OooO0oo.OooO0Oo();
        OooO0Oo();
        o00oo0o2.OooO0OO(this.f11732OooO0Oo);
        o00oo0o2.OooO0O0(this.f11734OooO0o0);
        this.f11747OooOo0 = o00oo0o2;
    }

    @MainThread
    public final void OooO0OO() {
        this.f11740OooOOO = false;
        this.f11741OooOOO0 = false;
        this.f11739OooOO0o = false;
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        lottieDrawable.f11767OooOO0O.clear();
        lottieDrawable.f11762OooO0o.cancel();
        OooO0o0();
    }

    public final void OooO0Oo() {
        o00oO0o<OooOO0> o00oo0o2 = this.f11747OooOo0;
        if (o00oo0o2 != null) {
            OooO0O0 oooO0O0 = this.f11732OooO0Oo;
            synchronized (o00oo0o2) {
                o00oo0o2.f12013OooO00o.remove(oooO0O0);
            }
            this.f11747OooOo0.OooO0Oo(this.f11734OooO0o0);
        }
    }

    public final void OooO0o(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0Oo0oo.LottieAnimationView, i, 0);
        this.f11745OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_cacheComposition, true);
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
            this.f11740OooOOO = true;
            this.f11743OooOOOo = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o0Oo0oo.LottieAnimationView_lottie_loop, false);
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        if (z) {
            lottieDrawable.f11762OooO0o.setRepeatCount(-1);
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
        if (lottieDrawable.f11771OooOOOO != z2) {
            lottieDrawable.f11771OooOOOO = z2;
            if (lottieDrawable.f11763OooO0o0 != null) {
                lottieDrawable.OooO0OO();
            }
        }
        int i8 = o0Oo0oo.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            lottieDrawable.OooO00o(new p135o00OO0o0.o00oO0o("**"), o00Oo0.f12006Oooo0OO, new o00OOO0O.OooO0OO(new o0OO00O(ContextCompat.OooO0O0(typedArrayObtainStyledAttributes.getResourceId(i8, -1), getContext()).getDefaultColor())));
        }
        int i9 = o0Oo0oo.LottieAnimationView_lottie_scale;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            lottieDrawable.f11764OooO0oO = typedArrayObtainStyledAttributes.getFloat(i9, 1.0f);
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
        o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37433OooO00o;
        lottieDrawable.f11765OooO0oo = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
        OooO0o0();
        this.f11731OooO = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void OooO0o0() {
        int i;
        int i2 = OooO0o.f11752OooO00o[this.f11744OooOOo.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || i2 != 3) {
                i3 = 1;
            } else {
                OooOO0 oooOO1 = this.f11749OooOo0O;
                boolean z = false;
                if ((oooOO1 == null || !oooOO1.f11824OooOOO || Build.VERSION.SDK_INT >= 28) && ((oooOO1 == null || oooOO1.f11826OooOOOO <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) {
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
            this.f11739OooOO0o = true;
        } else {
            this.f11736OooO0oo.OooO0o();
            OooO0o0();
        }
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.f11748OooOo00++;
        super.buildDrawingCache(z);
        if (this.f11748OooOo00 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f11748OooOo00--;
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Nullable
    public OooOO0 getComposition() {
        return this.f11749OooOo0O;
    }

    public long getDuration() {
        OooOO0 oooOO1 = this.f11749OooOo0O;
        if (oooOO1 != null) {
            return (long) oooOO1.OooO0O0();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f11736OooO0oo.f11762OooO0o.f37422OooO;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f11736OooO0oo.f11770OooOOO0;
    }

    public float getMaxFrame() {
        return this.f11736OooO0oo.f11762OooO0o.OooO0o0();
    }

    public float getMinFrame() {
        return this.f11736OooO0oo.f11762OooO0o.OooO0o();
    }

    @Nullable
    public o0ooOOo getPerformanceTracker() {
        OooOO0 oooOO1 = this.f11736OooO0oo.f11763OooO0o0;
        if (oooOO1 != null) {
            return oooOO1.f11813OooO00o;
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        o00OOO0.OooOO0O oooOO0O = this.f11736OooO0oo.f11762OooO0o;
        OooOO0 oooOO1 = oooOO0O.f37430OooOOO0;
        if (oooOO1 == null) {
            return 0.0f;
        }
        float f = oooOO0O.f37422OooO;
        float f2 = oooOO1.f11822OooOO0O;
        return (f - f2) / (oooOO1.f11823OooOO0o - f2);
    }

    public int getRepeatCount() {
        return this.f11736OooO0oo.f11762OooO0o.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f11736OooO0oo.f11762OooO0o.getRepeatMode();
    }

    public float getScale() {
        return this.f11736OooO0oo.f11764OooO0oO;
    }

    public float getSpeed() {
        return this.f11736OooO0oo.f11762OooO0o.f37423OooO0o;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
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
        if (this.f11743OooOOOo || this.f11740OooOOO) {
            OooO0oO();
            this.f11743OooOOOo = false;
            this.f11740OooOOO = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        o00OOO0.OooOO0O oooOO0O = this.f11736OooO0oo.f11762OooO0o;
        if (oooOO0O == null ? false : oooOO0O.f37429OooOOO) {
            OooO0OO();
            this.f11740OooOOO = true;
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
        String str = savedState.f11754OooO0Oo;
        this.f11737OooOO0 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f11737OooOO0);
        }
        int i = savedState.f11756OooO0o0;
        this.f11738OooOO0O = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f11755OooO0o);
        if (savedState.f11757OooO0oO) {
            OooO0oO();
        }
        this.f11736OooO0oo.f11770OooOOO0 = savedState.f11758OooO0oo;
        setRepeatMode(savedState.f11753OooO);
        setRepeatCount(savedState.f11759OooOO0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        float f;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11754OooO0Oo = this.f11737OooOO0;
        savedState.f11756OooO0o0 = this.f11738OooOO0O;
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        o00OOO0.OooOO0O oooOO0O = lottieDrawable.f11762OooO0o;
        OooOO0 oooOO1 = oooOO0O.f37430OooOOO0;
        if (oooOO1 == null) {
            f = 0.0f;
        } else {
            float f2 = oooOO0O.f37422OooO;
            float f3 = oooOO1.f11822OooOO0O;
            f = (f2 - f3) / (oooOO1.f11823OooOO0o - f3);
        }
        savedState.f11755OooO0o = f;
        boolean z = false;
        if (oooOO0O == null ? false : oooOO0O.f37429OooOOO) {
            z = true;
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (!ViewCompat.OooOO0O.OooO0O0(this) && this.f11740OooOOO) {
                z = true;
            }
        }
        savedState.f11757OooO0oO = z;
        savedState.f11758OooO0oo = lottieDrawable.f11770OooOOO0;
        o00OOO0.OooOO0O oooOO0O2 = lottieDrawable.f11762OooO0o;
        savedState.f11753OooO = oooOO0O2.getRepeatMode();
        savedState.f11759OooOO0 = oooOO0O2.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        if (this.f11731OooO) {
            boolean zIsShown = isShown();
            LottieDrawable lottieDrawable = this.f11736OooO0oo;
            if (zIsShown) {
                if (this.f11741OooOOO0) {
                    if (isShown()) {
                        lottieDrawable.OooO0oO();
                        OooO0o0();
                    } else {
                        this.f11739OooOO0o = false;
                        this.f11741OooOOO0 = true;
                    }
                } else if (this.f11739OooOO0o) {
                    OooO0oO();
                }
                this.f11741OooOOO0 = false;
                this.f11739OooOO0o = false;
                return;
            }
            o00OOO0.OooOO0O oooOO0O = lottieDrawable.f11762OooO0o;
            if (oooOO0O == null ? false : oooOO0O.f37429OooOOO) {
                this.f11743OooOOOo = false;
                this.f11740OooOOO = false;
                this.f11741OooOOO0 = false;
                this.f11739OooOO0o = false;
                lottieDrawable.f11767OooOO0O.clear();
                lottieDrawable.f11762OooO0o.OooO0oo(true);
                OooO0o0();
                this.f11741OooOOO0 = true;
            }
        }
    }

    public void setAnimation(@RawRes int i) {
        o00oO0o<OooOO0> o00oo0oOooO0o0;
        o00oO0o<OooOO0> o00oo0o2;
        this.f11738OooOO0O = i;
        this.f11737OooOO0 = null;
        if (isInEditMode()) {
            o00oo0o2 = new o00oO0o<>(new com.airbnb.lottie.OooO0o(this, i), true);
        } else {
            if (this.f11745OooOOo0) {
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
        if (this.f11745OooOOo0) {
            Context context = getContext();
            HashMap map = OooOO0O.f11827OooO00o;
            String strOooO00o = o00O00OO.OooO00o("url_", str);
            o00oo0oOooO00o = OooOO0O.OooO00o(strOooO00o, new OooOOO0(context, str, strOooO00o));
        } else {
            o00oo0oOooO00o = OooOO0O.OooO00o(null, new OooOOO0(getContext(), str, null));
        }
        setCompositionTask(o00oo0oOooO00o);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f11736OooO0oo.f11777OooOo00 = z;
    }

    public void setCacheComposition(boolean z) {
        this.f11745OooOOo0 = z;
    }

    public void setComposition(@NonNull OooOO0 oooOO1) {
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        lottieDrawable.setCallback(this);
        this.f11749OooOo0O = oooOO1;
        this.f11742OooOOOO = true;
        boolean zOooO0oo = lottieDrawable.OooO0oo(oooOO1);
        this.f11742OooOOOO = false;
        OooO0o0();
        if (getDrawable() != lottieDrawable || zOooO0oo) {
            if (!zOooO0oo) {
                o00OOO0.OooOO0O oooOO0O = lottieDrawable.f11762OooO0o;
                boolean z = oooOO0O != null ? oooOO0O.f37429OooOOO : false;
                setImageDrawable(null);
                setImageDrawable(lottieDrawable);
                if (z) {
                    lottieDrawable.OooO0oO();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f11746OooOOoo.iterator();
            while (it.hasNext()) {
                ((o00O0O) it.next()).OooO00o();
            }
        }
    }

    public void setFailureListener(@Nullable o0OoOo0<Throwable> o0oooo1) {
        this.f11733OooO0o = o0oooo1;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f11735OooO0oO = i;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.OooO00o oooO00o) {
        o00OO0OO.OooO00o oooO00o2 = this.f11736OooO0oo.f11769OooOOO;
    }

    public void setFrame(int i) {
        this.f11736OooO0oo.OooO(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f11736OooO0oo.f11760OooO = z;
    }

    public void setImageAssetDelegate(com.airbnb.lottie.OooO0O0 oooO0O0) {
        o00OO0OO.OooO0O0 oooO0O1 = this.f11736OooO0oo.f11768OooOO0o;
    }

    public void setImageAssetsFolder(String str) {
        this.f11736OooO0oo.f11770OooOOO0 = str;
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
        this.f11736OooO0oo.OooOO0(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f11736OooO0oo.OooOO0o(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f11736OooO0oo.OooOOO0(str);
    }

    public void setMinFrame(int i) {
        this.f11736OooO0oo.OooOOO(i);
    }

    public void setMinProgress(float f) {
        this.f11736OooO0oo.OooOOOo(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        if (lottieDrawable.f11775OooOOoo == z) {
            return;
        }
        lottieDrawable.f11775OooOOoo = z;
        com.airbnb.lottie.model.layer.OooO0O0 oooO0O0 = lottieDrawable.f11772OooOOOo;
        if (oooO0O0 != null) {
            oooO0O0.OooOOo(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        lottieDrawable.f11773OooOOo = z;
        OooOO0 oooOO1 = lottieDrawable.f11763OooO0o0;
        if (oooOO1 != null) {
            oooOO1.f11813OooO00o.f12018OooO00o = z;
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f11736OooO0oo.OooOOo0(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f11744OooOOo = renderMode;
        OooO0o0();
    }

    public void setRepeatCount(int i) {
        this.f11736OooO0oo.f11762OooO0o.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f11736OooO0oo.f11762OooO0o.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f11736OooO0oo.f11766OooOO0 = z;
    }

    public void setScale(float f) {
        LottieDrawable lottieDrawable = this.f11736OooO0oo;
        lottieDrawable.f11764OooO0oO = f;
        if (getDrawable() == lottieDrawable) {
            o00OOO0.OooOO0O oooOO0O = lottieDrawable.f11762OooO0o;
            boolean z = oooOO0O == null ? false : oooOO0O.f37429OooOOO;
            setImageDrawable(null);
            setImageDrawable(lottieDrawable);
            if (z) {
                lottieDrawable.OooO0oO();
            }
        }
    }

    public void setSpeed(float f) {
        this.f11736OooO0oo.f11762OooO0o.f37423OooO0o = f;
    }

    public void setTextDelegate(oo0o0Oo oo0o0oo) {
        this.f11736OooO0oo.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        o00OOO0.OooOO0O oooOO0O;
        LottieDrawable lottieDrawable2;
        boolean z = this.f11742OooOOOO;
        if (!z && drawable == (lottieDrawable2 = this.f11736OooO0oo)) {
            o00OOO0.OooOO0O oooOO0O2 = lottieDrawable2.f11762OooO0o;
            if (oooOO0O2 == null ? false : oooOO0O2.f37429OooOOO) {
                this.f11743OooOOOo = false;
                this.f11740OooOOO = false;
                this.f11741OooOOO0 = false;
                this.f11739OooOO0o = false;
                lottieDrawable2.f11767OooOO0O.clear();
                lottieDrawable2.f11762OooO0o.OooO0oo(true);
                OooO0o0();
            } else if (!z) {
                lottieDrawable = (LottieDrawable) drawable;
                oooOO0O = lottieDrawable.f11762OooO0o;
                if (oooOO0O != null ? oooOO0O.f37429OooOOO : false) {
                    lottieDrawable.f11767OooOO0O.clear();
                    lottieDrawable.f11762OooO0o.OooO0oo(true);
                }
            }
        } else if (!z && (drawable instanceof LottieDrawable)) {
            lottieDrawable = (LottieDrawable) drawable;
            oooOO0O = lottieDrawable.f11762OooO0o;
            if (oooOO0O != null ? oooOO0O.f37429OooOOO : false) {
                lottieDrawable.f11767OooOO0O.clear();
                lottieDrawable.f11762OooO0o.OooO0oo(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f11736OooO0oo.OooOO0O(str);
    }

    public void setMinFrame(String str) {
        this.f11736OooO0oo.OooOOOO(str);
    }

    public void setAnimation(String str) {
        o00oO0o<OooOO0> o00oo0oOooO00o;
        o00oO0o<OooOO0> o00oo0o2;
        this.f11737OooOO0 = str;
        this.f11738OooOO0O = 0;
        if (isInEditMode()) {
            o00oo0o2 = new o00oO0o<>(new OooO(this, str), true);
        } else {
            if (this.f11745OooOOo0) {
                Context context = getContext();
                HashMap map = OooOO0O.f11827OooO00o;
                String strOooO00o = o00O00OO.OooO00o("asset_", str);
                o00oo0oOooO00o = OooOO0O.OooO00o(strOooO00o, new OooOOO(context.getApplicationContext(), str, strOooO00o));
            } else {
                Context context2 = getContext();
                HashMap map2 = OooOO0O.f11827OooO00o;
                o00oo0oOooO00o = OooOO0O.OooO00o(null, new OooOOO(context2.getApplicationContext(), str, null));
            }
            o00oo0o2 = o00oo0oOooO00o;
        }
        setCompositionTask(o00oo0o2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11732OooO0Oo = new OooO0O0();
        this.f11734OooO0o0 = new OooO0OO();
        this.f11735OooO0oO = 0;
        this.f11736OooO0oo = new LottieDrawable();
        this.f11739OooOO0o = false;
        this.f11741OooOOO0 = false;
        this.f11740OooOOO = false;
        this.f11742OooOOOO = false;
        this.f11743OooOOOo = false;
        this.f11745OooOOo0 = true;
        this.f11744OooOOo = RenderMode.AUTOMATIC;
        this.f11746OooOOoo = new HashSet();
        this.f11748OooOo00 = 0;
        OooO0o(attributeSet, o0OOO0o.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11732OooO0Oo = new OooO0O0();
        this.f11734OooO0o0 = new OooO0OO();
        this.f11735OooO0oO = 0;
        this.f11736OooO0oo = new LottieDrawable();
        this.f11739OooOO0o = false;
        this.f11741OooOOO0 = false;
        this.f11740OooOOO = false;
        this.f11742OooOOOO = false;
        this.f11743OooOOOo = false;
        this.f11745OooOOo0 = true;
        this.f11744OooOOo = RenderMode.AUTOMATIC;
        this.f11746OooOOoo = new HashSet();
        this.f11748OooOo00 = 0;
        OooO0o(attributeSet, i);
    }
}
