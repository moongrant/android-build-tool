package p150o00Oo0oO;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.code.android.uikit.contentstate.ContentState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends Lambda implements Function0<MutableState<ContentState>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ContentState f37963OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(ContentState contentState) {
        super(0);
        this.f37963OooO0Oo = contentState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MutableState<ContentState> invoke() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.f37963OooO0Oo, null, 2, null);
    }
}
