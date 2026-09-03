package p527o0o0OO0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f43127OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static long f43128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Job f43129OooO0OO;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(OooOo00 oooOo00, Continuation continuation) {
        OooOOO oooOOO;
        Objects.requireNonNull(oooOo00);
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f43116Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f43116Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(oooOo00, continuation);
            }
        } else {
            oooOOO = new OooOOO(oooOo00, continuation);
        }
        Object objOooO0o0 = oooOOO.f43114Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f43116Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0o0);
            o00O0O o00o0o2 = o00O0O.f42677OooO00o;
            long j = f43128OooO0O0;
            oooOOO.f43116Oooo0oo = 1;
            objOooO0o0 = o00o0o2.OooO0o0(j, oooOOO);
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
                Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
                OooO0OO.OooO00o().Oooo0O0().OooO0Oo(userInfoList);
                ArrayList friendList = new ArrayList();
                Iterator<T> it = userInfoList.iterator();
                while (it.hasNext()) {
                    UserInfoModel userInfoModel = (UserInfoModel) it.next();
                    Friend friend = new Friend();
                    OooOOO oooOOO2 = OooOOO.f41216OooO00o;
                    friend.setUid(((Number) OooO00o.OooO00o(oooOOO2)).longValue());
                    friend.setFriendId(userInfoModel.getUserId());
                    friend.setMemoName(userInfoModel.getMemoName());
                    friend.setTime(userInfoModel.getFriendTime());
                    Friend friendOooO0Oo = OooO0OO.OooO00o().OooOo00().OooO0Oo(((Number) OooO00o.OooO00o(oooOOO2)).longValue(), userInfoModel.getUserId());
                    if (friendOooO0Oo != null) {
                        friend.setInRoom(friendOooO0Oo.getInRoom());
                        friend.setCheckUserRisk(friendOooO0Oo.getIsCheckUserRisk());
                        if (userInfoModel.getFriendTime() == 0) {
                            friend.setTime(friendOooO0Oo.getTime());
                        }
                    }
                    friendList.add(friend);
                }
                Intrinsics.checkNotNullParameter(friendList, "friendList");
                OooO0OO.OooO00o().OooOo00().OooO(friendList);
                long friendTime = ((UserInfoModel) userInfoList.get(userInfoList.size() - 1)).getFriendTime();
                if (friendTime != 0 && f43128OooO0O0 == friendTime) {
                    return Boxing.boxBoolean(false);
                }
                f43128OooO0O0 = friendTime;
                return Boxing.boxBoolean(true);
            }
        }
        return Boxing.boxBoolean(false);
    }
}
