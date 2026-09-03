package p160o00OoOO;

import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements Function0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32386Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f32387OoooO00;

    public /* synthetic */ OooOO0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f32386Oooo = i;
        this.f32387OoooO00 = baseFragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32386Oooo) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f32387OoooO00;
                int i = MixedRoomActivity.f11779o0000O00;
                mixedRoomActivity.OooOoo();
                break;
            default:
                SearchMusicActivity searchMusicActivity = (SearchMusicActivity) this.f32387OoooO00;
                int i2 = SearchMusicActivity.f23035Ooooooo;
                searchMusicActivity.finish();
                break;
        }
        return null;
    }
}
