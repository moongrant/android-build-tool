package p544o0o0OoOO;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;
import com.yalla.yalla.ui.activity.room.MusicActivity;
import p391o0OOooOo.o0O00000;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class h5 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44245Oooo;

    public class OooO00o implements o00O00o0 {
        @Override // p620o0oo0o0O.o00O00o0
        public final void onActivityResult(int i, Intent intent) {
        }
    }

    public h5(MusicActivity musicActivity) {
        this.f44245Oooo = musicActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        o0O00000.OooO0OO("InRoom_music_edit");
        o00O00OO o00o00oo2 = new o00O00OO(this.f44245Oooo);
        o00o00oo2.f48618OooO0O0 = DeleteMusicActivity.class;
        o00o00oo2.OooO0O0(new OooO00o());
    }
}
