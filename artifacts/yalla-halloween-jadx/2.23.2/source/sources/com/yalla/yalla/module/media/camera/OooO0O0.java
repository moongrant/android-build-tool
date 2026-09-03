package com.yalla.yalla.module.media.camera;

import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p460o0Ooo0o.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f23807OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(CameraViewModel cameraViewModel) {
        super(1);
        this.f23807OooO0Oo = cameraViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        int i = CameraActivity.f23667OooOOo;
        oo0o0O0.OooO00o("_Camera", "select music back: " + obj);
        SelectMusicModel selectMusicModel = obj instanceof SelectMusicModel ? (SelectMusicModel) obj : null;
        if (selectMusicModel == null) {
            return null;
        }
        this.f23807OooO0Oo.OooO0o().f23796OooO00o.setValue(selectMusicModel);
        return Unit.INSTANCE;
    }
}
