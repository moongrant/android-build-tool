package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static CoroutineScope OooO00o(CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller, Composer composer, int i) {
        CoroutineScope coroutineScope = compositionScopedCoroutineScopeCanceller.getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(i);
        return coroutineScope;
    }
}
