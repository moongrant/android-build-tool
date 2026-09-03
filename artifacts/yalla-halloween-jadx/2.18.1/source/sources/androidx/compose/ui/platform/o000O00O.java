package androidx.compose.ui.platform;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f6435Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p094o000o0OO.o0OoOo0 f6436Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f6437Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(boolean z, p094o000o0OO.o0OoOo0 o0oooo1, String str) {
        super(0);
        this.f6435Oooo0o = z;
        this.f6436Oooo0oO = o0oooo1;
        this.f6437Oooo0oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f6435Oooo0o) {
            p094o000o0OO.o0OoOo0 o0oooo1 = this.f6436Oooo0oO;
            String key = this.f6437Oooo0oo;
            Objects.requireNonNull(o0oooo1);
            Intrinsics.checkNotNullParameter(key, "key");
            o0oooo1.f29289OooO00o.remove(key);
        }
        return Unit.INSTANCE;
    }
}
