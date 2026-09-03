package p022Oooo00O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import o0O0OOO0.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000OO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f498OooO0o0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f497OooO0Oo = i;
        this.f498OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f497OooO0Oo;
        Object obj2 = this.f498OooO0o0;
        switch (i) {
            case 0:
                ((o000.OooO00o) obj2).setValue(obj);
                break;
            default:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) obj2;
                mixedRoomActivity.f23434OooOoO.postDelayed(new OooOo(2, mixedRoomActivity, (ChatModel) obj), 300L);
                break;
        }
    }
}
