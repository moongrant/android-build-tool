package p544o0o0OoOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.MusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class e5 implements Observer<MusicTable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44229OooO00o;

    public e5(MusicActivity musicActivity) {
        this.f44229OooO00o = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicTable musicTable) {
        this.f44229OooO00o.f22909OooooO0.notifyDataSetChanged();
    }
}
