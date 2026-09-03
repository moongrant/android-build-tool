package p544o0o0OoOO;

import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;
import java.util.List;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class q3 implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f44296OooO00o;

    public q3(DeleteMusicActivity deleteMusicActivity) {
        this.f44296OooO00o = deleteMusicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        List<MusicTable> list2 = list;
        this.f44296OooO00o.f22794Ooooo0o.setNewData(list2);
        this.f44296OooO00o.f22794Ooooo0o.setLoadComplete();
        this.f44296OooO00o.OooOoO0(o000O0O0.OooO0OO(R.string.title_activity_music) + "(" + list2.size() + ")");
        this.f44296OooO00o.OooOoo0(0);
    }
}
