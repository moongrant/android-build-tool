package o0O000o0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0O000O.OooO;
import o0O000O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<OUT> extends o0O00O0.OooO0o<byte[]> implements OooO0O0<OUT> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final OooOO0<?, OUT> f35088Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final String f35089OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final OooO<OUT> f35090OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooO00o<OUT> f35091OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(@NotNull OooOO0<?, OUT> protocol, @NotNull OooO<OUT> messageHandler) {
        super(o0O000O.OooO0o.OooO00o());
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        this.f35088Oooo = protocol;
        this.f35090OoooO00 = messageHandler;
        this.f35089OoooO0 = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
    }

    public final void OooO00o(@NotNull byte[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.f35119Oooo0o, null, null, new o0O00O0.OooO0OO(this, message, null), 3, null);
    }

    @Override // o0O000o0.OooO0O0
    public final void OooooOo(@NotNull OooO00o<OUT> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f35091OoooO0O = listener;
    }
}
