package p544o0o0OoOO;

import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import p139o00OOOo0.o0ooOOo;
import p254o00ooO0O.o000O0O0;
import p559o0oOOoo0.oo0O;
import p617o0oo0o.o00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p3 implements Function0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44288Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44289Oooo0oO;

    public /* synthetic */ p3(Object obj, int i) {
        this.f44288Oooo0o = i;
        this.f44289Oooo0oO = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44288Oooo0o) {
            case 0:
                DeleteMusicActivity deleteMusicActivity = (DeleteMusicActivity) this.f44289Oooo0oO;
                if (deleteMusicActivity.f22796OooooOO == null) {
                    Objects.requireNonNull(o0ooOOo.OooO00o());
                    deleteMusicActivity.f22796OooooOO = new o000O();
                }
                deleteMusicActivity.f22796OooooOO.OooO0OO(deleteMusicActivity, o000O0O0.OooO0OO(R.string.Deleting));
                ArrayList arrayList = new ArrayList();
                for (MusicTable musicTable : deleteMusicActivity.f22794Ooooo0o.getData()) {
                    if (musicTable.isSelect) {
                        arrayList.add(musicTable);
                    }
                }
                o00.f48461OooO00o.OooO00o(arrayList);
                deleteMusicActivity.runOnUiThread(new t3(deleteMusicActivity));
                break;
            default:
                UserCountrySelectActivity.OooOoO(((oo0O) this.f44289Oooo0oO).f44849OooO0O0, true, true);
                break;
        }
        return null;
    }
}
