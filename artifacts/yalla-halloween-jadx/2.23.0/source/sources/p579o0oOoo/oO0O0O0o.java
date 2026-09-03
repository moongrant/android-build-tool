package p579o0oOoo;

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
import p385o0OOooOO.oOO00O;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0O0o extends Lambda implements Function1<PostSendGiftModel, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f56582OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f56583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f56584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f56585OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f56586OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f56587OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ long f56588OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function1<List<GiftPropBlindSendResultModel>, Unit> f56589OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(String str, int i, oO0O0O00 oo0o0o00, int i2, long j, int i3, long j2, oO0O00 oo0o00) {
        super(1);
        this.f56583OooO0Oo = str;
        this.f56585OooO0o0 = i;
        this.f56584OooO0o = oo0o0o00;
        this.f56586OooO0oO = i2;
        this.f56587OooO0oo = j;
        this.f56582OooO = i3;
        this.f56588OooOO0 = j2;
        this.f56589OooOO0O = oo0o00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PostSendGiftModel postSendGiftModel) {
        PostSendGiftModel postSendGiftModel2 = postSendGiftModel;
        if (postSendGiftModel2 != null) {
            int i = this.f56586OooO0oO;
            long j = this.f56588OooOO0;
            String str = this.f56583OooO0Oo;
            postSendGiftModel2.setLocalGiftId(o0OoOo0.OooO(0L, str));
            if (this.f56585OooO0o0 == GiftPropTypeUser.Backpack.getValue()) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                oOO00O.OooO0o((int) postSendGiftModel2.getLocalGiftId(), postSendGiftModel2.getRemainingNum(), postSendGiftModel2.getMinExpirationTime());
            } else if (postSendGiftModel2.getPropType() == 0) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(Long.valueOf(postSendGiftModel2.getCoinBalance()));
            } else {
                o000000O o000000o3 = o000000O.f46674OooO00o;
                o000000O.OooO0Oo().postValue(Long.valueOf(postSendGiftModel2.getCrystalsBalance()));
            }
            long j2 = ((long) i) * this.f56587OooO0oo;
            oO0O0O00 oo0o0o00 = this.f56584OooO0o;
            MomentDetailModel momentDetailModel = oo0o0o00.f56579OooO0oO;
            if (momentDetailModel != null) {
                if (!(String.valueOf(momentDetailModel.getUserId()).length() == 0)) {
                    MomentLogActionTypeSendGift momentLogActionTypeSendGift = new MomentLogActionTypeSendGift(null, null, null, null, 15, null);
                    momentLogActionTypeSendGift.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                    momentLogActionTypeSendGift.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(momentDetailModel.getId())));
                    momentLogActionTypeSendGift.setGift_value(o0OoOo0.OooOOO0("", Long.valueOf(j2)));
                    momentLogActionTypeSendGift.setGift_type(o0OoOo0.OooOO0o(Integer.valueOf(this.f56582OooO), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                    WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                    MomentLogActionType momentLogActionType = MomentLogActionType.send_gift;
                    String json = momentLogActionTypeSendGift.toJson();
                    String sessionId = momentDetailModel.getSessionId();
                    webEventRepository.getClass();
                    WebEventRepository.OooO0o0(momentLogActionType, json, sessionId);
                }
            }
            MomentDetailModel momentDetailModel2 = oo0o0o00.f56579OooO0oO;
            if (momentDetailModel2 != null) {
                o000000O o000000o4 = o000000O.f46674OooO00o;
                momentDetailModel2.addGiftGiver(o0OoOo0.OooOO0((Long) o000000O.OooOOo0().getValue()), o0OoOo0.OooOOO((String) o000000O.OooO().getValue(), ""));
                momentDetailModel2.setTotalPropValue(o0OoOo0.OooOO0(Long.valueOf(postSendGiftModel2.getTotalPropValue())));
                Function1<MomentDetailModel, Unit> function1 = oo0o0o00.f56576OooO0Oo;
                if (function1 != null) {
                    function1.invoke(momentDetailModel2);
                }
                LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel2);
            }
            LiveEventBus.get("SEND_POST_GIFT_TOTEL_COIN").post(new PostGiftResultModel(j, postSendGiftModel2.getTotalPropValue(), Long.parseLong(str), i, postSendGiftModel2.getProps().isEmpty() ^ true ? postSendGiftModel2.getProps().get(0).getPropImage() : ""));
            Function1<List<GiftPropBlindSendResultModel>, Unit> function2 = this.f56589OooOO0O;
            if (function2 != null) {
                function2.invoke(postSendGiftModel2.getProps());
            }
        }
        return Unit.INSTANCE;
    }
}
