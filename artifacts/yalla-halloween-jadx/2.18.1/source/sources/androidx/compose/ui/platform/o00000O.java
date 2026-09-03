package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f6401OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public ActionMode f6402OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p050o000000o.OooO f6403OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public TextToolbarStatus f6404OooO0Oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00000O.this.f6402OooO0O0 = null;
            return Unit.INSTANCE;
        }
    }

    public o00000O(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f6401OooO00o = view;
        this.f6403OooO0OO = new p050o000000o.OooO(new OooO00o());
        this.f6404OooO0Oo = TextToolbarStatus.Hidden;
    }

    @Override // androidx.compose.ui.platform.o00OO0OO
    public final void OooO00o(@NotNull o00O0O.OooOO0O rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        p050o000000o.OooO oooO = this.f6403OooO0OO;
        Objects.requireNonNull(oooO);
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        oooO.f26741OooO0O0 = rect;
        p050o000000o.OooO oooO2 = this.f6403OooO0OO;
        oooO2.f26742OooO0OO = function0;
        oooO2.f26745OooO0o0 = function2;
        oooO2.f26743OooO0Oo = function1;
        oooO2.f26744OooO0o = function3;
        ActionMode actionMode = this.f6402OooO0O0;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.f6404OooO0Oo = TextToolbarStatus.Shown;
            this.f6402OooO0O0 = Build.VERSION.SDK_INT >= 23 ? oo0O.f6629OooO00o.OooO0O0(this.f6401OooO00o, new p050o000000o.OooO0OO(this.f6403OooO0OO), 1) : this.f6401OooO00o.startActionMode(new p050o000000o.OooO0o(oooO2));
        }
    }

    @Override // androidx.compose.ui.platform.o00OO0OO
    public final void OooO0O0() {
        this.f6404OooO0Oo = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f6402OooO0O0;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f6402OooO0O0 = null;
    }

    @Override // androidx.compose.ui.platform.o00OO0OO
    @NotNull
    public final TextToolbarStatus getStatus() {
        return this.f6404OooO0Oo;
    }
}
