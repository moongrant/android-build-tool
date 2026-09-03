package p536o0o0OOoo;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000Oo0;
import p391o0OOooOo.o0O00000;
import p524o0o0O0oO.oo00oO;
import p563o0oOo0.o00O0000;
import p649o0ooOOoo.wb;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ wb f43856Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43857Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f43858Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ RoomConfiguration f43859Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(ShareToFriendsActivity shareToFriendsActivity, long j, RoomConfiguration roomConfiguration, wb wbVar) {
        super(0);
        this.f43857Oooo0o = shareToFriendsActivity;
        this.f43858Oooo0oO = j;
        this.f43859Oooo0oo = roomConfiguration;
        this.f43856Oooo = wbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f43857Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        o0O00000.OooO0OO("InRoom_share_friends_share");
        o00O0000 o00o0001 = this.f43857Oooo0o.f22218OoooooO;
        o00O0000 o00o0002 = null;
        if (o00o0001 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0001 = null;
        }
        if (o00o0001.f45071OooOOo0) {
            o00O0000 o00o0003 = this.f43857Oooo0o.f22218OoooooO;
            if (o00o0003 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0002 = o00o0003;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0002.f45070OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43858Oooo0oO));
        }
        ShareToFriendVM shareToFriendVMOooOoo = ShareToFriendsActivity.OooOoo(this.f43857Oooo0o);
        long jOooO0o0 = o000Oo0.OooO0o0(this.f43859Oooo0oo.getBarid());
        long jOooO0o1 = o000Oo0.OooO0o0(this.f43859Oooo0oo.getBaridx());
        String barname = this.f43859Oooo0oo.getBarname();
        Intrinsics.checkNotNullExpressionValue(barname, "roomConfiguration.barname");
        String barimage = this.f43859Oooo0oo.getBarimage();
        Intrinsics.checkNotNullExpressionValue(barimage, "roomConfiguration.barimage");
        LiveData<Boolean> liveDataShareRoom = shareToFriendVMOooOoo.shareRoom(listMutableListOf, jOooO0o0, jOooO0o1, barname, barimage, this.f43856Oooo.f50883OooO0O0.getText().toString());
        ShareToFriendsActivity shareToFriendsActivity = this.f43857Oooo0o;
        liveDataShareRoom.observe(shareToFriendsActivity, new oo00oO(shareToFriendsActivity, 2));
        return Unit.INSTANCE;
    }
}
