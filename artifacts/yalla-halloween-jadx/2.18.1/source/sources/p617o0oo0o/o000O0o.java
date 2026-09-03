package p617o0oo0o;

import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeSendGift;
import com.yalla.yalla.model.GiftPropBlindSendResultModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.PostGiftResultModel;
import com.yalla.yalla.model.PostSendGiftModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.oo0o0O0;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends Lambda implements Function1<PostSendGiftModel, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f48518Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48519Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48520Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f48521Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f48522OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f48523OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<List<GiftPropBlindSendResultModel>, Unit> f48524OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0o(o000O000 o000o001, int i, long j, int i2, long j2, String str, Function1<? super List<GiftPropBlindSendResultModel>, Unit> function1) {
        super(1);
        this.f48519Oooo0o = o000o001;
        this.f48520Oooo0oO = i;
        this.f48521Oooo0oo = j;
        this.f48518Oooo = i2;
        this.f48523OoooO00 = j2;
        this.f48522OoooO0 = str;
        this.f48524OoooO0O = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PostSendGiftModel postSendGiftModel) {
        PostSendGiftModel postSendGiftModel2 = postSendGiftModel;
        if (postSendGiftModel2 != null) {
            o000O000 o000o001 = this.f48519Oooo0o;
            int i = this.f48520Oooo0oO;
            long j = this.f48521Oooo0oo;
            int i2 = this.f48518Oooo;
            long j2 = this.f48523OoooO00;
            String str = this.f48522OoooO0;
            Function1<List<GiftPropBlindSendResultModel>, Unit> function1 = this.f48524OoooO0O;
            long j3 = ((long) i) * j;
            MomentDetailModel momentDetailModel = o000o001.f48500OooO0o;
            if (momentDetailModel != null) {
                if (!(String.valueOf(momentDetailModel.getUserId()).length() == 0)) {
                    MomentLogActionTypeSendGift momentLogActionTypeSendGift = new MomentLogActionTypeSendGift(null, null, null, null, 15, null);
                    momentLogActionTypeSendGift.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                    momentLogActionTypeSendGift.setDiscoveryid(OooO.OooO(Long.valueOf(momentDetailModel.getId()), ""));
                    momentLogActionTypeSendGift.setGift_value(OooO.OooO(Long.valueOf(j3), ""));
                    momentLogActionTypeSendGift.setGift_type(OooO.OooO0oo(Integer.valueOf(i2), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                    MomentLogActionType actionType = MomentLogActionType.send_gift;
                    String actionInfo = momentLogActionTypeSendGift.toJson();
                    String sessionId = momentDetailModel.getSessionId();
                    Intrinsics.checkNotNullParameter(actionType, "actionType");
                    Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0o0O0(actionType, actionInfo, sessionId, null), 3, null);
                }
            }
            MomentDetailModel momentDetailModel2 = o000o001.f48500OooO0o;
            if (momentDetailModel2 != null) {
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                momentDetailModel2.addGiftGiver(oOO00O.OooO0o(oooOOO.OooOo().getValue()), o00O0.OooO0oO(oooOOO.OooO0oo().getValue()));
                momentDetailModel2.setTotalPropValue(oOO00O.OooO0o(Long.valueOf(postSendGiftModel2.getTotalPropValue())));
                Function1<MomentDetailModel, Unit> function2 = o000o001.f48498OooO0OO;
                if (function2 != null) {
                    function2.invoke(momentDetailModel2);
                }
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
            }
            if (postSendGiftModel2.getPropType() == 0) {
                OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(postSendGiftModel2.getCoinBalance()));
            } else {
                OooOOO.f41216OooO00o.OooO0o().postValue(Long.valueOf(postSendGiftModel2.getCrystalsBalance()));
            }
            LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN").post(new PostGiftResultModel(j2, postSendGiftModel2.getTotalPropValue(), Long.parseLong(str), i, postSendGiftModel2.getProps().isEmpty() ^ true ? postSendGiftModel2.getProps().get(0).getPropImage() : ""));
            if (function1 != null) {
                function1.invoke(postSendGiftModel2.getProps());
            }
        }
        return Unit.INSTANCE;
    }
}
