package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.SearchMusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class x6 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f44343Oooo0o;

    public x6(SearchMusicActivity searchMusicActivity) {
        this.f44343Oooo0o = searchMusicActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchMusicActivity searchMusicActivity = this.f44343Oooo0o;
        searchMusicActivity.f23022OooooO0.setNewData(searchMusicActivity.f23019OoooOoo);
        this.f44343Oooo0o.f23022OooooO0.setLoadComplete();
        SearchMusicActivity searchMusicActivity2 = this.f44343Oooo0o;
        searchMusicActivity2.f23021Ooooo0o = 0;
        searchMusicActivity2.f23018OoooOoO.setEnabled(false);
    }
}
