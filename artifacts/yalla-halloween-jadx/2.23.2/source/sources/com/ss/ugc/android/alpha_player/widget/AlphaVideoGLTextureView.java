package com.ss.ugc.android.alpha_player.widget;

import android.content.Context;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lcom/ss/ugc/android/alpha_player/widget/AlphaVideoGLTextureView;", "Lcom/ss/ugc/android/alpha_player/widget/GLTextureView;", "Lo0OOO0oO/OooOO0;", "Landroid/view/View;", "getView", "Lo0OOO0O0/OooO00o;", "playerController", "", "setPlayerController", "Lo0OOO0Oo/OooO0o;", "renderer", "setVideoRenderer", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "scaleType", "setScaleType", "getScaleType", "OooOo00", "Lo0OOO0O0/OooO00o;", "getMPlayerController", "()Lo0OOO0O0/OooO00o;", "setMPlayerController", "(Lo0OOO0O0/OooO00o;)V", "mPlayerController", "Landroid/view/Surface;", "OooOo0", "Landroid/view/Surface;", "getMSurface", "()Landroid/view/Surface;", "setMSurface", "(Landroid/view/Surface;)V", "mSurface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class AlphaVideoGLTextureView extends GLTextureView implements OooOO0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile boolean f21415OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f21416OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ScaleType f21417OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f21418OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0o f21419OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface mSurface;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0OOO0O0.OooO00o mPlayerController;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooO00o f21422OooOo0O;

    public static final class OooO00o implements OooO0o.OooO00o {
        public OooO00o() {
        }

        @Override // o0OOO0Oo.OooO0o.OooO00o
        public final void OooO00o(@NotNull Surface surface) {
            Surface mSurface = AlphaVideoGLTextureView.this.getMSurface();
            if (mSurface != null) {
                mSurface.release();
            }
            AlphaVideoGLTextureView.this.setMSurface(surface);
            AlphaVideoGLTextureView.this.f21415OooOOOO = true;
            o0OOO0O0.OooO00o mPlayerController = AlphaVideoGLTextureView.this.getMPlayerController();
            if (mPlayerController != null) {
                mPlayerController.OooO00o(surface);
            }
            o0OOO0O0.OooO00o mPlayerController2 = AlphaVideoGLTextureView.this.getMPlayerController();
            if (mPlayerController2 != null) {
                mPlayerController2.OooO0O0();
            }
        }
    }

    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f21424OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f21425OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f21426OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ AlphaVideoGLTextureView f21427OooO0oO;

        public OooO0O0(OooO0o oooO0o, int i, int i2, AlphaVideoGLTextureView alphaVideoGLTextureView) {
            this.f21424OooO0Oo = oooO0o;
            this.f21426OooO0o0 = i;
            this.f21425OooO0o = i2;
            this.f21427OooO0oO = alphaVideoGLTextureView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f = this.f21426OooO0o0;
            float f2 = this.f21425OooO0o;
            AlphaVideoGLTextureView alphaVideoGLTextureView = this.f21427OooO0oO;
            this.f21424OooO0Oo.OooO0o0(f, f2, alphaVideoGLTextureView.f21416OooOOOo, alphaVideoGLTextureView.f21418OooOOo0);
        }
    }

    @JvmOverloads
    public AlphaVideoGLTextureView(@NotNull Context context) {
        this(context, null);
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO00o() {
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0O0() {
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            oooO0o.OooO0O0();
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final boolean getF21415OooOOOO() {
        return this.f21415OooOOOO;
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void OooO0Oo(float f, float f2) {
        float f3 = 0;
        if (f > f3 && f2 > f3) {
            this.f21416OooOOOo = f;
            this.f21418OooOOo0 = f2;
        }
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            OooO0O0 oooO0O0 = new OooO0O0(oooO0o, getMeasuredWidth(), getMeasuredHeight(), this);
            GLTextureView.OooOOO oooOOO = this.f21432OooO0o0;
            oooOOO.getClass();
            GLTextureView.OooOOOO oooOOOO = GLTextureView.f21428OooOOO;
            synchronized (oooOOOO) {
                oooOOO.f21465OooOOoo.add(oooO0O0);
                oooOOOO.notifyAll();
            }
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

    @Nullable
    public final o0OOO0O0.OooO00o getMPlayerController() {
        return this.mPlayerController;
    }

    @Nullable
    public final Surface getMSurface() {
        return this.mSurface;
    }

    @Override // p345o0OOO0oO.OooOO0
    @NotNull
    /* JADX INFO: renamed from: getScaleType, reason: from getter */
    public ScaleType getF21417OooOOo() {
        return this.f21417OooOOo;
    }

    @Override // p345o0OOO0oO.OooOO0
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0Oo(this.f21416OooOOOo, this.f21418OooOOo0);
    }

    @Override // p345o0OOO0oO.OooOO0
    public final void release() {
        OooO00o oooO00o = this.f21422OooOo0O;
        Surface mSurface = AlphaVideoGLTextureView.this.getMSurface();
        if (mSurface != null) {
            mSurface.release();
        }
        AlphaVideoGLTextureView.this.setMSurface(null);
        AlphaVideoGLTextureView.this.f21415OooOOOO = false;
    }

    public final void setMPlayerController(@Nullable o0OOO0O0.OooO00o oooO00o) {
        this.mPlayerController = oooO00o;
    }

    public final void setMSurface(@Nullable Surface surface) {
        this.mSurface = surface;
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setPlayerController(@NotNull o0OOO0O0.OooO00o playerController) {
        this.mPlayerController = playerController;
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setScaleType(@NotNull ScaleType scaleType) {
        this.f21417OooOOo = scaleType;
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            oooO0o.setScaleType(scaleType);
        }
    }

    @Override // p345o0OOO0oO.OooOO0
    public void setVideoRenderer(@NotNull OooO0o renderer) {
        this.f21419OooOOoo = renderer;
        setRenderer(renderer);
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            oooO0o.OooO0oO(this.f21422OooOo0O);
        }
        setRenderMode(0);
    }

    @JvmOverloads
    public AlphaVideoGLTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21417OooOOo = ScaleType.ScaleAspectFill;
        OooO00o oooO00o = new OooO00o();
        this.f21422OooOo0O = oooO00o;
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new GLTextureView.OooO0O0(8, 16));
        OooO0o oooO0o = this.f21419OooOOoo;
        if (oooO0o != null) {
            oooO0o.OooO0oO(oooO00o);
        }
        setPreserveEGLContextOnPause(true);
        setOpaque(false);
    }
}
