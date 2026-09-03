package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.FriendChatModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function1<ApiResult<FriendChatModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25823OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25823OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<FriendChatModel> apiResult) {
        ApiResult<FriendChatModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        PrivateChatActivity privateChatActivity = this.f25823OooO0Oo;
        if (zIsSuccess) {
            FriendChatModel data = apiResult2.getData();
            if (data != null) {
                int i = PrivateChatActivity.f25694Oooo000;
                UserInfo value = privateChatActivity.OooOo().getChatUserInfo().getValue();
                if (value != null) {
                    data.setLocalUserId(value.getUserId());
                    data.setLocalUserName(value.getUserName());
                }
                ((YallaChatVM) privateChatActivity.f25701OooOo0O.getValue()).toYallaChat(data);
            }
        } else {
            int code = apiResult2.getCode();
            if (code == 2077) {
                FriendChatModel friendChatModel = new FriendChatModel();
                friendChatModel.setLocalBindChatFriendChatType(2);
                int i2 = PrivateChatActivity.f25694Oooo000;
                UserInfo value2 = privateChatActivity.OooOo().getChatUserInfo().getValue();
                if (value2 != null) {
                    friendChatModel.setLocalUserId(value2.getUserId());
                    friendChatModel.setLocalUserName(value2.getUserName());
                }
                Lazy lazy = privateChatActivity.f25701OooOo0O;
                ((YallaChatVM) lazy.getValue()).setFriendChatModel(friendChatModel);
                ((YallaChatVM) lazy.getValue()).yallaChatLogin();
            } else if (code == 2078) {
                FriendChatModel friendChatModel2 = new FriendChatModel();
                friendChatModel2.setLocalBindChatFriendChatType(1);
                int i3 = PrivateChatActivity.f25694Oooo000;
                UserInfo value3 = privateChatActivity.OooOo().getChatUserInfo().getValue();
                if (value3 != null) {
                    friendChatModel2.setLocalUserId(value3.getUserId());
                    friendChatModel2.setLocalUserName(value3.getUserName());
                }
                Lazy lazy2 = privateChatActivity.f25701OooOo0O;
                ((YallaChatVM) lazy2.getValue()).setFriendChatModel(friendChatModel2);
                ((YallaChatVM) lazy2.getValue()).getYallaChatDialogBindShow().setValue(Boolean.TRUE);
            } else if (code != 2080) {
                ApiError error = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p375o0OOoOO.o00000O0(error, null), 3, null);
            } else {
                ((YallaChatVM) privateChatActivity.f25701OooOo0O.getValue()).getYallaChatDialogFriendNoBindShow().setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
