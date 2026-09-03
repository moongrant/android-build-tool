package p620o0oo0o0O;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo0oo0o0O/oOO00O;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class oOO00O extends Fragment {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final SparseArray<Function2<Integer, Intent, Unit>> f48620Oooo0o = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Function2<Integer, Intent, Unit> function2 = this.f48620Oooo0o.get(i);
        if (function2 == null) {
            return;
        }
        this.f48620Oooo0o.remove(i);
        function2.invoke(Integer.valueOf(i2), intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
