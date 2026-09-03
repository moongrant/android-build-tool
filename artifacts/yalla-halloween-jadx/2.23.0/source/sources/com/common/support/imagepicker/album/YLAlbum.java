package com.common.support.imagepicker.album;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.album.entities.AlbumConfig;
import com.common.support.imagepicker.base.ImagePicker;
import com.common.support.imagepicker.dataprovider.YLDataProvider;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.common.support.permission.ActivityExtensionsKt;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020\rH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0016J$\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001fH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020\u001dH\u0016J'\u0010)\u001a\u00020\r2\u001d\u0010*\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0016J'\u0010+\u001a\u00020\r2\u001d\u0010*\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0002J'\u0010,\u001a\u00020\u00022\u001d\u0010-\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0016J'\u0010.\u001a\u00020\u00022\u001d\u0010/\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000eH\u0016J\u0010\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\u001eH\u0016J\u0010\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0010H\u0016J\u0016\u00104\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u000bH\u0016J:\u00107\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\f2\b\u00109\u001a\u0004\u0018\u00010\f2\b\u0010:\u001a\u0004\u0018\u00010\f2\b\u0010;\u001a\u0004\u0018\u00010\f2\b\u0010<\u001a\u0004\u0018\u00010\fH\u0016J!\u0010=\u001a\u00020\u00022\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019\"\u00020\fH\u0016¢\u0006\u0002\u0010?R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010\t\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\b\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u0017\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\b\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001aR.\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/common/support/imagepicker/album/YLAlbum;", "Lcom/common/support/imagepicker/base/ImagePicker;", "Lcom/common/support/imagepicker/album/config/Album;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "mAlbumList", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "mAlwaysDenied", "Lkotlin/Function1;", "", "", "", "Lkotlin/ExtensionFunctionType;", "mConfig", "Lcom/common/support/imagepicker/album/entities/AlbumConfig;", "mDataProvider", "Lcom/common/support/imagepicker/dataprovider/YLDataProvider;", "getMDataProvider", "()Lcom/common/support/imagepicker/dataprovider/YLDataProvider;", "mDataProvider$delegate", "Lkotlin/Lazy;", "mDenied", "mPermissions", "", "[Ljava/lang/String;", "mSelectItemMap", "Ljava/util/LinkedHashMap;", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Lkotlin/collections/LinkedHashMap;", "checkInit", "getAlbumDataByBucketId", "getConfig", "getMultiSelectedCount", "", "id", "getMultiSelectedData", "isMultiModeItemSelected", "", "loadData", "resultCallback", "loadDataPermissionGranted", "onAlwaysDenied", "alwaysDenied", "onDenied", "denied", "putOrRemoveMultiSelectData", "data", "setConfig", "config", "setInitMultiSelectedData", "list", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "setMediaCategoryName", "unknownCategoryName", "allMediaCategoryName", "allImageCategoryName", "allStaticImageCategoryName", "allVideoCategoryName", "setPermission", "permissions", "([Ljava/lang/String;)Lcom/common/support/imagepicker/album/config/Album;", "Companion", "album_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YLAlbum extends ImagePicker implements Album {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FragmentActivity activity;

    @NotNull
    private List<AlbumSource> mAlbumList;

    @Nullable
    private Function1<? super List<String>, Unit> mAlwaysDenied;
    private AlbumConfig mConfig;

    /* JADX INFO: renamed from: mDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataProvider;

    @Nullable
    private Function1<? super List<String>, Unit> mDenied;

    @Nullable
    private String[] mPermissions;

    @Nullable
    private LinkedHashMap<Long, AlbumItemWrapper> mSelectItemMap;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/common/support/imagepicker/album/YLAlbum$Companion;", "", "()V", "create", "Lcom/common/support/imagepicker/album/YLAlbum;", "activity", "Landroidx/fragment/app/FragmentActivity;", "album_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final YLAlbum create(@NotNull FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new YLAlbum(activity, null);
        }
    }

    /* JADX INFO: renamed from: com.common.support.imagepicker.album.YLAlbum$loadDataPermissionGranted$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.imagepicker.album.YLAlbum$loadDataPermissionGranted$1", f = "YLAlbum.kt", i = {}, l = {Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {}, s = {})
    public static final class C08851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<AlbumSource>, Unit> $resultCallback;
        int label;

        /* JADX INFO: renamed from: com.common.support.imagepicker.album.YLAlbum$loadDataPermissionGranted$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.common.support.imagepicker.album.YLAlbum$loadDataPermissionGranted$1$1", f = "YLAlbum.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<AlbumSource> $albumList;
            final /* synthetic */ Function1<List<AlbumSource>, Unit> $resultCallback;
            int label;
            final /* synthetic */ YLAlbum this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01881(YLAlbum yLAlbum, List<AlbumSource> list, Function1<? super List<AlbumSource>, Unit> function1, Continuation<? super C01881> continuation) {
                super(2, continuation);
                this.this$0 = yLAlbum;
                this.$albumList = list;
                this.$resultCallback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C01881(this.this$0, this.$albumList, this.$resultCallback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.mAlbumList.clear();
                this.this$0.mAlbumList.addAll(this.$albumList);
                this.$resultCallback.invoke(this.this$0.mAlbumList);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C01881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08851(Function1<? super List<AlbumSource>, Unit> function1, Continuation<? super C08851> continuation) {
            super(2, continuation);
            this.$resultCallback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return YLAlbum.this.new C08851(this.$resultCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                YLDataProvider mDataProvider = YLAlbum.this.getMDataProvider();
                Context applicationContext = YLAlbum.this.activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
                AlbumConfig albumConfig = YLAlbum.this.mConfig;
                if (albumConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfig");
                    albumConfig = null;
                }
                List<AlbumSource> listQuery = mDataProvider.query(applicationContext, albumConfig.getQueryMode());
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C01881 c01881 = new C01881(YLAlbum.this, listQuery, this.$resultCallback, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c01881, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ YLAlbum(FragmentActivity fragmentActivity, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity);
    }

    private final void checkInit() {
        if (this.mConfig == null) {
            throw new IllegalStateException("Please call setConfig() first!!!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final YLDataProvider getMDataProvider() {
        return (YLDataProvider) this.mDataProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDataPermissionGranted(Function1<? super List<AlbumSource>, Unit> resultCallback) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getIO(), null, new C08851(resultCallback, null), 2, null);
    }

    @Override // com.common.support.imagepicker.album.config.Album
    @NotNull
    public List<AlbumSource> getAlbumDataByBucketId() {
        checkInit();
        return this.mAlbumList;
    }

    @Override // com.common.support.imagepicker.album.config.Album
    @NotNull
    public AlbumConfig getConfig() {
        checkInit();
        AlbumConfig albumConfig = this.mConfig;
        if (albumConfig != null) {
            return albumConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mConfig");
        return null;
    }

    @Override // com.common.support.imagepicker.album.config.Album
    public int getMultiSelectedCount(long id) {
        checkInit();
        LinkedHashMap<Long, AlbumItemWrapper> linkedHashMap = this.mSelectItemMap;
        if (linkedHashMap != null) {
            Iterator<Map.Entry<Long, AlbumItemWrapper>> it = linkedHashMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                if (it.next().getKey().longValue() == id) {
                    return i;
                }
            }
        }
        return 0;
    }

    @Override // com.common.support.imagepicker.album.config.Album
    @NotNull
    public LinkedHashMap<Long, AlbumItemWrapper> getMultiSelectedData() {
        checkInit();
        if (this.mSelectItemMap == null) {
            this.mSelectItemMap = new LinkedHashMap<>();
        }
        LinkedHashMap<Long, AlbumItemWrapper> linkedHashMap = this.mSelectItemMap;
        Intrinsics.checkNotNull(linkedHashMap);
        return linkedHashMap;
    }

    @Override // com.common.support.imagepicker.album.config.Album
    public boolean isMultiModeItemSelected(long id) {
        checkInit();
        LinkedHashMap<Long, AlbumItemWrapper> linkedHashMap = this.mSelectItemMap;
        return linkedHashMap != null && linkedHashMap.containsKey(Long.valueOf(id));
    }

    @Override // com.common.support.imagepicker.album.config.Album
    public void loadData(@NotNull final Function1<? super List<AlbumSource>, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        checkInit();
        String[] strArr = this.mPermissions;
        boolean z = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z = false;
            }
        }
        if (z) {
            loadDataPermissionGranted(resultCallback);
        } else {
            ActivityExtensionsKt.withPermissionsCheck(this.activity, (String[]) Arrays.copyOf(strArr, strArr.length), null, this.mDenied, this.mAlwaysDenied, new Function0<Unit>() { // from class: com.common.support.imagepicker.album.YLAlbum.loadData.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    YLAlbum.this.loadDataPermissionGranted(resultCallback);
                }
            });
        }
    }

    @Override // com.common.support.imagepicker.base.config.Permission
    public /* bridge */ /* synthetic */ Album onAlwaysDenied(Function1 function1) {
        return onAlwaysDenied((Function1<? super List<String>, Unit>) function1);
    }

    @Override // com.common.support.imagepicker.base.config.Permission
    public /* bridge */ /* synthetic */ Album onDenied(Function1 function1) {
        return onDenied((Function1<? super List<String>, Unit>) function1);
    }

    @Override // com.common.support.imagepicker.album.config.Album
    public void putOrRemoveMultiSelectData(@NotNull AlbumItemWrapper data) {
        Intrinsics.checkNotNullParameter(data, "data");
        checkInit();
        LinkedHashMap<Long, AlbumItemWrapper> multiSelectedData = getMultiSelectedData();
        long id = data.getOriginItem().getId();
        if (multiSelectedData.containsKey(Long.valueOf(id))) {
            multiSelectedData.remove(Long.valueOf(id));
        } else {
            multiSelectedData.put(Long.valueOf(id), data);
        }
    }

    @Override // com.common.support.imagepicker.album.config.Album
    @NotNull
    public Album setConfig(@NotNull AlbumConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.mConfig = config;
        return this;
    }

    @Override // com.common.support.imagepicker.album.config.Album
    public void setInitMultiSelectedData(@NotNull List<? extends AlbumItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap<Long, AlbumItemWrapper> multiSelectedData = getMultiSelectedData();
        for (AlbumItem albumItem : list) {
            multiSelectedData.put(Long.valueOf(albumItem.getId()), new AlbumItemWrapper(albumItem, null, 0, 6, null));
        }
    }

    @Override // com.common.support.imagepicker.album.config.Album
    @NotNull
    public Album setMediaCategoryName(@Nullable String unknownCategoryName, @Nullable String allMediaCategoryName, @Nullable String allImageCategoryName, @Nullable String allStaticImageCategoryName, @Nullable String allVideoCategoryName) {
        AlbumQueryMode.INSTANCE.setMediaCategoryName(unknownCategoryName, allMediaCategoryName, allImageCategoryName, allStaticImageCategoryName, allVideoCategoryName);
        return this;
    }

    private YLAlbum(FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
        this.mDataProvider = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<YLDataProvider>() { // from class: com.common.support.imagepicker.album.YLAlbum$mDataProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final YLDataProvider invoke() {
                return new YLDataProvider();
            }
        });
        this.mAlbumList = new ArrayList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.common.support.imagepicker.base.config.Permission
    @NotNull
    public Album onAlwaysDenied(@NotNull Function1<? super List<String>, Unit> alwaysDenied) {
        Intrinsics.checkNotNullParameter(alwaysDenied, "alwaysDenied");
        this.mAlwaysDenied = alwaysDenied;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.common.support.imagepicker.base.config.Permission
    @NotNull
    public Album onDenied(@NotNull Function1<? super List<String>, Unit> denied) {
        Intrinsics.checkNotNullParameter(denied, "denied");
        this.mDenied = denied;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.common.support.imagepicker.base.config.Permission
    @NotNull
    public Album setPermission(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.mPermissions = permissions;
        return this;
    }
}
