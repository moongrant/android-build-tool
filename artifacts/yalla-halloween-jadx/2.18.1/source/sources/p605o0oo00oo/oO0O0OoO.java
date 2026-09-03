package p605o0oo00oo;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexFollowingModel;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000Oo0;
import p388o0OOooO.o00000O0;
import p495o0o00OOO.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0OoO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0<List<RoomIndexFollowingModel>> f48296OooO00o;

    public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexFollowingModel>> {
    }

    public oO0O0OoO(Oooo0<List<RoomIndexFollowingModel>> oooo0) {
        this.f48296OooO00o = oooo0;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        this.f48296OooO00o.postValue((List<RoomIndexFollowingModel>) new Response(false, null, false, new Error(Integer.valueOf(o000Oo0.OooO0OO(code2, 1)), message), 6, null));
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        this.f48296OooO00o.postValue((List<RoomIndexFollowingModel>) new Response(true, commonParseMultiListModel != null ? commonParseMultiListModel.data : null, false, null, 12, null));
    }
}
