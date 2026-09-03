package p580o0oOoOo;

import android.content.Context;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.GiftPropAll;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeUser;
import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import oo0O.OooO0OO;
import p254o00ooO0O.o000Oo0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p604o0oo00oO.oO000OOo;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberTaskInfoModel f46712Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO000OOo f46713Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Context f46714Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(RoomMemberTaskInfoModel roomMemberTaskInfoModel, oO000OOo oo000ooo, Context context) {
        super(0);
        this.f46712Oooo0o = roomMemberTaskInfoModel;
        this.f46713Oooo0oO = oo000ooo;
        this.f46714Oooo0oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftPropModel giftPropModel;
        if (!o000Oo0.OooO00o(Integer.valueOf(this.f46712Oooo0o.getState()))) {
            OooOo.OooO0OO("102020", MapsKt.mapOf(new Pair("taskid", Integer.valueOf(this.f46712Oooo0o.getTaskId()))));
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43139OooO.setValue(Boolean.FALSE);
            int taskId = this.f46712Oooo0o.getTaskId();
            if (taskId == 2) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO00O0o(this.f46714Oooo0oo, null), 3, null);
            } else if (taskId == 3) {
                o00O.f43167OooOoo0.setValue(Boolean.TRUE);
                this.f46713Oooo0oO.OooO0OO();
            } else if (taskId == 4) {
                OooO0OO oooO0OO = OooO0OO.f53327OooO00o;
                GiftPropTypeUser giftPropTypeUser = GiftPropTypeUser.Member;
                Integer value = o00OO00O.f43313OooooOo.OooO00o().f43321OooO0o0.getValue();
                if (value == null) {
                    value = 0;
                }
                int iIntValue = value.intValue();
                Intrinsics.checkNotNullParameter(giftPropTypeUser, "giftPropTypeUser");
                List<GiftPropAll> value2 = OooO0OO.f53329OooO0OO.getValue();
                if (value2 == null) {
                    giftPropModel = null;
                    break;
                }
                Iterator<T> it = value2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        GiftPropAll giftPropAll = (GiftPropAll) it.next();
                        if (giftPropAll.getPropUserType() == giftPropTypeUser.getValue()) {
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
                Context context = this.f46714Oooo0oo;
                MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
                if (mixedRoomActivity != null) {
                    mixedRoomActivity.Oooo0OO(null, 0, giftPropModel != null ? giftPropModel.getGiftId() : -1, GiftPropTypeUser.Member.getValue());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
