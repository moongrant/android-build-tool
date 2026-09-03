package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p468o0OoooO0.o0OOo000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$2$2$1$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24605OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(MutableState mutableState, MusicTable musicTable, List list) {
        super(0);
        this.f24603OooO0Oo = mutableState;
        this.f24605OooO0o0 = list;
        this.f24604OooO0o = musicTable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        LiveEventBus.get("MUSIC_EDIT_DELETE").post(Boolean.TRUE);
        this.f24603OooO0Oo.setValue(Boolean.FALSE);
        o0OO000.OooO00o("106090");
        o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.OooO0O0();
        List<MusicTable> list = this.f24605OooO0o0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MusicTable) next).mPath, this.f24604OooO0o.mPath));
            MusicTable musicTable = (MusicTable) next;
            if (musicTable != null) {
                musicTable.isPlaying.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
