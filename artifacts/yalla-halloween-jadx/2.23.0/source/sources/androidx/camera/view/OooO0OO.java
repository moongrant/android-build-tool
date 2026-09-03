package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceRequest;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.OooOo;
import p437o0OoOo0.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Size f4121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4122OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f4123OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f4124OooO0Oo = false;

    public interface OooO00o {
    }

    public OooO0OO(@NonNull PreviewView previewView, @NonNull OooO0O0 oooO0O0) {
        this.f4122OooO0O0 = previewView;
        this.f4123OooO0OO = oooO0O0;
    }

    @Nullable
    public abstract View OooO00o();

    @Nullable
    public abstract Bitmap OooO0O0();

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    public final void OooO0o() {
        boolean z;
        View viewOooO00o = OooO00o();
        if (viewOooO00o == null || !this.f4124OooO0Oo) {
            return;
        }
        FrameLayout frameLayout = this.f4122OooO0O0;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        OooO0O0 oooO0O0 = this.f4123OooO0OO;
        oooO0O0.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            o00O0O0.OooO0oo("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (oooO0O0.OooO0o()) {
            if (viewOooO00o instanceof TextureView) {
                ((TextureView) viewOooO00o).setTransform(oooO0O0.OooO0Oo());
            } else {
                Display display = viewOooO00o.getDisplay();
                boolean z2 = (!oooO0O0.f4118OooO0oO || display == null || display.getRotation() == oooO0O0.f4117OooO0o0) ? false : true;
                boolean z3 = oooO0O0.f4118OooO0oO;
                if (!z3) {
                    z = (!z3 ? oooO0O0.f4114OooO0OO : -OooOo.OooO0O0(oooO0O0.f4117OooO0o0)) != 0;
                }
                if (z2 || z) {
                    o00O0O0.OooO0O0("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFOooO0o0 = oooO0O0.OooO0o0(layoutDirection, size);
            viewOooO00o.setPivotX(0.0f);
            viewOooO00o.setPivotY(0.0f);
            viewOooO00o.setScaleX(rectFOooO0o0.width() / oooO0O0.f4112OooO00o.getWidth());
            viewOooO00o.setScaleY(rectFOooO0o0.height() / oooO0O0.f4112OooO00o.getHeight());
            viewOooO00o.setTranslationX(rectFOooO0o0.left - viewOooO00o.getLeft());
            viewOooO00o.setTranslationY(rectFOooO0o0.top - viewOooO00o.getTop());
        }
    }

    public abstract void OooO0o0(@NonNull SurfaceRequest surfaceRequest, @Nullable o000oOoO o000oooo2);

    @NonNull
    public abstract com.google.common.util.concurrent.OooO00o<Void> OooO0oO();
}
