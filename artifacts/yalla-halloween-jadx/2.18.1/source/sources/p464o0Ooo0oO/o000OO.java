package p464o0Ooo0oO;

import android.support.v4.media.OooO00o;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO extends RecyclerView.oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SparseArray<View> f40472OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f40472OooO00o = new SparseArray<>();
    }

    @NotNull
    public final <T extends View> T OooO00o(@IdRes int i) {
        T t = (T) OooO0O0(i);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(OooO00o.OooO00o("No view found with id ", i).toString());
    }

    @Nullable
    public final <T extends View> T OooO0O0(@IdRes int i) {
        T t;
        T t2 = (T) this.f40472OooO00o.get(i);
        if (t2 == null && (t = (T) this.itemView.findViewById(i)) != null) {
            this.f40472OooO00o.put(i, t);
            return t;
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @NotNull
    public final o000OO OooO0OO(@IdRes int i, boolean z) {
        OooO00o(i).setVisibility(z ? 8 : 0);
        return this;
    }

    @Nullable
    public final o000OO OooO0Oo(@IdRes int i, @StringRes int i2) {
        ((TextView) OooO00o(i)).setText(i2);
        return this;
    }

    @NotNull
    public final o000OO OooO0o(@IdRes int i) {
        OooO00o(i).setVisibility(0);
        return this;
    }

    @NotNull
    public final o000OO OooO0o0(@IdRes int i, @Nullable CharSequence charSequence) {
        ((TextView) OooO00o(i)).setText(charSequence);
        return this;
    }
}
