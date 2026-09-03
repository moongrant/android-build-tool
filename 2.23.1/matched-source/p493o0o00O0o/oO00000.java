package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p571o0oOo0o0.o00Oo0;
import p571o0oOo0o0.o0O0O00;
import p675oO0Oo.i1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49218OooO0o0;

    public /* synthetic */ oO00000(Object obj, int i) {
        this.f49217OooO0Oo = i;
        this.f49218OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object it) {
        int i = this.f49217OooO0Oo;
        o00Oo0 o00oo1 = null;
        i1.OooO0OO oooO0OO = null;
        Object obj = this.f49218OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO().f45007OooO.OooOoOO(true, true, true);
                break;
            case 1:
                MixedRoomActivity activity = (MixedRoomActivity) obj;
                Intrinsics.checkNotNullParameter(activity, "$activity");
                Intrinsics.checkNotNullParameter(it, "it");
                o00Oo0 o00oo2 = o0O0O00.f56326OooO0Oo;
                if (o00oo2 != null) {
                    o00oo1 = o00oo2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                }
                o00oo1.OooO0Oo(activity);
                break;
            case 2:
                i1 this$1 = (i1) obj;
                int i3 = i1.f59228OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.List<com.app.base.protobuf.room.Room.UserModel>");
                    this$1.f59234OooOOo0.clear();
                    Iterator it2 = ((List) it).iterator();
                    while (it2.hasNext()) {
                        this$1.f59234OooOOo0.add(RoomUserInfoModel.INSTANCE.of((Room.UserModel) it2.next()).getUserId().getValue());
                    }
                    i1.OooO0OO oooO0OO2 = this$1.f59236OooOo0;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO2;
                    }
                    oooO0OO.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                MainRoomFragment.initObserver$lambda$4((MainRoomFragment) obj, it);
                break;
        }
    }
}
