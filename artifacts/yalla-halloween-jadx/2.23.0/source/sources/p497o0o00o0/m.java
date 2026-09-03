package p497o0o00o0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p489o0o00OO0.OooO;
import p519o0o0O0oO.o0O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomAnnouncementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomAnnouncementManager.kt\ncom/yalla/yalla/ui/activity/room/live/top/RoomAnnouncementManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class m extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0OO00O f49214OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0O00O f49215OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
        o0OO00O o0oo00o2 = this.f49214OooO0O0;
        if (o0oo00o2 != null && o0oo00o2.f10134OooO0O0.isShowing()) {
            o0oo00o2.OooO0OO();
        }
        o0O00O o0o00o2 = this.f49215OooO0OO;
        if (o0o00o2 == null || !o0o00o2.isShowing()) {
            return;
        }
        o0o00o2.dismiss();
    }

    public final void OooO0OO() {
        o0O00O o0o00o2 = new o0O00O(this.f48470OooO00o);
        String value = OooO00o.f24978OooO0o0.f47490OooO0o.getValue();
        o0o00o2.OooOO0o(value, Boolean.valueOf(value == null || StringsKt.isBlank(value)));
        this.f49215OooO0OO = o0o00o2;
        o0o00o2.show();
    }
}
