package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOoOo extends ContentObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Channel<Unit> f6623OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(Channel<Unit> channel, Handler handler) {
        super(handler);
        this.f6623OooO00o = channel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, @Nullable Uri uri) {
        this.f6623OooO00o.mo2017trySendJP2dKIU(Unit.INSTANCE);
    }
}
