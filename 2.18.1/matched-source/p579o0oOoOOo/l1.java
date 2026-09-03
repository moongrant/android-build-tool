package p579o0oOoOOo;

import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46011Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f46012Oooo0oO;

    public /* synthetic */ l1(Object obj, int i) {
        this.f46011Oooo0o = i;
        this.f46012Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46011Oooo0o) {
            case 0:
                m1 this$0 = (m1) this.f46012Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            case 1:
                MainSearchRoomFragment.m365initSearchHistory$lambda11((MainSearchRoomFragment) this.f46012Oooo0oO, view);
                break;
            default:
                TreasureBoxFragment.m420initView$lambda10((TreasureBoxFragment) this.f46012Oooo0oO, view);
                break;
        }
    }
}
