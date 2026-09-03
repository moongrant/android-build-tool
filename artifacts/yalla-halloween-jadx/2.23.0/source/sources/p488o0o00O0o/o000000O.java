package p488o0o00O0o;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.yalla.manager.RoomState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function1<AlbumItem, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O f48422OooO0Oo = new o000000O();

    public o000000O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AlbumItem albumItem) {
        boolean z;
        AlbumItem originItem = albumItem;
        Intrinsics.checkNotNullParameter(originItem, "originItem");
        if (originItem.getDuration() < o0OOO0o.f48462OooO00o) {
            o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.add_video_select_min_time_XXX_S), String.valueOf(o0OOO0o.f48462OooO00o / ((long) 1000))));
        } else {
            if (originItem.getSize() / 1024.0d <= o0OOO0o.f48464OooO0OO) {
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                if (o0OOO0o.OooO0oO() == RoomState.InRoom) {
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.in_room_create_moment_select_video));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.add_video_select_max_size_XXX_MB), String.valueOf((int) (o0OOO0o.f48464OooO0OO / 1024.0d))));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
