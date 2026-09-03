package p084o000Ooo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends Drawable.ConstantState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f28376OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Drawable.ConstantState f28377OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ColorStateList f28378OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PorterDuff.Mode f28379OooO0Oo;

    public o000OOo(@Nullable o000OOo o000ooo2) {
        this.f28378OooO0OO = null;
        this.f28379OooO0Oo = oo0o0Oo.f28385OoooO0O;
        if (o000ooo2 != null) {
            this.f28376OooO00o = o000ooo2.f28376OooO00o;
            this.f28377OooO0O0 = o000ooo2.f28377OooO0O0;
            this.f28378OooO0OO = o000ooo2.f28378OooO0OO;
            this.f28379OooO0Oo = o000ooo2.f28379OooO0Oo;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f28376OooO00o;
        Drawable.ConstantState constantState = this.f28377OooO0O0;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public final Drawable newDrawable() {
        return new o0O0O00(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public final Drawable newDrawable(@Nullable Resources resources) {
        return new o0O0O00(this, resources);
    }
}
