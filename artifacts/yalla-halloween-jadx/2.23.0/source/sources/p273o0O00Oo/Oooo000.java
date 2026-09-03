package p273o0O00Oo;

import android.animation.Animator;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Oooo000<T extends Animator> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo0 f41748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f41749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f41750OooO0OO;

    public Oooo000(int i) {
        this.f41749OooO0O0 = new float[i * 2];
        this.f41750OooO0OO = new int[i];
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();

    public abstract void OooO0OO(@NonNull BaseProgressIndicator.OooO0OO oooO0OO);

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();
}
