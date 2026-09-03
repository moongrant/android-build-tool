package p471o0OoooO0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.module.media.music.MusicScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import p363o0OOo00O.OooO0o;
import p460o0Ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,496:1\n161#2,4:497\n165#2,2:502\n167#2:505\n1855#3:501\n1856#3:504\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n*L\n164#1:501\n164#1:504\n*E\n"})
public final class o0O00OO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f47886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ State f47887OooO0O0;

    public o0O00OO(boolean z, State state) {
        this.f47886OooO00o = z;
        this.f47887OooO0O0 = state;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        if (this.f47886OooO00o) {
            OooO0o oooO0o = o00OOO00.f47803OooO00o;
            o00OOO00.OooO0O0();
        }
        List listContent$lambda$10 = MusicScreen.Content$lambda$10(this.f47887OooO0O0);
        if (listContent$lambda$10 != null) {
            Iterator it = listContent$lambda$10.iterator();
            while (it.hasNext()) {
                ((MusicTable) it.next()).isPlaying.setValue(Boolean.FALSE);
            }
        }
    }
}
