package com.yalla.yalla.ui.vm.user;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$loadUserFollowingList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.FollowUserInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p394o0Oo00oO.o0O0O00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007R+\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010(\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/FollowingVM;", "Lo0Oo00oO/o0O0O00;", "", "num", "", "type", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/user/FollowUserInfoModel;", "userFollowingPager", "item", "", "followUser", "", "userId", "", "isFollow", "updateUser", "userInfo", "updateUserInfo", "<set-?>", "currentUserInfo$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentUserInfo", "()Lcom/yalla/yalla/model/user/FollowUserInfoModel;", "setCurrentUserInfo", "(Lcom/yalla/yalla/model/user/FollowUserInfoModel;)V", "currentUserInfo", "dataSort", "Ljava/lang/String;", "Landroidx/compose/runtime/MutableState;", "showUnFollowDialog", "getShowUnFollowDialog", "()Landroidx/compose/runtime/MutableState;", "setShowUnFollowDialog", "(Landroidx/compose/runtime/MutableState;)V", "position$delegate", "getPosition", "()I", "setPosition", "(I)V", "position", "userFollowingPagerSource", "Lo00Oo000/OooO0O0;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFollowingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingVM.kt\ncom/yalla/yalla/ui/vm/user/FollowingVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n81#2:85\n107#2,2:86\n81#2:88\n107#2,2:89\n1#3:91\n*S KotlinDebug\n*F\n+ 1 FollowingVM.kt\ncom/yalla/yalla/ui/vm/user/FollowingVM\n*L\n22#1:85\n22#1:86,2\n27#1:88\n27#1:89,2\n*E\n"})
public final class FollowingVM extends o0O0O00 {
    public static final int $stable = 8;

    @Nullable
    private p143o00Oo000.OooO0O0<FollowUserInfoModel> userFollowingPagerSource;

    /* JADX INFO: renamed from: currentUserInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentUserInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FollowUserInfoModel(), null, 2, null);

    @NotNull
    private String dataSort = "";

    @NotNull
    private MutableState<Boolean> showUnFollowDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: position$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState position = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.FollowingVM$followUser$1", f = "FollowingVM.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32681OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FollowUserInfoModel f32682OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FollowUserInfoModel followUserInfoModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32682OooO0o0 = followUserInfoModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32682OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32681OooO0Oo;
            FollowUserInfoModel followUserInfoModel = this.f32682OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                long userId = followUserInfoModel.getUserId();
                String str = followUserInfoModel.isFollowed().getValue().booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                this.f32681OooO0Oo = 1;
                userInfoRepo.getClass();
                obj = UserInfoRepo.OooO0OO(userId, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((ApiResult) obj).isSuccess()) {
                if (followUserInfoModel.isFollowed().getValue().booleanValue()) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Unfollowed);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else {
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.topic_following);
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                }
                followUserInfoModel.isFollowed().setValue(Boxing.boxBoolean(!followUserInfoModel.isFollowed().getValue().booleanValue()));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.FollowingVM$userFollowingPager$1", f = "FollowingVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFollowingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingVM.kt\ncom/yalla/yalla/ui/vm/user/FollowingVM$userFollowingPager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1549#2:85\n1620#2,3:86\n*S KotlinDebug\n*F\n+ 1 FollowingVM.kt\ncom/yalla/yalla/ui/vm/user/FollowingVM$userFollowingPager$1\n*L\n37#1:85\n37#1:86,3\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<FollowUserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32683OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32685OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32686OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f32687OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32686OooO0oO = i;
            this.f32687OooO0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = FollowingVM.this.new OooO0O0(this.f32686OooO0oO, this.f32687OooO0oo, continuation);
            oooO0O0.f32685OooO0o0 = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<FollowUserInfoModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32683OooO0Oo;
            ArrayList arrayList = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32685OooO0o0;
                FollowingVM followingVM = FollowingVM.this;
                if (i2 == 1) {
                    followingVM.dataSort = "";
                }
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                String str = followingVM.dataSort;
                this.f32683OooO0Oo = 1;
                userInfoRepo.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Messages/FriendMylist");
                Intrinsics.checkNotNullParameter(url, "url");
                o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
                o0o0ooo.OooO0O0(String.valueOf(i2), "pageindex");
                o0o0ooo.OooO0O0(str, "dtsort");
                o0o0ooo.OooO0O0(Boxing.boxInt(this.f32686OooO0oO), "num");
                o0o0ooo.OooO0O0(this.f32687OooO0oo, "type");
                obj = OooOOO.OooO0Oo(new UserInfoRepo$loadUserFollowingList$$inlined$call$1(o0o0ooo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            List<FollowUserInfoModel> list = (List) apiResult.getData();
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (FollowUserInfoModel followUserInfoModel : list) {
                    followUserInfoModel.isFollowed().setValue(Boxing.boxBoolean(followUserInfoModel.getIsFollow()));
                    arrayList.add(followUserInfoModel);
                }
            }
            Collection collection = (Collection) apiResult.getData();
            return apiResult.toPagingLoadResource(arrayList, !(collection == null || collection.isEmpty()));
        }
    }

    private final void setCurrentUserInfo(FollowUserInfoModel followUserInfoModel) {
        this.currentUserInfo.setValue(followUserInfoModel);
    }

    private final void setPosition(int i) {
        this.position.setValue(Integer.valueOf(i));
    }

    public static /* synthetic */ void updateUser$default(FollowingVM followingVM, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        followingVM.updateUser(j, z);
    }

