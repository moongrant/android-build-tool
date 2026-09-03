package p653o0ooo;

import android.content.Intent;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f58131OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f58131OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.f24537OooOo0.f48587OooO0O0.setValue(Boolean.FALSE);
        h0.OooO0O0("102228");
        int i = RoomThemeStoreActivity.f26227OooOo0o;
        MixedRoomActivity mixedRoomActivity = this.f58131OooO0Oo;
        Intent intent = new Intent(mixedRoomActivity, (Class<?>) RoomThemeStoreActivity.class);
        intent.putExtra("IS_SHOW_RECHARGE", false);
        intent.putExtra("IsFromMyOutfit", false);
        if (mixedRoomActivity != null) {
            mixedRoomActivity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
