package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.MusicFileModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<MusicFileModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicFileModel f24550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f24551OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f24552OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MusicFileModel musicFileModel, MutableState<Integer> mutableState, int i) {
        super(1);
        this.f24550OooO0Oo = musicFileModel;
        this.f24552OooO0o0 = mutableState;
        this.f24551OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicFileModel musicFileModel) {
        MusicFileModel it = musicFileModel;
        Intrinsics.checkNotNullParameter(it, "it");
        MusicEditScreen.INSTANCE.navigate(false, new ArrayList<>(this.f24550OooO0Oo.getSongList()));
        this.f24552OooO0o0.setValue(Integer.valueOf(this.f24551OooO0o));
        return Unit.INSTANCE;
    }
}
