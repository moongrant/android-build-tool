package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f52017OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52019OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52020OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52021OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f52022OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52023OooOO0;

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
    public o00O0000(MomentAdapterTag momentAdapterTag, MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, boolean z, MutableState<Boolean> mutableState2) {
        super(0);
        this.f52018OooO0Oo = momentAdapterTag;
        this.f52020OooO0o0 = momentDetailModel;
        this.f52019OooO0o = mutableState;
        this.f52021OooO0oO = baseMomentDetailVM;
        this.f52022OooO0oo = lifecycleOwner;
        this.f52017OooO = z;
        this.f52023OooOO0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentAdapterTag momentAdapterTag = this.f52018OooO0Oo;
        int i = momentAdapterTag == null ? -1 : OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
        MomentDetailModel momentDetailModel = this.f52020OooO0o0;
        if (i == 1 || i == 2 || i == 3) {
            o0oo0000.OooO00o.OooO0OO("103024", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        } else if (i == 4) {
            o0oo0000.OooO00o.OooO0OO("103025", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        this.f52019OooO0o.setValue(Boolean.TRUE);
        o000OO00.OooO0o(this.f52020OooO0o0, this.f52019OooO0o, this.f52021OooO0oO, this.f52022OooO0oo, this.f52017OooO, this.f52023OooOO0, null);
        return Unit.INSTANCE;
    }
}
