package p546o0o0OoOO;

import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import p140o00OOOo0.o0ooOOo;
import p255o00ooO0O.o000O0O0;
import p561o0oOOoo0.oo0O;
import p619o0oo0o.o00;
import p709oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Function0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44297Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44298OoooO00;

    public /* synthetic */ o3(Object obj, int i) {
        this.f44297Oooo = i;
        this.f44298OoooO00 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44297Oooo) {
            case 0:
                DeleteMusicActivity deleteMusicActivity = (DeleteMusicActivity) this.f44298OoooO00;
                if (deleteMusicActivity.f22814Oooooo == null) {
                    Objects.requireNonNull(o0ooOOo.OooO0O0());
                    deleteMusicActivity.f22814Oooooo = new o000O();
                }
                deleteMusicActivity.f22814Oooooo.OooO0OO(deleteMusicActivity, o000O0O0.OooO0OO(R.string.Deleting));
                ArrayList arrayList = new ArrayList();
                for (MusicTable musicTable : deleteMusicActivity.f22813OooooOo.getData()) {
                    if (musicTable.isSelect) {
                        arrayList.add(musicTable);
                    }
                }
                o00.f48478OooO00o.OooO00o(arrayList);
                deleteMusicActivity.runOnUiThread(new s3(deleteMusicActivity));
                break;
            default:
                UserCountrySelectActivity.OooOoO(((oo0O) this.f44298OoooO00).f44865OooO0O0, true, true);
                break;
        }
        return null;
    }
}
