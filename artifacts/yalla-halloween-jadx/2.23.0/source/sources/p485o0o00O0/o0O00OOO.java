package p485o0o00O0;

import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.moment.MomentEditState;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.sendPostTask.MomentSendService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O;
import p515o0o0O0O0.OooO;
import p579o0oOoo.oO0O0Oo0;
import p579o0oOoo.oO0o0000;
import p579o0oOoo.oO0oO000;
import p579o0oOoo.ooOOO00O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47891OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(MomentSendActivity momentSendActivity) {
        super(1);
        this.f47891OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel sendModel = momentSendModel;
        MomentSendActivity momentSendActivity = this.f47891OooO0Oo;
        momentSendActivity.f26190Oooo000 = false;
        int type = momentSendActivity.OooOoO0().getType();
        MomentType momentType = MomentType.Text;
        if (type == momentType.getValue()) {
            List<MomentSelectMedia> list = OooO.f51694OooO00o;
            if (list != null) {
                list.clear();
            }
            OooO.f51694OooO00o = null;
            o00000O o00000oOooOO0 = o00Oo0.OooOO0();
            o00000oOooOO0.OooOO0o("");
            o00000oOooOO0.OooOOO0("");
            o00000oOooOO0.OooOO0O("");
        }
        if (momentSendActivity.OooOoOO().isInEdit()) {
            OooOOO0.OooO("编辑动态 save \nsendModel = " + sendModel);
            oO0O0Oo0 oo0o0oo0 = (oO0O0Oo0) momentSendActivity.f26192Oooo00o.getValue();
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            oo0o0oo0.getClass();
            Intrinsics.checkNotNullParameter(sendModel, "sendPostModel");
            sendModel.setEditState(MomentEditState.Sending);
            BaseActivityK.OooOo0o(oo0o0oo0.f56590OooO00o, null, 0L, 3);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new ooOOO00O(oo0o0oo0, sendModel, null), 2, null);
        } else if (sendModel.getType() == momentType.getValue() || sendModel.getType() == MomentType.Image.getValue() || sendModel.getType() == MomentType.Video.getValue() || sendModel.getType() == MomentType.Poll.getValue()) {
            int i = MomentSendService.f32890OooO0oo;
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            MomentSendService.OooO00o.OooO00o(momentSendActivity, sendModel, true);
            momentSendActivity.finish();
        } else {
            oO0oO000 oo0oo000 = (oO0oO000) momentSendActivity.f26189Oooo0.getValue();
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            o0O00OO o0o00oo2 = new o0O00OO(momentSendActivity);
            oo0oo000.getClass();
            Intrinsics.checkNotNullParameter(sendModel, "sendPostModel");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new oO0o0000(sendModel, o0o00oo2, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
