package com.yalla.yalla.ui.vm.store;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.o00oO0o;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.CloudFileRepo;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o00OOO0O;
import p423o0OoO0OO.o0000oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b?\u0010@J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bJ\u0006\u0010\u0013\u001a\u00020\u0012R+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R;\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010-\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010;\u001a\u0002052\u0006\u0010\u0014\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM;", "Lo0Oo0/OooOO0;", "", "loadThemePrice", "", "getCurrentCustomPrice", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "Landroidx/lifecycle/LiveData;", "Lo00o000O/OooO0o;", "uploadCustomImage", "", "themeImgUrl", "themeType", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/RenewCustomizeTheme;", "purchaseNewTheme", "reNewOldTheme", "", "isNewTheme", "<set-?>", "currentThemeType$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentThemeType", "()I", "setCurrentThemeType", "(I)V", "currentThemeType", "customImagePath$delegate", "getCustomImagePath", "()Ljava/lang/String;", "setCustomImagePath", "(Ljava/lang/String;)V", "customImagePath", "", "Lcom/yalla/yalla/model/CustomPrices;", "dayChooseList$delegate", "getDayChooseList", "()Ljava/util/List;", "setDayChooseList", "(Ljava/util/List;)V", "dayChooseList", "coin$delegate", "getCoin", "setCoin", "coin", "", "reNewThemeId", "J", "getReNewThemeId", "()J", "setReNewThemeId", "(J)V", "Lcom/code/android/uikit/contentstate/ContentState;", "contentState$delegate", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeCustomCreateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomCreateVM.kt\ncom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n81#2:154\n107#2,2:155\n81#2:157\n107#2,2:158\n81#2:160\n107#2,2:161\n81#2:163\n107#2,2:164\n81#2:166\n107#2,2:167\n1855#3,2:169\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomCreateVM.kt\ncom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM\n*L\n32#1:154\n32#1:155,2\n37#1:157\n37#1:158,2\n42#1:160\n42#1:161,2\n47#1:163\n47#1:164,2\n54#1:166\n54#1:167,2\n86#1:169,2\n*E\n"})
public final class RoomThemeCustomCreateVM extends OooOO0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int SEVEN_DAYS = 2;
    public static final int THIRTY_DAYS = 1;

    /* JADX INFO: renamed from: currentThemeType$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentThemeType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);

    /* JADX INFO: renamed from: customImagePath$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState customImagePath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: dayChooseList$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dayChooseList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: coin$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState coin = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AppEventsConstants.EVENT_PARAM_VALUE_NO, null, 2, null);
    private long reNewThemeId = -1;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM$uploadCustomImage$1", f = "RoomThemeCustomCreateVM.kt", i = {0}, l = {103, 105}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<p182o00o000O.OooO0o>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32070OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ File f32071OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(File file, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f32071OooO0oO = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = RoomThemeCustomCreateVM.this.new OooO(this.f32071OooO0oO, continuation);
            oooO.f32070OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<p182o00o000O.OooO0o> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32068OooO0Oo;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = RoomThemeCustomCreateVM.this;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32070OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32070OooO0o0;
            CloudFileRepo cloudFileRepo = roomThemeCustomCreateVM.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.ROOM_CUSTOM_THEME;
            this.f32070OooO0o0 = liveDataScope;
            this.f32068OooO0Oo = 1;
            obj = CloudFileRepo.OooO0o0(cloudFileRepo, cloudFileType, this.f32071OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            roomThemeCustomCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f32070OooO0o0 = null;
            this.f32068OooO0Oo = 2;
            if (liveDataScope.emit((p182o00o000O.OooO0o) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM$loadThemePrice$1", f = "RoomThemeCustomCreateVM.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomThemeCustomCreateVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomCreateVM.kt\ncom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM$loadThemePrice$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1855#2,2:154\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomCreateVM.kt\ncom/yalla/yalla/ui/vm/store/RoomThemeCustomCreateVM$loadThemePrice$1\n*L\n67#1:154,2\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32072OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RoomThemeCustomCreateVM.this.new OooO0O0(continuation);
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
            int i = this.f32072OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OOO0O o00ooo0o2 = o00OOO0O.f46207OooO00o;
                this.f32072OooO0Oo = 1;
                obj = o00ooo0o2.OooO0OO(this);
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
            boolean zIsSuccess = apiResult.isSuccess();
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = RoomThemeCustomCreateVM.this;
            if (zIsSuccess) {
                roomThemeCustomCreateVM.setContentState(ContentState.Content);
                if (roomThemeCustomCreateVM.getCurrentThemeType() == -1 && (list = (List) apiResult.getData()) != null) {
                    for (CustomPrices customPrices : list) {
                        if (customPrices.getThemeType() == 2) {
                            roomThemeCustomCreateVM.setCurrentThemeType(customPrices.getThemeType());
                        }
                    }
                }
                roomThemeCustomCreateVM.setDayChooseList((List) apiResult.getData());
            } else {
                roomThemeCustomCreateVM.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM$purchaseNewTheme$1", f = "RoomThemeCustomCreateVM.kt", i = {0}, l = {116, 118}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32074OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32075OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32076OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32077OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomCreateVM f32078OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, int i, RoomThemeCustomCreateVM roomThemeCustomCreateVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32075OooO0o = str;
            this.f32077OooO0oO = i;
            this.f32078OooO0oo = roomThemeCustomCreateVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f32075OooO0o, this.f32077OooO0oO, this.f32078OooO0oo, continuation);
            oooO0OO.f32076OooO0o0 = obj;
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
            int i = this.f32074OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32076OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32076OooO0o0;
            o00OOO0O o00ooo0o2 = o00OOO0O.f46207OooO00o;
            this.f32076OooO0o0 = liveDataScope;
            this.f32074OooO0Oo = 1;
            obj = o00ooo0o2.OooOO0(this.f32075OooO0o, this.f32077OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32078OooO0oo.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f32076OooO0o0 = null;
            this.f32074OooO0Oo = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM$reNewOldTheme$1", f = "RoomThemeCustomCreateVM.kt", i = {0}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 132}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32079OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32081OooO0o0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = RoomThemeCustomCreateVM.this.new OooO0o(continuation);
            oooO0o.f32081OooO0o0 = obj;
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
            int i = this.f32079OooO0Oo;
            RoomThemeCustomCreateVM roomThemeCustomCreateVM = RoomThemeCustomCreateVM.this;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32081OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32081OooO0o0;
            o0000O00.OooO0OO(o0000oo.OooO00o(RoomThemeCustomCreateVM.INSTANCE), "reNewThemeId: " + roomThemeCustomCreateVM.getReNewThemeId() + "  currentThemeType:" + roomThemeCustomCreateVM.getCurrentThemeType());
            o00OOO0O o00ooo0o2 = o00OOO0O.f46207OooO00o;
            long reNewThemeId = roomThemeCustomCreateVM.getReNewThemeId();
            int currentThemeType = roomThemeCustomCreateVM.getCurrentThemeType();
            this.f32081OooO0o0 = liveDataScope;
            this.f32079OooO0Oo = 1;
            obj = o00ooo0o2.OooOO0O(reNewThemeId, currentThemeType, 1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            roomThemeCustomCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            this.f32081OooO0o0 = null;
            this.f32079OooO0Oo = 2;
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
        return o00oO0o.OooO00o(new OooO0OO(themeImgUrl, themeType, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<RenewCustomizeTheme>> reNewOldTheme() {
        getShowLoadingDialog().setValue(Boolean.TRUE);
        return o00oO0o.OooO00o(new OooO0o(null));
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
    public final LiveData<p182o00o000O.OooO0o> uploadCustomImage(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        getShowLoadingDialog().setValue(Boolean.TRUE);
        return o00oO0o.OooO00o(new OooO(file, null));
    }
}
