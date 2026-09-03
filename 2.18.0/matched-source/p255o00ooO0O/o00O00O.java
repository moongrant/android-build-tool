package p255o00ooO0O;

import android.view.View;
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34375Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34376OoooO00;

    public /* synthetic */ o00O00O(Object obj, int i) {
        this.f34375Oooo = i;
        this.f34376OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        switch (this.f34375Oooo) {
            case 0:
                Function1 listener = (Function1) this.f34376OoooO00;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - o00O00.f34367OooO00o) > 500) {
                    o00O00.f34367OooO00o = jCurrentTimeMillis;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    listener.invoke(it);
                }
                break;
            default:
                WalletCrystalFragment.m442initView$lambda1((WalletCrystalFragment) this.f34376OoooO00, it);
                break;
        }
    }
}
