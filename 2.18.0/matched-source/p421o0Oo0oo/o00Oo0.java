package p421o0Oo0oo;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o0OOO0o> f39738OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Oooo000 f39739OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39740OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39741OooO0Oo;

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    public o00Oo0(@NotNull List<o0OOO0o> changes, @Nullable Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f39738OooO00o = changes;
        this.f39739OooO0O0 = oooo000;
        MotionEvent motionEventOooO00o = OooO00o();
        int i = 0;
        this.f39740OooO0OO = motionEventOooO00o != null ? motionEventOooO00o.getButtonState() : 0;
        MotionEvent motionEventOooO00o2 = OooO00o();
        if (motionEventOooO00o2 != null) {
            motionEventOooO00o2.getMetaState();
        }
        MotionEvent motionEventOooO00o3 = OooO00o();
        int i2 = 3;
        if (motionEventOooO00o3 != null) {
            int actionMasked = motionEventOooO00o3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i = 1;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
            i2 = i;
        } else {
            int size = changes.size();
            while (i < size) {
                o0OOO0o o0ooo0o2 = changes.get(i);
                if (o00Ooo.OooO0Oo(o0ooo0o2)) {
                    i2 = 2;
                    break;
                } else {
                    if (o00Ooo.OooO0O0(o0ooo0o2)) {
                        i2 = 1;
                        break;
                    }
                    i++;
                }
            }
        }
        this.f39741OooO0Oo = i2;
    }

    @Nullable
    public final MotionEvent OooO00o() {
        Oooo000 oooo000 = this.f39739OooO0O0;
        if (oooo000 != null) {
            return oooo000.f39686OooO0O0.f39748OooO0O0;
        }
        return null;
    }
}
