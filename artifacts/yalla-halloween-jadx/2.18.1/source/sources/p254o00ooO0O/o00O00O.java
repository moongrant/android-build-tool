package p254o00ooO0O;

import android.view.View;
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34353Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34354Oooo0oO;

    public /* synthetic */ o00O00O(Object obj, int i) {
        this.f34353Oooo0o = i;
        this.f34354Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        switch (this.f34353Oooo0o) {
            case 0:
                Function1 listener = (Function1) this.f34354Oooo0oO;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - o00O00.f34345OooO00o) > 500) {
                    o00O00.f34345OooO00o = jCurrentTimeMillis;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    listener.invoke(it);
                }
                break;
            default:
                WalletCrystalFragment.m442initView$lambda1((WalletCrystalFragment) this.f34354Oooo0oO, it);
                break;
        }
    }
}
