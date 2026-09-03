package com.yalla.yalla.module.media.music;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p460o0Ooo0o.o00OOO00;
import p535o0o0Oo0.oO0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$ListPage$1$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,667:1\n1#2:668\n*E\n"})
public final class Oooo000 extends Lambda implements Function1<MusicTable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MusicTable f24134OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<MusicTable> f24135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f24136OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ List<MusicTable> f24137OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(MusicTable musicTable, MutableState<MusicTable> mutableState, MusicTable musicTable2, boolean z, List<? extends MusicTable> list) {
        super(1);
        this.f24133OooO0Oo = musicTable;
        this.f24135OooO0o0 = mutableState;
        this.f24134OooO0o = musicTable2;
        this.f24136OooO0oO = z;
        this.f24137OooO0oo = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MusicTable musicTable) {
        Object next;
        MusicTable it = musicTable;
        Intrinsics.checkNotNullParameter(it, "it");
        o0oo0000.OooO00o.OooO0O0("106086");
        MusicTable musicTable2 = this.f24133OooO0Oo;
        Boolean value = musicTable2.isPlaying.getValue();
        Boolean bool = Boolean.FALSE;
        boolean zAreEqual = Intrinsics.areEqual(value, bool);
        boolean z = this.f24136OooO0oO;
        MusicTable musicTable3 = this.f24134OooO0o;
        if (zAreEqual) {
            MutableState<MusicTable> mutableState = this.f24135OooO0o0;
            MusicTable value2 = mutableState.getValue();
            String str = value2 != null ? value2.mDisplayName : null;
            o0000O00.OooO0O0("last playingItem is " + str + ",current is:" + musicTable2.mDisplayName);
            MusicTable value3 = mutableState.getValue();
            MutableState<Boolean> mutableState2 = value3 != null ? value3.isPlaying : null;
            if (mutableState2 != null) {
                mutableState2.setValue(bool);
            }
            String str2 = musicTable2.mPath;
            MusicTable value4 = mutableState.getValue();
            if (Intrinsics.areEqual(str2, value4 != null ? value4.mPath : null)) {
                MutableState<Boolean> mutableState3 = musicTable3 != null ? musicTable3.isPlaying : null;
                if (mutableState3 != null) {
                    mutableState3.setValue(bool);
                }
            }
            if (z) {
                p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
                String mPath = musicTable2.mPath;
                Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
                o00OOO00.OooO00o(mPath, false, null, null, null, 62);
            } else {
                oO0O00.OooO0o(musicTable2, 2);
            }
            musicTable2.isPlaying.setValue(Boolean.TRUE);
            mutableState.setValue(musicTable2);
        } else {
            musicTable2.isPlaying.setValue(bool);
            if (z) {
                p363o0OOo00O.OooO0o oooO0o2 = o00OOO00.f47803OooO00o;
                o00OOO00.OooO0O0();
            } else {
                boolean z2 = oO0O00.f53970OooO00o;
                oO0O00.OooO0Oo(false);
            }
        }
        if (musicTable3 != null) {
            Iterator<T> it2 = this.f24137OooO0oo.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((MusicTable) next).mPath, musicTable3.mPath));
            MusicTable musicTable4 = (MusicTable) next;
            if (musicTable4 != null) {
                musicTable3.isPlaying.setValue(musicTable4.isPlaying.getValue());
            }
        }
        if (Intrinsics.areEqual(musicTable2.mPath, musicTable3 != null ? musicTable3.mPath : null)) {
            MutableState<Boolean> mutableState4 = musicTable3 != null ? musicTable3.isPlaying : null;
            if (mutableState4 != null) {
                mutableState4.setValue(musicTable2.isPlaying.getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
