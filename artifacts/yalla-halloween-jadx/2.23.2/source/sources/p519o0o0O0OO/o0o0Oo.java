package p519o0o0O0OO;

import android.app.Activity;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.media3.session.o0000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p429o0OoOO.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<MomentInRoomStateModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f52606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f52607OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(MomentDetailModel momentDetailModel, Activity activity, MutableLongState mutableLongState) {
        super(1);
        this.f52605OooO0Oo = momentDetailModel;
        this.f52607OooO0o0 = activity;
        this.f52606OooO0o = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentInRoomStateModel momentInRoomStateModel) {
        MomentInRoomStateModel it = momentInRoomStateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        long inRoom = it.getInRoom();
        MutableLongState mutableLongState = this.f52606OooO0o;
        mutableLongState.setLongValue(inRoom);
        long longValue = mutableLongState.getLongValue();
        MomentDetailModel momentDetailModel = this.f52605OooO0Oo;
        if (longValue != 0) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO0o0(mutableLongState.getLongValue(), EnterRoomParentPage.VideoFeed);
            LiveEventBus.get("VIDEO_FEED_HERE_USER").post(Long.valueOf(momentDetailModel.getUserId()));
        } else {
            Activity activity = this.f52607OooO0o0;
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activity, o0000O00.OooO00o(momentDetailModel.getUserId()), false, 12);
            }
        }
        return Unit.INSTANCE;
    }
}
