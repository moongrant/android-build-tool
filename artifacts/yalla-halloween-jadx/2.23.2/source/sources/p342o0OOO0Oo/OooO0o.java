package p342o0OOO0Oo;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.ss.ugc.android.alpha_player.widget.GLTextureView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0o extends GLTextureView.Oooo000, GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    public interface OooO00o {
        void OooO00o(@NotNull Surface surface);
    }

    void OooO00o();

    void OooO0O0();

    void OooO0o0(float f, float f2, float f3, float f4);

    void OooO0oO(@NotNull OooO00o oooO00o);

    void setScaleType(@NotNull ScaleType scaleType);
}
