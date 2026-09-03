package com.yalla.yalla.ui.activity.message;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeShareFriend;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentToShareFriend;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p405o0Oo0OOO.oOo000o0;
import p508o0o00oo0.a0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nShareToFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity$showShareMoment$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,906:1\n1855#2,2:907\n*S KotlinDebug\n*F\n+ 1 ShareToFriendsActivity.kt\ncom/yalla/yalla/ui/activity/message/ShareToFriendsActivity$showShareMoment$3$1\n*L\n454#1:907,2\n*E\n"})
public final class o0oOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f25530OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25531OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f25532OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f25533OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f25534OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f25535OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f25536OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f25537OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(ShareToFriendsActivity shareToFriendsActivity, MomentAdapterTag momentAdapterTag, long j, MomentDetailModel momentDetailModel, long j2, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, oOo000o0 ooo000o0) {
        super(0);
        this.f25531OooO0Oo = shareToFriendsActivity;
        this.f25533OooO0o0 = momentAdapterTag;
        this.f25532OooO0o = j;
        this.f25534OooO0oO = momentDetailModel;
        this.f25535OooO0oo = j2;
        this.f25530OooO = objectRef;
        this.f25536OooOO0 = objectRef2;
        this.f25537OooOO0O = ooo000o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25531OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        boolean z = false;
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        MomentAdapterTag momentAdapterTag = this.f25533OooO0o0;
        MomentLogSourcePage momentLogSourcePageOooO00o = a0.OooO00o(momentAdapterTag);
        long j = this.f25532OooO0o;
        MomentDetailModel momentDetailModel = this.f25534OooO0oO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = null;
        if (momentLogSourcePageOooO00o != null && !p605o0oo0O0O.o0O0O0Oo.OooO0oo(String.valueOf(momentDetailModel.getUserId()))) {
            MomentLogActionTypeShareFriend momentLogActionTypeShareFriend = new MomentLogActionTypeShareFriend(null, null, null, 7, null);
            momentLogActionTypeShareFriend.setObject_userid(String.valueOf(momentDetailModel.getUserId()));
            momentLogActionTypeShareFriend.setDiscoveryid(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentDetailModel.getId())));
            ArrayList arrayList = new ArrayList();
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = activity.f25284OooOoOO;
            if (o000ooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000ooo2 = null;
            }
            if (o000ooo2.f27084OooOOo) {
                com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = activity.f25284OooOoOO;
                if (o000ooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                    o000ooo3 = null;
                }
                Iterator<T> it = o000ooo3.f27086OooOOoo.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                }
            } else {
                arrayList.add(String.valueOf(j));
            }
            momentLogActionTypeShareFriend.getFriend_list().addAll(arrayList);
            WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
            MomentLogActionType momentLogActionType = MomentLogActionType.share_friend;
            String json = momentLogActionTypeShareFriend.toJson();
            String sessionId = momentDetailModel.getSessionId();
            webEventRepository.getClass();
            WebEventRepository.OooO0o(momentLogSourcePageOooO00o, momentLogActionType, json, sessionId);
        }
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = activity.f25284OooOoOO;
        if (o000ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo4 = null;
        }
        if (o000ooo4.f27084OooOOo) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo5 = activity.f25284OooOoOO;
            if (o000ooo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000ooo1 = o000ooo5;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o000ooo1.f27086OooOOoo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(j));
        }
        List<Long> list = listMutableListOf;
        int value = MomentToShareFriend.Text.getValue();
        int type = momentDetailModel.getType();
        if (type == MomentType.Forward.getValue()) {
            MomentDetailModel forward = momentDetailModel.getForward();
            if (forward != null && forward.getType() == MomentType.Poll.getValue()) {
                z = true;
            }
            if (z) {
                value = MomentToShareFriend.Poll.getValue();
            }
        } else {
            value = type == MomentType.Poll.getValue() ? MomentToShareFriend.Poll.getValue() : momentDetailModel.getType();
        }
        activity.OooOoOO().shareMoment(list, this.f25535OooO0oo, this.f25530OooO.element, this.f25536OooOO0.element, value, this.f25537OooOO0O.f45206OooO0O0.getText().toString()).observe(activity, new ShareToFriendsActivity.OooO0OO(new oo00oO(momentDetailModel, momentAdapterTag, activity)));
        return Unit.INSTANCE;
    }
}
