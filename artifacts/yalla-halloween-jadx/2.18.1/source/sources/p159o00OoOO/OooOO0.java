package p159o00OoOO;

import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements Function0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32364Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f32365Oooo0oO;

    public /* synthetic */ OooOO0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f32364Oooo0o = i;
        this.f32365Oooo0oO = baseFragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32364Oooo0o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32365Oooo0oO;
                int i = MixedRoomActivity.f11764o00000oO;
                mixedRoomActivity.OooOoo();
                break;
            default:
                SearchMusicActivity searchMusicActivity = (SearchMusicActivity) this.f32365Oooo0oO;
                int i2 = SearchMusicActivity.f23016Oooooo0;
                searchMusicActivity.finish();
                break;
        }
        return null;
    }
}
