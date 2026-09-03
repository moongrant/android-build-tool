package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00OOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47853OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47854OooO0o0;

    public /* synthetic */ o00OOO0(Object obj, int i) {
        this.f47853OooO0Oo = i;
        this.f47854OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f47853OooO0Oo;
        Object obj = this.f47854OooO0o0;
        switch (i) {
            case 0:
                o00OOOOo this$0 = (o00OOOOo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(true);
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$6((RoomInfoMemberListFragment) obj, view);
                break;
        }
    }
}
