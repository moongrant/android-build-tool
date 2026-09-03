package p561o0oOOooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOOo0.o0OOO0o;
import p255o00ooO0o.oo0oOO0;
import p530o0o0OOO.o00OO00O;
import p545o0o0OoOo.c8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOoOOO0 extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f44919OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0OOO0o f44920OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        oo0oOO0 oo0ooo0 = this.f44919OooO0O0;
        if (oo0ooo0 != null && oo0ooo0.f34200OooO0O0.isShowing()) {
            oo0ooo0.OooO0Oo();
        }
        o0OOO0o o0ooo0o2 = this.f44920OooO0OO;
        if (o0ooo0o2 == null || !o0ooo0o2.isShowing()) {
            return;
        }
        o0ooo0o2.dismiss();
    }

    public final void OooO0OO() {
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f44365OooO00o);
        String value = o00OO00O.f43313OooooOo.OooO00o().f43337OooOo0O.getValue();
        o0ooo0o2.OooOOO(value, Boolean.valueOf(value == null || StringsKt.isBlank(value)));
        this.f44920OooO0OO = o0ooo0o2;
        o0ooo0o2.show();
    }
}
