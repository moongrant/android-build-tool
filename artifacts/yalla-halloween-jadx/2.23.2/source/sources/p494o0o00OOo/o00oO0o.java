package p494o0o00OOo;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.yalla.manager.RoomState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p429o0OoOO.o0Oo0oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function1<AlbumItem, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00oO0o f49581OooO0Oo = new o00oO0o();

    public o00oO0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AlbumItem albumItem) {
        boolean z;
        AlbumItem originItem = albumItem;
        Intrinsics.checkNotNullParameter(originItem, "originItem");
        if (originItem.getDuration() < o000oOoO.f49574OooO00o) {
            o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(o000000.add_video_select_min_time_XXX_S), String.valueOf(o000oOoO.f49574OooO00o / ((long) 1000))));
        } else {
            if (originItem.getSize() / 1024.0d <= o000oOoO.f49576OooO0OO) {
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                if (o0Oo0oo.OooO0oO() == RoomState.InRoom) {
                    o000O00.OooO0O0(o0000.OooO0OO(o000000.in_room_create_moment_select_video));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(o000000.add_video_select_max_size_XXX_MB), String.valueOf((int) (o000oOoO.f49576OooO0OO / 1024.0d))));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
