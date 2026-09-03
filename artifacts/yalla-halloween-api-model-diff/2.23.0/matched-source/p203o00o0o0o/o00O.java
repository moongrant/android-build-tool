package p203o00o0o0o;

import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.OooOO0O;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O implements o00oo0o.o00O.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39180OooO0o0;

    public /* synthetic */ o00O(Object obj, int i) {
        this.f39179OooO0Oo = i;
        this.f39180OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f39179OooO0Oo;
        Object obj = this.f39180OooO0o0;
        switch (i) {
            case 1:
                MemberListRemoveActivity this$0 = (MemberListRemoveActivity) obj;
                int i2 = MemberListRemoveActivity.f26562OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO(false);
                break;
            default:
                int i3 = OooOO0O.f60386OooOo0;
                ((OooOO0O) obj).OooO0oO();
                break;
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMediaMetadataChanged(OooOOO.this.f11116Oooo0oO);
    }
}
