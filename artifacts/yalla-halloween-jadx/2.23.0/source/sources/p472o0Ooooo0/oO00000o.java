package p472o0Ooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
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
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFriendListSynchronizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListSynchronizer.kt\ncom/yalla/yalla/service/im/FriendListSynchronizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1855#2,2:83\n*S KotlinDebug\n*F\n+ 1 FriendListSynchronizer.kt\ncom/yalla/yalla/service/im/FriendListSynchronizer\n*L\n56#1:83,2\n*E\n"})
public final class oO00000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO00000o f47194OooO00o = new oO00000o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static long f47195OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Job f47196OooO0OO;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(oO00000o oo00000o, Continuation continuation) {
        o oVar;
        oo00000o.getClass();
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i = oVar.f47190OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.f47190OooO0o = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(oo00000o, continuation);
            }
        } else {
            oVar = new o(oo00000o, continuation);
        }
        Object objOooO0o0 = oVar.f47189OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oVar.f47190OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0o0);
            oOO0O0O ooo0o0o = oOO0O0O.f44944OooO00o;
            long j = f47195OooO0O0;
            oVar.f47190OooO0o = 1;
            objOooO0o0 = ooo0o0o.OooO0o0(j, oVar);
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
                UserInfoRepo.f23204OooO00o.getClass();
                Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
                o000OOo.OooO00o().Oooo00o().OooO0Oo(userInfoList);
                ArrayList friendList = new ArrayList();
                Iterator<T> it = userInfoList.iterator();
                while (it.hasNext()) {
                    UserInfoModel userInfoModel = (UserInfoModel) it.next();
                    Friend friend = new Friend();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    friend.setUid(((Number) OooO0OO.OooO0O0()).longValue());
                    friend.setFriendId(userInfoModel.getUserId());
                    friend.setMemoName(userInfoModel.getMemoName());
                    friend.setTime(userInfoModel.getFriendTime());
                    Friend friendOooO0OO = o000OOo.OooO00o().OooOOo().OooO0OO(((Number) OooO0OO.OooO0O0()).longValue(), userInfoModel.getUserId());
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
                o000OOo.OooO00o().OooOOo().OooOO0O(friendList);
                long friendTime = ((UserInfoModel) userInfoList.get(userInfoList.size() - 1)).getFriendTime();
                if (friendTime != 0 && f47195OooO0O0 == friendTime) {
                    return Boxing.boxBoolean(false);
                }
                f47195OooO0O0 = friendTime;
                return Boxing.boxBoolean(true);
            }
        }
        return Boxing.boxBoolean(false);
    }
}
