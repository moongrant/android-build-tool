package com.yalla.yalla.module.media.preview;

import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaModel f24624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f24625OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SelectMusicModelWrapper f24626OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f24627OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(MediaModel mediaModel, long j, long j2, SelectMusicModelWrapper selectMusicModelWrapper) {
        super(1);
        this.f24624OooO0Oo = mediaModel;
        this.f24626OooO0o0 = selectMusicModelWrapper;
        this.f24625OooO0o = j;
        this.f24627OooO0oO = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        YLMediaPreViewScreen yLMediaPreViewScreen = YLMediaPreViewScreen.INSTANCE;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("param_media_model", MediaModel.copy$default(this.f24624OooO0Oo, false, null, null, 7, null));
        SelectMusicModelWrapper selectMusicModelWrapper = this.f24626OooO0o0;
        pairArr[1] = new Pair("param_select_music_model", selectMusicModelWrapper != null ? SelectMusicModelWrapper.copy$default(selectMusicModelWrapper, null, null, 3, null) : null);
        pairArr[2] = new Pair("param_min_montage_duration_ms", Long.valueOf(this.f24625OooO0o));
        pairArr[3] = new Pair("param_max_montage_duration_ms", Long.valueOf(this.f24627OooO0oO));
        oo0oOO0.OooO0o0(yLMediaPreViewScreen, o00Ooo.OooO0O0(pairArr), false, null, 12);
        return Unit.INSTANCE;
    }
}
