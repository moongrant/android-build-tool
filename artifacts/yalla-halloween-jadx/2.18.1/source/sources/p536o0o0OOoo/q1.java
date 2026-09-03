package p536o0o0OOoo;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeShareFriend;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentToShareFriend;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p168o00Ooo0.o0O0O00;
import p498o0o00Oo0.o00O0OO;
import p501o0o00o.o0000O;
import p563o0oOo0.o00O0000;
import p569o0oOo0OO.o000O00O;
import p649o0ooOOoo.vb;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f43845Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43846Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f43847Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f43848Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ vb f43849OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f43850OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f43851OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f43852OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(ShareToFriendsActivity shareToFriendsActivity, MomentAdapterTag momentAdapterTag, long j, MomentDetailModel momentDetailModel, long j2, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, vb vbVar) {
        super(0);
        this.f43846Oooo0o = shareToFriendsActivity;
        this.f43847Oooo0oO = momentAdapterTag;
        this.f43848Oooo0oo = j;
        this.f43845Oooo = momentDetailModel;
        this.f43851OoooO00 = j2;
        this.f43850OoooO0 = objectRef;
        this.f43852OoooO0O = objectRef2;
        this.f43849OoooO = vbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        int value;
        int i;
        ShareToFriendsActivity activity = this.f43846Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View viewFindViewById = activity.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
        boolean z = false;
        ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        MomentLogSourcePage sourcePage = o000O00O.OooO00o(this.f43847Oooo0oO);
        o00O0000 o00o0001 = null;
        if (sourcePage != null) {
            MomentDetailModel momentDetailModel = this.f43845Oooo;
            ShareToFriendsActivity shareToFriendsActivity = this.f43846Oooo0o;
            long j = this.f43848Oooo0oo;
            if (!o0O0O00.OooO(String.valueOf(momentDetailModel.getUserId()))) {
                MomentLogActionTypeShareFriend momentLogActionTypeShareFriend = new MomentLogActionTypeShareFriend(null, null, null, 7, null);
                momentLogActionTypeShareFriend.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
                momentLogActionTypeShareFriend.setDiscoveryid(OooO.OooO(Long.valueOf(momentDetailModel.getId()), ""));
                ArrayList arrayList = new ArrayList();
                o00O0000 o00o0002 = shareToFriendsActivity.f22218OoooooO;
                if (o00o0002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    o00o0002 = null;
                }
                if (o00o0002.f45071OooOOo0) {
                    o00O0000 o00o0003 = shareToFriendsActivity.f22218OoooooO;
                    if (o00o0003 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                        o00o0003 = null;
                    }
                    Iterator<T> it = o00o0003.f45070OooOOo.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                    }
                } else {
                    arrayList.add(String.valueOf(j));
                }
                momentLogActionTypeShareFriend.getFriend_list().addAll(arrayList);
                MomentLogActionType actionType = MomentLogActionType.share_friend;
                String actionInfo = momentLogActionTypeShareFriend.toJson();
                String sessionId = momentDetailModel.getSessionId();
                Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
                Intrinsics.checkNotNullParameter(actionType, "actionType");
                Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0OO(sourcePage, actionType, actionInfo, sessionId, null), 3, null);
            }
        }
        o00O0000 o00o0004 = this.f43846Oooo0o.f22218OoooooO;
        if (o00o0004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0004 = null;
        }
        if (o00o0004.f45071OooOOo0) {
            o00O0000 o00o0005 = this.f43846Oooo0o.f22218OoooooO;
            if (o00o0005 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o00o0001 = o00o0005;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o00o0001.f45070OooOOo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f43848Oooo0oo));
        }
        List<Long> list = listMutableListOf;
        MomentToShareFriend momentToShareFriend = MomentToShareFriend.Text;
        int value2 = momentToShareFriend.getValue();
        int type = this.f43845Oooo.getType();
        if (type == MomentType.Forward.getValue()) {
            MomentDetailModel forward = this.f43845Oooo.getForward();
            if (forward != null && forward.getType() == MomentType.Poll.getValue()) {
                z = true;
            }
            if (z) {
                value = MomentToShareFriend.Poll.getValue();
            } else {
                i = value2;
            }
            LiveData<Boolean> liveDataShareMoment = ShareToFriendsActivity.OooOoo(this.f43846Oooo0o).shareMoment(list, this.f43851OoooO00, this.f43850OoooO0.element, this.f43852OoooO0O.element, i, this.f43849OoooO.f50803OooO0O0.getText().toString());
            ShareToFriendsActivity shareToFriendsActivity2 = this.f43846Oooo0o;
            liveDataShareMoment.observe(shareToFriendsActivity2, new o0000O(shareToFriendsActivity2, 3));
            return Unit.INSTANCE;
        }
        value = type == MomentType.Poll.getValue() ? MomentToShareFriend.Poll.getValue() : momentToShareFriend.getValue();
        i = value;
        LiveData<Boolean> liveDataShareMoment2 = ShareToFriendsActivity.OooOoo(this.f43846Oooo0o).shareMoment(list, this.f43851OoooO00, this.f43850OoooO0.element, this.f43852OoooO0O.element, i, this.f43849OoooO.f50803OooO0O0.getText().toString());
        ShareToFriendsActivity shareToFriendsActivity3 = this.f43846Oooo0o;
        liveDataShareMoment2.observe(shareToFriendsActivity3, new o0000O(shareToFriendsActivity3, 3));
        return Unit.INSTANCE;
    }
}
