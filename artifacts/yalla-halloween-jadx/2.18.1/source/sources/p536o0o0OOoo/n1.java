package p536o0o0OOoo;

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
import p255o00ooO0o.oo0oOO0;
import p501o0o00o.o000OO;
import p563o0oOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f43824Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43825Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f43826Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f43827Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ShareToFriendsActivity shareToFriendsActivity, long j, EventModel eventModel, oo0oOO0 oo0ooo0) {
        super(0);
        this.f43825Oooo0o = shareToFriendsActivity;
        this.f43826Oooo0oO = j;
        this.f43827Oooo0oo = eventModel;
        this.f43824Oooo = oo0ooo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f43825Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        o00O0000 o00o0001 = this.f43825Oooo0o.f22218OoooooO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45071OooOOo0) {
            o00O0000 o00o0003 = this.f43825Oooo0o.f22218OoooooO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0002.f45070OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43826Oooo0oO));
        }
        LiveData<Boolean> liveDataSendEventRoomMsg = ShareToFriendsActivity.OooOoo(this.f43825Oooo0o).sendEventRoomMsg(listMutableListOf, this.f43827Oooo0oo.getId(), this.f43827Oooo0oo.getEventName(), this.f43827Oooo0oo.getEventImage(), this.f43827Oooo0oo.getEventTagId(), this.f43827Oooo0oo.getEventStartTime(), this.f43827Oooo0oo.getEventEndTime(), this.f43827Oooo0oo.getRoomIdx(), this.f43827Oooo0oo.getRoomName(), this.f43827Oooo0oo.getRoomServerIP());
        ShareToFriendsActivity shareToFriendsActivity = this.f43825Oooo0o;
        liveDataSendEventRoomMsg.observe(shareToFriendsActivity, new o000OO(shareToFriendsActivity, 2));
        this.f43824Oooo.OooO0Oo();
        return Unit.INSTANCE;
    }
}
