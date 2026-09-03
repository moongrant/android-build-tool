package p263o00oooO;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zai;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends Drawable.ConstantState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f41068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f41069OooO0O0;

    public o000000O(@Nullable o000000O o000000o2) {
        if (o000000o2 != null) {
            this.f41068OooO00o = o000000o2.f41068OooO00o;
            this.f41069OooO0O0 = o000000o2.f41069OooO0O0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f41068OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
