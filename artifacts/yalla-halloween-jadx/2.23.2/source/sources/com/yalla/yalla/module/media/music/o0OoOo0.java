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
import p460o0Ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3$2$1$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,667:1\n1#2:668\n*E\n"})
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24143OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(MutableState mutableState, MusicTable musicTable, List list) {
        super(0);
        this.f24141OooO0Oo = mutableState;
        this.f24143OooO0o0 = list;
        this.f24142OooO0o = musicTable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        LiveEventBus.get("MUSIC_EDIT_DELETE").post(Boolean.TRUE);
        this.f24141OooO0Oo.setValue(Boolean.FALSE);
        o0oo0000.OooO00o.OooO0O0("106090");
        p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
        o00OOO00.OooO0O0();
        List<MusicTable> list = this.f24143OooO0o0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MusicTable) next).mPath, this.f24142OooO0o.mPath));
            MusicTable musicTable = (MusicTable) next;
            if (musicTable != null) {
                musicTable.isPlaying.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
