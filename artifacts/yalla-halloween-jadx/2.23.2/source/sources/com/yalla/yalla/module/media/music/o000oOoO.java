package com.yalla.yalla.module.media.music;

import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p584o0oOoo0O.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3$2$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,667:1\n1855#2,2:668\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3$2$1$2$1\n*L\n479#1:668,2\n*E\n"})
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24138OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24139OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f24140OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(List<? extends MusicTable> list, oo0o0O0 oo0o0o0, MusicTable musicTable) {
        super(0);
        this.f24138OooO0Oo = list;
        this.f24140OooO0o0 = oo0o0o0;
        this.f24139OooO0o = musicTable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicTable musicTable = this.f24139OooO0o;
        List<MusicTable> list = this.f24138OooO0Oo;
        if (list != null) {
            for (MusicTable musicTable2 : list) {
                if (!Intrinsics.areEqual(musicTable2.mPath, musicTable.mPath)) {
                    musicTable2.isPlaying.setValue(Boolean.FALSE);
                }
            }
        }
        oo0o0O0 oo0o0o0 = this.f24140OooO0o0;
        oo0o0o0.getClass();
        Intrinsics.checkNotNullParameter(musicTable, "<set-?>");
        oo0o0o0.f56699OooO0OO.setValue(musicTable);
        oo0o0o0.f56698OooO0O0.setValue(Boolean.TRUE);
        o0oo0000.OooO00o.OooO0O0("106089");
        return Unit.INSTANCE;
    }
}
