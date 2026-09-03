package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableIntState;
import com.yalla.yalla.model.MusicFileModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<MusicFileModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicFileModel f24086OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f24087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f24088OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MusicFileModel musicFileModel, MutableIntState mutableIntState, int i) {
        super(1);
        this.f24086OooO0Oo = musicFileModel;
        this.f24088OooO0o0 = mutableIntState;
        this.f24087OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicFileModel musicFileModel) {
        MusicFileModel it = musicFileModel;
        Intrinsics.checkNotNullParameter(it, "it");
        MusicEditScreen.navigate$default(MusicEditScreen.INSTANCE, false, new ArrayList(this.f24086OooO0Oo.getSongList()), false, 4, null);
        this.f24088OooO0o0.setValue(this.f24087OooO0o);
        return Unit.INSTANCE;
    }
}
