package p462o0Ooo0o;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0014R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lo0Ooo0o/o0000;", "Landroidx/fragment/app/Fragment;", "", "onResume", "onLazyInit", "", "<set-?>", "isLazyInit", "Z", "()Z", "<init>", "()V", "Common_release"}, k = 1, mv = {1, 7, 1})
public class o0000 extends Fragment {
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
