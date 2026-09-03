package p579o0oOoOOo;

import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46093Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f46094Oooo0oO;

    public /* synthetic */ oOO0OO(Object obj, int i) {
        this.f46093Oooo0o = i;
        this.f46094Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46093Oooo0o) {
            case 0:
                oOO0OOO this$0 = (oOO0OOO) this.f46094Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            default:
                MainSearchRoomFragment.m367initSearchHistory$lambda15$lambda12((MainSearchRoomFragment) this.f46094Oooo0oO, view);
                break;
        }
    }
}
