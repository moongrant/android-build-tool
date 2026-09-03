package p581o0oOoOOo;

import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f46002Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f46003OoooO00;

    public /* synthetic */ k1(Object obj, int i) {
        this.f46002Oooo = i;
        this.f46003OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46002Oooo) {
            case 0:
                l1 this$0 = (l1) this.f46003OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            case 1:
                MainSearchRoomFragment.m365initSearchHistory$lambda11((MainSearchRoomFragment) this.f46003OoooO00, view);
                break;
            default:
                TreasureBoxFragment.m420initView$lambda10((TreasureBoxFragment) this.f46003OoooO00, view);
                break;
        }
    }
}
