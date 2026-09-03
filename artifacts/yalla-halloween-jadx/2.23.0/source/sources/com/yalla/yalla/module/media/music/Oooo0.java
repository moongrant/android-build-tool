package com.yalla.yalla.module.media.music;

import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p575o0oOoOo.o0O0o00O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$2$2$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n1855#2,2:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$2$2$1$2$1\n*L\n481#1:670,2\n*E\n"})
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24597OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f24599OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(List<? extends MusicTable> list, o0O0o00O o0o0o00o, MusicTable musicTable) {
        super(0);
        this.f24597OooO0Oo = list;
        this.f24599OooO0o0 = o0o0o00o;
        this.f24598OooO0o = musicTable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicTable musicTable = this.f24598OooO0o;
        List<MusicTable> list = this.f24597OooO0Oo;
        if (list != null) {
            for (MusicTable musicTable2 : list) {
                if (!Intrinsics.areEqual(musicTable2.mPath, musicTable.mPath)) {
                    musicTable2.isPlaying.setValue(Boolean.FALSE);
                }
            }
        }
        o0O0o00O o0o0o00o = this.f24599OooO0o0;
        o0o0o00o.getClass();
        Intrinsics.checkNotNullParameter(musicTable, "<set-?>");
        o0o0o00o.f56324OooO0O0.setValue(musicTable);
        o0o0o00o.f56323OooO00o.setValue(Boolean.TRUE);
        o0OO000.OooO00o("106089");
        return Unit.INSTANCE;
    }
}
