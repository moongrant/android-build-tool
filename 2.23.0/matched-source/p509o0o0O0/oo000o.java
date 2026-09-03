package p509o0o0O0;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51325OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f51327OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51328OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51329OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51330OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f51331OooOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFeaturedFragment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, boolean z, MutableState<Boolean> mutableState2) {
        super(0);
        this.f51326OooO0Oo = momentAdapterTag;
        this.f51328OooO0o0 = momentDetailModel;
        this.f51327OooO0o = mutableState;
        this.f51329OooO0oO = baseMomentDetailVM;
        this.f51330OooO0oo = lifecycleOwner;
        this.f51325OooO = z;
        this.f51331OooOO0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentAdapterTag momentAdapterTag = this.f51326OooO0Oo;
        int i = momentAdapterTag == null ? -1 : OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
        MomentDetailModel momentDetailModel = this.f51328OooO0o0;
        if (i == 1 || i == 2 || i == 3) {
            o0OO000.OooO0O0("103024", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        } else if (i == 4) {
            o0OO000.OooO0O0("103025", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        this.f51327OooO0o.setValue(Boolean.TRUE);
        o00O0O.OooO0o(this.f51328OooO0o0, this.f51327OooO0o, this.f51329OooO0oO, this.f51330OooO0oo, this.f51325OooO, this.f51331OooOO0, null);
        return Unit.INSTANCE;
    }
}
