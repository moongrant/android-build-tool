package p524o0o0OO0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomMemberConveneListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog$initObserver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n1864#2,3:569\n*S KotlinDebug\n*F\n+ 1 RoomMemberConveneListDialog.kt\ncom/yalla/yalla/ui/fragment/room/RoomMemberConveneListDialog$initObserver$2\n*L\n163#1:569,3\n*E\n"})
public final class o0O0O0O implements Observer<InOutRoomModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53501OooO0Oo;

    public o0O0O0O(o0O00 o0o01) {
        this.f53501OooO0Oo = o0o01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(InOutRoomModel inOutRoomModel) {
        RoomUserInfoModel newUser;
        InOutRoomModel inOutRoomModel2 = inOutRoomModel;
        o0O00 o0o01 = this.f53501OooO0Oo;
        if (!o0o01.f53476OooOo0O || (newUser = inOutRoomModel2.getNewUser()) == null) {
            return;
        }
        int kind = inOutRoomModel2.getKind();
        LinkedHashMap linkedHashMap = o0o01.f53475OooOo00;
        if (kind == 0) {
            newUser.isInRoom().setValue(Boolean.TRUE);
            linkedHashMap.put(newUser.getUserId().getValue(), newUser);
        } else {
            newUser.isInRoom().setValue(Boolean.FALSE);
            linkedHashMap.remove(newUser.getUserId().getValue());
        }
        int i = 0;
        o0o01.OooOOo(0);
        for (Object obj : o0o01.f53470OooOOo) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
            if (roomUserInfoModel.getUserId().getValue().longValue() == newUser.getUserId().getValue().longValue()) {
                roomUserInfoModel.isInRoom().setValue(newUser.isInRoom().getValue());
            }
            o0o01.OooOO0O().notifyItemChanged(i);
            i = i2;
        }
    }
}
