package p579o0oOoOoO;

import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p424o0OoO0Oo.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO000<List<RoomIndexFollowingModel>> f56538OooO0o0;

    public ooooO000(o00OO000<List<RoomIndexFollowingModel>> o00oo001) {
        this.f56538OooO0o0 = o00oo001;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f56538OooO0o0.postValue(new Response(true, null, false, null, 14, null));
    }
}
