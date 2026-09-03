package p050o000000o;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements ActionMode.Callback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO f26747OooO00o;

    public OooO0o(@NotNull OooO callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f26747OooO00o = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        return this.f26747OooO00o.OooO0OO(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        this.f26747OooO00o.OooO0Oo(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(@Nullable ActionMode actionMode) {
        Function0<Unit> function0 = this.f26747OooO00o.f26740OooO00o;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        return this.f26747OooO00o.OooO0o0(actionMode, menu);
    }
}
