package com.common.support.imagepicker.mediaedit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.common.support.imagepicker.base.ImagePicker;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.dataprovider.YLDataProvider;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.common.support.imagepicker.mediaedit.entities.MediaEditConfig;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor;
import com.common.support.imagepicker.mediaedit.widget.MediaEditLayout;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.config.Preview;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J7\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u001f\u0010 \u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010!¢\u0006\u0002\b#H\u0016J\u001e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0(H\u0002J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u0011H\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u000201H\u0016J\u001d\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0096@ø\u0001\u0000¢\u0006\u0002\u00106J'\u00102\u001a\b\u0012\u0004\u0012\u000203072\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u00109Jf\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001126\u0010>\u001a2\u0012\u0013\u0012\u00110@¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u001d0?2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0(H\u0016J\u0012\u0010E\u001a\u00020\u001d2\b\u0010F\u001a\u0004\u0018\u00010\u000fH\u0002J@\u0010G\u001a\u00020\u001d26\u0010 \u001a2\u0012\u0013\u0012\u001103¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(H\u0012\u0013\u0012\u001103¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u001d0?H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/YLMediaEdit;", "Lcom/common/support/imagepicker/base/ImagePicker;", "Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;", "context", "Landroid/content/Context;", "mPreview", "Lcom/common/support/imagepicker/preview/config/Preview;", "(Landroid/content/Context;Lcom/common/support/imagepicker/preview/config/Preview;)V", "hasCropMode", "", "getHasCropMode", "()Z", "setHasCropMode", "(Z)V", "mConfig", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;", "mCrop", "Lcom/common/support/imagepicker/crop/config/Crop;", "mDataProvider", "Lcom/common/support/imagepicker/dataprovider/YLDataProvider;", "getMDataProvider", "()Lcom/common/support/imagepicker/dataprovider/YLDataProvider;", "mDataProvider$delegate", "Lkotlin/Lazy;", "mMediaEdit", "Lcom/common/support/imagepicker/mediaedit/widget/MediaEditLayout;", "mSource", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "beginHandleMedia", "", "mediaList", "", "onResult", "Lkotlin/Function1;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Lkotlin/ExtensionFunctionType;", "doDelayRunnable", "time", "", "fuc", "Lkotlin/Function0;", "enterCrop", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getCrop", "getEditSource", "getPreview", "getViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "saveToAlbum", "Landroid/net/Uri;", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDataSource", "mediaEdit", "source", "crop", "noEditImageLoad", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "imageCallBack", "setEditConfig", "config", "startCrop", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "editUri", "Companion", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class YLMediaEdit extends ImagePicker implements MediaEdit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String RESULT_INTENT_KEY = "DATA_RESULT";

    @NotNull
    private static final String RESULT_INTENT_KEY2 = "DATA_RESULT2";

    @NotNull
    private final Context context;
    private boolean hasCropMode;

    @NotNull
    private MediaEditConfig mConfig;

    @Nullable
    private Crop mCrop;

    /* JADX INFO: renamed from: mDataProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataProvider;

    @Nullable
    private MediaEditLayout mMediaEdit;

    @NotNull
    private final Preview mPreview;

    @Nullable
    private MediaEditSource mSource;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0006\u0010\u0015\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/YLMediaEdit$Companion;", "", "()V", "RESULT_INTENT_KEY", "", "RESULT_INTENT_KEY2", "create", "Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;", "context", "Landroid/content/Context;", "preview", "Lcom/common/support/imagepicker/preview/config/Preview;", "config", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;", "getCallBackIntent", "Landroid/content/Intent;", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "Landroid/net/Uri;", "edit", "getResultDate", "Lkotlin/Pair;", "intent", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MediaEdit create$default(Companion companion, Context context, Preview preview, MediaEditConfig mediaEditConfig, int i, Object obj) {
            if ((i & 4) != 0) {
                mediaEditConfig = null;
            }
            return companion.create(context, preview, mediaEditConfig);
        }

        @NotNull
        public final MediaEdit create(@NotNull Context context, @NotNull Preview preview, @Nullable MediaEditConfig config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(preview, "preview");
            YLMediaEdit yLMediaEdit = new YLMediaEdit(context, preview, null);
            yLMediaEdit.setEditConfig(config);
            return yLMediaEdit;
        }

        @NotNull
        public final Intent getCallBackIntent(@NotNull Uri origin, @NotNull Uri edit) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(edit, "edit");
            Intent intent = new Intent();
            intent.putExtra(YLMediaEdit.RESULT_INTENT_KEY, origin);
            intent.putExtra(YLMediaEdit.RESULT_INTENT_KEY2, edit);
            return intent;
        }

        @NotNull
        public final Pair<Uri, Uri> getResultDate(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return new Pair<>((Uri) intent.getParcelableExtra(YLMediaEdit.RESULT_INTENT_KEY), (Uri) intent.getParcelableExtra(YLMediaEdit.RESULT_INTENT_KEY2));
        }
    }

    /* JADX INFO: renamed from: com.common.support.imagepicker.mediaedit.YLMediaEdit$saveToAlbum$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.common.support.imagepicker.mediaedit.YLMediaEdit", f = "YLMediaEdit.kt", i = {0, 0, 1, 1}, l = {134, 136}, m = "saveToAlbum$suspendImpl", n = {"$this", "saveUriList", "$this", "saveUriList"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YLMediaEdit.saveToAlbum$suspendImpl(YLMediaEdit.this, (List) null, this);
        }
    }

    public /* synthetic */ YLMediaEdit(Context context, Preview preview, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, preview);
    }

    private final void doDelayRunnable(long time, final Function0<Unit> fuc) {
        Context context = this.context;
        if (context instanceof FragmentActivity) {
            View decorView = ((FragmentActivity) context).getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "context.window.decorView");
            decorView.postDelayed(new Runnable() { // from class: com.common.support.imagepicker.mediaedit.YLMediaEdit$doDelayRunnable$$inlined$postDelayed$1
                @Override // java.lang.Runnable
                public final void run() {
                    fuc.invoke();
                }
            }, time);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enterCrop$lambda-0, reason: not valid java name */
    public static final void m4021enterCrop$lambda0(YLMediaEdit this$0, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Crop crop = this$0.mCrop;
        if (crop != null) {
            crop.enterCrop(i, i2);
        }
    }

    private final YLDataProvider getMDataProvider() {
        return (YLDataProvider) this.mDataProvider.getValue();
    }

    public static /* synthetic */ Object saveToAlbum$suspendImpl(YLMediaEdit yLMediaEdit, AlbumItem albumItem, Continuation continuation) {
        if (albumItem == null || !yLMediaEdit.mConfig.getSaveToAlbum()) {
            return null;
        }
        YLDataProvider mDataProvider = yLMediaEdit.getMDataProvider();
        Context applicationContext = yLMediaEdit.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return mDataProvider.saveToAlbum(applicationContext, albumItem, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEditConfig(MediaEditConfig config) {
        if (config != null) {
            this.mConfig = config;
        }
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    public void beginHandleMedia(@NotNull List<MediaEditSource> mediaList, @Nullable Function1<? super List<AlbumItemWrapper>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        MediaEditPostProcessor.Companion companion = MediaEditPostProcessor.INSTANCE;
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        companion.begin$mediaedit_release(applicationContext, mediaList, this.mConfig, onResult);
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    public void enterCrop(final int width, final int height) {
        if (this.hasCropMode) {
            return;
        }
        MediaEditLayout mediaEditLayout = this.mMediaEdit;
        if (mediaEditLayout != null) {
            mediaEditLayout.post(new Runnable() { // from class: com.common.support.imagepicker.mediaedit.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    YLMediaEdit.m4021enterCrop$lambda0(this.f10534OooO0Oo, width, height);
                }
            });
        }
        this.hasCropMode = true;
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @NotNull
    public Crop getCrop() {
        Crop crop = this.mCrop;
        if (crop != null) {
            return crop;
        }
        throw new IllegalArgumentException("Please [setDataSource] first.");
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @NotNull
    public MediaEditSource getEditSource() {
        MediaEditSource mediaEditSource = this.mSource;
        if (mediaEditSource != null) {
            return mediaEditSource;
        }
        throw new IllegalArgumentException("Please [setDataSource] first.");
    }

    public final boolean getHasCropMode() {
        return this.hasCropMode;
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @NotNull
    /* JADX INFO: renamed from: getPreview, reason: from getter */
    public Preview getMPreview() {
        return this.mPreview;
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @NotNull
    public BaseViewAttacher getViewAttacher() {
        BaseViewAttacher viewAttacher;
        MediaEditLayout mediaEditLayout = this.mMediaEdit;
        if (mediaEditLayout == null || (viewAttacher = mediaEditLayout.getViewAttacher()) == null) {
            throw new IllegalArgumentException("Please [setDataSource] first.");
        }
        return viewAttacher;
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @Nullable
    public Object saveToAlbum(@Nullable AlbumItem albumItem, @NotNull Continuation<? super Uri> continuation) {
        return saveToAlbum$suspendImpl(this, albumItem, continuation);
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    public void setDataSource(@NotNull MediaEditLayout mediaEdit, @NotNull MediaEditSource source, @NotNull Crop crop, @NotNull Function2<? super ImageView, ? super MediaEditSource, Unit> noEditImageLoad, @NotNull Function0<Unit> imageCallBack) {
        Intrinsics.checkNotNullParameter(mediaEdit, "mediaEdit");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(crop, "crop");
        Intrinsics.checkNotNullParameter(noEditImageLoad, "noEditImageLoad");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        this.mMediaEdit = mediaEdit;
        this.mSource = source;
        this.mCrop = crop;
        crop.setInitedInMediaEdit();
        MediaEditSource mediaEditSource = this.mSource;
        Intrinsics.checkNotNull(mediaEditSource);
        crop.enableCrop(mediaEditSource.isEditable());
        MediaEditSource mediaEditSource2 = this.mSource;
        Intrinsics.checkNotNull(mediaEditSource2);
        crop.setCropInfo(mediaEditSource2.getCrop());
        crop.setupMediaCanvasAndCrop(mediaEdit.getMediaCanvasCropLayout$mediaedit_release(), mediaEdit.getMediaCropLayout$mediaedit_release());
        mediaEdit.setupCrop$mediaedit_release(crop);
        MediaEditSource mediaEditSource3 = this.mSource;
        Intrinsics.checkNotNull(mediaEditSource3);
        mediaEdit.setEditSource$mediaedit_release(mediaEditSource3, noEditImageLoad, imageCallBack);
    }

    public final void setHasCropMode(boolean z) {
        this.hasCropMode = z;
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    public void startCrop(@NotNull final Function2<? super Uri, ? super Uri, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Crop crop = this.mCrop;
        if (crop != null) {
            crop.confirm();
        }
        doDelayRunnable(50L, new Function0<Unit>() { // from class: com.common.support.imagepicker.mediaedit.YLMediaEdit.startCrop.1
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
                YLMediaEdit yLMediaEdit = YLMediaEdit.this;
                List<MediaEditSource> listListOf = CollectionsKt.listOf(yLMediaEdit.getEditSource());
                final Function2<Uri, Uri, Unit> function2 = onResult;
                yLMediaEdit.beginHandleMedia(listListOf, new Function1<List<? extends AlbumItemWrapper>, Unit>() { // from class: com.common.support.imagepicker.mediaedit.YLMediaEdit.startCrop.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AlbumItemWrapper> list) {
                        invoke2((List<AlbumItemWrapper>) list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull List<AlbumItemWrapper> beginHandleMedia) {
                        Intrinsics.checkNotNullParameter(beginHandleMedia, "$this$beginHandleMedia");
                        if (beginHandleMedia.isEmpty()) {
                            return;
                        }
                        if (beginHandleMedia.size() > 1) {
                            throw new IllegalStateException("check crop image only one");
                        }
                        AlbumItemWrapper albumItemWrapper = beginHandleMedia.get(0);
                        AlbumItem editItem = albumItemWrapper.getEditItem();
                        if (editItem != null) {
                            function2.invoke(albumItemWrapper.getOriginItem().getContentUri(), editItem.getContentUri());
                        }
                    }
                });
            }
        });
    }

    private YLMediaEdit(Context context, Preview preview) {
        this.context = context;
        this.mPreview = preview;
        this.mDataProvider = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<YLDataProvider>() { // from class: com.common.support.imagepicker.mediaedit.YLMediaEdit$mDataProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final YLDataProvider invoke() {
                return new YLDataProvider();
            }
        });
        this.mConfig = new MediaEditConfig(null, false, false, false, 15, null);
    }

    @Override // com.common.support.imagepicker.mediaedit.config.MediaEdit
    @Nullable
    public Object saveToAlbum(@Nullable List<AlbumItemWrapper> list, @NotNull Continuation<? super List<Uri>> continuation) {
        return saveToAlbum$suspendImpl(this, list, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a7 -> B:34:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0069
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object saveToAlbum$suspendImpl(com.common.support.imagepicker.mediaedit.YLMediaEdit r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof com.common.support.imagepicker.mediaedit.YLMediaEdit.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            com.common.support.imagepicker.mediaedit.YLMediaEdit$saveToAlbum$2 r0 = (com.common.support.imagepicker.mediaedit.YLMediaEdit.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.common.support.imagepicker.mediaedit.YLMediaEdit$saveToAlbum$2 r0 = new com.common.support.imagepicker.mediaedit.YLMediaEdit$saveToAlbum$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$0
            com.common.support.imagepicker.mediaedit.YLMediaEdit r2 = (com.common.support.imagepicker.mediaedit.YLMediaEdit) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lab
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$0
            com.common.support.imagepicker.mediaedit.YLMediaEdit r2 = (com.common.support.imagepicker.mediaedit.YLMediaEdit) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8c
        L51:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r8 != 0) goto L5c
            return r9
        L5c:
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L63:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r7.next()
            com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper r2 = (com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper) r2
            com.common.support.imagepicker.dataprovider.entities.AlbumItem r5 = r2.getEditItem()
            if (r5 == 0) goto L94
            com.common.support.imagepicker.dataprovider.entities.AlbumItem r2 = r2.getEditItem()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r2 = r8.saveToAlbum(r2, r0)
            if (r2 != r1) goto L88
            return r1
        L88:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L8c:
            android.net.Uri r9 = (android.net.Uri) r9
        L8e:
            r6 = r0
            r0 = r8
            r8 = r2
            r2 = r1
            r1 = r6
            goto Lae
        L94:
            com.common.support.imagepicker.dataprovider.entities.AlbumItem r2 = r2.getOriginItem()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r8.saveToAlbum(r2, r0)
            if (r2 != r1) goto La7
            return r1
        La7:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        Lab:
            android.net.Uri r9 = (android.net.Uri) r9
            goto L8e
        Lae:
            if (r9 == 0) goto Lb3
            r0.add(r9)
        Lb3:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L63
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.common.support.imagepicker.mediaedit.YLMediaEdit.saveToAlbum$suspendImpl(com.common.support.imagepicker.mediaedit.YLMediaEdit, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
