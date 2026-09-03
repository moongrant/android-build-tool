package p560o0oOOoo;

import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0O00O;
import p651o0ooOOoo.jb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00o00 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f44789OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f44790OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f44791OooO0OO;

    public /* synthetic */ o0O00o00(Object obj, Object obj2, int i) {
        this.f44789OooO00o = i;
        this.f44790OooO0O0 = obj;
        this.f44791OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f44789OooO00o) {
            case 0:
                o0O00O<RoomVoteDialog> voteDialog = (o0O00O) this.f44790OooO0O0;
                MixedRoomActivity activity = (MixedRoomActivity) this.f44791OooO0OO;
                Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                if (obj instanceof Room.VoteResultNotify) {
                    o0O0oo0o o0o0oo0o = o0O0oo0o.f44801OooO00o;
                    o0o0oo0o.OooO0Oo(voteDialog, activity);
                    o0o0oo0o.OooO0O0(((Room.VoteResultNotify) obj).getVoteId(), voteDialog, activity);
                }
                break;
            default:
                MainSearchUserFragment.m372initSearchHistory$lambda19((jb) this.f44790OooO0O0, (MainSearchUserFragment) this.f44791OooO0OO, (List) obj);
                break;
        }
    }
}
