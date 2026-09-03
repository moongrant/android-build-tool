package com.ss.ugc.android.alpha_player.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395o0Oo.OooOOO;
import p422o0OoO0.OooO0OO;
import p425o0OoO0OO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010>\u001a\u00020=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006C"}, d2 = {"Lcom/ss/ugc/android/alpha_player/widget/AlphaVideoGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lo0OoO0OO/o0Oo0oo;", "Landroid/view/View;", "getView", "Lo0Oo/OooOOO;", "playerController", "", "setPlayerController", "Lo0OoO0/OooO0OO;", "renderer", "setVideoRenderer", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "scaleType", "setScaleType", "getScaleType", "", "Oooo0o", "I", "getGL_CONTEXT_VERSION", "()I", "GL_CONTEXT_VERSION", "", "Oooo0oo", "F", "getMVideoWidth", "()F", "setMVideoWidth", "(F)V", "mVideoWidth", "Oooo", "getMVideoHeight", "setMVideoHeight", "mVideoHeight", "OoooO00", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "getMScaleType", "()Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "setMScaleType", "(Lcom/ss/ugc/android/alpha_player/model/ScaleType;)V", "mScaleType", "Landroid/view/Surface;", "OoooO", "Landroid/view/Surface;", "getMSurface", "()Landroid/view/Surface;", "setMSurface", "(Landroid/view/Surface;)V", "mSurface", "mRenderer", "Lo0OoO0/OooO0OO;", "getMRenderer", "()Lo0OoO0/OooO0OO;", "setMRenderer", "(Lo0OoO0/OooO0OO;)V", "mPlayerController", "Lo0Oo/OooOOO;", "getMPlayerController", "()Lo0Oo/OooOOO;", "setMPlayerController", "(Lo0Oo/OooOOO;)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class AlphaVideoGLSurfaceView extends GLSurfaceView implements o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public float mVideoHeight;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public final int GL_CONTEXT_VERSION;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile boolean f19851Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public float mVideoWidth;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface mSurface;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooO0OO f19854OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ScaleType mScaleType;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooOOO f19856OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooO00o f19857OoooOO0;

    public static final class OooO00o implements OooO0OO.OooO00o {
        public OooO00o() {
        }

        @Override // o0OoO0.OooO0OO.OooO00o
        public final void OooO00o(@NotNull Surface surface) {
            Surface mSurface = AlphaVideoGLSurfaceView.this.getMSurface();
            if (mSurface != null) {
                mSurface.release();
            }
            AlphaVideoGLSurfaceView.this.setMSurface(surface);
            AlphaVideoGLSurfaceView.this.f19851Oooo0oO = true;
            OooOOO f19856OoooO0O = AlphaVideoGLSurfaceView.this.getF19856OoooO0O();
            if (f19856OoooO0O != null) {
                f19856OoooO0O.OooO0O0(surface);
            }
            OooOOO f19856OoooO0O2 = AlphaVideoGLSurfaceView.this.getF19856OoooO0O();
            if (f19856OoooO0O2 != null) {
                f19856OoooO0O2.OooO0OO();
            }
        }
    }

    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ AlphaVideoGLSurfaceView f19859Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f19860Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f19861Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f19862Oooo0oo;

        public OooO0O0(OooO0OO oooO0OO, int i, int i2, AlphaVideoGLSurfaceView alphaVideoGLSurfaceView) {
            this.f19860Oooo0o = oooO0OO;
            this.f19861Oooo0oO = i;
            this.f19862Oooo0oo = i2;
            this.f19859Oooo = alphaVideoGLSurfaceView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19860Oooo0o.OooO0Oo(this.f19861Oooo0oO, this.f19862Oooo0oo, this.f19859Oooo.getMVideoWidth(), this.f19859Oooo.getMVideoHeight());
        }
    }

    @JvmOverloads
    public AlphaVideoGLSurfaceView(@NotNull Context context) {
        this(context, null);
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO00o() {
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO0O0() {
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0();
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final boolean getF19851Oooo0oO() {
        return this.f19851Oooo0oO;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO0Oo(@NotNull ViewGroup viewGroup) {
        viewGroup.removeView(this);
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO0o(@NotNull ViewGroup viewGroup) {
        if (viewGroup.indexOfChild(this) == -1) {
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
            }
            viewGroup.addView(this);
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO0o0(float f, float f2) {
        float f3 = 0;
        if (f > f3 && f2 > f3) {
            this.mVideoWidth = f;
            this.mVideoHeight = f2;
        }
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            queueEvent(new OooO0O0(oooO0OO, getMeasuredWidth(), getMeasuredHeight(), this));
        }
    }

    public final int getGL_CONTEXT_VERSION() {
        return this.GL_CONTEXT_VERSION;
    }

    @Nullable
    /* JADX INFO: renamed from: getMPlayerController, reason: from getter */
    public final OooOOO getF19856OoooO0O() {
        return this.f19856OoooO0O;
    }

    @Nullable
    /* JADX INFO: renamed from: getMRenderer, reason: from getter */
    public final OooO0OO getF19854OoooO0() {
        return this.f19854OoooO0;
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

    @Override // p425o0OoO0OO.o0Oo0oo
    @NotNull
    public ScaleType getScaleType() {
        return this.mScaleType;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0o0(this.mVideoWidth, this.mVideoHeight);
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void release() {
        OooO00o oooO00o = this.f19857OoooOO0;
        Surface mSurface = AlphaVideoGLSurfaceView.this.getMSurface();
        if (mSurface != null) {
            mSurface.release();
        }
        AlphaVideoGLSurfaceView.this.setMSurface(null);
        AlphaVideoGLSurfaceView.this.f19851Oooo0oO = false;
    }

    public final void setMPlayerController(@Nullable OooOOO oooOOO) {
        this.f19856OoooO0O = oooOOO;
    }

    public final void setMRenderer(@Nullable OooO0OO oooO0OO) {
        this.f19854OoooO0 = oooO0OO;
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

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setPlayerController(@NotNull OooOOO playerController) {
        this.f19856OoooO0O = playerController;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setScaleType(@NotNull ScaleType scaleType) {
        this.mScaleType = scaleType;
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            oooO0OO.setScaleType(scaleType);
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setVideoRenderer(@NotNull OooO0OO renderer) {
        this.f19854OoooO0 = renderer;
        setRenderer(renderer);
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(this.f19857OoooOO0);
        }
        setRenderMode(0);
    }

    @JvmOverloads
    public AlphaVideoGLSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.GL_CONTEXT_VERSION = 2;
        this.mScaleType = ScaleType.ScaleAspectFill;
        OooO00o oooO00o = new OooO00o();
        this.f19857OoooOO0 = oooO00o;
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        OooO0OO oooO0OO = this.f19854OoooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(oooO00o);
        }
        setZOrderOnTop(true);
        setPreserveEGLContextOnPause(true);
    }
}
