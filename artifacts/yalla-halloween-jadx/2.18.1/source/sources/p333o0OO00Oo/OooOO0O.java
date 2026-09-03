package p333o0OO00Oo;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zai;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Drawable.ConstantState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f37212OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f37213OooO0O0;

    public OooOO0O(@Nullable OooOO0O oooOO0O) {
        if (oooOO0O != null) {
            this.f37212OooO00o = oooOO0O.f37212OooO00o;
            this.f37213OooO0O0 = oooOO0O.f37213OooO0O0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f37212OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
