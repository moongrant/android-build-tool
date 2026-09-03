package p412o0Oo0o0O;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p384o0OOoo0O.OooOOO;
import p407o0Oo0Oo.o000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OO00O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFriendRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRepo.kt\ncom/yalla/yalla/data/repository/FriendRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,124:1\n18#2,7:125\n25#2,10:133\n18#2,7:143\n25#2,10:151\n18#2,7:161\n25#2,10:169\n109#3:132\n109#3:150\n109#3:168\n47#4:179\n49#4:183\n50#5:180\n55#5:182\n106#6:181\n*S KotlinDebug\n*F\n+ 1 FriendRepo.kt\ncom/yalla/yalla/data/repository/FriendRepo\n*L\n20#1:125,7\n20#1:133,10\n25#1:143,7\n25#1:151,10\n34#1:161,7\n34#1:169,10\n20#1:132\n25#1:150\n34#1:168\n90#1:179\n90#1:183\n90#1:180\n90#1:182\n90#1:181\n*E\n"})
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O000 f45978OooO00o = new o000O000();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.FriendRepo", f = "FriendRepo.kt", i = {}, l = {34}, m = "checkIsFriendByNet", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f45979OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f45980OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45979OooO0Oo = obj;
            this.f45980OooO0o |= Integer.MIN_VALUE;
            return o000O000.this.OooO00o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.FriendRepo", f = "FriendRepo.kt", i = {}, l = {25}, m = "loadFriendInRoomList", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f45982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f45983OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45982OooO0Oo = obj;
            this.f45983OooO0o |= Integer.MIN_VALUE;
            return o000O000.this.OooO0Oo(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.FriendRepo", f = "FriendRepo.kt", i = {}, l = {21}, m = "loadFriendListByApi", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f45985OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f45986OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45985OooO0Oo = obj;
            this.f45986OooO0o |= Integer.MIN_VALUE;
            return o000O000.this.OooO0o0(0L, this);
        }
    }

    @NotNull
    public static String OooO0O0(long j, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = true;
        if ((Long.valueOf(j) == null) || j == 0) {
            return defaultValue;
        }
        o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strOooO00o = o000VarOooOOoo.OooO00o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
        if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
            z = false;
        }
        return z ? defaultValue : strOooO00o;
    }

    public static void OooO0OO(long j, @NotNull TextView tagView, @NotNull String defaultValue, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(o0OO00O.tag_friend_memo_name_tag, Long.valueOf(j));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(j, tagView, defaultValue, null, block), 2, null);
    }

    public static void OooO0o(@NotNull Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Friend friendOooO0OO = o000VarOooOOoo.OooO0OO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), friend.getFriendId());
        if (friendOooO0OO != null) {
            friend.setCheckUserRisk(friendOooO0OO.getIsCheckUserRisk());
            if (friend.getTime() == 0) {
                friend.setTime(friendOooO0OO.getTime());
            }
        }
        o00Oo0.OooO00o().OooOOoo().OooOO0o(friend);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(long j, @NotNull Continuation<? super ApiResult<Integer>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f45980OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f45980OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objCheckIsFriend = oooO00o.f45979OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f45980OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckIsFriend);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooO00o.f45980OooO0o = 1;
                objCheckIsFriend = mainApiServiceOooO00o.checkIsFriend(j, oooO00o);
                if (objCheckIsFriend == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckIsFriend);
            }
            return objCheckIsFriend;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull Continuation<? super ApiResult<FriendInRoomModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f45983OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f45983OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objUserCompanionsInRoomList = oooO0O0.f45982OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f45983OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserCompanionsInRoomList);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooO0O0.f45983OooO0o = 1;
                objUserCompanionsInRoomList = mainApiServiceOooO00o.userCompanionsInRoomList(oooO0O0);
                if (objUserCompanionsInRoomList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserCompanionsInRoomList);
            }
            return objUserCompanionsInRoomList;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o0(long j, @NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f45986OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f45986OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objUserCompanionsList = oooO0OO2.f45985OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f45986OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserCompanionsList);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooO0OO2.f45986OooO0o = 1;
                objUserCompanionsList = mainApiServiceOooO00o.userCompanionsList(1, 100, j, oooO0OO2);
                if (objUserCompanionsList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserCompanionsList);
            }
            return objUserCompanionsList;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
