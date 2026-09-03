package com.ss.ugc.android.alpha_player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395o0Oo.OooOOO;
import p422o0OoO0.OooO0OO;
import p425o0OoO0OO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/ss/ugc/android/alpha_player/widget/AlphaVideoGLTextureView;", "Lcom/ss/ugc/android/alpha_player/widget/GLTextureView;", "Lo0OoO0OO/o0Oo0oo;", "Landroid/view/View;", "getView", "Lo0Oo/OooOOO;", "playerController", "", "setPlayerController", "Lo0OoO0/OooO0OO;", "renderer", "setVideoRenderer", "Lcom/ss/ugc/android/alpha_player/model/ScaleType;", "scaleType", "setScaleType", "getScaleType", "Landroid/view/Surface;", "OooooOo", "Landroid/view/Surface;", "getMSurface", "()Landroid/view/Surface;", "setMSurface", "(Landroid/view/Surface;)V", "mSurface", "mPlayerController", "Lo0Oo/OooOOO;", "getMPlayerController", "()Lo0Oo/OooOOO;", "setMPlayerController", "(Lo0Oo/OooOOO;)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class AlphaVideoGLTextureView extends GLTextureView implements o0Oo0oo {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public volatile boolean f19863OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f19864OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f19865Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ScaleType f19866Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public OooO0OO f19867OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public OooOOO f19868OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Surface mSurface;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final OooO00o f19870Oooooo0;

    public static final class OooO00o implements OooO0OO.OooO00o {
        public OooO00o() {
        }

        @Override // o0OoO0.OooO0OO.OooO00o
        public final void OooO00o(@NotNull Surface surface) {
            Surface mSurface = AlphaVideoGLTextureView.this.getMSurface();
            if (mSurface != null) {
                mSurface.release();
            }
            AlphaVideoGLTextureView.this.setMSurface(surface);
            AlphaVideoGLTextureView.this.f19863OoooOoO = true;
            OooOOO f19868OooooOO = AlphaVideoGLTextureView.this.getF19868OooooOO();
            if (f19868OooooOO != null) {
                f19868OooooOO.OooO0O0(surface);
            }
            OooOOO f19868OooooOO2 = AlphaVideoGLTextureView.this.getF19868OooooOO();
            if (f19868OooooOO2 != null) {
                f19868OooooOO2.OooO0OO();
            }
        }
    }

    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ AlphaVideoGLTextureView f19872Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f19873Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f19874Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f19875Oooo0oo;

        public OooO0O0(OooO0OO oooO0OO, int i, int i2, AlphaVideoGLTextureView alphaVideoGLTextureView) {
            this.f19873Oooo0o = oooO0OO;
            this.f19874Oooo0oO = i;
            this.f19875Oooo0oo = i2;
            this.f19872Oooo = alphaVideoGLTextureView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO = this.f19873Oooo0o;
            float f = this.f19874Oooo0oO;
            float f2 = this.f19875Oooo0oo;
            AlphaVideoGLTextureView alphaVideoGLTextureView = this.f19872Oooo;
            oooO0OO.OooO0Oo(f, f2, alphaVideoGLTextureView.f19864OoooOoo, alphaVideoGLTextureView.f19865Ooooo00);
        }
    }

    @JvmOverloads
    public AlphaVideoGLTextureView(@NotNull Context context) {
        this(context, null);
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO00o() {
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void OooO0O0() {
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0();
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final boolean getF19863OoooOoO() {
        return this.f19863OoooOoO;
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
            this.f19864OoooOoo = f;
            this.f19865Ooooo00 = f2;
        }
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            OooO0O0 oooO0O0 = new OooO0O0(oooO0OO, getMeasuredWidth(), getMeasuredHeight(), this);
            GLTextureView.OooOOO oooOOO = this.f19880Oooo0oo;
            Objects.requireNonNull(oooOOO);
            GLTextureView.OooOOOO oooOOOO = GLTextureView.f19876OoooOo0;
            synchronized (oooOOOO) {
                oooOOO.f19914Ooooo00.add(oooO0O0);
                oooOOOO.notifyAll();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getMPlayerController, reason: from getter */
    public final OooOOO getF19868OooooOO() {
        return this.f19868OooooOO;
    }

    @Nullable
    public final Surface getMSurface() {
        return this.mSurface;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    @NotNull
    /* JADX INFO: renamed from: getScaleType, reason: from getter */
    public ScaleType getF19866Ooooo0o() {
        return this.f19866Ooooo0o;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0o0(this.f19864OoooOoo, this.f19865Ooooo00);
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public final void release() {
        OooO00o oooO00o = this.f19870Oooooo0;
        Surface mSurface = AlphaVideoGLTextureView.this.getMSurface();
        if (mSurface != null) {
            mSurface.release();
        }
        AlphaVideoGLTextureView.this.setMSurface(null);
        AlphaVideoGLTextureView.this.f19863OoooOoO = false;
    }

    public final void setMPlayerController(@Nullable OooOOO oooOOO) {
        this.f19868OooooOO = oooOOO;
    }

    public final void setMSurface(@Nullable Surface surface) {
        this.mSurface = surface;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setPlayerController(@NotNull OooOOO playerController) {
        this.f19868OooooOO = playerController;
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setScaleType(@NotNull ScaleType scaleType) {
        this.f19866Ooooo0o = scaleType;
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            oooO0OO.setScaleType(scaleType);
        }
    }

    @Override // p425o0OoO0OO.o0Oo0oo
    public void setVideoRenderer(@NotNull OooO0OO renderer) {
        this.f19867OooooO0 = renderer;
        setRenderer(renderer);
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(this.f19870Oooooo0);
        }
        setRenderMode(0);
    }

    @JvmOverloads
    public AlphaVideoGLTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19866Ooooo0o = ScaleType.ScaleAspectFill;
        OooO00o oooO00o = new OooO00o();
        this.f19870Oooooo0 = oooO00o;
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new GLTextureView.OooO0O0(8, 16));
        OooO0OO oooO0OO = this.f19867OooooO0;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(oooO00o);
        }
        setPreserveEGLContextOnPause(true);
        setOpaque(false);
    }
}
