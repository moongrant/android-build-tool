package p159o00OoOO;

import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements Function0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32420Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f32421Oooo0oO;

    public /* synthetic */ o0000oo(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f32420Oooo0o = i;
        this.f32421Oooo0oO = baseFragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32420Oooo0o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32421Oooo0oO;
                int i = MixedRoomActivity.f11764o00000oO;
                mixedRoomActivity.OooOoo();
                break;
            default:
                SearchMusicActivity searchMusicActivity = (SearchMusicActivity) this.f32421Oooo0oO;
                int i2 = SearchMusicActivity.f23016Oooooo0;
                if (!searchMusicActivity.OooOoO()) {
                    searchMusicActivity.finish();
                }
                break;
        }
        return null;
    }
}
