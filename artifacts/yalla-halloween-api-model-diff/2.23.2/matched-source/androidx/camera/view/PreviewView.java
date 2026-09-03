package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oo0o0O0;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.session.o000Oo0;
import java.util.concurrent.atomic.AtomicReference;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.o0OO00O;
import p440o0OoOo0.o00Ooo;
import p440o0OoOo0.o00oO0o;
import p440o0OoOo0.o0OOO0o;
import p440o0OoOo0.o0ooOOo;
import p677ooOO.OooOOO;
import p677ooOO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ImplementationMode f4135OooOOOO = ImplementationMode.PERFORMANCE;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final AtomicReference<androidx.camera.view.OooO00o> f4136OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public ImplementationMode f4137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final androidx.camera.view.OooO0O0 f4138OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public androidx.camera.view.OooO0OO f4139OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f4140OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final MutableLiveData<StreamState> f4141OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final o0ooOOo f4142OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f4143OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final OooO0OO f4144OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO00o f4145OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00Ooo f4146OooOOO0;

    @RequiresApi(21)
    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode OooO00o(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown implementation mode id ", i));
        }

        public final int OooO0O0() {
            return this.mId;
        }
    }

    public class OooO00o implements OooOOOO.OooO0OO {
        public OooO00o() {
        }

        @Override // androidx.camera.core.OooOOOO.OooO0OO
        @AnyThread
        public final void OooO00o(@NonNull final SurfaceRequest surfaceRequest) {
            boolean zOooO0O0 = p031OoooO0.o0Oo0oo.OooO0O0();
            PreviewView previewView = PreviewView.this;
            if (!zOooO0O0) {
                ContextCompat.OooO0OO(previewView.getContext()).execute(new Runnable() { // from class: o0OoOo0.oo000o
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.f4145OooOOO.OooO00o(surfaceRequest);
                    }
                });
                return;
            }
            o00O0O0.OooO00o("PreviewView", "Surface requested by Preview.");
            CameraInternal cameraInternal = surfaceRequest.f3507OooO0o0;
            previewView.f4143OooOO0O = cameraInternal.OooO();
            surfaceRequest.OooO0OO(ContextCompat.OooO0OO(previewView.getContext()), new o000Oo0(this, cameraInternal, surfaceRequest));
            if (!((previewView.f4139OooO0o0 instanceof androidx.camera.view.OooO0o) && !PreviewView.OooO0O0(surfaceRequest, previewView.f4137OooO0Oo))) {
                boolean zOooO0O1 = PreviewView.OooO0O0(surfaceRequest, previewView.f4137OooO0Oo);
                androidx.camera.view.OooO0O0 oooO0O0 = previewView.f4138OooO0o;
                previewView.f4139OooO0o0 = zOooO0O1 ? new OooO(previewView, oooO0O0) : new androidx.camera.view.OooO0o(previewView, oooO0O0);
            }
            androidx.camera.view.OooO00o oooO00o = new androidx.camera.view.OooO00o(cameraInternal.OooO(), previewView.f4141OooO0oo, previewView.f4139OooO0o0);
            previewView.f4136OooO.set(oooO00o);
            cameraInternal.OooO0O0().OooO00o(oooO00o, ContextCompat.OooO0OO(previewView.getContext()));
            previewView.f4139OooO0o0.OooO0o0(surfaceRequest, new o00oO0o(this, oooO00o, cameraInternal));
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4148OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f4149OooO0O0;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            f4149OooO0O0 = iArr;
            try {
                iArr[ImplementationMode.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4149OooO0O0[ImplementationMode.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            f4148OooO00o = iArr2;
            try {
                iArr2[ScaleType.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4148OooO00o[ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4148OooO00o[ScaleType.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4148OooO00o[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4148OooO00o[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4148OooO00o[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class OooO0OO implements DisplayManager.DisplayListener {
        public OooO0OO() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            previewView.OooO00o();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public class OooO0o extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public OooO0o() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    @RequiresApi(21)
    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType OooO00o(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown scale type id ", i));
        }

        public final int OooO0O0() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean OooO0O0(@NonNull SurfaceRequest surfaceRequest, @NonNull ImplementationMode implementationMode) {
        int i;
        boolean zEquals = surfaceRequest.f3507OooO0o0.OooO().OooOOO0().equals("androidx.camera.camera2.legacy");
        oo0o0O0 oo0o0o0 = OooOOO0.f60363OooO00o;
        boolean z = (oo0o0o0.OooO0O0(p677ooOO.OooOOOO.class) == null && oo0o0o0.OooO0O0(OooOOO.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z || (i = OooO0O0.f4149OooO0O0[implementationMode.ordinal()]) == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (OooO0O0.f4148OooO00o[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    @OptIn(markerClass = {TransformExperimental.class})
    @MainThread
    public final void OooO00o() {
        Display display;
        o0Oo0oo o0oo0oo2;
        p031OoooO0.o0Oo0oo.OooO00o();
        if (this.f4139OooO0o0 != null) {
            if (this.f4140OooO0oO && (display = getDisplay()) != null && (o0oo0oo2 = this.f4143OooOO0O) != null) {
                int iOooOOO = o0oo0oo2.OooOOO(display.getRotation());
                int rotation = display.getRotation();
                androidx.camera.view.OooO0O0 oooO0O0 = this.f4138OooO0o;
                if (oooO0O0.f4118OooO0oO) {
                    oooO0O0.f4114OooO0OO = iOooOOO;
                    oooO0O0.f4117OooO0o0 = rotation;
                }
            }
            this.f4139OooO0o0.OooO0o();
        }
        o0ooOOo o0ooooo = this.f4142OooOO0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        o0ooooo.getClass();
        p031OoooO0.o0Oo0oo.OooO00o();
        synchronized (o0ooooo) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                o0ooooo.f47206OooO00o.OooO00o(layoutDirection, size);
            }
        }
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Bitmap bitmapOooO0O0;
        p031OoooO0.o0Oo0oo.OooO00o();
        androidx.camera.view.OooO0OO oooO0OO = this.f4139OooO0o0;
        if (oooO0OO == null || (bitmapOooO0O0 = oooO0OO.OooO0O0()) == null) {
            return null;
        }
        FrameLayout frameLayout = oooO0OO.f4122OooO0O0;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        androidx.camera.view.OooO0O0 oooO0O0 = oooO0OO.f4123OooO0OO;
        if (!oooO0O0.OooO0o()) {
            return bitmapOooO0O0;
        }
        Matrix matrixOooO0Oo = oooO0O0.OooO0Oo();
        RectF rectFOooO0o0 = oooO0O0.OooO0o0(layoutDirection, size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapOooO0O0.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixOooO0Oo);
        matrix.postScale(rectFOooO0o0.width() / oooO0O0.f4112OooO00o.getWidth(), rectFOooO0o0.height() / oooO0O0.f4112OooO00o.getHeight());
        matrix.postTranslate(rectFOooO0o0.left, rectFOooO0o0.top);
        canvas.drawBitmap(bitmapOooO0O0, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        p031OoooO0.o0Oo0oo.OooO00o();
        return null;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        p031OoooO0.o0Oo0oo.OooO00o();
        return this.f4137OooO0Oo;
    }

    @NonNull
    @UiThread
    public p028Oooo0oO.oo0o0O0 getMeteringPointFactory() {
        p031OoooO0.o0Oo0oo.OooO00o();
        return this.f4142OooOO0;
    }

    @Nullable
    @TransformExperimental
    public o00O0O.OooO00o getOutputTransform() {
        Matrix matrixOooO0OO;
        androidx.camera.view.OooO0O0 oooO0O0 = this.f4138OooO0o;
        p031OoooO0.o0Oo0oo.OooO00o();
        try {
            matrixOooO0OO = oooO0O0.OooO0OO(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrixOooO0OO = null;
        }
        Rect rect = oooO0O0.f4113OooO0O0;
        if (matrixOooO0OO == null || rect == null) {
            o00O0O0.OooO00o("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = o0OO00O.f1384OooO00o;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(o0OO00O.f1384OooO00o, rectF2, Matrix.ScaleToFit.FILL);
        matrixOooO0OO.preConcat(matrix);
        if (this.f4139OooO0o0 instanceof OooO) {
            matrixOooO0OO.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            o00O0O0.OooO0oo("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new o00O0O.OooO00o();
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.f4141OooO0oo;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        p031OoooO0.o0Oo0oo.OooO00o();
        return this.f4138OooO0o.f4119OooO0oo;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getSensorToViewTransform() {
        p031OoooO0.o0Oo0oo.OooO00o();
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        androidx.camera.view.OooO0O0 oooO0O0 = this.f4138OooO0o;
        if (!oooO0O0.OooO0o()) {
            return null;
        }
        Matrix matrix = new Matrix(oooO0O0.f4115OooO0Oo);
        matrix.postConcat(oooO0O0.OooO0OO(layoutDirection, size));
        return matrix;
    }

    @NonNull
    @UiThread
    public OooOOOO.OooO0OO getSurfaceProvider() {
        p031OoooO0.o0Oo0oo.OooO00o();
        return this.f4145OooOOO;
    }

    @Nullable
    @UiThread
    public ViewPort getViewPort() {
        p031OoooO0.o0Oo0oo.OooO00o();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        p031OoooO0.o0Oo0oo.OooO00o();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort(getViewPortScaleType(), new Rational(getWidth(), getHeight()), rotation, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f4144OooOO0o, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f4146OooOOO0);
        androidx.camera.view.OooO0OO oooO0OO = this.f4139OooO0o0;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO();
        }
        p031OoooO0.o0Oo0oo.OooO00o();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f4146OooOOO0);
        androidx.camera.view.OooO0OO oooO0OO = this.f4139OooO0o0;
        if (oooO0OO != null) {
            oooO0OO.OooO0Oo();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f4144OooOO0o);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        p031OoooO0.o0Oo0oo.OooO00o();
        p031OoooO0.o0Oo0oo.OooO00o();
        getViewPort();
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        p031OoooO0.o0Oo0oo.OooO00o();
        this.f4137OooO0Oo = implementationMode;
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        p031OoooO0.o0Oo0oo.OooO00o();
        this.f4138OooO0o.f4119OooO0oo = scaleType;
        OooO00o();
        p031OoooO0.o0Oo0oo.OooO00o();
        getViewPort();
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [o0OoOo0.o00Ooo] */
    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ImplementationMode implementationMode = f4135OooOOOO;
        this.f4137OooO0Oo = implementationMode;
        androidx.camera.view.OooO0O0 oooO0O0 = new androidx.camera.view.OooO0O0();
        this.f4138OooO0o = oooO0O0;
        this.f4140OooO0oO = true;
        this.f4141OooO0oo = new MutableLiveData<>(StreamState.IDLE);
        this.f4136OooO = new AtomicReference<>();
        this.f4142OooOO0 = new o0ooOOo(oooO0O0);
        this.f4144OooOO0o = new OooO0OO();
        this.f4146OooOOO0 = new View.OnLayoutChangeListener() { // from class: o0OoOo0.o00Ooo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                PreviewView.ImplementationMode implementationMode2 = PreviewView.f4135OooOOOO;
                PreviewView previewView = this.f47194OooO0Oo;
                previewView.getClass();
                if ((i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) ? false : true) {
                    previewView.OooO00o();
                    p031OoooO0.o0Oo0oo.OooO00o();
                    previewView.getViewPort();
                }
            }
        };
        this.f4145OooOOO = new OooO00o();
        p031OoooO0.o0Oo0oo.OooO00o();
        Resources.Theme theme = context.getTheme();
        int[] iArr = o0OOO0o.PreviewView;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, i2);
        try {
            setScaleType(ScaleType.OooO00o(typedArrayObtainStyledAttributes.getInteger(o0OOO0o.PreviewView_scaleType, oooO0O0.f4119OooO0oo.OooO0O0())));
            setImplementationMode(ImplementationMode.OooO00o(typedArrayObtainStyledAttributes.getInteger(o0OOO0o.PreviewView_implementationMode, implementationMode.OooO0O0())));
            typedArrayObtainStyledAttributes.recycle();
            new ScaleGestureDetector(context, new OooO0o());
            if (getBackground() == null) {
                Context context2 = getContext();
                Object obj = ContextCompat.f5281OooO00o;
                setBackgroundColor(ContextCompat.OooO0o.OooO00o(context2, R.color.black));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
