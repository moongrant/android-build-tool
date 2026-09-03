package p022Oooo00O;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000OO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f500OooO0o0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f499OooO0Oo = i;
        this.f500OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f499OooO0Oo;
        Object obj2 = this.f500OooO0o0;
        switch (i) {
            case 0:
                ((o000.OooO00o) obj2).setValue(obj);
                break;
            case 1:
                PrivateChatActivity this$0 = (PrivateChatActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = PrivateChatActivity.f25239Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (zBooleanValue) {
                    o000O o000o = new o000O(this$0);
                    o000o.OooOo00(o0000.OooO0OO(o000000.backpack_frozen));
                    o000o.OooOO0o();
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = RoomSettingActivity.f26191Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int i4 = 0;
                for (Object obj3 : this$1.f26195OooOo00) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj3;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.EnterRoomAllow) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(!Intrinsics.areEqual(bool, Boolean.TRUE)));
                        this$1.OooOo().notifyDataSetChanged();
                    } else {
                        i4 = i5;
                    }
                    break;
                }
                break;
        }
    }
}
