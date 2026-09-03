package p581o0oOoOOo;

import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOO0OO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f46123Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f46124OoooO00;

    public /* synthetic */ oOO0OO0O(Object obj, int i) {
        this.f46123Oooo = i;
        this.f46124OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f46123Oooo) {
            case 0:
                oOO0OO this$0 = (oOO0OO) this.f46124OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            default:
                MainSearchRoomFragment.m367initSearchHistory$lambda15$lambda12((MainSearchRoomFragment) this.f46124OoooO00, view);
                break;
        }
    }
}
