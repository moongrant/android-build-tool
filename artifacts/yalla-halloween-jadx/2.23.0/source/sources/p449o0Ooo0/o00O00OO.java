package p449o0Ooo0;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.module.media.music.MusicScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OOo000.OooO0O0;
import p468o0OoooO0.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,496:1\n164#2,4:497\n168#2,2:502\n170#2:505\n1855#3:501\n1856#3:504\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n*L\n167#1:501\n167#1:504\n*E\n"})
public final class o00O00OO implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f46422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ State f46423OooO0O0;

    public o00O00OO(boolean z, State state) {
        this.f46422OooO00o = z;
        this.f46423OooO0O0 = state;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        if (this.f46422OooO00o) {
            OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
            o0OOo000.OooO0O0();
        }
        List listContent$lambda$10 = MusicScreen.Content$lambda$10(this.f46423OooO0O0);
        if (listContent$lambda$10 != null) {
            Iterator it = listContent$lambda$10.iterator();
            while (it.hasNext()) {
                ((MusicTable) it.next()).isPlaying.setValue(Boolean.FALSE);
            }
        }
    }
}
