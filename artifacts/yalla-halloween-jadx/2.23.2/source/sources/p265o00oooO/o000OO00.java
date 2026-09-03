package p265o00oooO;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zai;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f40397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40398OooO0O0;

    public o000OO00(@Nullable o000OO00 o000oo01) {
        if (o000oo01 != null) {
            this.f40397OooO00o = o000oo01.f40397OooO00o;
            this.f40398OooO0O0 = o000oo01.f40398OooO0O0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f40397OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
