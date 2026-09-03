package p650o0ooo;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.k;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function0<k> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58782OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(oO00OOOo oo00oooo) {
        super(0);
        this.f58782OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        oO00OOOo oo00oooo = this.f58782OooO0Oo;
        k kVarInflate = k.inflate(LayoutInflater.from(oo00oooo.f58507OooO0Oo), oo00oooo.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(kVarInflate, "inflate(...)");
        return kVarInflate;
    }
}
