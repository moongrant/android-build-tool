package p425o0OoO0OO;

import android.view.View;
import android.view.ViewGroup;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395o0Oo.OooOOO;
import p422o0OoO0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public interface o0Oo0oo {
    void OooO00o();

    void OooO0O0();

    boolean OooO0OO();

    void OooO0Oo(@NotNull ViewGroup viewGroup);

    void OooO0o(@NotNull ViewGroup viewGroup);

    void OooO0o0(float f, float f2);

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

    void setPlayerController(@NotNull OooOOO oooOOO);

    void setScaleType(@NotNull ScaleType scaleType);

    void setVideoRenderer(@NotNull OooO0OO oooO0OO);

    void setVisibility(int i);
}
