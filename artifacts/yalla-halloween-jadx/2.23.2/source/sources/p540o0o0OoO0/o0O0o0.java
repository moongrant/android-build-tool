package p540o0o0OoO0;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000000;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0oo0000.OooO00o;
import p391o0OOooo0.oo0o0Oo;
import p483o0o000Oo.o0000Ooo;
import p577o0oOoOo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f54802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f54803OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f54804OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(RoomMemberTaskInfoModel roomMemberTaskInfoModel, o0OO000 o0oo000, Context context) {
        super(0);
        this.f54802OooO0Oo = roomMemberTaskInfoModel;
        this.f54804OooO0o0 = o0oo000;
        this.f54803OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftPropModel giftPropModel;
        RoomMemberTaskInfoModel roomMemberTaskInfoModel = this.f54802OooO0Oo;
        if (!o000000.OooO00o(Integer.valueOf(roomMemberTaskInfoModel.getState()))) {
            OooO00o.OooO0OO("102020", MapsKt.mapOf(new Pair("taskid", Integer.valueOf(roomMemberTaskInfoModel.getTaskId()))));
            o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
            o0000ooo.f48519OooO00o.setValue(Boolean.FALSE);
            int taskId = roomMemberTaskInfoModel.getTaskId();
            Context context = this.f54803OooO0o;
            if (taskId == 2) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O0o00O(context, null), 3, null);
            } else if (taskId == 3) {
                o0000ooo.f48537OooOo.setValue(Boolean.TRUE);
                this.f54804OooO0o0.OooO0Oo();
            } else if (taskId == 4) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                GiftPropTypeUser giftPropTypeUser = GiftPropTypeUser.Member;
                Integer value = OooO0O0.f24533OoooOOO.OooO00o().f24541OooO0o0.getValue();
                if (value == null) {
                    value = 0;
                }
                int iIntValue = value.intValue();
                Intrinsics.checkNotNullParameter(giftPropTypeUser, "giftPropTypeUser");
                List<GiftPropAll> value2 = oo0o0Oo.f43576OooO0Oo.getValue();
                if (value2 == null) {
                    giftPropModel = null;
                    break;
                }
                Iterator<T> it = value2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        GiftPropAll giftPropAll = (GiftPropAll) it.next();
                        if (giftPropAll.getGiftPropTypeUser() == giftPropTypeUser.getValue()) {
                            List<GiftPropModel> listForRegion = giftPropAll.getListForRegion(iIntValue);
                            if (listForRegion.size() > 0) {
                                giftPropModel = listForRegion.get(0);
                                break;
                            }
                        }
                    }
                    giftPropModel = null;
                    break;
                }
                MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
                if (mixedRoomActivity != null) {
                    int giftId = giftPropModel != null ? giftPropModel.getGiftId() : -1;
                    GiftPropTypeUser.Member.getValue();
                    mixedRoomActivity.OooOoOO(null, 0, giftId, false);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
