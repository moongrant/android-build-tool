package p492o0o00OO0;

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
import p414o0Oo0oO.oO00O0o;
import p415o0Oo0oO0.o00Ooo;
import p521o0o0O0o0.o0ooOOo;
import p590o0oOooo0.p;
import p590o0oOooo0.s;
import p590o0oOooo0.x;
import p590o0oOooo0.y;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49336OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(MomentSendActivity momentSendActivity) {
        super(1);
        this.f49336OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel sendPostModel = momentSendModel;
        MomentSendActivity momentSendActivity = this.f49336OooO0Oo;
        momentSendActivity.f25741Oooo000 = false;
        int type = momentSendActivity.OooOoO0().getType();
        MomentType momentType = MomentType.Text;
        if (type == momentType.getValue()) {
            List<MomentSelectMedia> list = o0ooOOo.f52994OooO00o;
            if (list != null) {
                list.clear();
            }
            o0ooOOo.f52994OooO00o = null;
            oO00O0o oo00o0oOooOO0 = o00Ooo.OooOO0();
            oo00o0oOooOO0.OooOO0o("");
            oo00o0oOooOO0.OooOOO0("");
            oo00o0oOooOO0.OooOO0O("");
        }
        if (momentSendActivity.OooOoOO().isInEdit()) {
            o0000O00.OooO("编辑动态 save \nsendModel = " + sendPostModel);
            p pVar = (p) momentSendActivity.f25743Oooo00o.getValue();
            Intrinsics.checkNotNull(sendPostModel);
            pVar.getClass();
            Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
            sendPostModel.setEditState(MomentEditState.Sending);
            BaseActivityK.OooOo0o(pVar.f57246OooO00o, null, 0L, 3);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new s(pVar, sendPostModel, null), 2, null);
        } else if (sendPostModel.getType() == momentType.getValue() || sendPostModel.getType() == MomentType.Image.getValue() || sendPostModel.getType() == MomentType.Video.getValue() || sendPostModel.getType() == MomentType.Poll.getValue()) {
            int i = MomentSendService.f32346OooO0oo;
            Intrinsics.checkNotNull(sendPostModel);
            MomentSendService.OooO00o.OooO00o(momentSendActivity, sendPostModel, true);
            momentSendActivity.finish();
        } else {
            y yVar = (y) momentSendActivity.f25740Oooo0.getValue();
            Intrinsics.checkNotNull(sendPostModel);
            o0O00 o0o01 = new o0O00(momentSendActivity);
            yVar.getClass();
            Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new x(sendPostModel, o0o01, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
