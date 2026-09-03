package p566o0oOo0OO;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.o0O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function0<o0O00OO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56396OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(Context context) {
        super(0);
        this.f56396OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0O00OO invoke() {
        o0O00OO o0o00ooInflate = o0O00OO.inflate(LayoutInflater.from(this.f56396OooO0Oo));
        Intrinsics.checkNotNullExpressionValue(o0o00ooInflate, "inflate(...)");
        return o0o00ooInflate;
    }
}
