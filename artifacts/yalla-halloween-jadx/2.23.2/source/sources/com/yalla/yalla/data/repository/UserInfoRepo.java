package com.yalla.yalla.data.repository;

import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.HeUserInfoModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p407o0Oo0Oo.Oooo000;
import p407o0Oo0Oo.o000;
import p407o0Oo0Oo.o0o0000;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000O000;
import p412o0Oo0o0O.o0O00O0o;
import p475o0Ooooo0.o0O00oO0;
import p475o0Ooooo0.oO0O000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUserInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoRepo.kt\ncom/yalla/yalla/data/repository/UserInfoRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n62#2:271\n62#2:294\n62#2:295\n62#2:297\n62#2:298\n62#2:299\n62#2:300\n62#2:301\n62#2:302\n62#2:303\n62#2:304\n62#2:305\n62#2:306\n62#2:307\n62#2:308\n62#2:309\n486#3,4:272\n490#3,2:280\n494#3:286\n25#4:276\n36#4:287\n1097#5,3:277\n1100#5,3:283\n1097#5,6:288\n486#6:282\n1#7:296\n*S KotlinDebug\n*F\n+ 1 UserInfoRepo.kt\ncom/yalla/yalla/data/repository/UserInfoRepo\n*L\n63#1:271\n161#1:294\n167#1:295\n189#1:297\n196#1:298\n201#1:299\n206#1:300\n211#1:301\n218#1:302\n226#1:303\n233#1:304\n242#1:305\n247#1:306\n251#1:307\n260#1:308\n268#1:309\n96#1:272,4\n96#1:280,2\n96#1:286\n96#1:276\n97#1:287\n96#1:277,3\n96#1:283,3\n97#1:288,6\n96#1:282\n*E\n"})
public final class UserInfoRepo extends oO0O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final UserInfoRepo f22735OooO00o = new UserInfoRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {55}, m = "loadNetUserInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22736OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22737OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22736OooO0Oo = obj;
            this.f22737OooO0o |= Integer.MIN_VALUE;
            return UserInfoRepo.this.OooO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {0, 0}, l = {49, 49}, m = "loadUserInfo", n = {"this", "userId"}, s = {"L$0", "J$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public UserInfoRepo f22739OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f22740OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f22741OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f22743OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22740OooO0o = obj;
            this.f22743OooO0oo |= Integer.MIN_VALUE;
            return UserInfoRepo.this.OooO0oO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {0, 0, 1, 1, 1, 1, 2}, l = {67, 81, 87}, m = "userInfoApi", n = {"this", "userId", "this", "apiResult", ReportItem.QualityKeyResult, "userId", ReportItem.QualityKeyResult}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f22745OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ApiResult f22746OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ApiResult f22747OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f22748OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f22749OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f22750OooOO0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22749OooO0oo = obj;
            this.f22750OooOO0 |= Integer.MIN_VALUE;
            return UserInfoRepo.this.OooO0oo(0L, this);
        }
    }

    @Nullable
    public static Object OooO0OO(long j, @NotNull String str, @NotNull Continuation continuation) {
        String strOooO0OO = oo000o.OooO0OO("/Webservers/Messages/UserFollow");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "fuserid");
        o0oooooOooO00o.OooO0O0(str, "type");
        return OooOOO.OooO0Oo(new UserInfoRepo$followUser$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }

    @Nullable
    public static UserInfo OooO0Oo(long j) {
        return o00Oo0.OooO00o().Oooo0().OooO0O0(j);
    }

    @Composable
    @NotNull
    public static MutableState OooO0o0(long j, @Nullable Composer composer) {
        composer.startReplaceableGroup(-1518546814);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1518546814, 48, -1, "com.yalla.yalla.data.repository.UserInfoRepo.getUserInfoAsState (UserInfoRepo.kt:94)");
        }
        Object objOooO00o = OooOo00.OooO00o(composer, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composer.endReplaceableGroup();
        Object objValueOf = Long.valueOf(j);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(objValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == companion.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o0O00O0o(mutableStateMutableStateOf$default, j, null), 3, null);
            composer.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue = mutableStateMutableStateOf$default;
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(long j, @NotNull Continuation<? super UserInfoModel> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22737OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22737OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0oo = oooO00o.f22736OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f22737OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0oo);
            oooO00o.f22737OooO0o = 1;
            objOooO0oo = OooO0oo(j, oooO00o);
            if (objOooO0oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0oo);
        }
        return ((ApiResult) objOooO0oo).getData();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(long j, @NotNull Continuation<? super UserInfo> continuation) {
        OooO0O0 oooO0O0;
        UserInfoRepo userInfoRepo;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f22743OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f22743OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0O0 = oooO0O0.f22740OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f22743OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                j = oooO0O0.f22741OooO0o0;
                userInfoRepo = oooO0O0.f22739OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
            return (UserInfo) objOooO0O0;
        }
        ResultKt.throwOnFailure(objOooO0O0);
        oooO0O0.f22739OooO0Oo = this;
        oooO0O0.f22741OooO0o0 = j;
        oooO0O0.f22743OooO0oo = 1;
        objOooO0O0 = o00Oo0.OooO00o().Oooo0().OooO0O0(j);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        userInfoRepo = this;
        UserInfo userInfo = (UserInfo) objOooO0O0;
        if (userInfo != null) {
            return userInfo;
        }
        oooO0O0.f22739OooO0Oo = null;
        oooO0O0.f22743OooO0oo = 2;
        objOooO0O0 = userInfoRepo.OooO0o(j, oooO0O0);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (UserInfo) objOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object OooO0oo(long j, @NotNull Continuation<? super ApiResult<UserInfoModel>> continuation) {
        OooO0OO oooO0OO;
        UserInfoRepo userInfoRepo;
        ApiResult apiResult;
        long j2;
        ApiResult apiResult2;
        UserInfoRepo userInfoRepo2;
        ApiResult apiResult3;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f22750OooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f22750OooOO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0Oo = oooO0OO.f22749OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f22750OooOO0;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                j = oooO0OO.f22748OooO0oO;
                userInfoRepo = (UserInfoRepo) oooO0OO.f22745OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ApiResult apiResult4 = (ApiResult) oooO0OO.f22745OooO0Oo;
                    ResultKt.throwOnFailure(objOooO0Oo);
                    return apiResult4;
                }
                j = oooO0OO.f22748OooO0oO;
                apiResult3 = oooO0OO.f22746OooO0o;
                apiResult = oooO0OO.f22747OooO0o0;
                userInfoRepo2 = (UserInfoRepo) oooO0OO.f22745OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
            }
            j2 = j;
            apiResult2 = apiResult3;
            userInfoRepo = userInfoRepo2;
            if (!apiResult.isSuccess() || apiResult.getError().getCode() != 1057) {
                return apiResult2;
            }
            Oooo000 oooo000OooOOo0 = o00Oo0.OooO00o().OooOOo0();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            oooo000OooOOo0.OooO0OO(l == null ? 0L : l.longValue(), j2);
            o00Oo0.OooO00o().OooOOoo().OooOOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
            oooO0OO.f22745OooO0Oo = apiResult2;
            oooO0OO.f22747OooO0o0 = null;
            oooO0OO.f22746OooO0o = null;
            oooO0OO.f22750OooOO0 = 3;
            userInfoRepo.getClass();
            o00Oo0.OooO00o().Oooo0().OooO00o(j2);
            return Unit.INSTANCE == coroutine_suspended ? coroutine_suspended : apiResult2;
        }
        ResultKt.throwOnFailure(objOooO0Oo);
        oooO0OO.f22745OooO0Oo = this;
        oooO0OO.f22748OooO0oO = j;
        oooO0OO.f22750OooOO0 = 1;
        String strOooO0OO = oo000o.OooO0OO("/Webservers/User/HeInformation");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "touserid");
        o0oooooOooO00o.OooO00o();
        objOooO0Oo = OooOOO.OooO0Oo(new UserInfoRepo$heInformation$$inlined$call$1(o0oooooOooO00o, null), oooO0OO);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        userInfoRepo = this;
        ApiResult apiResult5 = (ApiResult) objOooO0Oo;
        ApiResult apiResult6 = new ApiResult();
        apiResult6.setCode(apiResult5.getCode());
        apiResult6.setMessage(apiResult5.getMessage());
        if (apiResult5.isSuccess()) {
            HeUserInfoModel heUserInfoModel = (HeUserInfoModel) apiResult5.getData();
            List<UserInfoModel> data = heUserInfoModel != null ? heUserInfoModel.getData() : null;
            if (data != null && !data.isEmpty()) {
                z = false;
            }
            if (!z) {
                Object data2 = apiResult5.getData();
                Intrinsics.checkNotNull(data2);
                List<UserInfoModel> data3 = ((HeUserInfoModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                UserInfoModel userInfoModel = data3.get(0);
                apiResult6.setData(userInfoModel);
                o0o0000 o0o0000VarOooo0 = o00Oo0.OooO00o().Oooo0();
                userInfoModel.setWealthLevel(userInfoModel.getWealthLevel());
                userInfoModel.setWealthBadgeWithBg(userInfoModel.getWealthBadgeWithBg());
                o0o0000VarOooo0.OooO0OO(userInfoModel);
                oooO0OO.f22745OooO0Oo = userInfoRepo;
                oooO0OO.f22747OooO0o0 = apiResult5;
                oooO0OO.f22746OooO0o = apiResult6;
                oooO0OO.f22748OooO0oO = j;
                oooO0OO.f22750OooOO0 = 2;
                userInfoRepo.getClass();
                if (userInfoModel.getIsFriend()) {
                    Friend friend = new Friend();
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    friend.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                    friend.setFriendId(userInfoModel.getUserId());
                    friend.setMemoName(userInfoModel.getMemoName());
                    friend.setInRoom(userInfoModel.getInRoomId() > 0);
                    if (userInfoModel.getFriendTime() > 0) {
                        friend.setTime(userInfoModel.getFriendTime());
                    }
                    o000O000.OooO0o(friend);
                } else {
                    long userId = userInfoModel.getUserId();
                    o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
                    o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                    o000VarOooOOoo.OooOOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), userId);
                }
                if (Unit.INSTANCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiResult = apiResult5;
                userInfoRepo2 = userInfoRepo;
                apiResult3 = apiResult6;
                j2 = j;
                apiResult2 = apiResult3;
                userInfoRepo = userInfoRepo2;
            }
            if (!apiResult.isSuccess()) {
                return apiResult2;
            }
            return apiResult2;
        }
        apiResult = apiResult5;
        j2 = j;
        apiResult2 = apiResult6;
        if (!apiResult.isSuccess()) {
            return apiResult2;
        }
        return apiResult2;
    }
}
