package o0O000Oo;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f40967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f40968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40969OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f40970OooO0oO;

    public OooOO0O(View view) {
        super(0);
        this.f40970OooO0oO = new int[2];
        this.f40967OooO0Oo = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f40967OooO0Oo.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.f40967OooO0Oo;
        int[] iArr = this.f40970OooO0oO;
        view.getLocationOnScreen(iArr);
        this.f40969OooO0o0 = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public final WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        for (WindowInsetsAnimationCompat windowInsetsAnimationCompat : list) {
            if ((windowInsetsAnimationCompat.f5360OooO00o.OooO0OO() & 8) != 0) {
                this.f40967OooO0Oo.setTranslationY(o0O000.OooO0O0.OooO0O0(this.f40968OooO0o, 0, windowInsetsAnimationCompat.f5360OooO00o.OooO0O0()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public final WindowInsetsAnimationCompat.OooO00o onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.OooO00o oooO00o) {
        View view = this.f40967OooO0Oo;
        int[] iArr = this.f40970OooO0oO;
        view.getLocationOnScreen(iArr);
        int i = this.f40969OooO0o0 - iArr[1];
        this.f40968OooO0o = i;
        view.setTranslationY(i);
        return oooO00o;
    }
}
