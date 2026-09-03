package p345o0OOO0oO;

import android.view.View;
import android.view.ViewGroup;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import o0OOO0O0.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p342o0OOO0Oo.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOO0 {
    void OooO00o();

    void OooO0O0();

    boolean OooO0OO();

    void OooO0Oo(float f, float f2);

    void OooO0o(@NotNull ViewGroup viewGroup);

    void OooO0o0(@NotNull ViewGroup viewGroup);

    void bringToFront();

    int getMeasuredHeight();

    int getMeasuredWidth();

    @NotNull
    ScaleType getScaleType();

    @NotNull
    View getView();

    void onPause();

    void release();

    void requestRender();

    void setLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams);

    void setPlayerController(@NotNull OooO00o oooO00o);

    void setScaleType(@NotNull ScaleType scaleType);

    void setVideoRenderer(@NotNull OooO0o oooO0o);

    void setVisibility(int i);
}
