package p050o000000o;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class OooO0OO extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO f26746OooO00o;

    public OooO0OO(@NotNull OooO callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f26746OooO00o = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f26746OooO00o.OooO0OO(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        this.f26746OooO00o.OooO0Oo(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(@Nullable ActionMode actionMode) {
        Function0<Unit> function0 = this.f26746OooO00o.f26740OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(@Nullable ActionMode actionMode, @Nullable View view, @Nullable Rect rect) {
        OooOO0O oooOO0O = this.f26746OooO00o.f26741OooO0O0;
        if (rect != null) {
            rect.set((int) oooOO0O.f30404OooO00o, (int) oooOO0O.f30405OooO0O0, (int) oooOO0O.f30406OooO0OO, (int) oooOO0O.f30407OooO0Oo);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f26746OooO00o.OooO0o0(actionMode, menu);
    }
}
