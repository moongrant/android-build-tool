package p448o0OoOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import kotlin.jvm.internal.Intrinsics;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0ooO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47486OooO0o0;

    public /* synthetic */ o0O0ooO(Object obj, int i) {
        this.f47485OooO0Oo = i;
        this.f47486OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object it) {
        int i = this.f47485OooO0Oo;
        Object obj = this.f47486OooO0o0;
        switch (i) {
            case 0:
                OooOOOO lazyPagingItems = (OooOOOO) obj;
                Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                Intrinsics.checkNotNullParameter(it, "it");
                lazyPagingItems.OooO0Oo();
                break;
            default:
                MainRoomMineJoinedFragment.onLazyInit$lambda$0((MainRoomMineJoinedFragment) obj, it);
                break;
        }
    }
}
