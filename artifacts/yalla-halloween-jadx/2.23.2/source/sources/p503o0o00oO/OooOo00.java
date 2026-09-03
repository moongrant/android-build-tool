package p503o0o00oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p495o0o00Oo.OooOO0O;
import p650o0ooo.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomAnnouncementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomAnnouncementManager.kt\ncom/yalla/yalla/ui/activity/room/live/top/RoomAnnouncementManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class OooOo00 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o000O f50181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public oo0o0O0 f50182OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        o000O o000o = this.f50181OooO0O0;
        if (o000o != null && o000o.f38488OooO0O0.isShowing()) {
            o000o.OooO0OO();
        }
        oo0o0O0 oo0o0o0 = this.f50182OooO0OO;
        if (oo0o0o0 == null || !oo0o0o0.isShowing()) {
            return;
        }
        oo0o0o0.dismiss();
    }

    public final void OooO0OO() {
        oo0o0O0 oo0o0o0 = new oo0o0O0(this.f49626OooO00o);
        String value = OooO00o.f24516OooO0o0.f48463OooO0o.getValue();
        oo0o0o0.OooOO0o(value, Boolean.valueOf(value == null || StringsKt.isBlank(value)));
        this.f50182OooO0OO = oo0o0o0;
        oo0o0o0.show();
    }
}
