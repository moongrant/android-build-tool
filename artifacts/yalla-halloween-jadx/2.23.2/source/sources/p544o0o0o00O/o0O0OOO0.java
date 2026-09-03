package p544o0o0o00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFriendListSynchronizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListSynchronizer.kt\ncom/yalla/yalla/service/im/FriendListSynchronizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1855#2,2:83\n*S KotlinDebug\n*F\n+ 1 FriendListSynchronizer.kt\ncom/yalla/yalla/service/im/FriendListSynchronizer\n*L\n56#1:83,2\n*E\n"})
public final class o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0OOO0 f55744OooO00o = new o0O0OOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static long f55745OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Job f55746OooO0OO;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o0O0OOO0 o0o0ooo0, Continuation continuation) {
        o0O0O0o0 o0o0o0o0;
        o0o0ooo0.getClass();
        if (continuation instanceof o0O0O0o0) {
            o0o0o0o0 = (o0O0O0o0) continuation;
            int i = o0o0o0o0.f55740OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0o0o0o0.f55740OooO0o = i - Integer.MIN_VALUE;
            } else {
                o0o0o0o0 = new o0O0O0o0(o0o0ooo0, continuation);
            }
        } else {
            o0o0o0o0 = new o0O0O0o0(o0o0ooo0, continuation);
        }
        Object objOooO0o0 = o0o0o0o0.f55739OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0o0o0o0.f55740OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0o0);
            o000O000 o000o001 = o000O000.f45978OooO00o;
            long j = f55745OooO0O0;
            o0o0o0o0.f55740OooO0o = 1;
            objOooO0o0 = o000o001.OooO0o0(j, o0o0o0o0);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0o0);
        }
        ApiResult apiResult = (ApiResult) objOooO0o0;
        if (apiResult.isSuccess()) {
            Collection collection = (Collection) apiResult.getData();
            if (!(collection == null || collection.isEmpty())) {
                List<? extends UserInfo> userInfoList = (List) apiResult.getData();
                if (userInfoList == null) {
                    return Boxing.boxBoolean(false);
                }
                UserInfoRepo.f22735OooO00o.getClass();
                Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
                o00Oo0.OooO00o().Oooo0().OooO0Oo(userInfoList);
                ArrayList friendList = new ArrayList();
                Iterator<T> it = userInfoList.iterator();
                while (it.hasNext()) {
                    UserInfoModel userInfoModel = (UserInfoModel) it.next();
                    Friend friend = new Friend();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    friend.setUid(((Number) OooO00o.OooO00o()).longValue());
                    friend.setFriendId(userInfoModel.getUserId());
                    friend.setMemoName(userInfoModel.getMemoName());
                    friend.setTime(userInfoModel.getFriendTime());
                    Friend friendOooO0OO = o00Oo0.OooO00o().OooOOoo().OooO0OO(((Number) OooO00o.OooO00o()).longValue(), userInfoModel.getUserId());
                    if (friendOooO0OO != null) {
                        friend.setInRoom(friendOooO0OO.getInRoom());
                        friend.setCheckUserRisk(friendOooO0OO.getIsCheckUserRisk());
                        if (userInfoModel.getFriendTime() == 0) {
                            friend.setTime(friendOooO0OO.getTime());
                        }
                    }
                    friendList.add(friend);
                }
                Intrinsics.checkNotNullParameter(friendList, "friendList");
                o00Oo0.OooO00o().OooOOoo().OooOO0O(friendList);
                long friendTime = ((UserInfoModel) userInfoList.get(userInfoList.size() - 1)).getFriendTime();
                if (friendTime != 0 && f55745OooO0O0 == friendTime) {
                    return Boxing.boxBoolean(false);
                }
                f55745OooO0O0 = friendTime;
                return Boxing.boxBoolean(true);
            }
        }
        return Boxing.boxBoolean(false);
    }
}
