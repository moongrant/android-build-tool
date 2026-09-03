package p538o0o0OOoo;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p256o00ooO0o.oo0oOO0;
import p503o0o00o.o0000O;
import p565o0oOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43835Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ EventModel f43836OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f43837OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f43838OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ShareToFriendsActivity shareToFriendsActivity, long j, EventModel eventModel, oo0oOO0 oo0ooo0) {
        super(0);
        this.f43835Oooo = shareToFriendsActivity;
        this.f43837OoooO00 = j;
        this.f43836OoooO0 = eventModel;
        this.f43838OoooO0O = oo0ooo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f43835Oooo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        o00O0000 o00o0001 = this.f43835Oooo.f22243ooOO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45087OooOOo0) {
            o00O0000 o00o0003 = this.f43835Oooo.f22243ooOO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0002.f45086OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43837OoooO00));
        }
        LiveData<Boolean> liveDataSendEventRoomMsg = ShareToFriendsActivity.OooOoo(this.f43835Oooo).sendEventRoomMsg(listMutableListOf, this.f43836OoooO0.getId(), this.f43836OoooO0.getEventName(), this.f43836OoooO0.getEventImage(), this.f43836OoooO0.getEventTagId(), this.f43836OoooO0.getEventStartTime(), this.f43836OoooO0.getEventEndTime(), this.f43836OoooO0.getRoomIdx(), this.f43836OoooO0.getRoomName(), this.f43836OoooO0.getRoomServerIP());
        ShareToFriendsActivity shareToFriendsActivity = this.f43835Oooo;
        liveDataSendEventRoomMsg.observe(shareToFriendsActivity, new o0000O(shareToFriendsActivity, 2));
        this.f43838OoooO0O.OooO0Oo();
        return Unit.INSTANCE;
    }
}
