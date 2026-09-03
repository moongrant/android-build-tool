package com.yalla.yalla.module.media.camera;

import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import com.yalla.yalla.module.media.preview.YLMediaPreViewScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function2<MediaModel, SelectMusicModelWrapper, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f24271OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(CameraViewModel cameraViewModel) {
        super(2);
        this.f24271OooO0Oo = cameraViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(MediaModel mediaModel, SelectMusicModelWrapper selectMusicModelWrapper) {
        MediaModel mediaModel2 = mediaModel;
        Intrinsics.checkNotNullParameter(mediaModel2, "mediaModel");
        YLMediaPreViewScreen yLMediaPreViewScreen = YLMediaPreViewScreen.INSTANCE;
        CameraViewModel cameraViewModel = this.f24271OooO0Oo;
        yLMediaPreViewScreen.navigate(mediaModel2, ((Number) cameraViewModel.f24232OooOO0o.getValue()).longValue(), ((Number) cameraViewModel.f24234OooOOO0.getValue()).longValue(), selectMusicModelWrapper);
        return Unit.INSTANCE;
    }
}
