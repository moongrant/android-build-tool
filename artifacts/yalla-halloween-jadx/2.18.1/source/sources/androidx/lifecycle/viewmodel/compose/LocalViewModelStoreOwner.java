package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Lo000oOoO/o0O0OO0;", "provides", "getCurrent", "(Lo000oOoO/oOO00O;I)Landroidx/lifecycle/ViewModelStoreOwner;", "current", "<init>", "()V", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 6, 0})
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;

    @NotNull
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();

    @NotNull
    private static final o0O0O0o0<ViewModelStoreOwner> LocalViewModelStoreOwner = o00OO0O0.OooO0O0(o.f29323OooO00o, new Function0<ViewModelStoreOwner>() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$LocalViewModelStoreOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ViewModelStoreOwner invoke() {
            return null;
        }
    });

    private LocalViewModelStoreOwner() {
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final ViewModelStoreOwner getCurrent(@Nullable oOO00O ooo00o, int i) {
        ooo00o.OooO0o0(-584162872);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) ooo00o.OooOO0o(LocalViewModelStoreOwner);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) ooo00o.OooOO0o(o0O0O00.f6594OooO0o));
        }
        ooo00o.Oooo0o0();
        return viewModelStoreOwner;
    }

    @NotNull
    public final o0O0OO0<ViewModelStoreOwner> provides(@NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.OooO0O0(viewModelStoreOwner);
    }
}
