package p201o00o0OoO;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p193o00o0O00.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends o00O0000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p201o00o0OoO.o00O0000
    public final void OooO0O0() {
        this.f33226OoooOO0.setVisibility(8);
        o0OoOo0 o0oooo1 = this.f33229OoooOo0;
        int i = o0oooo1.f33156OooOOO0;
        int i2 = o0oooo1.f33154OooOO0o;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i != -1 ? this.f33221Oooo.getString(i) : "", i2);
            this.f33223OoooO0.setVisibility(0);
        }
        o0OoOo0 o0oooo2 = this.f33229OoooOo0;
        int i3 = o0oooo2.f33157OooOOOO;
        int i4 = o0oooo2.f33155OooOOO;
        if (i4 != -1 || i3 != -1) {
            OooO0o(i3 != -1 ? this.f33221Oooo.getString(i3) : "", i4);
            this.f33225OoooO0O.setVisibility(0);
        }
        int i5 = this.f33229OoooOo0.f33168OooOoO0;
        this.f33225OoooO0O.setTextColor(i5);
        this.f33223OoooO0.setTextColor(i5);
        OooO0OO();
    }
}
