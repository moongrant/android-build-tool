package com.ss.ugc.android.alpha_player.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p342o0OOO0Oo.OooO0o;
import p345o0OOO0oO.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/ss/ugc/android/alpha_player/widget/AlphaVideoGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lo0OOO0oO/OooOO0;", "Landroid/view/View;", "getView", "Lo0OOO0O0/OooO00o;", "playerController", "", "setPlayerController", "Lo0OOO0Oo/OooO0o;", "renderer", "setVideoRenderer", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "scaleType", "setScaleType", "getScaleType", "", "OooO0Oo", "I", "getGL_CONTEXT_VERSION", "()I", "GL_CONTEXT_VERSION", "", "OooO0o", "F", "getMVideoWidth", "()F", "setMVideoWidth", "(F)V", "mVideoWidth", "OooO0oO", "getMVideoHeight", "setMVideoHeight", "mVideoHeight", "OooO0oo", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "getMScaleType", "()Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "setMScaleType", "(Lcom/ss/ugc/android/alpha_player/model/ScaleType;)V", "mScaleType", "OooO", "Lo0OOO0Oo/OooO0o;", "getMRenderer", "()Lo0OOO0Oo/OooO0o;", "setMRenderer", "(Lo0OOO0Oo/OooO0o;)V", "mRenderer", "OooOO0", "Lo0OOO0O0/OooO00o;", "getMPlayerController", "()Lo0OOO0O0/OooO00o;", "setMPlayerController", "(Lo0OOO0O0/OooO00o;)V", "mPlayerController", "Landroid/view/Surface;", "OooOO0O", "Landroid/view/Surface;", "getMSurface", "()Landroid/view/Surface;", "setMSurface", "(Landroid/view/Surface;)V", "mSurface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class AlphaVideoGLSurfaceView extends GLSurfaceView implements OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OooO0o mRenderer;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    public final int GL_CONTEXT_VERSION;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public float mVideoWidth;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile boolean f21404OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public float mVideoHeight;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ScaleType mScaleType;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0OOO0O0.OooO00o mPlayerController;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface mSurface;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f21409OooOO0o;

    public static final class OooO00o implements OooO0o.OooO00o {
        public OooO00o() {
        }

        @Override // o0OOO0Oo.OooO0o.OooO00o
        public final void OooO00o(@NotNull Surface surface) {
            Surface mSurface = AlphaVideoGLSurfaceView.this.getMSurface();
            if (mSurface != null) {
                mSurface.release();
            }
            AlphaVideoGLSurfaceView.this.setMSurface(surface);
            AlphaVideoGLSurfaceView.this.f21404OooO0o0 = true;
            o0OOO0O0.OooO00o mPlayerController = AlphaVideoGLSurfaceView.this.getMPlayerController();
            if (mPlayerController != null) {
                mPlayerController.OooO00o(surface);
            }
            o0OOO0O0.OooO00o mPlayerController2 = AlphaVideoGLSurfaceView.this.getMPlayerController();
            if (mPlayerController2 != null) {
                mPlayerController2.OooO0O0();
            }
        }
    }

    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f21411OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f21412OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f21413OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ AlphaVideoGLSurfaceView f21414OooO0oO;

        public OooO0O0(OooO0o oooO0o, int i, int i2, AlphaVideoGLSurfaceView alphaVideoGLSurfaceView) {
            this.f21411OooO0Oo = oooO0o;
            this.f21413OooO0o0 = i;
            this.f21412OooO0o = i2;
            this.f21414OooO0oO = alphaVideoGLSurfaceView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f = this.f21413OooO0o0;
            float f2 = this.f21412OooO0o;
            AlphaVideoGLSurfaceView alphaVideoGLSurfaceView = this.f21414OooO0oO;
            this.f21411OooO0Oo.OooO0o0(f, f2, alphaVideoGLSurfaceView.getMVideoWidth(), alphaVideoGLSurfaceView.getMVideoHeight());
        }
    }

    @JvmOverloads
    public AlphaVideoGLSurfaceView(@NotNull Context context) {
        this(context, null);
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO00o() {
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0O0() {
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            oooO0o.OooO0O0();
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final boolean getF21404OooO0o0() {
        return this.f21404OooO0o0;
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0Oo(float f, float f2) {
        float f3 = 0;
        if (f > f3 && f2 > f3) {
            this.mVideoWidth = f;
            this.mVideoHeight = f2;
        }
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            queueEvent(new OooO0O0(oooO0o, getMeasuredWidth(), getMeasuredHeight(), this));
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0o(@NotNull ViewGroup viewGroup) {
        if (viewGroup.indexOfChild(this) == -1) {
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
            }
            viewGroup.addView(this);
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0o0(@NotNull ViewGroup viewGroup) {
        viewGroup.removeView(this);
    }

    public final int getGL_CONTEXT_VERSION() {
        return this.GL_CONTEXT_VERSION;
    }

    @Nullable
    public final o0OOO0O0.OooO00o getMPlayerController() {
        return this.mPlayerController;
    }

    @Nullable
    public final OooO0o getMRenderer() {
        return this.mRenderer;
    }

    @NotNull
    public final ScaleType getMScaleType() {
        return this.mScaleType;
    }

    @Nullable
    public final Surface getMSurface() {
        return this.mSurface;
    }

    public final float getMVideoHeight() {
        return this.mVideoHeight;
    }

    public final float getMVideoWidth() {
        return this.mVideoWidth;
    }

    @Override // p345o0OOO0oO.OooOO0
    @NotNull
    public ScaleType getScaleType() {
        return this.mScaleType;
    }

    @Override // p345o0OOO0oO.OooOO0
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0Oo(this.mVideoWidth, this.mVideoHeight);
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void release() {
        OooO00o oooO00o = this.f21409OooOO0o;
        Surface mSurface = AlphaVideoGLSurfaceView.this.getMSurface();
        if (mSurface != null) {
            mSurface.release();
        }
        AlphaVideoGLSurfaceView.this.setMSurface(null);
        AlphaVideoGLSurfaceView.this.f21404OooO0o0 = false;
    }

    public final void setMPlayerController(@Nullable o0OOO0O0.OooO00o oooO00o) {
        this.mPlayerController = oooO00o;
    }

    public final void setMRenderer(@Nullable OooO0o oooO0o) {
        this.mRenderer = oooO0o;
    }

    public final void setMScaleType(@NotNull ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    public final void setMSurface(@Nullable Surface surface) {
        this.mSurface = surface;
    }

    public final void setMVideoHeight(float f) {
        this.mVideoHeight = f;
    }

    public final void setMVideoWidth(float f) {
        this.mVideoWidth = f;
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setPlayerController(@NotNull o0OOO0O0.OooO00o playerController) {
        this.mPlayerController = playerController;
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setScaleType(@NotNull ScaleType scaleType) {
        this.mScaleType = scaleType;
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            oooO0o.setScaleType(scaleType);
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setVideoRenderer(@NotNull OooO0o renderer) {
        this.mRenderer = renderer;
        setRenderer(renderer);
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            oooO0o.OooO0oO(this.f21409OooOO0o);
        }
        setRenderMode(0);
    }

    @JvmOverloads
    public AlphaVideoGLSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.GL_CONTEXT_VERSION = 2;
        this.mScaleType = ScaleType.ScaleAspectFill;
        OooO00o oooO00o = new OooO00o();
        this.f21409OooOO0o = oooO00o;
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        OooO0o oooO0o = this.mRenderer;
        if (oooO0o != null) {
            oooO0o.OooO0oO(oooO00o);
        }
        setZOrderOnTop(true);
        setPreserveEGLContextOnPause(true);
    }
}
