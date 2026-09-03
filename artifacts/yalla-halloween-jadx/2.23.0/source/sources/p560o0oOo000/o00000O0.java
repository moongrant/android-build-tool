package p560o0oOo000;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface o00000O0 {
    void OooO00o();

    @Composable
    void OooO0O0(@NotNull SnapshotStateList<EventModel> snapshotStateList, @Nullable Composer composer, int i);

    void OooO0OO();

    void OooO0Oo(@NotNull MixedRoomActivity mixedRoomActivity, @NotNull EventModel eventModel, @NotNull Function1 function1);

    void OooO0o(@NotNull EventModel eventModel);

    @Composable
    void OooO0o0(@Nullable Composer composer, int i);
}
