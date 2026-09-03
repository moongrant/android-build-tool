package p490o0o00O0;

import android.view.View;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p531o0o0OOO0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0OOOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f48842OooO0o0;

    public /* synthetic */ o0O0OOOo(int i, View.OnClickListener onClickListener) {
        this.f48841OooO0Oo = i;
        this.f48842OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomUserInfoModel newUser;
        int i = this.f48841OooO0Oo;
        View.OnClickListener onClickListener = this.f48842OooO0o0;
        switch (i) {
            case 0:
                TurnOnLoginProtectionActivity this$0 = (TurnOnLoginProtectionActivity) onClickListener;
                int i2 = TurnOnLoginProtectionActivity.f24881OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                o000OO this$1 = (o000OO) onClickListener;
                InOutRoomModel inOutRoomModel = (InOutRoomModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f53342OooOo0O && (newUser = inOutRoomModel.getNewUser()) != null) {
                    int kind = inOutRoomModel.getKind();
                    LinkedHashMap linkedHashMap = this$1.f53341OooOo00;
                    if (kind == 0) {
                        newUser.isInRoom().setValue(Boolean.TRUE);
                        linkedHashMap.put(newUser.getUserId().getValue(), newUser);
                    } else {
                        newUser.isInRoom().setValue(Boolean.FALSE);
                        linkedHashMap.remove(newUser.getUserId().getValue());
                    }
                    int i3 = 0;
                    this$1.OooOOo(0);
                    for (Object obj2 : this$1.f53336OooOOo) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj2;
                        if (roomUserInfoModel.getUserId().getValue().longValue() == newUser.getUserId().getValue().longValue()) {
                            roomUserInfoModel.isInRoom().setValue(newUser.isInRoom().getValue());
                        }
                        this$1.OooOO0O().notifyItemChanged(i3);
                        i3 = i4;
                    }
                    break;
                }
                break;
        }
    }
}
