package p540o0o0OoO0;

import android.content.Intent;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54960OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f54960OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.f24529OooOo0.f48501OooO0O0.setValue(Boolean.FALSE);
        o0oo0000.OooO00o.OooO0O0("102228");
        int i = RoomThemeStoreActivity.f26225OooOo0o;
        MixedRoomActivity mixedRoomActivity = this.f54960OooO0Oo;
        Intent intent = new Intent(mixedRoomActivity, (Class<?>) RoomThemeStoreActivity.class);
        intent.putExtra("IS_SHOW_RECHARGE", false);
        intent.putExtra("IsFromMyOutfit", false);
        if (mixedRoomActivity != null) {
            mixedRoomActivity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
