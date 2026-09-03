package p118o00O0Oo0;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OooO0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p118o00O0Oo0.OooO0o
    public final void OooO0O0() {
        this.f36582OooOO0o.setVisibility(8);
        OooOO0 oooOO1 = this.f36586OooOOOo;
        int i = oooOO1.f36553OooOO0o;
        int i2 = oooOO1.f36552OooOO0O;
        Activity activity = this.f36578OooO0oO;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i2, i != -1 ? activity.getString(i) : "");
            this.f36577OooO.setVisibility(0);
        }
        int i3 = oooOO1.f36554OooOOO;
        int i4 = oooOO1.f36555OooOOO0;
        if (i4 != -1 || i3 != -1) {
            OooO0o0(i4, i3 != -1 ? activity.getString(i3) : "");
            this.f36580OooOO0.setVisibility(0);
        }
        int i5 = oooOO1.f36556OooOOOO;
        this.f36580OooOO0.setTextColor(i5);
        this.f36577OooO.setTextColor(i5);
        OooO0OO();
    }
}
