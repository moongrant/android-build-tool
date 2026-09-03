package p141o00OOoo;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends OooOOOO {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p141o00OOoo.OooOOOO
    public final void OooO0O0() {
        this.f37519OooOO0o.setVisibility(8);
        p139o00OOOo0.OooOOO oooOOO = this.f37523OooOOOo;
        int i = oooOOO.f37490OooOO0o;
        int i2 = oooOOO.f37489OooOO0O;
        Activity activity = this.f37515OooO0oO;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i2, i != -1 ? activity.getString(i) : "");
            this.f37514OooO.setVisibility(0);
        }
        int i3 = oooOOO.f37491OooOOO;
        int i4 = oooOOO.f37492OooOOO0;
        if (i4 != -1 || i3 != -1) {
            OooO0o0(i4, i3 != -1 ? activity.getString(i3) : "");
            this.f37517OooOO0.setVisibility(0);
        }
        int i5 = oooOOO.f37493OooOOOO;
        this.f37517OooOO0.setTextColor(i5);
        this.f37514OooO.setTextColor(i5);
        OooO0OO();
    }
}
