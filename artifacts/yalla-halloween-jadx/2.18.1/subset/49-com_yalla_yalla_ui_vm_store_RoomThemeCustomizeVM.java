package com.yalla.yalla.ui.vm.store;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.RenewCustomizeTheme;
import come.code.android.easyrefreshcontentstatus.ContentState;
import io.agora.rtc.Constants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o0000O0O;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o00oOoo;
import p617o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b?\u0010@J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bJ\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR+\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R;\u00103\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00107\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R+\u0010>\u001a\u0002082\u0006\u0010\u001e\u001a\u0002088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010 \u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006C"}, d2 = {"Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomizeVM;", "Lo00OO/OooO00o;", "", "loadThemePrice", "", "getCurrentCustomPrice", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadCustomImage", "", "themeImgUrl", "themeType", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/RenewCustomizeTheme;", "purchaseNewTheme", "reNewOldTheme", "", "isNewTheme", "", "reNewThemeId", "J", "getReNewThemeId", "()J", "setReNewThemeId", "(J)V", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<set-?>", "currentThemeType$delegate", "Lo000oOoO/o0O00OO;", "getCurrentThemeType", "()I", "setCurrentThemeType", "(I)V", "currentThemeType", "customImagePath$delegate", "getCustomImagePath", "()Ljava/lang/String;", "setCustomImagePath", "(Ljava/lang/String;)V", "customImagePath", "", "Lcom/yalla/yalla/model/CustomPrices;", "dayChooseList$delegate", "getDayChooseList", "()Ljava/util/List;", "setDayChooseList", "(Ljava/util/List;)V", "dayChooseList", "coin$delegate", "getCoin", "setCoin", "coin", "Lcome/code/android/easyrefreshcontentstatus/ContentState;", "contentState$delegate", "getContentState", "()Lcome/code/android/easyrefreshcontentstatus/ContentState;", "setContentState", "(Lcome/code/android/easyrefreshcontentstatus/ContentState;)V", "contentState", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeCustomizeVM extends OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int SEVEN_DAYS = 2;
    public static final int THIRTY_DAYS = 1;

    /* JADX INFO: renamed from: currentThemeType$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentThemeType = o0OOO00.OooO0Oo(-1);

    /* JADX INFO: renamed from: customImagePath$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO customImagePath = o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: dayChooseList$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO dayChooseList = o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: coin$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO coin = o0OOO00.OooO0Oo(AppEventsConstants.EVENT_PARAM_VALUE_NO);
    private long reNewThemeId = -1;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO contentState = o0OOO00.OooO0Oo(ContentState.Loading);

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM$uploadCustomImage$1", f = "RoomThemeCustomizeVM.kt", i = {0}, l = {103, 105}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ File f26132Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26133Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26134Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(File file, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f26132Oooo = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = RoomThemeCustomizeVM.this.new OooO(this.f26132Oooo, continuation);
            oooO.f26134Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<CloudFileInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26133Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26134Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f26134Oooo0oO;
            CloudFileRepo cloudFileRepo = RoomThemeCustomizeVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.ROOM_CUSTOM_THEME;
            File file = this.f26132Oooo;
            this.f26134Oooo0oO = liveDataScope;
            this.f26133Oooo0o = 1;
            obj = CloudFileRepo.OooO0oO(cloudFileRepo, cloudFileType, file, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RoomThemeCustomizeVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f26134Oooo0oO = null;
            this.f26133Oooo0o = 2;
            if (liveDataScope.emit((CloudFileInfo) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final String OooO00o(int i) {
            return i == 2 ? "7" : "30";
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM$loadThemePrice$1", f = "RoomThemeCustomizeVM.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26136Oooo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RoomThemeCustomizeVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<CustomPrices> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26136Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00oOoo o00oooo2 = o00oOoo.f42762OooO00o;
                this.f26136Oooo0o = 1;
                obj = o00oooo2.OooO0o0(this);
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
            if (apiResult.isSuccess()) {
                RoomThemeCustomizeVM.this.setContentState(ContentState.Content);
                if (RoomThemeCustomizeVM.this.getCurrentThemeType() == -1 && (list = (List) apiResult.getData()) != null) {
                    RoomThemeCustomizeVM roomThemeCustomizeVM = RoomThemeCustomizeVM.this;
                    for (CustomPrices customPrices : list) {
                        if (customPrices.getThemeType() == 2) {
                            roomThemeCustomizeVM.setCurrentThemeType(customPrices.getThemeType());
                        }
                    }
                }
                RoomThemeCustomizeVM.this.setDayChooseList((List) apiResult.getData());
            } else {
                RoomThemeCustomizeVM.this.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM$purchaseNewTheme$1", f = "RoomThemeCustomizeVM.kt", i = {0}, l = {116, 118}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f26138Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26139Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26140Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26141Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f26142OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, int i, RoomThemeCustomizeVM roomThemeCustomizeVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26141Oooo0oo = str;
            this.f26138Oooo = i;
            this.f26142OoooO00 = roomThemeCustomizeVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f26141Oooo0oo, this.f26138Oooo, this.f26142OoooO00, continuation);
            oooO0OO.f26140Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RenewCustomizeTheme>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26139Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26140Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f26140Oooo0oO;
            o00oOoo o00oooo2 = o00oOoo.f42762OooO00o;
            String str = this.f26141Oooo0oo;
            int i2 = this.f26138Oooo;
            this.f26140Oooo0oO = liveDataScope;
            this.f26139Oooo0o = 1;
            obj = o00oooo2.OooOO0o(str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26142OoooO00.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f26140Oooo0oO = null;
            this.f26139Oooo0o = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM$reNewOldTheme$1", f = "RoomThemeCustomizeVM.kt", i = {0}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 132}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26143Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26144Oooo0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = RoomThemeCustomizeVM.this.new OooO0o(continuation);
            oooO0o.f26144Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RenewCustomizeTheme>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26143Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26144Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f26144Oooo0oO;
            String strOooO00o = Oooo0.OooO00o(RoomThemeCustomizeVM.INSTANCE);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("reNewThemeId: ");
            sbOooO0o0.append(RoomThemeCustomizeVM.this.getReNewThemeId());
            sbOooO0o0.append("  currentThemeType:");
            sbOooO0o0.append(RoomThemeCustomizeVM.this.getCurrentThemeType());
            o00O00.OooO0OO(strOooO00o, sbOooO0o0.toString());
            o00oOoo o00oooo2 = o00oOoo.f42762OooO00o;
            long reNewThemeId = RoomThemeCustomizeVM.this.getReNewThemeId();
            int currentThemeType = RoomThemeCustomizeVM.this.getCurrentThemeType();
            this.f26144Oooo0oO = liveDataScope;
            this.f26143Oooo0o = 1;
            obj = o00oooo2.OooOOO0(reNewThemeId, currentThemeType, 1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RoomThemeCustomizeVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f26144Oooo0oO = null;
            this.f26143Oooo0o = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getCoin() {
        return (String) this.coin.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    public final int getCurrentCustomPrice() {
        List<CustomPrices> dayChooseList = getDayChooseList();
        if (dayChooseList == null) {
            return 0;
        }
        for (CustomPrices customPrices : dayChooseList) {
            if (customPrices.getThemeType() == getCurrentThemeType()) {
                return customPrices.getDiscountPrice();
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentThemeType() {
        return ((Number) this.currentThemeType.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String getCustomImagePath() {
        return (String) this.customImagePath.getValue();
    }

    @Nullable
    public final List<CustomPrices> getDayChooseList() {
        return (List) this.dayChooseList.getValue();
    }

    public final long getReNewThemeId() {
        return this.reNewThemeId;
    }

    public final boolean isNewTheme() {
        return this.reNewThemeId == -1;
    }

    public final void loadThemePrice() {
        setContentState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    @NotNull
    public final LiveData<ApiResult<RenewCustomizeTheme>> purchaseNewTheme(@NotNull String themeImgUrl, int themeType) {
        Intrinsics.checkNotNullParameter(themeImgUrl, "themeImgUrl");
        getShowLoadingDialog().setValue(Boolean.TRUE);
        return o0000O0O.OooO00o(new OooO0OO(themeImgUrl, themeType, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<RenewCustomizeTheme>> reNewOldTheme() {
        getShowLoadingDialog().setValue(Boolean.TRUE);
        return o0000O0O.OooO00o(new OooO0o(null));
    }

    public final void setCoin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coin.setValue(str);
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }

    public final void setCurrentThemeType(int i) {
        this.currentThemeType.setValue(Integer.valueOf(i));
    }

    public final void setCustomImagePath(@Nullable String str) {
        this.customImagePath.setValue(str);
    }

    public final void setDayChooseList(@Nullable List<CustomPrices> list) {
        this.dayChooseList.setValue(list);
    }

    public final void setReNewThemeId(long j) {
        this.reNewThemeId = j;
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadCustomImage(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        getShowLoadingDialog().setValue(Boolean.TRUE);
        return o0000O0O.OooO00o(new OooO(file, null));
    }
}
