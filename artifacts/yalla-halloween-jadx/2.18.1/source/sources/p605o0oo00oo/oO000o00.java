package p605o0oo00oo;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexFollowingModel;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p495o0o00OOO.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000o00 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO000Oo0 f48294OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Oooo0<List<RoomIndexFollowingModel>> f48295OooO0O0;

    public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexFollowingModel>> {
    }

    public oO000o00(oO000Oo0 oo000oo0, Oooo0<List<RoomIndexFollowingModel>> oooo0) {
        this.f48294OooO00o = oo000oo0;
        this.f48295OooO0O0 = oooo0;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f48295OooO0O0.postValue((List<RoomIndexFollowingModel>) new Response(true, null, false, new Error(str != null ? Integer.valueOf(Integer.parseInt(str)) : null, str2), 6, null));
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
        this.f48294OooO00o.f48291OooO0OO++;
        Oooo0<List<RoomIndexFollowingModel>> oooo0 = this.f48295OooO0O0;
        Object obj = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
        Collection collection = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
        oooo0.postValue((List<RoomIndexFollowingModel>) new Response(true, obj, collection == null || collection.isEmpty(), null, 8, null));
    }
}
