package p573o0oOoOOO;

import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p420o0OoO0OO.o0OOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0Oo0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o<List<RoomIndexFollowingModel>> f56302OooO0o0;

    public oO0O0Oo0(o0OOO0o<List<RoomIndexFollowingModel>> o0ooo0o2) {
        this.f56302OooO0o0 = o0ooo0o2;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f56302OooO0o0.postValue(new Response(true, null, false, null, 14, null));
    }
}
