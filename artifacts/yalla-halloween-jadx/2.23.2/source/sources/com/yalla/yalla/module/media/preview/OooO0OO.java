package com.yalla.yalla.module.media.preview;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.VideoTimelinePlayView$setVideoUri$1", f = "VideotimeLinePlayView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VideoTimelinePlayView f24158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Uri f24159OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(VideoTimelinePlayView videoTimelinePlayView, Uri uri, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f24158OooO0Oo = videoTimelinePlayView;
        this.f24159OooO0o0 = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0OO(this.f24158OooO0Oo, this.f24159OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        VideoTimelinePlayView videoTimelinePlayView = this.f24158OooO0Oo;
        videoTimelinePlayView.f24179OooOOOo = mediaMetadataRetriever;
        Uri uri = this.f24159OooO0o0;
        videoTimelinePlayView.f24207OoooO0 = new VideoTimelinePlayView.OooO0O0(uri);
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = videoTimelinePlayView.f24179OooOOOo;
            Intrinsics.checkNotNull(mediaMetadataRetriever2);
            mediaMetadataRetriever2.setDataSource(videoTimelinePlayView.getContext(), uri);
            MediaMetadataRetriever mediaMetadataRetriever3 = videoTimelinePlayView.f24179OooOOOo;
            Intrinsics.checkNotNull(mediaMetadataRetriever3);
            String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(9);
            Intrinsics.checkNotNull(strExtractMetadata);
            videoTimelinePlayView.f24168OooO0Oo = Long.parseLong(strExtractMetadata);
            MediaMetadataRetriever mediaMetadataRetriever4 = videoTimelinePlayView.f24179OooOOOo;
            Intrinsics.checkNotNull(mediaMetadataRetriever4);
            String strExtractMetadata2 = mediaMetadataRetriever4.extractMetadata(18);
            MediaMetadataRetriever mediaMetadataRetriever5 = videoTimelinePlayView.f24179OooOOOo;
            Intrinsics.checkNotNull(mediaMetadataRetriever5);
            String strExtractMetadata3 = mediaMetadataRetriever5.extractMetadata(19);
            MediaMetadataRetriever mediaMetadataRetriever6 = videoTimelinePlayView.f24179OooOOOo;
            Intrinsics.checkNotNull(mediaMetadataRetriever6);
            String strExtractMetadata4 = mediaMetadataRetriever6.extractMetadata(24);
            Integer numBoxInt = strExtractMetadata4 != null ? Boxing.boxInt(Integer.parseInt(strExtractMetadata4)) : null;
            if (numBoxInt != null && numBoxInt.intValue() == 90) {
                Intrinsics.checkNotNull(strExtractMetadata3);
                videoTimelinePlayView.f24170OooO0o0 = Integer.parseInt(strExtractMetadata3);
                Intrinsics.checkNotNull(strExtractMetadata2);
                videoTimelinePlayView.f24169OooO0o = Integer.parseInt(strExtractMetadata2);
            } else if (numBoxInt != null && numBoxInt.intValue() == 270) {
                Intrinsics.checkNotNull(strExtractMetadata3);
                videoTimelinePlayView.f24170OooO0o0 = Integer.parseInt(strExtractMetadata3);
                Intrinsics.checkNotNull(strExtractMetadata2);
                videoTimelinePlayView.f24169OooO0o = Integer.parseInt(strExtractMetadata2);
            } else {
                Intrinsics.checkNotNull(strExtractMetadata2);
                videoTimelinePlayView.f24170OooO0o0 = Integer.parseInt(strExtractMetadata2);
                Intrinsics.checkNotNull(strExtractMetadata3);
                videoTimelinePlayView.f24169OooO0o = Integer.parseInt(strExtractMetadata3);
            }
            int i = videoTimelinePlayView.f24170OooO0o0;
        } catch (Exception unused) {
        }
        videoTimelinePlayView.f24208OoooO00.set(true);
        videoTimelinePlayView.postInvalidate();
        return Unit.INSTANCE;
    }
}
