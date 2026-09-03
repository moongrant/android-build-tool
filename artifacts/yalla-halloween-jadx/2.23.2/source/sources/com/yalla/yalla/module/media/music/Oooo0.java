package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p460o0Ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,667:1\n1#2:668\n*E\n"})
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24131OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<MusicTable> f24132OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(MutableState mutableState, MusicTable musicTable, List list) {
        super(0);
        this.f24130OooO0Oo = musicTable;
        this.f24132OooO0o0 = mutableState;
        this.f24131OooO0o = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicTable musicTable = this.f24130OooO0Oo;
        Boolean value = musicTable.isPlaying.getValue();
        Boolean bool = Boolean.FALSE;
        boolean zAreEqual = Intrinsics.areEqual(value, bool);
        Object obj = null;
        MutableState<MusicTable> mutableState = this.f24132OooO0o0;
        if (zAreEqual) {
            MusicTable value2 = mutableState.getValue();
            MutableState<Boolean> mutableState2 = value2 != null ? value2.isPlaying : null;
            if (mutableState2 != null) {
                mutableState2.setValue(bool);
            }
            p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
            String mPath = musicTable.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            o00OOO00.OooO00o(mPath, false, null, null, null, 62);
            musicTable.isPlaying.setValue(Boolean.TRUE);
        } else {
            musicTable.isPlaying.setValue(bool);
            p363o0OOo00O.OooO0o oooO0o2 = o00OOO00.f47803OooO00o;
            o00OOO00.OooO0O0();
        }
        List<MusicTable> list = this.f24131OooO0o;
        if (list != null) {
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((MusicTable) obj2).mPath, musicTable.mPath)) {
                    obj = obj2;
                    break;
                }
            }
            MusicTable musicTable2 = (MusicTable) obj;
            if (musicTable2 != null) {
                musicTable2.isPlaying.setValue(musicTable.isPlaying.getValue());
                Boolean value3 = musicTable2.isPlaying.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "<get-value>(...)");
                if (value3.booleanValue()) {
                    mutableState.setValue(musicTable2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
