package p590o0oOooo0;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeSendGift;
import com.yalla.yalla.model.gift.GiftPropBlindSendResultModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.PostGiftResultModel;
import com.yalla.yalla.model.moment.PostSendGiftModel;
import com.yalla.yalla.repository.WebEventRepository;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p391o0OOooo0.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends Lambda implements Function1<PostSendGiftModel, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f57139OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f57140OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ l f57141OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f57142OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f57143OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f57144OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ long f57145OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<List<GiftPropBlindSendResultModel>, Unit> f57146OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, int i, l lVar, int i2, long j, int i3, long j2, g gVar) {
        super(1);
        this.f57140OooO0Oo = str;
        this.f57142OooO0o0 = i;
        this.f57141OooO0o = lVar;
        this.f57143OooO0oO = i2;
        this.f57144OooO0oo = j;
        this.f57139OooO = i3;
        this.f57145OooOO0 = j2;
        this.f57146OooOO0O = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PostSendGiftModel postSendGiftModel) {
        PostSendGiftModel postSendGiftModel2 = postSendGiftModel;
        if (postSendGiftModel2 != null) {
            int i = this.f57143OooO0oO;
            long j = this.f57145OooOO0;
            String str = this.f57140OooO0Oo;
            postSendGiftModel2.setLocalGiftId(o0OoOo0.OooO(0L, str));
            if (this.f57142OooO0o0 == GiftPropTypeUser.Backpack.getValue()) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                oo0o0Oo.OooO0o((int) postSendGiftModel2.getLocalGiftId(), postSendGiftModel2.getRemainingNum(), postSendGiftModel2.getMinExpirationTime());
            } else if (postSendGiftModel2.getPropType() == 0) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Long.valueOf(postSendGiftModel2.getCoinBalance()));
            } else {
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0Oo().postValue(Long.valueOf(postSendGiftModel2.getCrystalsBalance()));
            }
            long j2 = ((long) i) * this.f57144OooO0oo;
            l lVar = this.f57141OooO0o;
            MomentDetailModel momentDetailModel = lVar.f57136OooO0oO;
            if (momentDetailModel != null) {
                if (!(String.valueOf(momentDetailModel.getUserId()).length() == 0)) {
                    MomentLogActionTypeSendGift momentLogActionTypeSendGift = new MomentLogActionTypeSendGift(null, null, null, null, 15, null);
                    momentLogActionTypeSendGift.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                    momentLogActionTypeSendGift.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(momentDetailModel.getId())));
                    momentLogActionTypeSendGift.setGift_value(o0OoOo0.OooOOO0("", Long.valueOf(j2)));
                    momentLogActionTypeSendGift.setGift_type(o0OoOo0.OooOO0o(Integer.valueOf(this.f57139OooO), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                    WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                    MomentLogActionType momentLogActionType = MomentLogActionType.send_gift;
                    String json = momentLogActionTypeSendGift.toJson();
                    String sessionId = momentDetailModel.getSessionId();
                    webEventRepository.getClass();
                    WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
                }
            }
            MomentDetailModel momentDetailModel2 = lVar.f57136OooO0oO;
            if (momentDetailModel2 != null) {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                momentDetailModel2.addGiftGiver(o0OoOo0.OooOO0((Long) o0O00oO0.OooOOo0().getValue()), o0OoOo0.OooOOO((String) o0O00oO0.OooO().getValue(), ""));
                momentDetailModel2.setTotalPropValue(o0OoOo0.OooOO0(Long.valueOf(postSendGiftModel2.getTotalPropValue())));
                Function1<MomentDetailModel, Unit> function1 = lVar.f57133OooO0Oo;
                if (function1 != null) {
                    function1.invoke(momentDetailModel2);
                }
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
            }
            LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN").post(new PostGiftResultModel(j, postSendGiftModel2.getTotalPropValue(), Long.parseLong(str), i, postSendGiftModel2.getProps().isEmpty() ^ true ? postSendGiftModel2.getProps().get(0).getPropImage() : ""));
            Function1<List<GiftPropBlindSendResultModel>, Unit> function2 = this.f57146OooOO0O;
            if (function2 != null) {
                function2.invoke(postSendGiftModel2.getProps());
            }
        }
        return Unit.INSTANCE;
    }
}
