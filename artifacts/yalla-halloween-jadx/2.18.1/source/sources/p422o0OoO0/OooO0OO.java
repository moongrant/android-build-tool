package p422o0OoO0;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.ss.ugc.android.alpha_player.widget.GLTextureView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0OO extends GLTextureView.Oooo000, GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    public interface OooO00o {
        void OooO00o(@NotNull Surface surface);
    }

    void OooO00o();

    void OooO0O0();

    void OooO0OO(@NotNull OooO00o oooO00o);

    void OooO0Oo(float f, float f2, float f3, float f4);

    void setScaleType(@NotNull ScaleType scaleType);
}
