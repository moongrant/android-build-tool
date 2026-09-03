package p544o0o0OoOO;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class u6 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f44323Oooo0o;

    public u6(SearchMusicActivity searchMusicActivity) {
        this.f44323Oooo0o = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000O o000o = this.f44323Oooo0o.f23023OooooOO;
        if (o000o != null) {
            o000o.OooO00o();
        }
        o0O00000.OooO0OO("InRoom_music_addmusic");
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Success));
        this.f44323Oooo0o.finish();
    }
}
