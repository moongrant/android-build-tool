package p559o0oOo00;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.u1;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO extends Lambda implements Function0<u1> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56180OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Context context) {
        super(0);
        this.f56180OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final u1 invoke() {
        u1 u1VarInflate = u1.inflate(LayoutInflater.from(this.f56180OooO0Oo));
        Intrinsics.checkNotNullExpressionValue(u1VarInflate, "inflate(LayoutInflater.from(context))");
        return u1VarInflate;
    }
}
