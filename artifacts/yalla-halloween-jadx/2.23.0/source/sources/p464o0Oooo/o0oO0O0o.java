package p464o0Oooo;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f46856OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(LinkedHashMap linkedHashMap) {
        super(0);
        this.f46856OooO0Oo = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f46856OooO0Oo.put("isVideo", "1");
        return Unit.INSTANCE;
    }
}
