package com.yalla.yalla.module.media.camera;

import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.module.media.music.MusicScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<SelectMusicModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f24275OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(CameraViewModel cameraViewModel) {
        super(1);
        this.f24275OooO0Oo = cameraViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectMusicModel selectMusicModel) {
        SelectMusicModel selectMusicModel2 = selectMusicModel;
        MusicScreen.navigate$default(MusicScreen.INSTANCE, false, true, selectMusicModel2 != null ? selectMusicModel2.getFilePath() : null, selectMusicModel2 != null ? selectMusicModel2.getStartPosition() : 0L, new OooO0OO(this.f24275OooO0Oo), 1, null);
        return Unit.INSTANCE;
    }
}
