package p544o0o0OoOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.activity.room.MusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class f5 implements Observer<MusicState.State> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44234OooO00o;

    public f5(MusicActivity musicActivity) {
        this.f44234OooO00o = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicState.State state) {
        this.f44234OooO00o.f22909OooooO0.notifyDataSetChanged();
    }
}
