package p586o0oOooO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0014R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lo0oOooO0/oO0Oo0o0;", "Landroidx/fragment/app/Fragment;", "", "onResume", "onLazyInit", "", "<set-?>", "isLazyInit", "Z", "()Z", "<init>", "()V", "YLBase_release"}, k = 1, mv = {1, 9, 0})
public class oO0Oo0o0 extends Fragment {
    public static final int $stable = 8;
    private boolean isLazyInit;

    /* JADX INFO: renamed from: isLazyInit, reason: from getter */
    public final boolean getIsLazyInit() {
        return this.isLazyInit;
    }

    public void onLazyInit() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isLazyInit) {
            return;
        }
        onLazyInit();
        this.isLazyInit = true;
    }
}
