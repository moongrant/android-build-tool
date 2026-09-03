package p110o000ooo0;

import android.view.View;
import android.widget.TextView;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.view.ScrollableView;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f35902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35903OooO0o0;

    public /* synthetic */ o0000Ooo(int i, Object obj, Object obj2) {
        this.f35901OooO0Oo = i;
        this.f35903OooO0o0 = obj;
        this.f35902OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35901OooO0Oo;
        Object obj = this.f35902OooO0o;
        Object obj2 = this.f35903OooO0o0;
        switch (i) {
            case 0:
                o0000O00 this$0 = (o0000O00) obj2;
                String query = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                this$0.getClass();
                CollectionsKt.emptyList();
                throw null;
            case 1:
                WalletCoinFragment.calculatedMaxWidthForItemView$lambda$37$lambda$36$lambda$35$lambda$34((TextView) obj2, (WalletCoinFragment) obj);
                return;
            default:
                ScrollableView this$1 = (ScrollableView) obj2;
                Function0 function0 = (Function0) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Iterator it = this$1.f30070OooO0Oo.iterator();
                while (it.hasNext()) {
                    this$1.getLinearLayout().removeView((View) it.next());
                }
                this$1.f30070OooO0Oo.clear();
                if (function0 != null) {
                    function0.invoke();
                }
                this$1.invalidate();
                return;
        }
    }
}
