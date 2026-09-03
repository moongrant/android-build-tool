package p650o0ooo;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function0<oo00oO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f58753OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(o00Oo00 o00oo00) {
        super(0);
        this.f58753OooO0Oo = o00oo00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final oo00oO invoke() {
        o00Oo00 o00oo00 = this.f58753OooO0Oo;
        oo00oO oo00ooInflate = oo00oO.inflate(LayoutInflater.from(o00oo00.f58578OooOO0O), o00oo00.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(oo00ooInflate, "inflate(...)");
        return oo00ooInflate;
    }
}