    public final void followUser(@NotNull FollowUserInfoModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO00o(item, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final FollowUserInfoModel getCurrentUserInfo() {
        return (FollowUserInfoModel) this.currentUserInfo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getPosition() {
        return ((Number) this.position.getValue()).intValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowUnFollowDialog() {
        return this.showUnFollowDialog;
    }

    public final void setShowUnFollowDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showUnFollowDialog = mutableState;
    }

    public final void updateUser(long userId, boolean isFollow) {
        List<FollowUserInfoModel> list;
        List<FollowUserInfoModel> list2;
        p143o00Oo000.OooO0O0<FollowUserInfoModel> oooO0O0 = this.userFollowingPagerSource;
        FollowUserInfoModel followUserInfoModel = null;
        Object obj = null;
        followUserInfoModel = null;
        if (oooO0O0 != null && (list2 = oooO0O0.f37663OooO0Oo) != null) {
            for (Object obj2 : list2) {
                if (((FollowUserInfoModel) obj2).getUserId() == userId) {
                    obj = obj2;
                    break;
                }
            }
            followUserInfoModel = (FollowUserInfoModel) obj;
        }
        if (isFollow) {
            if (followUserInfoModel != null) {
                followUserInfoModel.isFollowed().setValue(Boolean.TRUE);
            }
        } else if (followUserInfoModel != null) {
            p143o00Oo000.OooO0O0<FollowUserInfoModel> oooO0O1 = this.userFollowingPagerSource;
            if (oooO0O1 != null && (list = oooO0O1.f37663OooO0Oo) != null) {
                list.remove(followUserInfoModel);
            }
            p143o00Oo000.OooO0O0<FollowUserInfoModel> oooO0O2 = this.userFollowingPagerSource;
            if (oooO0O2 != null) {
                oooO0O2.OooO0O0();
            }
        }
    }

    public final void updateUserInfo(@NotNull FollowUserInfoModel userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        setCurrentUserInfo(userInfo);
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<FollowUserInfoModel> userFollowingPager(int num, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        p143o00Oo000.OooO0O0<FollowUserInfoModel> oooO0O0 = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(num, type, null));
        this.userFollowingPagerSource = oooO0O0;
        Intrinsics.checkNotNull(oooO0O0);
        return oooO0O0;
    }
}
