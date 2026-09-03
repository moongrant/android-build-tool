package p669oO0Oo;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000000;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import com.yalla.yalla.service.room.OooO00o;
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
import p385o0OOooOO.oOO00O;
import p475o0o000.oo0o0Oo;
import p571o0oOoOO.o0O0o000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f60534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f60535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f60536OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(RoomMemberTaskInfoModel roomMemberTaskInfoModel, o0O0o000 o0o0o000, Context context) {
        super(0);
        this.f60534OooO0Oo = roomMemberTaskInfoModel;
        this.f60536OooO0o0 = o0o0o000;
        this.f60535OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftPropModel giftPropModel;
        RoomMemberTaskInfoModel roomMemberTaskInfoModel = this.f60534OooO0Oo;
        if (!o000000.OooO00o(Integer.valueOf(roomMemberTaskInfoModel.getState()))) {
            o0OO000.OooO0O0("102020", MapsKt.mapOf(new Pair("taskid", Integer.valueOf(roomMemberTaskInfoModel.getTaskId()))));
            oo0o0Oo oo0o0oo = OooO00o.f24986OooOOOO;
            oo0o0oo.f47506OooO00o.setValue(Boolean.FALSE);
            int taskId = roomMemberTaskInfoModel.getTaskId();
            Context context = this.f60535OooO0o;
            if (taskId == 2) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oOO00O(context, null), 3, null);
            } else if (taskId == 3) {
                oo0o0oo.f47524OooOo.setValue(Boolean.TRUE);
                this.f60536OooO0o0.OooO0Oo();
            } else if (taskId == 4) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                GiftPropTypeUser giftPropTypeUser = GiftPropTypeUser.Member;
                Integer value = OooO0O0.f24995OoooOOO.OooO00o().f25003OooO0o0.getValue();
                if (value == null) {
                    value = 0;
                }
                int iIntValue = value.intValue();
                Intrinsics.checkNotNullParameter(giftPropTypeUser, "giftPropTypeUser");
                List<GiftPropAll> value2 = oOO00O.f44354OooO0Oo.getValue();
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
