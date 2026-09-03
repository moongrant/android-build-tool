package p544o0o0OoOO;

import OooO00o.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f44313Oooo0o;

    public t3(DeleteMusicActivity deleteMusicActivity) {
        this.f44313Oooo0o = deleteMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        o0O00000.OooO0OO("InRoom_music_delete");
        this.f44313Oooo0o.f22794Ooooo0o.notifyDataSetChanged();
        this.f44313Oooo0o.f22794Ooooo0o.setLoadComplete();
        if (this.f44313Oooo0o.f22794Ooooo0o.getData().size() == 0) {
            string = "";
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("(");
            sbOooO0o0.append(this.f44313Oooo0o.f22794Ooooo0o.getData().size());
            sbOooO0o0.append(")");
            string = sbOooO0o0.toString();
        }
        this.f44313Oooo0o.OooOoO0(o000O0O0.OooO0OO(R.string.title_activity_music) + string);
        DeleteMusicActivity.OooOoO(this.f44313Oooo0o);
        this.f44313Oooo0o.f22796OooooOO.OooO00o();
        if (OooO0OO.OooO00o(string)) {
            this.f44313Oooo0o.finish();
        }
    }
}
